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
 * This is a model class for V2LicenseIMEI type.
 */
public class V2LicenseIMEI {
    private String accountName;
    private List<String> deviceList;

    /**
     * Default constructor.
     */
    public V2LicenseIMEI() {
    }

    /**
     * Initialization constructor.
     * @param  deviceList  List of String value for deviceList.
     * @param  accountName  String value for accountName.
     */
    public V2LicenseIMEI(
            List<String> deviceList,
            String accountName) {
        this.accountName = accountName;
        this.deviceList = deviceList;
    }

    /**
     * Getter for AccountName.
     * Account name.
     * @return Returns the String
     */
    @JsonGetter("accountName")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getAccountName() {
        return accountName;
    }

    /**
     * Setter for AccountName.
     * Account name.
     * @param accountName Value for String
     */
    @JsonSetter("accountName")
    public void setAccountName(String accountName) {
        this.accountName = accountName;
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
     * Converts this V2LicenseIMEI into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "V2LicenseIMEI [" + "deviceList=" + deviceList + ", accountName=" + accountName
                + "]";
    }

    /**
     * Builds a new {@link V2LicenseIMEI.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link V2LicenseIMEI.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(deviceList)
                .accountName(getAccountName());
        return builder;
    }

    /**
     * Class to build instances of {@link V2LicenseIMEI}.
     */
    public static class Builder {
        private List<String> deviceList;
        private String accountName;

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
         * Setter for accountName.
         * @param  accountName  String value for accountName.
         * @return Builder
         */
        public Builder accountName(String accountName) {
            this.accountName = accountName;
            return this;
        }

        /**
         * Builds a new {@link V2LicenseIMEI} object using the set fields.
         * @return {@link V2LicenseIMEI}
         */
        public V2LicenseIMEI build() {
            return new V2LicenseIMEI(deviceList, accountName);
        }
    }
}
