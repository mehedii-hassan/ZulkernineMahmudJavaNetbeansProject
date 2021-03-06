package FifthLecture;

/**
 *
 * @author Mehedi Hassan
 */
public class CarClass {

    //public variable
    public String manufacturerName;

    //private variable
    private String modelName;
    private String carKeyValue;
    private float fuelAmount;
    final private float amountOfFuelConsumedPerSeocnd = 0.02f;

    //default variable
    int engineCC;
    
    //protected variable
    protected int manufacturingYear;

    public CarClass() {
        manufacturerName = new String();
        modelName = new String();
        engineCC = 1000;
        fuelAmount = 0;

    }

    public CarClass(String carName) {
        manufacturerName = carName;
        modelName = new String();
        engineCC = 0;
        fuelAmount = 0;

    }

    public CarClass(String manu, String model, String key, int engineCC, float fuel) {
        manufacturerName = manu;
        modelName = model;
        carKeyValue = key;
        this.engineCC = engineCC;
        fuelAmount = fuel;

    }
    public CarClass(String manu, String model, String key, int engineCC, float fuel,int year) {
       this(manu, model, key, engineCC, fuel);
       manufacturingYear=year;

    }

    public float presentAmountOfFuel() {

        return fuelAmount;
    }

    public String getManufacturerName() {
        return manufacturerName;
    }

    public String getModelName() {
        return modelName;
    }

    public void addFuel(float fuelAmount) {
        this.fuelAmount += fuelAmount;
    }

    public void runForSecond(int timeInSecond) {
        float usedFuel = timeInSecond * amountOfFuelConsumedPerSeocnd;
        fuelAmount -= usedFuel;
    }

    public boolean matchPassword(String userInput) {

        return userInput.equals(carKeyValue);
    }
    
    public void printAllInfo() {
        System.out.println("\n\n");
        System.out.println("Manufacturer: " + manufacturerName);
        System.out.println("Model Name: " + getModelName());
        System.out.println("PassWord Match: " + matchPassword("wioeahl"));
        System.out.println("Amount of Fuel : " + presentAmountOfFuel() + "L");
        addFuel(2);
        System.out.println("Amount of Fuel after adding 2L : " + presentAmountOfFuel() + "L");
        runForSecond(60);
        System.out.println("Amount of Fuel after driving for 60s : " + presentAmountOfFuel() + "L");
         
    }

}
