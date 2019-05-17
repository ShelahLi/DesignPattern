package bupt.lth;
//抽象文件类：抽象构件
public abstract class AbstractFile {
    public void add(AbstractFile file){
        System.out.println("对不起，不支持该方法");
    }
    public void remove(AbstractFile file){
        System.out.println("对不起，不支持该方法");
    }
    public AbstractFile getChild(int i){
        System.out.println("对不起，不支持该方法");
        return null;
    }
    abstract void killVirus();
}
