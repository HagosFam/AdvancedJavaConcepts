package List;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;


// Annotations in java provide a powerful way to add metadata to code
        // such as providing information for the compiler
        // generating code at runtime
        // configuring frameworks
@Retention(RetentionPolicy.RUNTIME)
@interface CustomAnnotation {
String value() default "Default";
}


