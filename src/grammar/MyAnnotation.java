package grammar;

import java.lang.annotation.*;

/**
 * 注解：有四大元注解
 * 保留策略
 * {
 * RetentionPolicy.SOURCE   //注解仅存在于源码中，在class字节码文件中不包含
 * RetentionPolicy.CLASS     // 默认的保留策略，注解会在class字节码文件中存在，VM不保存,运行时无法获得。
 * RetentionPolicy.RUNTIME  // 注解会在class字节码文件中存在，VM保存，在运行时可以通过反射获取。
 * }
 */
@Target({ElementType.FIELD,ElementType.ANNOTATION_TYPE}) //注解目标（使用的位置） 可指定多个使用位置
@Retention(RetentionPolicy.RUNTIME) //保留策略 如上
@Documented //是否可以被包含到doc文档中
@Inherited //是否可以被继承
public @interface MyAnnotation {
    String value() default "";//使用方式 @MyAnnotation（"1"）; value 可以省略名字
    String name() default "";//使用方式 @MyAnnotation（name="1"）;
    int id =0;
    int[] ids=null;
}
