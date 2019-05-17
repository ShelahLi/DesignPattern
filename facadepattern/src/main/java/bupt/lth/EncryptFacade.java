package bupt.lth;
//加密外观类：充当外观类
public class EncryptFacade {

    //维持对其他对象的引用
    private FileReader fileReader;
    private CipherMachine cipherMachine;
    private FileWriter fileWriter;

    public EncryptFacade(){
        fileReader = new FileReader();
        cipherMachine = new CipherMachine();
        fileWriter = new FileWriter();
    }

    //调用其他对象的业务方法
    public void fileEncrypt(String inputFile, String outputFile){
        String plainStr = fileReader.read(inputFile);
        String encryptStr = cipherMachine.encrypt(plainStr);
        fileWriter.Write(encryptStr, outputFile);

    }

    public static void main(String[] args) {
        //客户端测试
        EncryptFacade encryptFacade = new EncryptFacade();
        encryptFacade.fileEncrypt("/Users/mac/App/1.txt", "/Users/mac/App/2.txt");
    }
}
