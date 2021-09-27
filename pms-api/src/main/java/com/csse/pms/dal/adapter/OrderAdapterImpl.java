package com.csse.pms.dal.adapter;

import com.csse.pms.dal.model.OrderModel;
import com.csse.pms.dal.repository.OrderRepository;
import com.csse.pms.domain.Order;
import com.csse.pms.domain.OrderDataAdapter;
import com.csse.pms.dto.MessageResponseDto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

@Component
public class OrderAdapterImpl implements OrderDataAdapter {

    /** Initialize Logger */
    public static final Logger LOGGER = Logger.getLogger(OrderAdapterImpl.class.getName());

    private final OrderRepository repository;
    private final MongoTemplate mongoTemplate;

    @Autowired
    public OrderAdapterImpl(OrderRepository repository, MongoTemplate mongoTemplate) {
        this.repository = repository;
        this.mongoTemplate = mongoTemplate;
    }

    @Override
    public ResponseEntity<?> purchaseOrder(Order order) {

        OrderModel orderModel = new OrderModel();

        try {
            orderModel.setReferenceNo(order.getReferenceNo());
            orderModel.setSupplierId(order.getSupplierId());
            orderModel.setItemList(order.getItemList());
            orderModel.setSiteManagerId(order.getSiteManagerId());
            orderModel.setSiteId(order.getSiteId());
            orderModel.setProjectId(order.getProjectId());
            orderModel.setAmount(order.getAmount());
            orderModel.setContactDetails(order.getContactDetails());
            orderModel.setComment(order.getComment());
            orderModel.setDateTime(order.getDateTime());
            orderModel.setStatus(order.getStatus());

            orderModel = repository.save(orderModel);

            return ResponseEntity.ok(new MessageResponseDto("Order Purchase Successfully!"));
        } catch (Exception e) {
            LOGGER.log(Level.SEVERE, e.getMessage());
            return ResponseEntity.ok(new MessageResponseDto("Order Purchase Error!"));
        }
    }

    @Override
    public List<Order> getAllOrders() {
        return null;
    }

    @Override
    public List<Order> getOrderById(String id) {
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
    public ResponseEntity<?> deleteOrderById(String id) {
        return null;
    }

    @Override
    public ResponseEntity<?> archiveOrder(Order order) {
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
}
