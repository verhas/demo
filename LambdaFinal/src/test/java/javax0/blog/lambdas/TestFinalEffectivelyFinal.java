package javax0.blog.lambdas;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class TestFinalEffectivelyFinal {
    @Test
    @DisplayName("")
    void testIncrementer() {
        var mappera = FinalEffectivelyFinal.mappera();
        int q = 10;
        int count = 0;
        while( q!= 1){
            count++;
            q = mappera.apply(q);
        }
        Assertions.assertEquals(5, count);
    }
}
