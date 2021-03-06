package thirdclass;

import java.util.Scanner;

/**
 *
 * @author Mehedi Hassan
 */
public class ThirdLecture {

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        int a = 4;
        int b = 6;
        
        b++;
        a +=b;

       // a += (b++);
        prln("a =" + a + " b =" + b);

        
//        String myName = new String("Sdf;ohhhdglkjfsdoigD");
//        pr("Please write your name  : ");
//        String name = input.nextLine();
//
//        if (name.length() > 15) {
//            prln("your name is too long");
//        } else if (name.length() < 3) {
//            prln("your name is too short");
//        } else {
//
//            switch (name.length()) {
//
//                case 7:
//                    prln("you hava a lucky  name ");
//                    break;
//                case 8:
//                    prln("you hava 8 char name ");
//                    break;
//                case 9:
//                    prln("you hava 9 char name ");
//                    break;
//                case 13:
//                    prln("you hava 13 char name ");
//                    break;
//
//                case 14:
//                    prln("you hava a quite long name ");
//                    break;
//                default:
//                    prln("your name is ok");
//            }
//            if (name.length() == 7) {
//                prln("you have a lucky name");
//            } else {
//                prln("your name is ok");
//
//            }

//        }
    }

    static void prln(Object anyObject) {
        System.out.println(anyObject);
    }

    static void pr(Object anyObject) {
        System.out.print(anyObject);
    }

}
