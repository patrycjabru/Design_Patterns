import java.io.*;

public class FileDataSource implements DataSource{
    private String filename;
    FileDataSource(String filename) {
        this.filename = filename;
    }

    @Override
    public void writeData(String data) {
        try {
            FileWriter fileWriter = new FileWriter(filename);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(data);
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String readData() {
        File file = new File(filename);
        StringBuilder outputBuilder = new StringBuilder();
        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String st;
            while ((st = bufferedReader.readLine()) != null) {
                outputBuilder.append(st);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return outputBuilder.toString();
    }
}
