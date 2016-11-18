/*
 * 
 * Justin Lee
 * IS 4415
 */
package collegecost;
import java.util.Scanner;
public class CollegeCost {

    public static void main(String[] args) 
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("How old is your child? >> ");
        int childAge = keyboard.nextInt();
        
        if(childAge > 18)
        {
            System.out.println("Your child's age must be less than 18 >> ");
        }
        else
        {
            int ageDifference = 18 - childAge;
            int calculateSavings = ageDifference * 5000;
            System.out.println("You will need to save " + calculateSavings + " for your child's college education.");
        }
    }
    
}
