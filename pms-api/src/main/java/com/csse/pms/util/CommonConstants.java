package com.csse.pms.util;

/**
 * This is the common constants file for Procurement Management System Project.
 */
public class CommonConstants {

    /** Constant for Star Cross Origin in Controller */
    public static final String STAR = "*";

    /** Constant for Request Mapping Path in Order Controller */
    public static final String ORDER_REQUEST_MAPPING = "/api/v1/order/";

    /** Constant for Request Mapping Path in Draft Order Controller */
    public static final String DRAFT_ORDER_REQUEST_MAPPING = "/api/v1/draft/";

    /** Constant for Purchase - Mapping Path in Controller */
    public static final String POST_MAPPING_PURCHASE = "purchase";

    /** Constant for Save - Mapping Path in Controller */
    public static final String POST_MAPPING_SAVE = "save";

    /** Constant for Get - Mapping Path in Controller */
    public static final String GET_MAPPING_GET = "get";

    /** Constant for Get By ID - Mapping Path in Controller */
    public static final String GET_MAPPING_GET_BY_ID = "getById/{id}";

    /** Constant for Get By Status - Mapping Path in Controller */
    public static final String GET_MAPPING_GET_BY_STATUS = "getByStatus/{status}";

    /** Constant for Get By Site ID - Mapping Path in Controller */
    public static final String GET_MAPPING_GET_BY_SITE_ID = "getBySiteId/{id}";

    /** Constant for Get By Project ID - Mapping Path in Controller */
    public static final String GET_MAPPING_GET_BY_PROJECT_ID = "getByProjectId/{id}";

    /** Constant for Delete By ID - Mapping Path in Controller */
    public static final String DELETE_MAPPING_DELETE_BY_ID = "deleteById/{id}";

    /** Constant for Put Archive - Mapping Path in Controller */
    public static final String PUT_MAPPING_ARCHIVE = "archive";

    /** Constant for Put Update - Mapping Path in Controller */
    public static final String PUT_MAPPING_UPDATE = "update";

    /** Constant for Put Update Status - Mapping Path in Controller */
    public static final String PUT_MAPPING_UPDATE_STATUS = "updateStatus";

    /** Constant for Message - Order Purchase Successfully */
    public static final String ORDER_PURCHASE_SUCCESSFULLY = "Order Purchase Successfully";

    /** Constant for Message - Order Delete Successfully */
    public static final String ORDER_DELETE_SUCCESSFULLY = "Order Delete Successfully";

    /** Constant for Message - Draft Order Delete Successfully */
    public static final String ORDER_DRAFT_DELETE_SUCCESSFULLY = "Draft Order Delete Successfully";

    /** Constant for Message - Order Archive Successfully */
    public static final String ORDER_ARCHIVE_SUCCESSFULLY = "Order Archive Successfully";

    /** Constant for Message - Order Update Successfully */
    public static final String ORDER_UPDATE_SUCCESSFULLY = "Order Update Successfully";

    /** Constant for Message - Draft Order Update Successfully */
    public static final String ORDER_DRAFT_UPDATE_SUCCESSFULLY = "Draft Order Update Successfully";

    /** Constant for Message - Order Status Update Successfully */
    public static final String ORDER_STATUS_UPDATE_SUCCESSFULLY = "Order Status Update Successfully";

    /** Constant for Message - Order Save Successfully */
    public static final String ORDER_SAVE_SUCCESSFULLY = "Order Save Successfully";

    /** Constant for Message - Order Purchase Error */
    public static final String ORDER_PURCHASE_ERROR = "Order Purchase Error";

    /** Constant for Message - Order Delete Error */
    public static final String ORDER_DELETE_ERROR = "Order Delete Error";

    /** Constant for Message - Draft Order Delete Error */
    public static final String ORDER_DRAFT_DELETE_ERROR = "Draft Order Delete Error";

    /** Constant for Message - Order Archive Error */
    public static final String ORDER_ARCHIVE_ERROR = "Order Archive Error";

    /** Constant for Message - Order Update Error */
    public static final String ORDER_UPDATE_ERROR = "Order Update Error";

    /** Constant for Message - Draft Order Update Error */
    public static final String ORDER_DRAFT_UPDATE_ERROR = "Draft Order Update Error";

    /** Constant for Message - Order Status Update Error */
    public static final String ORDER_STATUS_UPDATE_ERROR = "Order Status Update Error";

    /** Constant for Message - Order Save Error */
    public static final String ORDER_SAVE_ERROR = "Order Save Error";

    /** Constant for Message - Order Doesn't Exist */
    public static final String ORDER_DOES_NOT_EXIST = "Order Does not Exist";

    /** Constant for Variable id */
    public static final String ID = "id";

    /** Constant for Variable status */
    public static final String STATUS = "status";

    /** Constant for Variable referenceNo */
    public static final String REFERENCE_NO = "referenceNo";

    /** Constant for Variable supplierId */
    public static final String SUPPLIER_ID= "supplierId";

    /** Constant for Variable itemList */
    public static final String ITEM_LIST= "itemList";

    /** Constant for Variable siteManagerId */
    public static final String SITE_MANAGER_ID= "siteManagerId";

    /** Constant for Variable siteId */
    public static final String SITE_ID= "siteId";

    /** Constant for Variable projectId */
    public static final String PROJECT_ID= "projectId";

    /** Constant for Variable amount */
    public static final String AMOUNT= "amount";

    /** Constant for Variable contactDetails */
    public static final String CONTACT_DETAILS= "contactDetails";

    /** Constant for Variable comment */
    public static final String COMMENT= "comment";

    /** Constant for Variable dateTime */
    public static final String DATE_TIME= "dateTime";
  
    //inventory common constants    
	  /* Constant for countable item base URI */
    public static final String COUNTABLE_ITEMS_BASE_PATH = "/api/inventory/countable/";
    
    /* Constant for uncountable item base URI */
    public static final String UNCOUNTABLE_ITEMS_BASE_PATH = "/api/inventory/uncountable/";


    /******  Supplier Common Constants  ******/ 
    
    /** Constant for Request Mapping Path in Supplier Controller */
    public static final String SUPPLIER_REQUEST_MAPPING = "/api/v1/supplier/";
    
    /** Constant for supplier register Path in Supplier Controller */
    public static final String SUPPLIER_POST_MAPPING_REGISTER = "register";
    
    /** Constant for variable response message */
    public static final String SUPPLIER_REGISTRATION_SUCCESS_MSG = "You have successfully registered!";
    
    /** Constant for variable response message */
    public static final String SUPPLIER_EMAIL_REGISTRATION_ERROR_MSG = "This mail is already taken!";
    
    /** Constant for supplier register Path in Supplier Controller */
    public static final String SUPPLIER_POST_MAPPING_LOGIN = "login";
    
    
    /******  Internal user Common Constants  ******/ 
    
    /** Constant for Request Mapping Path in Supplier Controller */
    public static final String INTERNEL_USER_REQUEST_MAPPING = "/api/v1/internel-user/";
    
    /** Constant for supplier register Path in Supplier Controller */
    public static final String INTERNEL_USER_POST_MAPPING_REGISTER = "register";
    
    /** Constant for variable response message */
    public static final String INTERNEL_USER_REGISTRATION_SUCCESS_MSG = "You have successfully registered!";
    
    /** Constant for variable response message */
    public static final String INTERNEL_USER_EMAIL_REGISTRATION_ERROR_MSG = "This mail is already taken!";
    
    /** Constant for supplier register Path in Supplier Controller */
    public static final String INTERNEL_USER_POST_MAPPING_LOGIN = "login";
    
}
