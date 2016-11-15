package addednumbers;
import java.util.Scanner;
/**
 *IS 4415 Midterm Part 2
 * Question 1
 * @author Justin Lee
 */
public class AddedNumbers {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //defined two int values
        int yourNumber;
        int anotherNumber;
        
        //Accept User input for int yourNumber
        Scanner numberInput = new Scanner(System.in);
        System.out.println("Enter the first number you want to add: >> ");
        yourNumber = numberInput.nextInt();
        
        //Accept User input for int anotherNumber
        Scanner anotherNumberInput = new Scanner(System.in);
        System.out.println("Enter the second number you want to add: >> ");
        anotherNumber = anotherNumberInput.nextInt();
        
        addNumbers(yourNumber, anotherNumber);       
    
    }
    public static void addNumbers(int firstValue, int secondValue){
        //initialized the passed values into method
        int yourNumber = firstValue;
        int anotherNumber = secondValue;
        //sumValues stores the result of adding yourNumber + anotherNumber and prints result
        int sumValues = yourNumber + anotherNumber;
        System.out.println("The sum of the two numbers you entered is: " + sumValues);
    }
    
}
