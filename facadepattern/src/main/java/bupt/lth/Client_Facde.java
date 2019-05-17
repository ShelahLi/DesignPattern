package bupt.lth;

public class Client_Facde {
    public static void main(String[] args) {
        AbstractEncryptFacade encryptFacade = new NewEncryptFacade();

        encryptFacade.FileEncrypt("/Users/mac/App/1.txt", "/Users/mac/App/2.txt");
    }
}
