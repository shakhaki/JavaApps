/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formletterwriter;

/**
 *author Justin Lee
 *class IS 4415
 * 10/23/2016
 */
public class displaySalutation
{
    
    private String lastName;
    private String firstName;

    
    public displaySalutation(String lastname)
    {
        String lastName = lastname;
        System.out.println("Dear Mr. or Ms. " + lastName);        
    }
    public displaySalutation(String firstName, String lastName)
    {
        String FirstName = firstName;
        String LastName = lastName;
        
        System.out.println("Dear " + firstName + " " + lastName + 
                        "\nThank you for your recent order.");
        
    }
    
}
