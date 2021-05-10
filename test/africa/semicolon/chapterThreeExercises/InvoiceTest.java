package africa.semicolon.chapterThreeExercises;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class InvoiceTest {

    private Invoice invoice;
    private Invoice invoice1;
    @BeforeEach
    void init(){
        invoice = new Invoice("789", "Television Set",5, 700.00);
        invoice1 = new Invoice("12", "Car", -2, -10.00);
    }

    @Test
    void testThatInvoiceDoesNotInitializeNegativeValues(){
        assertNotEquals(-2, invoice1.getQuantityPerItem());
        assertNotEquals(-10.00, invoice1.getPricePerItem());
    }

    @Test
    void testThatInvoiceCanSetPartNumber(){
        invoice.setPartNumber("456");
        assertEquals("456", invoice.getPartNumber());

    }

    @Test
    void testThatInvoiceCanSetPartDescription(){
        invoice.setPartDescription("Home Theater");
        assertEquals("Home Theater", invoice.getPartDescription());
    }
    @Test
    void testThatInvoiceCanSetQuantityPerItem(){
        invoice.setQuantityPerItem(10);
        assertEquals(10, invoice.getQuantityPerItem());
    }

    @Test
    void testThatInvoiceDoesNotSetNegativeQuantityPerItem(){
        invoice.setQuantityPerItem(-10);
        assertNotEquals(-10, invoice.getQuantityPerItem());
    }


    @Test
    void testThatInvoiceCanSetPricePerItem(){
        invoice.setPricePerItem(1000.00);
        assertEquals(1000.00, invoice.getPricePerItem());
    }

    @Test
    void testThatInvoiceDoesNotSetNegativePricePerItem(){
        invoice.setPricePerItem(-1000.00);
        assertNotEquals(-1000.00, invoice.getPricePerItem());
    }

    @Test
    void testThatAccountCanGetInvoiceAmount(){
        double invoiceAmount = invoice.getInvoiceAmount();
        double invoice1Amount = invoice1.getInvoiceAmount();

        assertEquals(3500.00, invoiceAmount);
        assertEquals(0.0, invoice1Amount);
    }


}
