public class Main {
    public static void main(String[] args) {
        Car car = new Car("Lexus", 4);
        Car car2 = new Car("Toyota", 4);

        Truck truck = new Truck("Scania", 6);
        Truck truck2 = new Truck("Volvo", 8);

        Bicycle bicycle = new Bicycle("Honda", 2);
        Bicycle bicycle2 = new Bicycle("Yamaha", 2);


        ServiceStation.check(bicycle, null, null);

        }
    }



