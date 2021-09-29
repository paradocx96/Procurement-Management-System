package com.csse.pms.dal.repository;

import com.csse.pms.dal.model.ProjectModel;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjectRepository extends MongoRepository<ProjectModel,String> {
}
