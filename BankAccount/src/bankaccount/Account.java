/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankaccount;

/**
 *
 * @author harun
 */
public class Account {
    int accountId;
    int accountType;
    String accountName;
    int accountNumber;
    int sortCode;
    double balance;
    
    public Account(int accountId, int accountType, String accountName){
        this.accountId = accountId;
        this.accountType = accountType;
        this.accountName = accountName;
        accountNumber = 0;
        sortCode = 0;
        balance = 0;
    }
    public Account(String accountName, int acountNumber, int sortCode){
        this.accountName = accountName;
        this.accountNumber = accountNumber;
        this.sortCode = sortCode;
        this.balance = balance;
            }
    public String toString(){
        return " Account_Id: " + accountId  +
                "\n Account_Type: " + accountType +
                "\n Account_Name: " + accountName +
                "\n Accounr_Number: " + accountNumber +
                "\n Sort_Code: " + sortCode +
                "\n Balance: £" + balance;      
    }
    public String setAccountName(String newAccountName){
        accountName = newAccountName;
        return newAccountName;
    }
   
    public int setAccountNumber(int newNumber){
        accountNumber = newNumber;
        return newNumber;
    }
    public static int setSortCode(int newCode){
       int sortCode = newCode;
        return newCode;
    }
    public static double setBalance(double newBalance){
        double balance = newBalance;
        return newBalance;
    }
}
