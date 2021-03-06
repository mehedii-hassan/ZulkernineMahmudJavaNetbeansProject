package zulkerninemahmud;

import java.util.Scanner;

/**
 *
 * @author Mehedi Hassan
 */
public class Lecture2 {

    public static void main(String[] args) {
        boolean a = 3 < 5;
        System.out.println(a);
        int num = 1;
        int d = --num;
        System.out.println("d= " + d);

        System.out.println("number = " + num);
        ++num;
        System.out.println("number = " + num);
//        Lecture2 ob =  new Lecture2();
        
        System.out.println(method(3,7));
        Scanner sc = new Scanner(System.in);
        System.out.println("Please give us a number : ");
        int n = sc.nextInt();
        int r = method1(n);
        System.out.println(r);
        
       

    }

    public static boolean method(int a, int b) {
        boolean c = a > b;
        return c;

    }
    
    static  int method1(int a){
     a+=2;
     return a*100;
   
      
    }

}
