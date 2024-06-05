/*
 * VerizonLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.verizon.m5gedge.controllers;

import com.verizon.m5gedge.ApiHelper;
import com.verizon.m5gedge.Server;
import com.verizon.m5gedge.exceptions.ApiException;
import com.verizon.m5gedge.exceptions.FotaV2ResultException;
import com.verizon.m5gedge.http.request.HttpMethod;
import com.verizon.m5gedge.http.response.ApiResponse;
import com.verizon.m5gedge.models.RetrievesAvailableFilesResponseList;
import com.verizon.m5gedge.models.UploadConfigurationFilesResponse;
import com.verizon.m5gedge.utilities.FileWrapper;
import io.apimatic.core.ApiCall;
import io.apimatic.core.ErrorCase;
import io.apimatic.core.GlobalConfiguration;
import io.apimatic.coreinterfaces.http.request.MutliPartRequestType;
import io.apimatic.coreinterfaces.http.request.ResponseClassType;
import java.io.IOException;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionException;

/**
 * This class lists all the endpoints of the groups.
 */
public final class ConfigurationFilesController extends BaseController {

    /**
     * Initializes the controller.
     * @param globalConfig    Configurations added in client.
     */
    public ConfigurationFilesController(GlobalConfiguration globalConfig) {
        super(globalConfig);
    }

    /**
     * You can retrieve a list of configuration or supplementary of files for an account.
     * @param  acc  Required parameter: Account identifier.
     * @param  distributionType  Required parameter: Filter the distributionType to only retrieve
     *         files for a specific distribution type.
     * @return    Returns the RetrievesAvailableFilesResponseList wrapped in ApiResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ApiResponse<RetrievesAvailableFilesResponseList> getListOfFiles(
            final String acc,
            final String distributionType) throws ApiException, IOException {
        return prepareGetListOfFilesRequest(acc, distributionType).execute();
    }

    /**
     * You can retrieve a list of configuration or supplementary of files for an account.
     * @param  acc  Required parameter: Account identifier.
     * @param  distributionType  Required parameter: Filter the distributionType to only retrieve
     *         files for a specific distribution type.
     * @return    Returns the RetrievesAvailableFilesResponseList wrapped in ApiResponse response from the API call
     */
    public CompletableFuture<ApiResponse<RetrievesAvailableFilesResponseList>> getListOfFilesAsync(
            final String acc,
            final String distributionType) {
        try { 
            return prepareGetListOfFilesRequest(acc, distributionType).executeAsync(); 
        } catch (Exception e) {  
            throw new CompletionException(e); 
        }
    }

    /**
     * Builds the ApiCall object for getListOfFiles.
     */
    private ApiCall<ApiResponse<RetrievesAvailableFilesResponseList>, ApiException> prepareGetListOfFilesRequest(
            final String acc,
            final String distributionType) throws IOException {
        return new ApiCall.Builder<ApiResponse<RetrievesAvailableFilesResponseList>, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.SOFTWARE_MANAGEMENT_V2.value())
                        .path("/files/{acc}")
                        .queryParam(param -> param.key("distributionType")
                                .value(distributionType))
                        .templateParam(param -> param.key("acc").value(acc)
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
                                response -> ApiHelper.deserialize(response, RetrievesAvailableFilesResponseList.class))
                        .nullify404(false)
                        .localErrorCase("400",
                                 ErrorCase.setReason("Unexpected error.",
                                (reason, context) -> new FotaV2ResultException(reason, context)))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }

    /**
     * Uploads a configuration/supplementary file for an account. ThingSpace generates a fileName
     * after the upload and is returned in the response.
     * @param  acc  Required parameter: Account identifier.
     * @param  fileupload  Optional parameter: The file to upload.
     * @param  fileVersion  Optional parameter: Version of the file.
     * @param  make  Optional parameter: The software-applicable device make.
     * @param  model  Optional parameter: The software-applicable device model.
     * @param  localTargetPath  Optional parameter: Local target path on the device.
     * @return    Returns the UploadConfigurationFilesResponse wrapped in ApiResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ApiResponse<UploadConfigurationFilesResponse> uploadConfigFile(
            final String acc,
            final FileWrapper fileupload,
            final String fileVersion,
            final String make,
            final String model,
            final String localTargetPath) throws ApiException, IOException {
        return prepareUploadConfigFileRequest(acc, fileupload, fileVersion, make, model,
                localTargetPath).execute();
    }

    /**
     * Uploads a configuration/supplementary file for an account. ThingSpace generates a fileName
     * after the upload and is returned in the response.
     * @param  acc  Required parameter: Account identifier.
     * @param  fileupload  Optional parameter: The file to upload.
     * @param  fileVersion  Optional parameter: Version of the file.
     * @param  make  Optional parameter: The software-applicable device make.
     * @param  model  Optional parameter: The software-applicable device model.
     * @param  localTargetPath  Optional parameter: Local target path on the device.
     * @return    Returns the UploadConfigurationFilesResponse wrapped in ApiResponse response from the API call
     */
    public CompletableFuture<ApiResponse<UploadConfigurationFilesResponse>> uploadConfigFileAsync(
            final String acc,
            final FileWrapper fileupload,
            final String fileVersion,
            final String make,
            final String model,
            final String localTargetPath) {
        try { 
            return prepareUploadConfigFileRequest(acc, fileupload, fileVersion, make, model,
            localTargetPath).executeAsync(); 
        } catch (Exception e) {  
            throw new CompletionException(e); 
        }
    }

    /**
     * Builds the ApiCall object for uploadConfigFile.
     */
    private ApiCall<ApiResponse<UploadConfigurationFilesResponse>, ApiException> prepareUploadConfigFileRequest(
            final String acc,
            final FileWrapper fileupload,
            final String fileVersion,
            final String make,
            final String model,
            final String localTargetPath) throws IOException {
        return new ApiCall.Builder<ApiResponse<UploadConfigurationFilesResponse>, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.SOFTWARE_MANAGEMENT_V2.value())
                        .path("/files/{acc}")
                        .formParam(param -> param.key("fileupload")
                                .value(fileupload)
                                .multiPartRequestType(MutliPartRequestType.MULTI_PART_FILE)
                                .multipartHeaders("content-type", "application/octect-stream"))
                        .formParam(param -> param.key("fileVersion")
                                .value(fileVersion).isRequired(false))
                        .formParam(param -> param.key("make")
                                .value(make).isRequired(false))
                        .formParam(param -> param.key("model")
                                .value(model).isRequired(false))
                        .formParam(param -> param.key("localTargetPath")
                                .value(localTargetPath).isRequired(false))
                        .templateParam(param -> param.key("acc").value(acc)
                                .shouldEncode(true))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .withAuth(auth -> auth
                                .and(andAuth -> andAuth
                                        .add("thingspace_oauth")
                                        .add("VZ-M2M-Token")))
                        .httpMethod(HttpMethod.POST))
                .responseHandler(responseHandler -> responseHandler
                        .responseClassType(ResponseClassType.API_RESPONSE)
                        .apiResponseDeserializer(
                                response -> ApiHelper.deserialize(response, UploadConfigurationFilesResponse.class))
                        .nullify404(false)
                        .localErrorCase("400",
                                 ErrorCase.setReason("Unexpected error.",
                                (reason, context) -> new FotaV2ResultException(reason, context)))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }
}