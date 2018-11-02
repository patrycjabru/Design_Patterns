public class CarBuilder implements Builder{
    private Car car;
    public void reset() {
        car = new Car();
    }
    public void setSeats(int numberOfSeats) {
        car.setNumberOfSeats(numberOfSeats);
    }
    public void setEngine(String engineType) {
        car.setEngineType(engineType);
    }
    public void setGPS(boolean isGPS) {
        car.setGPS(isGPS);
    }
    public void setTripComputer(boolean isTripComputer) {
        car.setTripComputer(isTripComputer);
    }
    public void setColor(String color) {
        car.setColor(color);
    }
    public Car getResult() {
        return car;
    }
}
