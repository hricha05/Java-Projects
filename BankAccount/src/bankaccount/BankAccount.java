/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankaccount;

import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author harun
 */
public class BankAccount {
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter your account  ");
        Account c1 = new Account();
        c1.setAccountName("Harun Richards");
    }
}
