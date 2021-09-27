package com.csse.pms.controller;

import com.csse.pms.api.OrderApi;
import com.csse.pms.domain.Order;
import com.csse.pms.dto.OrderDto;
import com.csse.pms.util.CommonConstants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;

@RestController
@RequestMapping(CommonConstants.ORDER_REQUEST_MAPPING)
@CrossOrigin(origins = CommonConstants.STAR, allowedHeaders = CommonConstants.STAR, exposedHeaders = CommonConstants.STAR)
public class OrderController {

    private OrderApi orderApi;

    @Autowired
    public OrderController(OrderApi orderApi) {
        this.orderApi = orderApi;
    }

    @PostMapping(CommonConstants.POST_MAPPING_PURCHASE)
    public ResponseEntity<?> purchaseOrder(@RequestBody OrderDto orderDto) {
        Order purchase = new Order();
        purchase.setReferenceNo(orderDto.getReferenceNo());
        purchase.setSupplierId(orderDto.getSupplierId());
        purchase.setItemList(orderDto.getItemList());
        purchase.setSiteManagerId(orderDto.getSiteManagerId());
        purchase.setSiteId(orderDto.getSiteId());
        purchase.setProjectId(orderDto.getProjectId());
        purchase.setAmount(orderDto.getAmount());
        purchase.setContactDetails(orderDto.getContactDetails());
        purchase.setComment(orderDto.getComment());
        purchase.setDateTime(LocalDateTime.now());
        purchase.setStatus(orderDto.getStatus());
        return orderApi.purchaseOrder(purchase);
    }
}
