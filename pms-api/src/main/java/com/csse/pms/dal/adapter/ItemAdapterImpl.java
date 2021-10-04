package com.csse.pms.dal.adapter;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

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
	
	 /**
     * Initialize Logger
     */
    public static final Logger LOGGER = Logger.getLogger(ItemAdapterImpl.class.getName());

  
	
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

	@Override
	public List<Item> getItemBySupplierID(String id) {
		
		List<ItemModel> items;
		List<Item> item = new ArrayList<>();
		
		try {
			
			items = itemReposirtory.findBySupplierID(id);
			
			for(ItemModel itemModel: items) {
				
				Item itemObj = new Item();
				
				itemObj.setId(itemModel.getId());
				itemObj.setSupplierID(itemModel.getSupplierID());
				itemObj.setName(itemModel.getName());
				itemObj.setQuantity(itemModel.getQuantity());
				itemObj.setPrice(itemModel.getPrice());
				
				item.add(itemObj);
				
			}
			
		} catch (Exception e) {
			 LOGGER.log(Level.SEVERE, e.getMessage());
		}
		
		
		return item;
	}

}