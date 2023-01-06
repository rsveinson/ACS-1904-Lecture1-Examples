import java.util.Scanner;
/**
 * Display average of 7 values
 */
public class AverageTemperature
{
    public static void main(String[] args){
        Scanner kb = new Scanner(System.in);
        double[] temperature = new double[7];
        
        System.out.println("Enter 7 temperatures:");
        
        for (int i = 0; i < 7; i++)
            temperature[i] = kb.nextDouble();
            
        double sum = 0.0;
        
        for (double t:temperature) 
            sum += t;
            
        System.out.println("average= " + sum / 7.0);
    }
}
