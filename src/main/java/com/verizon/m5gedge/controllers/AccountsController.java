/*
 * VerizonLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.verizon.m5gedge.controllers;

import com.verizon.m5gedge.ApiHelper;
import com.verizon.m5gedge.Server;
import com.verizon.m5gedge.exceptions.ApiException;
import com.verizon.m5gedge.exceptions.ConnectivityManagementResultException;
import com.verizon.m5gedge.http.request.HttpMethod;
import com.verizon.m5gedge.http.response.ApiResponse;
import com.verizon.m5gedge.models.Account;
import com.verizon.m5gedge.models.AccountLeadsResult;
import com.verizon.m5gedge.models.AccountStatesAndServices;
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
public final class AccountsController extends BaseController {

    /**
     * Initializes the controller.
     * @param globalConfig    Configurations added in client.
     */
    public AccountsController(GlobalConfiguration globalConfig) {
        super(globalConfig);
    }

    /**
     * Returns information about a specified account.
     * @param  aname  Required parameter: Account name.
     * @return    Returns the Account wrapped in ApiResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ApiResponse<Account> getAccountInformation(
            final String aname) throws ApiException, IOException {
        return prepareGetAccountInformationRequest(aname).execute();
    }

    /**
     * Returns information about a specified account.
     * @param  aname  Required parameter: Account name.
     * @return    Returns the Account wrapped in ApiResponse response from the API call
     */
    public CompletableFuture<ApiResponse<Account>> getAccountInformationAsync(
            final String aname) {
        try { 
            return prepareGetAccountInformationRequest(aname).executeAsync(); 
        } catch (Exception e) {  
            throw new CompletionException(e); 
        }
    }

    /**
     * Builds the ApiCall object for getAccountInformation.
     */
    private ApiCall<ApiResponse<Account>, ApiException> prepareGetAccountInformationRequest(
            final String aname) throws IOException {
        return new ApiCall.Builder<ApiResponse<Account>, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.THINGSPACE.value())
                        .path("/m2m/v1/accounts/{aname}")
                        .templateParam(param -> param.key("aname").value(aname)
                                .shouldEncode(true))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .withAuth(auth -> auth
                                .add("oAuth2"))
                        .httpMethod(HttpMethod.GET))
                .responseHandler(responseHandler -> responseHandler
                        .responseClassType(ResponseClassType.API_RESPONSE)
                        .apiResponseDeserializer(
                                response -> ApiHelper.deserialize(response, Account.class))
                        .nullify404(false)
                        .localErrorCase("400",
                                 ErrorCase.setReason("Error response.",
                                (reason, context) -> new ConnectivityManagementResultException(reason, context)))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }

    /**
     * Returns a list and details of all custom services and states defined for a specified account.
     * @param  aname  Required parameter: Account name.
     * @return    Returns the AccountStatesAndServices wrapped in ApiResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ApiResponse<AccountStatesAndServices> listAccountStatesAndServices(
            final String aname) throws ApiException, IOException {
        return prepareListAccountStatesAndServicesRequest(aname).execute();
    }

    /**
     * Returns a list and details of all custom services and states defined for a specified account.
     * @param  aname  Required parameter: Account name.
     * @return    Returns the AccountStatesAndServices wrapped in ApiResponse response from the API call
     */
    public CompletableFuture<ApiResponse<AccountStatesAndServices>> listAccountStatesAndServicesAsync(
            final String aname) {
        try { 
            return prepareListAccountStatesAndServicesRequest(aname).executeAsync(); 
        } catch (Exception e) {  
            throw new CompletionException(e); 
        }
    }

    /**
     * Builds the ApiCall object for listAccountStatesAndServices.
     */
    private ApiCall<ApiResponse<AccountStatesAndServices>, ApiException> prepareListAccountStatesAndServicesRequest(
            final String aname) throws IOException {
        return new ApiCall.Builder<ApiResponse<AccountStatesAndServices>, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.THINGSPACE.value())
                        .path("/m2m/v1/accounts/{aname}/statesandservices")
                        .templateParam(param -> param.key("aname").value(aname)
                                .shouldEncode(true))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .withAuth(auth -> auth
                                .add("oAuth2"))
                        .httpMethod(HttpMethod.GET))
                .responseHandler(responseHandler -> responseHandler
                        .responseClassType(ResponseClassType.API_RESPONSE)
                        .apiResponseDeserializer(
                                response -> ApiHelper.deserialize(response, AccountStatesAndServices.class))
                        .nullify404(false)
                        .localErrorCase("400",
                                 ErrorCase.setReason("Error response.",
                                (reason, context) -> new ConnectivityManagementResultException(reason, context)))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }

    /**
     * When HTTP status is 202, a URL will be returned in the Location header of the form
     * /leads/{aname}?next={token}. This URL can be used to request the next set of leads.
     * @param  aname  Required parameter: Account name.
     * @param  next  Optional parameter: Continue the previous query from the pageUrl in Location
     *         Header.
     * @return    Returns the AccountLeadsResult wrapped in ApiResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ApiResponse<AccountLeadsResult> listAccountLeads(
            final String aname,
            final Long next) throws ApiException, IOException {
        return prepareListAccountLeadsRequest(aname, next).execute();
    }

    /**
     * When HTTP status is 202, a URL will be returned in the Location header of the form
     * /leads/{aname}?next={token}. This URL can be used to request the next set of leads.
     * @param  aname  Required parameter: Account name.
     * @param  next  Optional parameter: Continue the previous query from the pageUrl in Location
     *         Header.
     * @return    Returns the AccountLeadsResult wrapped in ApiResponse response from the API call
     */
    public CompletableFuture<ApiResponse<AccountLeadsResult>> listAccountLeadsAsync(
            final String aname,
            final Long next) {
        try { 
            return prepareListAccountLeadsRequest(aname, next).executeAsync(); 
        } catch (Exception e) {  
            throw new CompletionException(e); 
        }
    }

    /**
     * Builds the ApiCall object for listAccountLeads.
     */
    private ApiCall<ApiResponse<AccountLeadsResult>, ApiException> prepareListAccountLeadsRequest(
            final String aname,
            final Long next) throws IOException {
        return new ApiCall.Builder<ApiResponse<AccountLeadsResult>, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.THINGSPACE.value())
                        .path("/m2m/v1/leads/{aname}")
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
                                response -> ApiHelper.deserialize(response, AccountLeadsResult.class))
                        .nullify404(false)
                        .localErrorCase("400",
                                 ErrorCase.setReason("Error response.",
                                (reason, context) -> new ConnectivityManagementResultException(reason, context)))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }
}