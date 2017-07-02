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
        System.out.println("Please enter your account details ");
        Account c1 = new Account(   in.nextInt(), 
                                    in.nextInt(), 
                                    in.next(), 
                                    in.nextInt(), 
                                    in.nextInt()
                                );
        System.out.println("Please enter your account details " + c1.setAccountName("Harun"));
        System.out.println(c1.toString());
    }
}
