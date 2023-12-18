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
 * This is a model class for AccountLabels type.
 */
public class AccountLabels {
    private List<DeviceList> devices;
    private List<DeviceLabels> label;

    /**
     * Default constructor.
     */
    public AccountLabels() {
    }

    /**
     * Initialization constructor.
     * @param  devices  List of DeviceList value for devices.
     * @param  label  List of DeviceLabels value for label.
     */
    public AccountLabels(
            List<DeviceList> devices,
            List<DeviceLabels> label) {
        this.devices = devices;
        this.label = label;
    }

    /**
     * Getter for Devices.
     * @return Returns the List of DeviceList
     */
    @JsonGetter("devices")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<DeviceList> getDevices() {
        return devices;
    }

    /**
     * Setter for Devices.
     * @param devices Value for List of DeviceList
     */
    @JsonSetter("devices")
    public void setDevices(List<DeviceList> devices) {
        this.devices = devices;
    }

    /**
     * Getter for Label.
     * @return Returns the List of DeviceLabels
     */
    @JsonGetter("label")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<DeviceLabels> getLabel() {
        return label;
    }

    /**
     * Setter for Label.
     * @param label Value for List of DeviceLabels
     */
    @JsonSetter("label")
    public void setLabel(List<DeviceLabels> label) {
        this.label = label;
    }

    /**
     * Converts this AccountLabels into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "AccountLabels [" + "devices=" + devices + ", label=" + label + "]";
    }

    /**
     * Builds a new {@link AccountLabels.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link AccountLabels.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .devices(getDevices())
                .label(getLabel());
        return builder;
    }

    /**
     * Class to build instances of {@link AccountLabels}.
     */
    public static class Builder {
        private List<DeviceList> devices;
        private List<DeviceLabels> label;



        /**
         * Setter for devices.
         * @param  devices  List of DeviceList value for devices.
         * @return Builder
         */
        public Builder devices(List<DeviceList> devices) {
            this.devices = devices;
            return this;
        }

        /**
         * Setter for label.
         * @param  label  List of DeviceLabels value for label.
         * @return Builder
         */
        public Builder label(List<DeviceLabels> label) {
            this.label = label;
            return this;
        }

        /**
         * Builds a new {@link AccountLabels} object using the set fields.
         * @return {@link AccountLabels}
         */
        public AccountLabels build() {
            return new AccountLabels(devices, label);
        }
    }
}
