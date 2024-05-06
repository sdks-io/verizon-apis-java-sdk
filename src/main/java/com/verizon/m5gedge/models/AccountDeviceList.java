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
 * This is a model class for AccountDeviceList type.
 */
public class AccountDeviceList {
    private List<DeviceId> deviceIds;
    private String ipAddress;

    /**
     * Default constructor.
     */
    public AccountDeviceList() {
    }

    /**
     * Initialization constructor.
     * @param  deviceIds  List of DeviceId value for deviceIds.
     * @param  ipAddress  String value for ipAddress.
     */
    public AccountDeviceList(
            List<DeviceId> deviceIds,
            String ipAddress) {
        this.deviceIds = deviceIds;
        this.ipAddress = ipAddress;
    }

    /**
     * Getter for DeviceIds.
     * All identifiers for the device.
     * @return Returns the List of DeviceId
     */
    @JsonGetter("deviceIds")
    public List<DeviceId> getDeviceIds() {
        return deviceIds;
    }

    /**
     * Setter for DeviceIds.
     * All identifiers for the device.
     * @param deviceIds Value for List of DeviceId
     */
    @JsonSetter("deviceIds")
    public void setDeviceIds(List<DeviceId> deviceIds) {
        this.deviceIds = deviceIds;
    }

    /**
     * Getter for IpAddress.
     * @return Returns the String
     */
    @JsonGetter("ipAddress")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getIpAddress() {
        return ipAddress;
    }

    /**
     * Setter for IpAddress.
     * @param ipAddress Value for String
     */
    @JsonSetter("ipAddress")
    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    /**
     * Converts this AccountDeviceList into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "AccountDeviceList [" + "deviceIds=" + deviceIds + ", ipAddress=" + ipAddress + "]";
    }

    /**
     * Builds a new {@link AccountDeviceList.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link AccountDeviceList.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(deviceIds)
                .ipAddress(getIpAddress());
        return builder;
    }

    /**
     * Class to build instances of {@link AccountDeviceList}.
     */
    public static class Builder {
        private List<DeviceId> deviceIds;
        private String ipAddress;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  deviceIds  List of DeviceId value for deviceIds.
         */
        public Builder(List<DeviceId> deviceIds) {
            this.deviceIds = deviceIds;
        }

        /**
         * Setter for deviceIds.
         * @param  deviceIds  List of DeviceId value for deviceIds.
         * @return Builder
         */
        public Builder deviceIds(List<DeviceId> deviceIds) {
            this.deviceIds = deviceIds;
            return this;
        }

        /**
         * Setter for ipAddress.
         * @param  ipAddress  String value for ipAddress.
         * @return Builder
         */
        public Builder ipAddress(String ipAddress) {
            this.ipAddress = ipAddress;
            return this;
        }

        /**
         * Builds a new {@link AccountDeviceList} object using the set fields.
         * @return {@link AccountDeviceList}
         */
        public AccountDeviceList build() {
            return new AccountDeviceList(deviceIds, ipAddress);
        }
    }
}
