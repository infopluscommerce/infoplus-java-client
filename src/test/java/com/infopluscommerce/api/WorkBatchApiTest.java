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
import com.infopluscommerce.model.RecordFile;
import com.infopluscommerce.model.WorkBatch;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for WorkBatchApi
 */
@Ignore
public class WorkBatchApiTest {

    private final WorkBatchApi api = new WorkBatchApi();

    
    /**
     * Add new audit for a workBatch
     *
     * Adds an audit to an existing workBatch.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addWorkBatchAuditTest() throws ApiException {
        Integer workBatchId = null;
        String workBatchAudit = null;
        api.addWorkBatchAudit(workBatchId, workBatchAudit);

        // TODO: test validations
    }
    
    /**
     * Attach a file to a workBatch
     *
     * Adds a file to an existing workBatch.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addWorkBatchFileTest() throws ApiException {
        Integer workBatchId = null;
        String fileName = null;
        api.addWorkBatchFile(workBatchId, fileName);

        // TODO: test validations
    }
    
    /**
     * Attach a file to a workBatch by URL.
     *
     * Adds a file to an existing workBatch by URL.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addWorkBatchFileByURLTest() throws ApiException {
        RecordFile body = null;
        Integer workBatchId = null;
        api.addWorkBatchFileByURL(body, workBatchId);

        // TODO: test validations
    }
    
    /**
     * Add new tags for a workBatch.
     *
     * Adds a tag to an existing workBatch.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addWorkBatchTagTest() throws ApiException {
        Integer workBatchId = null;
        String workBatchTag = null;
        api.addWorkBatchTag(workBatchId, workBatchTag);

        // TODO: test validations
    }
    
    /**
     * Delete a file for a workBatch.
     *
     * Deletes an existing workBatch file using the specified data.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteWorkBatchFileTest() throws ApiException {
        Integer workBatchId = null;
        Integer fileId = null;
        api.deleteWorkBatchFile(workBatchId, fileId);

        // TODO: test validations
    }
    
    /**
     * Delete a tag for a workBatch.
     *
     * Deletes an existing workBatch tag using the specified data.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteWorkBatchTagTest() throws ApiException {
        Integer workBatchId = null;
        String workBatchTag = null;
        api.deleteWorkBatchTag(workBatchId, workBatchTag);

        // TODO: test validations
    }
    
    /**
     * Get a duplicated a workBatch by id
     *
     * Returns a duplicated workBatch identified by the specified id.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getDuplicateWorkBatchByIdTest() throws ApiException {
        Integer workBatchId = null;
        WorkBatch response = api.getDuplicateWorkBatchById(workBatchId);

        // TODO: test validations
    }
    
    /**
     * Search workBatchs by filter
     *
     * Returns the list of workBatchs that match the given filter.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getWorkBatchByFilterTest() throws ApiException {
        String filter = null;
        Integer page = null;
        Integer limit = null;
        String sort = null;
        List<WorkBatch> response = api.getWorkBatchByFilter(filter, page, limit, sort);

        // TODO: test validations
    }
    
    /**
     * Get a workBatch by id
     *
     * Returns the workBatch identified by the specified id.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getWorkBatchByIdTest() throws ApiException {
        Integer workBatchId = null;
        WorkBatch response = api.getWorkBatchById(workBatchId);

        // TODO: test validations
    }
    
    /**
     * Get the files for a workBatch.
     *
     * Get all existing workBatch files.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getWorkBatchFilesTest() throws ApiException {
        Integer workBatchId = null;
        api.getWorkBatchFiles(workBatchId);

        // TODO: test validations
    }
    
    /**
     * Get the tags for a workBatch.
     *
     * Get all existing workBatch tags.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getWorkBatchTagsTest() throws ApiException {
        Integer workBatchId = null;
        api.getWorkBatchTags(workBatchId);

        // TODO: test validations
    }
    
    /**
     * Update a workBatch
     *
     * Updates an existing workBatch using the specified data.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateWorkBatchTest() throws ApiException {
        WorkBatch body = null;
        api.updateWorkBatch(body);

        // TODO: test validations
    }
    
    /**
     * Update a workBatch custom fields
     *
     * Updates an existing workBatch custom fields using the specified data.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateWorkBatchCustomFieldsTest() throws ApiException {
        WorkBatch body = null;
        api.updateWorkBatchCustomFields(body);

        // TODO: test validations
    }
    
}
