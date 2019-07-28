package javax0.demo.jpms.annotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
// snippet Demos
@Retention(RetentionPolicy.RUNTIME)
public @interface Demos {
    Demo[] value();
}
//end snippet