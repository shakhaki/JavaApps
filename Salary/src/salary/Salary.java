package salary;
import java.util.Scanner;
/**
 ** @author Justin Lee
 */
public class Salary 
{
    public static void main(String[] args) 
    {
        double WeeklyHours;
        double OverTimeHours;
        double PayRate;
        
        Scanner RegularHours = new Scanner(System.in);
        System.out.println("How many regular hours did you work? >> ");
        WeeklyHours = RegularHours.nextInt();
        
        Scanner OverTime = new Scanner(System.in);
        System.out.println("How many overtime hours did you work? >> ");
        OverTimeHours = OverTime.nextInt();
        
        Scanner HourlyPay = new Scanner(System.in);
        System.out.println("What is your hourly payrate? >> ");
        PayRate = HourlyPay.nextInt();
        
        CalculatedPay(WeeklyHours, OverTimeHours, PayRate);
    }
    public static void CalculatedPay(double WeeklyHours, double OverTimeHours, double PayRate)
    {
        double HourlyPay;
        double OverTime;
        double RegularHours;
        
        HourlyPay = PayRate;
        OverTime = OverTimeHours;
        RegularHours = WeeklyHours;
        
        double RegularPayTotal = RegularHours * HourlyPay;
        final double OverTimeValue = 1.5 * HourlyPay;
        
        
        double PayCheck = OverTimeValue * RegularHours + RegularPayTotal;
        System.out.println("Your total pay for this payperiod is " + PayCheck);
    }
    
}
