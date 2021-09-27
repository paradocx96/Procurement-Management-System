package com.csse.pms.dal.adapter;

import com.csse.pms.dal.repository.OrderRepository;
import com.csse.pms.domain.Order;
import com.csse.pms.domain.OrderDataAdapter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class OrderAdapterImpl implements OrderDataAdapter {

    private final OrderRepository repository;
    private final MongoTemplate mongoTemplate;

    @Autowired
    public OrderAdapterImpl(OrderRepository repository, MongoTemplate mongoTemplate) {
        this.repository = repository;
        this.mongoTemplate = mongoTemplate;
    }

    @Override
    public ResponseEntity<?> purchaseOrder(Order order) {
        return null;
    }

    @Override
    public List<Order> getAllOrders() {
        return null;
    }

    @Override
    public List<Order> getOrderById(String referenceNo) {
        return null;
    }

    @Override
    public List<Order> getOrderByStatus(String status) {
        return null;
    }

    @Override
    public List<Order> getOrderBySite(String siteId) {
        return null;
    }

    @Override
    public List<Order> getOrderByProject(String projectId) {
        return null;
    }

    @Override
    public ResponseEntity<?> deleteOrderById(String referenceNo) {
        return null;
    }

    @Override
    public ResponseEntity<?> archiveOrder(String referenceNo) {
        return null;
    }

    @Override
    public ResponseEntity<?> updateOrder(Order order) {
        return null;
    }

    @Override
    public ResponseEntity<?> updateOrderStatus(Order order) {
        return null;
    }

    @Override
    public ResponseEntity<?> updateOrderMainStatus(Order order) {
        return null;
    }
}
