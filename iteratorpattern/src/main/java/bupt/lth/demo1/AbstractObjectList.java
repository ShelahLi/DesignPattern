package bupt.lth.demo1;

import java.util.*;

//抽象聚合类
public abstract class AbstractObjectList {
    protected List<Object> objects = new ArrayList<>();

    public AbstractObjectList(List<Object> object) {
        this.objects = object;
    }

    public void addObject(Object obj){
        this.objects.add(obj);
    }

    public void removeObject(Object obj){
        this.objects.remove(obj);
    }

    public List getObjects(){
        return this.objects;
    }

    //声明创建迭代器对象的抽象工厂发
    public abstract AbstractIterator createIterator();

}
