package javax0.demo.jpms.annotation;

import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
// snippet Demo
@Retention(RetentionPolicy.RUNTIME)
@Repeatable(Demos.class)
public @interface Demo {
    String value() default "";
}
// end snippet
