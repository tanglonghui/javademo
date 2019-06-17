package Override;

public class Son extends Father {
    public Son() {
    }

    public Son(String s) {
        super(s);
        run();
        run("1");
        run("2", 1);
        run(1, "3");
    }


    @Override
    void say() {
    }

    void run() {
        System.out.println("0"+name);
        jump();
    }
    void run(String s) {
        System.out.println(s);
    }
    void run(String s, int i) {
        System.out.println(s);
    }
    void run(int i, String s) {
        System.out.println(s);
    }
    void run(long i, String s) {
        System.out.println(s);
    }
    String run(int i) {
        return "";
    }

}
