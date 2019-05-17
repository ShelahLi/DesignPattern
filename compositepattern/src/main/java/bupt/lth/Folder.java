package bupt.lth;

import java.util.ArrayList;

//文件夹类
public class Folder {
    private String name;

    //定义folderlist，用于存储folder类型的成员
    private ArrayList<Folder> folderArrayList = new ArrayList<>();
    //定义folderlist，用于存储folder类型的成员
    private ArrayList<ImageFile> imageFileArrayList = new ArrayList<>();
    //定义folderlist，用于存储folder类型的成员
    private ArrayList<TextFile> textFileArrayList = new ArrayList<>();

    public Folder(String name){
        this.name = name;
    }

    //增加新的Folder类型成员
    public void addFolder(Folder folder){
        folderArrayList.add(folder);
    }
    //增加新的ImageFile类型成员
    public void addImagefile(ImageFile imageFile){
        imageFileArrayList.add(imageFile);
    }
    //增加新的TextFile类型成员
    public void adTextfile(TextFile textFile){
        textFileArrayList.add(textFile);
    }

    public void killVirus(){
        System.out.println("---对文件夹" + name + "进行杀毒");
        //如果Folder类型的成员，递归调用Folder的killVirus()方法
        for(Object object:folderArrayList){
            ((Folder)object).killVirus();
        }
        //如果ImageFile类型的成员，调用ImageFile的killVirus()方法
        for(Object object:imageFileArrayList){
            ((ImageFile)object).killVirus();
        }
        //如果TextFile类型的成员，调用Fol的killVirus()方法
        for(Object object:textFileArrayList){
            ((TextFile)object).killVirus();
        }

    }


}
