package bupt.lth;
//抽象命令类
public abstract class Command {
    public abstract void execute();
    public abstract int execute(int value);
    public abstract int undo();//声明撤销方法


}
