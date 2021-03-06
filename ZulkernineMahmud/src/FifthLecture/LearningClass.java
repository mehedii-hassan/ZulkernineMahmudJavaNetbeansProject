package FifthLecture;

public class LearningClass {

    private final int aNumber = 12;
    private int anotherNumber;
    private static  CarClass ourCar = new CarClass();
    static private CarClass ourAnotherCar = new CarClass();

    public static void main(String[] args) {

        ourAnotherCar = new CarClass("TOYOTA", "Allion", "qwerty", 1500, 30);
        CarClass thirdCar = new CarClass("MAZDA", "axela", "asdf", 1500, 20);
        SubCarClass ourSubCar= new SubCarClass("BMW", "7 series", "agef", 3000, 40, 10, "White");
        
           //first car
           ourAnotherCar.printAllInfo();
//        System.out.println("Manufacturer: " + ourAnotherCar.manufacturerName);
//        System.out.println("Model Name: " + ourAnotherCar.getModelName());
//        System.out.println("PassWord Match: " + ourAnotherCar.matchPassword("wioeahl"));
//        System.out.println("1st car CC: " + ourCar.engineCC);
//        System.out.println("2nd car CC: " + ourAnotherCar.engineCC);
//        System.out.println("Amount of Fuel : " + ourAnotherCar.presentAmountOfFuel() + "L");
//        ourAnotherCar.addFuel(2);
//        System.out.println("Amount of Fuel after adding 2L : " + ourAnotherCar.presentAmountOfFuel() + "L");
//        ourAnotherCar.runForSecond(60);
//        System.out.println("Amount of Fuel after driving for 60s : " + ourAnotherCar.presentAmountOfFuel() + "L");
//        
        //third car
        thirdCar.printAllInfo();
//        System.out.println("\n\n");
//        System.out.println("Manufacturer: " + thirdCar.manufacturerName);
//        System.out.println("Model Name: " + thirdCar.getModelName());
//        System.out.println("PassWord Match: " + thirdCar.matchPassword("wioeahl"));
//        System.out.println("Amount of Fuel : " + thirdCar.presentAmountOfFuel() + "L");
//        thirdCar.addFuel(2);
//        System.out.println("Amount of Fuel after adding 2L : " + thirdCar.presentAmountOfFuel() + "L");
//        thirdCar.runForSecond(60);
//        System.out.println("Amount of Fuel after driving for 60s : " + thirdCar.presentAmountOfFuel() + "L");
//        
        
        //Sub car
        ourSubCar.printAllInfo();
//        System.out.println("\n\n");
//        System.out.println("Manufacturer: " + ourSubCar.manufacturerName);
//        System.out.println("Model Name: " + ourSubCar.getModelName());
//        System.out.println("PassWord Match: " + ourSubCar.matchPassword("wioeahl"));
//        System.out.println("Amount of Fuel : " + ourSubCar.presentAmountOfFuel() + "L");
//        ourSubCar.addFuel(2);
//        System.out.println("Amount of Fuel after adding 2L : " + ourSubCar.presentAmountOfFuel() + "L");
//        ourSubCar.runForSecond(60);
//        System.out.println("Amount of Fuel after driving for 60s : " + ourSubCar.presentAmountOfFuel() + "L");
//        System.out.println("Charge in Battery: "+ourSubCar.getChargeInBattery());
//        System.out.println("Color of car : "+ourSubCar.getColorString());

    }

}
