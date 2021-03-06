/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zulkerninemahmud;

import java.util.Scanner;

/**
 *
 * @author Mehedi Hassan
 */
public class PascalTriangle {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        prln("give -1 to exit");
        pr("Give the length of Pascal's triangle' length :  ");
        int userInput = sc.nextInt();
        while (userInput != -1) {
            if (userInput < -1 || userInput > 20) {
                prln("please enter something between -1 to 20  ");
                userInput = sc.nextInt();
                continue;

            }
            printPascalTriangle(userInput);
            prln("please enter something between -1 to 20  ");
            userInput = sc.nextInt();

        }

    }

    static void printPascalTriangle(int length) {
        int[][] pascal = new int[length][length];
        for (int i = 0; i < length; i++) {
            pascal[0][i] = 1;
            pascal[i][0] = 1;

        }
        for (int row = 1; row < length; row++) {
            for (int column = 1; column < length - row; column++) {
                pascal[row][column] = pascal[row][column - 1] + pascal[row - 1][column];

            }

        }
        for (int row = 0; row < length; row++) {
            for (int column = 0; column < length - row; column++) {
                pr(pascal[row][column] + "\t");
            }
            prln("\n");

        }
    }

    static void prln(Object anyoObject) {
        System.out.println(anyoObject);

    }

    static void pr(Object anyoObject) {
        System.out.print(anyoObject);

    }

}
