public class Component implements ComponentWithContextualHelp {
    String toolltipText;
    Container container;

    @Override
    public void showHelp() {
        if (toolltipText != null)
            System.out.println("Tooltip Component: "+toolltipText);
        else
            container.showHelp();

    }
}
