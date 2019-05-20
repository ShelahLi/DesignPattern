package bupt.lth.baisc;

public class ConcreteAggregate implements Aggregate {
    @Override
    public Iterator createIterator() {
        return new ConcreteIterator(this);
    }
}
