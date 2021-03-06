package zulkerninemahmud;

import java.util.Scanner;

/**
 *
 * @author Mehedi Hassan
 */
public class FourthLecture {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        
//        int a = 10;
//        int b = 20;
//        prln(compare(a, b));
//        using ternary operator
//        prln(a < b ? "A is less than B" : "B is less than A");
//        String var =(a < b) ? "A is less than B" : "B is less than A";
//        prln(var);
        //Declering twoDarray

        int userInput = 0;
        
        
        try {
            pr("please give a number:");
            userInput = scanner.nextInt();
            while (userInput < 50) {

                prln(100 / userInput);
                userInput++;

            }
        } catch (Exception e) {
            e.printStackTrace();
        }finally{
            userInput++;
            prln("came out of  try catch bloock, with userinput "+userInput);
        }

        int[][] twoDarray = new int[2][2];
        //int m=0;
//        prln("Please give your input : ");
//        //taking the input
//        for (int row = 0; row < 2; row++) {
//            for (int column = 0; column < 2; column++) {
//                pr("twoDarray[" + row + "][" + column + "]: ");
//                twoDarray[row][column] = scanner.nextInt();
////                 twoDarray[row][column]=m++;
//            }
//
//        }

        //Now printing the 2Darray
        try {
            for (int row = 0; row < 2; row++) {
                for (int column = 0; column < 2; column++) {
                    pr(twoDarray[row][column] + "\t");
                }
                prln("\n");

            }
//            System.out.print("Please give a number : ");
//            int userInput = scanner.nextInt();
//            while (userInput != 100) {
//                prln(100 / userInput);
//                System.out.print("Please give a number : ");
//                userInput = scanner.nextInt();
//
//            }

        } catch (Exception unknownException) {
            unknownException.printStackTrace();
        }
//        }finally{
//            prln("came out try catch block.");
//        }

        prln("Thank you for using our Program.");

//        int[] array = new int[10];
//        System.out.println("length :" + array.length);
//
//        System.out.println("Using While loop.");
//        int i = array.length;
//        while (i > 0) {
//            array[i - 1] = i;
//            i--;
//        }
////        printing elements
//        while (i < array.length) {
//            prln("array[" + i + "]:" + array[i]);
//            i++;
//        }
//        for (int col = 0; col < 10; col++) {
//
//        }
//
//        System.out.println("Using do while loop:");
//        int j = 3;
//        do {
//            System.out.println(" Do while loop.");
//            System.out.println("j = " + j);
//            j++;
//        } while (j > 10);
//
//        System.out.println("Using while loop:");
//        j = 3;
//        while (j > 10) {
//            System.out.println("While loop.");
//
//            System.out.println("j = " + j);
//            j++;
//
//        }
//
//        System.out.println("Using for loop.");
//        for (int k = 2; k < 90; k *= 2) {
//            System.out.println(k);
//        }
    }
//
////    static String compare(int a, int b) {
////        if (a < b) {
////            return "A is less than B";
////        } else {
////            return "B is less than A";
////            
////        }
////    }

    static void prln(Object anyoObject) {
        System.out.println(anyoObject);

    }

    static void pr(Object anyoObject) {
        System.out.print(anyoObject);

    }

}
