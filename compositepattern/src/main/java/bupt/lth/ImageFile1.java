package bupt.lth;
//图像文件类：叶子结构
public class ImageFile1 extends AbstractFile {
    private String name;
    public ImageFile1(String name){
        this.name = name;
    }

    @Override
    public void add(AbstractFile file) {
        System.out.println("对不起，不支持方法");
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
        //模拟杀毒
        System.out.println("----对图像文件" + name + "进行杀毒");
    }
}
