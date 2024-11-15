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
 * This is a model class for M5gBideviceDetailsresponse type.
 */
public class M5gBideviceDetailsresponse {
    private Boolean hasMoreData;
    private List<M5gBiaccountNameobject> devices;

    /**
     * Default constructor.
     */
    public M5gBideviceDetailsresponse() {
    }

    /**
     * Initialization constructor.
     * @param  hasMoreData  Boolean value for hasMoreData.
     * @param  devices  List of M5gBiaccountNameobject value for devices.
     */
    public M5gBideviceDetailsresponse(
            Boolean hasMoreData,
            List<M5gBiaccountNameobject> devices) {
        this.hasMoreData = hasMoreData;
        this.devices = devices;
    }

    /**
     * Getter for HasMoreData.
     * @return Returns the Boolean
     */
    @JsonGetter("hasMoreData")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getHasMoreData() {
        return hasMoreData;
    }

    /**
     * Setter for HasMoreData.
     * @param hasMoreData Value for Boolean
     */
    @JsonSetter("hasMoreData")
    public void setHasMoreData(Boolean hasMoreData) {
        this.hasMoreData = hasMoreData;
    }

    /**
     * Getter for Devices.
     * @return Returns the List of M5gBiaccountNameobject
     */
    @JsonGetter("devices")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<M5gBiaccountNameobject> getDevices() {
        return devices;
    }

    /**
     * Setter for Devices.
     * @param devices Value for List of M5gBiaccountNameobject
     */
    @JsonSetter("devices")
    public void setDevices(List<M5gBiaccountNameobject> devices) {
        this.devices = devices;
    }

    /**
     * Converts this M5gBideviceDetailsresponse into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "M5gBideviceDetailsresponse [" + "hasMoreData=" + hasMoreData + ", devices="
                + devices + "]";
    }

    /**
     * Builds a new {@link M5gBideviceDetailsresponse.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link M5gBideviceDetailsresponse.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .hasMoreData(getHasMoreData())
                .devices(getDevices());
        return builder;
    }

    /**
     * Class to build instances of {@link M5gBideviceDetailsresponse}.
     */
    public static class Builder {
        private Boolean hasMoreData;
        private List<M5gBiaccountNameobject> devices;



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
         * Setter for devices.
         * @param  devices  List of M5gBiaccountNameobject value for devices.
         * @return Builder
         */
        public Builder devices(List<M5gBiaccountNameobject> devices) {
            this.devices = devices;
            return this;
        }

        /**
         * Builds a new {@link M5gBideviceDetailsresponse} object using the set fields.
         * @return {@link M5gBideviceDetailsresponse}
         */
        public M5gBideviceDetailsresponse build() {
            return new M5gBideviceDetailsresponse(hasMoreData, devices);
        }
    }
}
