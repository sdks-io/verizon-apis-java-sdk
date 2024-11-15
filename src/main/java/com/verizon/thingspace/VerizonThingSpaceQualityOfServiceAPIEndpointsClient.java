/*
 * VerizonThingSpaceQualityOfServiceAPIEndpointsLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.verizon.thingspace;

import com.verizon.thingspace.authentication.ThingspaceOauthCredentials;
import com.verizon.thingspace.authentication.ThingspaceOauthManager;
import com.verizon.thingspace.authentication.ThingspaceOauthModel;
import com.verizon.thingspace.authentication.VzM2mSessionTokenCredentials;
import com.verizon.thingspace.authentication.VzM2mSessionTokenManager;
import com.verizon.thingspace.authentication.VzM2mSessionTokenModel;
import com.verizon.thingspace.controllers.ExclusionsController;
import com.verizon.thingspace.controllers.OAuthAuthorizationController;
import com.verizon.thingspace.controllers.ThingSpaceQualityofServiceAPIActionsController;
import com.verizon.thingspace.http.client.HttpCallback;
import com.verizon.thingspace.http.client.HttpClientConfiguration;
import com.verizon.thingspace.http.client.ReadonlyHttpClientConfiguration;
import io.apimatic.core.GlobalConfiguration;
import io.apimatic.coreinterfaces.authentication.Authentication;
import io.apimatic.coreinterfaces.compatibility.CompatibilityFactory;
import io.apimatic.coreinterfaces.http.HttpClient;
import io.apimatic.okhttpclient.adapter.OkClient;
import java.util.AbstractMap.SimpleEntry;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Supplier;

/**
 * Gateway class for the library.
 * This class acts as a factory for Controllers.
 * It holds the state of the SDK.
 */
public final class VerizonThingSpaceQualityOfServiceAPIEndpointsClient implements Configuration {

    /**
     * Private store for controllers.
     */
    private ThingSpaceQualityofServiceAPIActionsController thingSpaceQualityofServiceAPIActions;
    private ExclusionsController exclusions;
    private OAuthAuthorizationController oAuthAuthorization;

    private static final CompatibilityFactory compatibilityFactory = new CompatibilityFactoryImpl();

    private static String userAgent = "APIMATIC 3.0";

    /**
     * Current API environment.
     */
    private final Environment environment;

    /**
     * The VZ-M2M session token from [Getting Started](/content/thingspace-portal/documentation/apis/connectivity-management/get-started.html).
     */
    private final String vZM2MToken2;

    /**
     * The HTTP Client instance to use for making HTTP requests.
     */
    private final HttpClient httpClient;

    /**
     * Http Client Configuration instance.
     */
    private final ReadonlyHttpClientConfiguration httpClientConfig;

    /**
     * ThingspaceOauthManager.
     */
    private ThingspaceOauthManager thingspaceOauthManager;

    /**
     * The instance of ThingspaceOauthModel.
     */
    private ThingspaceOauthModel thingspaceOauthModel;

    /**
     * VzM2mSessionTokenManager.
     */
    private VzM2mSessionTokenManager vzM2mSessionTokenManager;

    /**
     * The instance of VzM2mSessionTokenModel.
     */
    private VzM2mSessionTokenModel vzM2mSessionTokenModel;

    /**
     * Map of authentication Managers.
     */
    private Map<String, Authentication> authentications = new HashMap<String, Authentication>();

    /**
     * Callback to be called before and after the HTTP call for an endpoint is made.
     */
    private final HttpCallback httpCallback;

