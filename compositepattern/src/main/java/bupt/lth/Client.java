package bupt.lth;

public class Client {
    public static void main(String[] args) {

        Folder folder1,folder2,folder3;
        folder1 = new Folder("资料");
        folder2 = new Folder("图像文件");
        folder3 = new Folder("文本文件");

        ImageFile imageFile1, imageFile2;
        imageFile1 = new ImageFile("小龙女.jpg");
        imageFile2 = new ImageFile("张无忌.jpg");

        TextFile textFile1,textFile2;
        textFile1 = new TextFile("九阴真经");
        textFile2 = new TextFile("葵花宝典");

        folder1.addFolder(folder2);
        folder1.addFolder(folder3);
        folder2.addImagefile(imageFile1);
        folder2.addImagefile(imageFile2);
        folder3.adTextfile(textFile1);
        folder3.adTextfile(textFile2);

        folder1.killVirus();

    }
}
