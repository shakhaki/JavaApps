/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package evenodd;
import java.util.Scanner;
/**
 * @author Justin Lee
 * IS 4415
 */
public class EvenOdd {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Scanner input = new Scanner (System.in);
        int number;
        System.out.print("Enter a number >> ");
        number = input.nextInt();
        if(isEven(number))
        {
            System.out.println(number + " is even");
        }
        else
        {
            System.out.println(number + " is odd");
        }
    }
        public static boolean isEven(int number)
        {
            boolean result;
            if(number % 2 ==1 )
                result = false;
            else
            {
                result = true;
            }
            return result;
        }

    
}
