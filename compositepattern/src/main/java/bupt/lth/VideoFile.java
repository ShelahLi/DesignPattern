package bupt.lth;
//视频文件类：叶子构件
public class VideoFile extends AbstractFile {
    private String name;
    public VideoFile(String name){
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
        System.out.println("----对视频文件" + name + "进行杀毒");
    }
}
