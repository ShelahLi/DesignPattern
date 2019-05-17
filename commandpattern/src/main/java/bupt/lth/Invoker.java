package bupt.lth;

public class Invoker {
    private CommandQueue commandQueue;//维持一个CommandQueue对象的引用

    //构造注入
    public Invoker(CommandQueue commandQueue){
        this.commandQueue = commandQueue;
    }

    //设值注入
    public void setCommand(CommandQueue commandQueue) {
        this.commandQueue = commandQueue;
    }

    //业务方法，用于调用命令类的execute方法
    public void call(){
        commandQueue.execute();
    }
}
