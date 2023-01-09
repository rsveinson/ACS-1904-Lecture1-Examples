import java.util.Scanner;
import java.util.Random;

/** 
 * ACS-1904 Assignment X Question Y
 * @author 
*/

public class SomeArrayDetails{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int[] list = new int[10];
        
        Random r = new Random();
        int randomNumber;
        int count;          // index and counter for the array
        
        count = 0;          // explicitly set the value of the index
        randomNumber = r.nextInt(11);
        
        while(randomNumber != 0){
            // add the random number to the array at index i
            // increment i so the next number will be added
            // at index i + 1
            list[count++] = randomNumber;
            randomNumber = r.nextInt(11);
        }// end while
        
        // print the array
        for(int n : list){
            System.out.println(n);
        }// end for each
        
        // print only the used part of the array
        for(int i = 0; i < count; i++){
            System.out.println(list[i]);
        }// end for
        
        System.out.println(list);
        
        


        System.out.println("end of program");
    }
}
