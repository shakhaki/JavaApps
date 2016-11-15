/* 
 * 
 * Justin Lee
 * IS 4415
 */
package knots;

public class Knots 
{

    public static void main(String[] args)
    {
        double knot = 1;
        double mile = 1.15;
        double kilometer = 1.85;
        int startingKnot = 15;
        int endingKnot = 30;
        
        for(; startingKnot <= endingKnot; startingKnot++)
        {
            double mileOutput = startingKnot * mile;
            double kiloOutput = startingKnot * kilometer;
            System.out.println(startingKnot + " Kilometers is " + mileOutput + " in miles \n" +
                            startingKnot + " Knots is " + kiloOutput + " in kilometers");
        }
        
    }
    
}
