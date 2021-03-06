package bupt.lth;

import javax.xml.parsers.*;
import org.w3c.dom.*;
import org.xml.sax.SAXException;
import java.io.*;

public class XMLUtil_bridge {
    public static Object getBean(String args) {

        try{
            //创建文档对象
            DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
            Document doc;
            Node classnode = null;
            doc = documentBuilder.parse(new File("configure/conf_bridge"));

            //获取包含图表类型的文本节点
            NodeList nodeList = doc.getElementsByTagName("className");
            if(args.equals("image")){
               classnode = nodeList.item(0).getFirstChild();
            }else if(args.equals("os")){
                classnode = nodeList.item(1).getFirstChild();
            }
            String cName = classnode.getNodeValue().trim();
            cName = "bupt.lth."+cName;
            //通过类名生成实例对象并返回
            Class c = Class.forName(cName);
            Object obj = c.newInstance();
            return obj;

        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }
}
