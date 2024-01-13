package oopEx;

public class Account {
    int balance = 0;

    void desposit(int amount) {balance += amount;}
    void withdraw(int amount){
        if(amount > balance){
            System.out.println("잔액이 부족합니다");
            System.out.println("잔고: "+ balance);
        }
        else
            balance -= amount;
    }
}
