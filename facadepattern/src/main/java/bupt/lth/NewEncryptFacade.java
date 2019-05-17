package bupt.lth;

public class NewEncryptFacade extends AbstractEncryptFacade {
    private FileReader fileReader = new FileReader();
    private NewCipherMachine cipherMachine = new NewCipherMachine();
    private FileWriter fileWriter = new FileWriter();

    public NewEncryptFacade(){

    }

    void FileEncrypt(String inputFile, String outputFile) {
        String plainStr = fileReader.read(inputFile);
        String encryptStr = cipherMachine.encrypt(plainStr);
        fileWriter.Write(encryptStr, outputFile);
    }
}
