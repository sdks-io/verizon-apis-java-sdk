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
import com.verizon.m5gedge.exceptions.DeviceLocationResultException;
import com.verizon.m5gedge.http.request.HttpMethod;
import com.verizon.m5gedge.http.response.ApiResponse;
import com.verizon.m5gedge.models.CallbackRegistrationResult;
import com.verizon.m5gedge.models.CallbackServiceNameEnum;
import com.verizon.m5gedge.models.DeviceLocationCallback;
import com.verizon.m5gedge.models.DeviceLocationSuccessResult;
import com.verizon.m5gedge.models.TransactionID;
import io.apimatic.core.ApiCall;
import io.apimatic.core.ErrorCase;
import io.apimatic.core.GlobalConfiguration;
import io.apimatic.coreinterfaces.http.request.ResponseClassType;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionException;

/**
 * This class lists all the endpoints of the groups.
 */
public final class DeviceLocationCallbacksController extends BaseController {

    /**
     * Initializes the controller.
     * @param globalConfig    Configurations added in client.
     */
    public DeviceLocationCallbacksController(GlobalConfiguration globalConfig) {
        super(globalConfig);
    }

    /**
     * Cancel an asynchronous report request.
     * @param  accountName  Required parameter: Account identifier in "##########-#####".
     * @param  txid  Required parameter: The `transactionId` value.
     * @return    Returns the TransactionID wrapped in ApiResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ApiResponse<TransactionID> cancelAsyncReport(
            final String accountName,
            final String txid) throws ApiException, IOException {
        return prepareCancelAsyncReportRequest(accountName, txid).execute();
    }

    /**
     * Cancel an asynchronous report request.
     * @param  accountName  Required parameter: Account identifier in "##########-#####".
     * @param  txid  Required parameter: The `transactionId` value.
     * @return    Returns the TransactionID wrapped in ApiResponse response from the API call
     */
    public CompletableFuture<ApiResponse<TransactionID>> cancelAsyncReportAsync(
            final String accountName,
            final String txid) {
        try { 
            return prepareCancelAsyncReportRequest(accountName, txid).executeAsync(); 
        } catch (Exception e) {  
            throw new CompletionException(e); 
        }
    }

