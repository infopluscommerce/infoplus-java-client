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
import com.infopluscommerce.model.ModelApiResponse;
import com.infopluscommerce.model.PalletType;
import com.infopluscommerce.model.RecordFile;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for PalletTypeApi
 */
@Ignore
public class PalletTypeApiTest {

    private final PalletTypeApi api = new PalletTypeApi();

    
    /**
     * Create a palletType
     *
     * Inserts a new palletType using the specified data.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addPalletTypeTest() throws ApiException {
        PalletType body = null;
        PalletType response = api.addPalletType(body);

        // TODO: test validations
    }
    
    /**
     * Add new audit for a palletType
     *
     * Adds an audit to an existing palletType.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addPalletTypeAuditTest() throws ApiException {
        Integer palletTypeId = null;
        String palletTypeAudit = null;
        api.addPalletTypeAudit(palletTypeId, palletTypeAudit);

        // TODO: test validations
    }
    
    /**
     * Attach a file to a palletType
     *
     * Adds a file to an existing palletType.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addPalletTypeFileTest() throws ApiException {
        Integer palletTypeId = null;
        String fileName = null;
        api.addPalletTypeFile(palletTypeId, fileName);

        // TODO: test validations
    }
    
    /**
     * Attach a file to a palletType by URL.
     *
     * Adds a file to an existing palletType by URL.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addPalletTypeFileByURLTest() throws ApiException {
        RecordFile body = null;
        Integer palletTypeId = null;
        api.addPalletTypeFileByURL(body, palletTypeId);

        // TODO: test validations
    }
    
    /**
     * Add new tags for a palletType.
     *
     * Adds a tag to an existing palletType.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addPalletTypeTagTest() throws ApiException {
        Integer palletTypeId = null;
        String palletTypeTag = null;
        api.addPalletTypeTag(palletTypeId, palletTypeTag);

        // TODO: test validations
    }
    
    /**
     * Delete a palletType
     *
     * Deletes the palletType identified by the specified id.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deletePalletTypeTest() throws ApiException {
        Integer palletTypeId = null;
        api.deletePalletType(palletTypeId);

        // TODO: test validations
    }
    
    /**
     * Delete a file for a palletType.
     *
     * Deletes an existing palletType file using the specified data.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deletePalletTypeFileTest() throws ApiException {
        Integer palletTypeId = null;
        Integer fileId = null;
        api.deletePalletTypeFile(palletTypeId, fileId);

        // TODO: test validations
    }
    
    /**
     * Delete a tag for a palletType.
     *
     * Deletes an existing palletType tag using the specified data.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deletePalletTypeTagTest() throws ApiException {
        Integer palletTypeId = null;
        String palletTypeTag = null;
        api.deletePalletTypeTag(palletTypeId, palletTypeTag);

        // TODO: test validations
    }
    
    /**
     * Get a duplicated a palletType by id
     *
     * Returns a duplicated palletType identified by the specified id.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getDuplicatePalletTypeByIdTest() throws ApiException {
        Integer palletTypeId = null;
        PalletType response = api.getDuplicatePalletTypeById(palletTypeId);

        // TODO: test validations
    }
    
    /**
     * Search palletTypes by filter
     *
     * Returns the list of palletTypes that match the given filter.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getPalletTypeByFilterTest() throws ApiException {
        String filter = null;
        Integer page = null;
        Integer limit = null;
        String sort = null;
        List<PalletType> response = api.getPalletTypeByFilter(filter, page, limit, sort);

        // TODO: test validations
    }
    
    /**
     * Get a palletType by id
     *
     * Returns the palletType identified by the specified id.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getPalletTypeByIdTest() throws ApiException {
        Integer palletTypeId = null;
        PalletType response = api.getPalletTypeById(palletTypeId);

        // TODO: test validations
    }
    
    /**
     * Get the files for a palletType.
     *
     * Get all existing palletType files.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getPalletTypeFilesTest() throws ApiException {
        Integer palletTypeId = null;
        api.getPalletTypeFiles(palletTypeId);

        // TODO: test validations
    }
    
    /**
     * Get the tags for a palletType.
     *
     * Get all existing palletType tags.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getPalletTypeTagsTest() throws ApiException {
        Integer palletTypeId = null;
        api.getPalletTypeTags(palletTypeId);

        // TODO: test validations
    }
    
    /**
     * Update a palletType
     *
     * Updates an existing palletType using the specified data.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updatePalletTypeTest() throws ApiException {
        PalletType body = null;
        api.updatePalletType(body);

        // TODO: test validations
    }
    
    /**
     * Update a palletType custom fields
     *
     * Updates an existing palletType custom fields using the specified data.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updatePalletTypeCustomFieldsTest() throws ApiException {
        PalletType body = null;
        api.updatePalletTypeCustomFields(body);

        // TODO: test validations
    }
    
}
