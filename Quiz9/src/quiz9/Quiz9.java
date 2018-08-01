/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz9;

/**
 *
 * @author PolinaYoga
 */
public class Quiz9 {

    private double score;
    private int numQuestions; // Number of questions
    private double pointsEach; // Points for each question
    private int numMissed; // Questions missed
    
    /**
     * the setScore method sets the score field.
     * @param s the value to store in store.
     */
    public Quiz9(int questions, int missed)
    {
        double numericScore;
    }
    
    numQuestions = questions;
    numMissed = missed;
    
    public void setScore(double s)
    {
        score = s;
    }
    
    /**
     * the getScore method return the score
     * @return the value stored in the score field
     */
    public double getScore()
    {
        return score;
    }
    
    /**
     * the getGrade method returns a letter grade determined from the score field
     * @return the letter grade
     */
    
    public char getGrade()
    {
        char letterGrade;
        if (score >= 90)
            letterGrade = 'A';
        else if (score >= 80)
            letterGrade = 'B';
        else if (score >= 70)
            letterGrade = 'C';
        else if (score >= 60)
            letterGrade = 'D';
        else 
            letterGrade = 'B';
        
        return letterGrade;
    }
}
