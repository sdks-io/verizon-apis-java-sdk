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
 * This is a model class for LogOutRequest type.
 */
public class LogOutRequest {
    private String sessionToken;

    /**
     * Default constructor.
     */
    public LogOutRequest() {
    }

    /**
     * Initialization constructor.
     * @param  sessionToken  String value for sessionToken.
     */
    public LogOutRequest(
            String sessionToken) {
        this.sessionToken = sessionToken;
    }

    /**
     * Getter for SessionToken.
     * The session token is returned to confirm that it was invalidated.
     * @return Returns the String
     */
    @JsonGetter("sessionToken")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getSessionToken() {
        return sessionToken;
    }

    /**
     * Setter for SessionToken.
     * The session token is returned to confirm that it was invalidated.
     * @param sessionToken Value for String
     */
    @JsonSetter("sessionToken")
    public void setSessionToken(String sessionToken) {
        this.sessionToken = sessionToken;
    }

    /**
     * Converts this LogOutRequest into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "LogOutRequest [" + "sessionToken=" + sessionToken + "]";
    }

    /**
     * Builds a new {@link LogOutRequest.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link LogOutRequest.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .sessionToken(getSessionToken());
        return builder;
    }

    /**
     * Class to build instances of {@link LogOutRequest}.
     */
    public static class Builder {
        private String sessionToken;



        /**
         * Setter for sessionToken.
         * @param  sessionToken  String value for sessionToken.
         * @return Builder
         */
        public Builder sessionToken(String sessionToken) {
            this.sessionToken = sessionToken;
            return this;
        }

        /**
         * Builds a new {@link LogOutRequest} object using the set fields.
         * @return {@link LogOutRequest}
         */
        public LogOutRequest build() {
            return new LogOutRequest(sessionToken);
        }
    }
}