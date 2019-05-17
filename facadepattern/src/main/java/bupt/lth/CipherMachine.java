package bupt.lth;
//数据加密类：充当系统子类
public class CipherMachine {
    public String encrypt(String plainText){
        System.out.println("数据加密，将明文转换为密文");
        String es = "";
        char[] chars = plainText.toCharArray();
        for(char ch : chars){

            String c = String.valueOf((ch % 7));
            es = es + c;
         }

        return es;
    }
}
