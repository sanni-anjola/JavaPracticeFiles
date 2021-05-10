package africa.semicolon.tddClass;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AccountTest {
    private Account janetAccount;

    @BeforeEach
    void init(){

        janetAccount = new Account();
        janetAccount.deposit(1000.00);
    }

    @Test
    void testThatAccountCanDepositOnce(){
        //given
//        Account janetAccount= new Account();
        //when
        janetAccount.deposit(850.00);
        //confirm
        assertEquals(1850.00, janetAccount.getAccountBalance());
    }

    @Test
    void testThatAccountCanDepositTwice(){
        //given
//        Account janetAccount= new Account();
        //when
        janetAccount.deposit(850.00);
        janetAccount.deposit(150.00);
        //confirm
        assertEquals(2000.00, janetAccount.getAccountBalance());
    }

    @Test
    void testThatDepositDoesNotAllowNegativeDeposit(){
        janetAccount.deposit(-500.00);
        assertNotEquals(500.00, janetAccount.getAccountBalance(), 0.0);
    }

    @Test
    void testThatAccountCanWithdrawOnce(){
        janetAccount.withdraw(500.00, "0000");

        assertEquals(500.00, janetAccount.getAccountBalance());
    }

    @Test
    void testThatAccountCanWithdrawTwice(){
        janetAccount.withdraw(500.00, "0000");
        janetAccount.withdraw(300.00, "0000");

        assertEquals(200.00, janetAccount.getAccountBalance());
    }

    @Test
    void testThatAccountCannotWithdrawMoreThanTheBalance(){
        janetAccount.withdraw(1100, "0000");
        assertNotEquals(-100, janetAccount.getAccountBalance());
    }

    @Test
    void testThatAccountDoesNotAllowNegativeWithdrawal(){
        janetAccount.withdraw(-100, "0000");
        assertNotEquals(1100, janetAccount.getAccountBalance());
    }

    @Test
    void testThatAccountCanSetPin(){
        janetAccount.setPin("0000", "1234");
        assertEquals("1234", janetAccount.getPin());
    }

    @Test
    void testThatAccountDoesNotWithdrawWithAWrongPin(){
        janetAccount.withdraw(100, "4567");
        assertNotEquals(900, janetAccount.getAccountBalance());
    }
}
