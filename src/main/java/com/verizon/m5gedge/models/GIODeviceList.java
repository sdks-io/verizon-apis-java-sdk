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
 * This is a model class for GIODeviceList type.
 */
public class GIODeviceList {
    private List<GIODeviceId> deviceIds;

    /**
     * Default constructor.
     */
    public GIODeviceList() {
    }

    /**
     * Initialization constructor.
     * @param  deviceIds  List of GIODeviceId value for deviceIds.
     */
    public GIODeviceList(
            List<GIODeviceId> deviceIds) {
        this.deviceIds = deviceIds;
    }

    /**
     * Getter for DeviceIds.
     * @return Returns the List of GIODeviceId
     */
    @JsonGetter("deviceIds")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<GIODeviceId> getDeviceIds() {
        return deviceIds;
    }

    /**
     * Setter for DeviceIds.
     * @param deviceIds Value for List of GIODeviceId
     */
    @JsonSetter("deviceIds")
    public void setDeviceIds(List<GIODeviceId> deviceIds) {
        this.deviceIds = deviceIds;
    }

    /**
     * Converts this GIODeviceList into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "GIODeviceList [" + "deviceIds=" + deviceIds + "]";
    }

    /**
     * Builds a new {@link GIODeviceList.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link GIODeviceList.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .deviceIds(getDeviceIds());
        return builder;
    }

    /**
     * Class to build instances of {@link GIODeviceList}.
     */
    public static class Builder {
        private List<GIODeviceId> deviceIds;



        /**
         * Setter for deviceIds.
         * @param  deviceIds  List of GIODeviceId value for deviceIds.
         * @return Builder
         */
        public Builder deviceIds(List<GIODeviceId> deviceIds) {
            this.deviceIds = deviceIds;
            return this;
        }

        /**
         * Builds a new {@link GIODeviceList} object using the set fields.
         * @return {@link GIODeviceList}
         */
        public GIODeviceList build() {
            return new GIODeviceList(deviceIds);
        }
    }
}
