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
import com.verizon.m5gedge.exceptions.SecurityResultException;
import com.verizon.m5gedge.http.request.HttpMethod;
import com.verizon.m5gedge.http.response.ApiResponse;
import com.verizon.m5gedge.models.AssignLicenseRequest;
import com.verizon.m5gedge.models.SecuritySuccessResult;
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
public final class SIMSecureforIoTLicensesController extends BaseController {

    /**
     * Initializes the controller.
     * @param globalConfig    Configurations added in client.
     */
    public SIMSecureforIoTLicensesController(GlobalConfiguration globalConfig) {
        super(globalConfig);
    }

    /**
     * Assigns SIM-Secure for IoT licenses to SIMs.
     * @param  body  Required parameter: Request to assign license to devices.
     * @param  xRequestID  Optional parameter: Transaction Id.
     * @return    Returns the SecuritySuccessResult wrapped in ApiResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ApiResponse<SecuritySuccessResult> assignLicenseToDevices(
            final AssignLicenseRequest body,
            final String xRequestID) throws ApiException, IOException {
        return prepareAssignLicenseToDevicesRequest(body, xRequestID).execute();
    }

    /**
     * Assigns SIM-Secure for IoT licenses to SIMs.
     * @param  body  Required parameter: Request to assign license to devices.
     * @param  xRequestID  Optional parameter: Transaction Id.
     * @return    Returns the SecuritySuccessResult wrapped in ApiResponse response from the API call
     */
    public CompletableFuture<ApiResponse<SecuritySuccessResult>> assignLicenseToDevicesAsync(
            final AssignLicenseRequest body,
            final String xRequestID) {
        try { 
            return prepareAssignLicenseToDevicesRequest(body, xRequestID).executeAsync(); 
        } catch (Exception e) {  
            throw new CompletionException(e); 
        }
    }

    /**
     * Builds the ApiCall object for assignLicenseToDevices.
     */
    private ApiCall<ApiResponse<SecuritySuccessResult>, ApiException> prepareAssignLicenseToDevicesRequest(
            final AssignLicenseRequest body,
            final String xRequestID) throws JsonProcessingException, IOException {
        return new ApiCall.Builder<ApiResponse<SecuritySuccessResult>, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.M2M.value())
                        .path("/v1/devices/license/actions/assign")
                        .bodyParam(param -> param.value(body))
                        .bodySerializer(() ->  ApiHelper.serialize(body))
                        .headerParam(param -> param.key("Content-Type")
                                .value("application/json").isRequired(false))
                        .headerParam(param -> param.key("X-Request-ID")
                                .value(xRequestID).isRequired(false))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .withAuth(auth -> auth
                                .add("oAuth2"))
                        .httpMethod(HttpMethod.POST))
                .responseHandler(responseHandler -> responseHandler
                        .responseClassType(ResponseClassType.API_RESPONSE)
                        .apiResponseDeserializer(
                                response -> ApiHelper.deserialize(response, SecuritySuccessResult.class))
                        .nullify404(false)
                        .localErrorCase("400",
                                 ErrorCase.setReason("Bad request.",
                                (reason, context) -> new SecurityResultException(reason, context)))
                        .localErrorCase("401",
                                 ErrorCase.setReason("Unauthorized request.",
                                (reason, context) -> new SecurityResultException(reason, context)))
                        .localErrorCase("403",
                                 ErrorCase.setReason("Request Forbidden.",
                                (reason, context) -> new SecurityResultException(reason, context)))
                        .localErrorCase("404",
                                 ErrorCase.setReason("Not Found / Does not exist.",
                                (reason, context) -> new SecurityResultException(reason, context)))
                        .localErrorCase("406",
                                 ErrorCase.setReason("Format / Request Unacceptable.",
                                (reason, context) -> new SecurityResultException(reason, context)))
                        .localErrorCase("429",
                                 ErrorCase.setReason("Too many requests.",
                                (reason, context) -> new SecurityResultException(reason, context)))
                        .localErrorCase(ErrorCase.DEFAULT,
                                 ErrorCase.setReason("Error response.",
                                (reason, context) -> new SecurityResultException(reason, context)))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }

    /**
     * Unassigns SIM-Secure for IoT Flexible and Flexible Bundle license from SIMs.
     * @param  xRequestID  Required parameter: Transaction Id.
     * @return    Returns the SecuritySuccessResult wrapped in ApiResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ApiResponse<SecuritySuccessResult> unassignLicenseToDevices(
            final String xRequestID) throws ApiException, IOException {
        return prepareUnassignLicenseToDevicesRequest(xRequestID).execute();
    }

    /**
     * Unassigns SIM-Secure for IoT Flexible and Flexible Bundle license from SIMs.
     * @param  xRequestID  Required parameter: Transaction Id.
     * @return    Returns the SecuritySuccessResult wrapped in ApiResponse response from the API call
     */
    public CompletableFuture<ApiResponse<SecuritySuccessResult>> unassignLicenseToDevicesAsync(
            final String xRequestID) {
        try { 
            return prepareUnassignLicenseToDevicesRequest(xRequestID).executeAsync(); 
        } catch (Exception e) {  
            throw new CompletionException(e); 
        }
    }

    /**
     * Builds the ApiCall object for unassignLicenseToDevices.
     */
    private ApiCall<ApiResponse<SecuritySuccessResult>, ApiException> prepareUnassignLicenseToDevicesRequest(
            final String xRequestID) throws IOException {
        return new ApiCall.Builder<ApiResponse<SecuritySuccessResult>, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.M2M.value())
                        .path("/v1/devices/license/actions/assign")
                        .headerParam(param -> param.key("X-Request-ID")
                                .value(xRequestID).isRequired(false))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .withAuth(auth -> auth
                                .add("oAuth2"))
                        .httpMethod(HttpMethod.DELETE))
                .responseHandler(responseHandler -> responseHandler
                        .responseClassType(ResponseClassType.API_RESPONSE)
                        .apiResponseDeserializer(
                                response -> ApiHelper.deserialize(response, SecuritySuccessResult.class))
                        .nullify404(false)
                        .localErrorCase("400",
                                 ErrorCase.setReason("Bad request.",
                                (reason, context) -> new SecurityResultException(reason, context)))
                        .localErrorCase("401",
                                 ErrorCase.setReason("Unauthorized request.",
                                (reason, context) -> new SecurityResultException(reason, context)))
                        .localErrorCase("403",
                                 ErrorCase.setReason("Request forbidden.",
                                (reason, context) -> new SecurityResultException(reason, context)))
                        .localErrorCase("404",
                                 ErrorCase.setReason("Not Found / Does not exist.",
                                (reason, context) -> new SecurityResultException(reason, context)))
                        .localErrorCase("406",
                                 ErrorCase.setReason("Format / Request Unacceptable.",
                                (reason, context) -> new SecurityResultException(reason, context)))
                        .localErrorCase("429",
                                 ErrorCase.setReason("Too many requests.",
                                (reason, context) -> new SecurityResultException(reason, context)))
                        .localErrorCase(ErrorCase.DEFAULT,
                                 ErrorCase.setReason("Error response.",
                                (reason, context) -> new SecurityResultException(reason, context)))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }
}