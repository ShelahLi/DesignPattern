public class Client5 {
    public static void main(String[] args) {
//        IPrototype prototype1 = new ConcreteProtoType();
//        IPrototype prototype2 = ((ConcreteProtoType) prototype1).clone();
//        System.out.println(prototype2.getClass());
//        if(prototype1 == prototype2){
//            System.out.println("==");
//        }else {
//            System.out.println("!=");
//        }

        //获取原型管理对象
        PrototypeManager prototypeManager = PrototypeManager.getPrototypeManager();
        OfficialDocument document1, document2, document3, document4;
        document1 = prototypeManager.getOfficialDocument("far");
        document1.display();
        document2 = prototypeManager.getOfficialDocument("far");
        document2.display();
        System.out.println(document1 == document2);

        document3 = prototypeManager.getOfficialDocument("srs");
        document3.display();
        document4 = prototypeManager.getOfficialDocument("srs");
        document4.display();
        System.out.println(document3 == document4);

    }
}
