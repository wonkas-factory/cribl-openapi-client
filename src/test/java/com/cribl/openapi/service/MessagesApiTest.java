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
import com.cribl.openapi.dto.BulletinMessage;
import com.cribl.openapi.dto.Error;
import com.cribl.openapi.dto.InlineResponse2004;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for MessagesApi
 */
@Ignore
public class MessagesApiTest {

    private final MessagesApi api = new MessagesApi();

    /**
     * Get a list of BulletinMessage objects
     *
     * Get a list of BulletinMessage objects
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void systemMessagesGetTest() throws ApiException {
        InlineResponse2004 response = api.systemMessagesGet();

        // TODO: test validations
    }
    /**
     * Delete BulletinMessage
     *
     * Delete BulletinMessage
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void systemMessagesIdDeleteTest() throws ApiException {
        String id = null;
        InlineResponse2004 response = api.systemMessagesIdDelete(id);

        // TODO: test validations
    }
    /**
     * Get BulletinMessage by ID
     *
     * Get BulletinMessage by ID
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void systemMessagesIdGetTest() throws ApiException {
        String id = null;
        InlineResponse2004 response = api.systemMessagesIdGet(id);

        // TODO: test validations
    }
    /**
     * Create BulletinMessage
     *
     * Create BulletinMessage
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void systemMessagesPostTest() throws ApiException {
        BulletinMessage body = null;
        InlineResponse2004 response = api.systemMessagesPost(body);

        // TODO: test validations
    }
}
