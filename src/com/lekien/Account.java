package com.lekien;

public class Account {

    public String userName;
    public String passWord;
    String type;
    double balance;
    double rate;

    // The following methods are a combination of getter/setter methods as well
    // as two special deposit() and withdraw() methods

    void setType(String accType) {

        type = accType;
    }


    void deposit(double dep) {

        balance += dep; // Take the Account object's balance and add to it the current deposit
    }

    void withdraw(double wit) {

        balance -= wit; // Take the Account object's balance and subtract from it the current withdrawal
    }



    double getBalance() {

        return balance;
    }


    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }
}


