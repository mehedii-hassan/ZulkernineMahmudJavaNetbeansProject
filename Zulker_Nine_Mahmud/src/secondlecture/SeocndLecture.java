package secondlecture;

import java.util.Scanner;

/**
 *
 * @author Mehedi Hassan
 */
public class SeocndLecture {

    static Scanner myScanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("Enter any number with multiply by 100 : ");
        int num = myScanner.nextInt();
        while (num != 0) {

            num *= 100;
            System.out.println("result : " + num);
//            System.out.print("Enter any number with multiply by 100 : ");
//            num = myScanner.nextInt();
            num--;

        }

    }

}
