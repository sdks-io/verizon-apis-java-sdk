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
import com.verizon.m5gedge.exceptions.FotaV3ResultException;
import com.verizon.m5gedge.http.request.HttpMethod;
import com.verizon.m5gedge.http.response.ApiResponse;
import com.verizon.m5gedge.models.DeviceIMEI;
import com.verizon.m5gedge.models.DeviceListResult;
import com.verizon.m5gedge.models.DevicesProtocolEnum;
import com.verizon.m5gedge.models.V3AccountDeviceList;
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
public final class AccountDevicesController extends BaseController {

    /**
     * Initializes the controller.
     * @param globalConfig    Configurations added in client.
     */
    public AccountDevicesController(GlobalConfiguration globalConfig) {
        super(globalConfig);
    }

    /**
     * Retrieve account device information such as reported firmware on the devices.
     * @param  acc  Required parameter: Account identifier.
     * @param  lastSeenDeviceId  Optional parameter: Last seen device identifier.
     * @param  protocol  Optional parameter: Filter to retrieve a specific protocol type used.
     * @return    Returns the V3AccountDeviceList wrapped in ApiResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ApiResponse<V3AccountDeviceList> getAccountDeviceInformation(
            final String acc,
            final String lastSeenDeviceId,
            final DevicesProtocolEnum protocol) throws ApiException, IOException {
        return prepareGetAccountDeviceInformationRequest(acc, lastSeenDeviceId, protocol).execute();
    }

    /**
     * Retrieve account device information such as reported firmware on the devices.
     * @param  acc  Required parameter: Account identifier.
     * @param  lastSeenDeviceId  Optional parameter: Last seen device identifier.
     * @param  protocol  Optional parameter: Filter to retrieve a specific protocol type used.
     * @return    Returns the V3AccountDeviceList wrapped in ApiResponse response from the API call
     */
    public CompletableFuture<ApiResponse<V3AccountDeviceList>> getAccountDeviceInformationAsync(
            final String acc,
            final String lastSeenDeviceId,
            final DevicesProtocolEnum protocol) {
        try { 
            return prepareGetAccountDeviceInformationRequest(acc, lastSeenDeviceId,
            protocol).executeAsync(); 
        } catch (Exception e) {  
            throw new CompletionException(e); 
        }
    }

    /**
     * Builds the ApiCall object for getAccountDeviceInformation.
     */
    private ApiCall<ApiResponse<V3AccountDeviceList>, ApiException> prepareGetAccountDeviceInformationRequest(
            final String acc,
            final String lastSeenDeviceId,
            final DevicesProtocolEnum protocol) throws IOException {
        return new ApiCall.Builder<ApiResponse<V3AccountDeviceList>, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.SOFTWARE_MANAGEMENT_V3.value())
                        .path("/devices/{acc}")
                        .queryParam(param -> param.key("lastSeenDeviceId")
                                .value(lastSeenDeviceId).isRequired(false))
                        .queryParam(param -> param.key("protocol")
                                .value((protocol != null) ? protocol.value() : "LWM2M").isRequired(false))
                        .templateParam(param -> param.key("acc").value(acc)
                                .shouldEncode(true))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .withAuth(auth -> auth
                                .add("oAuth2"))
                        .httpMethod(HttpMethod.GET))
                .responseHandler(responseHandler -> responseHandler
                        .responseClassType(ResponseClassType.API_RESPONSE)
                        .apiResponseDeserializer(
                                response -> ApiHelper.deserialize(response, V3AccountDeviceList.class))
                        .nullify404(false)
                        .localErrorCase("400",
                                 ErrorCase.setReason("Unexpected error.",
                                (reason, context) -> new FotaV3ResultException(reason, context)))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }

    /**
     * Retrieve device information for a list of devices on an account.
     * @param  acc  Required parameter: Account identifier.
     * @param  body  Required parameter: Request device list information.
     * @return    Returns the DeviceListResult wrapped in ApiResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ApiResponse<DeviceListResult> listAccountDevicesInformation(
            final String acc,
            final DeviceIMEI body) throws ApiException, IOException {
        return prepareListAccountDevicesInformationRequest(acc, body).execute();
    }

    /**
     * Retrieve device information for a list of devices on an account.
     * @param  acc  Required parameter: Account identifier.
     * @param  body  Required parameter: Request device list information.
     * @return    Returns the DeviceListResult wrapped in ApiResponse response from the API call
     */
    public CompletableFuture<ApiResponse<DeviceListResult>> listAccountDevicesInformationAsync(
            final String acc,
            final DeviceIMEI body) {
        try { 
            return prepareListAccountDevicesInformationRequest(acc, body).executeAsync(); 
        } catch (Exception e) {  
            throw new CompletionException(e); 
        }
    }

    /**
     * Builds the ApiCall object for listAccountDevicesInformation.
     */
    private ApiCall<ApiResponse<DeviceListResult>, ApiException> prepareListAccountDevicesInformationRequest(
            final String acc,
            final DeviceIMEI body) throws JsonProcessingException, IOException {
        return new ApiCall.Builder<ApiResponse<DeviceListResult>, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.SOFTWARE_MANAGEMENT_V3.value())
                        .path("/devices/{acc}")
                        .bodyParam(param -> param.value(body))
                        .bodySerializer(() ->  ApiHelper.serialize(body))
                        .templateParam(param -> param.key("acc").value(acc)
                                .shouldEncode(true))
                        .headerParam(param -> param.key("Content-Type")
                                .value("application/json").isRequired(false))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .withAuth(auth -> auth
                                .add("oAuth2"))
                        .httpMethod(HttpMethod.POST))
                .responseHandler(responseHandler -> responseHandler
                        .responseClassType(ResponseClassType.API_RESPONSE)
                        .apiResponseDeserializer(
                                response -> ApiHelper.deserialize(response, DeviceListResult.class))
                        .nullify404(false)
                        .localErrorCase("400",
                                 ErrorCase.setReason("Unexpected error.",
                                (reason, context) -> new FotaV3ResultException(reason, context)))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }
}