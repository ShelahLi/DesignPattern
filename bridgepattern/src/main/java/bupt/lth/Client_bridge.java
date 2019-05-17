
package bupt.lth;
public class Client_bridge {
    public static void main(String[] args) {
        Image image;
        ImageImp imageImp;
        image = (Image) XMLUtil_bridge.getBean("image");
        imageImp = (ImageImp) XMLUtil_bridge.getBean("os");
        image.setImageImp(imageImp);
        image.parseFile("...");

    }
}
