package bupt.lth;
//请求接收者
public class Adder {
    private int num = 0;//定义初始化值为0

    //加法操作，每次将传入的值与num作加法运算，再将结果返回
    public int add(int value){
        num = num + value;
        return num;
    }

}
