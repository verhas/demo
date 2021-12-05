package javax0.blog.lambdas;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class TestLambdaClass {
    @Test
    @DisplayName("Incremented always increments with the given amount")
    void testLambdaClass() {
// snippet TestLambdaClass
        var inc = Anon.incrementer(5);
        assertThat(inc.getClass().getName()).startsWith("javax0.blog.lambdas.Anon$$Lambda$");
        assertThat(inc.getClass().getSuperclass().getName()).isEqualTo("java.lang.Object");
        assertThat(inc.getClass().getInterfaces()).hasSize(1);
        assertThat(inc.getClass().getInterfaces()[0]).isEqualTo(java.util.function.Function.class);
// end snippet
    }
}
