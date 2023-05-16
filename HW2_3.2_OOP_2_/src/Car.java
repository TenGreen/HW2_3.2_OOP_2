public class Car extends EngineTransport implements ToServis{

    private int numberWheels = 4;
    public Car(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    @Override
    public void toServis() {
        System.out.println("Делаем сервис для " + getModelName());
        updateTyre();
        checkEngine();
        System.out.println();
    }
}
