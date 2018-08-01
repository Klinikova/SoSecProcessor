/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author PolinaYoga
 */
public class CreditCard {
    
    private Money balance;
    private Money creditLimit;
    private Person owner;
    
    public CreditCard(Person newCardHolder, Money limit)
    {
        Money newBalance = new Money(0);
        Money newLimit = new Money(limit);
 
    }
    
    public Money getBalance()
    {
        Money copyBalance = new Money(balance);
        return copyBalance;
    }
    
    public Money getCreditLimit()
    {
        Money copyLimit = new Money(creditLimit);
        return copyLimit;
    }
    
    public String getPersonals()
    {
        return owner.toString();
    }
    
    public void charge(Money amount)
    {
       Money copyBalance = getBalance(); // вызвали метод getBalance, чтобы получить копию оригинального баланса
       Money copyLimit = getCreditLimit(); 
       Money newBalance = copyBalance.add(amount); // новый баланс полученный из копии оригинального баланса
       int difference = newBalance.compareTo(copyLimit);
       
       if(difference >= 0)
       {
           balance.add(amount);
       }
       else
       {
          System.out.println("Error: Negative amounts " +
                            "of money are not allowed.");
       }
    }
        
    public void payment(Money amount)
    {
        balance.subtract(amount);
    }
    
   
    
}
