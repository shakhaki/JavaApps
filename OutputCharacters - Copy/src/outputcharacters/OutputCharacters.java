package outputcharacters;
import java.util.Scanner;
public class OutputCharacters 
{
    public static void main(String[] args) 
    {
        char[] matchingChars = new char[26];
        int matchingCharCount = 0;
        
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter a word >> ");
        String firstWord = keyboard.nextLine();
        
        System.out.println("Enter a word >> ");
        String secondWord = keyboard.nextLine();
        
        // For each letter in the first string
        for (int i = 0; i < firstWord.length(); i++)
        {
            char currentChar = firstWord.charAt(i);
            // Make sure currentChar isn't already flagged as matching
            boolean matched = false;
            for (int j = 0; j < matchingCharCount; j++)
            {
                char otherChar = matchingChars[j];
                if (otherChar == currentChar)
                {
                    matched = true;
                    break;
                }
            }
            if (matched == true)
            {
                continue;
            }
            
            // Compare to each letter in the second string
            for(int j = 0; j < secondWord.length(); j++)
            {
                char otherChar = secondWord.charAt(j);
                
                // If currentChar and otherChar match AND hasn't been matched before
                // Save to an array
                if (otherChar == currentChar)
                {
                    matchingChars[matchingCharCount] = currentChar;
                    matchingCharCount++;
                    break;
                }
            }
        }//cl
        
        StringBuilder output = new StringBuilder();
        // Use array to create output string showing the matches
        if (matchingCharCount == 0)
        {
            output.append("No characters match");
        }
        else if (matchingCharCount == 1)
        {
            output.append(matchingChars[0]);
            
            output.append(" is the only matching character.");
        }
        else
        {
            output.append("Matching chars are the following boo yah: ");
            for (int i = 0; i < matchingCharCount; i++)
            {
                output.append(matchingChars[i]);

                if (i < matchingCharCount - 2)
                {
                    output.append(" ");
                }
                else if (i < matchingCharCount - 1)
                {
                    output.append(" and ");
                }
                
            }
        }
        
        System.out.println(output);
    }
    
}
