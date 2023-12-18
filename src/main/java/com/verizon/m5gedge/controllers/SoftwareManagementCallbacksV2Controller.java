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
import com.verizon.m5gedge.exceptions.FotaV2ResultException;
import com.verizon.m5gedge.http.request.HttpMethod;
import com.verizon.m5gedge.http.response.ApiResponse;
import com.verizon.m5gedge.models.CallbackSummary;
import com.verizon.m5gedge.models.FotaV2CallbackRegistrationRequest;
import com.verizon.m5gedge.models.FotaV2CallbackRegistrationResult;
import com.verizon.m5gedge.models.FotaV2SuccessResult;
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
public final class SoftwareManagementCallbacksV2Controller extends BaseController {

    /**
     * Initializes the controller.
     * @param globalConfig    Configurations added in client.
     */
    public SoftwareManagementCallbacksV2Controller(GlobalConfiguration globalConfig) {
        super(globalConfig);
    }

    /**
     * This endpoint allows user to get the registered callback information.
     * @param  account  Required parameter: Account identifier.
     * @return    Returns the CallbackSummary wrapped in ApiResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ApiResponse<CallbackSummary> listRegisteredCallbacks(
            final String account) throws ApiException, IOException {
        return prepareListRegisteredCallbacksRequest(account).execute();
    }

    /**
     * This endpoint allows user to get the registered callback information.
     * @param  account  Required parameter: Account identifier.
     * @return    Returns the CallbackSummary wrapped in ApiResponse response from the API call
     */
    public CompletableFuture<ApiResponse<CallbackSummary>> listRegisteredCallbacksAsync(
            final String account) {
        try { 
            return prepareListRegisteredCallbacksRequest(account).executeAsync(); 
        } catch (Exception e) {  
            throw new CompletionException(e); 
        }
    }

