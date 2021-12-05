package javax0.blog.lambdas;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class TestLambdaComplexClosure {
    @Test
    @DisplayName("Incremented always increments with the given amount")
    void testIncrementer() {
        // snippet TestLambdaComplexClosure
        final var inc = LambdaComplexClosure.incrementer();
        assertThat(inc.apply(1)).isEqualTo(2);
        assertThat(inc.apply(1)).isEqualTo(5);
        assertThat(inc.apply(1)).isEqualTo(10);
        // end snippet
    }
}
