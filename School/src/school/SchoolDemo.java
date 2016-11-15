/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package school;

/**
 *
 * @author Admin
 */
public class SchoolDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        School mySchool = new School("Audubon Elementary","Salt Lake City", 84111, 22);
        School yourSchool = new School("UofU", "500 Wakara Way", 84112, 20000);
        mySchool.display();
        yourSchool.display();
    }
   
}
