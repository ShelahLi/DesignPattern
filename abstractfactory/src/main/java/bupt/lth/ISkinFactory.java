package bupt.lth;

//界面皮肤工厂接口：抽象工厂
public interface ISkinFactory {
    IButton createButton();
    ITextField createTextField();
    IComboBox createComboBox();
}
