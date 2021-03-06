package fourthlecture;

import java.util.Scanner;

public class Try_Catch_Block {

    /**
     *
     * @author Mehedi Hassan
     */
    static Scanner myScanner = new Scanner(System.in);

    public static void main(String[] args) {
        int userInput=0 ;

        try {
//             
            System.out.print("please give a number : ");
             userInput = myScanner.nextInt();
            // while (userInput != 200) {
            while (userInput < 50) {
                System.out.println("result : " + 100 / userInput);
//                System.out.print("please give a number : ");
//                userInput = myScanner.nextInt();
                    userInput++;

            }
        } catch (Exception unknownException) {
            unknownException.printStackTrace();

        } finally {
            userInput++;
            System.out.println("came out of try - catch block with user input equal "+userInput);
        }

        System.out.println("Thank you for using our program.");
    }

}