    /**
     * Builds the ApiCall object for listRegisteredCallbacks.
     */
    private ApiCall<ApiResponse<CallbackSummary>, ApiException> prepareListRegisteredCallbacksRequest(
            final String account) throws IOException {
        return new ApiCall.Builder<ApiResponse<CallbackSummary>, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.SOFTWARE_MANAGEMENT_V2.value())
                        .path("/callbacks/{account}")
                        .templateParam(param -> param.key("account").value(account)
                                .shouldEncode(true))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .authenticationKey(BaseController.AUTHENTICATION_KEY)
                        .httpMethod(HttpMethod.GET))
                .responseHandler(responseHandler -> responseHandler
                        .responseClassType(ResponseClassType.API_RESPONSE)
                        .apiResponseDeserializer(
                                response -> ApiHelper.deserialize(response, CallbackSummary.class))
                        .nullify404(false)
                        .localErrorCase("400",
                                 ErrorCase.setReason("Unexpected error.",
                                (reason, context) -> new FotaV2ResultException(reason, context)))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }

    /**
     * This endpoint allows user to update the HTTPS callback address.
     * @param  account  Required parameter: Account identifier.
     * @param  body  Required parameter: Callback URL registration.
     * @return    Returns the FotaV2CallbackRegistrationResult wrapped in ApiResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ApiResponse<FotaV2CallbackRegistrationResult> updateCallback(
            final String account,
            final FotaV2CallbackRegistrationRequest body) throws ApiException, IOException {
        return prepareUpdateCallbackRequest(account, body).execute();
    }

    /**
     * This endpoint allows user to update the HTTPS callback address.
     * @param  account  Required parameter: Account identifier.
     * @param  body  Required parameter: Callback URL registration.
     * @return    Returns the FotaV2CallbackRegistrationResult wrapped in ApiResponse response from the API call
     */
    public CompletableFuture<ApiResponse<FotaV2CallbackRegistrationResult>> updateCallbackAsync(
            final String account,
            final FotaV2CallbackRegistrationRequest body) {
        try { 
            return prepareUpdateCallbackRequest(account, body).executeAsync(); 
        } catch (Exception e) {  
            throw new CompletionException(e); 
        }
    }

    /**
     * Builds the ApiCall object for updateCallback.
     */
    private ApiCall<ApiResponse<FotaV2CallbackRegistrationResult>, ApiException> prepareUpdateCallbackRequest(
            final String account,
            final FotaV2CallbackRegistrationRequest body) throws JsonProcessingException, IOException {
        return new ApiCall.Builder<ApiResponse<FotaV2CallbackRegistrationResult>, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.SOFTWARE_MANAGEMENT_V2.value())
                        .path("/callbacks/{account}")
                        .bodyParam(param -> param.value(body))
                        .bodySerializer(() ->  ApiHelper.serialize(body))
                        .templateParam(param -> param.key("account").value(account)
                                .shouldEncode(true))
                        .headerParam(param -> param.key("Content-Type")
                                .value("*/*").isRequired(false))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .authenticationKey(BaseController.AUTHENTICATION_KEY)
                        .httpMethod(HttpMethod.PUT))
                .responseHandler(responseHandler -> responseHandler
                        .responseClassType(ResponseClassType.API_RESPONSE)
                        .apiResponseDeserializer(
                                response -> ApiHelper.deserialize(response, FotaV2CallbackRegistrationResult.class))
                        .nullify404(false)
                        .localErrorCase("400",
                                 ErrorCase.setReason("Unexpected error.",
                                (reason, context) -> new FotaV2ResultException(reason, context)))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }

    /**
     * This endpoint allows user to create the HTTPS callback address.
     * @param  account  Required parameter: Account identifier.
     * @param  body  Required parameter: Callback URL registration.
     * @return    Returns the FotaV2CallbackRegistrationResult wrapped in ApiResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ApiResponse<FotaV2CallbackRegistrationResult> registerCallback(
            final String account,
            final FotaV2CallbackRegistrationRequest body) throws ApiException, IOException {
        return prepareRegisterCallbackRequest(account, body).execute();
    }

    /**
     * This endpoint allows user to create the HTTPS callback address.
     * @param  account  Required parameter: Account identifier.
     * @param  body  Required parameter: Callback URL registration.
     * @return    Returns the FotaV2CallbackRegistrationResult wrapped in ApiResponse response from the API call
     */
    public CompletableFuture<ApiResponse<FotaV2CallbackRegistrationResult>> registerCallbackAsync(
            final String account,
            final FotaV2CallbackRegistrationRequest body) {
        try { 
            return prepareRegisterCallbackRequest(account, body).executeAsync(); 
        } catch (Exception e) {  
            throw new CompletionException(e); 
        }
    }

    /**
     * Builds the ApiCall object for registerCallback.
     */
    private ApiCall<ApiResponse<FotaV2CallbackRegistrationResult>, ApiException> prepareRegisterCallbackRequest(
            final String account,
            final FotaV2CallbackRegistrationRequest body) throws JsonProcessingException, IOException {
        return new ApiCall.Builder<ApiResponse<FotaV2CallbackRegistrationResult>, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.SOFTWARE_MANAGEMENT_V2.value())
                        .path("/callbacks/{account}")
                        .bodyParam(param -> param.value(body))
                        .bodySerializer(() ->  ApiHelper.serialize(body))
                        .templateParam(param -> param.key("account").value(account)
                                .shouldEncode(true))
                        .headerParam(param -> param.key("Content-Type")
                                .value("*/*").isRequired(false))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .authenticationKey(BaseController.AUTHENTICATION_KEY)
                        .httpMethod(HttpMethod.POST))
                .responseHandler(responseHandler -> responseHandler
                        .responseClassType(ResponseClassType.API_RESPONSE)
                        .apiResponseDeserializer(
                                response -> ApiHelper.deserialize(response, FotaV2CallbackRegistrationResult.class))
                        .nullify404(false)
                        .localErrorCase("400",
                                 ErrorCase.setReason("Unexpected error.",
                                (reason, context) -> new FotaV2ResultException(reason, context)))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }

    /**
     * This endpoint allows user to delete a previously registered callback URL.
     * @param  account  Required parameter: Account identifier.
     * @return    Returns the FotaV2SuccessResult wrapped in ApiResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ApiResponse<FotaV2SuccessResult> deregisterCallback(
            final String account) throws ApiException, IOException {
        return prepareDeregisterCallbackRequest(account).execute();
    }

    /**
     * This endpoint allows user to delete a previously registered callback URL.
     * @param  account  Required parameter: Account identifier.
     * @return    Returns the FotaV2SuccessResult wrapped in ApiResponse response from the API call
     */
    public CompletableFuture<ApiResponse<FotaV2SuccessResult>> deregisterCallbackAsync(
            final String account) {
        try { 
            return prepareDeregisterCallbackRequest(account).executeAsync(); 
        } catch (Exception e) {  
            throw new CompletionException(e); 
        }
    }

    /**
     * Builds the ApiCall object for deregisterCallback.
     */
    private ApiCall<ApiResponse<FotaV2SuccessResult>, ApiException> prepareDeregisterCallbackRequest(
            final String account) throws IOException {
        return new ApiCall.Builder<ApiResponse<FotaV2SuccessResult>, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.SOFTWARE_MANAGEMENT_V2.value())
                        .path("/callbacks/{account}")
                        .templateParam(param -> param.key("account").value(account)
                                .shouldEncode(true))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .authenticationKey(BaseController.AUTHENTICATION_KEY)
                        .httpMethod(HttpMethod.DELETE))
                .responseHandler(responseHandler -> responseHandler
                        .responseClassType(ResponseClassType.API_RESPONSE)
                        .apiResponseDeserializer(
                                response -> ApiHelper.deserialize(response, FotaV2SuccessResult.class))
                        .nullify404(false)
                        .localErrorCase("400",
                                 ErrorCase.setReason("Unexpected error.",
                                (reason, context) -> new FotaV2ResultException(reason, context)))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }
}