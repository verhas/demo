package javax0.blog.lambdas;

import java.util.function.Function;

// snippet Incrementer
public class Incrementer {
    public static Function<Integer, Integer> incrementer(final int step) {
        return (Integer i) -> i + step;
    }
}
// end snippet
