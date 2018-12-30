public class Rectangle implements Shape {
    int x;
    int y;
    int height;
    int width;

    public Rectangle(int x, int y, int height, int width) {
        this.x = x;
        this.y = y;
        this.height = height;
        this.width = width;
    }

    @Override
    public void draw() {
        System.out.println("Drawing rectangle");
    }

    @Override
    public void accept(Visitor v) {
        v.visitRectangle(this);
    }
}
