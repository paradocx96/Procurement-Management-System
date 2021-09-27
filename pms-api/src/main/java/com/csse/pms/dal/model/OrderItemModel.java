package com.csse.pms.dal.model;

import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class OrderItemModel {

    private String referenceNo;
    private String itemId;
    private String itemName;
    private int itemCount;

    public OrderItemModel() {
    }

    public OrderItemModel(String referenceNo, String itemId, String itemName, int itemCount) {
        this.referenceNo = referenceNo;
        this.itemId = itemId;
        this.itemName = itemName;
        this.itemCount = itemCount;
    }

    public String getReferenceNo() {
        return referenceNo;
    }

    public void setReferenceNo(String referenceNo) {
        this.referenceNo = referenceNo;
    }

    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public int getItemCount() {
        return itemCount;
    }

    public void setItemCount(int itemCount) {
        this.itemCount = itemCount;
    }
}
