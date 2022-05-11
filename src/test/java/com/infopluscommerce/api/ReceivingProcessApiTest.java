/*
 * Infoplus API
 * Infoplus API.
 *
 * OpenAPI spec version: v3.0
 * Contact: api@infopluscommerce.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.infopluscommerce.api;

import com.infopluscommerce.ApiException;
import com.infopluscommerce.model.ReceivingProcess;
import com.infopluscommerce.model.RecordFile;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ReceivingProcessApi
 */
@Ignore
public class ReceivingProcessApiTest {

    private final ReceivingProcessApi api = new ReceivingProcessApi();

    
    /**
     * Add new audit for a receivingProcess
     *
     * Adds an audit to an existing receivingProcess.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addReceivingProcessAuditTest() throws ApiException {
        Integer receivingProcessId = null;
        String receivingProcessAudit = null;
        api.addReceivingProcessAudit(receivingProcessId, receivingProcessAudit);

        // TODO: test validations
    }
    
    /**
     * Attach a file to a receivingProcess
     *
     * Adds a file to an existing receivingProcess.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addReceivingProcessFileTest() throws ApiException {
        Integer receivingProcessId = null;
        String fileName = null;
        api.addReceivingProcessFile(receivingProcessId, fileName);

        // TODO: test validations
    }
    
    /**
     * Attach a file to a receivingProcess by URL.
     *
     * Adds a file to an existing receivingProcess by URL.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addReceivingProcessFileByURLTest() throws ApiException {
        RecordFile body = null;
        Integer receivingProcessId = null;
        api.addReceivingProcessFileByURL(body, receivingProcessId);

        // TODO: test validations
    }
    
    /**
     * Add new tags for a receivingProcess.
     *
     * Adds a tag to an existing receivingProcess.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addReceivingProcessTagTest() throws ApiException {
        Integer receivingProcessId = null;
        String receivingProcessTag = null;
        api.addReceivingProcessTag(receivingProcessId, receivingProcessTag);

        // TODO: test validations
    }
    
    /**
     * Delete a file for a receivingProcess.
     *
     * Deletes an existing receivingProcess file using the specified data.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteReceivingProcessFileTest() throws ApiException {
        Integer receivingProcessId = null;
        Integer fileId = null;
        api.deleteReceivingProcessFile(receivingProcessId, fileId);

        // TODO: test validations
    }
    
    /**
     * Delete a tag for a receivingProcess.
     *
     * Deletes an existing receivingProcess tag using the specified data.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteReceivingProcessTagTest() throws ApiException {
        Integer receivingProcessId = null;
        String receivingProcessTag = null;
        api.deleteReceivingProcessTag(receivingProcessId, receivingProcessTag);

        // TODO: test validations
    }
    
    /**
     * Get a duplicated a receivingProcess by id
     *
     * Returns a duplicated receivingProcess identified by the specified id.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getDuplicateReceivingProcessByIdTest() throws ApiException {
        Integer receivingProcessId = null;
        ReceivingProcess response = api.getDuplicateReceivingProcessById(receivingProcessId);

        // TODO: test validations
    }
    
    /**
     * Search receivingProcesses by filter
     *
     * Returns the list of receivingProcesses that match the given filter.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getReceivingProcessByFilterTest() throws ApiException {
        String filter = null;
        Integer page = null;
        Integer limit = null;
        String sort = null;
        List<ReceivingProcess> response = api.getReceivingProcessByFilter(filter, page, limit, sort);

        // TODO: test validations
    }
    
    /**
     * Get a receivingProcess by id
     *
     * Returns the receivingProcess identified by the specified id.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getReceivingProcessByIdTest() throws ApiException {
        Integer receivingProcessId = null;
        ReceivingProcess response = api.getReceivingProcessById(receivingProcessId);

        // TODO: test validations
    }
    
    /**
     * Get the files for a receivingProcess.
     *
     * Get all existing receivingProcess files.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getReceivingProcessFilesTest() throws ApiException {
        Integer receivingProcessId = null;
        api.getReceivingProcessFiles(receivingProcessId);

        // TODO: test validations
    }
    
    /**
     * Get the tags for a receivingProcess.
     *
     * Get all existing receivingProcess tags.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getReceivingProcessTagsTest() throws ApiException {
        Integer receivingProcessId = null;
        api.getReceivingProcessTags(receivingProcessId);

        // TODO: test validations
    }
    
    /**
     * Update a receivingProcess custom fields
     *
     * Updates an existing receivingProcess custom fields using the specified data.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateReceivingProcessCustomFieldsTest() throws ApiException {
        ReceivingProcess body = null;
        api.updateReceivingProcessCustomFields(body);

        // TODO: test validations
    }
    
}
