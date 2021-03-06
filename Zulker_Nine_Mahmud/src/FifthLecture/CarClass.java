package FifthLecture;

/**
 *
 * @author Mehedi Hassan
 */
public class CarClass {

    //Class attributes --------------------
    public String manufacturerName;
    private String modelName;
    private String carKeyValue;
    int engineCC;
    final private float amountOfFuelConsumedPerSecond=0.02f;
//   public float carWeight;
    private float fuelAmount;
    
    //Class constructors----------------
    public CarClass(){
     manufacturerName=new String();
     modelName=new String();
     engineCC=1000;
//     carWeight=0;
     fuelAmount=0;
    
    }
    public CarClass(String carName){
     manufacturerName=new String(carName);
     modelName= new String();
     engineCC=0;
//     carWeight=0;
     fuelAmount=0;
    
    }
    
    public CarClass(String manu,String model,String key,int enginCC,float fuel){
     manufacturerName=manu;
     modelName= model;
     carKeyValue=key;
     this.engineCC=enginCC;
//     carWeight=0;
     fuelAmount=fuel;
    
    }

    //Class instance methods--------------------
    public float presentAmountOfFuel() {
        return fuelAmount;
    }
    public void addFuel(int fuel) {
        fuelAmount+= fuel;
    }
    public void runForSeconds(int timeInSecond){
        float usedFuel=timeInSecond*amountOfFuelConsumedPerSecond;
        fuelAmount-=usedFuel;
    }
    
    public String getManufacturerName() {
        return manufacturerName;
    }
    
    public String getModelName() {
        return modelName;
    }
    
    public boolean matchPassword(String userInput) {
        return userInput.equals(carKeyValue);
    }

}
