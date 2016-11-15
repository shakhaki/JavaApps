package condosales;
import java.util.Scanner;
/**
 *IS 4415
 * @author Justin Lee
 */
public class CondoSales
{

    public static void main(String[] args) 
    {
    double parkView;
    double golfView;
    double lakeView;
    int Input;
    
    parkView = 150000.00;
    golfView = 170000.00;
    lakeView = 210000.00;
    
    System.out.println("Enter the view you'd like to have: 1 for Park View, 2 for Golf View, and 3 for Lake View.");
    Scanner keyboard = new Scanner(System.in);
    Input = keyboard.nextInt();
    
    if (Input == 1)
    {
        System.out.println("You've selected Park View at: $" + parkView);
    }
    if (Input == 2)
    {
        System.out.println("You've selected the Golf View at: $" + golfView);           
    }
    if (Input == 3)
    {
        System.out.println("You've selected the Lake View at: $" + lakeView);
    }
    else{
        System.out.println("Invalid Entry: " + 0);
    }
    
    }
    
}
