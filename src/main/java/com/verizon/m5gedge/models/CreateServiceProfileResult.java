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
 * This is a model class for CreateServiceProfileResult type.
 */
public class CreateServiceProfileResult {
    private String serviceProfileId;

    /**
     * Default constructor.
     */
    public CreateServiceProfileResult() {
    }

    /**
     * Initialization constructor.
     * @param  serviceProfileId  String value for serviceProfileId.
     */
    public CreateServiceProfileResult(
            String serviceProfileId) {
        this.serviceProfileId = serviceProfileId;
    }

    /**
     * Getter for ServiceProfileId.
     * Unique identifier for a service profile.
     * @return Returns the String
     */
    @JsonGetter("serviceProfileId")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getServiceProfileId() {
        return serviceProfileId;
    }

    /**
     * Setter for ServiceProfileId.
     * Unique identifier for a service profile.
     * @param serviceProfileId Value for String
     */
    @JsonSetter("serviceProfileId")
    public void setServiceProfileId(String serviceProfileId) {
        this.serviceProfileId = serviceProfileId;
    }

    /**
     * Converts this CreateServiceProfileResult into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "CreateServiceProfileResult [" + "serviceProfileId=" + serviceProfileId + "]";
    }

    /**
     * Builds a new {@link CreateServiceProfileResult.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link CreateServiceProfileResult.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .serviceProfileId(getServiceProfileId());
        return builder;
    }

    /**
     * Class to build instances of {@link CreateServiceProfileResult}.
     */
    public static class Builder {
        private String serviceProfileId;



        /**
         * Setter for serviceProfileId.
         * @param  serviceProfileId  String value for serviceProfileId.
         * @return Builder
         */
        public Builder serviceProfileId(String serviceProfileId) {
            this.serviceProfileId = serviceProfileId;
            return this;
        }

        /**
         * Builds a new {@link CreateServiceProfileResult} object using the set fields.
         * @return {@link CreateServiceProfileResult}
         */
        public CreateServiceProfileResult build() {
            return new CreateServiceProfileResult(serviceProfileId);
        }
    }
}
