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
import com.verizon.m5gedge.exceptions.ConnectivityManagementResultException;
import com.verizon.m5gedge.http.request.HttpMethod;
import com.verizon.m5gedge.http.response.ApiResponse;
import com.verizon.m5gedge.models.ConnectivityManagementSuccessResult;
import com.verizon.m5gedge.models.DeviceManagementResult;
import com.verizon.m5gedge.models.SMSMessagesQueryResult;
import com.verizon.m5gedge.models.SMSSendRequest;
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
public final class SMSController extends BaseController {

    /**
     * Initializes the controller.
     * @param globalConfig    Configurations added in client.
     */
    public SMSController(GlobalConfiguration globalConfig) {
        super(globalConfig);
    }

    /**
     * The messages are queued on the ThingSpace Platform and sent as soon as possible, but they may
     * be delayed due to traffic and routing considerations.
     * @param  body  Required parameter: Request to send SMS.
     * @return    Returns the DeviceManagementResult wrapped in ApiResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ApiResponse<DeviceManagementResult> sendSMSToDevice(
            final SMSSendRequest body) throws ApiException, IOException {
        return prepareSendSMSToDeviceRequest(body).execute();
    }

    /**
     * The messages are queued on the ThingSpace Platform and sent as soon as possible, but they may
     * be delayed due to traffic and routing considerations.
     * @param  body  Required parameter: Request to send SMS.
     * @return    Returns the DeviceManagementResult wrapped in ApiResponse response from the API call
     */
    public CompletableFuture<ApiResponse<DeviceManagementResult>> sendSMSToDeviceAsync(
            final SMSSendRequest body) {
        try { 
            return prepareSendSMSToDeviceRequest(body).executeAsync(); 
        } catch (Exception e) {  
            throw new CompletionException(e); 
        }
    }

