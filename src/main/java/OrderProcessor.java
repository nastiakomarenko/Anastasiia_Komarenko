public abstract class OrderProcessor {
    public abstract void processOrder(Order order);

    public void executeOrder(Order order) {
        if (validateOrder(order)) {
            processOrder(order);
        } else {
            System.out.println("Order validation failed.");
        }
    }

    public abstract boolean validateOrder(Order order);
}