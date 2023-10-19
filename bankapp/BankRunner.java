package com.xworkz.bankapp;

import com.xworkz.bankapp.canara.BankAccount;
import com.xworkz.bankapp.saving.SavingAccount;

public class BankRunner {
    public static void main(String[] args) {
        BankAccount myAccount=new SavingAccount(10000);
        myAccount.credit(1000);
        myAccount.credit(3000);
        myAccount.debit(1000);

        SavingAccount mySavingAccount =(SavingAccount) myAccount;
        mySavingAccount.calculateIntrest();
        System.out.println("balance after the intrest"+mySavingAccount.getBalance());
        System.out.println("Balance in my account:"+myAccount.getBalance());

      /*  //casting - up polymorphisum
        SavingAccount friendAccount = new SavingAccount();
        friendAccount.credit(300);

        //BankAccount beneficiary =friendAccount
        myAccount.transfer(200,friendAccount);
        System.out.println("my account balance:"+myAccount.getBalance());
        System.out.println("Friend Acccont Balance:"+friendAccount.getBalance());

        SavingAccount momAccount =new SavingAccount();
        momAccount.credit(6000);

        myAccount.transfer(2000,momAccount);
        System.out.println("My Account Balance:"+myAccount.getBalance());
        System.out.println("Mom Account Balance:"+momAccount.getBalance());

        SavingAccount teaShop =new SavingAccount();
        teaShop.credit(4000);
        momAccount.transfer(60,teaShop);
       // myAccount.transfer(50,teaShop);
        System.out.println("My Account Balance:"+myAccount.getBalance());
        System.out.println("tea Shop Account Balance:"+teaShop.getBalance());


        SavingAccount hotel =new SavingAccount();
        hotel.credit(2000);
        myAccount.transfer(1000,hotel);
        System.out.println("My Account Balance:"+myAccount.getBalance());
        System.out.println("Hotel Account Balance:"+hotel.getBalance());

        SavingAccount chandu = new SavingAccount();
        chandu.credit(800);
        myAccount.transfer(800,chandu);
        System.out.println("My Account Balance:"+myAccount.getBalance());
        System.out.println("Chandu Account Balance:"+chandu.getBalance());


        SavingAccount pavan =new SavingAccount();
        pavan.credit(400);
        myAccount.transfer(60,pavan);
        System.out.println("My Account Balance:"+myAccount.getBalance());
        System.out.println("pavan Account Balance:"+pavan.getBalance());

        myAccount.credit(10000);

        SavingAccount chetu =new SavingAccount();
        chetu.credit(2000);
        myAccount.transfer(1000,chetu);
        System.out.println("My Account Balance:"+myAccount.getBalance());
        System.out.println("chetu Account Balance:"+chetu.getBalance());

        SavingAccount rocky =new SavingAccount();
        rocky.credit(2000);
        myAccount.transfer(500,rocky);
        System.out.println("My Account Balance:"+myAccount.getBalance());
        System.out.println("rocky Account Balance:"+rocky.getBalance());


        SavingAccount dream11 =new SavingAccount();
        dream11.credit(2000);
        myAccount.transfer(200,dream11);
        System.out.println("My Account Balance:"+myAccount.getBalance());
        System.out.println("Dream11 Account Balance:"+dream11.getBalance());

        SavingAccount xworkz = new SavingAccount();
        xworkz.credit(0);
        myAccount.transfer(25000,xworkz);
        System.out.println("My Account Balance:"+myAccount.getBalance());
        System.out.println("X-Workz Account Balance:"+xworkz.getBalance());


        SavingAccount dafaSports= new SavingAccount();
        dafaSports.credit(4000);
        myAccount.transfer(3000,dafaSports);
        System.out.println("My Account Balance:"+myAccount.getBalance());
        System.out.println("dafaSports Account Balance:"+dafaSports.getBalance());


        SavingAccount hotstar =new SavingAccount();
        hotstar.credit(0);
        myAccount.transfer(149,hotstar);
        System.out.println("My Account Balance:"+myAccount.getBalance());
        System.out.println("Hotstar Account Balance:"+hotstar.getBalance());*/


    }
}
