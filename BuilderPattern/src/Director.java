public class Director {
    void constructSportsCar(Builder builder){
        builder.reset();
        builder.setSeats(2);
        builder.setEngine("sport");
        builder.setColor("red");
        builder.setGPS(true);
        builder.setTripComputer(true);
    }
    void constructCityCar(Builder builder) {
        builder.reset();
        builder.setSeats(5);
        builder.setEngine("casual");
        builder.setColor("silver");
        builder.setGPS(true);
        builder.setTripComputer(false);
    }
}
