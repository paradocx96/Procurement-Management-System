package com.csse.pms.dal.repository;

import com.csse.pms.dal.model.OrderModel;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface OrderRepository extends MongoRepository<OrderModel, String> {

    List<OrderModel> findByStatus(String status);

    List<OrderModel> findBySiteId(String siteId);

    List<OrderModel> findByProjectId(String projectId);
}
