package com.csse.pms.domain;

import org.springframework.http.ResponseEntity;
import java.util.List;

public interface DeliveryLogDataAdapter {

    ResponseEntity<?> createDeliveryLog(DeliveryLog deliveryLog);

    List<DeliveryLog> getAllDeliveryLogs();

    DeliveryLog getDeliveryLogById(String id);

    List<DeliveryLog> getDeliveryLogByReferenceNo(String referenceNo);

    ResponseEntity<?> deleteDeliveryLogById(String id);

    ResponseEntity<?> updateDeliveryLog(DeliveryLog deliveryLog);
}
