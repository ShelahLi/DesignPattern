package bupt.lth;

public class ScrollbarDecorator extends ComponentDecorator{

    public ScrollbarDecorator(Component component) {
        super(component);//父类的构造方法
    }

    public void display(){
        this.setScrollBar();
        super.display();
    }

    public void setScrollBar(){
        System.out.println("为构建增加滚动条");
    }
}
