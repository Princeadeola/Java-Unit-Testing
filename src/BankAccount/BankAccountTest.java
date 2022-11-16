package BankAccount;

import static org.junit.Assert.*;

public class BankAccountTest {
    @org.junit.Test
    public void deposit() {
        //this is to test the account entries by entering the object of BankAccount parameters
        BankAccount account = new BankAccount("Adeola", "Adesipe", 5000.00);
        double balance = account.deposit(2500.00, true);
        assertEquals(7500.00, balance,0);
    }
     //
    @org.junit.Test
    public void withdraw() {
        fail("This method is not yet tested");
    }

    @org.junit.Test
    public void getBalance() {
        fail("This method is not yet tested");
    }
}
