/*
 * VerizonLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.verizon.m5gedge.authentication;

import com.verizon.m5gedge.controllers.OauthAuthorizationController;
import com.verizon.m5gedge.exceptions.ApiException;
import com.verizon.m5gedge.models.OauthScopeThingspaceOauthEnum;
import com.verizon.m5gedge.models.OauthToken;
import io.apimatic.core.GlobalConfiguration;
import io.apimatic.core.authentication.HeaderAuth;
import io.apimatic.coreinterfaces.http.request.Request;
import java.io.IOException;
import java.util.Base64;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;

/**
 * Utility class for OAuth 2 authorization and token management.
 */
public class ThingspaceOauthManager extends HeaderAuth implements ThingspaceOauthCredentials {

    /**
     * Private instance of OAuth 2 API controller.
     */
    private OauthAuthorizationController oAuthApi;

    /**
     * Private instance of the auth model containing the auth credentials.
     */
    private ThingspaceOauthModel authModel;

    /**
     * Private instance of the latest auth token.
     */
    private OauthToken oauthToken;
    
    /**
     * Instance to use as mutex lock for auth token.
     */
    private static final Object lockObj = new Object();

    /**
     * Constructor.
     */
    public ThingspaceOauthManager(ThingspaceOauthModel authModel) {
        super(Collections.emptyMap());
        this.authModel = authModel;
        this.oauthToken = authModel.getOauthToken();
    }

    /**
    * Apply GlobalConfiguration for token management.
    * @param config GlobalConfiguration instance
    */
    public void applyGlobalConfiguration(GlobalConfiguration config) {
        this.oAuthApi = new OauthAuthorizationController(config);
    }


    /**
     * String value for oauthClientId.
     * @return oauthClientId
     */
    public String getOauthClientId() {
        return authModel.getOauthClientId();
    }

    /**
     * String value for oauthClientSecret.
     * @return oauthClientSecret
     */
    public String getOauthClientSecret() {
        return authModel.getOauthClientSecret();
    }

    /**
     * OauthToken value for oauthToken.
     * @return oauthToken
     */
    public OauthToken getOauthToken() {
        return authModel.getOauthToken();
    }

    /**
     * List of OauthScopeThingspaceOauthEnum value for oauthScopes.
     * @return oauthScopes
     */
    public List<OauthScopeThingspaceOauthEnum> getOauthScopes() {
        return authModel.getOauthScopes();
    }

    /**
     * Checks if provided credentials matched with existing ones.
     * @param oauthClientId String value for credentials.
     * @param oauthClientSecret String value for credentials.
     * @param oauthToken OauthToken value for credentials.
     * @param oauthScopes List of OauthScopeThingspaceOauthEnum value for credentials.
     * @return true if credentials matched.
     */
    public boolean equals(String oauthClientId, String oauthClientSecret, OauthToken oauthToken,
            List<OauthScopeThingspaceOauthEnum> oauthScopes) {
        return oauthClientId.equals(getOauthClientId())
                && oauthClientSecret.equals(getOauthClientSecret())
                && ((getOauthToken() == null && oauthToken == null)
                        || (getOauthToken() != null && oauthToken != null
                                && oauthToken.toString().equals(getOauthToken().toString())))
                && ((getOauthScopes() == null && oauthScopes == null)
                        || (getOauthScopes() != null && oauthScopes != null
                                && oauthScopes.equals(getOauthScopes())));
    }

    /**
     * Converts this ThingspaceOauthManager into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "ThingspaceOauthManager [" + "oauthClientId=" + getOauthClientId()
                + ", oauthClientSecret=" + getOauthClientSecret() + ", oauthToken="
                + getOauthToken() + ", oauthScopes=" + getOauthScopes() + "]";
    }

    /**
     * Fetch the OAuth token asynchronously.
     * @param additionalParameters Additional parameters to send during authorization.
     */
    public CompletableFuture<OauthToken> fetchTokenAsync(
            final Map<String, Object> additionalParameters) {
        final Map<String, Object> aparams =
                additionalParameters == null ? new HashMap<String, Object>()
                : additionalParameters;

        return oAuthApi.requestTokenThingspaceOauthAsync(
            getBasicAuthForClient(),
            stringJoin(getOauthScopes(), " "),
            aparams).thenApply(token -> {
                return token.getResult();
            });
    }

    /**
     * Fetch the OAuth token asynchronously.
     */
    public CompletableFuture<OauthToken> fetchTokenAsync() {
        return fetchTokenAsync(null);
    }

