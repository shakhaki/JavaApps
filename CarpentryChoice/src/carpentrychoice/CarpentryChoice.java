/*
 * Justin Lee
 * IS 4415
 */
package carpentrychoice;
import javax.swing.JOptionPane;

public class CarpentryChoice 
{

    public static void main(String[] args) 
    {
        boolean isMatch = false;
        String[] items = {"Table", "Desk", "Dresser", "Entertainment Center"};
        int[] prices = {250, 325, 420, 600};
        int x;
        int matchIndex = 0;
        String menu = "Enter Selection: ";
        for(x=0; x< items.length; ++x)
        
            menu += "\n " + items[x];
        String selection = JOptionPane.showInputDialog(null, menu);  
        
        
        for(x = 0; x < items.length; x++)
        {
            if(selection.equals(items[x]))
            {
                isMatch = true;
                matchIndex = x;
            }
        }
        if(isMatch)
        {
            JOptionPane.showMessageDialog(null, "The price is " + prices[matchIndex]);
         
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Invalid Selection");
        }
    }   
}
