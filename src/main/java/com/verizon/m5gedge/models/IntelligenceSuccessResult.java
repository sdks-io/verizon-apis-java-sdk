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
 * This is a model class for IntelligenceSuccessResult type.
 */
public class IntelligenceSuccessResult {
    private String status;

    /**
     * Default constructor.
     */
    public IntelligenceSuccessResult() {
    }

    /**
     * Initialization constructor.
     * @param  status  String value for status.
     */
    public IntelligenceSuccessResult(
            String status) {
        this.status = status;
    }

    /**
     * Getter for Status.
     * Anomaly detection status.
     * @return Returns the String
     */
    @JsonGetter("status")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getStatus() {
        return status;
    }

    /**
     * Setter for Status.
     * Anomaly detection status.
     * @param status Value for String
     */
    @JsonSetter("status")
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * Converts this IntelligenceSuccessResult into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "IntelligenceSuccessResult [" + "status=" + status + "]";
    }

    /**
     * Builds a new {@link IntelligenceSuccessResult.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link IntelligenceSuccessResult.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .status(getStatus());
        return builder;
    }

    /**
     * Class to build instances of {@link IntelligenceSuccessResult}.
     */
    public static class Builder {
        private String status;



        /**
         * Setter for status.
         * @param  status  String value for status.
         * @return Builder
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * Builds a new {@link IntelligenceSuccessResult} object using the set fields.
         * @return {@link IntelligenceSuccessResult}
         */
        public IntelligenceSuccessResult build() {
            return new IntelligenceSuccessResult(status);
        }
    }
}
