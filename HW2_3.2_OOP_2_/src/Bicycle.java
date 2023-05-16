public class Bicycle extends Transport implements ToServis {

    public Bicycle(String modelName, int wheelsCount){
       super(modelName, wheelsCount);

    }

    @Override
    public void toServis() {
        System.out.println("Делаем сервис для велосипеда " + getModelName());
        System.out.println("Регулируем руль");
        updateTyre();
        System.out.println();
    }
}
