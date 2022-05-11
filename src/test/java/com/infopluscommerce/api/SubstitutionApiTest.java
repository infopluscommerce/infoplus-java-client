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
import com.infopluscommerce.model.RecordFile;
import com.infopluscommerce.model.Substitution;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for SubstitutionApi
 */
@Ignore
public class SubstitutionApiTest {

    private final SubstitutionApi api = new SubstitutionApi();

    
    /**
     * Create a substitution
     *
     * Inserts a new substitution using the specified data.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addSubstitutionTest() throws ApiException {
        Substitution body = null;
        Substitution response = api.addSubstitution(body);

        // TODO: test validations
    }
    
    /**
     * Add new audit for a substitution
     *
     * Adds an audit to an existing substitution.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addSubstitutionAuditTest() throws ApiException {
        Integer substitutionId = null;
        String substitutionAudit = null;
        api.addSubstitutionAudit(substitutionId, substitutionAudit);

        // TODO: test validations
    }
    
    /**
     * Attach a file to a substitution
     *
     * Adds a file to an existing substitution.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addSubstitutionFileTest() throws ApiException {
        Integer substitutionId = null;
        String fileName = null;
        api.addSubstitutionFile(substitutionId, fileName);

        // TODO: test validations
    }
    
    /**
     * Attach a file to a substitution by URL.
     *
     * Adds a file to an existing substitution by URL.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addSubstitutionFileByURLTest() throws ApiException {
        RecordFile body = null;
        Integer substitutionId = null;
        api.addSubstitutionFileByURL(body, substitutionId);

        // TODO: test validations
    }
    
    /**
     * Add new tags for a substitution.
     *
     * Adds a tag to an existing substitution.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addSubstitutionTagTest() throws ApiException {
        Integer substitutionId = null;
        String substitutionTag = null;
        api.addSubstitutionTag(substitutionId, substitutionTag);

        // TODO: test validations
    }
    
    /**
     * Delete a substitution
     *
     * Deletes the substitution identified by the specified id.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteSubstitutionTest() throws ApiException {
        Integer substitutionId = null;
        api.deleteSubstitution(substitutionId);

        // TODO: test validations
    }
    
    /**
     * Delete a file for a substitution.
     *
     * Deletes an existing substitution file using the specified data.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteSubstitutionFileTest() throws ApiException {
        Integer substitutionId = null;
        Integer fileId = null;
        api.deleteSubstitutionFile(substitutionId, fileId);

        // TODO: test validations
    }
    
    /**
     * Delete a tag for a substitution.
     *
     * Deletes an existing substitution tag using the specified data.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteSubstitutionTagTest() throws ApiException {
        Integer substitutionId = null;
        String substitutionTag = null;
        api.deleteSubstitutionTag(substitutionId, substitutionTag);

        // TODO: test validations
    }
    
    /**
     * Get a duplicated a substitution by id
     *
     * Returns a duplicated substitution identified by the specified id.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getDuplicateSubstitutionByIdTest() throws ApiException {
        Integer substitutionId = null;
        Substitution response = api.getDuplicateSubstitutionById(substitutionId);

        // TODO: test validations
    }
    
    /**
     * Search substitutions by filter
     *
     * Returns the list of substitutions that match the given filter.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSubstitutionByFilterTest() throws ApiException {
        String filter = null;
        Integer page = null;
        Integer limit = null;
        String sort = null;
        List<Substitution> response = api.getSubstitutionByFilter(filter, page, limit, sort);

        // TODO: test validations
    }
    
    /**
     * Get a substitution by id
     *
     * Returns the substitution identified by the specified id.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSubstitutionByIdTest() throws ApiException {
        Integer substitutionId = null;
        Substitution response = api.getSubstitutionById(substitutionId);

        // TODO: test validations
    }
    
    /**
     * Get the files for a substitution.
     *
     * Get all existing substitution files.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSubstitutionFilesTest() throws ApiException {
        Integer substitutionId = null;
        api.getSubstitutionFiles(substitutionId);

        // TODO: test validations
    }
    
    /**
     * Get the tags for a substitution.
     *
     * Get all existing substitution tags.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSubstitutionTagsTest() throws ApiException {
        Integer substitutionId = null;
        api.getSubstitutionTags(substitutionId);

        // TODO: test validations
    }
    
    /**
     * Update a substitution
     *
     * Updates an existing substitution using the specified data.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateSubstitutionTest() throws ApiException {
        Substitution body = null;
        api.updateSubstitution(body);

        // TODO: test validations
    }
    
    /**
     * Update a substitution custom fields
     *
     * Updates an existing substitution custom fields using the specified data.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateSubstitutionCustomFieldsTest() throws ApiException {
        Substitution body = null;
        api.updateSubstitutionCustomFields(body);

        // TODO: test validations
    }
    
}
