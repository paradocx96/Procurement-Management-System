package com.csse.pms.dal.repository;

import com.csse.pms.dal.model.ProjectModel;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface ProjectRepository extends MongoRepository<ProjectModel, String> {

    List<ProjectModel> findBySiteId(String siteId);

    List<ProjectModel> findByManagerId(String managerId);
}
