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
import com.infopluscommerce.model.EdiDocument;
import com.infopluscommerce.model.ModelApiResponse;
import com.infopluscommerce.model.RecordFile;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for EdiDocumentApi
 */
@Ignore
public class EdiDocumentApiTest {

    private final EdiDocumentApi api = new EdiDocumentApi();

    
    /**
     * Create an ediDocument
     *
     * Inserts a new ediDocument using the specified data.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addEdiDocumentTest() throws ApiException {
        EdiDocument body = null;
        EdiDocument response = api.addEdiDocument(body);

        // TODO: test validations
    }
    
    /**
     * Add new audit for an ediDocument
     *
     * Adds an audit to an existing ediDocument.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addEdiDocumentAuditTest() throws ApiException {
        Integer ediDocumentId = null;
        String ediDocumentAudit = null;
        api.addEdiDocumentAudit(ediDocumentId, ediDocumentAudit);

        // TODO: test validations
    }
    
    /**
     * Attach a file to an ediDocument
     *
     * Adds a file to an existing ediDocument.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addEdiDocumentFileTest() throws ApiException {
        Integer ediDocumentId = null;
        String fileName = null;
        api.addEdiDocumentFile(ediDocumentId, fileName);

        // TODO: test validations
    }
    
    /**
     * Attach a file to an ediDocument by URL.
     *
     * Adds a file to an existing ediDocument by URL.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addEdiDocumentFileByURLTest() throws ApiException {
        RecordFile body = null;
        Integer ediDocumentId = null;
        api.addEdiDocumentFileByURL(body, ediDocumentId);

        // TODO: test validations
    }
    
    /**
     * Add new tags for an ediDocument.
     *
     * Adds a tag to an existing ediDocument.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addEdiDocumentTagTest() throws ApiException {
        Integer ediDocumentId = null;
        String ediDocumentTag = null;
        api.addEdiDocumentTag(ediDocumentId, ediDocumentTag);

        // TODO: test validations
    }
    
    /**
     * Delete a file for an ediDocument.
     *
     * Deletes an existing ediDocument file using the specified data.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteEdiDocumentFileTest() throws ApiException {
        Integer ediDocumentId = null;
        Integer fileId = null;
        api.deleteEdiDocumentFile(ediDocumentId, fileId);

        // TODO: test validations
    }
    
    /**
     * Delete a tag for an ediDocument.
     *
     * Deletes an existing ediDocument tag using the specified data.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteEdiDocumentTagTest() throws ApiException {
        Integer ediDocumentId = null;
        String ediDocumentTag = null;
        api.deleteEdiDocumentTag(ediDocumentId, ediDocumentTag);

        // TODO: test validations
    }
    
    /**
     * Get a duplicated an ediDocument by id
     *
     * Returns a duplicated ediDocument identified by the specified id.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getDuplicateEdiDocumentByIdTest() throws ApiException {
        Integer ediDocumentId = null;
        EdiDocument response = api.getDuplicateEdiDocumentById(ediDocumentId);

        // TODO: test validations
    }
    
    /**
     * Search ediDocuments by filter
     *
     * Returns the list of ediDocuments that match the given filter.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getEdiDocumentByFilterTest() throws ApiException {
        String filter = null;
        Integer page = null;
        Integer limit = null;
        String sort = null;
        List<EdiDocument> response = api.getEdiDocumentByFilter(filter, page, limit, sort);

        // TODO: test validations
    }
    
    /**
     * Get an ediDocument by id
     *
     * Returns the ediDocument identified by the specified id.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getEdiDocumentByIdTest() throws ApiException {
        Integer ediDocumentId = null;
        EdiDocument response = api.getEdiDocumentById(ediDocumentId);

        // TODO: test validations
    }
    
    /**
     * Get the files for an ediDocument.
     *
     * Get all existing ediDocument files.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getEdiDocumentFilesTest() throws ApiException {
        Integer ediDocumentId = null;
        api.getEdiDocumentFiles(ediDocumentId);

        // TODO: test validations
    }
    
    /**
     * Get the tags for an ediDocument.
     *
     * Get all existing ediDocument tags.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getEdiDocumentTagsTest() throws ApiException {
        Integer ediDocumentId = null;
        api.getEdiDocumentTags(ediDocumentId);

        // TODO: test validations
    }
    
}
