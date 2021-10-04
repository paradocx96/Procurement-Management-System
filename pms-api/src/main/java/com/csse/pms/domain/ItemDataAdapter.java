package com.csse.pms.domain;

import org.springframework.http.ResponseEntity;

public interface ItemDataAdapter {

	ResponseEntity<?> addItem(Item item);
	
}
