package com.csse.pms.domain;

import java.time.LocalDateTime;
import java.util.Map;

public class Order {

    private String referenceNo;
    private String supplierId;
    private Map<String,Integer> itemList;
    private String siteManagerId;
    private String siteId;
    private String projectId;
    private double amount;
    private String contactDetails;
    private String comment;
    private LocalDateTime dateTime;
    private String status;
    private String mainStatus;

    public String getReferenceNo() {
        return referenceNo;
    }

    public void setReferenceNo(String referenceNo) {
        this.referenceNo = referenceNo;
    }

    public String getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(String supplierId) {
        this.supplierId = supplierId;
    }

    public Map<String, Integer> getItemList() {
        return itemList;
    }

    public void setItemList(Map<String, Integer> itemList) {
        this.itemList = itemList;
    }

    public String getSiteManagerId() {
        return siteManagerId;
    }

    public void setSiteManagerId(String siteManagerId) {
        this.siteManagerId = siteManagerId;
    }

    public String getSiteId() {
        return siteId;
    }

    public void setSiteId(String siteId) {
        this.siteId = siteId;
    }

    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getContactDetails() {
        return contactDetails;
    }

    public void setContactDetails(String contactDetails) {
        this.contactDetails = contactDetails;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public void setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMainStatus() {
        return mainStatus;
    }

    public void setMainStatus(String mainStatus) {
        this.mainStatus = mainStatus;
    }
}
