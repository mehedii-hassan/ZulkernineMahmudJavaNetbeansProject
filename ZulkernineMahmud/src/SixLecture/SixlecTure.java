 
package SixLecture;

import FifthLecture.*;

/**
 *
 * @author Mehedi Hassan
 */
public class SixlecTure {
    public static void main(String[] args) {
        CarClass aCar = new CarClass("MITSUBISI", "lancer", "eiry", 2500, 15, 2010);
        SubCarClass aSubCar = new SubCarClass("NISAN", "350z", "jksh",4000 , 300, 2011, 12, "gray");
        AnotherSubCar sixLecture=new AnotherSubCar("dosgf", "iuyi","df", 3200, 300, 2100);
        //LearningClass.main(null);
        
        aSubCar.manufacturerName="marcedes banz";
        sixLecture.printAllInfo();
        aSubCar.printAllInfo();
        aCar.printAllInfo();
        sixLecture.addAmountOfFuel(12);
        
       
        System.out.println("\n\nFuel: "+sixLecture.presentAmountOfFuel());
        System.out.println("Modelname:"+sixLecture.getCarModelName());
        System.out.println("Year :"+sixLecture.getManufacturingYear());
    }
    
}
