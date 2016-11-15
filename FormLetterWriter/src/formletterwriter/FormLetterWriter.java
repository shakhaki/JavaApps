/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formletterwriter;

/**
 *
 * @author Admin
 */
public class FormLetterWriter
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        displaySalutation UserOne = new displaySalutation("Underwood");
        displaySalutation UserTwo = new displaySalutation("Stevie", "Wonder");
    }
    
    
}
