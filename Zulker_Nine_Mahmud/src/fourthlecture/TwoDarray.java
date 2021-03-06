package fourthlecture;

import java.util.Scanner;

/**
 *
 * @author Mehedi Hassan
 */
public class TwoDarray {

    static Scanner myScanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[][] twoDarray = new int[2][3];

        //twoDarray
        //1234
        //5678
        //taking the input 
        System.out.println("please give your input : ");
        for (int row = 0; row < 2; row++) {
            for (int column = 0; column < 3; column++) {
                System.out.print("twoDarray[" + row + "][" + column + "]: ");
                //twoDarray[row][column] = myScanner.nextInt();
                twoDarray[row][column] = column;

            }

        }

        //now printing the 2Darray-------------
        System.out.println("\n\n");
        //using try-catch block----
        try {
            for (int row = 0; row < 3; row++) {
                for (int column = 0; column < 3; column++) {
                    System.out.print(twoDarray[row][column] + "\t");

                }
                System.out.println("\n");

            }
        } catch (Exception unknownException) {
            unknownException.printStackTrace();

        }

        System.out.println("Thank you for using our program.");
    }

}
