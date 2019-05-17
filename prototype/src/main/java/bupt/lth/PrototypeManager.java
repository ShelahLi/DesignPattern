import java.util.Hashtable;

public class PrototypeManager {
    //定义一个Hashtable，用于存储原型对象
    private Hashtable hashtable = new Hashtable();
    private static PrototypeManager prototypeManager = new PrototypeManager();
    //hashtable增加公文对象
    private PrototypeManager(){
        hashtable.put("far", new FAR());
        hashtable.put("srs", new SRS());

    }
    //增加新的公文对象
    public void addOfficialDocument(String key, OfficialDocument officialDocument){
        hashtable.put(key, officialDocument);
    }
    //通过浅克隆获取公文对象
    public OfficialDocument getOfficialDocument(String key){
        return ((OfficialDocument) hashtable.get(key)).clone();
    }
    //
    public static PrototypeManager getPrototypeManager(){
        return prototypeManager;
    }

}
