package javax0.blog.lambdas;

import java.util.function.Function;

public class LambdaComplexClosure {

    //snippet LambdaComplexClosure
    public static Function<Integer, Integer> incrementer() {
        class DataHolder{int z; int m;}
        final var dh = new DataHolder();
        return x -> {
            dh.z++;
            dh.m++;
            return x + dh.z*dh.m;
        };
    }
    // end snippet
}
