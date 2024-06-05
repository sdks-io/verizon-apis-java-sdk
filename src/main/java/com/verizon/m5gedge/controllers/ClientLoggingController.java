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
import com.verizon.m5gedge.models.DeviceLog;
import com.verizon.m5gedge.models.DeviceLoggingRequest;
import com.verizon.m5gedge.models.DeviceLoggingStatus;
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
public final class ClientLoggingController extends BaseController {

    /**
     * Initializes the controller.
     * @param globalConfig    Configurations added in client.
     */
    public ClientLoggingController(GlobalConfiguration globalConfig) {
        super(globalConfig);
    }

    /**
     * Returns an array of all devices in the specified account for which logging is enabled.
     * @param  account  Required parameter: Account identifier.
     * @return    Returns the List of DeviceLoggingStatus wrapped in ApiResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ApiResponse<List<DeviceLoggingStatus>> listDevicesWithLoggingEnabled(
            final String account) throws ApiException, IOException {
        return prepareListDevicesWithLoggingEnabledRequest(account).execute();
    }

    /**
     * Returns an array of all devices in the specified account for which logging is enabled.
     * @param  account  Required parameter: Account identifier.
     * @return    Returns the List of DeviceLoggingStatus wrapped in ApiResponse response from the API call
     */
    public CompletableFuture<ApiResponse<List<DeviceLoggingStatus>>> listDevicesWithLoggingEnabledAsync(
            final String account) {
        try { 
            return prepareListDevicesWithLoggingEnabledRequest(account).executeAsync(); 
        } catch (Exception e) {  
            throw new CompletionException(e); 
        }
    }

