package com.csse.pms.dal.repository;

import com.csse.pms.dal.model.DeliveryLogModel;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface DeliveryLogRepository extends MongoRepository<DeliveryLogModel,String> {

    List<DeliveryLogModel> findByReferenceNo(String referenceNo);
}
