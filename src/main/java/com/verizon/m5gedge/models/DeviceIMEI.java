/*
 * VerizonLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.verizon.m5gedge.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;
import java.util.List;

/**
 * This is a model class for DeviceIMEI type.
 */
public class DeviceIMEI {
    private List<String> deviceList;

    /**
     * Default constructor.
     */
    public DeviceIMEI() {
    }

    /**
     * Initialization constructor.
     * @param  deviceList  List of String value for deviceList.
     */
    public DeviceIMEI(
            List<String> deviceList) {
        this.deviceList = deviceList;
    }

    /**
     * Getter for DeviceList.
     * Device IMEI list.
     * @return Returns the List of String
     */
    @JsonGetter("deviceList")
    public List<String> getDeviceList() {
        return deviceList;
    }

    /**
     * Setter for DeviceList.
     * Device IMEI list.
     * @param deviceList Value for List of String
     */
    @JsonSetter("deviceList")
    public void setDeviceList(List<String> deviceList) {
        this.deviceList = deviceList;
    }

    /**
     * Converts this DeviceIMEI into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "DeviceIMEI [" + "deviceList=" + deviceList + "]";
    }

    /**
     * Builds a new {@link DeviceIMEI.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link DeviceIMEI.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(deviceList);
        return builder;
    }

    /**
     * Class to build instances of {@link DeviceIMEI}.
     */
    public static class Builder {
        private List<String> deviceList;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  deviceList  List of String value for deviceList.
         */
        public Builder(List<String> deviceList) {
            this.deviceList = deviceList;
        }

        /**
         * Setter for deviceList.
         * @param  deviceList  List of String value for deviceList.
         * @return Builder
         */
        public Builder deviceList(List<String> deviceList) {
            this.deviceList = deviceList;
            return this;
        }

        /**
         * Builds a new {@link DeviceIMEI} object using the set fields.
         * @return {@link DeviceIMEI}
         */
        public DeviceIMEI build() {
            return new DeviceIMEI(deviceList);
        }
    }
}
