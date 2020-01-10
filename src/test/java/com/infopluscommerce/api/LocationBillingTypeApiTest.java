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
import com.infopluscommerce.model.LocationBillingType;
import com.infopluscommerce.model.ModelApiResponse;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for LocationBillingTypeApi
 */
@Ignore
public class LocationBillingTypeApiTest {

    private final LocationBillingTypeApi api = new LocationBillingTypeApi();

    
    /**
     * Create a locationBillingType
     *
     * Inserts a new locationBillingType using the specified data.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addLocationBillingTypeTest() throws ApiException {
        LocationBillingType body = null;
        LocationBillingType response = api.addLocationBillingType(body);

        // TODO: test validations
    }
    
    /**
     * Add new audit for a locationBillingType
     *
     * Adds an audit to an existing locationBillingType.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addLocationBillingTypeAuditTest() throws ApiException {
        Integer locationBillingTypeId = null;
        String locationBillingTypeAudit = null;
        api.addLocationBillingTypeAudit(locationBillingTypeId, locationBillingTypeAudit);

        // TODO: test validations
    }
    
    /**
     * Attach a file to a locationBillingType
     *
     * Adds a file to an existing locationBillingType.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addLocationBillingTypeFileTest() throws ApiException {
        Integer locationBillingTypeId = null;
        String fileName = null;
        api.addLocationBillingTypeFile(locationBillingTypeId, fileName);

        // TODO: test validations
    }
    
    /**
     * Add new tags for a locationBillingType.
     *
     * Adds a tag to an existing locationBillingType.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addLocationBillingTypeTagTest() throws ApiException {
        Integer locationBillingTypeId = null;
        String locationBillingTypeTag = null;
        api.addLocationBillingTypeTag(locationBillingTypeId, locationBillingTypeTag);

        // TODO: test validations
    }
    
    /**
     * Delete a locationBillingType
     *
     * Deletes the locationBillingType identified by the specified id.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteLocationBillingTypeTest() throws ApiException {
        Integer locationBillingTypeId = null;
        api.deleteLocationBillingType(locationBillingTypeId);

        // TODO: test validations
    }
    
    /**
     * Delete a tag for a locationBillingType.
     *
     * Deletes an existing locationBillingType tag using the specified data.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteLocationBillingTypeTagTest() throws ApiException {
        Integer locationBillingTypeId = null;
        String locationBillingTypeTag = null;
        api.deleteLocationBillingTypeTag(locationBillingTypeId, locationBillingTypeTag);

        // TODO: test validations
    }
    
    /**
     * Get a duplicated a locationBillingType by id
     *
     * Returns a duplicated locationBillingType identified by the specified id.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getDuplicateLocationBillingTypeByIdTest() throws ApiException {
        Integer locationBillingTypeId = null;
        LocationBillingType response = api.getDuplicateLocationBillingTypeById(locationBillingTypeId);

        // TODO: test validations
    }
    
    /**
     * Search locationBillingTypes by filter
     *
     * Returns the list of locationBillingTypes that match the given filter.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getLocationBillingTypeByFilterTest() throws ApiException {
        String filter = null;
        Integer page = null;
        Integer limit = null;
        String sort = null;
        List<LocationBillingType> response = api.getLocationBillingTypeByFilter(filter, page, limit, sort);

        // TODO: test validations
    }
    
    /**
     * Get a locationBillingType by id
     *
     * Returns the locationBillingType identified by the specified id.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getLocationBillingTypeByIdTest() throws ApiException {
        Integer locationBillingTypeId = null;
        LocationBillingType response = api.getLocationBillingTypeById(locationBillingTypeId);

        // TODO: test validations
    }
    
    /**
     * Get the tags for a locationBillingType.
     *
     * Get all existing locationBillingType tags.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getLocationBillingTypeTagsTest() throws ApiException {
        Integer locationBillingTypeId = null;
        api.getLocationBillingTypeTags(locationBillingTypeId);

        // TODO: test validations
    }
    
    /**
     * Update a locationBillingType
     *
     * Updates an existing locationBillingType using the specified data.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateLocationBillingTypeTest() throws ApiException {
        LocationBillingType body = null;
        api.updateLocationBillingType(body);

        // TODO: test validations
    }
    
    /**
     * Update a locationBillingType custom fields
     *
     * Updates an existing locationBillingType custom fields using the specified data.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateLocationBillingTypeCustomFieldsTest() throws ApiException {
        LocationBillingType body = null;
        api.updateLocationBillingTypeCustomFields(body);

        // TODO: test validations
    }
    
}
