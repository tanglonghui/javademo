package grammar;

import javax.swing.event.ListDataEvent;
import javax.swing.event.ListSelectionEvent;

/**
 * 类:
 * 1.单继承多实现。
 * <p>
 * ~.~ 大致也没有什么要记的点。
 */
public class Grammar {
    //声明一个变量(引用类型)
    MyInterface myInterface;

    //无形参的构造器
    public Grammar() {

    }

    public void testInterface(MyInterface myInterface) {
    }

    public void testGrammar() {
        //三元表达式
        int a = 1;
        int b = 2;
        int result = a > b ? a : b;// 语法  表达式 ? 表达式为true时返回值 : 表达式为false时返回值
        //1.原来的实现方式，匿名内部类
        testInterface(new MyInterface() {
            @Override
            public void say(String s) {
            }
        });
        //2.lambda表达式 1.8新特性
        testInterface((s)-> System.out.println("你好"));

    }

}
