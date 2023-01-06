import java.util.Scanner;
/** 
 * ACS-1904 Assignment X Question Y
 * @author 
*/

public class ArrayTraversal{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        final int MAXLENGTH = 50;
        int n = 0;                      // red from the keyboard
        int count = 0;                     // keep track of how many elemnts are
                                            // acutally in the array
        int[] list = new int[MAXLENGTH];
        
        // only fill part of the array
        System.out.println("enter numbers 0 to end");
        n = scanner.nextInt();
        
        while(n != 0){
            list[count] = n;
            count++;
            
            // update the control variable
            n = scanner.nextInt();
        }//end while
        
        // now travers the array, only the used portion
        for(int i = 0; i < count; i++){
            // do some computation
            // could be adding, counting, squaring,....
            
            //how can we get the numbering to start at 1?
            System.out.println((i + 1) + ". " + list[i]);
        }// end for


        System.out.println("end of program");
    }
}
