package com.csse.pms.domain;

import org.springframework.http.ResponseEntity;
import java.util.List;

public interface OrderDataAdapter {

    ResponseEntity<?> purchaseOrder(Order order);

    List<Order> getAllOrders();

    Order getOrderById(String id);

    List<Order> getOrderByStatus(String status);

    List<Order> getOrderBySite(String siteId);

    List<Order> getOrderByProject(String projectId);

    ResponseEntity<?> deleteOrderById(String id);

    ResponseEntity<?> archiveOrder(Order order);

    ResponseEntity<?> updateOrder(Order order);

    ResponseEntity<?> updateOrderStatus(Order order);
}
