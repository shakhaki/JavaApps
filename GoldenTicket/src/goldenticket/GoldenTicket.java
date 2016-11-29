/*
 * Justin Lee
 * IS 4415
 */
package goldenticket;
import javax.swing.JOptionPane;
public class GoldenTicket {

  
    public static void main(String[] args) 
    {
        String firstName;
        String lastName;
        String semester;
        String subject;
        int degree;
        firstName = JOptionPane.showInputDialog(null,"Please enter First Name");
        lastName = JOptionPane.showInputDialog(null,"Please enter Last Name");
        semester = JOptionPane.showInputDialog(null,"Please enter semester");
        subject = JOptionPane.showInputDialog(null,"Please enter subject");
        degree = Integer.parseInt(JOptionPane.showInputDialog(null,"Please insert 1 for undergrad. Please"
                            + "insert 2 for Masters"));
        UofU_GoldenTicket GoldenTicket1 = new UofU_GoldenTicket(firstName,lastName,semester,subject,degree);

          GoldenTicket1.display();
    }
    
}
