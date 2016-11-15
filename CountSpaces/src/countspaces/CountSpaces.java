/*
 * Justin Lee
 * IS 4415
 */

package countspaces;

public class CountSpaces 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
       String aString = 
          "The person who says something is impossible should not interrupt the person who is doing it.";
       int numSpaces = 0;
       int stringLength = aString.length();
       
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
