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
import com.infopluscommerce.model.ItemSubCategory;
import com.infopluscommerce.model.ModelApiResponse;
import com.infopluscommerce.model.RecordFile;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ItemSubCategoryApi
 */
@Ignore
public class ItemSubCategoryApiTest {

    private final ItemSubCategoryApi api = new ItemSubCategoryApi();

    
    /**
     * Create an itemSubCategory
     *
     * Inserts a new itemSubCategory using the specified data.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addItemSubCategoryTest() throws ApiException {
        ItemSubCategory body = null;
        ItemSubCategory response = api.addItemSubCategory(body);

        // TODO: test validations
    }
    
    /**
     * Add new audit for an itemSubCategory
     *
     * Adds an audit to an existing itemSubCategory.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addItemSubCategoryAuditTest() throws ApiException {
        Integer itemSubCategoryId = null;
        String itemSubCategoryAudit = null;
        api.addItemSubCategoryAudit(itemSubCategoryId, itemSubCategoryAudit);

        // TODO: test validations
    }
    
    /**
     * Attach a file to an itemSubCategory
     *
     * Adds a file to an existing itemSubCategory.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addItemSubCategoryFileTest() throws ApiException {
        Integer itemSubCategoryId = null;
        String fileName = null;
        api.addItemSubCategoryFile(itemSubCategoryId, fileName);

        // TODO: test validations
    }
    
    /**
     * Attach a file to an itemSubCategory by URL.
     *
     * Adds a file to an existing itemSubCategory by URL.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addItemSubCategoryFileByURLTest() throws ApiException {
        RecordFile body = null;
        Integer itemSubCategoryId = null;
        api.addItemSubCategoryFileByURL(body, itemSubCategoryId);

        // TODO: test validations
    }
    
    /**
     * Add new tags for an itemSubCategory.
     *
     * Adds a tag to an existing itemSubCategory.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addItemSubCategoryTagTest() throws ApiException {
        Integer itemSubCategoryId = null;
        String itemSubCategoryTag = null;
        api.addItemSubCategoryTag(itemSubCategoryId, itemSubCategoryTag);

        // TODO: test validations
    }
    
    /**
     * Delete an itemSubCategory
     *
     * Deletes the itemSubCategory identified by the specified id.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteItemSubCategoryTest() throws ApiException {
        Integer itemSubCategoryId = null;
        api.deleteItemSubCategory(itemSubCategoryId);

        // TODO: test validations
    }
    
    /**
     * Delete a file for an itemSubCategory.
     *
     * Deletes an existing itemSubCategory file using the specified data.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteItemSubCategoryFileTest() throws ApiException {
        Integer itemSubCategoryId = null;
        Integer fileId = null;
        api.deleteItemSubCategoryFile(itemSubCategoryId, fileId);

        // TODO: test validations
    }
    
    /**
     * Delete a tag for an itemSubCategory.
     *
     * Deletes an existing itemSubCategory tag using the specified data.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteItemSubCategoryTagTest() throws ApiException {
        Integer itemSubCategoryId = null;
        String itemSubCategoryTag = null;
        api.deleteItemSubCategoryTag(itemSubCategoryId, itemSubCategoryTag);

        // TODO: test validations
    }
    
    /**
     * Get a duplicated an itemSubCategory by id
     *
     * Returns a duplicated itemSubCategory identified by the specified id.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getDuplicateItemSubCategoryByIdTest() throws ApiException {
        Integer itemSubCategoryId = null;
        ItemSubCategory response = api.getDuplicateItemSubCategoryById(itemSubCategoryId);

        // TODO: test validations
    }
    
    /**
     * Search itemSubCategorys by filter
     *
     * Returns the list of itemSubCategorys that match the given filter.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getItemSubCategoryByFilterTest() throws ApiException {
        String filter = null;
        Integer page = null;
        Integer limit = null;
        String sort = null;
        List<ItemSubCategory> response = api.getItemSubCategoryByFilter(filter, page, limit, sort);

        // TODO: test validations
    }
    
    /**
     * Get an itemSubCategory by id
     *
     * Returns the itemSubCategory identified by the specified id.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getItemSubCategoryByIdTest() throws ApiException {
        Integer itemSubCategoryId = null;
        ItemSubCategory response = api.getItemSubCategoryById(itemSubCategoryId);

        // TODO: test validations
    }
    
    /**
     * Get the files for an itemSubCategory.
     *
     * Get all existing itemSubCategory files.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getItemSubCategoryFilesTest() throws ApiException {
        Integer itemSubCategoryId = null;
        api.getItemSubCategoryFiles(itemSubCategoryId);

        // TODO: test validations
    }
    
    /**
     * Get the tags for an itemSubCategory.
     *
     * Get all existing itemSubCategory tags.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getItemSubCategoryTagsTest() throws ApiException {
        Integer itemSubCategoryId = null;
        api.getItemSubCategoryTags(itemSubCategoryId);

        // TODO: test validations
    }
    
    /**
     * Update an itemSubCategory
     *
     * Updates an existing itemSubCategory using the specified data.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateItemSubCategoryTest() throws ApiException {
        ItemSubCategory body = null;
        api.updateItemSubCategory(body);

        // TODO: test validations
    }
    
}
