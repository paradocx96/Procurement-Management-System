package com.csse.pms.dal.repository;

import com.csse.pms.dal.model.SiteModel;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SiteRepository extends MongoRepository<SiteModel, String> {
}
