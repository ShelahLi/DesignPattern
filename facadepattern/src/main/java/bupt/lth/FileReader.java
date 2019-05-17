package bupt.lth;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

import static java.lang.System.in;
import static java.lang.System.out;

//文件读取类：子系统类
public class FileReader {
    public String read(String filename){

        out.println("读取文件，获取明文");
        StringBuffer stringBuffer = new StringBuffer();

        try {
            InputStream in = new FileInputStream(filename);
            byte[] bytes = new byte[2048];
            //接受读取的内容(n就代表的相关数据，只不过是数字的形式)
            int n = -1;
            //循环取出数据
            while ((n = in.read(bytes,0,bytes.length)) != -1) {
                //转换成字符串
                String str = new String(bytes,0,n,"GBK");
                //out.println(str);
                stringBuffer.append(str);
            }
            in.close();
        } catch (FileNotFoundException e) {
            out.println("文件不存在");
        }catch (IOException e){
            out.println("文件操作错误");
        }

        return stringBuffer.toString();

    }
}
