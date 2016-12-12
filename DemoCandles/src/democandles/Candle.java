package democandles;

/*
 * Justin Lee
 * IS 4415
 */

public class Candle 
{
    private String color;
    Integer height;
    //private int price;

    public String getColor()
    {
        return color;
    }    
    public Integer getHeight()
    {
        return height;
    }
    public Integer getPrice()
    {
        if(height == null) 
       {
           return null;
       }
       return height * 2;       
    }
    public void setColor(String c)
    {
        color = c;
    }
    public void setHeight(Integer h)
    {
        height = h;
    }
    /*public int setPrice(int p)
    {
       if(height == null) 
       {
           System.out.println("Enter the height of the candle");
       }
       else 
       {
           setPrice(2);
       }
       return p;
    }*/
}

