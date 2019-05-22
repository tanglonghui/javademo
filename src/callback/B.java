package callback;

public class B {
    private CallBack callBack;
    void doSomeThing(){
        for (int i=0;i<10;i++){
            System.out.println("B 正在做事"+i);
        }
        callBack.Notice("完成");
    }

    public void setCallBack(CallBack callBack) {
        this.callBack = callBack;
    }
}
