package bupt.lth;

public class Client_command {
    public static void main(String[] args) {
        FBSettingWindow fbSettingWindow = new FBSettingWindow("功能键设置");

        FunctionButton functionButton1, functionButton2;
        functionButton1 = new FunctionButton("功能键1");
        functionButton2 = new FunctionButton("功能键2");

        Command command1, command2;
        command1 = (Command) XMLUtil_Command.getBean(0);
        command2 = (Command) XMLUtil_Command.getBean(1);

        //将命令对象注入功能键
        functionButton1.setCommand(command1);
        functionButton2.setCommand(command2);

        fbSettingWindow.addFunctionButton(functionButton1);
        fbSettingWindow.addFunctionButton(functionButton2);
        fbSettingWindow.display();

        //调用业务方法
        functionButton1.onClick();
        functionButton2.onClick();


    }
}
