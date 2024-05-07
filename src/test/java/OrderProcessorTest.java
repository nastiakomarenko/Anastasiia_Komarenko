import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class OrderProcessorTest {

    @Test
    public void testProcessOrder() {
        // Створюємо замовлення
        Order order = new Order();
        order.setOrderId(1);
        order.setCustomerName("John Doe");
        order.setTotalPrice(100.0);

        // Створюємо об'єкти для обробки та валідації замовлення
        OrderValidator validator = new SimpleOrderValidator();
        OrderProcessor processor = new SimpleOrderProcessor();

        // Перевіряємо, чи замовлення валідне
        assertTrue(validator.validateOrder(order));

        // Обробляємо замовлення
        processor.processOrder(order);

    }
}
