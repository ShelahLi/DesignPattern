public class ConcreteProtoType implements Cloneable, IPrototype {
    public IPrototype clone(){
        Object object = null;
        try {
            object = super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return (IPrototype) object;
    }
}
