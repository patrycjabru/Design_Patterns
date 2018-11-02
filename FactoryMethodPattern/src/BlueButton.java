public class BlueButton implements Button{
    public void onHold(String action) {
        System.out.println("Blueeee: "+action);
    }
    public void onClick(String action) {
        System.out.println("Blue: "+action);
    }
    public void render() {
        System.out.println("Blue button rendered!");
    }

}
