public class Main {

    public static void main(String[] args) {
        RoundHole hole = new RoundHole(5);

        RoundPeg roundPeg1 = new RoundPeg(4);
        RoundPeg roundPeg2 = new RoundPeg(7);

        SquarePeg squarePeg1 = new SquarePeg(2);
        SquarePeg squarePeg2 = new SquarePeg(10);

        SquarePegAdapter adapter1 = new SquarePegAdapter(squarePeg1);
        SquarePegAdapter adapter2 = new SquarePegAdapter(squarePeg2);

        System.out.println(hole.fits(roundPeg1)); //Should be true
        System.out.println(hole.fits(roundPeg2)); //Should be false
        System.out.println(hole.fits(adapter1)); // Should be true
        System.out.println(hole.fits(adapter2)); // Should be false
    }
}
