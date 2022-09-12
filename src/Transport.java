public abstract class Transport {
    private String modelName;
    int wheelsCount;


    public String getModelName() {
        return modelName;
    }

    public int getWheelsCount() {
        return wheelsCount;
    }

    public Transport(String modelName, int wheelsCount) {

        this.modelName = modelName;
        this.wheelsCount = wheelsCount;
    }

    public abstract void updateTyre();
    public abstract void checkEngine();

    public abstract void checkAuto();




}
