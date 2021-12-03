package javax0.blog.lambdas;

import java.util.function.Function;

// snippet ConditionalIncrementer
public class ConditionalIncrementer {
    private boolean shouldIncrement = true;

    public void on() {
        shouldIncrement = true;
    }

    public void off() {
        shouldIncrement = false;
    }

    public Function<Integer, Integer> incrementer(final int step) {
        return (Integer i) -> shouldIncrement ? i + step : i;
    }
}
// end snippet
