/*
 * VerizonLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.verizon.m5gedge.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;
import java.util.List;

/**
 * This is a model class for ListServiceProfilesResult type.
 */
public class ListServiceProfilesResult {
    private String status;
    private List<String> data;

    /**
     * Default constructor.
     */
    public ListServiceProfilesResult() {
    }

    /**
     * Initialization constructor.
     * @param  status  String value for status.
     * @param  data  List of String value for data.
     */
    public ListServiceProfilesResult(
            String status,
            List<String> data) {
        this.status = status;
        this.data = data;
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
     * Getter for Data.
     * A comma delimited list of all the service profiles registered under your API key.
     * @return Returns the List of String
     */
    @JsonGetter("data")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<String> getData() {
        return data;
    }

    /**
     * Setter for Data.
     * A comma delimited list of all the service profiles registered under your API key.
     * @param data Value for List of String
     */
    @JsonSetter("data")
    public void setData(List<String> data) {
        this.data = data;
    }

    /**
     * Converts this ListServiceProfilesResult into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "ListServiceProfilesResult [" + "status=" + status + ", data=" + data + "]";
    }

    /**
     * Builds a new {@link ListServiceProfilesResult.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link ListServiceProfilesResult.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .status(getStatus())
                .data(getData());
        return builder;
    }

    /**
     * Class to build instances of {@link ListServiceProfilesResult}.
     */
    public static class Builder {
        private String status;
        private List<String> data;



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
         * Setter for data.
         * @param  data  List of String value for data.
         * @return Builder
         */
        public Builder data(List<String> data) {
            this.data = data;
            return this;
        }

        /**
         * Builds a new {@link ListServiceProfilesResult} object using the set fields.
         * @return {@link ListServiceProfilesResult}
         */
        public ListServiceProfilesResult build() {
            return new ListServiceProfilesResult(status, data);
        }
    }
}
