package String;

public class Test {
    public static void main(String[] args) {
        String s1="ab";
        System.out.println("hashCode："+s1.hashCode()+"  值："+s1);
        String s2="ab";
        System.out.println("hashCode："+s1.hashCode()+"  值："+s2);
        System.out.println(" s1=s2 ?:"+(s1==s2));
        StringBuilder sb1=new StringBuilder();
        sb1.append(1);
    }
}
