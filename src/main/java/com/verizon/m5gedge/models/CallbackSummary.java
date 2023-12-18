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
 * This is a model class for CallbackSummary type.
 */
public class CallbackSummary {
    private String url;

    /**
     * Default constructor.
     */
    public CallbackSummary() {
    }

    /**
     * Initialization constructor.
     * @param  url  String value for url.
     */
    public CallbackSummary(
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
     * Converts this CallbackSummary into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "CallbackSummary [" + "url=" + url + "]";
    }

    /**
     * Builds a new {@link CallbackSummary.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link CallbackSummary.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .url(getUrl());
        return builder;
    }

    /**
     * Class to build instances of {@link CallbackSummary}.
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
         * Builds a new {@link CallbackSummary} object using the set fields.
         * @return {@link CallbackSummary}
         */
        public CallbackSummary build() {
            return new CallbackSummary(url);
        }
    }
}
