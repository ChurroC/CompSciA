package Test;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Field;
import java.util.Objects;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface DoubleIt {
    private void checkIfSerializable(Object object) {
        if (Objects.isNull(object)) {
            System.out.println("The object is null");
        }

        Field clazz = object.getClass().getField();
        if (!clazz.isAnnotationPresent(DoubleIt.class)) {
            throw new JsonSerializationException("The class "
                    + clazz.getSimpleName()
                    + " is not annotated with JsonSerializable");
        }
    }
}