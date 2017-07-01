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
    private int accountId;
    private char accountType;
    private String accountName;
    private double accountNumber;
    private int sortCode;
    private double balance;
    
    public Account(int accountId, char accountType, String accountName){
        this.accountId = accountId;
        this.accountType = accountType;
        this.accountName = accountName;
        accountNumber = 0;
        sortCode = 0;
        balance = 0;
    }
    public Account(int accountId, char accountType, String accountName, double acountNumber, int sortCode){
        this.accountId = accountId;
        this.accountType = accountType;
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
}
