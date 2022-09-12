public  class Bicycle extends Transport {


    public Bicycle(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }
@Override
    public void updateTyre() {
    System.out.println(this.getModelName());
        System.out.println("Проверяем и меняем покрышки: " + this.getWheelsCount() + "шт.");
    }
    @Override
    public void checkEngine() {
    }

    @Override
    public void checkAuto() {
        updateTyre();

    }
}