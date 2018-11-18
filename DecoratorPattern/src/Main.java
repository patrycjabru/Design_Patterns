import java.io.FileReader;

public class Main {

    public static void main(String[] args) {
        String path = "testFile";
        FileDataSource source = new FileDataSource(path);
        source.writeData("test123");
        String data1 = source.readData();
        System.out.println(data1);

        EncryptionDecorator decorator = new EncryptionDecorator(source);
        decorator.writeData("test987");
        String data2 = decorator.readData();
        System.out.println(data2);
    }
}
