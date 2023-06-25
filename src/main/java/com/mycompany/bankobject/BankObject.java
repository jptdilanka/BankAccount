package com.mycompany.bankobject;
public class BankObject 
{
    public static void main(String[] args) 
    {
        SavingAccount s1=new SavingAccount();
        s1.setBalance(2000000.00);
        System.out.println("Interest for saving account= "+s1.calculateInterest());
        
        SavingAccount c1=new SavingAccount();
        c1.setBalance(1000000.00);
        System.out.println("Interest for checking account= "+c1.calculateInterest());
    }
}
