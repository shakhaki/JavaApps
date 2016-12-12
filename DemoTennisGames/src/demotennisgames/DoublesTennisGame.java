/*
 * Justin Lee
 * IS 4415
 */
package demotennisgames;

public class DoublesTennisGame extends TennisGame
{
    private String playerOnePartner;
    private String playerTwoPartner;
    
    public String getNameOne()
    {
        return playerOnePartner;
    }
    public String getNameTwo()
    {
        return playerTwoPartner;
    }
    
    public void setNames(String pOne, String pTwo, String pThree, String pFour)
    {
        super.setNames(pOne, pTwo);
        {
        playerOnePartner = pThree;
        playerTwoPartner = pFour;
        }
        playerOnePartner = pThree;
        playerTwoPartner = pFour;
    }
}
