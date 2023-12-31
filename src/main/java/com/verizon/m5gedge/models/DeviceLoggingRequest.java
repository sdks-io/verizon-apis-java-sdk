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
 * This is a model class for DeviceLoggingRequest type.
 */
public class DeviceLoggingRequest {
    private List<String> deviceIds;

    /**
     * Default constructor.
     */
    public DeviceLoggingRequest() {
    }

    /**
     * Initialization constructor.
     * @param  deviceIds  List of String value for deviceIds.
     */
    public DeviceLoggingRequest(
            List<String> deviceIds) {
        this.deviceIds = deviceIds;
    }

    /**
     * Getter for DeviceIds.
     * List of device IMEI identifiers.
     * @return Returns the List of String
     */
    @JsonGetter("deviceIds")
    public List<String> getDeviceIds() {
        return deviceIds;
    }

    /**
     * Setter for DeviceIds.
     * List of device IMEI identifiers.
     * @param deviceIds Value for List of String
     */
    @JsonSetter("deviceIds")
    public void setDeviceIds(List<String> deviceIds) {
        this.deviceIds = deviceIds;
    }

    /**
     * Converts this DeviceLoggingRequest into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "DeviceLoggingRequest [" + "deviceIds=" + deviceIds + "]";
    }

    /**
     * Builds a new {@link DeviceLoggingRequest.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link DeviceLoggingRequest.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(deviceIds);
        return builder;
    }

    /**
     * Class to build instances of {@link DeviceLoggingRequest}.
     */
    public static class Builder {
        private List<String> deviceIds;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  deviceIds  List of String value for deviceIds.
         */
        public Builder(List<String> deviceIds) {
            this.deviceIds = deviceIds;
        }

        /**
         * Setter for deviceIds.
         * @param  deviceIds  List of String value for deviceIds.
         * @return Builder
         */
        public Builder deviceIds(List<String> deviceIds) {
            this.deviceIds = deviceIds;
            return this;
        }

        /**
         * Builds a new {@link DeviceLoggingRequest} object using the set fields.
         * @return {@link DeviceLoggingRequest}
         */
        public DeviceLoggingRequest build() {
            return new DeviceLoggingRequest(deviceIds);
        }
    }
}
