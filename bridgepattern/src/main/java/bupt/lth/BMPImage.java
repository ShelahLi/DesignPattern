package bupt.lth;

public class BMPImage extends Image {

    public void parseFile(String fileName) {
        //模拟解析JPG文件获取一个像素矩阵
        Matrix matrix = new Matrix();
        imageImp.doPaint(matrix);
        System.out.println("BMP");
    }
}
