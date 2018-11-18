public class Main {

    public static void main(String[] args) {
        Circle circle1 = new Circle();
        Circle circle2 = new Circle();
        Circle circle3 = new Circle();
        Circle circle4 = new Circle();
        Circle circle5 = new Circle();

        CompositeGraphic compositeGraphic = new CompositeGraphic();

        compositeGraphic.addChild(circle1);
        compositeGraphic.addChild(circle2);
        compositeGraphic.addChild(circle3);
        compositeGraphic.addChild(circle4);
        compositeGraphic.addChild(circle5);

        compositeGraphic.print();

        compositeGraphic.removeChild(circle2);

        System.out.println();

        compositeGraphic.print();
    }
}
