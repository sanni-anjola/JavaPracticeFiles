package africa.semicolon.chapterThreeExercises;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class AccountTest {
    private Account account1;
    private Account account2;
    @BeforeEach
    public void init(){
        account1 = new Account("Jane Green", 50.00);
        account2 = new Account("John Blue", -7.53);
    }

    @Test
    void testThatAccountDoesNotInitializeNegativeBalance(){

        assertEquals(0.0, account2.getBalance());
    }

    @Test
    void testThatAccountDoesNotSetNegativeBalance(){
        account1.setBalance(-700);
        assertEquals(50.0, account1.getBalance());
        account2.setBalance(-700);
        assertEquals(0.0, account2.getBalance());
    }

    @Test
    void testThatAccountSetsName(){
        account1.setName("Erich Gamma");
        assertEquals("Erich Gamma", account1.getName());
    }

    @Test
    void testThatAccountCanDepositOnce(){

        account1.deposit(850.00);
        //confirm
        assertEquals(900.00, account1.getBalance());
    }

    @Test
    void testThatAccountCanDepositTwice(){

        account1.deposit(850.00);
        account1.deposit(150.00);
        assertEquals(1050.00, account1.getBalance());
    }

    @Test
    void testThatDepositDoesNotAllowNegativeDeposit(){
        account1.deposit(-50.00);
        assertNotEquals(0.0, account1.getBalance(), 0.0);
    }

    @Test
    void testThatAccountCanWithdrawOnce(){
        account1.withdraw(30.00);

        assertEquals(20.00, account1.getBalance());
    }

    @Test
    void testThatAccountCanWithdrawTwice(){
        account1.withdraw(20.00);
        account1.withdraw(10.00);

        assertEquals(20.00, account1.getBalance());
    }

    @Test
    void testThatAccountCannotWithdrawMoreThanTheBalance(){
        account1.withdraw(100);
        assertNotEquals(-50, account1.getBalance());
    }

    @Test
    void testThatAccountDoesNotAllowNegativeWithdrawal(){
        account1.withdraw(-100);
        assertNotEquals(-150, account1.getBalance());
    }

    @Test
    void testThatAccountCanDisplayAccount(){
        assertEquals("Jane Green balance: $50.00", account1.displayAccount());
        assertEquals("John Blue balance: $0.00", account2.displayAccount());
    }
}
