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
import com.verizon.m5gedge.exceptions.IntelligenceResultException;
import com.verizon.m5gedge.http.request.HttpMethod;
import com.verizon.m5gedge.http.response.ApiResponse;
import com.verizon.m5gedge.models.AnomalyDetectionRequest;
import com.verizon.m5gedge.models.AnomalyDetectionSettings;
import com.verizon.m5gedge.models.IntelligenceSuccessResult;
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
public final class AnomalySettingsController extends BaseController {

    /**
     * Initializes the controller.
     * @param globalConfig    Configurations added in client.
     */
    public AnomalySettingsController(GlobalConfiguration globalConfig) {
        super(globalConfig);
    }

    /**
     * Uses the subscribed account ID to activate anomaly detection and set threshold values.
     * @param  body  Required parameter: Request to activate anomaly detection.
     * @return    Returns the IntelligenceSuccessResult wrapped in ApiResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ApiResponse<IntelligenceSuccessResult> activateAnomalyDetection(
            final AnomalyDetectionRequest body) throws ApiException, IOException {
        return prepareActivateAnomalyDetectionRequest(body).execute();
    }

    /**
     * Uses the subscribed account ID to activate anomaly detection and set threshold values.
     * @param  body  Required parameter: Request to activate anomaly detection.
     * @return    Returns the IntelligenceSuccessResult wrapped in ApiResponse response from the API call
     */
    public CompletableFuture<ApiResponse<IntelligenceSuccessResult>> activateAnomalyDetectionAsync(
            final AnomalyDetectionRequest body) {
        try { 
            return prepareActivateAnomalyDetectionRequest(body).executeAsync(); 
        } catch (Exception e) {  
            throw new CompletionException(e); 
        }
    }

    /**
     * Builds the ApiCall object for activateAnomalyDetection.
     */
    private ApiCall<ApiResponse<IntelligenceSuccessResult>, ApiException> prepareActivateAnomalyDetectionRequest(
            final AnomalyDetectionRequest body) throws JsonProcessingException, IOException {
        return new ApiCall.Builder<ApiResponse<IntelligenceSuccessResult>, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.THINGSPACE.value())
                        .path("/m2m/v1/intelligence/anomaly/settings")
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
                                response -> ApiHelper.deserialize(response, IntelligenceSuccessResult.class))
                        .nullify404(false)
                        .localErrorCase(ErrorCase.DEFAULT,
                                 ErrorCase.setReason("An error occurred.",
                                (reason, context) -> new IntelligenceResultException(reason, context)))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }

    /**
     * Retrieves the current anomaly detection settings for an account.
     * @param  accountName  Required parameter: The name of the subscribed account.
     * @return    Returns the AnomalyDetectionSettings wrapped in ApiResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ApiResponse<AnomalyDetectionSettings> listAnomalyDetectionSettings(
            final String accountName) throws ApiException, IOException {
        return prepareListAnomalyDetectionSettingsRequest(accountName).execute();
    }

    /**
     * Retrieves the current anomaly detection settings for an account.
     * @param  accountName  Required parameter: The name of the subscribed account.
     * @return    Returns the AnomalyDetectionSettings wrapped in ApiResponse response from the API call
     */
    public CompletableFuture<ApiResponse<AnomalyDetectionSettings>> listAnomalyDetectionSettingsAsync(
            final String accountName) {
        try { 
            return prepareListAnomalyDetectionSettingsRequest(accountName).executeAsync(); 
        } catch (Exception e) {  
            throw new CompletionException(e); 
        }
    }

    /**
     * Builds the ApiCall object for listAnomalyDetectionSettings.
     */
    private ApiCall<ApiResponse<AnomalyDetectionSettings>, ApiException> prepareListAnomalyDetectionSettingsRequest(
            final String accountName) throws IOException {
        return new ApiCall.Builder<ApiResponse<AnomalyDetectionSettings>, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.THINGSPACE.value())
                        .path("/m2m/v1/intelligence/{accountName}/anomaly/settings")
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
                                response -> ApiHelper.deserialize(response, AnomalyDetectionSettings.class))
                        .nullify404(false)
                        .localErrorCase(ErrorCase.DEFAULT,
                                 ErrorCase.setReason("An error occurred.",
                                (reason, context) -> new IntelligenceResultException(reason, context)))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }

    /**
     * Resets the thresholds to zero.
     * @param  accountName  Required parameter: The name of the subscribed account.
     * @return    Returns the IntelligenceSuccessResult wrapped in ApiResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ApiResponse<IntelligenceSuccessResult> resetAnomalyDetectionParameters(
            final String accountName) throws ApiException, IOException {
        return prepareResetAnomalyDetectionParametersRequest(accountName).execute();
    }

    /**
     * Resets the thresholds to zero.
     * @param  accountName  Required parameter: The name of the subscribed account.
     * @return    Returns the IntelligenceSuccessResult wrapped in ApiResponse response from the API call
     */
    public CompletableFuture<ApiResponse<IntelligenceSuccessResult>> resetAnomalyDetectionParametersAsync(
            final String accountName) {
        try { 
            return prepareResetAnomalyDetectionParametersRequest(accountName).executeAsync(); 
        } catch (Exception e) {  
            throw new CompletionException(e); 
        }
    }

    /**
     * Builds the ApiCall object for resetAnomalyDetectionParameters.
     */
    private ApiCall<ApiResponse<IntelligenceSuccessResult>, ApiException> prepareResetAnomalyDetectionParametersRequest(
            final String accountName) throws IOException {
        return new ApiCall.Builder<ApiResponse<IntelligenceSuccessResult>, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.THINGSPACE.value())
                        .path("/m2m/v1/intelligence/{accountName}/anomaly/settings/reset")
                        .templateParam(param -> param.key("accountName").value(accountName)
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
                                response -> ApiHelper.deserialize(response, IntelligenceSuccessResult.class))
                        .nullify404(false)
                        .localErrorCase(ErrorCase.DEFAULT,
                                 ErrorCase.setReason("An error occurred.",
                                (reason, context) -> new IntelligenceResultException(reason, context)))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }
}