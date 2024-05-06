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
import com.verizon.m5gedge.exceptions.EdgeDiscoveryResultException;
import com.verizon.m5gedge.http.request.HttpMethod;
import com.verizon.m5gedge.http.response.ApiResponse;
import com.verizon.m5gedge.models.DeregisterServiceEndpointResult;
import com.verizon.m5gedge.models.ListAllServiceEndpointsResult;
import com.verizon.m5gedge.models.ListOptimalServiceEndpointsResult;
import com.verizon.m5gedge.models.RegisterServiceEndpointResult;
import com.verizon.m5gedge.models.ResourcesEdgeHostedServiceWithProfileId;
import com.verizon.m5gedge.models.UpdateServiceEndpointResult;
import com.verizon.m5gedge.models.UserEquipmentIdentityTypeEnum;
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
public final class ServiceEndpointsController extends BaseController {

    /**
     * Initializes the controller.
     * @param globalConfig    Configurations added in client.
     */
    public ServiceEndpointsController(GlobalConfiguration globalConfig) {
        super(globalConfig);
    }

    /**
     * Returns a list of optimal Service Endpoints that client devices can connect to. **Note:** If
     * a query is sent with all of the parameters, it will fail with a "400" error. You can search
     * based on the following parameter combinations - Region plus Service Endpoints IDs and
     * Subscriber density (density is optional but recommended), Region plus Service Endpoints IDs
     * and UEIdentity(Including UEIdentity Type) and Service Endpoints IDs plus UEIdentity(Including
     * UEIdentity Type).
     * @param  region  Optional parameter: MEC region name. Current valid values are US_WEST_2 and
     *         US_EAST_1.
     * @param  subscriberDensity  Optional parameter: Minimum number of 4G/5G subscribers per square
     *         kilometer.
     * @param  uEIdentityType  Optional parameter: Type of User Equipment identifier used in
     *         `UEIdentity`.
     * @param  uEIdentity  Optional parameter: The identifier value for User Equipment. The type of
     *         identifier is defined by the 'UEIdentityType' parameter. The`IPAddress`format can be
     *         IPv4 or IPv6.
     * @param  serviceEndpointsIds  Optional parameter: A system-defined string identifier
     *         representing one or more registered Service Endpoints.
     * @return    Returns the ListOptimalServiceEndpointsResult wrapped in ApiResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ApiResponse<ListOptimalServiceEndpointsResult> listOptimalServiceEndpoints(
            final String region,
            final Integer subscriberDensity,
            final UserEquipmentIdentityTypeEnum uEIdentityType,
            final String uEIdentity,
            final String serviceEndpointsIds) throws ApiException, IOException {
        return prepareListOptimalServiceEndpointsRequest(region, subscriberDensity, uEIdentityType,
                uEIdentity, serviceEndpointsIds).execute();
    }

    /**
     * Returns a list of optimal Service Endpoints that client devices can connect to. **Note:** If
     * a query is sent with all of the parameters, it will fail with a "400" error. You can search
     * based on the following parameter combinations - Region plus Service Endpoints IDs and
     * Subscriber density (density is optional but recommended), Region plus Service Endpoints IDs
     * and UEIdentity(Including UEIdentity Type) and Service Endpoints IDs plus UEIdentity(Including
     * UEIdentity Type).
     * @param  region  Optional parameter: MEC region name. Current valid values are US_WEST_2 and
     *         US_EAST_1.
     * @param  subscriberDensity  Optional parameter: Minimum number of 4G/5G subscribers per square
     *         kilometer.
     * @param  uEIdentityType  Optional parameter: Type of User Equipment identifier used in
     *         `UEIdentity`.
     * @param  uEIdentity  Optional parameter: The identifier value for User Equipment. The type of
     *         identifier is defined by the 'UEIdentityType' parameter. The`IPAddress`format can be
     *         IPv4 or IPv6.
     * @param  serviceEndpointsIds  Optional parameter: A system-defined string identifier
     *         representing one or more registered Service Endpoints.
     * @return    Returns the ListOptimalServiceEndpointsResult wrapped in ApiResponse response from the API call
     */
    public CompletableFuture<ApiResponse<ListOptimalServiceEndpointsResult>> listOptimalServiceEndpointsAsync(
            final String region,
            final Integer subscriberDensity,
            final UserEquipmentIdentityTypeEnum uEIdentityType,
            final String uEIdentity,
            final String serviceEndpointsIds) {
        try { 
            return prepareListOptimalServiceEndpointsRequest(region, subscriberDensity, uEIdentityType,
            uEIdentity, serviceEndpointsIds).executeAsync(); 
        } catch (Exception e) {  
            throw new CompletionException(e); 
        }
    }

