/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankaccount;

/**
 *
 * @author PolinaYoga
 */
  public class CheckingAccount extends BankAccount {
       private static final double FEE = 0.15;
       public CheckingAccount(String name, double amount){
         super(name, amount);
         String accountNumber = this.getAccountNumber(); // access method местная переменная, которая дает значение номера счета из супер класса
         setAccountNumber(accountNumber + "-10");  // mutator method
    }
       
   @Override    
   public boolean withdraw(double amount){
           return super.withdraw(amount + FEE);
    }   
}
