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
import com.infopluscommerce.model.OrderSourceItemSetup;
import com.infopluscommerce.model.RecordFile;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for OrderSourceItemSetupApi
 */
@Ignore
public class OrderSourceItemSetupApiTest {

    private final OrderSourceItemSetupApi api = new OrderSourceItemSetupApi();

    
    /**
     * Create an orderSourceItemSetup
     *
     * Inserts a new orderSourceItemSetup using the specified data.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addOrderSourceItemSetupTest() throws ApiException {
        OrderSourceItemSetup body = null;
        OrderSourceItemSetup response = api.addOrderSourceItemSetup(body);

        // TODO: test validations
    }
    
    /**
     * Add new audit for an orderSourceItemSetup
     *
     * Adds an audit to an existing orderSourceItemSetup.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addOrderSourceItemSetupAuditTest() throws ApiException {
        Integer orderSourceItemSetupId = null;
        String orderSourceItemSetupAudit = null;
        api.addOrderSourceItemSetupAudit(orderSourceItemSetupId, orderSourceItemSetupAudit);

        // TODO: test validations
    }
    
    /**
     * Attach a file to an orderSourceItemSetup
     *
     * Adds a file to an existing orderSourceItemSetup.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addOrderSourceItemSetupFileTest() throws ApiException {
        Integer orderSourceItemSetupId = null;
        String fileName = null;
        api.addOrderSourceItemSetupFile(orderSourceItemSetupId, fileName);

        // TODO: test validations
    }
    
    /**
     * Attach a file to an orderSourceItemSetup by URL.
     *
     * Adds a file to an existing orderSourceItemSetup by URL.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addOrderSourceItemSetupFileByURLTest() throws ApiException {
        RecordFile body = null;
        Integer orderSourceItemSetupId = null;
        api.addOrderSourceItemSetupFileByURL(body, orderSourceItemSetupId);

        // TODO: test validations
    }
    
    /**
     * Add new tags for an orderSourceItemSetup.
     *
     * Adds a tag to an existing orderSourceItemSetup.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addOrderSourceItemSetupTagTest() throws ApiException {
        Integer orderSourceItemSetupId = null;
        String orderSourceItemSetupTag = null;
        api.addOrderSourceItemSetupTag(orderSourceItemSetupId, orderSourceItemSetupTag);

        // TODO: test validations
    }
    
    /**
     * Delete an orderSourceItemSetup
     *
     * Deletes the orderSourceItemSetup identified by the specified id.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteOrderSourceItemSetupTest() throws ApiException {
        Integer orderSourceItemSetupId = null;
        api.deleteOrderSourceItemSetup(orderSourceItemSetupId);

        // TODO: test validations
    }
    
    /**
     * Delete a file for an orderSourceItemSetup.
     *
     * Deletes an existing orderSourceItemSetup file using the specified data.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteOrderSourceItemSetupFileTest() throws ApiException {
        Integer orderSourceItemSetupId = null;
        Integer fileId = null;
        api.deleteOrderSourceItemSetupFile(orderSourceItemSetupId, fileId);

        // TODO: test validations
    }
    
    /**
     * Delete a tag for an orderSourceItemSetup.
     *
     * Deletes an existing orderSourceItemSetup tag using the specified data.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteOrderSourceItemSetupTagTest() throws ApiException {
        Integer orderSourceItemSetupId = null;
        String orderSourceItemSetupTag = null;
        api.deleteOrderSourceItemSetupTag(orderSourceItemSetupId, orderSourceItemSetupTag);

        // TODO: test validations
    }
    
    /**
     * Get a duplicated an orderSourceItemSetup by id
     *
     * Returns a duplicated orderSourceItemSetup identified by the specified id.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getDuplicateOrderSourceItemSetupByIdTest() throws ApiException {
        Integer orderSourceItemSetupId = null;
        OrderSourceItemSetup response = api.getDuplicateOrderSourceItemSetupById(orderSourceItemSetupId);

        // TODO: test validations
    }
    
    /**
     * Search orderSourceItemSetups by filter
     *
     * Returns the list of orderSourceItemSetups that match the given filter.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getOrderSourceItemSetupByFilterTest() throws ApiException {
        String filter = null;
        Integer page = null;
        Integer limit = null;
        String sort = null;
        List<OrderSourceItemSetup> response = api.getOrderSourceItemSetupByFilter(filter, page, limit, sort);

        // TODO: test validations
    }
    
    /**
     * Get an orderSourceItemSetup by id
     *
     * Returns the orderSourceItemSetup identified by the specified id.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getOrderSourceItemSetupByIdTest() throws ApiException {
        Integer orderSourceItemSetupId = null;
        OrderSourceItemSetup response = api.getOrderSourceItemSetupById(orderSourceItemSetupId);

        // TODO: test validations
    }
    
    /**
     * Get the files for an orderSourceItemSetup.
     *
     * Get all existing orderSourceItemSetup files.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getOrderSourceItemSetupFilesTest() throws ApiException {
        Integer orderSourceItemSetupId = null;
        api.getOrderSourceItemSetupFiles(orderSourceItemSetupId);

        // TODO: test validations
    }
    
    /**
     * Get the tags for an orderSourceItemSetup.
     *
     * Get all existing orderSourceItemSetup tags.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getOrderSourceItemSetupTagsTest() throws ApiException {
        Integer orderSourceItemSetupId = null;
        api.getOrderSourceItemSetupTags(orderSourceItemSetupId);

        // TODO: test validations
    }
    
    /**
     * Update an orderSourceItemSetup
     *
     * Updates an existing orderSourceItemSetup using the specified data.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateOrderSourceItemSetupTest() throws ApiException {
        OrderSourceItemSetup body = null;
        api.updateOrderSourceItemSetup(body);

        // TODO: test validations
    }
    
    /**
     * Update an orderSourceItemSetup custom fields
     *
     * Updates an existing orderSourceItemSetup custom fields using the specified data.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateOrderSourceItemSetupCustomFieldsTest() throws ApiException {
        OrderSourceItemSetup body = null;
        api.updateOrderSourceItemSetupCustomFields(body);

        // TODO: test validations
    }
    
}
