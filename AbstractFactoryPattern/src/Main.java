public class Main {

    public static void main(String[] args) throws Exception {
        GUIFactory factory;
        String os = "Windows";

        if(os.equals("Windows"))
            factory = new WinFactory();
        else if (os.equals("Mac"))
            factory = new MacFactory();
        else
            throw new Exception("Invalid os");

        Application app = new Application(factory);
        app.createUI();
        app.paint();
    }
}
