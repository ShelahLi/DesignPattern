package bupt.lth;

public class ConcreteCommand extends Command {
    //private Receiver receiver;//维持一个接收者的引用
    private Adder adder = new Adder();
    private int value;
    @Override
    public void execute() {
        //receiver.action();//调用接收者的处理方法action
    }

    //实现抽象命令类中的execute方法，调用加法类的加法操作
    @Override
    public int execute(int value) {
        this.value = value;
        return adder.add(value);
    }
    //实现抽象中的undo方法，通过加一个相反数来实现逆向操作
    @Override
    public int undo() {
        return adder.add(-value);
    }
}
