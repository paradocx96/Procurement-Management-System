package com.csse.pms.api;

import com.csse.pms.domain.Order;
import com.csse.pms.domain.OrderDataAdapter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class OrderApi {

    private final OrderDataAdapter orderDataAdapter;

    @Autowired
    public OrderApi(OrderDataAdapter orderDataAdapter) {
        this.orderDataAdapter = orderDataAdapter;
    }

    public ResponseEntity<?> purchaseOrder(Order order){
        return orderDataAdapter.purchaseOrder(order);
    }
}
