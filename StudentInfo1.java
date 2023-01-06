import java.util.Scanner;
/**
 * Student information is in two arrays.
 * Find student number and report name.
 */
public class StudentInfo1
{
    public static void main(String[] args){
        
        // declare parallel arrays with explicit length
        String[] name = new String[7];
        int[] number = new int[7];
        
        int actualSize = 5;         // the actual size of the filled portion of the array
        
        // populate arrays
        name[0] = "Joe";
        name[1] = "Linda";
        name[2] = "Mary";
        name[3] = "Peter";
        name[4] = "Lee";
        
        number[0] = 0;
        number[1] = 222;
        number[2] = 345;
        number[3] = 567;
        number[4] = 890;
        
        //print the arrays
        for(int i = 0; i < actualSize; i++){
            System.out.print(name[i] + ": ");
            System.out.println(number[i]);
        }//end for
        
        //  new search for a student
        Scanner kb = new Scanner(System.in);
        System.out.println("Enter student number: ");
        
        // how can we change the following code to do a better job of searching for a student?
        int toFind = kb.nextInt();
        for (int i=0; i<actualSize; i++)
            if (toFind==number[i])
                System.out.println(name[i]);
    }
}
