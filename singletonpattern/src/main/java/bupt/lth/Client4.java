public class Client4 {
    public static void main(String[] args) {
       //创建4个LoadBalancer对象
        LoadBalancer loadBalancer1, loadBalancer2, loadBalancer3, loadBalancer4;
        loadBalancer1 = LoadBalancer.getInstance();
        loadBalancer2 = LoadBalancer.getInstance();
        loadBalancer3 = LoadBalancer.getInstance();
        loadBalancer4 = LoadBalancer.getInstance();

        //判断负载均衡器是否相同
        if(loadBalancer1 == loadBalancer2 && loadBalancer2 == loadBalancer3 && loadBalancer3 == loadBalancer4){
            System.out.println("负载均衡器一致");
        }

        //增加服务器
        loadBalancer1.addServer("Server1");
        loadBalancer1.addServer("Server2");
        loadBalancer1.addServer("Server3");
        loadBalancer1.addServer("Server4");

        //模拟客户端请求分发
        for(int i=0;i<10;i++){
            String server = loadBalancer1.getServer();
            System.out.println("客户端请求分发到：" + server);

        }

    }
}
