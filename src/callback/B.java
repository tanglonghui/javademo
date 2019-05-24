package callback;

import java.util.Random;

public class B {
    private CallBack callBack;

    private Boolean doSomeThing(String str) {
        for (int i = 0; i < new Random().nextInt(20); i++) {
            System.out.println("B 正在执行任务：" + str+"--"+i);
            if (i>10){
                System.out.println("B "+str+"失败");
                return false;
            }
        }
        System.out.println("B "+str+"成功");
        return true;
    }

    public void Call(String str, CallBack callBack) {
        System.out.println("B 收到消息：" + str + "，来源" + callBack.toString());
        this.callBack = callBack;
        new Thread(new Runnable() {
            @Override
            public void run() {
                if (B.this.doSomeThing(str)) {
                    callBack.Notice(str + "完成");
                } else {
                    callBack.Notice(str + "失败");
                }
            }
        }).start();

    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("回收");
        super.finalize();
    }
}
