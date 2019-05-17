package bupt.lth;


import bupt.lth.ISkinFactory;
import bupt.lth.XMLUtil3;

public class Client3 {

    public static void main(String[] args) {
        ISkinFactory skinFactory;
        IButton button;
        ITextField textField;
        IComboBox comboBox;
        skinFactory = (ISkinFactory) XMLUtil3.getBean();
        button = skinFactory.createButton();
        textField = skinFactory.createTextField();
        comboBox = skinFactory.createComboBox();
        button.display();
        textField.display();
        comboBox.display();
    }
}
