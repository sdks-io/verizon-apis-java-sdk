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
 * This is a model class for ChangeMecDeviceIPAddressResponse type.
 */
public class ChangeMecDeviceIPAddressResponse {
    private String requestId;

    /**
     * Default constructor.
     */
    public ChangeMecDeviceIPAddressResponse() {
    }

    /**
     * Initialization constructor.
     * @param  requestId  String value for requestId.
     */
    public ChangeMecDeviceIPAddressResponse(
            String requestId) {
        this.requestId = requestId;
    }

    /**
     * Getter for RequestId.
     * A unique string that associates the request with the results that are sent via a callback
     * service.
     * @return Returns the String
     */
    @JsonGetter("requestId")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getRequestId() {
        return requestId;
    }

    /**
     * Setter for RequestId.
     * A unique string that associates the request with the results that are sent via a callback
     * service.
     * @param requestId Value for String
     */
    @JsonSetter("requestId")
    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    /**
     * Converts this ChangeMecDeviceIPAddressResponse into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "ChangeMecDeviceIPAddressResponse [" + "requestId=" + requestId + "]";
    }

    /**
     * Builds a new {@link ChangeMecDeviceIPAddressResponse.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link ChangeMecDeviceIPAddressResponse.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .requestId(getRequestId());
        return builder;
    }

    /**
     * Class to build instances of {@link ChangeMecDeviceIPAddressResponse}.
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
         * Builds a new {@link ChangeMecDeviceIPAddressResponse} object using the set fields.
         * @return {@link ChangeMecDeviceIPAddressResponse}
         */
        public ChangeMecDeviceIPAddressResponse build() {
            return new ChangeMecDeviceIPAddressResponse(requestId);
        }
    }
}
