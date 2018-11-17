public class RoundHole {
    private double radius;
    public RoundHole(double radius) {
        this.radius=radius;
    }
    public boolean fits(RoundPeg peg){
        double pegRadius = peg.getRadius();
        return radius >= pegRadius;
    }
}
