package bupt.lth;
//抽象成绩操作类：目标接口
//目标接口想实现排序和查找，但适配者的接口名不符合系统的需要
//此时可以创建一个ADApter类适配适配者
public interface ScoreOperation {
    int[] sort(int[] array);
    int search(int[] array, int key);
}