    /**
     * Builds the ApiCall object for listDevicesWithLoggingEnabled.
     */
    private ApiCall<ApiResponse<List<DeviceLoggingStatus>>, ApiException> prepareListDevicesWithLoggingEnabledRequest(
            final String account) throws IOException {
        return new ApiCall.Builder<ApiResponse<List<DeviceLoggingStatus>>, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.SOFTWARE_MANAGEMENT_V2.value())
                        .path("/logging/{account}/devices")
                        .templateParam(param -> param.key("account").value(account)
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
                                        DeviceLoggingStatus[].class))
                        .nullify404(false)
                        .localErrorCase("400",
                                 ErrorCase.setReason("Unexpected error.",
                                (reason, context) -> new FotaV2ResultException(reason, context)))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }

    /**
     * Each customer may have a maximum of 20 devices enabled for logging.
     * @param  account  Required parameter: Account identifier.
     * @param  body  Required parameter: Device logging information.
     * @return    Returns the List of DeviceLoggingStatus wrapped in ApiResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ApiResponse<List<DeviceLoggingStatus>> enableLoggingForDevices(
            final String account,
            final DeviceLoggingRequest body) throws ApiException, IOException {
        return prepareEnableLoggingForDevicesRequest(account, body).execute();
    }

    /**
     * Each customer may have a maximum of 20 devices enabled for logging.
     * @param  account  Required parameter: Account identifier.
     * @param  body  Required parameter: Device logging information.
     * @return    Returns the List of DeviceLoggingStatus wrapped in ApiResponse response from the API call
     */
    public CompletableFuture<ApiResponse<List<DeviceLoggingStatus>>> enableLoggingForDevicesAsync(
            final String account,
            final DeviceLoggingRequest body) {
        try { 
            return prepareEnableLoggingForDevicesRequest(account, body).executeAsync(); 
        } catch (Exception e) {  
            throw new CompletionException(e); 
        }
    }

    /**
     * Builds the ApiCall object for enableLoggingForDevices.
     */
    private ApiCall<ApiResponse<List<DeviceLoggingStatus>>, ApiException> prepareEnableLoggingForDevicesRequest(
            final String account,
            final DeviceLoggingRequest body) throws JsonProcessingException, IOException {
        return new ApiCall.Builder<ApiResponse<List<DeviceLoggingStatus>>, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.SOFTWARE_MANAGEMENT_V2.value())
                        .path("/logging/{account}/devices")
                        .bodyParam(param -> param.value(body))
                        .bodySerializer(() ->  ApiHelper.serialize(body))
                        .templateParam(param -> param.key("account").value(account)
                                .shouldEncode(true))
                        .headerParam(param -> param.key("Content-Type")
                                .value("*/*").isRequired(false))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .withAuth(auth -> auth
                                .and(andAuth -> andAuth
                                        .add("thingspace_oauth")
                                        .add("VZ-M2M-Token")))
                        .httpMethod(HttpMethod.PUT))
                .responseHandler(responseHandler -> responseHandler
                        .responseClassType(ResponseClassType.API_RESPONSE)
                        .apiResponseDeserializer(
                                response -> ApiHelper.deserializeArray(response,
                                        DeviceLoggingStatus[].class))
                        .nullify404(false)
                        .localErrorCase("400",
                                 ErrorCase.setReason("Unexpected error.",
                                (reason, context) -> new FotaV2ResultException(reason, context)))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }

    /**
     * Turn logging off for a list of devices.
     * @param  account  Required parameter: Account identifier.
     * @param  deviceIds  Required parameter: The list of device IDs.
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ApiResponse<Void> disableLoggingForDevices(
            final String account,
            final String deviceIds) throws ApiException, IOException {
        return prepareDisableLoggingForDevicesRequest(account, deviceIds).execute();
    }

    /**
     * Turn logging off for a list of devices.
     * @param  account  Required parameter: Account identifier.
     * @param  deviceIds  Required parameter: The list of device IDs.
     * @return    Returns the Void wrapped in ApiResponse response from the API call
     */
    public CompletableFuture<ApiResponse<Void>> disableLoggingForDevicesAsync(
            final String account,
            final String deviceIds) {
        try { 
            return prepareDisableLoggingForDevicesRequest(account, deviceIds).executeAsync(); 
        } catch (Exception e) {  
            throw new CompletionException(e); 
        }
    }

    /**
     * Builds the ApiCall object for disableLoggingForDevices.
     */
    private ApiCall<ApiResponse<Void>, ApiException> prepareDisableLoggingForDevicesRequest(
            final String account,
            final String deviceIds) throws IOException {
        return new ApiCall.Builder<ApiResponse<Void>, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.SOFTWARE_MANAGEMENT_V2.value())
                        .path("/logging/{account}/devices")
                        .queryParam(param -> param.key("deviceIds")
                                .value(deviceIds))
                        .templateParam(param -> param.key("account").value(account)
                                .shouldEncode(true))
                        .withAuth(auth -> auth
                                .and(andAuth -> andAuth
                                        .add("thingspace_oauth")
                                        .add("VZ-M2M-Token")))
                        .httpMethod(HttpMethod.DELETE))
                .responseHandler(responseHandler -> responseHandler
                        .responseClassType(ResponseClassType.API_RESPONSE)
                        .nullify404(false)
                        .localErrorCase("400",
                                 ErrorCase.setReason("Unexpected error.",
                                (reason, context) -> new FotaV2ResultException(reason, context)))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }

    /**
     * Enables logging for a specific device.
     * @param  account  Required parameter: Account identifier.
     * @param  deviceId  Required parameter: Device IMEI identifier.
     * @return    Returns the DeviceLoggingStatus wrapped in ApiResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ApiResponse<DeviceLoggingStatus> enableDeviceLogging(
            final String account,
            final String deviceId) throws ApiException, IOException {
        return prepareEnableDeviceLoggingRequest(account, deviceId).execute();
    }

    /**
     * Enables logging for a specific device.
     * @param  account  Required parameter: Account identifier.
     * @param  deviceId  Required parameter: Device IMEI identifier.
     * @return    Returns the DeviceLoggingStatus wrapped in ApiResponse response from the API call
     */
    public CompletableFuture<ApiResponse<DeviceLoggingStatus>> enableDeviceLoggingAsync(
            final String account,
            final String deviceId) {
        try { 
            return prepareEnableDeviceLoggingRequest(account, deviceId).executeAsync(); 
        } catch (Exception e) {  
            throw new CompletionException(e); 
        }
    }

    /**
     * Builds the ApiCall object for enableDeviceLogging.
     */
    private ApiCall<ApiResponse<DeviceLoggingStatus>, ApiException> prepareEnableDeviceLoggingRequest(
            final String account,
            final String deviceId) throws IOException {
        return new ApiCall.Builder<ApiResponse<DeviceLoggingStatus>, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.SOFTWARE_MANAGEMENT_V2.value())
                        .path("/logging/{account}/devices/{deviceId}")
                        .templateParam(param -> param.key("account").value(account)
                                .shouldEncode(true))
                        .templateParam(param -> param.key("deviceId").value(deviceId)
                                .shouldEncode(true))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .withAuth(auth -> auth
                                .and(andAuth -> andAuth
                                        .add("thingspace_oauth")
                                        .add("VZ-M2M-Token")))
                        .httpMethod(HttpMethod.PUT))
                .responseHandler(responseHandler -> responseHandler
                        .responseClassType(ResponseClassType.API_RESPONSE)
                        .apiResponseDeserializer(
                                response -> ApiHelper.deserialize(response, DeviceLoggingStatus.class))
                        .nullify404(false)
                        .localErrorCase("400",
                                 ErrorCase.setReason("Unexpected error.",
                                (reason, context) -> new FotaV2ResultException(reason, context)))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }

    /**
     * Disables logging for a specific device.
     * @param  account  Required parameter: Account identifier.
     * @param  deviceId  Required parameter: Device IMEI identifier.
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ApiResponse<Void> disableDeviceLogging(
            final String account,
            final String deviceId) throws ApiException, IOException {
        return prepareDisableDeviceLoggingRequest(account, deviceId).execute();
    }

    /**
     * Disables logging for a specific device.
     * @param  account  Required parameter: Account identifier.
     * @param  deviceId  Required parameter: Device IMEI identifier.
     * @return    Returns the Void wrapped in ApiResponse response from the API call
     */
    public CompletableFuture<ApiResponse<Void>> disableDeviceLoggingAsync(
            final String account,
            final String deviceId) {
        try { 
            return prepareDisableDeviceLoggingRequest(account, deviceId).executeAsync(); 
        } catch (Exception e) {  
            throw new CompletionException(e); 
        }
    }

    /**
     * Builds the ApiCall object for disableDeviceLogging.
     */
    private ApiCall<ApiResponse<Void>, ApiException> prepareDisableDeviceLoggingRequest(
            final String account,
            final String deviceId) throws IOException {
        return new ApiCall.Builder<ApiResponse<Void>, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.SOFTWARE_MANAGEMENT_V2.value())
                        .path("/logging/{account}/devices/{deviceId}")
                        .templateParam(param -> param.key("account").value(account)
                                .shouldEncode(true))
                        .templateParam(param -> param.key("deviceId").value(deviceId)
                                .shouldEncode(true))
                        .withAuth(auth -> auth
                                .and(andAuth -> andAuth
                                        .add("thingspace_oauth")
                                        .add("VZ-M2M-Token")))
                        .httpMethod(HttpMethod.DELETE))
                .responseHandler(responseHandler -> responseHandler
                        .responseClassType(ResponseClassType.API_RESPONSE)
                        .nullify404(false)
                        .localErrorCase("400",
                                 ErrorCase.setReason("Unexpected error.",
                                (reason, context) -> new FotaV2ResultException(reason, context)))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }

    /**
     * Gets logs for a specific device.
     * @param  account  Required parameter: Account identifier.
     * @param  deviceId  Required parameter: Device IMEI identifier.
     * @return    Returns the List of DeviceLog wrapped in ApiResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ApiResponse<List<DeviceLog>> listDeviceLogs(
            final String account,
            final String deviceId) throws ApiException, IOException {
        return prepareListDeviceLogsRequest(account, deviceId).execute();
    }

    /**
     * Gets logs for a specific device.
     * @param  account  Required parameter: Account identifier.
     * @param  deviceId  Required parameter: Device IMEI identifier.
     * @return    Returns the List of DeviceLog wrapped in ApiResponse response from the API call
     */
    public CompletableFuture<ApiResponse<List<DeviceLog>>> listDeviceLogsAsync(
            final String account,
            final String deviceId) {
        try { 
            return prepareListDeviceLogsRequest(account, deviceId).executeAsync(); 
        } catch (Exception e) {  
            throw new CompletionException(e); 
        }
    }

    /**
     * Builds the ApiCall object for listDeviceLogs.
     */
    private ApiCall<ApiResponse<List<DeviceLog>>, ApiException> prepareListDeviceLogsRequest(
            final String account,
            final String deviceId) throws IOException {
        return new ApiCall.Builder<ApiResponse<List<DeviceLog>>, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.SOFTWARE_MANAGEMENT_V2.value())
                        .path("/logging/{account}/devices/{deviceId}/logs")
                        .templateParam(param -> param.key("account").value(account)
                                .shouldEncode(true))
                        .templateParam(param -> param.key("deviceId").value(deviceId)
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
                                        DeviceLog[].class))
                        .nullify404(false)
                        .localErrorCase("400",
                                 ErrorCase.setReason("Unexpected error.",
                                (reason, context) -> new FotaV2ResultException(reason, context)))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }
}