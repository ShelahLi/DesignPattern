package bupt.lth;

import java.util.ArrayList;

public class Folder1 extends AbstractFile{
    //定义集合filelist，用于存储Abstractfile类型的成员
    private ArrayList<AbstractFile> arrayList = new ArrayList<>();
    private String name;
    public Folder1(String name){
        this.name = name;
    }

    @Override
    public void add(AbstractFile file) {
        arrayList.add(file);
    }

    @Override
    public void remove(AbstractFile file) {
        arrayList.remove(file);
    }

    @Override
    public AbstractFile getChild(int i) {
        return arrayList.get(i);
    }

    @Override
    void killVirus() {
        System.out.println("----对文件夹" + name + "进行杀毒");
        //递归调用成员构件
        for(Object obj:arrayList){
            ((AbstractFile)obj).killVirus();
        }
    }
}
