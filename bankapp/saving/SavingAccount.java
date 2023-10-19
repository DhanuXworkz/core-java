package com.xworkz.bankapp.saving;

import com.xworkz.bankapp.canara.BankAccount;

public class SavingAccount extends BankAccount {

    double rateOfIntrest=3.8;

    public SavingAccount(){
        

    }
    public SavingAccount( double minimumBalance){

    }
    public void calculateIntrest(){
        double totalBalance=(rateOfIntrest*getBalance())/100;

        System.out.println("intrest is:"+totalBalance);
    }
}
