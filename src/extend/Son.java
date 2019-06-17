package extend;

public class Son extends Father {
    public Son() {
        this("");
        System.out.println(" Son 构造器 ");
    }
    public Son(String s) {
        super(s);
        System.out.println(" Son 构造器 2");
    }
    void jump(){
        System.out.println(" Son jump ");
    }
}
