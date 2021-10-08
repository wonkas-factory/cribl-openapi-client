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
import com.cribl.openapi.dto.CrudEntityBase;
import com.cribl.openapi.dto.Error;
import com.cribl.openapi.dto.InlineResponse20015;
import com.cribl.openapi.dto.InlineResponse20039;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for PacksApi
 */
@Ignore
public class PacksApiTest {

    private final PacksApi api = new PacksApi();

    /**
     * Export Pack
     *
     * Export Pack
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void packsGetTest() throws ApiException {
        String mode = null;
        String dest = null;
        InlineResponse20015 response = api.packsGet(mode, dest);

        // TODO: test validations
    }
    /**
     * Uninstall Pack from the system
     *
     * Uninstall Pack from the system
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void packsIdDeleteTest() throws ApiException {
        String id = null;
        InlineResponse20039 response = api.packsIdDelete(id);

        // TODO: test validations
    }
    /**
     * Upgrade Pack
     *
     * Upgrade Pack
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void packsIdPatchTest() throws ApiException {
        String id = null;
        String source = null;
        String minor = null;
        String spec = null;
        InlineResponse20039 response = api.packsIdPatch(id, source, minor, spec);

        // TODO: test validations
    }
    /**
     * Install Pack
     *
     * Install Pack
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void packsPostTest() throws ApiException {
        CrudEntityBase body = null;
        InlineResponse20039 response = api.packsPost(body);

        // TODO: test validations
    }
    /**
     * Upload Pack
     *
     * Upload Pack
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void packsPutTest() throws ApiException {
        String filename = null;
        InlineResponse20015 response = api.packsPut(filename);

        // TODO: test validations
    }
}