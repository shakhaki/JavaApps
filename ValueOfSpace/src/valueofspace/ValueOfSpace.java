package valueofspace;
import java.util.Scanner;
/**
 *IS 4415 Midterm
 * Question 2
 * @author Justin Lee
 */
public class ValueOfSpace {

    public static void main(String[] args) {
        //initialize data types and values for user input
        double heightMeasure;
        double widthMeasure;
        
        //System seeks user input and stores it in the previously established variables
        Scanner heightInput = new Scanner(System.in);
        System.out.println("Enter the length of a wall: >> ");
        heightMeasure = heightInput.nextInt();
        
        //System seeks user input and stores it in the previously established variables
        Scanner widthInput = new Scanner(System.in);
        System.out.println("Enter the width of a wall: >> ");
        widthMeasure = widthInput.nextInt();
        
        //call the methods
        ComputePerimeter(heightMeasure, widthMeasure);
        ComputeArea(heightMeasure, widthMeasure);
    }
    public static void ComputePerimeter(double height, double width){
        //initialize passed values
        double heightMeasure = height;
        double widthMeasure = width;
        //below we mulitply each value by 2 and add them together
        double addedPerimeter = heightMeasure * 2 + widthMeasure * 2;
        System.out.println("The perimeter of the room you measured is: " + addedPerimeter);        
    }
    
    public static void ComputeArea(double height, double width){
        double heightMeasure = height;
        double widthMeasure = width;
        //We've initialized the two passed variables into the method and are now mulitplying them
        double multipliedArea = heightMeasure * widthMeasure;
        System.out.println("The area of the room you measured is: " + multipliedArea);
    }
        
    
}
