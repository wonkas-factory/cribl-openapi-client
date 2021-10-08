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
import com.cribl.openapi.dto.IKMSProviderConfig;
import com.cribl.openapi.dto.InlineResponse20041;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for SecurityApi
 */
@Ignore
public class SecurityApiTest {

    private final SecurityApi api = new SecurityApi();

    /**
     * Get Cribl KMS config
     *
     * Get Cribl KMS config
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void securityKmsConfigGetTest() throws ApiException {
        InlineResponse20041 response = api.securityKmsConfigGet();

        // TODO: test validations
    }
    /**
     * Update Cribl KMS config
     *
     * Update Cribl KMS config
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void securityKmsConfigPatchTest() throws ApiException {
        IKMSProviderConfig body = null;
        InlineResponse20041 response = api.securityKmsConfigPatch(body);

        // TODO: test validations
    }
}