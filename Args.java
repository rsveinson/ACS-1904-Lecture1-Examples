/**
 * Print the values passed into the program
 */
public class Args
{
   public static void main(String[] args){
       
      System.out.println("The elements of args:");
      
      for (String s: args) 
        System.out.print(" "+s);
   }
}
