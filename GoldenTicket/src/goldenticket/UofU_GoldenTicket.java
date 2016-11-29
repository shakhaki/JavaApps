/*
 * Justin Lee
 * IS 4415
 */
package goldenticket;
import javax.swing.JOptionPane;

class UofU_GoldenTicket 
{
    private String First_Name;
    private String Last_Name;
    private String Semester;
    private String Subject;
    private int Degree;
    private double Tuition;
    final String UNI_NAME = "University of Utah";
    final String SCHOOL_NAME = "School of Business and Economics";
    
public UofU_GoldenTicket(String firstName,String lastName,String semester,  
                      String subject,int degree)
{
    First_Name = firstName;
    Last_Name = lastName;
    Semester = semester;
    Subject = subject;
    Degree = degree;
    
    if(Degree == 1)
    {
        Tuition = 1400;
    }
    else
    {
        Tuition = 2500;
    }
}
public void display()
{
    String Output;
    Output = "\t" + UNI_NAME + 
    "\n" + SCHOOL_NAME +
    "\n First Name: " + First_Name +
    "\n Last Name: " + Last_Name +
    "\n Semester: " + Semester +
    "\n Subject: " + Subject + 
    "\n Your total Tuition is: " + Tuition ;
    JOptionPane.showMessageDialog(null, Output);
}
}//end class