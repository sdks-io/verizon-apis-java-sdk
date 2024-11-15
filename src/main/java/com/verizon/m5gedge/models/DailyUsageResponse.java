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
 * This is a model class for DailyUsageResponse type.
 */
public class DailyUsageResponse {
    private Boolean hasMoreData;
    private GIODeviceId deviceId;
    private List<DailyUsageHistory> usageHistory;

    /**
     * Default constructor.
     */
    public DailyUsageResponse() {
    }

    /**
     * Initialization constructor.
     * @param  hasMoreData  Boolean value for hasMoreData.
     * @param  deviceId  GIODeviceId value for deviceId.
     * @param  usageHistory  List of DailyUsageHistory value for usageHistory.
     */
    public DailyUsageResponse(
            Boolean hasMoreData,
            GIODeviceId deviceId,
            List<DailyUsageHistory> usageHistory) {
        this.hasMoreData = hasMoreData;
        this.deviceId = deviceId;
        this.usageHistory = usageHistory;
    }

    /**
     * Getter for HasMoreData.
     * A flag set to indicate if there is more than one page of data returned by the query (true) or
     * if only one page of data returned (false)
     * @return Returns the Boolean
     */
    @JsonGetter("hasMoreData")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getHasMoreData() {
        return hasMoreData;
    }

    /**
     * Setter for HasMoreData.
     * A flag set to indicate if there is more than one page of data returned by the query (true) or
     * if only one page of data returned (false)
     * @param hasMoreData Value for Boolean
     */
    @JsonSetter("hasMoreData")
    public void setHasMoreData(Boolean hasMoreData) {
        this.hasMoreData = hasMoreData;
    }

    /**
     * Getter for DeviceId.
     * @return Returns the GIODeviceId
     */
    @JsonGetter("deviceId")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public GIODeviceId getDeviceId() {
        return deviceId;
    }

    /**
     * Setter for DeviceId.
     * @param deviceId Value for GIODeviceId
     */
    @JsonSetter("deviceId")
    public void setDeviceId(GIODeviceId deviceId) {
        this.deviceId = deviceId;
    }

    /**
     * Getter for UsageHistory.
     * @return Returns the List of DailyUsageHistory
     */
    @JsonGetter("usageHistory")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<DailyUsageHistory> getUsageHistory() {
        return usageHistory;
    }

    /**
     * Setter for UsageHistory.
     * @param usageHistory Value for List of DailyUsageHistory
     */
    @JsonSetter("usageHistory")
    public void setUsageHistory(List<DailyUsageHistory> usageHistory) {
        this.usageHistory = usageHistory;
    }

    /**
     * Converts this DailyUsageResponse into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "DailyUsageResponse [" + "hasMoreData=" + hasMoreData + ", deviceId=" + deviceId
                + ", usageHistory=" + usageHistory + "]";
    }

    /**
     * Builds a new {@link DailyUsageResponse.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link DailyUsageResponse.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .hasMoreData(getHasMoreData())
                .deviceId(getDeviceId())
                .usageHistory(getUsageHistory());
        return builder;
    }

    /**
     * Class to build instances of {@link DailyUsageResponse}.
     */
    public static class Builder {
        private Boolean hasMoreData;
        private GIODeviceId deviceId;
        private List<DailyUsageHistory> usageHistory;



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
         * Setter for deviceId.
         * @param  deviceId  GIODeviceId value for deviceId.
         * @return Builder
         */
        public Builder deviceId(GIODeviceId deviceId) {
            this.deviceId = deviceId;
            return this;
        }

        /**
         * Setter for usageHistory.
         * @param  usageHistory  List of DailyUsageHistory value for usageHistory.
         * @return Builder
         */
        public Builder usageHistory(List<DailyUsageHistory> usageHistory) {
            this.usageHistory = usageHistory;
            return this;
        }

        /**
         * Builds a new {@link DailyUsageResponse} object using the set fields.
         * @return {@link DailyUsageResponse}
         */
        public DailyUsageResponse build() {
            return new DailyUsageResponse(hasMoreData, deviceId, usageHistory);
        }
    }
}
