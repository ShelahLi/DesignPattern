package bupt.lth;
//帮助命令类：具体命令类
public class HelpCommand extends Command {
    private HelpHandler helpHandler;//维持对请求接收者的引用

    public HelpCommand(){
        this.helpHandler = new HelpHandler();
    }

    @Override
    //命令执行方法，调用请求接收者方法
    public void execute() {
        helpHandler.display();
    }

    @Override
    public int execute(int value) {
        return 0;
    }

    @Override
    public int undo() {
        return 0;
    }
}
