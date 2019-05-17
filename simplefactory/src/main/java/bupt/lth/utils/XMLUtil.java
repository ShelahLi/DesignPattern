package utils;
import javax.xml.parsers.*;
import org.w3c.dom.*;
import org.xml.sax.SAXException;
import java.io.*;

public class XMLUtil {
    public static String getChartType() {

        try{
            //创建文档对象
            DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
            Document doc;
            doc = documentBuilder.parse(new File("configure/conf1.xml"));

            //获取包含图表类型的文本节点
            NodeList nodeList = doc.getElementsByTagName("chartType");
            Node classnode = nodeList.item(0).getFirstChild();
            String chartType = classnode.getNodeValue().trim();
            return chartType;

        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }
}
