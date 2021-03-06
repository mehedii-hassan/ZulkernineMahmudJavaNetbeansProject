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

    public SubCarClass(String manu, String model, String key, int CC, float fl, float charge, String color) {
        super(manu, model, key, CC, fl);
        chargeInBattery = charge;
        colorString = color;
    }

    public SubCarClass(String manu, String model, String key, int CC, float fl, int year, float charge, String color) {
        super(manu, model, key, CC, fl, year);
        manufacturerName="ZFIDJKF";
        engineCC=1500;
        manufacturingYear=2010;
        chargeInBattery = charge;
        colorString = color;
    }

    public String getColorString() {
        return colorString;
    }

    @Override
    public void printAllInfo() {
        super.printAllInfo();
        System.out.println("Charge in Battery: " + getChargeInBattery());
        System.out.println("Color of car : " + getColorString());

    }

    public float getChargeInBattery() {
        return chargeInBattery;
    }

    public void setChargeInBattery(float chargeInBattery) {
        this.chargeInBattery = chargeInBattery;
    }

}
