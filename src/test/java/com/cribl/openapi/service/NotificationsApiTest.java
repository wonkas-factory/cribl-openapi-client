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
import com.cribl.openapi.dto.InlineResponse2006;
import com.cribl.openapi.dto.Notification;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for NotificationsApi
 */
@Ignore
public class NotificationsApiTest {

    private final NotificationsApi api = new NotificationsApi();

    /**
     * Get a list of Notification objects
     *
     * Get a list of Notification objects
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void notificationsGetTest() throws ApiException {
        InlineResponse2006 response = api.notificationsGet();

        // TODO: test validations
    }
    /**
     * Delete Notification
     *
     * Delete Notification
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void notificationsIdDeleteTest() throws ApiException {
        String id = null;
        InlineResponse2006 response = api.notificationsIdDelete(id);

        // TODO: test validations
    }
    /**
     * Get Notification by ID
     *
     * Get Notification by ID
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void notificationsIdGetTest() throws ApiException {
        String id = null;
        InlineResponse2006 response = api.notificationsIdGet(id);

        // TODO: test validations
    }
    /**
     * Update Notification
     *
     * Update Notification
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void notificationsIdPatchTest() throws ApiException {
        String id = null;
        Notification body = null;
        InlineResponse2006 response = api.notificationsIdPatch(id, body);

        // TODO: test validations
    }
    /**
     * Create Notification
     *
     * Create Notification
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void notificationsPostTest() throws ApiException {
        Notification body = null;
        InlineResponse2006 response = api.notificationsPost(body);

        // TODO: test validations
    }
}
