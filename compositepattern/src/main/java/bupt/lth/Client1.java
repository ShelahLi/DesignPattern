package bupt.lth;

public class Client1 {

    public static void main(String[] args) {
        AbstractFile folder1,folder2,folder3,imageFile1,imageFile2,textFile1,textFile2;
        folder1 = new Folder1("资料");
        folder2 = new Folder1("图像文件");
        folder3 = new Folder1("文本文件");

        imageFile1 = new ImageFile1("小龙女.jpg");
        imageFile2 = new ImageFile1("张无忌.jpg");

        textFile1 = new TextFile1("九阴真经");
        textFile2 = new TextFile1("葵花宝典");

        folder1.add(folder2);
        folder1.add(folder3);
        folder2.add(imageFile1);
        folder2.add(imageFile2);
        folder3.add(textFile1);
        folder3.add(textFile2);

        folder1.killVirus();
        folder3.killVirus();
    }
}
