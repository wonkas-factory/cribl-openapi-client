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
import com.cribl.openapi.dto.InlineResponse20016;
import com.cribl.openapi.dto.InlineResponse20017;
import com.cribl.openapi.dto.InlineResponse20018;
import com.cribl.openapi.dto.InlineResponse20025;
import com.cribl.openapi.dto.Output;
import com.cribl.openapi.dto.OutputTestRequest;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for OutputsApi
 */
@Ignore
public class OutputsApiTest {

    private final OutputsApi api = new OutputsApi();

    /**
     * Get a list of Output objects
     *
     * Get a list of Output objects
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void systemOutputsGetTest() throws ApiException {
        InlineResponse20016 response = api.systemOutputsGet();

        // TODO: test validations
    }
    /**
     * Delete Output
     *
     * Delete Output
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void systemOutputsIdDeleteTest() throws ApiException {
        String id = null;
        InlineResponse20016 response = api.systemOutputsIdDelete(id);

        // TODO: test validations
    }
    /**
     * Get Output by ID
     *
     * Get Output by ID
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void systemOutputsIdGetTest() throws ApiException {
        String id = null;
        InlineResponse20016 response = api.systemOutputsIdGet(id);

        // TODO: test validations
    }
    /**
     * Update Output
     *
     * Update Output
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void systemOutputsIdPatchTest() throws ApiException {
        String id = null;
        Output body = null;
        InlineResponse20016 response = api.systemOutputsIdPatch(id, body);

        // TODO: test validations
    }
    /**
     * Retrieve samples data for the specified output. Used to get sample data for the test action.
     *
     * Retrieve samples data for the specified output. Used to get sample data for the test action.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void systemOutputsIdSamplesGetTest() throws ApiException {
        String id = null;
        InlineResponse20017 response = api.systemOutputsIdSamplesGet(id);

        // TODO: test validations
    }
    /**
     * Send sample data to an output to validate configuration or test connectivity
     *
     * Send sample data to an output to validate configuration or test connectivity
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void systemOutputsIdTestPostTest() throws ApiException {
        String id = null;
        OutputTestRequest body = null;
        InlineResponse20018 response = api.systemOutputsIdTestPost(id, body);

        // TODO: test validations
    }
    /**
     * Create Output
     *
     * Create Output
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void systemOutputsPostTest() throws ApiException {
        Output body = null;
        InlineResponse20016 response = api.systemOutputsPost(body);

        // TODO: test validations
    }
    /**
     * Get a list of OutputStatus objects
     *
     * Get a list of OutputStatus objects
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void systemStatusOutputsGetTest() throws ApiException {
        InlineResponse20025 response = api.systemStatusOutputsGet();

        // TODO: test validations
    }
    /**
     * Get OutputStatus by ID
     *
     * Get OutputStatus by ID
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void systemStatusOutputsIdGetTest() throws ApiException {
        String id = null;
        InlineResponse20025 response = api.systemStatusOutputsIdGet(id);

        // TODO: test validations
    }
}