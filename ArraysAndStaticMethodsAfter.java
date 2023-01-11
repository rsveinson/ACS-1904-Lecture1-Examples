import java.util.Scanner;
/** 
 * ACS-1904 Assignment X Question Y
 * @Sveinson
 * 
 * using static methods with arrays
*/

public class ArraysAndStaticMethodsAfter{
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
        printList(list, count);
        
        // change an element using a static method
        changeTheList(list, count);
        System.out.println(list);
        
        // print the list witht he change
        printList(list, count);
        
        System.out.println("end of program");
    }// end main
    
    // *** static methods ***
       
    public static void printList(int[] l, int c){
        for(int i = 0; i < c; i++){
            System.out.println(l[i]);
        }//end for
    }// end print list
    
    public static void changeTheList(int[] l, int c){
        System.out.println(l);
        
        for(int i = 0; i < c; i++){
            l[i] = l[i] + 100;
                              
        /* as an experiment i'm going to change the reference variable l
         * to see if it changes the value in the reference variable list
         * found in main
         */
            int[] otherList = new int[c];
            System.out.println(otherList);
            l = otherList;
            System.out.println(l);
        }//end for
    }// end change the list
    
    
}
