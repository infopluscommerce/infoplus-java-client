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
import com.infopluscommerce.model.LocationAddressScheme;
import com.infopluscommerce.model.ModelApiResponse;
import com.infopluscommerce.model.RecordFile;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for LocationAddressSchemeApi
 */
@Ignore
public class LocationAddressSchemeApiTest {

    private final LocationAddressSchemeApi api = new LocationAddressSchemeApi();

    
    /**
     * Create a locationAddressScheme
     *
     * Inserts a new locationAddressScheme using the specified data.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addLocationAddressSchemeTest() throws ApiException {
        LocationAddressScheme body = null;
        LocationAddressScheme response = api.addLocationAddressScheme(body);

        // TODO: test validations
    }
    
    /**
     * Add new audit for a locationAddressScheme
     *
     * Adds an audit to an existing locationAddressScheme.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addLocationAddressSchemeAuditTest() throws ApiException {
        Integer locationAddressSchemeId = null;
        String locationAddressSchemeAudit = null;
        api.addLocationAddressSchemeAudit(locationAddressSchemeId, locationAddressSchemeAudit);

        // TODO: test validations
    }
    
    /**
     * Attach a file to a locationAddressScheme
     *
     * Adds a file to an existing locationAddressScheme.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addLocationAddressSchemeFileTest() throws ApiException {
        Integer locationAddressSchemeId = null;
        String fileName = null;
        api.addLocationAddressSchemeFile(locationAddressSchemeId, fileName);

        // TODO: test validations
    }
    
    /**
     * Attach a file to a locationAddressScheme by URL.
     *
     * Adds a file to an existing locationAddressScheme by URL.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addLocationAddressSchemeFileByURLTest() throws ApiException {
        RecordFile body = null;
        Integer locationAddressSchemeId = null;
        api.addLocationAddressSchemeFileByURL(body, locationAddressSchemeId);

        // TODO: test validations
    }
    
    /**
     * Add new tags for a locationAddressScheme.
     *
     * Adds a tag to an existing locationAddressScheme.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addLocationAddressSchemeTagTest() throws ApiException {
        Integer locationAddressSchemeId = null;
        String locationAddressSchemeTag = null;
        api.addLocationAddressSchemeTag(locationAddressSchemeId, locationAddressSchemeTag);

        // TODO: test validations
    }
    
    /**
     * Delete a locationAddressScheme
     *
     * Deletes the locationAddressScheme identified by the specified id.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteLocationAddressSchemeTest() throws ApiException {
        Integer locationAddressSchemeId = null;
        api.deleteLocationAddressScheme(locationAddressSchemeId);

        // TODO: test validations
    }
    
    /**
     * Delete a file for a locationAddressScheme.
     *
     * Deletes an existing locationAddressScheme file using the specified data.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteLocationAddressSchemeFileTest() throws ApiException {
        Integer locationAddressSchemeId = null;
        Integer fileId = null;
        api.deleteLocationAddressSchemeFile(locationAddressSchemeId, fileId);

        // TODO: test validations
    }
    
    /**
     * Delete a tag for a locationAddressScheme.
     *
     * Deletes an existing locationAddressScheme tag using the specified data.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteLocationAddressSchemeTagTest() throws ApiException {
        Integer locationAddressSchemeId = null;
        String locationAddressSchemeTag = null;
        api.deleteLocationAddressSchemeTag(locationAddressSchemeId, locationAddressSchemeTag);

        // TODO: test validations
    }
    
    /**
     * Get a duplicated a locationAddressScheme by id
     *
     * Returns a duplicated locationAddressScheme identified by the specified id.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getDuplicateLocationAddressSchemeByIdTest() throws ApiException {
        Integer locationAddressSchemeId = null;
        LocationAddressScheme response = api.getDuplicateLocationAddressSchemeById(locationAddressSchemeId);

        // TODO: test validations
    }
    
    /**
     * Search locationAddressSchemes by filter
     *
     * Returns the list of locationAddressSchemes that match the given filter.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getLocationAddressSchemeByFilterTest() throws ApiException {
        String filter = null;
        Integer page = null;
        Integer limit = null;
        String sort = null;
        List<LocationAddressScheme> response = api.getLocationAddressSchemeByFilter(filter, page, limit, sort);

        // TODO: test validations
    }
    
    /**
     * Get a locationAddressScheme by id
     *
     * Returns the locationAddressScheme identified by the specified id.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getLocationAddressSchemeByIdTest() throws ApiException {
        Integer locationAddressSchemeId = null;
        LocationAddressScheme response = api.getLocationAddressSchemeById(locationAddressSchemeId);

        // TODO: test validations
    }
    
    /**
     * Get the files for a locationAddressScheme.
     *
     * Get all existing locationAddressScheme files.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getLocationAddressSchemeFilesTest() throws ApiException {
        Integer locationAddressSchemeId = null;
        api.getLocationAddressSchemeFiles(locationAddressSchemeId);

        // TODO: test validations
    }
    
    /**
     * Get the tags for a locationAddressScheme.
     *
     * Get all existing locationAddressScheme tags.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getLocationAddressSchemeTagsTest() throws ApiException {
        Integer locationAddressSchemeId = null;
        api.getLocationAddressSchemeTags(locationAddressSchemeId);

        // TODO: test validations
    }
    
    /**
     * Update a locationAddressScheme
     *
     * Updates an existing locationAddressScheme using the specified data.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateLocationAddressSchemeTest() throws ApiException {
        LocationAddressScheme body = null;
        api.updateLocationAddressScheme(body);

        // TODO: test validations
    }
    
    /**
     * Update a locationAddressScheme custom fields
     *
     * Updates an existing locationAddressScheme custom fields using the specified data.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateLocationAddressSchemeCustomFieldsTest() throws ApiException {
        LocationAddressScheme body = null;
        api.updateLocationAddressSchemeCustomFields(body);

        // TODO: test validations
    }
    
}
