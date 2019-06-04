package Final;

public class Test {
    public static void main(String[] args) {
        char[] chars=new char[5];
        chars[1]='a';
        TestFinal testFinal = new TestFinal("1",chars);
        testFinal.myChar[2]='b';
        System.out.println(chars[1]);
        System.out.println( testFinal.myChar[2]);
    }
}
