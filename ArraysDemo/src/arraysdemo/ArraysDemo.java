/*
 * Justin Lee
 * IS 4415
 */
package arraysdemo;
import java.util.*;
public class ArraysDemo {

    public static void main(String[] args) 
    {
        int[] myScores = new int [5];
        display("Original array:              \n", myScores);
        Arrays.fill(myScores, 8);
        display("After filling with 8's:      \n", myScores);
        myScores[2] = 6;
        myScores[4] = 3;
        display("After changing two values:   \n", myScores);
        Arrays.sort(myScores);
        display("After sorting:               \n", myScores);
    }
    public static void display(String message, int array[])
    {
        int sz = array.length;
        System.out.print(message);
        for(int x = 0; x < sz; ++x)
        {
            System.out.print(array[x] + " ");
        System.out.println();
        }
    }
}
