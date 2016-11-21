/*
 * Justin Lee
 * IS 4415
 * Prompt user for 3 first names
 * concatenate names in all two name combos
 */
package babynamecomparison;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class BabyNameComparison {

    public static void main(String[] args) 
    {
        Scanner keyboard = new Scanner(System.in);
        //System.out.println("What 3 names are you interested in for your child? ");
        
        String nameOne = JOptionPane.showInputDialog(null, "Enter the a first name you're interested in for your baby! ");
        String firstName = String.valueOf(nameOne);
        
        String nameTwo = JOptionPane.showInputDialog(null, "Enter the a first name you're interested in for your baby! ");
        String secondName = String.valueOf(nameTwo);
        
        String nameThree = JOptionPane.showInputDialog(null, "Enter the a first name you're interested in for your baby! ");
        String thirdName = String.valueOf(nameThree);
        
        System.out.println(firstName + " " +secondName);
        System.out.println(firstName + " " + thirdName);
        System.out.println(secondName + " " + firstName);
        System.out.println(secondName + " " + thirdName);
        System.out.println(thirdName + " " + firstName);
        System.out.println(thirdName + " " + secondName);
    }
    
}
