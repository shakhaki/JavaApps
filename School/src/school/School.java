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
class School 
{
private String Name;
private String Address;
private int Zip;
private int Enrollment;

    public School(String name, String address, int zip, int enrollment)
    {
        
        Name = name;
        Address = address;
        Zip = zip;
        Enrollment = enrollment;        
    }
    public void display()
    {
        System.out.println("The school information");
        System.out.println("Name:" + Name);
        System.out.println("Address: " + Address);
        System.out.println("Zip:" + Zip);
        System.out.println("Enrollment is: " + Enrollment);
    }
                    
    
    
}
