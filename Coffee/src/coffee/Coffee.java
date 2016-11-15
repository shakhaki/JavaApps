/*
 * Justin Lee
 * IS 4415
 */
package coffee;
import java.util.Scanner;
public class Coffee 
{

    public static void main(String[] args) 
    {
        boolean end = false;

        double American = 1.99;
        double Espresso = 2.50;
        double Latte = 2.15;
        double finalPrice = 0;
        
        int Input;

        Scanner keyboard = new Scanner(System.in);
        System.out.println("_______________________________\n"
                        + "(1) American...............1.99\n"
                        + "(2) Espresso...............2.50\n"
                        + "(3) Latte..................2.15\n"
                        + " ______________________________");
        System.out.println("Choose an item by selecting 1, 2 , 3 or type 0 to quit.");
        
        
        while (true)
        {
            Input = keyboard.nextInt();
              
        switch (Input)
        {    
            case 0:
            {
                end = true;
                System.out.println("Thank you for shopping with us, your order total is $" + finalPrice);
                System.exit(0);
            }
            case 1:
            {
                finalPrice += American;
                System.out.println(" The total is $" + finalPrice +", would you like to order more?");
                break;
            }
            case 2:
            {
                finalPrice += Espresso;
                System.out.println(" The total is $" + finalPrice +", would you like to order more?");
                break;
            }
            case 3:
            {
                finalPrice += Latte;
                System.out.println(" The total is $" + finalPrice +", would you like to order more?");
                break;
            }
            
            default: System.out.println("Please enter a valid choice 1,2,3, or 0.");
        }//close switch
        
    }//close while loop
    
}//close Main
}//close Class Coffee
