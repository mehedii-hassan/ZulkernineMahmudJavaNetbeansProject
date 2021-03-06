 
package zulkerninemahmud;

/**
 *
 * @author Mehedi Hassan
 */
public class ThirdClass {
    public static void main(String[] args) {
        String var;
        var = "abcd";
        
        prln("This is our prln method.");
        prln(var);
//        System.out.println("String length = "+var.length());
        pr("String length = "+var.length()+"\n");
        
        
        int[][] twoDarray;
        twoDarray = new int[3][3];
        
        twoDarray[0][0]=1;
        twoDarray[0][1]=2;
        twoDarray[0][2]=3;
        twoDarray[1][0]=4;
        twoDarray[1][1]=5;
        twoDarray[1][2]=6;
        twoDarray[2][0]=7;
        twoDarray[2][1]=8;
        twoDarray[2][2]=9;
          
        System.out.println("2Darray length = "+twoDarray.length);
        System.out.println("2Darray length = "+twoDarray.length);
        prln(twoDarray[0][0]);
        prln(twoDarray[0][1]);
        prln(twoDarray[0][2]);
        prln(twoDarray[1][0]);
        prln(twoDarray[1][1]);
        prln(twoDarray[1][2]);
        twoDarray[2][2]+=(8+twoDarray[0][0]);
        System.out.println(twoDarray[2][2]);
        
        
        
        
        
        
        
        
        
        
    }
    static void prln(Object anyObject){
        System.out.println(anyObject);
    }
    static void pr(Object anyObject){
    
        System.out.print(anyObject);
    }
    
}