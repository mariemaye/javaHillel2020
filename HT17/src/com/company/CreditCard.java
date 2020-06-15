package com.company;

import java.util.TreeMap;

public class CreditCard implements Runnable {
    private double balance = 500;

    public double getBalance() {
        return balance;

    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getLimit() {
        return -500;
    }

    void operations(double sum) {
        if (sum > 0) {
            setBalance(getBalance() + sum);
            System.out.println(Thread.currentThread().getName() + " is putting on the account " + sum + " grn. The balance is " + getBalance());
        }
        if (sum < 0 && (getBalance() + sum) < getLimit()) {
            System.out.println(Thread.currentThread().getName() + " The operation is over credit limit " + ((-1) * (getLimit() - getBalance())));
        } else if (sum < 0 && (getBalance() + sum) > getLimit()) {
            setBalance(getBalance() + sum);
            System.out.println(Thread.currentThread().getName() + " is taking away " + sum + "grn. The balance " + getBalance());
        }
    }

    @Override
    public void run() {
        System.out.println("Initial balance on the card is  " + getBalance());
        if (Thread.currentThread().getName().equals("Masha")) {
            for (int i = 0; i < 11; i++) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                operations(60);

            }
        }
        else if(Thread.currentThread().getName().equals("Natasha")){
            for (int i = 0; i <11; i++){
                try {
                    Thread.sleep(1000);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
            }

        }
        else System.out.println("There is no such person");
    }
}