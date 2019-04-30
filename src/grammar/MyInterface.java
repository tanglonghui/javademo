package grammar;

import javax.swing.event.ListDataListener;
import javax.swing.event.ListSelectionListener;

/**
 *  接口：
 *  1.不能实例化，没有构造器（Constructor）。
 *  2.接口中的成员方法（Method）会被隐式的指定为 public abstract
 *  3.接口中的成员变量会被隐式的指定为 public static final 变量
 *  4.一个接口可以继承（extends）多个接口，且只能继承（extends）接口，不能实现(implements)其他的接口。
 *  5.一个类可以实现(implements)多个接口,但只能继承（extends）一个类。
 *
 */
public interface MyInterface //extends ListDataListener, ListSelectionListener
{
    public static String strStatic="static";  //实际上是 public static final String strStatic="static";
    public final String strFinal="final";
    void say(String s); //实际上是 public 级别的访问权限。
}

