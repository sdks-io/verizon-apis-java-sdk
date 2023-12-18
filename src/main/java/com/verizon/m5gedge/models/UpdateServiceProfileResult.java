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
 * This is a model class for UpdateServiceProfileResult type.
 */
public class UpdateServiceProfileResult {
    private String status;
    private String message;

    /**
     * Default constructor.
     */
    public UpdateServiceProfileResult() {
    }

    /**
     * Initialization constructor.
     * @param  status  String value for status.
     * @param  message  String value for message.
     */
    public UpdateServiceProfileResult(
            String status,
            String message) {
        this.status = status;
        this.message = message;
    }

    /**
     * Getter for Status.
     * HTTP status code.
     * @return Returns the String
     */
    @JsonGetter("status")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getStatus() {
        return status;
    }

    /**
     * Setter for Status.
     * HTTP status code.
     * @param status Value for String
     */
    @JsonSetter("status")
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * Getter for Message.
     * Service Profile that are updated or error details in case of an error.
     * @return Returns the String
     */
    @JsonGetter("message")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getMessage() {
        return message;
    }

    /**
     * Setter for Message.
     * Service Profile that are updated or error details in case of an error.
     * @param message Value for String
     */
    @JsonSetter("message")
    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * Converts this UpdateServiceProfileResult into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "UpdateServiceProfileResult [" + "status=" + status + ", message=" + message + "]";
    }

    /**
     * Builds a new {@link UpdateServiceProfileResult.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link UpdateServiceProfileResult.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .status(getStatus())
                .message(getMessage());
        return builder;
    }

    /**
     * Class to build instances of {@link UpdateServiceProfileResult}.
     */
    public static class Builder {
        private String status;
        private String message;



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
         * Setter for message.
         * @param  message  String value for message.
         * @return Builder
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * Builds a new {@link UpdateServiceProfileResult} object using the set fields.
         * @return {@link UpdateServiceProfileResult}
         */
        public UpdateServiceProfileResult build() {
            return new UpdateServiceProfileResult(status, message);
        }
    }
}
