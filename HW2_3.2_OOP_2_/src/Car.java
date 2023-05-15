public class Car extends EngineTransport implements ToServis{

    private int numberWheels = 4;
    public Car(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    @Override
    public void toServis() {
        updateTyre();
        checkEngine();
    }
}