    /**
     * Builds the ApiCall object for cancelAsyncReport.
     */
    private ApiCall<ApiResponse<TransactionID>, ApiException> prepareCancelAsyncReportRequest(
            final String accountName,
            final String txid) throws IOException {
        return new ApiCall.Builder<ApiResponse<TransactionID>, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.DEVICE_LOCATION.value())
                        .path("/devicelocations/{txid}")
                        .queryParam(param -> param.key("accountName")
                                .value(accountName))
                        .templateParam(param -> param.key("txid").value(txid)
                                .shouldEncode(true))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .withAuth(auth -> auth
                                .and(andAuth -> andAuth
                                        .add("thingspace_oauth")
                                        .add("VZ-M2M-Token")))
                        .httpMethod(HttpMethod.DELETE))
                .responseHandler(responseHandler -> responseHandler
                        .responseClassType(ResponseClassType.API_RESPONSE)
                        .apiResponseDeserializer(
                                response -> ApiHelper.deserialize(response, TransactionID.class))
                        .nullify404(false)
                        .localErrorCase(ErrorCase.DEFAULT,
                                 ErrorCase.setReason("Unexpected error.",
                                (reason, context) -> new DeviceLocationResultException(reason, context)))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }

    /**
     * Returns a list of all registered callback URLs for the account.
     * @param  accountName  Required parameter: Account number.
     * @return    Returns the List of DeviceLocationCallback wrapped in ApiResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ApiResponse<List<DeviceLocationCallback>> listRegisteredCallbacks(
            final String accountName) throws ApiException, IOException {
        return prepareListRegisteredCallbacksRequest(accountName).execute();
    }

    /**
     * Returns a list of all registered callback URLs for the account.
     * @param  accountName  Required parameter: Account number.
     * @return    Returns the List of DeviceLocationCallback wrapped in ApiResponse response from the API call
     */
    public CompletableFuture<ApiResponse<List<DeviceLocationCallback>>> listRegisteredCallbacksAsync(
            final String accountName) {
        try { 
            return prepareListRegisteredCallbacksRequest(accountName).executeAsync(); 
        } catch (Exception e) {  
            throw new CompletionException(e); 
        }
    }

    /**
     * Builds the ApiCall object for listRegisteredCallbacks.
     */
    private ApiCall<ApiResponse<List<DeviceLocationCallback>>, ApiException> prepareListRegisteredCallbacksRequest(
            final String accountName) throws IOException {
        return new ApiCall.Builder<ApiResponse<List<DeviceLocationCallback>>, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.DEVICE_LOCATION.value())
                        .path("/callbacks/{accountName}")
                        .templateParam(param -> param.key("accountName").value(accountName)
                                .shouldEncode(true))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .withAuth(auth -> auth
                                .and(andAuth -> andAuth
                                        .add("thingspace_oauth")
                                        .add("VZ-M2M-Token")))
                        .httpMethod(HttpMethod.GET))
                .responseHandler(responseHandler -> responseHandler
                        .responseClassType(ResponseClassType.API_RESPONSE)
                        .apiResponseDeserializer(
                                response -> ApiHelper.deserializeArray(response,
                                        DeviceLocationCallback[].class))
                        .nullify404(false)
                        .localErrorCase("400",
                                 ErrorCase.setReason("Error response.",
                                (reason, context) -> new DeviceLocationResultException(reason, context)))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }

    /**
     * Provide a URL to receive messages from a ThingSpace callback service.
     * @param  accountName  Required parameter: Account number.
     * @param  body  Required parameter: Request to register a callback.
     * @return    Returns the CallbackRegistrationResult wrapped in ApiResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ApiResponse<CallbackRegistrationResult> registerCallback(
            final String accountName,
            final DeviceLocationCallback body) throws ApiException, IOException {
        return prepareRegisterCallbackRequest(accountName, body).execute();
    }

    /**
     * Provide a URL to receive messages from a ThingSpace callback service.
     * @param  accountName  Required parameter: Account number.
     * @param  body  Required parameter: Request to register a callback.
     * @return    Returns the CallbackRegistrationResult wrapped in ApiResponse response from the API call
     */
    public CompletableFuture<ApiResponse<CallbackRegistrationResult>> registerCallbackAsync(
            final String accountName,
            final DeviceLocationCallback body) {
        try { 
            return prepareRegisterCallbackRequest(accountName, body).executeAsync(); 
        } catch (Exception e) {  
            throw new CompletionException(e); 
        }
    }

    /**
     * Builds the ApiCall object for registerCallback.
     */
    private ApiCall<ApiResponse<CallbackRegistrationResult>, ApiException> prepareRegisterCallbackRequest(
            final String accountName,
            final DeviceLocationCallback body) throws JsonProcessingException, IOException {
        return new ApiCall.Builder<ApiResponse<CallbackRegistrationResult>, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.DEVICE_LOCATION.value())
                        .path("/callbacks/{accountName}")
                        .bodyParam(param -> param.value(body))
                        .bodySerializer(() ->  ApiHelper.serialize(body))
                        .templateParam(param -> param.key("accountName").value(accountName)
                                .shouldEncode(true))
                        .headerParam(param -> param.key("Content-Type")
                                .value("*/*").isRequired(false))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .withAuth(auth -> auth
                                .and(andAuth -> andAuth
                                        .add("thingspace_oauth")
                                        .add("VZ-M2M-Token")))
                        .httpMethod(HttpMethod.POST))
                .responseHandler(responseHandler -> responseHandler
                        .responseClassType(ResponseClassType.API_RESPONSE)
                        .apiResponseDeserializer(
                                response -> ApiHelper.deserialize(response, CallbackRegistrationResult.class))
                        .nullify404(false)
                        .localErrorCase("400",
                                 ErrorCase.setReason("Error response.",
                                (reason, context) -> new DeviceLocationResultException(reason, context)))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }

    /**
     * Deregister a URL to stop receiving callback messages.
     * @param  accountName  Required parameter: Account number.
     * @param  service  Required parameter: Callback service name.
     * @return    Returns the DeviceLocationSuccessResult wrapped in ApiResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ApiResponse<DeviceLocationSuccessResult> deregisterCallback(
            final String accountName,
            final CallbackServiceNameEnum service) throws ApiException, IOException {
        return prepareDeregisterCallbackRequest(accountName, service).execute();
    }

    /**
     * Deregister a URL to stop receiving callback messages.
     * @param  accountName  Required parameter: Account number.
     * @param  service  Required parameter: Callback service name.
     * @return    Returns the DeviceLocationSuccessResult wrapped in ApiResponse response from the API call
     */
    public CompletableFuture<ApiResponse<DeviceLocationSuccessResult>> deregisterCallbackAsync(
            final String accountName,
            final CallbackServiceNameEnum service) {
        try { 
            return prepareDeregisterCallbackRequest(accountName, service).executeAsync(); 
        } catch (Exception e) {  
            throw new CompletionException(e); 
        }
    }

    /**
     * Builds the ApiCall object for deregisterCallback.
     */
    private ApiCall<ApiResponse<DeviceLocationSuccessResult>, ApiException> prepareDeregisterCallbackRequest(
            final String accountName,
            final CallbackServiceNameEnum service) throws IOException {
        return new ApiCall.Builder<ApiResponse<DeviceLocationSuccessResult>, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.DEVICE_LOCATION.value())
                        .path("/callbacks/{accountName}/name/{service}")
                        .templateParam(param -> param.key("accountName").value(accountName)
                                .shouldEncode(true))
                        .templateParam(param -> param.key("service").value((service != null) ? service.value() : null)
                                .shouldEncode(true))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .withAuth(auth -> auth
                                .and(andAuth -> andAuth
                                        .add("thingspace_oauth")
                                        .add("VZ-M2M-Token")))
                        .httpMethod(HttpMethod.DELETE))
                .responseHandler(responseHandler -> responseHandler
                        .responseClassType(ResponseClassType.API_RESPONSE)
                        .apiResponseDeserializer(
                                response -> ApiHelper.deserialize(response, DeviceLocationSuccessResult.class))
                        .nullify404(false)
                        .localErrorCase("400",
                                 ErrorCase.setReason("Error response.",
                                (reason, context) -> new DeviceLocationResultException(reason, context)))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }
}