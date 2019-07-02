package Interface;

import annotation.SetValue;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        System.out.println(Interface.MyInterface.MyAPI.BASE_URL.toString());
        System.out.println( getBaseUrlByReflect(MyInterface.MyAPI.class));
        System.out.println(Interface.MyInterface.MyAPI.BASE_URL.toString());

    }
    public static void reflact(Class object) {
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
    //反射动态获取 baseURL
    private static String getBaseUrlByReflect(Class<?> cls)
    {
        try
        {
            Field field = cls.getField("BASE_URL");
//            field.setAccessible(true);
//            field.set(cls,"修改");
            return (String) field.get(cls);
        } catch (Exception e)
        {
            e.printStackTrace();
        }
        return null;
    }

}
