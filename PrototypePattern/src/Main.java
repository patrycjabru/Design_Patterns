import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Shape> shapes = new ArrayList<Shape>();

        Circle firstCircle = new Circle(10,"blue");
        shapes.add(firstCircle);

        Rectangle firstRectangle = new Rectangle(25,15,"red");
        shapes.add(firstRectangle);

        Circle secondCircle = (Circle) firstCircle.clone();
        shapes.add(secondCircle);

        Rectangle secondRectangle = (Rectangle) firstRectangle.clone();
        shapes.add(secondRectangle);

        for (Shape s:shapes) {
            System.out.print(s);
        }


    }
}
