package paintcalculator;
import java.util.Scanner;
/**
 *Class IS 4415
 * @author Justin Lee
 * 
 */
public class PaintCalculator {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) 
    {
     double wallHeight;
     double wallLength;
     double wallWidth;
     
     Scanner fromUserHeight = new Scanner(System.in);
     System.out.println("Enter the height of the walls in the room you'd like to paint >> ");
     wallHeight = fromUserHeight.nextInt();   
     
    
     Scanner fromUserLength = new Scanner(System.in);
     System.out.println("Enter the length of a wall in the room you'd like to pain >> ");  
     wallLength = fromUserLength.nextInt();
     
     Scanner fromUserWidth = new Scanner(System.in);
     System.out.println("Enter the width of another in the room you'd like to paint >> ");
     wallWidth = fromUserWidth.nextInt();
     
     
     double ResultWallOne = wallOne(wallHeight, wallLength);
     double ResultWallTwo = wallOne(wallLength, wallWidth);
     
     double areas = ResultWallOne + ResultWallTwo;
                     
     PriceOfPaint(ResultWallOne, ResultWallTwo);
     
    }
    public static double wallOne(double wallHeight, double wallLength)
    {
    //Calculates area of wall 1 and then multiplies the result by 2 before the return statement
        double SideOne = wallHeight * wallLength;
        double DoubleOne = SideOne * 2;
        
        return DoubleOne;
    }
    
    public static void PriceOfPaint(double rectOne, double rectTwo)
    {
        /*
        *Adds the two walls together 
        *Then divides the area by 350 before multiplying the left over value by 32
        */
        double GallonArea = 350.00;
        double PriceOfPaint = 32.00;
        
        double AddWall = rectOne;
        double AddShortWall = rectTwo;
        
        double areas = AddWall + AddShortWall;
        
        double gallons = areas/GallonArea;
        double price = gallons * PriceOfPaint;
        
        System.out.println("You will need " + gallons + " gallons of paint, which will cost $" + price);
        
    }
    
    
}
