package condosales2;
import java.util.Scanner;
/**
 *IS 4415
 * @author Justin Lee
 */
public class CondoSales2
{

    public static void main(String[] args) 
    {
    double parkView;
    double golfView;
    double lakeView;
    int Input;
    int Space;
    
    parkView = 150000.00;
    golfView = 170000.00;
    lakeView = 210000.00;
    
    int Parking;
    Parking = 5000;
    
    System.out.println("Enter the view you'd like to have: 1 for Park View, 2 for Golf View, and 3 for Lake View.");
    Scanner keyboard = new Scanner(System.in);
    Input = keyboard.nextInt();
    
    
    
    if (Input == 1)
    {
        System.out.println("Would you like a garage for an additional $5,000?: Type 1 for garage parking");
        Space = keyboard.nextInt();
        if (Space == 1)
        {
            double property;
            property = parkView + 5000;
            System.out.println("You've selected Park View at: $" + property);
        }
        else
        {
            System.out.println("You've selected Park View at: $" + parkView);
        }
    }
    if (Input == 2)
    {
        System.out.println("Would you like a garage for an additional $5,000?: Type 1 for garage parking");
        Space = keyboard.nextInt();
        if (Space == 1)
        {
            double property;
            property = golfView + 5000;
            System.out.println("You've selected Park View at: $" + property);
        }
        else
        {
            System.out.println("You've selected Park View at: $" + golfView);
        }           
    }
    if (Input == 3)
    {
        System.out.println("Would you like a garage for an additional $5,000?: Type 1 for garage parking");
        Space = keyboard.nextInt();
        if (Space == 1)
        {
            double property;
            property = lakeView + 5000;
            System.out.println("You've selected Park View at: $" + property);
        }
        else
        {
            System.out.println("You've selected Park View at: $" + lakeView);
        }
    }
    /*else
    {
        System.out.println("Invalid Entry: " + 0);
    }
    */
    }
}
