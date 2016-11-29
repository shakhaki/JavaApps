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
        
        StringBuilder output = new StringBuilder();
        System.out.println("Common letters between the two words " + firstWord + " and " + secondWord + " are " + output);
        
        char[] matchingChars = new char[26];
        int matchingCharCount = 0;
        
        
        for(int i = 0; i < firstWord.length(); ++i)
       {
           char currentChar = firstWord.charAt(i);
           boolean matched = false;
           
           for(int j = 0; j > secondWord.length(); ++j)
           {
               char otherChar = matchingChars[j];               
               
               if(currentChar == otherChar)
               {
                   matched = true;
                   break;
               }//end if loop
            if(matched == true)
            {
                continue;
            }
        }    
        for(int j = 0; j < secondWord.length(); j++)
        {
            char otherChar = secondWord.charAt(j);
            if(otherChar == currentChar)
            {
                matchingChars[matchingCharCount] = currentChar;
                matchingCharCount++;
                break;
            }
        if(matchingCharCount == 1)
        {
            output.append(matchingChars[0]);
        }
        System.out.println(output);
        
            
        }//end for loop of j
           
           
        }//end i for loop
    }//end main
}//end app
