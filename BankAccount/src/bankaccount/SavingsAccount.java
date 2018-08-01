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
public class SavingsAccount extends BankAccount {
    private double rate = .025;
    private int savingsNumber = 0;
    private String accountNumber;
    
    public SavingsAccount(String name, double amount){
        super(name, amount);
         this.accountNumber = this.getAccountNumber(); 
         setAccountNumber(this.accountNumber + "-" + this.savingsNumber);
        
    }
    
    public SavingsAccount(SavingsAccount oldAccount, double amount){
        super(oldAccount, amount);
        this.savingsNumber++; //assign the savingsNumber to be one more than the savingsNumber of the original savings account.
        this.accountNumber = this.getAccountNumber(); 
        setAccountNumber(this.accountNumber + "-" + this.savingsNumber); //It should assign the accountNumber to be the
//accountNumber of the superclass concatenated with the hyphen and the
//savingsNumber of the new account
    }
    
    public void postInterest(){
       double balance = this.getBalance(); // accessor
       double monthlyIncome = balance * rate / 12;
       this.deposit(monthlyIncome);
    }
    
    //Write a method that overrides the getAccountNumber method in the superclass
    @Override
    public String getAccountNumber(){
        return super.getAccountNumber();
    }
    
}
