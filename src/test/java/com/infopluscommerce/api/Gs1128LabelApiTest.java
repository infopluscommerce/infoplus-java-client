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
import com.infopluscommerce.model.Gs1128Label;
import com.infopluscommerce.model.RecordFile;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for Gs1128LabelApi
 */
@Ignore
public class Gs1128LabelApiTest {

    private final Gs1128LabelApi api = new Gs1128LabelApi();

    
    /**
     * Add new audit for a gs1128Label
     *
     * Adds an audit to an existing gs1128Label.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addGs1128LabelAuditTest() throws ApiException {
        Integer gs1128LabelId = null;
        String gs1128LabelAudit = null;
        api.addGs1128LabelAudit(gs1128LabelId, gs1128LabelAudit);

        // TODO: test validations
    }
    
    /**
     * Attach a file to a gs1128Label
     *
     * Adds a file to an existing gs1128Label.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addGs1128LabelFileTest() throws ApiException {
        Integer gs1128LabelId = null;
        String fileName = null;
        api.addGs1128LabelFile(gs1128LabelId, fileName);

        // TODO: test validations
    }
    
    /**
     * Attach a file to a gs1128Label by URL.
     *
     * Adds a file to an existing gs1128Label by URL.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addGs1128LabelFileByURLTest() throws ApiException {
        RecordFile body = null;
        Integer gs1128LabelId = null;
        api.addGs1128LabelFileByURL(body, gs1128LabelId);

        // TODO: test validations
    }
    
    /**
     * Add new tags for a gs1128Label.
     *
     * Adds a tag to an existing gs1128Label.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addGs1128LabelTagTest() throws ApiException {
        Integer gs1128LabelId = null;
        String gs1128LabelTag = null;
        api.addGs1128LabelTag(gs1128LabelId, gs1128LabelTag);

        // TODO: test validations
    }
    
    /**
     * Delete a gs1128Label
     *
     * Deletes the gs1128Label identified by the specified id.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteGs1128LabelTest() throws ApiException {
        Integer gs1128LabelId = null;
        api.deleteGs1128Label(gs1128LabelId);

        // TODO: test validations
    }
    
    /**
     * Delete a file for a gs1128Label.
     *
     * Deletes an existing gs1128Label file using the specified data.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteGs1128LabelFileTest() throws ApiException {
        Integer gs1128LabelId = null;
        Integer fileId = null;
        api.deleteGs1128LabelFile(gs1128LabelId, fileId);

        // TODO: test validations
    }
    
    /**
     * Delete a tag for a gs1128Label.
     *
     * Deletes an existing gs1128Label tag using the specified data.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteGs1128LabelTagTest() throws ApiException {
        Integer gs1128LabelId = null;
        String gs1128LabelTag = null;
        api.deleteGs1128LabelTag(gs1128LabelId, gs1128LabelTag);

        // TODO: test validations
    }
    
    /**
     * Get a duplicated a gs1128Label by id
     *
     * Returns a duplicated gs1128Label identified by the specified id.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getDuplicateGs1128LabelByIdTest() throws ApiException {
        Integer gs1128LabelId = null;
        Gs1128Label response = api.getDuplicateGs1128LabelById(gs1128LabelId);

        // TODO: test validations
    }
    
    /**
     * Search gs1128Labels by filter
     *
     * Returns the list of gs1128Labels that match the given filter.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getGs1128LabelByFilterTest() throws ApiException {
        String filter = null;
        Integer page = null;
        Integer limit = null;
        String sort = null;
        List<Gs1128Label> response = api.getGs1128LabelByFilter(filter, page, limit, sort);

        // TODO: test validations
    }
    
    /**
     * Get a gs1128Label by id
     *
     * Returns the gs1128Label identified by the specified id.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getGs1128LabelByIdTest() throws ApiException {
        Integer gs1128LabelId = null;
        Gs1128Label response = api.getGs1128LabelById(gs1128LabelId);

        // TODO: test validations
    }
    
    /**
     * Get the files for a gs1128Label.
     *
     * Get all existing gs1128Label files.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getGs1128LabelFilesTest() throws ApiException {
        Integer gs1128LabelId = null;
        api.getGs1128LabelFiles(gs1128LabelId);

        // TODO: test validations
    }
    
    /**
     * Get the tags for a gs1128Label.
     *
     * Get all existing gs1128Label tags.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getGs1128LabelTagsTest() throws ApiException {
        Integer gs1128LabelId = null;
        api.getGs1128LabelTags(gs1128LabelId);

        // TODO: test validations
    }
    
    /**
     * Update a gs1128Label custom fields
     *
     * Updates an existing gs1128Label custom fields using the specified data.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateGs1128LabelCustomFieldsTest() throws ApiException {
        Gs1128Label body = null;
        api.updateGs1128LabelCustomFields(body);

        // TODO: test validations
    }
    
}
