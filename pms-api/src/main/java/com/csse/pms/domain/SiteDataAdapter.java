package com.csse.pms.domain;

import org.springframework.http.ResponseEntity;
import java.util.List;

public interface SiteDataAdapter {

    ResponseEntity<?> createSite(Site site);

    List<Site> getAllSites();

    Site getSiteById(String id);

    ResponseEntity<?> deleteSiteById(String id);

    ResponseEntity<?> updateSite(Site site);
}
