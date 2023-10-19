package com.xworkz.bankapp.canara;

public class BankAccount {

        private double balance;

    public double getBalance() {
        return balance;
    }

    public void  debit(int amount){
            if(amount<=balance)//implicit casting (int convert to double)
                balance= balance-amount;

            System.out.println("Amount is debited. Avlbalance is:"+balance);


        }

        public void credit(int amount){
            this.balance=balance+amount;
            System.out.println("Amount is credeted. Avl balance is:"+this.balance);

        }

        public void transfer(int amount, BankAccount beneficiary){
            this.debit(amount);
            beneficiary.credit(amount);
            /*if(amount<=balance){
                System.out.println("insuficeint fund");
            }*/
        }
    }


