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
import com.cribl.openapi.dto.InlineResponse20032;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ExpressionsApi
 */
@Ignore
public class ExpressionsApiTest {

    private final ExpressionsApi api = new ExpressionsApi();

    /**
     * Evaluate JavaScript expression
     *
     * Evaluate JavaScript expression
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void libExpressionGetTest() throws ApiException {
        InlineResponse20032 response = api.libExpressionGet();

        // TODO: test validations
    }
}
