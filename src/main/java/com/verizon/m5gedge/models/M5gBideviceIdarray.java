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
 * This is a model class for M5gBideviceIdarray type.
 */
public class M5gBideviceIdarray {
    private List<M5gBideviceId1> deviceId;

    /**
     * Default constructor.
     */
    public M5gBideviceIdarray() {
    }

    /**
     * Initialization constructor.
     * @param  deviceId  List of M5gBideviceId1 value for deviceId.
     */
    public M5gBideviceIdarray(
            List<M5gBideviceId1> deviceId) {
        this.deviceId = deviceId;
    }

    /**
     * Getter for DeviceId.
     * @return Returns the List of M5gBideviceId1
     */
    @JsonGetter("deviceId")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<M5gBideviceId1> getDeviceId() {
        return deviceId;
    }

    /**
     * Setter for DeviceId.
     * @param deviceId Value for List of M5gBideviceId1
     */
    @JsonSetter("deviceId")
    public void setDeviceId(List<M5gBideviceId1> deviceId) {
        this.deviceId = deviceId;
    }

    /**
     * Converts this M5gBideviceIdarray into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "M5gBideviceIdarray [" + "deviceId=" + deviceId + "]";
    }

    /**
     * Builds a new {@link M5gBideviceIdarray.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link M5gBideviceIdarray.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .deviceId(getDeviceId());
        return builder;
    }

    /**
     * Class to build instances of {@link M5gBideviceIdarray}.
     */
    public static class Builder {
        private List<M5gBideviceId1> deviceId;



        /**
         * Setter for deviceId.
         * @param  deviceId  List of M5gBideviceId1 value for deviceId.
         * @return Builder
         */
        public Builder deviceId(List<M5gBideviceId1> deviceId) {
            this.deviceId = deviceId;
            return this;
        }

        /**
         * Builds a new {@link M5gBideviceIdarray} object using the set fields.
         * @return {@link M5gBideviceIdarray}
         */
        public M5gBideviceIdarray build() {
            return new M5gBideviceIdarray(deviceId);
        }
    }
}
