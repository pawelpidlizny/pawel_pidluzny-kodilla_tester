package execution_model;
import kodilla.parametrized_tests.com.kodilla.execution_model.Invoice;
import kodilla.parametrized_tests.com.kodilla.execution_model.Item;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class InvoiceTestSuite {
    @Test
    public void shouldAddItemsToInvoice() {
        //Given
        Invoice invoice = new Invoice();
        Item milk = new Item("Milk", 3.50);
        Item eggs = new Item("Eggs", 8.00);
        Item bread = new Item("Bread", 4.15);
        invoice.addItem(milk);
        invoice.addItem(eggs);
        invoice.addItem(bread);

        //When
        int numberOfItems = invoice.getSize();

        //Then
        Assertions.assertEquals(3, numberOfItems);

    }
    @Test
    public void shouldGetExistingItem() {
        //Given
        Invoice invoice = new Invoice();
        Item milk = new Item("Milk", 3.50);
        Item eggs = new Item("Eggs", 8.00);
        Item bread = new Item("Bread", 4.15);
        invoice.addItem(milk);
        invoice.addItem(eggs);
        invoice.addItem(bread);

        //When
        Item result = invoice.getItem(2);

        //Then
        Assertions.assertEquals("Bread", result.getName());
        Assertions.assertEquals(4.15, result.getPrice(), 0.01);
    }
    @Test
    public void shouldReturnNullWhenPassingNegativeIndex() {
        //Given
        Invoice invoice = new Invoice();
        Item milk = new Item("Milk", 3.50);
        Item eggs = new Item("Eggs", 8.00);
        Item bread = new Item("Bread", 4.15);
        invoice.addItem(milk);
        invoice.addItem(eggs);
        invoice.addItem(bread);

        //When
        Item result = invoice.getItem(-3);

        //Then
        Assertions.assertNull(result);
    }
    @Test
    public void shouldReturnNullWhenPassingOutOfRangeIndex() {
        //Given
        Invoice invoice = new Invoice();
        Item milk = new Item("Milk", 3.50);
        Item eggs = new Item("Eggs", 8.00);
        Item bread = new Item("Bread", 4.15);
        invoice.addItem(milk);
        invoice.addItem(eggs);
        invoice.addItem(bread);

        //When
        Item result = invoice.getItem(7);

        //Then
        Assertions.assertNull(result);
    }
    @Test
    public void shouldClearInvoice() {
        //Given
        Invoice invoice = new Invoice();
        Item milk = new Item("Milk", 3.50);
        Item eggs = new Item("Eggs", 8.00);
        Item bread = new Item("Bread", 4.15);
        invoice.addItem(milk);
        invoice.addItem(eggs);
        invoice.addItem(bread);

        //When
        invoice.clear();

        //Then
        Assertions.assertEquals(0, invoice.getSize());
    }

}
