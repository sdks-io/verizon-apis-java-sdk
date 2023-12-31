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
 * This is a model class for AccountDeviceListResult type.
 */
public class AccountDeviceListResult {
    private List<ThingspaceDevice> devices;
    private Boolean hasMoreData;

    /**
     * Default constructor.
     */
    public AccountDeviceListResult() {
    }

    /**
     * Initialization constructor.
     * @param  devices  List of ThingspaceDevice value for devices.
     * @param  hasMoreData  Boolean value for hasMoreData.
     */
    public AccountDeviceListResult(
            List<ThingspaceDevice> devices,
            Boolean hasMoreData) {
        this.devices = devices;
        this.hasMoreData = hasMoreData;
    }

    /**
     * Getter for Devices.
     * Up to 10,000 devices that you want to move to a different account, specified by device
     * identifier.
     * @return Returns the List of ThingspaceDevice
     */
    @JsonGetter("devices")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<ThingspaceDevice> getDevices() {
        return devices;
    }

    /**
     * Setter for Devices.
     * Up to 10,000 devices that you want to move to a different account, specified by device
     * identifier.
     * @param devices Value for List of ThingspaceDevice
     */
    @JsonSetter("devices")
    public void setDevices(List<ThingspaceDevice> devices) {
        this.devices = devices;
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
     * Converts this AccountDeviceListResult into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "AccountDeviceListResult [" + "devices=" + devices + ", hasMoreData=" + hasMoreData
                + "]";
    }

    /**
     * Builds a new {@link AccountDeviceListResult.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link AccountDeviceListResult.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .devices(getDevices())
                .hasMoreData(getHasMoreData());
        return builder;
    }

    /**
     * Class to build instances of {@link AccountDeviceListResult}.
     */
    public static class Builder {
        private List<ThingspaceDevice> devices;
        private Boolean hasMoreData;



        /**
         * Setter for devices.
         * @param  devices  List of ThingspaceDevice value for devices.
         * @return Builder
         */
        public Builder devices(List<ThingspaceDevice> devices) {
            this.devices = devices;
            return this;
        }

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
         * Builds a new {@link AccountDeviceListResult} object using the set fields.
         * @return {@link AccountDeviceListResult}
         */
        public AccountDeviceListResult build() {
            return new AccountDeviceListResult(devices, hasMoreData);
        }
    }
}
