package reflect;

import java.lang.reflect.Field;

public class Test {
    public static void main(String[] args) {
        getBaseUrlByReflect(new Constant(), "publicFinalStr", true, "修改");
//        getBaseUrlByReflect(Constant.class, "publicFinalStr", true, "修改");
        System.out.println("反射获得值" + getBaseUrlByReflect(Api.class));
        System.out.println("反射获得值" + getBaseUrlByReflect(Constant.class));
        System.out.println("反射获得值" + getBaseUrlByReflect(Api.class,"修改 interface"));
    }

    //反射动态获取 baseURL
    private static String getBaseUrlByReflect(Object obj, String tag, boolean accessible, String string) {
        try {
            Field field = obj.getClass().getField(tag);
            System.out.println("修改前" + field.get(obj));
            if (accessible) {
                field.setAccessible(true);
            }
            field.set(obj, "修改");
            System.out.println("修改后" + field.get(obj));
            return (String) field.get(obj);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    //反射动态获取 baseURL
    private static String getBaseUrlByReflect(Class<?> cls, String tag, boolean accessible, String string) {
        try {
            Field field = cls.getField(tag);
            Object obj = cls.newInstance();
            System.out.println("修改前" + field.get(obj));
            System.out.println("修改前cls" + (String) field.get(cls));
            if (accessible) {
                field.setAccessible(true);
            }
            field.set(obj, "修改");
            System.out.println("修改后" + field.get(obj));
            System.out.println("修改后cls" + (String) field.get(cls));
            return (String) field.get(obj);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    //反射动态获取 baseURL
    private static String getBaseUrlByReflect(Class<?> cls) {
        try {
            Field field = cls.getField("BASE_URL");
            return (String) field.get(cls);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    //反射动态获取 baseURL
    private static String getBaseUrlByReflect(Class<?> cls, String string) {
        try {
            Field field = cls.getField("BASE_URL");
            field.setAccessible(true);
            field.set(cls, string);
            return (String) field.get(cls);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
