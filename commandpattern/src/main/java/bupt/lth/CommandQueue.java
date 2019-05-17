package bupt.lth;

import java.util.ArrayList;

public class CommandQueue {
    //定义一个ArrayList来存储命令队列
    private ArrayList<Command> arrayList = new ArrayList<>();

    public void addCommand(Command command){
        arrayList.add(command);
    }

    public void removeCommand(Command command){
        arrayList.remove(command);
    }

    //循环调用每个命令对象的execute方法
    public void execute(){
        for (Object obj:arrayList){
            ((Command)obj).execute();
        }
    }

}
