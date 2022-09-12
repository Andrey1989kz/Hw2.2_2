public class Truck extends Transport {

    public Truck(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }
@Override
    public void updateTyre() {
        System.out.println("Проверяем и меняем покрышки: " + this.getWheelsCount() + "шт.");

    }
@Override
    public void checkEngine() {
    System.out.println(this.getModelName());
    System.out.println("Проверяем Двигатель");

    }

    public void checkTrailer() {
        System.out.println("Проверяем прицеп");
    }
    @Override
    public void checkAuto() {
checkEngine();
checkTrailer();
updateTyre();
    }
}

