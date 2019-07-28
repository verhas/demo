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


    @Test
    void getTheValue() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        // snippet GetValue_01
        final var klass = DemoClass.class;
        final var annotation = klass.getDeclaredAnnotation(Demo.class);
        final var valueMethod = annotation.getClass().getMethod("value");
        final var value = valueMethod.invoke(annotation);
        Assertions.assertEquals("This is a demo class", value);
        //end snippet
    }


    @Test
    void getTheValueRigth() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        // snippet GetValue_02
        final var klass = DemoClass.class;
        final var annotation = klass.getDeclaredAnnotation(Demo.class);
        final var valueMethod = annotation.annotationType().getMethod("value");
        final var value = valueMethod.invoke(annotation);
        Assertions.assertEquals("This is a demo class", value);
        //end snippet
    }
}
