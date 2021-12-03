package javax0.blog.lambdas;

import java.util.function.Function;
// snippet Anon
public class Anon {

    public static Function<Integer, Integer> incrementer(final int step) {
        return (Integer i) -> i + step;
    }
    public static Function<Integer, Integer> anonIncrementer(final int step) {
        return new Function<Integer, Integer>() {
            @Override
            public Integer apply(Integer i) {
                return i + step;
            }
        };
    }
}
// end snippet
