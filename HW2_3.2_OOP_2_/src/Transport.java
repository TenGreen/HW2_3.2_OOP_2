abstract class Transport {
    private String modelName;
    private int wheelsCount;
    int numberWheels;
    public void updateTyre() {
        for (int i = 0; i < numberWheels; i++) {
            System.out.println("Меняем покрышку" + 1);
        }
    }
    public String getModelName() {
        return modelName;
    }

    public void setModelName(String wheelsCount) {
        this.modelName = modelName;
    }

    public int getWheelsCount() {
        return wheelsCount;
    }

    public void setWheelsCount(int wheelsCount) {
        this.wheelsCount = wheelsCount;
    }

    public Transport(String modelName, int wheelsCount) {
        this.modelName = modelName;
        this.wheelsCount = wheelsCount;
    }


}
