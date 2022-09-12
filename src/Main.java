public class Main {
    public static void main(String[] args) {
        Car car = new Car("Lexus GS300", 4);
        Car car1 = new Car("Toyota LC200", 4);

        Bicycle bicycle = new Bicycle("BMX", 2);
        Bicycle bicycle1 = new Bicycle("Aist", 2);

        Truck truck = new Truck("Volvo", 6);
        Truck truck1 = new Truck("Kenworth", 10);

        ServiceStation station = new ServiceStation();
        station.check(car);
        station.check(bicycle1);
        station.check(truck1);
    }


    }



