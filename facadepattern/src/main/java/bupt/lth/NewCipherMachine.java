package bupt.lth;

import com.sun.tools.javac.util.Convert;

public class NewCipherMachine {
    public String encrypt(String plainText){
        System.out.println("数据加密，将明文转换为密文");
        String es = "";
        int key = 10;//设置秘钥，移位为10
        char[] chars = plainText.toCharArray();
        for(char ch : chars){
            int temp = (int) ch;
            //小写字符移位
            if(ch >= 'a' && ch <= 'z'){
                temp = temp + key % 26;
                if(temp > 122) temp = temp - 26;
                if (temp < 97) temp = temp + 26;
            }
            //大写字符移位
            if(ch >= 'A' && ch <= 'Z'){
                temp = temp + key % 26;
                if(temp > 90) temp = temp - 26;
                if (temp < 65) temp = temp + 26;
            }
            String c = String.valueOf((char) temp);
            es = es + c;
        }

        return es;
    }

}
