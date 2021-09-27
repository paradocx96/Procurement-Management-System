package com.csse.pms.dal.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import java.time.LocalDateTime;
import java.util.Map;

@Document
public class OrderModel {

    @Id
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

    public OrderModel() {
    }

    public OrderModel(String referenceNo, String supplierId, Map<String, Integer> itemList, String siteManagerId, String siteId, String projectId, double amount, String contactDetails, String comment, LocalDateTime dateTime, String status, String mainStatus) {
        this.referenceNo = referenceNo;
        this.supplierId = supplierId;
        this.itemList = itemList;
        this.siteManagerId = siteManagerId;
        this.siteId = siteId;
        this.projectId = projectId;
        this.amount = amount;
        this.contactDetails = contactDetails;
        this.comment = comment;
        this.dateTime = dateTime;
        this.status = status;
        this.mainStatus = mainStatus;
    }

    @Override
    public String toString() {
        return "OrderModel{" +
                "referenceNo='" + referenceNo + '\'' +
                ", supplierId='" + supplierId + '\'' +
                ", itemList=" + itemList +
                ", siteManagerId='" + siteManagerId + '\'' +
                ", siteId='" + siteId + '\'' +
                ", projectId='" + projectId + '\'' +
                ", amount=" + amount +
                ", contactDetails='" + contactDetails + '\'' +
                ", comment='" + comment + '\'' +
                ", dateTime=" + dateTime +
                ", status='" + status + '\'' +
                ", mainStatus='" + mainStatus + '\'' +
                '}';
    }

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
