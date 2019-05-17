package bupt.lth;
//抽象图像类：抽象类
public abstract class Image {
        protected ImageImp imageImp;
        public void setImageImp(ImageImp imageImp){
            this.imageImp = imageImp;
        }

        abstract void parseFile(String fileName);
}
