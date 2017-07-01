
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
        
            //Increase balance by user input
            System.out.println(printToConsole + "deposit: £");
            double deposit;
            deposit = in.nextDouble();
            balance += deposit;
            //Compute deposit
            if((deposit <= 0) || (deposit <5)){
                System.out.println("Enter an amount greater than £5");
                deposit = in.nextDouble();
                balance += deposit;
            } else if(deposit >= 5){
                System.out.println("Balance: £" + balance);              
            } else{ //reject negative balance
                    System.out.println("Account Overdrawn");
           } 
            //Add the decision to deposit or to transfer
            
            //Withdraw a given amount
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
            
            //Send given amount to new balance
            double transferAmount;
                transferAmount = in.nextDouble();
            if(transferAmount > balance)
            {
                System.out.println("Insufficient funds");
            } else {
                System.out.println("You have transfered: " + "£" + transferBalance);
                System.out.println(printToConsole + "transfer: £");
                transferAmount = in.nextDouble();
                transferBalance += transferAmount;
                //Print Remaining balance
                System.out.println("Account balance: " + "£" + balance);
                
                //Print balance to be transfered
                //System.out.println("Transfer balance: " + "£" + transferBalance);
            }
    }
    
}
