package bupt.lth;

public class Client_Decorator {

    public static void main(String[] args) {
        Component component,component1,component2;
        component = new Window();
        component1 = new ScrollbarDecorator(component);
        component2 = new BlackBorderDecorator(component1);
        component2.display();
    }
}
