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
import com.cribl.openapi.dto.InlineResponse20021;
import com.cribl.openapi.dto.Routes;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for RoutesApi
 */
@Ignore
public class RoutesApiTest {

    private final RoutesApi api = new RoutesApi();

    /**
     * Get a list of Routes objects
     *
     * Get a list of Routes objects
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void routesGetTest() throws ApiException {
        InlineResponse20021 response = api.routesGet();

        // TODO: test validations
    }
    /**
     * Get Routes by ID
     *
     * Get Routes by ID
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void routesIdGetTest() throws ApiException {
        String id = null;
        InlineResponse20021 response = api.routesIdGet(id);

        // TODO: test validations
    }
    /**
     * Update Routes
     *
     * Update Routes
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void routesIdPatchTest() throws ApiException {
        String id = null;
        Routes body = null;
        InlineResponse20021 response = api.routesIdPatch(id, body);

        // TODO: test validations
    }
}