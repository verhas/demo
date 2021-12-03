package javax0.blog.lambdas;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestStaticConditionalIncrementer {

    @Test
    void testConditionalIncrementer(){
        final var inc = StaticConditionalIncrementer.incrementer(5);

        Assertions.assertEquals(inc[0].apply(5) , 10);
        inc[1].apply(null);
        Assertions.assertEquals(inc[0].apply(5) , 5);
    }
}
