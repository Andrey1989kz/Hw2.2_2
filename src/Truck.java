public class Truck extends ServiceStation {

    public Truck(String modelName, int wheelsCount) {
        super();
    }

    @Override
    public void updateTyre() {
        super.updateTyre();
    }

    @Override
    public void checkEngine() {
        super.checkEngine();
    }

    public void checkTrailer() {
            System.out.println("Проверяем прицеп");
        }
        @Override
    public  void check(Bicycle bicycle, Car car,Truck truck) {
        if (truck != null) {
            System.out.println("Обслуживаем " + truck.getModelName());
            for (int i = 0; i < truck.getWheelsCount(); i++) {
                truck.updateTyre();
            }
            truck.checkEngine();
            truck.checkTrailer();
        }
    }

}

