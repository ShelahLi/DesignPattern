package bupt.lth;

import java.util.ArrayList;
//功能键设值窗口类
public class FBSettingWindow {
    private String title;//窗口标题
    //存储所有功能键
    private ArrayList<FunctionButton> functionButtons = new ArrayList<>();

    public FBSettingWindow(String title){
        this.title = title;
    }

    public String getTitle(){
        return this.title;
    }

    public void addFunctionButton(FunctionButton functionButton){
        functionButtons.add(functionButton);
    }

    public void removeFunctionButton(FunctionButton functionButton){
        functionButtons.remove(functionButton);
    }
    //显示窗口及功能键
    public void display(){
        System.out.println("显示窗口：" + title);
        System.out.println("显示功能键");
        for (Object obj:functionButtons){
            System.out.println(((FunctionButton)obj).getName());
        }
        System.out.println("----------------------------------------");
    }
}
