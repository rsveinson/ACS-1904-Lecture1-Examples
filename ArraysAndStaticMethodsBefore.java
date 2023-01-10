import java.util.Scanner;
/** 
 * ACS-1904 Assignment X Question Y
 * @Sveinson
 * 
 * using static methods with arrays
*/

public class ArraysAndStaticMethodsBefore{
    public static void main(String[] args) {
        final int MAX = 10;
        
        int[] list = new int[MAX];
        int count;                  // counter and index for the array
        int inputNumber;            // numbers read from the keyboard
        
        Scanner scanner = new Scanner(System.in);
        
        count = 0;          // explicily set the index/counter to 0
        
        // load the array with some number from the keyboard
        System.out.println("enter up to 10 numbers, -1 to quit");
        inputNumber = scanner.nextInt();
        
        while(inputNumber != -1){
            //System.out.println(inputNumber);
            
            // add input to the list
            list[count++] = inputNumber;
            
            // update control
            inputNumber = scanner.nextInt();
        }// end load array loop

        // print the list 
        System.out.println(list);
        for(int i = 0; i < count; i++){
            System.out.println(list[i]);
        }//end for
        
        // change an element using a static method
        for(int i = 0; i < count; i++){
            list[i] = list[i] + 100;
        }//end for
        
        // print the list witht he change
        System.out.println(list);
        for(int i = 0; i < count; i++){
            System.out.println(list[i]);
        }//end for
        
        System.out.println("end of program");
    }// end main
    
    
}// end class
