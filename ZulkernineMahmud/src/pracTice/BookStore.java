package pracTice;

import java.util.Scanner;

/**
 *
 * @author Mehedi Hassan
 */
public class BookStore {

    static Scanner myScanner = new Scanner(System.in);
    static String[] books = {"java", "c", "python"};

    static final double studentDiscount = 0.3;
    static final double teacherDiscount = 0.4;
    static final double alienDiscount = 0.0;

    public static void main(String[] args) {
        prln("Wellcome to our BookStore...");
        pr("Which book do you want?\nAns:");
        String userChoice = myScanner.nextLine();
        switch (userChoice.toLowerCase()) {
            case "java":
                prln("you obted for " + books[0] + " books");
                calculatePrice(books[0]);
                break;
            case "c":
                prln("you obted for " + books[1] + " books");
                calculatePrice(books[1]);

                break;
            case "python":
                prln("you obted for " + books[2] + " books");
                calculatePrice(books[2]);

                break;

            default:
                prln("Sorry!We don't have that book.");

        }

    }

    static void calculatePrice(String bookName) {
        pr("Are you a student/teacher/alien\nAns: ");
        String answer = myScanner.nextLine();
        double price = 200;
        switch (answer.toLowerCase()) {

            case "student":
                price = price - (price * studentDiscount);
                showPrice(price);
                break;
            case "teacher":
                price = price - (price * teacherDiscount);
                showPrice(price);
                break;
            case "alien":
                price = price - (price * alienDiscount);
                showPrice(price);
                break;
            default:
                prln("Sorry,We can't serve you!!");
                break;
        }

    }

    static void showPrice(double price) {
        prln("your total payable amount is " + price + " taka");
        prln("\nThank you for shopping from our Bookstore.");

    }

    static void prln(Object anyoObject) {
        System.out.println(anyoObject);

    }

    static void pr(Object anyoObject) {
        System.out.print(anyoObject);

    }

}
