package bupt.lth;
//功能键：请求发送者
public class FunctionButton {
    private String name;
    private Command command;

    public FunctionButton(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    //功能键注入
    public void setCommand(Command command) {
        this.command = command;
    }
    //发送请求者的方法
    public void onClick(){
        System.out.println("点击功能键功能");
        command.execute();
    }
}
