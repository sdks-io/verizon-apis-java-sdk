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
 * This is a model class for RetrievesAvailableFilesResponseList type.
 */
public class RetrievesAvailableFilesResponseList {
    private List<RetrievesAvailableFilesResponse> availableFilesResponse;

    /**
     * Default constructor.
     */
    public RetrievesAvailableFilesResponseList() {
    }

    /**
     * Initialization constructor.
     * @param  availableFilesResponse  List of RetrievesAvailableFilesResponse value for
     *         availableFilesResponse.
     */
    public RetrievesAvailableFilesResponseList(
            List<RetrievesAvailableFilesResponse> availableFilesResponse) {
        this.availableFilesResponse = availableFilesResponse;
    }

    /**
     * Getter for AvailableFilesResponse.
     * @return Returns the List of RetrievesAvailableFilesResponse
     */
    @JsonGetter("AvailableFilesResponse")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<RetrievesAvailableFilesResponse> getAvailableFilesResponse() {
        return availableFilesResponse;
    }

    /**
     * Setter for AvailableFilesResponse.
     * @param availableFilesResponse Value for List of RetrievesAvailableFilesResponse
     */
    @JsonSetter("AvailableFilesResponse")
    public void setAvailableFilesResponse(List<RetrievesAvailableFilesResponse> availableFilesResponse) {
        this.availableFilesResponse = availableFilesResponse;
    }

    /**
     * Converts this RetrievesAvailableFilesResponseList into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "RetrievesAvailableFilesResponseList [" + "availableFilesResponse="
                + availableFilesResponse + "]";
    }

    /**
     * Builds a new {@link RetrievesAvailableFilesResponseList.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link RetrievesAvailableFilesResponseList.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .availableFilesResponse(getAvailableFilesResponse());
        return builder;
    }

    /**
     * Class to build instances of {@link RetrievesAvailableFilesResponseList}.
     */
    public static class Builder {
        private List<RetrievesAvailableFilesResponse> availableFilesResponse;



        /**
         * Setter for availableFilesResponse.
         * @param  availableFilesResponse  List of RetrievesAvailableFilesResponse value for
         *         availableFilesResponse.
         * @return Builder
         */
        public Builder availableFilesResponse(
                List<RetrievesAvailableFilesResponse> availableFilesResponse) {
            this.availableFilesResponse = availableFilesResponse;
            return this;
        }

        /**
         * Builds a new {@link RetrievesAvailableFilesResponseList} object using the set fields.
         * @return {@link RetrievesAvailableFilesResponseList}
         */
        public RetrievesAvailableFilesResponseList build() {
            return new RetrievesAvailableFilesResponseList(availableFilesResponse);
        }
    }
}