/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package rosario.practices.practice_09_EncapConstructors_2.soccer;

/**
 *
 * @author rosario
 */
public class Player {
    
    private String playerName;
    
    /*Add the constructor*/
    public Player(String playerName){
        this.playerName = playerName;
    }
    
    /**
     * @return the playerName
     */
    public String getPlayerName() {
        return playerName;
    }

    /**
     * @param playerName the playerName to set
     */
    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }
    
}
