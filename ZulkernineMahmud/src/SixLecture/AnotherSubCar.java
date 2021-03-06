package SixLecture;

import FifthLecture.CarClass;

/**
 *
 * @author Mehedi Hassan
 */
public class AnotherSubCar extends CarClass implements CarInterFace {
    
    public AnotherSubCar() {
        super();
    }
    
//    public AnotherSubCar(String carName) {
//        super(carName);
//    }
    
    public AnotherSubCar(String manu, String model, String key, int engineCC, float fuel) {
        super(manu, model, key, engineCC, fuel);
        
    }

    public AnotherSubCar(String manu, String model, String key, int engineCC, float fuel, int year) {
        super(manu, model, key, engineCC, fuel, year);
    }
    
    @Override
    public void driveCar(int drivingTimeInSeconds) {
        runForSecond(drivingTimeInSeconds);
    }
    
    @Override
    public void addAmountOfFuel(int amount) {
        addFuel(amount);
    }
    
    @Override
    public int getManufacturingYear() {
        return manufacturingYear;
    }
    
    @Override
    public String getCarModelName() {
        return getModelName();
    }
    
}
