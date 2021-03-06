 
package secondlecture;

/**
 *
 * @author Mehedi Hassan
 */
public class NewClass {
    public static void main(String[] args) {
        int a =2;
        int b =3;
        boolean statement = procriya(a, b);
        System.out.println(statement);
        
        int result = method(a);
        System.out.println(result);
   
    }
    
    static boolean procriya(int g,int c){
    boolean result = g>c;
    return result;
    
    }
    
    
    static int method(int a){
        int result = a*100;
        return result;
    
    }
    
}
