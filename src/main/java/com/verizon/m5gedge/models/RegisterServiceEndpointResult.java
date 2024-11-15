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
 * This is a model class for RegisterServiceEndpointResult type.
 */
public class RegisterServiceEndpointResult {
    private String serviceEndpointsId;

    /**
     * Default constructor.
     */
    public RegisterServiceEndpointResult() {
    }

    /**
     * Initialization constructor.
     * @param  serviceEndpointsId  String value for serviceEndpointsId.
     */
    public RegisterServiceEndpointResult(
            String serviceEndpointsId) {
        this.serviceEndpointsId = serviceEndpointsId;
    }

    /**
     * Getter for ServiceEndpointsId.
     * A system-defined string identifier representing one or more registered Service Endpoints.
     * @return Returns the String
     */
    @JsonGetter("serviceEndpointsId")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getServiceEndpointsId() {
        return serviceEndpointsId;
    }

    /**
     * Setter for ServiceEndpointsId.
     * A system-defined string identifier representing one or more registered Service Endpoints.
     * @param serviceEndpointsId Value for String
     */
    @JsonSetter("serviceEndpointsId")
    public void setServiceEndpointsId(String serviceEndpointsId) {
        this.serviceEndpointsId = serviceEndpointsId;
    }

    /**
     * Converts this RegisterServiceEndpointResult into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "RegisterServiceEndpointResult [" + "serviceEndpointsId=" + serviceEndpointsId + "]";
    }

    /**
     * Builds a new {@link RegisterServiceEndpointResult.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link RegisterServiceEndpointResult.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .serviceEndpointsId(getServiceEndpointsId());
        return builder;
    }

    /**
     * Class to build instances of {@link RegisterServiceEndpointResult}.
     */
    public static class Builder {
        private String serviceEndpointsId;



        /**
         * Setter for serviceEndpointsId.
         * @param  serviceEndpointsId  String value for serviceEndpointsId.
         * @return Builder
         */
        public Builder serviceEndpointsId(String serviceEndpointsId) {
            this.serviceEndpointsId = serviceEndpointsId;
            return this;
        }

        /**
         * Builds a new {@link RegisterServiceEndpointResult} object using the set fields.
         * @return {@link RegisterServiceEndpointResult}
         */
        public RegisterServiceEndpointResult build() {
            return new RegisterServiceEndpointResult(serviceEndpointsId);
        }
    }
}