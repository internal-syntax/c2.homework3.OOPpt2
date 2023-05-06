public class Main {
    public static void main(String[] args) {
        Vehicles bicycle = new Bicycle("bicycle1", 2);
        Vehicles bicycle2 = new Bicycle("bicycle2", 2);
        Vehicles car = new Car("car1", 4);
        Vehicles car2 = new Car("car2", 4);
        Vehicles truck = new Truck("truck1", 6);
        Vehicles truck2 = new Truck("truck2", 8);

        ServiceStation station = new ServiceStation();
        station.check((Car) car, null, null);
        station.check((Car) car2, null, null);
        station.check(null, (Bicycle) bicycle, null);
        station.check(null, (Bicycle) bicycle2, null);
        station.check(null, null, (Truck) truck);
        station.check(null, null, (Truck) truck2);
    }
}