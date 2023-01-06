/**
 * Display number of days in each month
 */
public class MonthLengths
{
    public static void main(String[] args){  
        int[] daysInMonth = {31,28,31,30,31,30,31,31,30,31,30,31};
        System.out.println(daysInMonth);
        System.out.println("Days for each of " + daysInMonth.length + " months ");
        
        System.out.println("month 3 has : " + daysInMonth[2] + " days.");
        
        for (int i = 0; i< daysInMonth.length; i++)
            System.out.print(daysInMonth[i]+"  ");
    }// end main
}// end class
