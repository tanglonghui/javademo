package Override;

public class Father {
     String name;

    public Father() {
    }
    public Father(String s) {
        this.name=s;
    }
    void  say() throws NullPointerException{
        System.out.println("父亲说");
    }
     void jump(){
    }
}
