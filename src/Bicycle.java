public class Bicycle extends ServiceStation {

    public Bicycle(String modelName, int wheelsCount) {
        super();
    }

    @Override
    public void updateTyre() {
        super.updateTyre();
    }
    @Override
    public  void check(Bicycle bicycle, Car car, Truck truck) {
        if (bicycle != null) {
            System.out.println("Обслуживаем " + bicycle.getModelName());
            for (int i = 0; i < bicycle.getWheelsCount(); i++) {
                bicycle.updateTyre();
            }
        }
    }
}




