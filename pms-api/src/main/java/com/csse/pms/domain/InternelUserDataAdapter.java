package com.csse.pms.domain;

import org.springframework.http.ResponseEntity;

public interface InternelUserDataAdapter {

	ResponseEntity<?> registerInternelUser(InternelUser internelUser);
	ResponseEntity<?> loginInternelUser(InternelUser internelUser);
}
