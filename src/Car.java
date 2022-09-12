public class Car extends Transport {
    private String modelName;
    private int wheelsCount;

    public Car(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }
@Override
    public void updateTyre() {
        System.out.println("Проверяем и меняем покрышки: " + this.getWheelsCount() + "шт.");
    }
@Override
    public void checkEngine() {
        System.out.println(this.getModelName());
        System.out.println("Диагностика двигателя");
    }

    @Override
    public void checkAuto() {
        checkEngine();
        updateTyre();
    }
}


