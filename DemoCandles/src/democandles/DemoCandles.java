/*
 * Justin Lee
 * IS 4415
 */
package democandles;

public class DemoCandles {

    public static void main(String[] args) 
    {
        Candle Candle1 = new Candle();
        ScentedCandle Candle2 = new ScentedCandle();
        ScentedCandle Candle3 = new ScentedCandle();
        
        Candle1.setColor("White");
        Candle1.setHeight(2);
        
        Candle2.setScent("Rose");
        Candle2.setColor("Red");
        Candle2.setHeight(3);
        
        Candle3.setColor("Blue");
        
        
        System.out.println("Your unscented candle is " + Candle1.getColor() + ","
                        + " " + Candle1.getHeight() + " inches tall; costing " + Candle1.getPrice() + " dollars.");
        System.out.println("Your scented candle is " + Candle2.getColor() + " colored, " + Candle2.getScent() + 
                        " scented, and " + Candle2.getHeight() + " inches tall; costing " + Candle2.getPrice() + " dollars.");
        System.out.println("Your scented candle is " + Candle3.getColor() + " colored, " + Candle3.getScent() + 
                        " scented, and " + Candle3.getHeight() + " inches tall; costing " + Candle3.getPrice() + " dollars.");
        
        
    }
    
}
