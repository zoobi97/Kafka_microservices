package com.practice.kafka.base_domains.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@NoArgsConstructor
public class OrderEvent implements Serializable{
    private String message;
    private String status;
    private Order order;

    public void setMessage(String message) {
        this.message = message;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public String getMessage() {
        return message;
    }

    public String getStatus() {
        return status;
    }

    public Order getOrder() {
        return order;
    }

    @Override
    public String
    toString() {
        return "OrderEvent{" +
                "message='" + message + '\'' +
                ", status='" + status + '\'' +
                ", order=" + order +
                '}';
    }
}
