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
import com.infopluscommerce.model.Load;
import com.infopluscommerce.model.RecordFile;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for LoadApi
 */
@Ignore
public class LoadApiTest {

    private final LoadApi api = new LoadApi();

    
    /**
     * Add new audit for a load
     *
     * Adds an audit to an existing load.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addLoadAuditTest() throws ApiException {
        Integer loadId = null;
        String loadAudit = null;
        api.addLoadAudit(loadId, loadAudit);

        // TODO: test validations
    }
    
    /**
     * Attach a file to a load
     *
     * Adds a file to an existing load.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addLoadFileTest() throws ApiException {
        Integer loadId = null;
        String fileName = null;
        api.addLoadFile(loadId, fileName);

        // TODO: test validations
    }
    
    /**
     * Attach a file to a load by URL.
     *
     * Adds a file to an existing load by URL.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addLoadFileByURLTest() throws ApiException {
        RecordFile body = null;
        Integer loadId = null;
        api.addLoadFileByURL(body, loadId);

        // TODO: test validations
    }
    
    /**
     * Add new tags for a load.
     *
     * Adds a tag to an existing load.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addLoadTagTest() throws ApiException {
        Integer loadId = null;
        String loadTag = null;
        api.addLoadTag(loadId, loadTag);

        // TODO: test validations
    }
    
    /**
     * Delete a file for a load.
     *
     * Deletes an existing load file using the specified data.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteLoadFileTest() throws ApiException {
        Integer loadId = null;
        Integer fileId = null;
        api.deleteLoadFile(loadId, fileId);

        // TODO: test validations
    }
    
    /**
     * Delete a tag for a load.
     *
     * Deletes an existing load tag using the specified data.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteLoadTagTest() throws ApiException {
        Integer loadId = null;
        String loadTag = null;
        api.deleteLoadTag(loadId, loadTag);

        // TODO: test validations
    }
    
    /**
     * Get a duplicated a load by id
     *
     * Returns a duplicated load identified by the specified id.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getDuplicateLoadByIdTest() throws ApiException {
        Integer loadId = null;
        Load response = api.getDuplicateLoadById(loadId);

        // TODO: test validations
    }
    
    /**
     * Search loads by filter
     *
     * Returns the list of loads that match the given filter.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getLoadByFilterTest() throws ApiException {
        String filter = null;
        Integer page = null;
        Integer limit = null;
        String sort = null;
        List<Load> response = api.getLoadByFilter(filter, page, limit, sort);

        // TODO: test validations
    }
    
    /**
     * Get a load by id
     *
     * Returns the load identified by the specified id.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getLoadByIdTest() throws ApiException {
        Integer loadId = null;
        Load response = api.getLoadById(loadId);

        // TODO: test validations
    }
    
    /**
     * Get the files for a load.
     *
     * Get all existing load files.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getLoadFilesTest() throws ApiException {
        Integer loadId = null;
        api.getLoadFiles(loadId);

        // TODO: test validations
    }
    
    /**
     * Get the tags for a load.
     *
     * Get all existing load tags.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getLoadTagsTest() throws ApiException {
        Integer loadId = null;
        api.getLoadTags(loadId);

        // TODO: test validations
    }
    
    /**
     * Update a load custom fields
     *
     * Updates an existing load custom fields using the specified data.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateLoadCustomFieldsTest() throws ApiException {
        Load body = null;
        api.updateLoadCustomFields(body);

        // TODO: test validations
    }
    
}
