/*
 * VerizonThingSpaceQualityOfServiceAPIEndpointsLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.verizon.thingspace.controllers;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.verizon.thingspace.ApiHelper;
import com.verizon.thingspace.Server;
import com.verizon.thingspace.exceptions.ApiException;
import com.verizon.thingspace.exceptions.DefaultException;
import com.verizon.thingspace.http.request.HttpMethod;
import com.verizon.thingspace.models.M201success;
import com.verizon.thingspace.models.SubscribeRequest;
import io.apimatic.core.ApiCall;
import io.apimatic.core.ErrorCase;
import io.apimatic.core.GlobalConfiguration;
import java.io.IOException;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionException;

/**
 * This class lists all the endpoints of the groups.
 */
public final class ThingSpaceQualityofServiceAPIActionsController extends BaseController {

    /**
     * Initializes the controller.
     * @param globalConfig    Configurations added in client.
     */
    public ThingSpaceQualityofServiceAPIActionsController(GlobalConfiguration globalConfig) {
        super(globalConfig);
    }

    /**
     * Creates a QoS elevation subscription ID and activates the subscription.
     * @param  body  Required parameter: The request details to create a ThingSpace Quality of
     *         Service API subscription.
     * @return    Returns the M201success response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public M201success createAThingSpaceQualityOfServiceAPISubscription(
            final SubscribeRequest body) throws ApiException, IOException {
        return prepareCreateAThingSpaceQualityOfServiceAPISubscriptionRequest(body).execute();
    }

    /**
     * Creates a QoS elevation subscription ID and activates the subscription.
     * @param  body  Required parameter: The request details to create a ThingSpace Quality of
     *         Service API subscription.
     * @return    Returns the M201success response from the API call
     */
    public CompletableFuture<M201success> createAThingSpaceQualityOfServiceAPISubscriptionAsync(
            final SubscribeRequest body) {
        try { 
            return prepareCreateAThingSpaceQualityOfServiceAPISubscriptionRequest(body).executeAsync(); 
        } catch (Exception e) {  
            throw new CompletionException(e); 
        }
    }

    /**
     * Builds the ApiCall object for createAThingSpaceQualityOfServiceAPISubscription.
     */
    private ApiCall<M201success, ApiException> prepareCreateAThingSpaceQualityOfServiceAPISubscriptionRequest(
            final SubscribeRequest body) throws JsonProcessingException, IOException {
        return new ApiCall.Builder<M201success, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.THINGSPACE.value())
                        .path("/actions/enhanceQoS")
                        .bodyParam(param -> param.value(body))
                        .bodySerializer(() ->  ApiHelper.serialize(body))
                        .headerParam(param -> param.key("Content-Type")
                                .value("application/json").isRequired(false))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .withAuth(auth -> auth
                                .and(andAuth -> andAuth
                                        .add("thingspace_oauth")
                                        .add("vz-m2m-session_token")))
                        .httpMethod(HttpMethod.POST))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserialize(response, M201success.class))
                        .nullify404(false)
                        .localErrorCase(ErrorCase.DEFAULT,
                                 ErrorCase.setReason("Error Response",
                                (reason, context) -> new DefaultException(reason, context)))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }

    /**
     * Stops an active ThingSpace Quality of Service API subscription using the account name and the
     * subscription ID.
     * @param  accountName  Required parameter: Example:
     * @param  qosSubscriptionId  Required parameter: Example:
     * @return    Returns the M201success response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public M201success stopAThingSpaceQualityOfServiceAPISubscription(
            final String accountName,
            final String qosSubscriptionId) throws ApiException, IOException {
        return prepareStopAThingSpaceQualityOfServiceAPISubscriptionRequest(accountName,
                qosSubscriptionId).execute();
    }

    /**
     * Stops an active ThingSpace Quality of Service API subscription using the account name and the
     * subscription ID.
     * @param  accountName  Required parameter: Example:
     * @param  qosSubscriptionId  Required parameter: Example:
     * @return    Returns the M201success response from the API call
     */
    public CompletableFuture<M201success> stopAThingSpaceQualityOfServiceAPISubscriptionAsync(
            final String accountName,
            final String qosSubscriptionId) {
        try { 
            return prepareStopAThingSpaceQualityOfServiceAPISubscriptionRequest(accountName,
            qosSubscriptionId).executeAsync(); 
        } catch (Exception e) {  
            throw new CompletionException(e); 
        }
    }

    /**
     * Builds the ApiCall object for stopAThingSpaceQualityOfServiceAPISubscription.
     */
    private ApiCall<M201success, ApiException> prepareStopAThingSpaceQualityOfServiceAPISubscriptionRequest(
            final String accountName,
            final String qosSubscriptionId) throws IOException {
        return new ApiCall.Builder<M201success, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.THINGSPACE.value())
                        .path("/actions/enhanceQoS")
                        .queryParam(param -> param.key("accountName")
                                .value(accountName))
                        .queryParam(param -> param.key("qosSubscriptionId")
                                .value(qosSubscriptionId))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .withAuth(auth -> auth
                                .and(andAuth -> andAuth
                                        .add("thingspace_oauth")
                                        .add("vz-m2m-session_token")))
                        .httpMethod(HttpMethod.DELETE))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserialize(response, M201success.class))
                        .nullify404(false)
                        .localErrorCase(ErrorCase.DEFAULT,
                                 ErrorCase.setReason("Error Response",
                                (reason, context) -> new DefaultException(reason, context)))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }
}