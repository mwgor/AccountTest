/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package accounttest;

/**
 *   
 * @author Michael
 */
// Inputting and outputting floating-point numbers with Account objects.
import java.util.Scanner;

public class AccountTest
{
   // main method begins execution of Java application
   public static void main( String[] args ) 
   {
      Account account1 = new Account( 50.00 ); // create Account object
      Account account2 = new Account( -7.53 ); // create Account object

      // display initial balance of each object
      System.out.printf( "account1 balance: $%.2f\n", 
         account1.getBalance() );
      System.out.printf( "account2 balance: $%.2f\n\n", 
         account2.getBalance() );
      
      // create Scanner to obtain input from command window
      Scanner input = new Scanner( System.in );
      double deductAmount; // deposit amount read from user

      System.out.println( "Enter debit amount for account1: " ); // prompt
      deductAmount = input.nextDouble(); // obtain user input
      System.out.printf( "\ndeduct %.2f to account1 balance\n\n", 
         deductAmount );
      account1.debit( deductAmount ); // deduct account1 balance

      // display balances
      System.out.printf( "account1 balance: $%.2f\n", 
         account1.getBalance() );
      System.out.printf( "account2 balance: $%.2f\n\n", 
         account2.getBalance() );

      System.out.print( "Enter debit amount for account2: " ); // prompt
      deductAmount = input.nextDouble(); // obtain user input
      System.out.printf( "\ndeduct %.2f to account2 balance\n\n", 
         deductAmount );
      account2.debit( deductAmount ); // add to account2 balance

      // display balances
      System.out.printf( "account1 balance: $%.2f\n", 
         account1.getBalance() );
      System.out.printf( "account2 balance: $%.2f\n", 
         account2.getBalance() );
   } // end main
} // end class AccountTest