    /**
     * Fetch the OAuth token.
     * @param additionalParameters Additional parameters to send during authorization.
     */
    public OauthToken fetchToken(Map<String, Object> additionalParameters)
            throws ApiException, IOException {
        final Map<String, Object> aparams =
                additionalParameters == null ? new HashMap<String, Object>()
                : additionalParameters;

        OauthToken token = oAuthApi.requestTokenThingspaceOauth(
            getBasicAuthForClient(),
            stringJoin(getOauthScopes(), " "),
            aparams).getResult();

        if (token.getExpiresIn() != null && token.getExpiresIn() != 0) {
            token.setExpiry((System.currentTimeMillis() / 1000L) + token.getExpiresIn());
        }

        return token;
    }

    /**
     * Fetch the OAuth token.
     */
    public OauthToken fetchToken() throws ApiException, IOException {
        return fetchToken(null);
    }

    /**
     * Build authorization header value for basic auth.
     * @return Authorization header value for this client.
     */
    private String getBasicAuthForClient() {
        String val = getOauthClientId() + ":" + getOauthClientSecret();
        return "Basic " + new String(Base64.getEncoder().encodeToString(val.getBytes()));
    }

    /**
     * Join string collection elements using delimiter.
     * @param col String collection to join.
     * @param delim Delimiter.
     * @return String joined by delimiter.
     */
    private String stringJoin(Collection<?> col, String delim) {
        if (col == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        Iterator<?> iter = col.iterator();
        if (iter.hasNext()) {
            sb.append(iter.next().toString());
        }
        while (iter.hasNext()) {
            sb.append(delim);
            sb.append(iter.next().toString());
        }
        return sb.toString();
    }

    /**
     * Has the OAuth token expired?.
     * @return True if expired
     */
    public boolean isTokenExpired() {
            return isTokenExpired(getOauthToken());
    }

    /**
     * A utility to check the expiry of the OAuth Token.
     * @param oauthToken The OAuth token for whose expiry is to check.
     * @return True if expired
     */
    public boolean isTokenExpired(OauthToken oauthToken) {
        if (oauthToken == null) {
            throw new IllegalStateException("OAuth token is missing.");
        }

        return oauthToken.getExpiry() != null 
            && oauthToken.getExpiry() - authModel.getOauthClockSkew()
                < (System.currentTimeMillis() / 1000L);
    }

    /**
     * This provides the OAuth Token from either the user configured callbacks or from default provider.
     * @return The fetched OAuth token.
     */
    private OauthToken getTokenFromProvider() {
        if(oauthToken != null && !isTokenExpired(oauthToken)) {
            return this.oauthToken;
        }

        if (authModel.getOauthTokenProvider() != null) {
            OauthToken token = authModel.getOauthTokenProvider().apply(this.oauthToken, this);
            applyOnTokenUpdateCallback(token);
            return token;
        }

        try {
            OauthToken token = fetchToken();
            applyOnTokenUpdateCallback(token);
            return token;
        } catch (ApiException | IOException e) {
            return this.oauthToken;
        }
    }

    /**
     * This applies the OAuth token update callback provided by the user.
     */
    private void applyOnTokenUpdateCallback(OauthToken token) {
        if (authModel.getOauthOnTokenUpdate() != null) {
            authModel.getOauthOnTokenUpdate().accept(token.toBuilder().build());
        }
    }

    /**
    * Create authorization header for API calls.
    * @param token OAuth token
    * @return Authorization header
    */
    private static String getAuthorizationHeader(OauthToken token) {
        if (token == null) {
            return null;
        }
        return "Bearer " + token.getAccessToken();
    }

    /**
    * Validate the authentication on the httpRequest
    */
    @Override
    public void validate() {
        synchronized (lockObj) {
            oauthToken = getTokenFromProvider();
            if (oauthToken == null) {
                setErrorMessage("Client is not authorized."
                    + " An OAuth token is needed to make API calls.");
                setValidity(false);
            } else if (isTokenExpired(oauthToken)) {
                setErrorMessage("The oAuth token is expired."
                    + " A valid token is needed to make API calls.");
                setValidity(false);
            } else {
                setValidity(true);
            }
        }
    }

    /**
    * Apply the Header authentication.
    * @param httpRequest The HTTP request on which the auth is to be applied.
    * @return {@link Request} The HTTP request after applying auth.
    */
    @Override
    public Request apply(Request httpRequest) {
        httpRequest.getHeaders().remove("Authorization");
        httpRequest.getHeaders().add("Authorization", getAuthorizationHeader(oauthToken));
        return httpRequest;
    }

    /**
    * Returns the error message if the auth credentials are not valid.
    * @return the auth specific error message.
    */
    @Override
    public String getErrorMessage() {
        String errorMessage = super.getErrorMessage();
        if (errorMessage == null) {
            return null;
        }

        return "ThingspaceOauth - " + errorMessage;
     }

}