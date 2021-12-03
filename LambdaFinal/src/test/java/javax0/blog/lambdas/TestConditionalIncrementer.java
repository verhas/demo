package javax0.blog.lambdas;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestConditionalIncrementer {
    @Test
    void testConditionalIncrementer(){
        ConditionalIncrementer cndInc = new ConditionalIncrementer();
        final var inc = cndInc.incrementer(5);
        Assertions.assertEquals(inc.apply(5) , 10);
        cndInc.off();
        Assertions.assertEquals(inc.apply(5) , 5);
        cndInc.on();
        Assertions.assertEquals(inc.apply(5) , 10);
    }
}
