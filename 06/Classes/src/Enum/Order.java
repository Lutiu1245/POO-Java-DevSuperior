package Enum;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Order {
    private Date moment;
    private OrderStatus status;

    SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
    public Order(Date moment, OrderStatus status) {
        this.moment = moment;
        this.status = status;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Order{" +
                "moment=" + moment +
                ", status=" + status +
                '}';
    }
}