    private VerizonThingSpaceQualityOfServiceAPIEndpointsClient(Environment environment,
            String vZM2MToken2, HttpClient httpClient,
            ReadonlyHttpClientConfiguration httpClientConfig,
            ThingspaceOauthModel thingspaceOauthModel,
            VzM2mSessionTokenModel vzM2mSessionTokenModel, HttpCallback httpCallback) {
        this.environment = environment;
        this.vZM2MToken2 = vZM2MToken2;
        this.httpClient = httpClient;
        this.httpClientConfig = httpClientConfig;
        this.httpCallback = httpCallback;

        this.thingspaceOauthModel = thingspaceOauthModel;
        this.vzM2mSessionTokenModel = vzM2mSessionTokenModel;

        this.thingspaceOauthManager = new ThingspaceOauthManager(thingspaceOauthModel);
        this.authentications.put("thingspace_oauth", thingspaceOauthManager);

        this.vzM2mSessionTokenManager = new VzM2mSessionTokenManager(vzM2mSessionTokenModel);
        this.authentications.put("vz-m2m-session_token", vzM2mSessionTokenManager);

        GlobalConfiguration globalConfig = new GlobalConfiguration.Builder()
                .httpClient(httpClient).baseUri(server -> getBaseUri(server))
                .compatibilityFactory(compatibilityFactory)
                .authentication(this.authentications)
                .callback(httpCallback)
                .userAgent(userAgent)
                .globalHeader("VZ-M2M-Token", vZM2MToken2)
                .build();
        this.thingspaceOauthManager.applyGlobalConfiguration(globalConfig);

        thingSpaceQualityofServiceAPIActions = new ThingSpaceQualityofServiceAPIActionsController(
                globalConfig);
        exclusions = new ExclusionsController(globalConfig);
        oAuthAuthorization = new OAuthAuthorizationController(globalConfig);
    }

    /**
     * Shutdown the underlying HttpClient instance.
     */
    public static void shutdown() {
        OkClient.shutdown();
    }

    /**
     * Get the instance of ThingSpaceQualityofServiceAPIActionsController.
     * @return thingSpaceQualityofServiceAPIActions
     */
    public ThingSpaceQualityofServiceAPIActionsController getThingSpaceQualityofServiceAPIActionsController() {
        return thingSpaceQualityofServiceAPIActions;
    }

    /**
     * Get the instance of ExclusionsController.
     * @return exclusions
     */
    public ExclusionsController getExclusionsController() {
        return exclusions;
    }

    /**
     * Get the instance of OAuthAuthorizationController.
     * @return oAuthAuthorization
     */
    public OAuthAuthorizationController getOAuthAuthorizationController() {
        return oAuthAuthorization;
    }

    /**
     * Current API environment.
     * @return environment
     */
    public Environment getEnvironment() {
        return environment;
    }

    /**
     * The VZ-M2M session token from [Getting Started](/content/thingspace-portal/documentation/apis/connectivity-management/get-started.html).
     * @return vZM2MToken2
     */
    public String getVZM2MToken2() {
        return vZM2MToken2;
    }

    /**
     * The HTTP Client instance to use for making HTTP requests.
     * @return httpClient
     */
    private HttpClient getHttpClient() {
        return httpClient;
    }

    /**
     * Http Client Configuration instance.
     * @return httpClientConfig
     */
    public ReadonlyHttpClientConfiguration getHttpClientConfig() {
        return httpClientConfig;
    }

    /**
     * The credentials to use with ThingspaceOauth.
     * @return thingspaceOauthCredentials
     */
    public ThingspaceOauthCredentials getThingspaceOauthCredentials() {
        return thingspaceOauthManager;
    }

    /**
     * The auth credential model for ThingspaceOauth.
     * @return the instance of ThingspaceOauthModel
     */
    public ThingspaceOauthModel getThingspaceOauthModel() {
        return thingspaceOauthModel;
    }
    /**
     * The credentials to use with VzM2mSessionToken.
     * @return vzM2mSessionTokenCredentials
     */
    public VzM2mSessionTokenCredentials getVzM2mSessionTokenCredentials() {
        return vzM2mSessionTokenManager;
    }

