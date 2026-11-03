package org.example;

public class Order {
    private int id;
    private OrderStatus status;

    Order(int id, OrderStatus status) {
        this.id = id;
        this.status = status;
    }

    public int getId() {
        return this.id;
    }

    public OrderStatus getStatus() {
        return this.status;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Заказ: {" + this.id + ", " + this.status + "}";
    }
}
