package bupt.lth.baisc;
//在具体迭代器中实现抽象迭代器中声明的方法
public class ConcreteIterator implements Iterator {
    private ConcreteAggregate objects;//维持一个对具体聚合对象的引用
    private int cursor;//定义一个游标，用于记录当前访问的位置

    public ConcreteIterator(ConcreteAggregate objects) {
        this.objects = objects;
    }

    @Override
    public void first() {

    }

    @Override
    public void next() {

    }

    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public Object currentItem() {
        return null;
    }
}
