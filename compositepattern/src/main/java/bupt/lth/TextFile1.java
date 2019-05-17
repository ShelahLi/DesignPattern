package bupt.lth;

public class TextFile1 extends AbstractFile {
    private String name;
    public TextFile1(String name){
        this.name = name;
    }

    @Override
    public void add(AbstractFile file) {
        System.out.println("z");
    }

    @Override
    public void remove(AbstractFile file) {
        System.out.println("对不起，不支持方法");
    }

    @Override
    public AbstractFile getChild(int i) {
        System.out.println("对不起，不支持方法");
        return null;
    }

    @Override
    void killVirus() {
        System.out.println("----对文本文件" + name + "进行杀毒");
    }
}
