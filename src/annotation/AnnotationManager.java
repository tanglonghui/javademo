package annotation;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.util.ArrayList;

public class AnnotationManager {

    public AnnotationManager(Object object) {
        ArrayList<Annotation> annotationList = new ArrayList();
        if (object != null) {
            try {
                Field field = object.getClass().getField("name");
                Annotation annotation = field.getAnnotation(SetValue.class);
                annotationList.add(annotation);
                field.set(object, ((SetValue) annotation).value());
            } catch (NoSuchFieldException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }


        }

    }
}
