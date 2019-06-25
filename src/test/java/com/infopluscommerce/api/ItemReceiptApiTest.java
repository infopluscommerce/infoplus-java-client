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
import com.infopluscommerce.model.ItemReceipt;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ItemReceiptApi
 */
@Ignore
public class ItemReceiptApiTest {

    private final ItemReceiptApi api = new ItemReceiptApi();

    
    /**
     * Add new audit for an itemReceipt
     *
     * Adds an audit to an existing itemReceipt.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addItemReceiptAuditTest() throws ApiException {
        Integer itemReceiptId = null;
        String itemReceiptAudit = null;
        api.addItemReceiptAudit(itemReceiptId, itemReceiptAudit);

        // TODO: test validations
    }
    
    /**
     * Attach a file to an itemReceipt
     *
     * Adds a file to an existing itemReceipt.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addItemReceiptFileTest() throws ApiException {
        Integer itemReceiptId = null;
        String fileName = null;
        api.addItemReceiptFile(itemReceiptId, fileName);

        // TODO: test validations
    }
    
    /**
     * Add new tags for an itemReceipt.
     *
     * Adds a tag to an existing itemReceipt.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addItemReceiptTagTest() throws ApiException {
        Integer itemReceiptId = null;
        String itemReceiptTag = null;
        api.addItemReceiptTag(itemReceiptId, itemReceiptTag);

        // TODO: test validations
    }
    
    /**
     * Delete a tag for an itemReceipt.
     *
     * Deletes an existing itemReceipt tag using the specified data.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteItemReceiptTagTest() throws ApiException {
        Integer itemReceiptId = null;
        String itemReceiptTag = null;
        api.deleteItemReceiptTag(itemReceiptId, itemReceiptTag);

        // TODO: test validations
    }
    
    /**
     * Get a duplicated an itemReceipt by id
     *
     * Returns a duplicated itemReceipt identified by the specified id.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getDuplicateItemReceiptByIdTest() throws ApiException {
        Integer itemReceiptId = null;
        ItemReceipt response = api.getDuplicateItemReceiptById(itemReceiptId);

        // TODO: test validations
    }
    
    /**
     * Search itemReceipts by filter
     *
     * Returns the list of itemReceipts that match the given filter.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getItemReceiptByFilterTest() throws ApiException {
        String filter = null;
        Integer page = null;
        Integer limit = null;
        String sort = null;
        List<ItemReceipt> response = api.getItemReceiptByFilter(filter, page, limit, sort);

        // TODO: test validations
    }
    
    /**
     * Get an itemReceipt by id
     *
     * Returns the itemReceipt identified by the specified id.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getItemReceiptByIdTest() throws ApiException {
        Integer itemReceiptId = null;
        ItemReceipt response = api.getItemReceiptById(itemReceiptId);

        // TODO: test validations
    }
    
    /**
     * Get the tags for an itemReceipt.
     *
     * Get all existing itemReceipt tags.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getItemReceiptTagsTest() throws ApiException {
        Integer itemReceiptId = null;
        api.getItemReceiptTags(itemReceiptId);

        // TODO: test validations
    }
    
    /**
     * Update an itemReceipt
     *
     * Updates an existing itemReceipt using the specified data.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateItemReceiptTest() throws ApiException {
        ItemReceipt body = null;
        api.updateItemReceipt(body);

        // TODO: test validations
    }
    
    /**
     * Update an itemReceipt custom fields
     *
     * Updates an existing itemReceipt custom fields using the specified data.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateItemReceiptCustomFieldsTest() throws ApiException {
        ItemReceipt body = null;
        api.updateItemReceiptCustomFields(body);

        // TODO: test validations
    }
    
}
