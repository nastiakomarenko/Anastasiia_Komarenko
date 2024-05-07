public class SimpleOrderValidator implements OrderValidator {
    @Override
    public boolean validateOrder(Order order) {
        return order.getTotalPrice() > 0;
    }
}