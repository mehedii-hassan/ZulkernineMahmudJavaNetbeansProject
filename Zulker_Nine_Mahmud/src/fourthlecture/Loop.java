package fourthlecture;

/**
 *
 * @author Mehedi Hassan
 */
public class Loop {

    public static void main(String[] args) {
        
        int a, b;
        a = 10;
        b = 200;

        int[] array = new int[100];
        int i = 10;

        //--------while loop-------------
        System.out.println("Using while loop : ");
        while (i > 0) {
            //array[i - 1] = i - 1;
            array[i - 1] = (i - 1) * 2;
            i--;
        }

        //prining the element
        while (i < 10) {
            prln("array[" + i + "]= " + array[i]);
            i++;
        }

        //do- while loop 
        System.out.println("\n\nUsing do-while loop : ");
        do {
            array[i - 1] = i;
            i--;
        } while (i > 0);

        //printing the element 
        do {
            prln("array["+i+"]: "+array[i]);
            i++;
        } while (i>10);
        
        
        //for loop -----------------
        prln("\n\nFor loop : ");
        for (int j = 2; j <calculateNumber(a, b) ; j*=2) {
            prln(j);
            
            
        }

    }
    
    static int calculateNumber(int number1, int number2) {
        // int result = number1 + number2;
        number1 += number2;
        return number1;

    }

    static void prln(Object anyjObject) {
        System.out.println(anyjObject);
    }

    static void pr(Object anyjObject) {
        System.out.print(anyjObject);
    }
}
