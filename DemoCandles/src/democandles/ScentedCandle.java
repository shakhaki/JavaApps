/*
 * Justin Lee
 * IS 4415
 */
package democandles;

public final class ScentedCandle extends Candle 
{
    private String scent;
    
    public void setScent(String s)
    {
        scent = s;
    }
    public String getScent()
    {
        return this.scent;
    }

    @Override
    public Integer getPrice()
    {
        if(height == null)
        {
            return null;
        }
        
        return 3 * height;
    }
    
}
