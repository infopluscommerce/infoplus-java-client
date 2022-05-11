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
import com.infopluscommerce.model.User;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for UserApi
 */
@Ignore
public class UserApiTest {

    private final UserApi api = new UserApi();

    
    /**
     * Get an user by id
     *
     * Returns the user identified by the specified id.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getUserByIdTest() throws ApiException {
        String userId = null;
        User response = api.getUserById(userId);

        // TODO: test validations
    }
    
    /**
     * Search users
     *
     * Returns the list of users that match the given searchText.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getUserBySearchTextTest() throws ApiException {
        String searchText = null;
        Integer page = null;
        Integer limit = null;
        List<User> response = api.getUserBySearchText(searchText, page, limit);

        // TODO: test validations
    }
    
}
