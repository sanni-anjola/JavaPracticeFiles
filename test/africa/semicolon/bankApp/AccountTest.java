package africa.semicolon.bankApp;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class AccountTest {
    private Account account;

    @BeforeEach
    void setUp(){
        account = new Account();
    }

    @AfterEach
    void tearDown() {
        account = null;
        Account.resetNumberOfAccounts();
    }

    @Test
    void testThatAccountHasAnAccountNumber(){
        assertEquals(1, account.getAccountNumber());
        Account account1 = new Account();
        Account account2 = new Account();
        Account account3 = new Account();
        assertEquals(3, account2.getAccountNumber());
        assertEquals(2, account1.getAccountNumber());
        assertEquals(4, account3.getAccountNumber());
    }

    @Test
    void testThatAccountCanDeposit(){
        assertDoesNotThrow(() -> account.deposit("1000.678"));
        assertEquals(new BigDecimal("1000.68"), account.getBalance());
    }

    @Test
    void testThatAccountCanWithdraw(){
        account.deposit("10500");
        assertDoesNotThrow(() -> account.withdraw("5000.50"));
        assertEquals(new BigDecimal("5499.50"), account.getBalance());
    }

    @Test
    void testThatAccountCannotDepositANegativeAmount(){
        assertThrows(IllegalArgumentException.class, () -> account.deposit("-1000.678"));
        assertNotEquals(new BigDecimal("-1000.68"), account.getBalance());
        assertEquals(new BigDecimal("0.00"), account.getBalance());
    }

    @Test
    void testThatAccountCannotWithdrawNegativeAmount(){
        account.deposit("10500");
        assertThrows(IllegalArgumentException.class,() -> account.withdraw("-5000.50"));
        assertEquals(new BigDecimal("10500.00"), account.getBalance());
    }

    @Test
    void testThatAccountCannotWithdrawMoreThanTheBalance(){
        assertThrows(IllegalArgumentException.class,() -> account.withdraw("5000.50"));

        assertNotEquals(new BigDecimal("-5000.50"), account.getBalance());
        assertEquals(new BigDecimal("0.00"), account.getBalance());
    }

    @Test
    void testThatAccountCanTransfer(){
        account.deposit("1000");
        Account account1 = new Account();
        assertEquals(2, account1.getAccountNumber());

        account.transfer("400", account1);
        assertEquals(new BigDecimal("600.00"), account.getBalance());
        assertEquals(new BigDecimal("400.00"), account1.getBalance());
    }

}