public class RedButton implements Button{
    public void onHold(String action) {
        System.out.println("Reeeeed: "+action);
    }

    public void onClick(String action) {
        System.out.println("Red: "+action);
    }

    public void render() {
        System.out.println("Red button rendered!");
    }
}
