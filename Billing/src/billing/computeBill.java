package billing;
/**
 * @author Justin Lee
 * IS 4415
 */
public class computeBill {
    
    private int photobookPrice;
    private int quantity;
    private int couponValue;

    public  computeBill(int price)
    {
        int photobookPrice = price;
        double salesTax = 1.08;
        double totalDue; 
        totalDue = photobookPrice * salesTax;
        System.out.println("The total amount due is: " + totalDue);
    }
    public computeBill(int price, int quantityOrdered)
    {        
        int photobookPrice = price;
        int quantity = quantityOrdered;
        
        double salesTax = 1.08;
        double totalDue;
        totalDue = photobookPrice * quantity * salesTax;
        System.out.println("The total amount due is: " + totalDue);
    }
    public computeBill(int price, int quantityOrdered, int coupon)
    {
        int photobookPrice = price;
        int quantity = quantityOrdered;
        int couponValue = coupon;
        
        double salesTax = 1.08;
        double totalDue;
        double SubTotalDue = (price * quantity) - couponValue;
        totalDue = salesTax * SubTotalDue;
        System.out.println("The total due is: " + totalDue);
    }
}