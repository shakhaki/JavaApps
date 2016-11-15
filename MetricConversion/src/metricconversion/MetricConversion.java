/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metricconversion;

import java.util.Scanner;

/**
 *Class IS 4415
 * @author Justin Lee
 */
public class MetricConversion 
{
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
    int aValue;
    Scanner anInput = new Scanner(System.in);
    System.out.println("Enter an integer >> ");
    aValue = anInput.nextInt();
    double myResult = convertToCentimeters(aValue);
    System.out.println(myResult);
    convertToLiters(aValue);
    }
    //3b 4b accepting value
    
    public static double convertToCentimeters(int inches)
    {
        double centimeters;
        final double CENT_FACTOR = 2.54;
        centimeters = inches * CENT_FACTOR;
        //System.out.println(inches + " inches is " + centimeters + " centimeters");     
        return centimeters;
    }
    
    public static void convertToLiters(int gallons)
    {
        double liters;
        final double LITER_FACTOR = 3.7854;
        liters = gallons * LITER_FACTOR;
        System.out.println(gallons + " gallons is " + liters + " liters");        
    }
}

