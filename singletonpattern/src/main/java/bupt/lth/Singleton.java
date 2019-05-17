public class Singleton {
    private Singleton(){}
    private static class HolderClass{
        private final static Singleton singleton = new Singleton();
    }
    private static Singleton getInstance(){
        return HolderClass.singleton;
    }
}
