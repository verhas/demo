package javax0.blog.lambdas

import java.util.function.Function

//snippet MyMyClosure
class MyMyClosure {
    static Function<Integer,Integer> incrementer() {
        Integer z = 0
        return { Integer x -> z++; x + z }
    }
}
//end snippet