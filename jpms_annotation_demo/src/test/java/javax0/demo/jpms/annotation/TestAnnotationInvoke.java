package javax0.demo.jpms.annotation;

import javax0.demo.jpms.tools.AnnotationValueGetter;
import javax0.geci.tools.GeciAnnotationTools;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.lang.reflect.InvocationTargetException;

public class TestAnnotationInvoke {
    @Test
    void testReflectiveCall() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        final var klass = DemoClass.class;
        final var annotations = klass.getDeclaredAnnotations();
        final var annotation = klass.getDeclaredAnnotation(Demo.class);
        Assertions.assertEquals("This is a demo class", AnnotationValueGetter.getValue(annotation));
    }
}