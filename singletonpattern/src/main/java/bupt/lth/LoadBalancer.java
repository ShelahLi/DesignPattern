import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class LoadBalancer {
    private static LoadBalancer loadBalancer = null;
    //服务器集合
    private List serverList = null;
    private LoadBalancer(){
        System.out.println("创建负载均衡器");
        serverList = new ArrayList();
    }
    public static LoadBalancer getInstance(){
        if (loadBalancer == null){
            loadBalancer = new LoadBalancer();
        }
        return loadBalancer;
    }
    //增加服务器
    public void addServer(String server){
        serverList.add(server);
    }
    //删除服务器
    public void removeServer(String server){
        serverList.remove(server);
    }
    //使用Random类随机创建服务器
    public String getServer(){
        Random random = new Random();
        int i = random.nextInt(serverList.size());
        return (String)serverList.get(i);
    }
}
