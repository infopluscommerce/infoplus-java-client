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
import com.infopluscommerce.model.CarrierService;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for CarrierServiceApi
 */
@Ignore
public class CarrierServiceApiTest {

    private final CarrierServiceApi api = new CarrierServiceApi();

    
    /**
     * Get a carrierService by id
     *
     * Returns the carrierService identified by the specified id.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getCarrierServiceByIdTest() throws ApiException {
        String carrierServiceId = null;
        CarrierService response = api.getCarrierServiceById(carrierServiceId);

        // TODO: test validations
    }
    
    /**
     * Search carrierServices
     *
     * Returns the list of carrierServices that match the given searchText.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getCarrierServiceBySearchTextTest() throws ApiException {
        String searchText = null;
        Integer page = null;
        Integer limit = null;
        List<CarrierService> response = api.getCarrierServiceBySearchText(searchText, page, limit);

        // TODO: test validations
    }
    
}
