/**
 * Class Main untuk menjalankan program
 * 
 * @author Group 10 - Pemrograman Berorientasi Objek 02
 * @version 02/06/2021
 */
public class Main {
     /**
      * Main method dari program
      * 
      * @param args Arguments
      */
     public static void main(String[] args) {
          SavingsAccount savingsAccount = new SavingsAccount(1000);
          System.out.println("Balance : " + savingsAccount.toString());
          Thread t1 = new Thread(new RunnableDeposit(savingsAccount, 500));
          Thread t2 = new Thread(new RunnableWithdraw(savingsAccount, 100));
          t1.start();
          t2.start();
     }
}

/**
 * Class Deposit Runnable untuk menjalankan Thread dengan menggunakan Runnable
 * untuk metode deposit
 */
class RunnableDeposit implements Runnable {
     private SavingsAccount savingsAccount;
     private float deposit;

     RunnableDeposit(SavingsAccount savingsAccount, float deposit) {
          this.savingsAccount = savingsAccount;
          this.deposit = deposit;
     }

     /**
      * State Thread run
      */
     @Override
     public void run() {
          for (int i = 0; i < 9999; i++) {
          }
          savingsAccount.deposit(deposit);
          System.out.println("After Deposit : " + savingsAccount.toString());
     }
}

/**
 * Class Withdraw Runnable untuk menjalankan Thread dengan menggunakan Runnable
 * untuk metode withdraw
 */
class RunnableWithdraw implements Runnable {
     private SavingsAccount savingsAccount;
     private float withdraw;

     RunnableWithdraw(SavingsAccount savingsAccount, float withdraw) {
          this.savingsAccount = savingsAccount;
          this.withdraw = withdraw;
     }

     /**
      * State Thread run
      */
     @Override
     public void run() {
          for (int i = 0; i < 9999; i++) {
          }
          savingsAccount.withdraw(withdraw);
          System.out.println("After withdraw : " + savingsAccount.toString());

     }

}