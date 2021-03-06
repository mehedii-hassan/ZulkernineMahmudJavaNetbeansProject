/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FifthLecture;

/**
 *
 * @author Mehedi Hassan
 */
public class FifthClass {

//    private int aNumber = 12;
//    private int anotherNumber;
    private static CarClass ourCar = new CarClass();
    private static CarClass ourAnotherCar;

    public static void main(String[] args) {
//        String nameString = ourCar.manufacturerName;
//        ourCar.prenentAmountOfFuel();

        ourAnotherCar = new CarClass("TOYOTA", "Allion", "qwerty", 1500, 30);
        CarClass thirdCar = new CarClass("MAZDA", "Axela", "whyer", 2000, 50);
        SubCarClass ourSubCar = new SubCarClass("BMW", "7Series", "jkdh", 3000, 40, 10, "grey");

//        System.out.println("Password Match : "+ourAnotherCar.matchPassword("sdyhilwau"));
//        System.out.println("1st car manu: "+ourCar.manufacturerName);
//        System.out.println("1st car cc: "+ourCar.engineCC);
//        System.out.println("2nd car manu: " + ourAnotherCar.manufacturerName);
//        System.out.println("2nd car cc: " + ourAnotherCar.engineCC);

        //2nd Carclass-------------------------
        System.out.println("Manufacturer : " + ourAnotherCar.manufacturerName);
        System.out.println("Model Name : " + ourAnotherCar.getModelName());
        System.out.println("Amount of fuel : " + ourAnotherCar.presentAmountOfFuel() + "L");
        ourAnotherCar.addFuel(20);
        System.out.println("Amount of fuel afer adding 20L : " + ourAnotherCar.presentAmountOfFuel() + "L");
        ourAnotherCar.runForSeconds(60);
        System.out.println("Amount of fuel afer driving 60s : " + ourAnotherCar.presentAmountOfFuel() + "L");
        System.out.println("\n\n");

//      //thirdCar------------------ 
        System.out.println("Manufacturer : " + thirdCar.manufacturerName);
        System.out.println("Model Name : " + thirdCar.getModelName());
        System.out.println("Amount of fuel : " + thirdCar.presentAmountOfFuel() + "L");
        thirdCar.addFuel(20);
        System.out.println("Amount of fuel afer adding 20L : " + thirdCar.presentAmountOfFuel() + "L");
        thirdCar.runForSeconds(60);
        System.out.println("Amount of fuel afer driving 60s : " + thirdCar.presentAmountOfFuel() + "L");

        //SubCarclass ----------------
        System.out.println("\n\n");
        System.out.println("Manufacturer : " + ourSubCar.manufacturerName);
        System.out.println("Model Name : " + ourSubCar.getModelName());
        System.out.println("Amount of fuel : " + ourSubCar.presentAmountOfFuel() + "L");
        ourSubCar.addFuel(20);
        System.out.println("Amount of fuel afer adding 20L : " + ourSubCar.presentAmountOfFuel() + "L");
        ourSubCar.runForSeconds(60);
        System.out.println("Amount of fuel afer driving 60s : " + ourSubCar.presentAmountOfFuel() + "L");
        System.out.println("Charge in battery : "+ourSubCar.getChargeInBattery());
        System.out.println("Color of car : "+ourSubCar.getColorString());

    }

}
