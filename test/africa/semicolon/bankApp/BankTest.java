package africa.semicolon.bankApp;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class BankTest {

    private static Bank bank;
    private static Customer newCustomer;
    private static Customer ayo;
    private static Customer ojo;

    @BeforeAll
    static void setUp(){
        bank = new Bank("GTB");
        Address address = new Address(63, "Awoyaya Street", "Ajah");
        Date dateOfBirth = new Date(26, 6, 1876);
        newCustomer = new Customer("Kayode", "Alogba", "07014145766", address, dateOfBirth);
        bank.addCustomer(newCustomer);
        ayo = new Customer("Ayo", "Dele", "080", new Address(50, "egan"), new Date(2,3,1776));
        ojo = new Customer("Ojo", "Oyo", "070", new Address(50, "egan"), new Date(2,3,1776));
        bank.addCustomer(ayo);
        bank.addCustomer(ojo);
    }

    @Test
    void testThatBankHasAName(){
        assertEquals("GTB", bank.getBankName());
    }

    @Test
    void testThatBankHasAStaff(){
        assertNotNull(bank.getBankStaff());
        assertTrue(bank.getBankStaff() instanceof Staff);
    }

    @Test
    void testThatBankCanAddNewCustomer(){
       assertTrue(bank.isBankCustomer(ayo));
    }

    @Test
    void testThatBankCustomerHasAnAccountNumber() throws CloneNotSupportedException{
        assertEquals(1, bank.getBankCustomers().get(0).getCustomerAccount().getAccountNumber());
    }

    @Test
    void testThatBankCustomerCanHaveMoreCustomers() throws CloneNotSupportedException{

        assertEquals(2, bank.getBankCustomers().get(1).getCustomerAccount().getAccountNumber());
        assertEquals(3, bank.getBankCustomers().get(2).getCustomerAccount().getAccountNumber());

    }

    @Test
    void testThatBankCanRemoveCustomer(){
        assertEquals(3, bank.getNumberOfBankCustomers());
        assertTrue(bank.isBankCustomer(ayo));
        bank.removeCustomer(ayo);
        assertEquals(2, bank.getNumberOfBankCustomers());
        assertFalse(bank.isBankCustomer(ayo));
    }

    @Test
    void testThatBankCanSearchForCustomerByName(){
        Customer kayode = bank.findCustomerByName("Kayode Alogba");
        assertNotNull(kayode);
        Customer unknownCustomer = bank.findCustomerByName("Unknown Customer");
        assertNull(unknownCustomer);
    }

    @Test
    void testThatBankCanSearchForCustomerByAccountNumber(){
        Customer kayode = bank.findCustomerByAccountNumber(1);
        assertNotNull(kayode);
        Customer unknownCustomer = bank.findCustomerByAccountNumber(-1);
        assertNull(unknownCustomer);
    }

}