    /**
     * The auth credential model for VzM2mSessionToken.
     * @return the instance of VzM2mSessionTokenModel
     */
    public VzM2mSessionTokenModel getVzM2mSessionTokenModel() {
        return vzM2mSessionTokenModel;
    }
    /**
     * The timeout to use for making HTTP requests.
     * @deprecated This method will be removed in a future version. Use
     *             {@link #getHttpClientConfig()} instead.
     *
     * @return timeout
     */
    @Deprecated
    public long timeout() {
        return httpClientConfig.getTimeout();
    }

    /**
     * Get base URI by current environment.
     * @param server Server for which to get the base URI
     * @return Processed base URI
     */
    public String getBaseUri(Server server) {
        Map<String, SimpleEntry<Object, Boolean>> parameters = new HashMap<>();
        StringBuilder baseUrl = new StringBuilder(environmentMapper(environment, server));
        ApiHelper.appendUrlWithTemplateParameters(baseUrl, parameters);
        return baseUrl.toString();
    }

    /**
     * Get base URI by current environment.
     * @return Processed base URI
     */
    public String getBaseUri() {
        return getBaseUri(Server.THINGSPACE);
    }


    /**
     * Get base URI by current environment.
     * 
     * @param server string for which to get the base URI
     * @return Processed base URI
     */
    public String getBaseUri(String server) {
        return getBaseUri(Server.fromString(server));
    }


    /**
     * Base URLs by environment and server aliases.
     * @param environment Environment for which to get the base URI
     * @param server Server for which to get the base URI
     * @return base URL
     */
    private static String environmentMapper(Environment environment, Server server) {
        if (environment.equals(Environment.PRODUCTION)) {
            if (server.equals(Server.OAUTH_SERVER)) {
                return "https://thingspace.verizon.com/api/ts/v1";
            }
            if (server.equals(Server.THINGSPACE)) {
                return "https://thingspace.verizon.com/api";
            }
        }
        if (environment.equals(Environment.STAGING)) {
            if (server.equals(Server.OAUTH_SERVER)) {
                return "https://staging.thingspace.verizon.com/api/ts/v1";
            }
            if (server.equals(Server.THINGSPACE)) {
                return "https://staging.thingspace.verizon.com/api";
            }
        }
        return "https://thingspace.verizon.com/api";
    }

    /**
     * Converts this VerizonThingSpaceQualityOfServiceAPIEndpointsClient into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "VerizonThingSpaceQualityOfServiceAPIEndpointsClient [" + "environment="
                + environment + ", vZM2MToken2=" + vZM2MToken2 + ", httpClientConfig="
                + httpClientConfig + ", authentications=" + authentications + "]";
    }

    /**
     * Builds a new {@link VerizonThingSpaceQualityOfServiceAPIEndpointsClient.Builder} object.
     * Creates the instance with the state of the current client.
     * @return a new {@link VerizonThingSpaceQualityOfServiceAPIEndpointsClient.Builder} object
     */
    public Builder newBuilder() {
        Builder builder = new Builder();
        builder.environment = getEnvironment();
        builder.vZM2MToken2 = getVZM2MToken2();
        builder.httpClient = getHttpClient();
        builder.thingspaceOauthCredentials(getThingspaceOauthModel()
                .toBuilder().build());
        builder.vzM2mSessionTokenCredentials(getVzM2mSessionTokenModel()
                .toBuilder().build());
        builder.httpCallback = httpCallback;
        builder.httpClientConfig(() -> ((HttpClientConfiguration) httpClientConfig).newBuilder());
        return builder;
    }

    /**
     * Class to build instances of {@link VerizonThingSpaceQualityOfServiceAPIEndpointsClient}.
     */
    public static class Builder {

        private Environment environment = Environment.PRODUCTION;
        private String vZM2MToken2 = "TODO: Replace";
        private HttpClient httpClient;
        private ThingspaceOauthModel thingspaceOauthModel =
                new ThingspaceOauthModel.Builder("", "").build();
        private VzM2mSessionTokenModel vzM2mSessionTokenModel =
                new VzM2mSessionTokenModel.Builder("").build();
        private HttpCallback httpCallback = null;
        private HttpClientConfiguration.Builder httpClientConfigBuilder =
                new HttpClientConfiguration.Builder();


