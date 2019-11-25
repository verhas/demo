package javax0.blog.stream.kabutz;

import java.util.IdentityHashMap;
import java.util.Map;
import java.util.stream.Stream;

public class App {

    public static void main(String[] args) {
        Stream.of("Kalathas", "Stavros", "STAVROS",
            "marathi", "kalathas", "baLos", "Balos")
            .map(s -> new Envelope(s))
            .distinct()
            .map(e -> e.merge())
            .forEach(System.out::println);
    }

    private static class Envelope {
        private final String town;
        private Map<String, Object> others = new IdentityHashMap<>();

        private Envelope(String town) {
            this.town = town;
        }

        public String merge() {
            var merged = town;
            for (final var s : others.keySet()) {
                merged = merged.chars().sum() < s.chars().sum() ? s : merged;
            }
            return merged;
        }

        @Override
        public int hashCode() {
            return town.toUpperCase().hashCode();
        }

        @Override
        public boolean equals(Object obj) {
            others.put(((Envelope) obj).town, null);
            return town.toUpperCase().equals(((Envelope) obj).town.toUpperCase());
        }
    }
}
