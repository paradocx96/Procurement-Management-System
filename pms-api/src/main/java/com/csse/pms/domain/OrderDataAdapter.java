package com.csse.pms.domain;

import org.springframework.http.ResponseEntity;
import java.util.List;

public interface OrderDataAdapter {

    ResponseEntity<?> purchaseOrder(Order order);

    List<Order> getAllOrders();

    List<Order> getOrderById(String referenceNo);

    List<Order> getOrderByStatus(String status);

    List<Order> getOrderBySite(String siteId);

    List<Order> getOrderByProject(String projectId);

    ResponseEntity<?> deleteOrderById(String referenceNo);

    ResponseEntity<?> archiveOrder(String referenceNo);

    ResponseEntity<?> updateOrder(Order order);

    ResponseEntity<?> updateOrderStatus(Order order);

    ResponseEntity<?> updateOrderMainStatus(Order order);

}
