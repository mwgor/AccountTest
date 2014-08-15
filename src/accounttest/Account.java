
package accounttest;

/**CIS43         6/7/14
 *
 * @author Michael Gor
 */

public class Account
{   
   private double balance; // instance variable that stores the balance

   // constructor  
   public Account( double initialBalance )
   {
      // validate that initialBalance is greater than 0.0; 
      // if it is not, balance is initialized to the default value 0.0
      if ( initialBalance > 0.0 ) 
         balance = initialBalance; 
   } // end Account constructor

   // credit (add) an amount to the account
   public void credit( double amount )
   {      
      balance = balance + amount; // add amount to balance 
   } // end method credit
   
   // credit (add) an amount to the account
   public void debit( double amount )
   {      
      if (amount <= balance)
         balance -= amount; // deduct
      else
         System.out.println( "Debit amount exceeded account balance.");
      
   } // end debit

   // return the account balance
   public double getBalance()
   {
      return balance; // gives the value of balance to the calling method
   } // end method getBalance
} // end class Account