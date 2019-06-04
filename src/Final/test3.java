package Final;

import java.util.Arrays;

public class test3 {

    public static void main(String[] args) {
        final char[] value=new char[4];
        value[0]='1';
        System.out.println("初始值:"+value[0]);
        value[0]='2';
        System.out.println("修改值:"+value[0]);
        char[] copy = Arrays.copyOf(value,2*value.length);//第一个参数是待拷贝的int型的数组对象，第二个是新数组的长度
        System.out.println("value = copy ? "+(value==copy));
    }
}
