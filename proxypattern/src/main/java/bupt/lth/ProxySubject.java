public class ProxySubject extends Subject {
    //维持一个✔️真实对象的访问
    private RealSubject realSubject = new RealSubject();
    public void PreRequest(){

    }
    void Request() {
        PreRequest();
        realSubject.Request();//调用真实主题的方法
        PostRequest();
    }

    public void PostRequest(){

    }
}
