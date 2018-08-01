/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sportscalculator;

/**
 *
 * @author PolinaYoga
 */
public class Team 
{
    // define some instance variables
    int wins;
    int losses;
    
    /**
    * This method calculates winning percentage.
    * @param w the number of wins
    * @param l the number of losses
    * @return percentage of total games that were won
    * */
    
    public double getWinningProcentage(int w, int l){
        double winningProcentage = (double) w / (w + l); // the same return w / (w + 1);
        return winningProcentage;
    }

}

