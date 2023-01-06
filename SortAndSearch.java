import java.util.Arrays;
import java.util.Scanner;
/**
 * An array of names is sorted and then 
 * searched for a specific name.
 */
public class SortAndSearch
{
    public static void main(String[] args){
        String[] name = {"Joe","Linda","Mary","Peter","Lee","Patricia"};
        
        Arrays.sort(name);
        
        Scanner kb = new Scanner(System.in);
        System.out.println("Enter a name: ");
        String toFind = kb.next();
        
        int foundAt = Arrays.binarySearch(name, toFind);
        System.out.println(foundAt);
        
        if (foundAt >= 0)
            System.out.println("Found in position "+foundAt);
        else 
            System.out.println("Not Found ");
    }
}
