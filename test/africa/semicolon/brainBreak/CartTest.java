package africa.semicolon.brainBreak;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CartTest {
    Cart cart;
    Item item;
    @BeforeEach
    void setUp() {
        cart = new Cart();
         item = new Item("Omo", 600, 5);

    }

    @Test
    void testThatCartHasItems(){
        assertNotNull(cart.getItems());
    }

    @Test
    void testThatItems(){

    }

    @Test
    void testThatCartCanAddItems(){
        cart.addItem(item);

        assertEquals(1, cart.getItems().size());
    }

    @Test
    void testThatItemsHasProductName(){
        assertEquals("Omo", item.getItemName());
    }

    @Test
    void testThatItemsKnowQuantityOfItem(){
        assertEquals(5, item.getQuantity());
    }

    @Test
    void testThatItemsHasPrice(){
        assertEquals(600.00, item.getPrice());
    }

    @Test
    void testThatItemCanDetermineTotalPrice(){
        assertEquals(3000, item.getTotalPrice());
    }

    @Test
    void testThatItemThrowsExceptionWhenSuppliedWrongValue(){

    }
}