public class SimpleOrderProcessor extends OrderProcessor {
    @Override
    public void processOrder(Order order) {
        System.out.println("Processing order: " + order.getOrderId());
        // Logic for processing order
    }

    @Override
    public boolean validateOrder(Order order) {
        return order.getTotalPrice() > 0;
    }
}