package javax0.blog.lambdas;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class TestLambdaClosure {
    @Test
    @DisplayName("Incremented always increments with the given amount")
    void testIncrementer() {
        // snippet TestLambdaClosure
        final var inc = LambdaClosure.incrementer();
        assertThat(inc.apply(1)).isEqualTo(2);
        assertThat(inc.apply(1)).isEqualTo(3);
        assertThat(inc.apply(1)).isEqualTo(4);
        // end snippet
    }
}
