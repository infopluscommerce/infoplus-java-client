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
import com.infopluscommerce.model.JobTimeActivity;
import com.infopluscommerce.model.ModelApiResponse;
import com.infopluscommerce.model.RecordFile;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for JobTimeActivityApi
 */
@Ignore
public class JobTimeActivityApiTest {

    private final JobTimeActivityApi api = new JobTimeActivityApi();

    
    /**
     * Create a jobTimeActivity
     *
     * Inserts a new jobTimeActivity using the specified data.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addJobTimeActivityTest() throws ApiException {
        JobTimeActivity body = null;
        JobTimeActivity response = api.addJobTimeActivity(body);

        // TODO: test validations
    }
    
    /**
     * Add new audit for a jobTimeActivity
     *
     * Adds an audit to an existing jobTimeActivity.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addJobTimeActivityAuditTest() throws ApiException {
        Integer jobTimeActivityId = null;
        String jobTimeActivityAudit = null;
        api.addJobTimeActivityAudit(jobTimeActivityId, jobTimeActivityAudit);

        // TODO: test validations
    }
    
    /**
     * Attach a file to a jobTimeActivity
     *
     * Adds a file to an existing jobTimeActivity.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addJobTimeActivityFileTest() throws ApiException {
        Integer jobTimeActivityId = null;
        String fileName = null;
        api.addJobTimeActivityFile(jobTimeActivityId, fileName);

        // TODO: test validations
    }
    
    /**
     * Attach a file to a jobTimeActivity by URL.
     *
     * Adds a file to an existing jobTimeActivity by URL.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addJobTimeActivityFileByURLTest() throws ApiException {
        RecordFile body = null;
        Integer jobTimeActivityId = null;
        api.addJobTimeActivityFileByURL(body, jobTimeActivityId);

        // TODO: test validations
    }
    
    /**
     * Add new tags for a jobTimeActivity.
     *
     * Adds a tag to an existing jobTimeActivity.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addJobTimeActivityTagTest() throws ApiException {
        Integer jobTimeActivityId = null;
        String jobTimeActivityTag = null;
        api.addJobTimeActivityTag(jobTimeActivityId, jobTimeActivityTag);

        // TODO: test validations
    }
    
    /**
     * Delete a jobTimeActivity
     *
     * Deletes the jobTimeActivity identified by the specified id.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteJobTimeActivityTest() throws ApiException {
        Integer jobTimeActivityId = null;
        api.deleteJobTimeActivity(jobTimeActivityId);

        // TODO: test validations
    }
    
    /**
     * Delete a file for a jobTimeActivity.
     *
     * Deletes an existing jobTimeActivity file using the specified data.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteJobTimeActivityFileTest() throws ApiException {
        Integer jobTimeActivityId = null;
        Integer fileId = null;
        api.deleteJobTimeActivityFile(jobTimeActivityId, fileId);

        // TODO: test validations
    }
    
    /**
     * Delete a tag for a jobTimeActivity.
     *
     * Deletes an existing jobTimeActivity tag using the specified data.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteJobTimeActivityTagTest() throws ApiException {
        Integer jobTimeActivityId = null;
        String jobTimeActivityTag = null;
        api.deleteJobTimeActivityTag(jobTimeActivityId, jobTimeActivityTag);

        // TODO: test validations
    }
    
    /**
     * Get a duplicated a jobTimeActivity by id
     *
     * Returns a duplicated jobTimeActivity identified by the specified id.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getDuplicateJobTimeActivityByIdTest() throws ApiException {
        Integer jobTimeActivityId = null;
        JobTimeActivity response = api.getDuplicateJobTimeActivityById(jobTimeActivityId);

        // TODO: test validations
    }
    
    /**
     * Search jobTimeActivitys by filter
     *
     * Returns the list of jobTimeActivitys that match the given filter.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getJobTimeActivityByFilterTest() throws ApiException {
        String filter = null;
        Integer page = null;
        Integer limit = null;
        String sort = null;
        List<JobTimeActivity> response = api.getJobTimeActivityByFilter(filter, page, limit, sort);

        // TODO: test validations
    }
    
    /**
     * Get a jobTimeActivity by id
     *
     * Returns the jobTimeActivity identified by the specified id.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getJobTimeActivityByIdTest() throws ApiException {
        Integer jobTimeActivityId = null;
        JobTimeActivity response = api.getJobTimeActivityById(jobTimeActivityId);

        // TODO: test validations
    }
    
    /**
     * Get the files for a jobTimeActivity.
     *
     * Get all existing jobTimeActivity files.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getJobTimeActivityFilesTest() throws ApiException {
        Integer jobTimeActivityId = null;
        api.getJobTimeActivityFiles(jobTimeActivityId);

        // TODO: test validations
    }
    
    /**
     * Get the tags for a jobTimeActivity.
     *
     * Get all existing jobTimeActivity tags.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getJobTimeActivityTagsTest() throws ApiException {
        Integer jobTimeActivityId = null;
        api.getJobTimeActivityTags(jobTimeActivityId);

        // TODO: test validations
    }
    
    /**
     * Update a jobTimeActivity
     *
     * Updates an existing jobTimeActivity using the specified data.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateJobTimeActivityTest() throws ApiException {
        JobTimeActivity body = null;
        api.updateJobTimeActivity(body);

        // TODO: test validations
    }
    
}
