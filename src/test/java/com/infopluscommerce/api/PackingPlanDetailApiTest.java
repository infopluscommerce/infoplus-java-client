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
import com.infopluscommerce.model.PackingPlanDetail;
import com.infopluscommerce.model.RecordFile;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for PackingPlanDetailApi
 */
@Ignore
public class PackingPlanDetailApiTest {

    private final PackingPlanDetailApi api = new PackingPlanDetailApi();

    
    /**
     * Add new audit for a packingPlanDetail
     *
     * Adds an audit to an existing packingPlanDetail.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addPackingPlanDetailAuditTest() throws ApiException {
        Integer packingPlanDetailId = null;
        String packingPlanDetailAudit = null;
        api.addPackingPlanDetailAudit(packingPlanDetailId, packingPlanDetailAudit);

        // TODO: test validations
    }
    
    /**
     * Attach a file to a packingPlanDetail
     *
     * Adds a file to an existing packingPlanDetail.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addPackingPlanDetailFileTest() throws ApiException {
        Integer packingPlanDetailId = null;
        String fileName = null;
        api.addPackingPlanDetailFile(packingPlanDetailId, fileName);

        // TODO: test validations
    }
    
    /**
     * Attach a file to a packingPlanDetail by URL.
     *
     * Adds a file to an existing packingPlanDetail by URL.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addPackingPlanDetailFileByURLTest() throws ApiException {
        RecordFile body = null;
        Integer packingPlanDetailId = null;
        api.addPackingPlanDetailFileByURL(body, packingPlanDetailId);

        // TODO: test validations
    }
    
    /**
     * Add new tags for a packingPlanDetail.
     *
     * Adds a tag to an existing packingPlanDetail.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addPackingPlanDetailTagTest() throws ApiException {
        Integer packingPlanDetailId = null;
        String packingPlanDetailTag = null;
        api.addPackingPlanDetailTag(packingPlanDetailId, packingPlanDetailTag);

        // TODO: test validations
    }
    
    /**
     * Delete a file for a packingPlanDetail.
     *
     * Deletes an existing packingPlanDetail file using the specified data.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deletePackingPlanDetailFileTest() throws ApiException {
        Integer packingPlanDetailId = null;
        Integer fileId = null;
        api.deletePackingPlanDetailFile(packingPlanDetailId, fileId);

        // TODO: test validations
    }
    
    /**
     * Delete a tag for a packingPlanDetail.
     *
     * Deletes an existing packingPlanDetail tag using the specified data.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deletePackingPlanDetailTagTest() throws ApiException {
        Integer packingPlanDetailId = null;
        String packingPlanDetailTag = null;
        api.deletePackingPlanDetailTag(packingPlanDetailId, packingPlanDetailTag);

        // TODO: test validations
    }
    
    /**
     * Get a duplicated a packingPlanDetail by id
     *
     * Returns a duplicated packingPlanDetail identified by the specified id.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getDuplicatePackingPlanDetailByIdTest() throws ApiException {
        Integer packingPlanDetailId = null;
        PackingPlanDetail response = api.getDuplicatePackingPlanDetailById(packingPlanDetailId);

        // TODO: test validations
    }
    
    /**
     * Search packingPlanDetails by filter
     *
     * Returns the list of packingPlanDetails that match the given filter.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getPackingPlanDetailByFilterTest() throws ApiException {
        String filter = null;
        Integer page = null;
        Integer limit = null;
        String sort = null;
        List<PackingPlanDetail> response = api.getPackingPlanDetailByFilter(filter, page, limit, sort);

        // TODO: test validations
    }
    
    /**
     * Get a packingPlanDetail by id
     *
     * Returns the packingPlanDetail identified by the specified id.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getPackingPlanDetailByIdTest() throws ApiException {
        Integer packingPlanDetailId = null;
        PackingPlanDetail response = api.getPackingPlanDetailById(packingPlanDetailId);

        // TODO: test validations
    }
    
    /**
     * Get the files for a packingPlanDetail.
     *
     * Get all existing packingPlanDetail files.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getPackingPlanDetailFilesTest() throws ApiException {
        Integer packingPlanDetailId = null;
        api.getPackingPlanDetailFiles(packingPlanDetailId);

        // TODO: test validations
    }
    
    /**
     * Get the tags for a packingPlanDetail.
     *
     * Get all existing packingPlanDetail tags.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getPackingPlanDetailTagsTest() throws ApiException {
        Integer packingPlanDetailId = null;
        api.getPackingPlanDetailTags(packingPlanDetailId);

        // TODO: test validations
    }
    
    /**
     * Update a packingPlanDetail custom fields
     *
     * Updates an existing packingPlanDetail custom fields using the specified data.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updatePackingPlanDetailCustomFieldsTest() throws ApiException {
        PackingPlanDetail body = null;
        api.updatePackingPlanDetailCustomFields(body);

        // TODO: test validations
    }
    
}
