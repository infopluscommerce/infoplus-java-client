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
import com.infopluscommerce.model.EDIDocumentType;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for EDiDocumentTypeApi
 */
@Ignore
public class EDiDocumentTypeApiTest {

    private final EDiDocumentTypeApi api = new EDiDocumentTypeApi();

    
    /**
     * Get an eDIDocumentType by id
     *
     * Returns the eDIDocumentType identified by the specified id.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getEDIDocumentTypeByIdTest() throws ApiException {
        String eDIDocumentTypeId = null;
        EDIDocumentType response = api.getEDIDocumentTypeById(eDIDocumentTypeId);

        // TODO: test validations
    }
    
    /**
     * Search eDIDocumentTypes
     *
     * Returns the list of eDIDocumentTypes that match the given searchText.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getEDIDocumentTypeBySearchTextTest() throws ApiException {
        String searchText = null;
        Integer page = null;
        Integer limit = null;
        List<EDIDocumentType> response = api.getEDIDocumentTypeBySearchText(searchText, page, limit);

        // TODO: test validations
    }
    
}
