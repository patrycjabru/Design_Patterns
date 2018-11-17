public class Database {
    private static Database instance;
    private static String data;
    private Database () {
        data = "foo";
    }

    static Database getInstance() {
        if (instance == null) {
             synchronized (Database.class) {
                 if (instance == null)
                     instance = new Database();
             }
        }
        return instance;
    }

    public static String getData() {
        return data;
    }

}
