package fourthlecture;

/**
 *
 * @author Mehedi Hassan
 */
public class FourthLecture {

    public static void main(String[] args) {
        int a, b;
        a = 10;
        b = 20;

        //prln(a < b ? "A is less than B" : "B is less than A");
        prln(a < b ? a : b);

        // prln(compare(a, b));
        prln(compare1(a, b));

//        b = calculateNumber(a, b);
//        prln(calculateNumber(a, b));
//        prln(a);
//        prln(b);
    }

    static int compare1(int a, int b) {
        if (a < b) {
            return a;

        } else {
            return b;
        }

    }

    static String compare(int a, int b) {
        if (a < b) {
            return "A is less than B";

        } else {
            return "B is less than A";
        }

    }

    static int calculateNumber(int number1, int number2) {
        // int result = number1 + number2;
        number1 += number2;
        return number1;

    }

    static void prln(Object anyjObject) {
        System.out.println(anyjObject);
    }

    static void pr(Object anyjObject) {
        System.out.print(anyjObject);
    }

}
