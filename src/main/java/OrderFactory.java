public class OrderFactory {
    public static OrderProcessor createOrderProcessor() {
        return new SimpleOrderProcessor();
    }

    public static OrderValidator createOrderValidator() {
        return new SimpleOrderValidator();
    }
}