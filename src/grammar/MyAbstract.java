package grammar;

/**
 * 抽象类: 介于 接口(interface)和类(class)之间的半成品;
 * 1.有构造器（constructor），但不能被实例化。
 * 2.成员方法和抽象方法并存。
 * 3.可以继承或实现其他的类（接口）（单继承，多实现）
 * 4.父类中的抽象方法，可选择在本类实现，也可以到其子类中去实现。
 * 5.抽象方法用abstract修饰。
 */
public abstract class MyAbstract extends Grammar implements MyInterface{
    private String string;

    public MyAbstract(String string) {
        this.string = string;
    }
    @Override
    public  void say(){
        System.out.println("可以");
    }
    public  void say1(){
        System.out.println("可以");
    }
    public abstract void run();
}
