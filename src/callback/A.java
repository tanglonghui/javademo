package callback;

public class A {
    public static void main(String[] args) {
        B b = new B();
        b.Call("充电费",new CallBack() {
            @Override
            public void Notice(String str) {
                System.out.print("A 收到 B 的消息："+str);
            }
        });
        for (int i = 0; i < 10; i++) {
            System.out.println("A 做其他的事，如看电视" + i);
        }
    }
}
