/*
 * Cribl LogStream
 * REST API Reference of available endpoints and their supported operations for accessing, updating, creating, or deleting resources. Product documentation available at [docs.cribl.io](http://docs.cribl.io).
 *
 * OpenAPI spec version: 3.1.2-abb571bc
 * Contact: support@cribl.io
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.cribl.openapi.service;

import com.cribl.openapi.client.ApiException;
import com.cribl.openapi.dto.Error;
import com.cribl.openapi.dto.InlineResponse20010;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ScriptsApi
 */
@Ignore
public class ScriptsApiTest {

    private final ScriptsApi api = new ScriptsApi();

    /**
     * Get a list of Script objects
     *
     * Get a list of Script objects
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void systemScriptsGetTest() throws ApiException {
        InlineResponse20010 response = api.systemScriptsGet();

        // TODO: test validations
    }
    /**
     * Delete Script
     *
     * Delete Script
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void systemScriptsIdDeleteTest() throws ApiException {
        String id = null;
        InlineResponse20010 response = api.systemScriptsIdDelete(id);

        // TODO: test validations
    }
    /**
     * Get Script by ID
     *
     * Get Script by ID
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void systemScriptsIdGetTest() throws ApiException {
        String id = null;
        InlineResponse20010 response = api.systemScriptsIdGet(id);

        // TODO: test validations
    }
    /**
     * Update Script
     *
     * Update Script
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void systemScriptsIdPatchTest() throws ApiException {
        String id = null;
        Map<String, Object> body = null;
        InlineResponse20010 response = api.systemScriptsIdPatch(id, body);

        // TODO: test validations
    }
    /**
     * Create Script
     *
     * Create Script
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void systemScriptsPostTest() throws ApiException {
        Map<String, Object> body = null;
        InlineResponse20010 response = api.systemScriptsPost(body);

        // TODO: test validations
    }
}
