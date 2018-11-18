import java.util.Scanner;

public class EncryptionDecorator extends DataSourceDecorator {
    public EncryptionDecorator(DataSource source) {
        super(source);
    }

    @Override
    public void writeData(String data) {
        String reverse = "";
        for(int i = data.length() - 1; i >= 0; i--)
        {
            reverse = reverse + data.charAt(i);
        }
        super.writeData(reverse);
    }

    @Override
    public String readData() {
        String data = super.readData();
        String reverse = "";
        for (int i = data.length() - 1; i >= 0; i--) {
            reverse = reverse + data.charAt(i);
        }
        return reverse;
    }
}
