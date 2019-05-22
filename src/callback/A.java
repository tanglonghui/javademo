package callback;

public class A {
    public static void main(String[] args) {
        B b = new B();
        b.setCallBack(new CallBack() {
            @Override
            public void Notice(String str) {
                System.out.print("B 的情况"+str);
            }
        });
        new Thread(new Runnable() {
            @Override
            public void run() {
                b.doSomeThing();
            }
        }).start();
        for (int i = 0; i < 10; i++) {
            System.out.println("A 在做其他的事" + i);
        }
    }
}
