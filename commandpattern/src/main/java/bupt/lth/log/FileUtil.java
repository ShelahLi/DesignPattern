package bupt.lth.log;

import javax.imageio.IIOException;
import java.io.*;
import java.util.ArrayList;

//工具类：文件操作类
public class FileUtil {
    //将命令集合写入日志文件
    public static void writeCommands(ArrayList commands){
        try {

            FileOutputStream fileOutputStream = new FileOutputStream("config.log");
            //创建对象输出流将对象写入到文件中去
            ObjectOutputStream objout = new ObjectOutputStream(new BufferedOutputStream(fileOutputStream));
            //将对象写入文件
            objout.writeObject(commands);
            objout.close();
        } catch (Exception e) {
            System.out.println("文件保存失败");
            e.printStackTrace();
        }

    }

    //在日志中提取命令集合
    public static ArrayList readCommands(){
        FileInputStream fileInputStream = null;
        try {
            fileInputStream = new FileInputStream("config.log");
            //创建对象输入流，用于从文件中读取对象
            ObjectInputStream objin = new ObjectInputStream(new BufferedInputStream(fileInputStream));
            //将文件中的对象读出并转换为ArrayList型
            ArrayList commands = (ArrayList) objin.readObject();
            objin.close();
            return commands;
        } catch (Exception e) {
            System.out.println("文件读取失败");
            e.printStackTrace();
            return null;
        }

    }
}
