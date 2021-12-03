package javax0.blog.lambdas;

import java.util.function.Function;

// snippet StaticConditionalIncrementer
public class StaticConditionalIncrementer {

    public static Function<Integer, Integer>[] incrementer(final int step) {
        final boolean[] shouldIncrement = {true};
        Function<Integer, Integer> inc = (Integer i) -> i + (shouldIncrement[0] ? step : 0);
        Function<Integer, Integer> off = (Integer i) -> {
            shouldIncrement[0] = false;
            return i;
        };
        return new Function[]{inc, off};
    }
}
// end snippet
