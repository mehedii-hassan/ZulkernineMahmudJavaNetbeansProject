package thirdclass;

import java.util.Scanner;

/**
 *
 * @author Mehedi Hassan
 */
public class BookStore {

    static String[] books = {"java", "C", "python"};
    static final double studentDiscount = 0.3;
    static final double teacherDiscount = 0.4;
    static final double alienDiscount = 0.0;

    static Scanner myScanner = new Scanner(System.in);

    public static void main(String[] args) {

        prln("-----WELLCOME TO OUR BOOKSTORE--------");
        pr("Which book do you want?\nAns: ");
        String userChoice = myScanner.nextLine();

        if (books[0].toLowerCase().equals(userChoice.toLowerCase())) {
            prln("You opted for " + books[0] + " book");
            calculatePrice();

        } else if (books[1].toLowerCase().equals(userChoice.toLowerCase())) {
            prln("You opted for " + books[1] + " book");
            calculatePrice();

        } else if (books[2].toLowerCase().equals(userChoice.toLowerCase())) {
            prln("You opted for " + books[2] + " book");
            calculatePrice();

        } else {
            prln("Sorry,We don't have that book.");

        }

    }

    static void calculatePrice() {
        pr("Are you a Student/Teacher/Alien?\nAns: ");
        String answer = myScanner.nextLine();

        double price = 200;

        if (answer.toLowerCase().equals("student")) {
            price = price - (price * teacherDiscount);
            showPrice(price);

        } else if (answer.toLowerCase().equals("student")) {
            price = price - (price * studentDiscount);
            showPrice(price);
        } else if (answer.toLowerCase().equals("alien")) {
            price = price - (price * alienDiscount);
            showPrice(price);
        } else {
            prln("Sorry,We can't serve that Book.");
            

        }

    }

    static void showPrice(double price) {
        prln("Your total payable amount is " + price + " taka");
        prln("\n----------THANK YOU FOR SHOPPING FROM OUR BOOKSTORE---------- ");

    }

    static public void prln(Object anyObject) {
        System.out.println(anyObject);

    }

    static public void pr(Object anyObject) {
        System.out.print(anyObject);

    }

}