    /**
     * Builds the ApiCall object for listOptimalServiceEndpoints.
     */
    private ApiCall<ApiResponse<ListOptimalServiceEndpointsResult>, ApiException> prepareListOptimalServiceEndpointsRequest(
            final String region,
            final Integer subscriberDensity,
            final UserEquipmentIdentityTypeEnum uEIdentityType,
            final String uEIdentity,
            final String serviceEndpointsIds) throws IOException {
        return new ApiCall.Builder<ApiResponse<ListOptimalServiceEndpointsResult>, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.EDGE_DISCOVERY.value())
                        .path("/serviceendpoints")
                        .queryParam(param -> param.key("region")
                                .value(region).isRequired(false))
                        .queryParam(param -> param.key("subscriberDensity")
                                .value(subscriberDensity).isRequired(false))
                        .queryParam(param -> param.key("UEIdentityType")
                                .value((uEIdentityType != null) ? uEIdentityType.value() : null).isRequired(false))
                        .queryParam(param -> param.key("UEIdentity")
                                .value(uEIdentity).isRequired(false))
                        .queryParam(param -> param.key("serviceEndpointsIds")
                                .value(serviceEndpointsIds).isRequired(false))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .withAuth(auth -> auth
                                .add("oAuth2"))
                        .httpMethod(HttpMethod.GET))
                .responseHandler(responseHandler -> responseHandler
                        .responseClassType(ResponseClassType.API_RESPONSE)
                        .apiResponseDeserializer(
                                response -> ApiHelper.deserialize(response, ListOptimalServiceEndpointsResult.class))
                        .nullify404(false)
                        .localErrorCase("400",
                                 ErrorCase.setReason("HTTP 400 Bad Request.",
                                (reason, context) -> new EdgeDiscoveryResultException(reason, context)))
                        .localErrorCase("401",
                                 ErrorCase.setReason("HTTP 401 Unauthorized.",
                                (reason, context) -> new EdgeDiscoveryResultException(reason, context)))
                        .localErrorCase(ErrorCase.DEFAULT,
                                 ErrorCase.setReason("HTTP 500 Internal Server Error.",
                                (reason, context) -> new EdgeDiscoveryResultException(reason, context)))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }

    /**
     * Update registered Service Endpoint information.
     * @param  serviceEndpointsId  Required parameter: A system-defined string identifier
     *         representing one or more registered Service Endpoints.
     * @param  body  Required parameter: Data needed for Service Endpoint information. The request
     *         body passes the rest of the needed parameters to create a service endpoint.
     *         Parameters other than `serviceEndpointsId` will be edited here rather than the
     *         **Parameters** section above. The `ern`,`applicationServerProviderId` and
     *         `applicationId` parameters are required. **Note:** Currently, the only valid value
     *         for `applicationServerProviderId`is **AWS**.
     * @return    Returns the UpdateServiceEndpointResult wrapped in ApiResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ApiResponse<UpdateServiceEndpointResult> updateServiceEndpoint(
            final String serviceEndpointsId,
            final List<ResourcesEdgeHostedServiceWithProfileId> body) throws ApiException, IOException {
        return prepareUpdateServiceEndpointRequest(serviceEndpointsId, body).execute();
    }

    /**
     * Update registered Service Endpoint information.
     * @param  serviceEndpointsId  Required parameter: A system-defined string identifier
     *         representing one or more registered Service Endpoints.
     * @param  body  Required parameter: Data needed for Service Endpoint information. The request
     *         body passes the rest of the needed parameters to create a service endpoint.
     *         Parameters other than `serviceEndpointsId` will be edited here rather than the
     *         **Parameters** section above. The `ern`,`applicationServerProviderId` and
     *         `applicationId` parameters are required. **Note:** Currently, the only valid value
     *         for `applicationServerProviderId`is **AWS**.
     * @return    Returns the UpdateServiceEndpointResult wrapped in ApiResponse response from the API call
     */
    public CompletableFuture<ApiResponse<UpdateServiceEndpointResult>> updateServiceEndpointAsync(
            final String serviceEndpointsId,
            final List<ResourcesEdgeHostedServiceWithProfileId> body) {
        try { 
            return prepareUpdateServiceEndpointRequest(serviceEndpointsId, body).executeAsync(); 
        } catch (Exception e) {  
            throw new CompletionException(e); 
        }
    }

    /**
     * Builds the ApiCall object for updateServiceEndpoint.
     */
    private ApiCall<ApiResponse<UpdateServiceEndpointResult>, ApiException> prepareUpdateServiceEndpointRequest(
            final String serviceEndpointsId,
            final List<ResourcesEdgeHostedServiceWithProfileId> body) throws JsonProcessingException, IOException {
        return new ApiCall.Builder<ApiResponse<UpdateServiceEndpointResult>, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.EDGE_DISCOVERY.value())
                        .path("/serviceendpoints/{serviceEndpointsId}")
                        .bodyParam(param -> param.value(body))
                        .bodySerializer(() ->  ApiHelper.serialize(body))
                        .templateParam(param -> param.key("serviceEndpointsId").value(serviceEndpointsId)
                                .shouldEncode(true))
                        .headerParam(param -> param.key("Content-Type")
                                .value("application/json").isRequired(false))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .withAuth(auth -> auth
                                .add("oAuth2"))
                        .httpMethod(HttpMethod.PUT))
                .responseHandler(responseHandler -> responseHandler
                        .responseClassType(ResponseClassType.API_RESPONSE)
                        .apiResponseDeserializer(
                                response -> ApiHelper.deserialize(response, UpdateServiceEndpointResult.class))
                        .nullify404(false)
                        .localErrorCase("400",
                                 ErrorCase.setReason("HTTP 400 Bad Request.",
                                (reason, context) -> new EdgeDiscoveryResultException(reason, context)))
                        .localErrorCase("401",
                                 ErrorCase.setReason("HTTP 401 Unauthorized.",
                                (reason, context) -> new EdgeDiscoveryResultException(reason, context)))
                        .localErrorCase(ErrorCase.DEFAULT,
                                 ErrorCase.setReason("HTTP 500 Internal Server Error.",
                                (reason, context) -> new EdgeDiscoveryResultException(reason, context)))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }

    /**
     * Returns endpoint information for all Service Endpoints registered to a specified
     * serviceEndpointId.
     * @param  serviceEndpointsId  Required parameter: A system-defined string identifier
     *         representing one or more registered Service Endpoints.
     * @return    Returns the List of ResourcesEdgeHostedServiceWithProfileId wrapped in ApiResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ApiResponse<List<ResourcesEdgeHostedServiceWithProfileId>> getServiceEndpoint(
            final String serviceEndpointsId) throws ApiException, IOException {
        return prepareGetServiceEndpointRequest(serviceEndpointsId).execute();
    }

    /**
     * Returns endpoint information for all Service Endpoints registered to a specified
     * serviceEndpointId.
     * @param  serviceEndpointsId  Required parameter: A system-defined string identifier
     *         representing one or more registered Service Endpoints.
     * @return    Returns the List of ResourcesEdgeHostedServiceWithProfileId wrapped in ApiResponse response from the API call
     */
    public CompletableFuture<ApiResponse<List<ResourcesEdgeHostedServiceWithProfileId>>> getServiceEndpointAsync(
            final String serviceEndpointsId) {
        try { 
            return prepareGetServiceEndpointRequest(serviceEndpointsId).executeAsync(); 
        } catch (Exception e) {  
            throw new CompletionException(e); 
        }
    }

    /**
     * Builds the ApiCall object for getServiceEndpoint.
     */
    private ApiCall<ApiResponse<List<ResourcesEdgeHostedServiceWithProfileId>>, ApiException> prepareGetServiceEndpointRequest(
            final String serviceEndpointsId) throws IOException {
        return new ApiCall.Builder<ApiResponse<List<ResourcesEdgeHostedServiceWithProfileId>>, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.EDGE_DISCOVERY.value())
                        .path("/serviceendpoints/{serviceEndpointsId}")
                        .templateParam(param -> param.key("serviceEndpointsId").value(serviceEndpointsId)
                                .shouldEncode(true))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .withAuth(auth -> auth
                                .add("oAuth2"))
                        .httpMethod(HttpMethod.GET))
                .responseHandler(responseHandler -> responseHandler
                        .responseClassType(ResponseClassType.API_RESPONSE)
                        .apiResponseDeserializer(
                                response -> ApiHelper.deserializeArray(response,
                                        ResourcesEdgeHostedServiceWithProfileId[].class))
                        .nullify404(false)
                        .localErrorCase("400",
                                 ErrorCase.setReason("HTTP 400 Bad Request.",
                                (reason, context) -> new EdgeDiscoveryResultException(reason, context)))
                        .localErrorCase("401",
                                 ErrorCase.setReason("HTTP 401 Unauthorized.",
                                (reason, context) -> new EdgeDiscoveryResultException(reason, context)))
                        .localErrorCase(ErrorCase.DEFAULT,
                                 ErrorCase.setReason("HTTP 500 Internal Server Error.",
                                (reason, context) -> new EdgeDiscoveryResultException(reason, context)))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }

    /**
     * Returns a list of all registered service endpoints.
     * @return    Returns the ListAllServiceEndpointsResult wrapped in ApiResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ApiResponse<ListAllServiceEndpointsResult> listAllServiceEndpoints() throws ApiException, IOException {
        return prepareListAllServiceEndpointsRequest().execute();
    }

    /**
     * Returns a list of all registered service endpoints.
     * @return    Returns the ListAllServiceEndpointsResult wrapped in ApiResponse response from the API call
     */
    public CompletableFuture<ApiResponse<ListAllServiceEndpointsResult>> listAllServiceEndpointsAsync() {
        try { 
            return prepareListAllServiceEndpointsRequest().executeAsync(); 
        } catch (Exception e) {  
            throw new CompletionException(e); 
        }
    }

    /**
     * Builds the ApiCall object for listAllServiceEndpoints.
     */
    private ApiCall<ApiResponse<ListAllServiceEndpointsResult>, ApiException> prepareListAllServiceEndpointsRequest() throws IOException {
        return new ApiCall.Builder<ApiResponse<ListAllServiceEndpointsResult>, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.EDGE_DISCOVERY.value())
                        .path("/serviceendpointsall")
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .withAuth(auth -> auth
                                .add("oAuth2"))
                        .httpMethod(HttpMethod.GET))
                .responseHandler(responseHandler -> responseHandler
                        .responseClassType(ResponseClassType.API_RESPONSE)
                        .apiResponseDeserializer(
                                response -> ApiHelper.deserialize(response, ListAllServiceEndpointsResult.class))
                        .nullify404(false)
                        .localErrorCase("400",
                                 ErrorCase.setReason("HTTP 400 Bad Request.",
                                (reason, context) -> new EdgeDiscoveryResultException(reason, context)))
                        .localErrorCase("401",
                                 ErrorCase.setReason("HTTP 401 Unauthorized.",
                                (reason, context) -> new EdgeDiscoveryResultException(reason, context)))
                        .localErrorCase(ErrorCase.DEFAULT,
                                 ErrorCase.setReason("HTTP 500 Internal Server Error.",
                                (reason, context) -> new EdgeDiscoveryResultException(reason, context)))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }

    /**
     * Register Service Endpoints of a deployed application to specified MEC Platforms.
     * @param  body  Required parameter: An array of Service Endpoint data for a deployed
     *         application. The request body passes all of the needed parameters to create a service
     *         endpoint. Parameters will be edited here rather than the **Parameters** section
     *         above. The `ern`,`applicationServerProviderId`, `applicationId` and
     *         `serviceProfileID` parameters are required. **Note:** Currently, the only valid value
     *         for `applicationServerProviderId`is **AWS**. Also, if you do not know one of the
     *         optional values (i.e. URI), you can erase the line from the query by back-spacing
     *         over it.
     * @return    Returns the RegisterServiceEndpointResult wrapped in ApiResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ApiResponse<RegisterServiceEndpointResult> registerServiceEndpoints(
            final List<ResourcesEdgeHostedServiceWithProfileId> body) throws ApiException, IOException {
        return prepareRegisterServiceEndpointsRequest(body).execute();
    }

    /**
     * Register Service Endpoints of a deployed application to specified MEC Platforms.
     * @param  body  Required parameter: An array of Service Endpoint data for a deployed
     *         application. The request body passes all of the needed parameters to create a service
     *         endpoint. Parameters will be edited here rather than the **Parameters** section
     *         above. The `ern`,`applicationServerProviderId`, `applicationId` and
     *         `serviceProfileID` parameters are required. **Note:** Currently, the only valid value
     *         for `applicationServerProviderId`is **AWS**. Also, if you do not know one of the
     *         optional values (i.e. URI), you can erase the line from the query by back-spacing
     *         over it.
     * @return    Returns the RegisterServiceEndpointResult wrapped in ApiResponse response from the API call
     */
    public CompletableFuture<ApiResponse<RegisterServiceEndpointResult>> registerServiceEndpointsAsync(
            final List<ResourcesEdgeHostedServiceWithProfileId> body) {
        try { 
            return prepareRegisterServiceEndpointsRequest(body).executeAsync(); 
        } catch (Exception e) {  
            throw new CompletionException(e); 
        }
    }

    /**
     * Builds the ApiCall object for registerServiceEndpoints.
     */
    private ApiCall<ApiResponse<RegisterServiceEndpointResult>, ApiException> prepareRegisterServiceEndpointsRequest(
            final List<ResourcesEdgeHostedServiceWithProfileId> body) throws JsonProcessingException, IOException {
        return new ApiCall.Builder<ApiResponse<RegisterServiceEndpointResult>, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.EDGE_DISCOVERY.value())
                        .path("/serviceendpoints")
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
                                response -> ApiHelper.deserialize(response, RegisterServiceEndpointResult.class))
                        .nullify404(false)
                        .localErrorCase("400",
                                 ErrorCase.setReason("HTTP 400 Bad Request.",
                                (reason, context) -> new EdgeDiscoveryResultException(reason, context)))
                        .localErrorCase("401",
                                 ErrorCase.setReason("HTTP 401 Unauthorized.",
                                (reason, context) -> new EdgeDiscoveryResultException(reason, context)))
                        .localErrorCase(ErrorCase.DEFAULT,
                                 ErrorCase.setReason("HTTP 500 Internal Server Error.",
                                (reason, context) -> new EdgeDiscoveryResultException(reason, context)))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }

    /**
     * Deregister an application's Service Endpoint from the MEC Platform(s).
     * @param  serviceEndpointsId  Required parameter: A system-defined string identifier
     *         representing one or more registered Service Endpoints.
     * @return    Returns the DeregisterServiceEndpointResult wrapped in ApiResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ApiResponse<DeregisterServiceEndpointResult> deregisterServiceEndpoint(
            final String serviceEndpointsId) throws ApiException, IOException {
        return prepareDeregisterServiceEndpointRequest(serviceEndpointsId).execute();
    }

    /**
     * Deregister an application's Service Endpoint from the MEC Platform(s).
     * @param  serviceEndpointsId  Required parameter: A system-defined string identifier
     *         representing one or more registered Service Endpoints.
     * @return    Returns the DeregisterServiceEndpointResult wrapped in ApiResponse response from the API call
     */
    public CompletableFuture<ApiResponse<DeregisterServiceEndpointResult>> deregisterServiceEndpointAsync(
            final String serviceEndpointsId) {
        try { 
            return prepareDeregisterServiceEndpointRequest(serviceEndpointsId).executeAsync(); 
        } catch (Exception e) {  
            throw new CompletionException(e); 
        }
    }

    /**
     * Builds the ApiCall object for deregisterServiceEndpoint.
     */
    private ApiCall<ApiResponse<DeregisterServiceEndpointResult>, ApiException> prepareDeregisterServiceEndpointRequest(
            final String serviceEndpointsId) throws IOException {
        return new ApiCall.Builder<ApiResponse<DeregisterServiceEndpointResult>, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.EDGE_DISCOVERY.value())
                        .path("/serviceendpoints/{serviceEndpointsId}")
                        .templateParam(param -> param.key("serviceEndpointsId").value(serviceEndpointsId)
                                .shouldEncode(true))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .withAuth(auth -> auth
                                .add("oAuth2"))
                        .httpMethod(HttpMethod.DELETE))
                .responseHandler(responseHandler -> responseHandler
                        .responseClassType(ResponseClassType.API_RESPONSE)
                        .apiResponseDeserializer(
                                response -> ApiHelper.deserialize(response, DeregisterServiceEndpointResult.class))
                        .nullify404(false)
                        .localErrorCase("400",
                                 ErrorCase.setReason("HTTP 400 Bad Request.",
                                (reason, context) -> new EdgeDiscoveryResultException(reason, context)))
                        .localErrorCase("401",
                                 ErrorCase.setReason("HTTP 401 Unauthorized.",
                                (reason, context) -> new EdgeDiscoveryResultException(reason, context)))
                        .localErrorCase(ErrorCase.DEFAULT,
                                 ErrorCase.setReason("HTTP 500 Internal Server Error.",
                                (reason, context) -> new EdgeDiscoveryResultException(reason, context)))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }
}