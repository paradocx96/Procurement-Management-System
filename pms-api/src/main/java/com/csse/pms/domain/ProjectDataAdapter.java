package com.csse.pms.domain;

import org.springframework.http.ResponseEntity;
import java.util.List;

public interface ProjectDataAdapter {

    ResponseEntity<?> createProject(Project project);

    List<Project> getAllProjects();

    Project getProjectById(String id);

    List<Project> getProjectBySite(String siteId);

    ResponseEntity<?> deleteProjectById(String id);

    ResponseEntity<?> updateProject(Project project);
}