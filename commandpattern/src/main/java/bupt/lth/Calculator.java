package bupt.lth;
//计算器界面类：请求发送者
public class Calculator {
        private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    //调用命令对象execute方法
    public void compute(int value){
        int i = command.execute(value);
        System.out.println("执行运算结果为:" + i);
    }

    //调用命令对象的undo方法执行撤销
    public void undo(){
        int i = command.undo();
        System.out.println("撤销运算结果为:" + i);
    }
}
