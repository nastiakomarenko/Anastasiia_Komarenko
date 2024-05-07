public class Order {
        private int orderId;
        private String customerName;
        private double totalPrice;

        public static class Builder {
            private final Order order;

            public Builder() {
                order = new Order();
            }

            public Builder orderId(int orderId) {
                order.orderId = orderId;
                return this;
            }

            public Builder customerName(String customerName) {
                order.customerName = customerName;
                return this;
            }

            public Builder totalPrice(double totalPrice) {
                order.totalPrice = totalPrice;
                return this;
            }

            public Order build() {
                return order;
            }
        }
    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }
}

