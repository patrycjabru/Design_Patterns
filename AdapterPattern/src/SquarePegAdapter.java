public class SquarePegAdapter extends RoundPeg {
    private SquarePeg peg;

    public SquarePegAdapter(SquarePeg peg) {
        this.peg = peg;
    }

    public double getRadius() {
        double radius = peg.getWidth() * Math.sqrt(2) / 2;
        return radius;
    }
}
