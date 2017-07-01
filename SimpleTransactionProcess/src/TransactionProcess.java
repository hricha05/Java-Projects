
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author harun
 */
public class TransactionProcess {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Initialize User Input
        Scanner in = new Scanner(System.in);
      
        //list variables
        double balance;
        double transferBalance;
        String printToConsole;
         //Initialize variables
        balance = 0;
        transferBalance = 0;        
        printToConsole = "Enter the amount you would like to ";
        
            //Increase balance by user input
            System.out.println(printToConsole + "deposit: £");
            double amount;
            amount = in.nextDouble();
            balance += amount;
            //Compute deposit
            if((amount <= 0) || (amount <5)){
                System.out.println("Enter an amount greater than £5");
                amount = in.nextDouble();
                balance += balance;
            } else if(amount >= 5){
                System.out.println("Balance: £" + balance);              
            } else{ //reject negative balance
                    System.out.println("Account Overdrawn");
           } 
            //Add the decision to deposit or to transfer
            
            //Withdraw a given amount
            System.out.println("Enter the amount you would like to withdraw: ");
            double withdrawal;
            withdrawal = in.nextDouble();
            if(balance < withdrawal){
                while(balance < withdrawal)
                {
                    System.out.println("Insufficient funds");
                    System.out.println("Your avaliable balance is £" + balance);
                    System.out.println("Enter the amount you would like to withdraw: £");
                    withdrawal = in.nextDouble();    
                }
            }
            balance -= withdrawal;
            System.out.println("Your new balance is: " + "£" + balance);
            
            //Send given amount to new balance
            System.out.println("Enter the amount you would like to transfer: £");
            double transferAmount;
            transferAmount = in.nextDouble();
            if(balance < transferAmount)
            {
                System.out.println("Insufficient funds");
            } else {
                System.out.println("Enter the amount you would like to transfer: £");
                transferAmount = in.nextDouble();
                transferBalance += transferAmount;
                System.out.println("You have transfered: " + "£" + transferBalance);
                //Print Remaining balance
                System.out.println("Account balance: " + "£" + balance);
                
                //Print balance to be transfered
                //System.out.println("Transfer balance: " + "£" + transferBalance);
            }
    }
    
}
