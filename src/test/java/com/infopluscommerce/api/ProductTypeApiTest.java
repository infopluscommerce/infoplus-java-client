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
import com.infopluscommerce.model.ProductType;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ProductTypeApi
 */
@Ignore
public class ProductTypeApiTest {

    private final ProductTypeApi api = new ProductTypeApi();

    
    /**
     * Get a productType by id
     *
     * Returns the productType identified by the specified id.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getProductTypeByIdTest() throws ApiException {
        String productTypeId = null;
        ProductType response = api.getProductTypeById(productTypeId);

        // TODO: test validations
    }
    
    /**
     * Search productTypes
     *
     * Returns the list of productTypes that match the given searchText.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getProductTypeBySearchTextTest() throws ApiException {
        String searchText = null;
        Integer page = null;
        Integer limit = null;
        List<ProductType> response = api.getProductTypeBySearchText(searchText, page, limit);

        // TODO: test validations
    }
    
}
