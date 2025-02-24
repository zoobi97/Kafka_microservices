package com.practice.kafka.base_domains.DTO;

import lombok.*;

import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
public class Order implements Serializable{
   private String OrderId;
   private String name;
   private int qty;
   private Double price;

   public void setOrderId(String orderId) {
      OrderId = orderId;
   }

   public String getOrderId() {
      return OrderId;
   }

   public String getName() {
      return name;
   }

   public int getQty() {
      return qty;
   }

   public Double getPrice() {
      return price;
   }
}
