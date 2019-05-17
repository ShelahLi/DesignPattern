package bupt.lth;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

//文件保存类，充当系统子类
public class FileWriter {
    public void Write(String encrypt, String fileName){
        System.out.println("保存密文，写入文件");
        //写入相应的文件
        try {
            OutputStream out = new FileOutputStream(fileName);
            byte[] str = encrypt.getBytes();
            out.write(str, 0, str.length);
        } catch (FileNotFoundException e) {
            System.out.println("文件不存在");
        }catch (IOException e){
            System.out.println("文件操作错误");
        }
    }
}
