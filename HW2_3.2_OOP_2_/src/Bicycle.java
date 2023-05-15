public class Bicycle extends Transport implements ToServis {
    int wheelsCount = 2;

    public Bicycle(String modelName){
       super(modelName,2);
    }

    @Override
    public void toServis() {
        updateTyre();
    }
}
