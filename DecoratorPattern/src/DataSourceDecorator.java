public class DataSourceDecorator implements DataSource {
    protected DataSource source;

    public DataSourceDecorator(DataSource source) {
        this.source = source;
    }

    @Override
    public void writeData(String data) {
        source.writeData(data);
    }

    @Override
    public String readData() {
        return source.readData();
    }
}
