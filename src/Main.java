public class Main {
    public static void main(String[] args) {
        Vehicles bicycle = new Bicycle("bicycle1", 2);
        Vehicles bicycle2 = new Bicycle("bicycle2", 2);
        Vehicles car = new Car("car1", 4);
        Vehicles car2 = new Car("car2", 4);
        Vehicles truck = new Truck("truck1", 6);
        Vehicles truck2 = new Truck("truck2", 8);


        ServiceStation station = new ServiceStation();
        station.check((Bicycle) bicycle);
        station.check((Bicycle) bicycle2);
        station.check((Car) car);
        station.check((Car) car2);
        station.check((Truck) truck);
        station.check((Truck) truck2);
    }
}