/*
 * VerizonLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.verizon.m5gedge.controllers;

import com.verizon.m5gedge.ApiHelper;
import com.verizon.m5gedge.Server;
import com.verizon.m5gedge.exceptions.ApiException;
import com.verizon.m5gedge.exceptions.ReadySimRestErrorResponseException;
import com.verizon.m5gedge.http.request.HttpMethod;
import com.verizon.m5gedge.http.response.ApiResponse;
import com.verizon.m5gedge.models.TriggerValueResponse;
import com.verizon.m5gedge.models.TriggerValueResponse2;
import io.apimatic.core.ApiCall;
import io.apimatic.core.ErrorCase;
import io.apimatic.core.GlobalConfiguration;
import io.apimatic.coreinterfaces.http.request.ResponseClassType;
import java.io.IOException;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionException;

/**
 * This class lists all the endpoints of the groups.
 */
public final class RetrievetheTriggersController extends BaseController {

    /**
     * Initializes the controller.
     * @param globalConfig    Configurations added in client.
     */
    public RetrievetheTriggersController(GlobalConfiguration globalConfig) {
        super(globalConfig);
    }

    /**
     * Retrieves all of the available triggers for pseudo-MDN.
     * @return    Returns the TriggerValueResponse wrapped in ApiResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ApiResponse<TriggerValueResponse> getAllAvailableTriggers() throws ApiException, IOException {
        return prepareGetAllAvailableTriggersRequest().execute();
    }

    /**
     * Retrieves all of the available triggers for pseudo-MDN.
     * @return    Returns the TriggerValueResponse wrapped in ApiResponse response from the API call
     */
    public CompletableFuture<ApiResponse<TriggerValueResponse>> getAllAvailableTriggersAsync() {
        try { 
            return prepareGetAllAvailableTriggersRequest().executeAsync(); 
        } catch (Exception e) {  
            throw new CompletionException(e); 
        }
    }

