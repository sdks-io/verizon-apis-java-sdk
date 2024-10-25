/*
 * VerizonLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.verizon.m5gedge.controllers;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.verizon.m5gedge.ApiHelper;
import com.verizon.m5gedge.Server;
import com.verizon.m5gedge.exceptions.ApiException;
import com.verizon.m5gedge.http.request.HttpMethod;
import com.verizon.m5gedge.http.response.ApiResponse;
import com.verizon.m5gedge.models.CreateSubscriptionRequest;
import com.verizon.m5gedge.models.DeleteSubscriptionRequest;
import com.verizon.m5gedge.models.QuerySubscriptionRequest;
import com.verizon.m5gedge.models.Subscription;
import io.apimatic.core.ApiCall;
import io.apimatic.core.GlobalConfiguration;
import io.apimatic.coreinterfaces.http.request.ResponseClassType;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionException;

/**
 * This class lists all the endpoints of the groups.
 */
public final class CloudConnectorSubscriptionsController extends BaseController {

    /**
     * Initializes the controller.
     * @param globalConfig    Configurations added in client.
     */
    public CloudConnectorSubscriptionsController(GlobalConfiguration globalConfig) {
        super(globalConfig);
    }

    /**
     * Create a subscription to define a streaming channel that sends data from devices in the
     * account to an endpoint defined in a target resource.
     * @param  body  Required parameter: The request body provides the details of the subscription
     *         that you want to create.
     * @return    Returns the Subscription wrapped in ApiResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ApiResponse<Subscription> createSubscription(
            final CreateSubscriptionRequest body) throws ApiException, IOException {
        return prepareCreateSubscriptionRequest(body).execute();
    }

    /**
     * Create a subscription to define a streaming channel that sends data from devices in the
     * account to an endpoint defined in a target resource.
     * @param  body  Required parameter: The request body provides the details of the subscription
     *         that you want to create.
     * @return    Returns the Subscription wrapped in ApiResponse response from the API call
     */
    public CompletableFuture<ApiResponse<Subscription>> createSubscriptionAsync(
            final CreateSubscriptionRequest body) {
        try { 
            return prepareCreateSubscriptionRequest(body).executeAsync(); 
        } catch (Exception e) {  
            throw new CompletionException(e); 
        }
    }

    /**
     * Builds the ApiCall object for createSubscription.
     */
    private ApiCall<ApiResponse<Subscription>, ApiException> prepareCreateSubscriptionRequest(
            final CreateSubscriptionRequest body) throws JsonProcessingException, IOException {
        return new ApiCall.Builder<ApiResponse<Subscription>, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.CLOUD_CONNECTOR.value())
                        .path("/subscriptions")
                        .bodyParam(param -> param.value(body))
                        .bodySerializer(() ->  ApiHelper.serialize(body))
                        .headerParam(param -> param.key("Content-Type")
                                .value("application/json").isRequired(false))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .withAuth(auth -> auth
                                .and(andAuth -> andAuth
                                        .add("thingspace_oauth")
                                        .add("VZ-M2M-Token")))
                        .httpMethod(HttpMethod.POST))
                .responseHandler(responseHandler -> responseHandler
                        .responseClassType(ResponseClassType.API_RESPONSE)
                        .apiResponseDeserializer(
                                response -> ApiHelper.deserialize(response, Subscription.class))
                        .nullify404(false)
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }

    /**
     * Search for subscriptions by property values. Returns an array of all matching subscription
     * resources.
     * @param  body  Required parameter: The request body specifies fields and values to match.
     * @return    Returns the List of Subscription wrapped in ApiResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ApiResponse<List<Subscription>> querySubscription(
            final QuerySubscriptionRequest body) throws ApiException, IOException {
        return prepareQuerySubscriptionRequest(body).execute();
    }

    /**
     * Search for subscriptions by property values. Returns an array of all matching subscription
     * resources.
     * @param  body  Required parameter: The request body specifies fields and values to match.
     * @return    Returns the List of Subscription wrapped in ApiResponse response from the API call
     */
    public CompletableFuture<ApiResponse<List<Subscription>>> querySubscriptionAsync(
            final QuerySubscriptionRequest body) {
        try { 
            return prepareQuerySubscriptionRequest(body).executeAsync(); 
        } catch (Exception e) {  
            throw new CompletionException(e); 
        }
    }

    /**
     * Builds the ApiCall object for querySubscription.
     */
    private ApiCall<ApiResponse<List<Subscription>>, ApiException> prepareQuerySubscriptionRequest(
            final QuerySubscriptionRequest body) throws JsonProcessingException, IOException {
        return new ApiCall.Builder<ApiResponse<List<Subscription>>, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.CLOUD_CONNECTOR.value())
                        .path("/subscriptions/actions/query")
                        .bodyParam(param -> param.value(body))
                        .bodySerializer(() ->  ApiHelper.serialize(body))
                        .headerParam(param -> param.key("Content-Type")
                                .value("application/json").isRequired(false))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .withAuth(auth -> auth
                                .and(andAuth -> andAuth
                                        .add("thingspace_oauth")
                                        .add("VZ-M2M-Token")))
                        .httpMethod(HttpMethod.POST))
                .responseHandler(responseHandler -> responseHandler
                        .responseClassType(ResponseClassType.API_RESPONSE)
                        .apiResponseDeserializer(
                                response -> ApiHelper.deserializeArray(response,
                                        Subscription[].class))
                        .nullify404(false)
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }

    /**
     * Remove a subscription from a ThingSpace account.
     * @param  body  Required parameter: The request body identifies the subscription to delete.
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ApiResponse<Void> deleteSubscription(
            final DeleteSubscriptionRequest body) throws ApiException, IOException {
        return prepareDeleteSubscriptionRequest(body).execute();
    }

    /**
     * Remove a subscription from a ThingSpace account.
     * @param  body  Required parameter: The request body identifies the subscription to delete.
     * @return    Returns the Void wrapped in ApiResponse response from the API call
     */
    public CompletableFuture<ApiResponse<Void>> deleteSubscriptionAsync(
            final DeleteSubscriptionRequest body) {
        try { 
            return prepareDeleteSubscriptionRequest(body).executeAsync(); 
        } catch (Exception e) {  
            throw new CompletionException(e); 
        }
    }

    /**
     * Builds the ApiCall object for deleteSubscription.
     */
    private ApiCall<ApiResponse<Void>, ApiException> prepareDeleteSubscriptionRequest(
            final DeleteSubscriptionRequest body) throws JsonProcessingException, IOException {
        return new ApiCall.Builder<ApiResponse<Void>, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.CLOUD_CONNECTOR.value())
                        .path("/subscriptions/actions/delete")
                        .bodyParam(param -> param.value(body))
                        .bodySerializer(() ->  ApiHelper.serialize(body))
                        .headerParam(param -> param.key("Content-Type")
                                .value("application/json").isRequired(false))
                        .withAuth(auth -> auth
                                .and(andAuth -> andAuth
                                        .add("thingspace_oauth")
                                        .add("VZ-M2M-Token")))
                        .httpMethod(HttpMethod.POST))
                .responseHandler(responseHandler -> responseHandler
                        .responseClassType(ResponseClassType.API_RESPONSE)
                        .nullify404(false)
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }
}