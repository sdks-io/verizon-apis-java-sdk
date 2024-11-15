/*
 * VerizonLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.verizon.m5gedge.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * This is a model class for HistorySearchFilter type.
 */
public class HistorySearchFilter {
    private String accountName;
    private Device device;
    private HistorySearchFilterAttributes attributes;

    /**
     * Default constructor.
     */
    public HistorySearchFilter() {
    }

    /**
     * Initialization constructor.
     * @param  accountName  String value for accountName.
     * @param  device  Device value for device.
     * @param  attributes  HistorySearchFilterAttributes value for attributes.
     */
    public HistorySearchFilter(
            String accountName,
            Device device,
            HistorySearchFilterAttributes attributes) {
        this.accountName = accountName;
        this.device = device;
        this.attributes = attributes;
    }

    /**
     * Getter for AccountName.
     * Account name identifier.
     * @return Returns the String
     */
    @JsonGetter("accountName")
    public String getAccountName() {
        return accountName;
    }

    /**
     * Setter for AccountName.
     * Account name identifier.
     * @param accountName Value for String
     */
    @JsonSetter("accountName")
    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    /**
     * Getter for Device.
     * Identifies a particular IoT device.
     * @return Returns the Device
     */
    @JsonGetter("device")
    public Device getDevice() {
        return device;
    }

    /**
     * Setter for Device.
     * Identifies a particular IoT device.
     * @param device Value for Device
     */
    @JsonSetter("device")
    public void setDevice(Device device) {
        this.device = device;
    }

    /**
     * Getter for Attributes.
     * Streaming RF parameters for which you want to retrieve history data.
     * @return Returns the HistorySearchFilterAttributes
     */
    @JsonGetter("attributes")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public HistorySearchFilterAttributes getAttributes() {
        return attributes;
    }

    /**
     * Setter for Attributes.
     * Streaming RF parameters for which you want to retrieve history data.
     * @param attributes Value for HistorySearchFilterAttributes
     */
    @JsonSetter("attributes")
    public void setAttributes(HistorySearchFilterAttributes attributes) {
        this.attributes = attributes;
    }

    /**
     * Converts this HistorySearchFilter into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "HistorySearchFilter [" + "accountName=" + accountName + ", device=" + device
                + ", attributes=" + attributes + "]";
    }

    /**
     * Builds a new {@link HistorySearchFilter.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link HistorySearchFilter.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(accountName, device)
                .attributes(getAttributes());
        return builder;
    }

    /**
     * Class to build instances of {@link HistorySearchFilter}.
     */
    public static class Builder {
        private String accountName;
        private Device device;
        private HistorySearchFilterAttributes attributes;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  accountName  String value for accountName.
         * @param  device  Device value for device.
         */
        public Builder(String accountName, Device device) {
            this.accountName = accountName;
            this.device = device;
        }

        /**
         * Setter for accountName.
         * @param  accountName  String value for accountName.
         * @return Builder
         */
        public Builder accountName(String accountName) {
            this.accountName = accountName;
            return this;
        }

        /**
         * Setter for device.
         * @param  device  Device value for device.
         * @return Builder
         */
        public Builder device(Device device) {
            this.device = device;
            return this;
        }

        /**
         * Setter for attributes.
         * @param  attributes  HistorySearchFilterAttributes value for attributes.
         * @return Builder
         */
        public Builder attributes(HistorySearchFilterAttributes attributes) {
            this.attributes = attributes;
            return this;
        }

        /**
         * Builds a new {@link HistorySearchFilter} object using the set fields.
         * @return {@link HistorySearchFilter}
         */
        public HistorySearchFilter build() {
            return new HistorySearchFilter(accountName, device, attributes);
        }
    }
}
