public class Truck extends EngineTransport implements ToServis {
       public Truck(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    public void checkTrailer() {
        System.out.println("Проверяем прицеп");
    }

    @Override
    public void toServis() {
        updateTyre();
        checkEngine();
        checkTrailer();
    }
}