    /**
     * Builds the ApiCall object for sendSMSToDevice.
     */
    private ApiCall<ApiResponse<DeviceManagementResult>, ApiException> prepareSendSMSToDeviceRequest(
            final SMSSendRequest body) throws JsonProcessingException, IOException {
        return new ApiCall.Builder<ApiResponse<DeviceManagementResult>, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.THINGSPACE.value())
                        .path("/m2m/v1/sms")
                        .bodyParam(param -> param.value(body))
                        .bodySerializer(() ->  ApiHelper.serialize(body))
                        .headerParam(param -> param.key("Content-Type")
                                .value("application/json").isRequired(false))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .withAuth(auth -> auth
                                .add("oAuth2"))
                        .httpMethod(HttpMethod.POST))
                .responseHandler(responseHandler -> responseHandler
                        .responseClassType(ResponseClassType.API_RESPONSE)
                        .apiResponseDeserializer(
                                response -> ApiHelper.deserialize(response, DeviceManagementResult.class))
                        .nullify404(false)
                        .localErrorCase("400",
                                 ErrorCase.setReason("Error response.",
                                (reason, context) -> new ConnectivityManagementResultException(reason, context)))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }

    /**
     * When HTTP status is 202, a URL will be returned in the Location header of the form
     * /sms/{aname}/history?next={token}. This URL can be used to request the next set of messages.
     * @param  aname  Required parameter: Account name.
     * @param  next  Optional parameter: Continue the previous query from the URL in Location
     *         Header.
     * @return    Returns the SMSMessagesQueryResult wrapped in ApiResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ApiResponse<SMSMessagesQueryResult> listDevicesSMSMessages(
            final String aname,
            final Long next) throws ApiException, IOException {
        return prepareListDevicesSMSMessagesRequest(aname, next).execute();
    }

    /**
     * When HTTP status is 202, a URL will be returned in the Location header of the form
     * /sms/{aname}/history?next={token}. This URL can be used to request the next set of messages.
     * @param  aname  Required parameter: Account name.
     * @param  next  Optional parameter: Continue the previous query from the URL in Location
     *         Header.
     * @return    Returns the SMSMessagesQueryResult wrapped in ApiResponse response from the API call
     */
    public CompletableFuture<ApiResponse<SMSMessagesQueryResult>> listDevicesSMSMessagesAsync(
            final String aname,
            final Long next) {
        try { 
            return prepareListDevicesSMSMessagesRequest(aname, next).executeAsync(); 
        } catch (Exception e) {  
            throw new CompletionException(e); 
        }
    }

    /**
     * Builds the ApiCall object for listDevicesSMSMessages.
     */
    private ApiCall<ApiResponse<SMSMessagesQueryResult>, ApiException> prepareListDevicesSMSMessagesRequest(
            final String aname,
            final Long next) throws IOException {
        return new ApiCall.Builder<ApiResponse<SMSMessagesQueryResult>, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.THINGSPACE.value())
                        .path("/m2m/v1/sms/{aname}/history")
                        .queryParam(param -> param.key("next")
                                .value(next).isRequired(false))
                        .templateParam(param -> param.key("aname").value(aname)
                                .shouldEncode(true))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .withAuth(auth -> auth
                                .add("oAuth2"))
                        .httpMethod(HttpMethod.GET))
                .responseHandler(responseHandler -> responseHandler
                        .responseClassType(ResponseClassType.API_RESPONSE)
                        .apiResponseDeserializer(
                                response -> ApiHelper.deserialize(response, SMSMessagesQueryResult.class))
                        .nullify404(false)
                        .localErrorCase("400",
                                 ErrorCase.setReason("Error response.",
                                (reason, context) -> new ConnectivityManagementResultException(reason, context)))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }

    /**
     * Tells the ThingSpace Platform to start sending mobile-originated SMS messages through the
     * EnhancedConnectivityService callback service. SMS messages from devices are queued until they
     * are retrieved by your application, either by callback or synchronously with GET
     * /sms/{accountName}/history.
     * @param  aname  Required parameter: Account name.
     * @return    Returns the ConnectivityManagementSuccessResult wrapped in ApiResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ApiResponse<ConnectivityManagementSuccessResult> startQueuedSMSDelivery(
            final String aname) throws ApiException, IOException {
        return prepareStartQueuedSMSDeliveryRequest(aname).execute();
    }

    /**
     * Tells the ThingSpace Platform to start sending mobile-originated SMS messages through the
     * EnhancedConnectivityService callback service. SMS messages from devices are queued until they
     * are retrieved by your application, either by callback or synchronously with GET
     * /sms/{accountName}/history.
     * @param  aname  Required parameter: Account name.
     * @return    Returns the ConnectivityManagementSuccessResult wrapped in ApiResponse response from the API call
     */
    public CompletableFuture<ApiResponse<ConnectivityManagementSuccessResult>> startQueuedSMSDeliveryAsync(
            final String aname) {
        try { 
            return prepareStartQueuedSMSDeliveryRequest(aname).executeAsync(); 
        } catch (Exception e) {  
            throw new CompletionException(e); 
        }
    }

    /**
     * Builds the ApiCall object for startQueuedSMSDelivery.
     */
    private ApiCall<ApiResponse<ConnectivityManagementSuccessResult>, ApiException> prepareStartQueuedSMSDeliveryRequest(
            final String aname) throws IOException {
        return new ApiCall.Builder<ApiResponse<ConnectivityManagementSuccessResult>, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.THINGSPACE.value())
                        .path("/m2m/v1/sms/{aname}/startCallbacks")
                        .templateParam(param -> param.key("aname").value(aname)
                                .shouldEncode(true))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .withAuth(auth -> auth
                                .add("oAuth2"))
                        .httpMethod(HttpMethod.PUT))
                .responseHandler(responseHandler -> responseHandler
                        .responseClassType(ResponseClassType.API_RESPONSE)
                        .apiResponseDeserializer(
                                response -> ApiHelper.deserialize(response, ConnectivityManagementSuccessResult.class))
                        .nullify404(false)
                        .localErrorCase("400",
                                 ErrorCase.setReason("Error response.",
                                (reason, context) -> new ConnectivityManagementResultException(reason, context)))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }
}