package Test;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@Repeatable(DoubleIts.class)
public @interface DoubleIt {
    String test() default "test";
}

