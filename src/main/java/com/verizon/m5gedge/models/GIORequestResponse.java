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
 * This is a model class for GIORequestResponse type.
 */
public class GIORequestResponse {
    private String requestId;

    /**
     * Default constructor.
     */
    public GIORequestResponse() {
    }

    /**
     * Initialization constructor.
     * @param  requestId  String value for requestId.
     */
    public GIORequestResponse(
            String requestId) {
        this.requestId = requestId;
    }

    /**
     * Getter for RequestId.
     * @return Returns the String
     */
    @JsonGetter("requestId")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getRequestId() {
        return requestId;
    }

    /**
     * Setter for RequestId.
     * @param requestId Value for String
     */
    @JsonSetter("requestId")
    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    /**
     * Converts this GIORequestResponse into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "GIORequestResponse [" + "requestId=" + requestId + "]";
    }

    /**
     * Builds a new {@link GIORequestResponse.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link GIORequestResponse.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .requestId(getRequestId());
        return builder;
    }

    /**
     * Class to build instances of {@link GIORequestResponse}.
     */
    public static class Builder {
        private String requestId;



        /**
         * Setter for requestId.
         * @param  requestId  String value for requestId.
         * @return Builder
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Builds a new {@link GIORequestResponse} object using the set fields.
         * @return {@link GIORequestResponse}
         */
        public GIORequestResponse build() {
            return new GIORequestResponse(requestId);
        }
    }
}