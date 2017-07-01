/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankaccount;

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
        Account savings = new Account(1,'T', "green", 74742, 204660);
        Account current = new Account(2,'H', "blue", 3639, 601516);
        System.out.println(savings.toString() + "\n" + "\n" + current.toString());
    }
    
}
