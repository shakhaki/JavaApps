/*
 * 
 * Justin Lee
 * IS 4415
 */
package factorials;

public class Factorials 
{
    public static void main(String[] args) 
    {   
        int END = 10;
        int number = 1;
        for(int i = 1; i <= END; i++)
        {
            number = number * i;
            System.out.println("The factorial of " + i + " is " + number);
        }
        //System.out.println("The factorial is: " + number);
    }//end main
    
}// end package
