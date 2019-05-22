public class Test {
    public static void main(String[] args) {
      TestBean test=new TestBean();
      test.test();
//        long a=testA();
//        long b=testB();
//        System.out.println("花费时间A:------" + a);
//        System.out.println("花费时间B:------" + b);
//        Field myField;
    }

//    public static long testA() {
//        TestBean bean = new TestBean();
//        bean.setName("testA");
//        System.out.println("开始");
//        long startDate = System.currentTimeMillis();
//        String name = bean.getName();
//        for (int i = 0; i < 1000; i++) {
//            System.out.println(name);
//        }
//        long endDate = System.currentTimeMillis();
//        System.out.println("花费时间A" + (endDate - startDate));
//        return endDate - startDate;
//    }
//
//    public static long  testB() {
//        TestBean bean = new TestBean();
//        bean.setName("testB");
//        System.out.println("开始");
//        long startDate = System.currentTimeMillis();
//        String name = bean.getName();
//        for (int i = 0; i < 100; i++) {
//            System.out.println(name);
//        }
//        long endDate = System.currentTimeMillis();
//        System.out.println("花费时间B" + (endDate - startDate));
//        return endDate - startDate;
//    }

}
