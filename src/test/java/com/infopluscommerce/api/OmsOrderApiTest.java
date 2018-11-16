/*
 * Infoplus API
 * Infoplus API.
 *
 * OpenAPI spec version: beta
 * Contact: api@infopluscommerce.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.infopluscommerce.api;

import com.infopluscommerce.ApiException;
import com.infopluscommerce.model.ModelApiResponse;
import com.infopluscommerce.model.OmsOrder;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for OmsOrderApi
 */
@Ignore
public class OmsOrderApiTest {

    private final OmsOrderApi api = new OmsOrderApi();

    
    /**
     * Create an omsOrder
     *
     * Inserts a new omsOrder using the specified data.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addOmsOrderTest() throws ApiException {
        OmsOrder body = null;
        OmsOrder response = api.addOmsOrder(body);

        // TODO: test validations
    }
    
    /**
     * Add new audit for an omsOrder
     *
     * Adds an audit to an existing omsOrder.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addOmsOrderAuditTest() throws ApiException {
        Integer omsOrderId = null;
        String omsOrderAudit = null;
        api.addOmsOrderAudit(omsOrderId, omsOrderAudit);

        // TODO: test validations
    }
    
    /**
     * Add new tags for an omsOrder.
     *
     * Adds a tag to an existing omsOrder.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addOmsOrderTagTest() throws ApiException {
        Integer omsOrderId = null;
        String omsOrderTag = null;
        api.addOmsOrderTag(omsOrderId, omsOrderTag);

        // TODO: test validations
    }
    
    /**
     * Delete a tag for an omsOrder.
     *
     * Deletes an existing omsOrder tag using the specified data.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteOmsOrderTagTest() throws ApiException {
        Integer omsOrderId = null;
        String omsOrderTag = null;
        api.deleteOmsOrderTag(omsOrderId, omsOrderTag);

        // TODO: test validations
    }
    
    /**
     * Get a duplicated an omsOrder by id
     *
     * Returns a duplicated omsOrder identified by the specified id.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getDuplicateOmsOrderByIdTest() throws ApiException {
        Integer omsOrderId = null;
        OmsOrder response = api.getDuplicateOmsOrderById(omsOrderId);

        // TODO: test validations
    }
    
    /**
     * Search omsOrders by filter
     *
     * Returns the list of omsOrders that match the given filter.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getOmsOrderByFilterTest() throws ApiException {
        String filter = null;
        Integer page = null;
        Integer limit = null;
        String sort = null;
        List<OmsOrder> response = api.getOmsOrderByFilter(filter, page, limit, sort);

        // TODO: test validations
    }
    
    /**
     * Get an omsOrder by id
     *
     * Returns the omsOrder identified by the specified id.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getOmsOrderByIdTest() throws ApiException {
        Integer omsOrderId = null;
        OmsOrder response = api.getOmsOrderById(omsOrderId);

        // TODO: test validations
    }
    
    /**
     * Get the tags for an omsOrder.
     *
     * Get all existing omsOrder tags.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getOmsOrderTagsTest() throws ApiException {
        Integer omsOrderId = null;
        api.getOmsOrderTags(omsOrderId);

        // TODO: test validations
    }
    
    /**
     * Update an omsOrder
     *
     * Updates an existing omsOrder using the specified data.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateOmsOrderTest() throws ApiException {
        OmsOrder body = null;
        api.updateOmsOrder(body);

        // TODO: test validations
    }
    
    /**
     * Update an omsOrder custom fields
     *
     * Updates an existing omsOrder custom fields using the specified data.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateOmsOrderCustomFieldsTest() throws ApiException {
        OmsOrder body = null;
        api.updateOmsOrderCustomFields(body);

        // TODO: test validations
    }
    
}
