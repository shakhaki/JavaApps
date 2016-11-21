/*
 * Justin Lee
 * IS 4415
 */
package countspaces2;
import java.util.Scanner;
public class CountSpaces2
{

    public static void main(String[] args)
    {
       String aString;
       int stringLength;
       Scanner in = new Scanner (System.in);
       int numSpaces = 0;
       System.out.print("Enter a string >> ");
       aString = in.nextLine();
       stringLength = aString.length();
       
       for(int i = 0; i < stringLength; i++)
       {
           char ch = aString.charAt(i);
           if(ch == ' ')
           {
               numSpaces++;
           }
       }//end for loop
       System.out.println("The number of spaces is " + numSpaces);      
    }//end main
 
    
}//end class
