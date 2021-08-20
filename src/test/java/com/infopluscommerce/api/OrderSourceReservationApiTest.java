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
import com.infopluscommerce.model.OrderSourceReservation;
import com.infopluscommerce.model.RecordFile;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for OrderSourceReservationApi
 */
@Ignore
public class OrderSourceReservationApiTest {

    private final OrderSourceReservationApi api = new OrderSourceReservationApi();

    
    /**
     * Create an orderSourceReservation
     *
     * Inserts a new orderSourceReservation using the specified data.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addOrderSourceReservationTest() throws ApiException {
        OrderSourceReservation body = null;
        OrderSourceReservation response = api.addOrderSourceReservation(body);

        // TODO: test validations
    }
    
    /**
     * Add new audit for an orderSourceReservation
     *
     * Adds an audit to an existing orderSourceReservation.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addOrderSourceReservationAuditTest() throws ApiException {
        Integer orderSourceReservationId = null;
        String orderSourceReservationAudit = null;
        api.addOrderSourceReservationAudit(orderSourceReservationId, orderSourceReservationAudit);

        // TODO: test validations
    }
    
    /**
     * Attach a file to an orderSourceReservation
     *
     * Adds a file to an existing orderSourceReservation.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addOrderSourceReservationFileTest() throws ApiException {
        Integer orderSourceReservationId = null;
        String fileName = null;
        api.addOrderSourceReservationFile(orderSourceReservationId, fileName);

        // TODO: test validations
    }
    
    /**
     * Attach a file to an orderSourceReservation by URL.
     *
     * Adds a file to an existing orderSourceReservation by URL.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addOrderSourceReservationFileByURLTest() throws ApiException {
        RecordFile body = null;
        Integer orderSourceReservationId = null;
        api.addOrderSourceReservationFileByURL(body, orderSourceReservationId);

        // TODO: test validations
    }
    
    /**
     * Add new tags for an orderSourceReservation.
     *
     * Adds a tag to an existing orderSourceReservation.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addOrderSourceReservationTagTest() throws ApiException {
        Integer orderSourceReservationId = null;
        String orderSourceReservationTag = null;
        api.addOrderSourceReservationTag(orderSourceReservationId, orderSourceReservationTag);

        // TODO: test validations
    }
    
    /**
     * Delete an orderSourceReservation
     *
     * Deletes the orderSourceReservation identified by the specified id.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteOrderSourceReservationTest() throws ApiException {
        Integer orderSourceReservationId = null;
        api.deleteOrderSourceReservation(orderSourceReservationId);

        // TODO: test validations
    }
    
    /**
     * Delete a file for an orderSourceReservation.
     *
     * Deletes an existing orderSourceReservation file using the specified data.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteOrderSourceReservationFileTest() throws ApiException {
        Integer orderSourceReservationId = null;
        Integer fileId = null;
        api.deleteOrderSourceReservationFile(orderSourceReservationId, fileId);

        // TODO: test validations
    }
    
    /**
     * Delete a tag for an orderSourceReservation.
     *
     * Deletes an existing orderSourceReservation tag using the specified data.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteOrderSourceReservationTagTest() throws ApiException {
        Integer orderSourceReservationId = null;
        String orderSourceReservationTag = null;
        api.deleteOrderSourceReservationTag(orderSourceReservationId, orderSourceReservationTag);

        // TODO: test validations
    }
    
    /**
     * Get a duplicated an orderSourceReservation by id
     *
     * Returns a duplicated orderSourceReservation identified by the specified id.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getDuplicateOrderSourceReservationByIdTest() throws ApiException {
        Integer orderSourceReservationId = null;
        OrderSourceReservation response = api.getDuplicateOrderSourceReservationById(orderSourceReservationId);

        // TODO: test validations
    }
    
    /**
     * Search orderSourceReservations by filter
     *
     * Returns the list of orderSourceReservations that match the given filter.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getOrderSourceReservationByFilterTest() throws ApiException {
        String filter = null;
        Integer page = null;
        Integer limit = null;
        String sort = null;
        List<OrderSourceReservation> response = api.getOrderSourceReservationByFilter(filter, page, limit, sort);

        // TODO: test validations
    }
    
    /**
     * Get an orderSourceReservation by id
     *
     * Returns the orderSourceReservation identified by the specified id.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getOrderSourceReservationByIdTest() throws ApiException {
        Integer orderSourceReservationId = null;
        OrderSourceReservation response = api.getOrderSourceReservationById(orderSourceReservationId);

        // TODO: test validations
    }
    
    /**
     * Get the files for an orderSourceReservation.
     *
     * Get all existing orderSourceReservation files.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getOrderSourceReservationFilesTest() throws ApiException {
        Integer orderSourceReservationId = null;
        api.getOrderSourceReservationFiles(orderSourceReservationId);

        // TODO: test validations
    }
    
    /**
     * Get the tags for an orderSourceReservation.
     *
     * Get all existing orderSourceReservation tags.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getOrderSourceReservationTagsTest() throws ApiException {
        Integer orderSourceReservationId = null;
        api.getOrderSourceReservationTags(orderSourceReservationId);

        // TODO: test validations
    }
    
    /**
     * Update an orderSourceReservation
     *
     * Updates an existing orderSourceReservation using the specified data.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateOrderSourceReservationTest() throws ApiException {
        OrderSourceReservation body = null;
        api.updateOrderSourceReservation(body);

        // TODO: test validations
    }
    
    /**
     * Update an orderSourceReservation custom fields
     *
     * Updates an existing orderSourceReservation custom fields using the specified data.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateOrderSourceReservationCustomFieldsTest() throws ApiException {
        OrderSourceReservation body = null;
        api.updateOrderSourceReservationCustomFields(body);

        // TODO: test validations
    }
    
}
