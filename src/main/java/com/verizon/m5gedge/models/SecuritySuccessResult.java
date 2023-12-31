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
 * This is a model class for SecuritySuccessResult type.
 */
public class SecuritySuccessResult {
    private String requestId;

    /**
     * Default constructor.
     */
    public SecuritySuccessResult() {
    }

    /**
     * Initialization constructor.
     * @param  requestId  String value for requestId.
     */
    public SecuritySuccessResult(
            String requestId) {
        this.requestId = requestId;
    }

    /**
     * Getter for RequestId.
     * A unique string that associates the request with the results that are sent via a callback
     * message.The ThingSpace Platform sends a separate callback message for each device that
     * matches the request criteria, indicating whether the operation succeeded for that device and
     * containing any requested information. All callback messages will have the same requestId.
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
     * message.The ThingSpace Platform sends a separate callback message for each device that
     * matches the request criteria, indicating whether the operation succeeded for that device and
     * containing any requested information. All callback messages will have the same requestId.
     * @param requestId Value for String
     */
    @JsonSetter("requestId")
    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    /**
     * Converts this SecuritySuccessResult into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "SecuritySuccessResult [" + "requestId=" + requestId + "]";
    }

    /**
     * Builds a new {@link SecuritySuccessResult.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link SecuritySuccessResult.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .requestId(getRequestId());
        return builder;
    }

    /**
     * Class to build instances of {@link SecuritySuccessResult}.
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
         * Builds a new {@link SecuritySuccessResult} object using the set fields.
         * @return {@link SecuritySuccessResult}
         */
        public SecuritySuccessResult build() {
            return new SecuritySuccessResult(requestId);
        }
    }
}