        /**
         * Credentials setter for ThingspaceOauthCredentials.
         * @param thingspaceOauthModel The instance of ThingspaceOauthModel.
         * @return The current instance of builder.
         */
        public Builder thingspaceOauthCredentials(ThingspaceOauthModel thingspaceOauthModel) {
            this.thingspaceOauthModel = thingspaceOauthModel;
            return this;
        }

        /**
         * Credentials setter for VzM2mSessionTokenCredentials.
         * @param vzM2mSessionTokenModel The instance of VzM2mSessionTokenModel.
         * @return The current instance of builder.
         */
        public Builder vzM2mSessionTokenCredentials(VzM2mSessionTokenModel vzM2mSessionTokenModel) {
            this.vzM2mSessionTokenModel = vzM2mSessionTokenModel;
            return this;
        }

        /**
         * Current API environment.
         * @param environment The environment for client.
         * @return Builder
         */
        public Builder environment(Environment environment) {
            this.environment = environment;
            return this;
        }

        /**
         * The VZ-M2M session token from [Getting Started](/content/thingspace-portal/documentation/apis/connectivity-management/get-started.html).
         * @param vZM2MToken2 The vZM2MToken2 for client.
         * @return Builder
         */
        public Builder vZM2MToken2(String vZM2MToken2) {
            if (vZM2MToken2 == null) {
                throw new NullPointerException("vZM2MToken2 cannot be null");
            }
            this.vZM2MToken2 = vZM2MToken2;
            return this;
        }

        /**
         * The timeout to use for making HTTP requests.
         * @deprecated This method will be removed in a future version. Use
         *             {@link #httpClientConfig(Consumer) httpClientConfig} instead.
         * @param timeout must be greater then 0.
         * @return Builder
         */
        @Deprecated
        public Builder timeout(long timeout) {
            this.httpClientConfigBuilder.timeout(timeout);
            return this;
        }

        /**
         * HttpCallback.
         * @param httpCallback Callback to be called before and after the HTTP call.
         * @return Builder
         */
        public Builder httpCallback(HttpCallback httpCallback) {
            this.httpCallback = httpCallback;
            return this;
        }

        /**
         * Setter for the Builder of httpClientConfiguration, takes in an operation to be performed
         * on the builder instance of HTTP client configuration.
         * 
         * @param action Consumer for the builder of httpClientConfiguration.
         * @return Builder
         */
        public Builder httpClientConfig(Consumer<HttpClientConfiguration.Builder> action) {
            action.accept(httpClientConfigBuilder);
            return this;
        }

        /**
         * Private Setter for the Builder of httpClientConfiguration, takes in an operation to be performed
         * on the builder instance of HTTP client configuration.
         * 
         * @param supplier Supplier for the builder of httpClientConfiguration.
         * @return Builder
         */
        private Builder httpClientConfig(Supplier<HttpClientConfiguration.Builder> supplier) {
            httpClientConfigBuilder = supplier.get();
            return this;
        }

        /**
         * Builds a new VerizonThingSpaceQualityOfServiceAPIEndpointsClient object using the set fields.
         * @return VerizonThingSpaceQualityOfServiceAPIEndpointsClient
         */
        public VerizonThingSpaceQualityOfServiceAPIEndpointsClient build() {
            HttpClientConfiguration httpClientConfig = httpClientConfigBuilder.build();
            httpClient = new OkClient(httpClientConfig.getConfiguration(), compatibilityFactory);

            return new VerizonThingSpaceQualityOfServiceAPIEndpointsClient(environment, vZM2MToken2,
                    httpClient, httpClientConfig, thingspaceOauthModel, vzM2mSessionTokenModel,
                    httpCallback);
        }
    }
}