    /**
     * Builds the ApiCall object for getAllAvailableTriggers.
     */
    private ApiCall<ApiResponse<TriggerValueResponse>, ApiException> prepareGetAllAvailableTriggersRequest() throws IOException {
        return new ApiCall.Builder<ApiResponse<TriggerValueResponse>, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.THINGSPACE.value())
                        .path("/m2m/v2/triggers")
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .withAuth(auth -> auth
                                .add("oAuth2"))
                        .httpMethod(HttpMethod.GET))
                .responseHandler(responseHandler -> responseHandler
                        .responseClassType(ResponseClassType.API_RESPONSE)
                        .apiResponseDeserializer(
                                response -> ApiHelper.deserialize(response, TriggerValueResponse.class))
                        .nullify404(false)
                        .localErrorCase(ErrorCase.DEFAULT,
                                 ErrorCase.setReason("Error response",
                                (reason, context) -> new ReadySimRestErrorResponseException(reason, context)))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }

    /**
     * Retrieve the triggers associated with an account name.
     * @param  accountName  Required parameter: The account name
     * @return    Returns the TriggerValueResponse wrapped in ApiResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ApiResponse<TriggerValueResponse> getAllTriggersByAccountName(
            final String accountName) throws ApiException, IOException {
        return prepareGetAllTriggersByAccountNameRequest(accountName).execute();
    }

    /**
     * Retrieve the triggers associated with an account name.
     * @param  accountName  Required parameter: The account name
     * @return    Returns the TriggerValueResponse wrapped in ApiResponse response from the API call
     */
    public CompletableFuture<ApiResponse<TriggerValueResponse>> getAllTriggersByAccountNameAsync(
            final String accountName) {
        try { 
            return prepareGetAllTriggersByAccountNameRequest(accountName).executeAsync(); 
        } catch (Exception e) {  
            throw new CompletionException(e); 
        }
    }

    /**
     * Builds the ApiCall object for getAllTriggersByAccountName.
     */
    private ApiCall<ApiResponse<TriggerValueResponse>, ApiException> prepareGetAllTriggersByAccountNameRequest(
            final String accountName) throws IOException {
        return new ApiCall.Builder<ApiResponse<TriggerValueResponse>, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.THINGSPACE.value())
                        .path("/m2m/v2/triggers/accounts/{accountName}")
                        .templateParam(param -> param.key("accountName").value(accountName)
                                .shouldEncode(true))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .withAuth(auth -> auth
                                .add("oAuth2"))
                        .httpMethod(HttpMethod.GET))
                .responseHandler(responseHandler -> responseHandler
                        .responseClassType(ResponseClassType.API_RESPONSE)
                        .apiResponseDeserializer(
                                response -> ApiHelper.deserialize(response, TriggerValueResponse.class))
                        .nullify404(false)
                        .localErrorCase(ErrorCase.DEFAULT,
                                 ErrorCase.setReason("Error response",
                                (reason, context) -> new ReadySimRestErrorResponseException(reason, context)))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }

    /**
     * Retrives a specific trigger by its ID.
     * @param  triggerId  Required parameter: The ID of a specific trigger
     * @return    Returns the TriggerValueResponse2 wrapped in ApiResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ApiResponse<TriggerValueResponse2> getTriggersById(
            final String triggerId) throws ApiException, IOException {
        return prepareGetTriggersByIdRequest(triggerId).execute();
    }

    /**
     * Retrives a specific trigger by its ID.
     * @param  triggerId  Required parameter: The ID of a specific trigger
     * @return    Returns the TriggerValueResponse2 wrapped in ApiResponse response from the API call
     */
    public CompletableFuture<ApiResponse<TriggerValueResponse2>> getTriggersByIdAsync(
            final String triggerId) {
        try { 
            return prepareGetTriggersByIdRequest(triggerId).executeAsync(); 
        } catch (Exception e) {  
            throw new CompletionException(e); 
        }
    }

    /**
     * Builds the ApiCall object for getTriggersById.
     */
    private ApiCall<ApiResponse<TriggerValueResponse2>, ApiException> prepareGetTriggersByIdRequest(
            final String triggerId) throws IOException {
        return new ApiCall.Builder<ApiResponse<TriggerValueResponse2>, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.THINGSPACE.value())
                        .path("/m2m/v2/triggers/{triggerId}")
                        .templateParam(param -> param.key("triggerId").value(triggerId)
                                .shouldEncode(true))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .withAuth(auth -> auth
                                .add("oAuth2"))
                        .httpMethod(HttpMethod.GET))
                .responseHandler(responseHandler -> responseHandler
                        .responseClassType(ResponseClassType.API_RESPONSE)
                        .apiResponseDeserializer(
                                response -> ApiHelper.deserialize(response, TriggerValueResponse2.class))
                        .nullify404(false)
                        .localErrorCase(ErrorCase.DEFAULT,
                                 ErrorCase.setReason("Error response",
                                (reason, context) -> new ReadySimRestErrorResponseException(reason, context)))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }

    /**
     * Retrieves all of the triggers for the specified account associated with the PromoAlert
     * category.
     * @return    Returns the TriggerValueResponse2 wrapped in ApiResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ApiResponse<TriggerValueResponse2> getAllTriggersByTriggerCategory() throws ApiException, IOException {
        return prepareGetAllTriggersByTriggerCategoryRequest().execute();
    }

    /**
     * Retrieves all of the triggers for the specified account associated with the PromoAlert
     * category.
     * @return    Returns the TriggerValueResponse2 wrapped in ApiResponse response from the API call
     */
    public CompletableFuture<ApiResponse<TriggerValueResponse2>> getAllTriggersByTriggerCategoryAsync() {
        try { 
            return prepareGetAllTriggersByTriggerCategoryRequest().executeAsync(); 
        } catch (Exception e) {  
            throw new CompletionException(e); 
        }
    }

    /**
     * Builds the ApiCall object for getAllTriggersByTriggerCategory.
     */
    private ApiCall<ApiResponse<TriggerValueResponse2>, ApiException> prepareGetAllTriggersByTriggerCategoryRequest() throws IOException {
        return new ApiCall.Builder<ApiResponse<TriggerValueResponse2>, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.THINGSPACE.value())
                        .path("/m2m/v2/triggers/categories/PromoAlerts")
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .withAuth(auth -> auth
                                .add("oAuth2"))
                        .httpMethod(HttpMethod.GET))
                .responseHandler(responseHandler -> responseHandler
                        .responseClassType(ResponseClassType.API_RESPONSE)
                        .apiResponseDeserializer(
                                response -> ApiHelper.deserialize(response, TriggerValueResponse2.class))
                        .nullify404(false)
                        .localErrorCase(ErrorCase.DEFAULT,
                                 ErrorCase.setReason("Error response",
                                (reason, context) -> new ReadySimRestErrorResponseException(reason, context)))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }
}