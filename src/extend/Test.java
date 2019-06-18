package extend;

public class Test {
    public static void main(String[] args) {
        //向上转型
        Father son=new Son();
        //向下转型
        if (son instanceof Son){
            Son son1= (Son) son;
        }
        son.jump();

    }
}
