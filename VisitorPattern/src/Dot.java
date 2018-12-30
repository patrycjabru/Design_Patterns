public class Dot implements Shape {
    int x;
    int y;

    public Dot(int x, int y) {
        this.x = x;
        this.y = y;
    }
    @Override
    public void draw() {
        System.out.println("Drawing dot");
    }

    @Override
    public void accept(Visitor v) {
        v.visitDot(this);
    }
}
