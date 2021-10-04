package com.csse.pms.dal.adapter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;


import com.csse.pms.dal.model.ItemModel;
import com.csse.pms.dal.repository.ItemReposirtory;
import com.csse.pms.domain.Item;
import com.csse.pms.domain.ItemDataAdapter;
import com.csse.pms.dto.ItemMessageResponseDto;
import com.csse.pms.util.CommonConstants;

@Component
public class ItemAdapterImpl implements ItemDataAdapter {
	
	@Autowired
	private ItemReposirtory itemReposirtory;

	@Override
	public ResponseEntity<?> addItem(Item item) {
		
		ItemModel itemObj = new ItemModel( item.getSupplierID(),
											item.getName(),
											item.getQuantity(),
											item.getPrice()
										 );
		itemReposirtory.save(itemObj);
		
		return ResponseEntity.ok(new ItemMessageResponseDto(CommonConstants.SUPPLIER_ADD_ITEM_SUCCESS_MSG));
	}

}
