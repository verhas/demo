package javax0.blog.lambdas;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class TestIncrementer {

    @Test
    @DisplayName("Incremented always increments with the given amount")
    void testIncrementer() {
        var inc = Incrementer.incrementer(5);
        Assertions.assertEquals(inc.apply(5), 10);
    }
}
