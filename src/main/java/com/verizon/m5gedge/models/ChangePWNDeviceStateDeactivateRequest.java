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
 * This is a model class for ChangePWNDeviceStateDeactivateRequest type.
 */
public class ChangePWNDeviceStateDeactivateRequest {
    private String accountName;
    private List<PWNDeviceList> deviceList;

    /**
     * Default constructor.
     */
    public ChangePWNDeviceStateDeactivateRequest() {
    }

    /**
     * Initialization constructor.
     * @param  accountName  String value for accountName.
     * @param  deviceList  List of PWNDeviceList value for deviceList.
     */
    public ChangePWNDeviceStateDeactivateRequest(
            String accountName,
            List<PWNDeviceList> deviceList) {
        this.accountName = accountName;
        this.deviceList = deviceList;
    }

    /**
     * Getter for AccountName.
     * @return Returns the String
     */
    @JsonGetter("accountName")
    public String getAccountName() {
        return accountName;
    }

    /**
     * Setter for AccountName.
     * @param accountName Value for String
     */
    @JsonSetter("accountName")
    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    /**
     * Getter for DeviceList.
     * @return Returns the List of PWNDeviceList
     */
    @JsonGetter("deviceList")
    public List<PWNDeviceList> getDeviceList() {
        return deviceList;
    }

    /**
     * Setter for DeviceList.
     * @param deviceList Value for List of PWNDeviceList
     */
    @JsonSetter("deviceList")
    public void setDeviceList(List<PWNDeviceList> deviceList) {
        this.deviceList = deviceList;
    }

    /**
     * Converts this ChangePWNDeviceStateDeactivateRequest into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "ChangePWNDeviceStateDeactivateRequest [" + "accountName=" + accountName
                + ", deviceList=" + deviceList + "]";
    }

    /**
     * Builds a new {@link ChangePWNDeviceStateDeactivateRequest.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link ChangePWNDeviceStateDeactivateRequest.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(accountName, deviceList);
        return builder;
    }

    /**
     * Class to build instances of {@link ChangePWNDeviceStateDeactivateRequest}.
     */
    public static class Builder {
        private String accountName;
        private List<PWNDeviceList> deviceList;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  accountName  String value for accountName.
         * @param  deviceList  List of PWNDeviceList value for deviceList.
         */
        public Builder(String accountName, List<PWNDeviceList> deviceList) {
            this.accountName = accountName;
            this.deviceList = deviceList;
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
         * Setter for deviceList.
         * @param  deviceList  List of PWNDeviceList value for deviceList.
         * @return Builder
         */
        public Builder deviceList(List<PWNDeviceList> deviceList) {
            this.deviceList = deviceList;
            return this;
        }

        /**
         * Builds a new {@link ChangePWNDeviceStateDeactivateRequest} object using the set fields.
         * @return {@link ChangePWNDeviceStateDeactivateRequest}
         */
        public ChangePWNDeviceStateDeactivateRequest build() {
            return new ChangePWNDeviceStateDeactivateRequest(accountName, deviceList);
        }
    }
}
