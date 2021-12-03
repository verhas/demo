package javax0.blog.lambdas;

import java.util.function.Function;

// snippet FinalEffectivelyFinal
public class FinalEffectivelyFinal {

    public static Function<Integer, Integer> mappera() {
        final int z;
        z = 2;
        final Function<Integer, Integer> woo = x -> {
            if (x % z == 0) return x / 2;
            else return x + 3;
        };
        return woo;
    }

}
//end snippet
