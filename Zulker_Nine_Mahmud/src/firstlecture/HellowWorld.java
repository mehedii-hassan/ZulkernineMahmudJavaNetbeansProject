package firstlecture;

import java.util.Scanner;

/**
 *
 * @author Mehedi Hassan
 */
public class HellowWorld {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("May I know your name please?");

        String name = sc.nextLine();

        System.out.println("\nHello! " + name);

    }

}
