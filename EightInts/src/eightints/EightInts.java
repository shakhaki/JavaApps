/*
 * Justin Lee
 * IS 4415
 */
package eightints;
import java.util.Arrays;
import java.util.Random;

public class EightInts {

    public static void main(String[] args) 
    {
        int[] eightArray = new int[8];
        Random rand = new Random();
        
        int i;
        for(i = 0; i < eightArray.length; i++)
        {
            eightArray[i] = rand.nextInt(100);
        }
    Arrays.sort(eightArray);
    System.out.println(Arrays.toString(eightArray));
    for (i = eightArray.length - 1; i >= 0; i--)
    {
        System.out.print(eightArray[i] + ", ");
    }
    
    
    }
    
}
