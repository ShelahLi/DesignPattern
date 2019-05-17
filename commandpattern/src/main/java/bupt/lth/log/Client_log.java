package bupt.lth.log;

public class Client_log {
    public static void main(String[] args) {
        ConfigSettingWindow configSettingWindow = new ConfigSettingWindow();
        AbstractCommand command;
        ConfigOperator configOperator = new ConfigOperator();
        //四次对配置文件进行修改
        command = new InsertCommand("增加");
        command.setConfigOperation(configOperator);
        configSettingWindow.setCommand(command);
        configSettingWindow.call("端口号");

        command = new InsertCommand("增加");
        command.setConfigOperation(configOperator);
        configSettingWindow.setCommand(command);
        configSettingWindow.call("网站首页");

        command = new InsertCommand("修改");
        command.setConfigOperation(configOperator);
        configSettingWindow.setCommand(command);
        configSettingWindow.call("网站首页");

        command = new InsertCommand("修改");
        command.setConfigOperation(configOperator);
        configSettingWindow.setCommand(command);
        configSettingWindow.call("端口号");

        configSettingWindow.save();
        configSettingWindow.recover();





    }
}
