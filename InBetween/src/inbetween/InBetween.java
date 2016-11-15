/*
 * 
 * Justin Lee
 * IS 4415
 */
package inbetween;
import java.util.Scanner;

public class InBetween
{

    public static void main(String[] args)
    {
        System.out.println("Enter your first value >> ");
        Scanner keyboard = new Scanner(System.in);
        int userNumber = keyboard.nextInt();
        
        System.out.println("Enter the last value >> ");
        int secondNumber = keyboard.nextInt();
        for(int i = userNumber; i <= secondNumber; i++)
        {
            System.out.println("The number's in between the two you entered are " + i);
        }
        if(userNumber < secondNumber)
        {
            System.out.println(secondNumber - userNumber);
        }
        else
        {
            System.out.println("Please enter a valid set of numbers");
        }
    }
    
}
