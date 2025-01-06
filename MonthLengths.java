/**
 * Display number of days in each month
 */
public class MonthLengths
{
    public static void main(String[] args){  
        int[] daysInMonth = {31,28,31,30,31,30,31,31,30,31,30,31};
        
        // get the length
        System.out.println(daysInMonth.length);
        
        //daysInMonth.length = 14;
        System.out.println(daysInMonth);
        System.out.println("Days for each of " + daysInMonth.length + " months ");
        
        System.out.println("month 3 has : " + daysInMonth[2] + " days.");
        
        daysInMonth[10] = (int)29.5;
        daysInMonth[10] += 5;
        System.out.println("Nov " + daysInMonth[2]);
        
        int x[] = new int[12];
        x[0] = 3;
        
        for (int i = 0; i< daysInMonth.length; i++)
            System.out.print(daysInMonth[i]+"  ");
           
        System.out.println("\n\n");
        
        for (int i = 0; i< daysInMonth.length; i++){
            if(daysInMonth[i] == 31){
               System.out.println("Month " + (i + 1) + " has " + daysInMonth[i]+"  "); 
            }
        }// end for i
    }// end main
}// end class
