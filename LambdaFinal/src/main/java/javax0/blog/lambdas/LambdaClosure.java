package javax0.blog.lambdas;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Function;

public class LambdaClosure {
    //snippet LambdaClosure
    public static Function<Integer, Integer> incrementer() {
        AtomicInteger z = new AtomicInteger(0);
        return x -> {
            z.set(z.get() + 1);
            return x + z.get();
        };
    }
    // end snippet
}
