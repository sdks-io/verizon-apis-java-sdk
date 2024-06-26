/*
 * VerizonLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.verizon.m5gedge;

import com.verizon.m5gedge.authentication.ThingspaceOauthCredentials;
import com.verizon.m5gedge.authentication.ThingspaceOauthModel;
import com.verizon.m5gedge.authentication.VZM2mTokenCredentials;
import com.verizon.m5gedge.authentication.VZM2mTokenModel;
import com.verizon.m5gedge.http.client.ReadonlyHttpClientConfiguration;

/**
 * Configuration Interface for the library.
 */
public interface Configuration {

    /**
     * Current API environment.
     * @return a copy of environment
     */
    Environment getEnvironment();

    /**
     * Http Client Configuration instance.
     * @return a copy of httpClientConfig
     */
    ReadonlyHttpClientConfiguration getHttpClientConfig();

    /**
     * The timeout to use for making HTTP requests. The timeout to use for making HTTP requests.
     * @return a copy of timeout
     */
    long timeout();

    /**
     * The credentials to use with ThingspaceOauth.
     * @return thingspaceOauthCredentials
     */
    ThingspaceOauthCredentials getThingspaceOauthCredentials();

    /**
     * The auth credential model for ThingspaceOauth.
     * @return the instance of ThingspaceOauthModel
     */
    ThingspaceOauthModel getThingspaceOauthModel();

    /**
     * The credentials to use with VZM2MToken.
     * @return vZM2mTokenCredentials
     */
    VZM2mTokenCredentials getVZM2mTokenCredentials();

    /**
     * The auth credential model for VZM2MToken.
     * @return the instance of VZM2mTokenModel
     */
    VZM2mTokenModel getVZM2mTokenModel();

    /**
     * Get base URI by current environment.
     * @param server Server for which to get the base URI
     * @return Processed base URI
     */
    String getBaseUri(Server server);

    /**
     * Get base URI by current environment.
     * @return Processed base URI
     */
    String getBaseUri();
}
