package com.csse.pms.domain;

import org.springframework.http.ResponseEntity;
import java.util.List;

public interface DraftOrderDataAdapter {

    ResponseEntity<?> saveDraftOrder(DraftOrder draftOrder);

    List<Order> getAllDraftOrders();

    Order getDraftOrderById(String id);

    List<Order> getDraftOrderBySite(String siteId);

    List<Order> getDraftOrderByProject(String projectId);

    ResponseEntity<?> deleteDraftOrderById(String id);

    ResponseEntity<?> updateDraftOrder(DraftOrder order);
}
