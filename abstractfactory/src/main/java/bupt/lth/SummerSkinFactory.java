package bupt.lth;

import bupt.lth.SummerTextField;

//Summer界面皮肤工厂：具体工厂
public class SummerSkinFactory implements ISkinFactory {
    public IButton createButton() {
        return new SummerButton();
    }

    public ITextField createTextField() {
        return new SummerTextField();
    }

    public IComboBox createComboBox() {
        return new SummerComboBox();
    }
}
