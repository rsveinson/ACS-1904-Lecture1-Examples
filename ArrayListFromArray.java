import java.util.ArrayList;
import java.util.Collections;
/**
 * Create an ArrayList from an array of strings
 */
public class ArrayListFromArray
{
    public static void main(String[] args){
        // An array that will be used to provide
        //   initial data for an ArrayList
        String[] name={"Joe","Jasper","Abigail"};
        ArrayList<String> nameAL = new ArrayList(name.length);
        
        System.out.println("What's in nameAL now?");
        System.out.println(nameAL);
        // The add() method is used to append 
        //     an element to the ArrayList
         for (String n: name) 
             nameAL.add(n);
            
        // or, use Collections.addAll
        //Collections.addAll(nameAL, name);
        
        // Printing an ArrayList results in each 
        //   of  its elements being displayed as 
        //   in a comma-separated list.
        System.out.println("What's in nameAL after converting from array?");
        System.out.println(nameAL);
    }
}
