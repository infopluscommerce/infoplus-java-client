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
import com.infopluscommerce.model.FulfillmentProcessLog;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for FulfillmentProcessLogApi
 */
@Ignore
public class FulfillmentProcessLogApiTest {

    private final FulfillmentProcessLogApi api = new FulfillmentProcessLogApi();

    
    /**
     * Add new audit for a fulfillmentProcessLog
     *
     * Adds an audit to an existing fulfillmentProcessLog.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addFulfillmentProcessLogAuditTest() throws ApiException {
        Integer fulfillmentProcessLogId = null;
        String fulfillmentProcessLogAudit = null;
        api.addFulfillmentProcessLogAudit(fulfillmentProcessLogId, fulfillmentProcessLogAudit);

        // TODO: test validations
    }
    
    /**
     * Add new tags for a fulfillmentProcessLog.
     *
     * Adds a tag to an existing fulfillmentProcessLog.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addFulfillmentProcessLogTagTest() throws ApiException {
        Integer fulfillmentProcessLogId = null;
        String fulfillmentProcessLogTag = null;
        api.addFulfillmentProcessLogTag(fulfillmentProcessLogId, fulfillmentProcessLogTag);

        // TODO: test validations
    }
    
    /**
     * Delete a tag for a fulfillmentProcessLog.
     *
     * Deletes an existing fulfillmentProcessLog tag using the specified data.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteFulfillmentProcessLogTagTest() throws ApiException {
        Integer fulfillmentProcessLogId = null;
        String fulfillmentProcessLogTag = null;
        api.deleteFulfillmentProcessLogTag(fulfillmentProcessLogId, fulfillmentProcessLogTag);

        // TODO: test validations
    }
    
    /**
     * Get a duplicated a fulfillmentProcessLog by id
     *
     * Returns a duplicated fulfillmentProcessLog identified by the specified id.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getDuplicateFulfillmentProcessLogByIdTest() throws ApiException {
        Integer fulfillmentProcessLogId = null;
        FulfillmentProcessLog response = api.getDuplicateFulfillmentProcessLogById(fulfillmentProcessLogId);

        // TODO: test validations
    }
    
    /**
     * Search fulfillmentProcessLogs by filter
     *
     * Returns the list of fulfillmentProcessLogs that match the given filter.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getFulfillmentProcessLogByFilterTest() throws ApiException {
        String filter = null;
        Integer page = null;
        Integer limit = null;
        String sort = null;
        List<FulfillmentProcessLog> response = api.getFulfillmentProcessLogByFilter(filter, page, limit, sort);

        // TODO: test validations
    }
    
    /**
     * Get a fulfillmentProcessLog by id
     *
     * Returns the fulfillmentProcessLog identified by the specified id.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getFulfillmentProcessLogByIdTest() throws ApiException {
        Integer fulfillmentProcessLogId = null;
        FulfillmentProcessLog response = api.getFulfillmentProcessLogById(fulfillmentProcessLogId);

        // TODO: test validations
    }
    
    /**
     * Get the tags for a fulfillmentProcessLog.
     *
     * Get all existing fulfillmentProcessLog tags.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getFulfillmentProcessLogTagsTest() throws ApiException {
        Integer fulfillmentProcessLogId = null;
        api.getFulfillmentProcessLogTags(fulfillmentProcessLogId);

        // TODO: test validations
    }
    
}
