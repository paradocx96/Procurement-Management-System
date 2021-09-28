package com.csse.pms.util;

/**
 * This is the common constants file for Procurement Management System Project.
 */
public class CommonConstants {

    /** Constant for Star Cross Origin in Controller */
    public static final String STAR = "*";

    /** Constant for Request Mapping Path in Order Controller */
    public static final String ORDER_REQUEST_MAPPING = "/api/v1/order/";

    /** Constant for Purchase - Mapping Path in Controller */
    public static final String POST_MAPPING_PURCHASE = "purchase";

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
    
    
    //inventory common constants
    
	/* Constant for countable item base URI */
    public static final String COUNTABLE_ITEMS_BASE_PATH = "/api/inventory/countable/";
    
    /* Constant for uncountable item base URI */
    public static final String UNCOUNTABLE_ITEMS_BASE_PATH = "/api/inventory/uncountable/";
}
