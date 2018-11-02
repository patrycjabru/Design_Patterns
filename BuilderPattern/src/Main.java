public class Main {

    public static void main(String[] args) {

        Director director = new Director();
        CarBuilder builder = new CarBuilder();
        director.constructSportsCar(builder);
        Car sportCar = builder.getResult();
        System.out.println(sportCar);

        director.constructCityCar(builder);
        Car cityCar = builder.getResult();
        System.out.println(cityCar);
    }
}
