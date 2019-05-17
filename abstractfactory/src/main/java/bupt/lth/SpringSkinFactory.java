package bupt.lth;

import bupt.lth.SpringTextField;

//Spring界面皮肤工厂：具体工厂
public class SpringSkinFactory implements ISkinFactory {
    public IButton createButton() {
        return new SpringButton();
    }

    public ITextField createTextField() {
        return new SpringTextField();
    }

    public IComboBox createComboBox() {
        return new SpringComboBox();
    }
}
