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
public class SubCarClass extends CarClass {

    private float chargeInBattery;
    private String colorString;

    public SubCarClass() {
        super();
    }

    public SubCarClass(String manu, String model, String key, int cc, float fuel, float charge, String color) {
        super(manu, model, key, cc, fuel);
        chargeInBattery = charge;
        colorString = color;
    }

    public String getColorString() {
        return colorString;
    }

//    public void setColorString(String colorString) {
//        this.colorString = colorString;
//    }
    public float getChargeInBattery() {
        return chargeInBattery;
    }

    public void setChargeInBattery(float chargeInBattery) {
        this.chargeInBattery = chargeInBattery;
    }

}
