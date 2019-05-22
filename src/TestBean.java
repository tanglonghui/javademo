import annotation.AnnotationManager;
import annotation.SetValue;

public class TestBean {

    @SetValue("张三")
    public String name;
    public void test() {
        AnnotationManager annotationManager=new AnnotationManager(this);
        System.out.println(name);
    }


}
