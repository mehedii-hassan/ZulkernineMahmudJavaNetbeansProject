 
package fourthlecture;

import java.util.Scanner;

/**
 *
 * @author Mehedi Hassan
 */
public class Pattern {
    static Scanner myScanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Please give your input : ");
        int userInput = myScanner.nextInt();
        for (int row = 0; row < userInput; row++) {
            
            for (int column = 0; column <= row; column++) {
                System.out.print("* ");
                
            }
            System.out.println("");
            
        }
    }
    
}
