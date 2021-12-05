package javax0.blog.lambdas

import java.util.function.Function

//snippet MyMyClosure
class MyClosure {
    static incrementer() {
        Integer z = 0
        return { Integer x -> z++; x + z }
    }
}
//end snippet
// snippet TestMyMyClosure
def inc = MyClosure.incrementer();
assert inc(1) == 2
assert inc(1) == 3
assert inc(1) == 4
//end snippet
