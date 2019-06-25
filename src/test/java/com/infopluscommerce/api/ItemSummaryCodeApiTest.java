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
import com.infopluscommerce.model.ItemSummaryCode;
import com.infopluscommerce.model.ModelApiResponse;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ItemSummaryCodeApi
 */
@Ignore
public class ItemSummaryCodeApiTest {

    private final ItemSummaryCodeApi api = new ItemSummaryCodeApi();

    
    /**
     * Create an itemSummaryCode
     *
     * Inserts a new itemSummaryCode using the specified data.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addItemSummaryCodeTest() throws ApiException {
        ItemSummaryCode body = null;
        ItemSummaryCode response = api.addItemSummaryCode(body);

        // TODO: test validations
    }
    
    /**
     * Add new audit for an itemSummaryCode
     *
     * Adds an audit to an existing itemSummaryCode.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addItemSummaryCodeAuditTest() throws ApiException {
        Integer itemSummaryCodeId = null;
        String itemSummaryCodeAudit = null;
        api.addItemSummaryCodeAudit(itemSummaryCodeId, itemSummaryCodeAudit);

        // TODO: test validations
    }
    
    /**
     * Attach a file to an itemSummaryCode
     *
     * Adds a file to an existing itemSummaryCode.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addItemSummaryCodeFileTest() throws ApiException {
        Integer itemSummaryCodeId = null;
        String fileName = null;
        api.addItemSummaryCodeFile(itemSummaryCodeId, fileName);

        // TODO: test validations
    }
    
    /**
     * Add new tags for an itemSummaryCode.
     *
     * Adds a tag to an existing itemSummaryCode.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addItemSummaryCodeTagTest() throws ApiException {
        Integer itemSummaryCodeId = null;
        String itemSummaryCodeTag = null;
        api.addItemSummaryCodeTag(itemSummaryCodeId, itemSummaryCodeTag);

        // TODO: test validations
    }
    
    /**
     * Delete an itemSummaryCode
     *
     * Deletes the itemSummaryCode identified by the specified id.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteItemSummaryCodeTest() throws ApiException {
        Integer itemSummaryCodeId = null;
        api.deleteItemSummaryCode(itemSummaryCodeId);

        // TODO: test validations
    }
    
    /**
     * Delete a tag for an itemSummaryCode.
     *
     * Deletes an existing itemSummaryCode tag using the specified data.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteItemSummaryCodeTagTest() throws ApiException {
        Integer itemSummaryCodeId = null;
        String itemSummaryCodeTag = null;
        api.deleteItemSummaryCodeTag(itemSummaryCodeId, itemSummaryCodeTag);

        // TODO: test validations
    }
    
    /**
     * Get a duplicated an itemSummaryCode by id
     *
     * Returns a duplicated itemSummaryCode identified by the specified id.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getDuplicateItemSummaryCodeByIdTest() throws ApiException {
        Integer itemSummaryCodeId = null;
        ItemSummaryCode response = api.getDuplicateItemSummaryCodeById(itemSummaryCodeId);

        // TODO: test validations
    }
    
    /**
     * Search itemSummaryCodes by filter
     *
     * Returns the list of itemSummaryCodes that match the given filter.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getItemSummaryCodeByFilterTest() throws ApiException {
        String filter = null;
        Integer page = null;
        Integer limit = null;
        String sort = null;
        List<ItemSummaryCode> response = api.getItemSummaryCodeByFilter(filter, page, limit, sort);

        // TODO: test validations
    }
    
    /**
     * Get an itemSummaryCode by id
     *
     * Returns the itemSummaryCode identified by the specified id.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getItemSummaryCodeByIdTest() throws ApiException {
        Integer itemSummaryCodeId = null;
        ItemSummaryCode response = api.getItemSummaryCodeById(itemSummaryCodeId);

        // TODO: test validations
    }
    
    /**
     * Get the tags for an itemSummaryCode.
     *
     * Get all existing itemSummaryCode tags.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getItemSummaryCodeTagsTest() throws ApiException {
        Integer itemSummaryCodeId = null;
        api.getItemSummaryCodeTags(itemSummaryCodeId);

        // TODO: test validations
    }
    
    /**
     * Update an itemSummaryCode
     *
     * Updates an existing itemSummaryCode using the specified data.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateItemSummaryCodeTest() throws ApiException {
        ItemSummaryCode body = null;
        api.updateItemSummaryCode(body);

        // TODO: test validations
    }
    
}
