/*
 * Justin Lee
 * IS 4415
 */
package demotennisgames;

public class TennisGame 
{
    private String playerOne;
    private String playerTwo;
    private Integer playerOneScore;
    private Integer playerTwoScore;
    private String totalScoreOne;
    private String totalScoreTwo;

    public String getPlayerOne()
    {
        return playerOne;
    }
    public String getPlayerTwo()
    {
        return playerTwo;
    }
    public int getPlayerOneScore()
    {
        return playerOneScore;
    }
    public int getPlayerTwoScore()
    {
        return playerTwoScore;
    }
    public String getTotalScoreOne()
    {
        return totalScoreOne;
    }
    public String getTotalScoreTwo()
    {
        return totalScoreTwo;
    }
    public void setNames(String One, String Two)
    {
        playerOne = One;
        playerTwo = Two;
    }
    public void setPlayerScores(Integer ScoreOne, Integer ScoreTwo)
    {
        playerOneScore = ScoreOne;
        playerTwoScore = ScoreTwo;
        
        if(playerOneScore > 4 || playerOneScore < 0 || playerTwoScore > 4 || playerTwoScore < 0)
        {
            playerOneScore = 0;
            playerTwoScore = 0;
        }
        if(playerOneScore != 4 && playerTwoScore != 4)
        {
            playerOneScore = 0;
            playerTwoScore = 0;
        }
        if(playerOneScore == 0 && playerTwoScore == 0)
        {
            System.out.println("Error");
        }
    }
    
}
