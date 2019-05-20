package bupt.lth.baisc;
//聚合类用于存储数据并创建迭代对象
public interface Aggregate {
    Iterator createIterator();
}
