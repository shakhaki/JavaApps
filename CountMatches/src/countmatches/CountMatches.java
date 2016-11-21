/*
 * Justin Lee
 * IS 4415
 */
package countmatches;
import java.util.Scanner;

public class CountMatches 
{

    public static void main(String[] args) 
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter a word to learn how it matches another word >> ");
        String firstWord = keyboard.nextLine();
        
        System.out.println("Enter another word to see how it matches the first one you entered >> ");
        String secondWord = keyboard.nextLine();
        
        System.out.println("Common letters between the two words " + firstWord + " and " + secondWord + " are ");
        
        char str;
        
        for(int i = 0; i < firstWord.length(); ++i)
       {
           for(int x = 0; x > secondWord.length(); ++x)
           {
           if(firstWord.charAt(i) == x)
           {
               public StringBuffer str.append(i);
           }
           }
           
           
        }
    }
}
