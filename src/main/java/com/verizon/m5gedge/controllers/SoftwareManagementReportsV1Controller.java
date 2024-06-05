/*
 * VerizonLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.verizon.m5gedge.controllers;

import com.verizon.m5gedge.ApiHelper;
import com.verizon.m5gedge.Server;
import com.verizon.m5gedge.exceptions.ApiException;
import com.verizon.m5gedge.exceptions.FotaV1ResultException;
import com.verizon.m5gedge.http.request.HttpMethod;
import com.verizon.m5gedge.http.response.ApiResponse;
import com.verizon.m5gedge.models.DeviceListQueryResult;
import com.verizon.m5gedge.models.DeviceUpgradeHistory;
import com.verizon.m5gedge.models.UpgradeListQueryResult;
import com.verizon.m5gedge.models.UpgradeStatusEnum;
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
public final class SoftwareManagementReportsV1Controller extends BaseController {

    /**
     * Initializes the controller.
     * @param globalConfig    Configurations added in client.
     */
    public SoftwareManagementReportsV1Controller(GlobalConfiguration globalConfig) {
        super(globalConfig);
    }

    /**
     * Returns an array of all devices in the specified account. Each device object includes
     * information needed for managing firmware, including the device make and model, MDN and IMEI,
     * and current firmware version.
     * @param  account  Required parameter: Account identifier in "##########-#####".
     * @param  startIndex  Required parameter: Only return devices with IMEIs larger than this
     *         value. Use 0 for the first request. If `hasMoreData`=true in the response, use the
     *         `lastSeenDeviceId` value from the response as the startIndex in the next request.
     * @return    Returns the DeviceListQueryResult wrapped in ApiResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ApiResponse<DeviceListQueryResult> listAccountDevices(
            final String account,
            final String startIndex) throws ApiException, IOException {
        return prepareListAccountDevicesRequest(account, startIndex).execute();
    }

    /**
     * Returns an array of all devices in the specified account. Each device object includes
     * information needed for managing firmware, including the device make and model, MDN and IMEI,
     * and current firmware version.
     * @param  account  Required parameter: Account identifier in "##########-#####".
     * @param  startIndex  Required parameter: Only return devices with IMEIs larger than this
     *         value. Use 0 for the first request. If `hasMoreData`=true in the response, use the
     *         `lastSeenDeviceId` value from the response as the startIndex in the next request.
     * @return    Returns the DeviceListQueryResult wrapped in ApiResponse response from the API call
     */
    public CompletableFuture<ApiResponse<DeviceListQueryResult>> listAccountDevicesAsync(
            final String account,
            final String startIndex) {
        try { 
            return prepareListAccountDevicesRequest(account, startIndex).executeAsync(); 
        } catch (Exception e) {  
            throw new CompletionException(e); 
        }
    }

    /**
     * Builds the ApiCall object for listAccountDevices.
     */
    private ApiCall<ApiResponse<DeviceListQueryResult>, ApiException> prepareListAccountDevicesRequest(
            final String account,
            final String startIndex) throws IOException {
        return new ApiCall.Builder<ApiResponse<DeviceListQueryResult>, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.SOFTWARE_MANAGEMENT_V1.value())
                        .path("/devices/{account}/index/{startIndex}")
                        .templateParam(param -> param.key("account").value(account)
                                .shouldEncode(true))
                        .templateParam(param -> param.key("startIndex").value(startIndex)
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
                                response -> ApiHelper.deserialize(response, DeviceListQueryResult.class))
                        .nullify404(false)
                        .localErrorCase("400",
                                 ErrorCase.setReason("Unexpected error.",
                                (reason, context) -> new FotaV1ResultException(reason, context)))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }

    /**
     * Returns a list of all upgrades with a specified status.
     * @param  account  Required parameter: Account identifier in "##########-#####".
     * @param  upgradeStatus  Required parameter: The status of the upgrades that you want to
     *         retrieve.
     * @param  startIndex  Required parameter: The zero-based number of the first record to return.
     *         Set startIndex=0 for the first request. If `hasMoreFlag`=true in the response, use
     *         the `lastSeenUpgradeId` value from the response as the startIndex in the next
     *         request.
     * @return    Returns the UpgradeListQueryResult wrapped in ApiResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ApiResponse<UpgradeListQueryResult> listUpgradesForSpecifiedStatus(
            final String account,
            final UpgradeStatusEnum upgradeStatus,
            final String startIndex) throws ApiException, IOException {
        return prepareListUpgradesForSpecifiedStatusRequest(account, upgradeStatus,
                startIndex).execute();
    }

    /**
     * Returns a list of all upgrades with a specified status.
     * @param  account  Required parameter: Account identifier in "##########-#####".
     * @param  upgradeStatus  Required parameter: The status of the upgrades that you want to
     *         retrieve.
     * @param  startIndex  Required parameter: The zero-based number of the first record to return.
     *         Set startIndex=0 for the first request. If `hasMoreFlag`=true in the response, use
     *         the `lastSeenUpgradeId` value from the response as the startIndex in the next
     *         request.
     * @return    Returns the UpgradeListQueryResult wrapped in ApiResponse response from the API call
     */
    public CompletableFuture<ApiResponse<UpgradeListQueryResult>> listUpgradesForSpecifiedStatusAsync(
            final String account,
            final UpgradeStatusEnum upgradeStatus,
            final String startIndex) {
        try { 
            return prepareListUpgradesForSpecifiedStatusRequest(account, upgradeStatus,
            startIndex).executeAsync(); 
        } catch (Exception e) {  
            throw new CompletionException(e); 
        }
    }

    /**
     * Builds the ApiCall object for listUpgradesForSpecifiedStatus.
     */
    private ApiCall<ApiResponse<UpgradeListQueryResult>, ApiException> prepareListUpgradesForSpecifiedStatusRequest(
            final String account,
            final UpgradeStatusEnum upgradeStatus,
            final String startIndex) throws IOException {
        return new ApiCall.Builder<ApiResponse<UpgradeListQueryResult>, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.SOFTWARE_MANAGEMENT_V1.value())
                        .path("/reports/{account}/status/{upgradeStatus}/index/{startIndex}")
                        .templateParam(param -> param.key("account").value(account)
                                .shouldEncode(true))
                        .templateParam(param -> param.key("upgradeStatus").value((upgradeStatus != null) ? upgradeStatus.value() : null)
                                .shouldEncode(true))
                        .templateParam(param -> param.key("startIndex").value(startIndex)
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
                                response -> ApiHelper.deserialize(response, UpgradeListQueryResult.class))
                        .nullify404(false)
                        .localErrorCase("400",
                                 ErrorCase.setReason("Unexpected error.",
                                (reason, context) -> new FotaV1ResultException(reason, context)))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }

    /**
     * Returns the upgrade history of the specified device from the previous six months.
     * @param  account  Required parameter: Account identifier in "##########-#####".
     * @param  deviceId  Required parameter: The IMEI of the device.
     * @return    Returns the List of DeviceUpgradeHistory wrapped in ApiResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ApiResponse<List<DeviceUpgradeHistory>> getDeviceFirmwareUpgradeHistory(
            final String account,
            final String deviceId) throws ApiException, IOException {
        return prepareGetDeviceFirmwareUpgradeHistoryRequest(account, deviceId).execute();
    }

    /**
     * Returns the upgrade history of the specified device from the previous six months.
     * @param  account  Required parameter: Account identifier in "##########-#####".
     * @param  deviceId  Required parameter: The IMEI of the device.
     * @return    Returns the List of DeviceUpgradeHistory wrapped in ApiResponse response from the API call
     */
    public CompletableFuture<ApiResponse<List<DeviceUpgradeHistory>>> getDeviceFirmwareUpgradeHistoryAsync(
            final String account,
            final String deviceId) {
        try { 
            return prepareGetDeviceFirmwareUpgradeHistoryRequest(account, deviceId).executeAsync(); 
        } catch (Exception e) {  
            throw new CompletionException(e); 
        }
    }

    /**
     * Builds the ApiCall object for getDeviceFirmwareUpgradeHistory.
     */
    private ApiCall<ApiResponse<List<DeviceUpgradeHistory>>, ApiException> prepareGetDeviceFirmwareUpgradeHistoryRequest(
            final String account,
            final String deviceId) throws IOException {
        return new ApiCall.Builder<ApiResponse<List<DeviceUpgradeHistory>>, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.SOFTWARE_MANAGEMENT_V1.value())
                        .path("/reports/{account}/devices/{deviceId}")
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
                                        DeviceUpgradeHistory[].class))
                        .nullify404(false)
                        .localErrorCase("400",
                                 ErrorCase.setReason("Unexpected error.",
                                (reason, context) -> new FotaV1ResultException(reason, context)))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }
}