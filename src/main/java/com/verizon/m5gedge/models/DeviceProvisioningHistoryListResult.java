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
 * This is a model class for DeviceProvisioningHistoryListResult type.
 */
public class DeviceProvisioningHistoryListResult {
    private Boolean hasMoreData;
    private List<ProvisioningHistory> provisioningHistory;

    /**
     * Default constructor.
     */
    public DeviceProvisioningHistoryListResult() {
    }

    /**
     * Initialization constructor.
     * @param  hasMoreData  Boolean value for hasMoreData.
     * @param  provisioningHistory  List of ProvisioningHistory value for provisioningHistory.
     */
    public DeviceProvisioningHistoryListResult(
            Boolean hasMoreData,
            List<ProvisioningHistory> provisioningHistory) {
        this.hasMoreData = hasMoreData;
        this.provisioningHistory = provisioningHistory;
    }

    /**
     * Getter for HasMoreData.
     * False for a status 200 response.True for a status 202 response, indicating that there is more
     * data to be retrieved.
     * @return Returns the Boolean
     */
    @JsonGetter("hasMoreData")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getHasMoreData() {
        return hasMoreData;
    }

    /**
     * Setter for HasMoreData.
     * False for a status 200 response.True for a status 202 response, indicating that there is more
     * data to be retrieved.
     * @param hasMoreData Value for Boolean
     */
    @JsonSetter("hasMoreData")
    public void setHasMoreData(Boolean hasMoreData) {
        this.hasMoreData = hasMoreData;
    }

    /**
     * Getter for ProvisioningHistory.
     * The provisioning history of a specified device during a specified time period.
     * @return Returns the List of ProvisioningHistory
     */
    @JsonGetter("provisioningHistory")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<ProvisioningHistory> getProvisioningHistory() {
        return provisioningHistory;
    }

    /**
     * Setter for ProvisioningHistory.
     * The provisioning history of a specified device during a specified time period.
     * @param provisioningHistory Value for List of ProvisioningHistory
     */
    @JsonSetter("provisioningHistory")
    public void setProvisioningHistory(List<ProvisioningHistory> provisioningHistory) {
        this.provisioningHistory = provisioningHistory;
    }

    /**
     * Converts this DeviceProvisioningHistoryListResult into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "DeviceProvisioningHistoryListResult [" + "hasMoreData=" + hasMoreData
                + ", provisioningHistory=" + provisioningHistory + "]";
    }

    /**
     * Builds a new {@link DeviceProvisioningHistoryListResult.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link DeviceProvisioningHistoryListResult.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .hasMoreData(getHasMoreData())
                .provisioningHistory(getProvisioningHistory());
        return builder;
    }

    /**
     * Class to build instances of {@link DeviceProvisioningHistoryListResult}.
     */
    public static class Builder {
        private Boolean hasMoreData;
        private List<ProvisioningHistory> provisioningHistory;



        /**
         * Setter for hasMoreData.
         * @param  hasMoreData  Boolean value for hasMoreData.
         * @return Builder
         */
        public Builder hasMoreData(Boolean hasMoreData) {
            this.hasMoreData = hasMoreData;
            return this;
        }

        /**
         * Setter for provisioningHistory.
         * @param  provisioningHistory  List of ProvisioningHistory value for provisioningHistory.
         * @return Builder
         */
        public Builder provisioningHistory(List<ProvisioningHistory> provisioningHistory) {
            this.provisioningHistory = provisioningHistory;
            return this;
        }

        /**
         * Builds a new {@link DeviceProvisioningHistoryListResult} object using the set fields.
         * @return {@link DeviceProvisioningHistoryListResult}
         */
        public DeviceProvisioningHistoryListResult build() {
            return new DeviceProvisioningHistoryListResult(hasMoreData, provisioningHistory);
        }
    }
}
