public class Car {
    private boolean GPS;
    private boolean tripComputer;
    private int numberOfSeats;
    private String engineType;
    private String color;

    public void setGPS(boolean GPS) {
        this.GPS = GPS;
    }

    public void setTripComputer(boolean tripComputer) {
        this.tripComputer = tripComputer;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("GPS: ").append(GPS).append("\n")
                .append("tripComputer: ").append(tripComputer).append("\n")
                .append("numberOfSeats: ").append(numberOfSeats).append("\n")
                .append("engineType: ").append(engineType).append("\n")
                .append("color: ").append(color).append("\n");
        String output = builder.toString();
        return output;
    }
}
