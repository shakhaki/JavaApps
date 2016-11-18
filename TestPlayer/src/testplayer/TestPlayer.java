/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testplayer;

/**
 *
 * @author Admin
 */
public class TestPlayer {

    public static void main(String[] args) 
    {
    BaseballPlayer aCatcher = new BaseballPlayer(12, .218);
    BaseballPlayer aShortstop = new BaseballPlayer(31, .385);
    BaseballPlayer abc = new BaseballPlayer(5,0.789);
    
    aCatcher.showPlayer();
    aShortstop.showPlayer();
    }
    
}
