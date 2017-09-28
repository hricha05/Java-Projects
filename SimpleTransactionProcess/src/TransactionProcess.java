import java.util.Scanner;
/**
 *Simple program replicating an ATM
 * An account balance is read from the Scanner
 * The user then as the option of either making a deposit, withdrawal or
 * transferring funds to a different account.
 * 
 * @author Harun Richards
 * @version 1.2
 */
public class TransactionProcess {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Variables
        Scanner in = new Scanner(System.in);
        double balance;
        double transferBalance;
        String printToConsole;
         //Initialize variables
        balance = 0;
        transferBalance = 0;        
        printToConsole = "Enter the amount you would like to ";
        
        //display user balance
        System.out.println("Your current balance is: £" + balance);
        
        //
            //Increase balance by user input
            System.out.println(printToConsole + "deposit: ");
            double amount;
            amount = in.nextDouble();
            balance += amount;
            //Compute deposit
            if((amount <= 0) || (amount <5)){
                System.out.println("Enter an amount greater than £5");
                amount = in.nextDouble();
                balance += amount;
            } else if(amount >= 5){
                System.out.println("Balance: £" + balance);              
            } else{ //reject negative balance
                    System.out.println("Account Overdrawn");
           } 
            //Add the decision to deposit or to transfer
            /**
             *  deposit = true;
                if(deposit != true){
                System.out.println(printToConsole + "withdraw: ");
                double withdrawal;
                withdrawal = in.nextDouble();
                if(balance < withdrawal){
                    while(balance < withdrawal)
                    {
                        System.out.println("Insufficient funds");
                        System.out.println("Your avaliable balance is £" + balance);
                        System.out.println(printToConsole + "withdraw: £");
                        withdrawal = in.nextDouble();    
                    }
                }
                balance -= withdrawal;
                System.out.println("Your new balance is: " + "£" + balance);
            }*/  
            //Withdraw a given amount
           
            System.out.println(printToConsole + "withdraw: ");
            double withdrawal;
            withdrawal = in.nextDouble();
            if(balance < withdrawal){
             while(balance < withdrawal)
                {
                    System.out.println("Insufficient funds");
                    System.out.println("Your avaliable balance is £" + balance);
                    System.out.println(printToConsole + "withdraw: ");
                    withdrawal = in.nextDouble();    
                }
            }
            balance -= withdrawal;
            System.out.println("Your new balance is: " + "£" + balance);
            
            //Send given amount to new balance
            System.out.println(printToConsole + "transfer: ");
            double transferAmount;
            transferAmount = in.nextDouble();
            if(balance < transferAmount){
                while(balance < transferAmount)
                {
                    System.out.println("Insufficient funds");
                    System.out.println("Your avaliable balance is £" + balance);
                    System.out.println(printToConsole + "transfer: ");
                    transferAmount = in.nextDouble();
                } 
            }
                transferBalance += transferAmount;
                System.out.println("You have transfered: " + "£" + transferBalance);
                
                //Print Remaining balance
                System.out.println("Account balance: " + "£" + balance);
                
                //Print balance to be transfered
                //System.out.println("Transfer balance: " + "£" + transferBalance);
            }
    }
