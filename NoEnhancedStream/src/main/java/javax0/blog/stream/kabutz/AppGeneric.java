package javax0.blog.stream.kabutz;

import java.util.IdentityHashMap;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.stream.Stream;

public class AppGeneric {

    public static void main(String[] args) {
        final var enveloper = new Enveloper<>(
            (String s1, String s2) -> s1.chars().sum() < s2.chars().sum() ? s2 : s1,
            (String s) -> s.toUpperCase().hashCode(),
            (String s1, String s2) -> s1.toUpperCase().equals(s2.toUpperCase())
        );

        Stream.of("Kalathas", "Stavros", "STAVROS",
            "marathi", "kalathas", "baLos", "Balos")
            .map(s -> enveloper.envelope(s))
            .distinct()
            .map(e -> e.merge())
            .forEach(System.out::println);
    }

    private static class Enveloper<T> {
        private final BiFunction<T, T, T> merger;
        Function<T, Integer> hashFunction;
        private final BiFunction<T, T, Boolean> equalFunction;

        private Enveloper(BiFunction<T, T, T> merger,
                          Function<T, Integer> hashFunction,
                          BiFunction<T, T, Boolean> equalFunction) {
            this.merger = merger;
            this.hashFunction = hashFunction;
            this.equalFunction = equalFunction;
        }

        public Envelope envelope(T t){
            return new Envelope(this,t);
        }
    }

    private static class Envelope<T> {
        private final T t;
        private Map<T, Object> others = new IdentityHashMap<>();
        private final Enveloper<T> enveloper;

        private Envelope(Enveloper<T> enveloper, T town) {
            this.enveloper = enveloper;
            this.t = town;
        }

        public T merge() {
            var merged = t;
            for (final var s : others.keySet()) {
                merged = enveloper.merger.apply(merged, s);
            }
            return merged;
        }

        @Override
        public int hashCode() {
            return enveloper.hashFunction.apply(t);
        }

        @Override
        public boolean equals(Object obj) {
            final var b = enveloper.equalFunction.apply(t, ((Envelope<T>) obj).t);
            if (b) {
                others.put(((Envelope<T>) obj).t, null);
                ((Envelope<T>)obj).others.put(t,null);
            }
            return b;
        }
    }
}
