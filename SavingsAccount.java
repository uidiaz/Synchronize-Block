/**
 * Class Savings Account untuk melakukan operasi balance
 * @author Group 10 - Pemrograman Berorientasi Objek 02
 * @version 02/06/2021
 */
public class SavingsAccount {
    private float balance;

    public SavingsAccount(float balance)
    {
        this.balance = balance;
    }
    
    /** 
     * Method withdraw digunakan untuk mengambil 
     * atau mengurangi uang dari balance yang dimiliki
     * @param anAmount Uang yang dikeluarkan
     */
    public void withdraw(float anAmount)
    {
        if (anAmount<0.0){
            throw new IllegalArgumentException("Withdraw amount negative");
        }
        if (anAmount<=balance){
            synchronized(this){
                balance = balance - anAmount;
            }
        }
    }

    
    /** 
     * Method deposit diguankan untuk menambah
     * uang dari balance yang dimiliki
     * @param anAmount uang yang dimasukkan
     */
    public void deposit(float anAmount) {
        if (anAmount<0.0){
            throw new IllegalArgumentException("Deposit amount negative");
        }
        synchronized(this){
            balance = balance + anAmount;
        }
    }



    
    /** 
     * Method tostring digunakan untuk melakukan
     * print variabel balance yang dimiliki
     * @return String jumlah balance
     */
    @Override
    public String toString() {
        return String.valueOf(balance);
    }

}