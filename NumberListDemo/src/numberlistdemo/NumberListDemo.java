/*
 * Justin Lee
 * IS 4415
 */
package numberlistdemo;
import java.util.Arrays;
import java.util.Random;

public class NumberListDemo {

    public static void main(String[] args) 
    {
        int[] eightArray = new int[8];
        Random rand = new Random();
        int addedNumbers = 0;
        int lessThan = 0;
        int i;
        
        for(i = 0; i < eightArray.length; i++)
        {
            eightArray[i] = rand.nextInt(100);
        }
    Arrays.sort(eightArray);
    System.out.println(Arrays.toString(eightArray));
    
        for (i = eightArray.length - 1; i >= 0; i--)
        {
            System.out.print(eightArray[i] + " ");
        }
    System.out.println("\nTotal of Array is: " + addedNumbers);
    
        for (i = 0; i < eightArray.length; i++)
        {
            addedNumbers += eightArray[i];
        }//end sum for loop
        
        for (i= 0; i < eightArray.length; i++)
        {
            if (eightArray[i] < 5)
            {
                System.out.println("Number(s) lower than 5 in the array are: " + eightArray[i]); 
            }
        }//end lower than loop
    
    
    System.out.println("The highest number in the array is " + eightArray[7]);
    System.out.println("The lowest number in the array is " + eightArray[0]);
    int average = addedNumbers/eightArray.length;
    System.out.println("The average of the array is: " + average);
    
    for (i= 0; i < eightArray.length; i++)
        {
            if (eightArray[i] > average)
            {
                System.out.println("Number(s) higher than the average in the array are: " + eightArray[i]); 
            }
        }//end lower than loop
    
    
    }
    
}
