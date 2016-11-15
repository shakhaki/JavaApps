/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package billing;

/**
 *
 * @author Admin
 */
public class Billing {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
       computeBill OrderOne = new computeBill(15);
       computeBill OrderTwo = new computeBill(15, 2);
       computeBill OrderThree = new computeBill(15,2,1);
    }
    
}
