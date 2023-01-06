import java.util.Scanner;
/**
 * Student information is in two arrays.
 * Find student number and report name.
 */
public class StudentInfo
{
    public static void main(String[] args){
        String[] name = {"Joe","Linda","Mary","Peter","Lee"};
        int[] number = {123, 222, 345, 567, 890}; 
        
        int keyIndex = -1;
        
        Scanner kb = new Scanner(System.in);
        System.out.println("Enter student number: ");
        int toFind = kb.nextInt();
        
        for (int i=0; i<number.length; i++)
            if (toFind == number[i])
                keyIndex = i;
        
        if(keyIndex >= 0)        
            System.out.println(name[keyIndex]);
        else
            System.out.println("not found");
        
        System.out.println("end of program.");
    }
}
