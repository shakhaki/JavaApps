package Scholarship;
import java.util.Scanner;

public class Scholarship2{
{
    Scanner keyboard = new Scanner(System.in);
    double Input;
    int Activity;
    int Service;
    int Extra;

public class ScholarshipCalculation(double input, int activity, int service, int extra)
{
    double Input = input;
    int Activity = activity;
    int Service = service;
    int Extra = extra;
    

    System.out.println("**WELCOME TO THE SCHOLARSHIP CANDIDATE SYSTEM!**");






    System.out.println("\n"
                    + "What is your GPA? ");
    Input = keyboard.nextDouble();
    System.out.println("How many extracurricular activities are you in? ");
    Extra = keyboard.nextInt();
    System.out.println("How many service activities have you participated in? ");
    Service = keyboard.nextInt();

    Activity = Extra + Service;

    if ((Input <= 0) | (Input > 4) | (Activity < 0) | (Service < 0))
    {
        System.out.println("Error, please enter a valid number");
    }
        if ((Input >= 3.8) && (Extra >= 1) && (Service >= 1))
        {
            System.out.println("Congratulations, you're a candidate!");
        }
        else if ((Input >= 3.4) && (Input <=3.8) && (Activity >= 3))
        {
            System.out.println("Congratulations, you're a candidate!");
        }
        else if ((Input >= 3.0) && (Input <=3.4) && (Activity >= 2) && (Service >= 3))
        {
            System.out.println("Congratulations, you're a candidate!");
        }
        else
        {
            System.out.println("Not a candidate");
        }
}//end class
}//end package class
