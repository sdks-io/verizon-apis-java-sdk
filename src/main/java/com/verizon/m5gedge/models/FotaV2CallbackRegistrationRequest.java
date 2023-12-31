/*
 * VerizonLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.verizon.m5gedge.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * This is a model class for FotaV2CallbackRegistrationRequest type.
 */
public class FotaV2CallbackRegistrationRequest {
    private String url;

    /**
     * Default constructor.
     */
    public FotaV2CallbackRegistrationRequest() {
    }

    /**
     * Initialization constructor.
     * @param  url  String value for url.
     */
    public FotaV2CallbackRegistrationRequest(
            String url) {
        this.url = url;
    }

    /**
     * Getter for Url.
     * Callback URL for an subscribed service.
     * @return Returns the String
     */
    @JsonGetter("url")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getUrl() {
        return url;
    }

    /**
     * Setter for Url.
     * Callback URL for an subscribed service.
     * @param url Value for String
     */
    @JsonSetter("url")
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * Converts this FotaV2CallbackRegistrationRequest into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "FotaV2CallbackRegistrationRequest [" + "url=" + url + "]";
    }

    /**
     * Builds a new {@link FotaV2CallbackRegistrationRequest.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link FotaV2CallbackRegistrationRequest.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .url(getUrl());
        return builder;
    }

    /**
     * Class to build instances of {@link FotaV2CallbackRegistrationRequest}.
     */
    public static class Builder {
        private String url;



        /**
         * Setter for url.
         * @param  url  String value for url.
         * @return Builder
         */
        public Builder url(String url) {
            this.url = url;
            return this;
        }

        /**
         * Builds a new {@link FotaV2CallbackRegistrationRequest} object using the set fields.
         * @return {@link FotaV2CallbackRegistrationRequest}
         */
        public FotaV2CallbackRegistrationRequest build() {
            return new FotaV2CallbackRegistrationRequest(url);
        }
    }
}
