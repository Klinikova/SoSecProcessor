/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crate;

/**
 *
 * @author PolinaYoga
 */
public class Crate {
    //global constants
    final double COST = .33;
    final double PRICE = .50;
    // cost (to company):    .33 per cubic foot
    //Price (forcustomers):  .50 per cubic foot
    
    // instance variables
    
    double length;
    double width;
    double height;
    
    
    /**
     * 
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        
    }
    
    public void setLength(double l){
        length = l;
}
    public double getLength(){
        return = length;

}
    public void setWidth(double w){
        width = w;
}
    public double getWidth(){
        return = width;
}

    public void setHeight(double h){
        height = h;
}
    public double getHeight(){
        return = height;
}
    
    public double calculateVolume(){
    double volume;
    volume = getLenght() * getWidth() * getHeight();
        return = volume; // the same as return = getLengh() * getWidth() * getHeight();
}

    public double cost(){
        return COST * calculateVolume();
}
    public double price(){
        return PRICE * calculateVolume();
}
    
    public double profit(){
        return price() - cost();
}

    void setLength(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}