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
 * This is a model class for ChangePWNDeviceStateActivateRequest type.
 */
public class ChangePWNDeviceStateActivateRequest {
    private String accountName;
    private List<PWNDeviceList> deviceList;
    private Activate activate;

    /**
     * Default constructor.
     */
    public ChangePWNDeviceStateActivateRequest() {
    }

    /**
     * Initialization constructor.
     * @param  accountName  String value for accountName.
     * @param  deviceList  List of PWNDeviceList value for deviceList.
     * @param  activate  Activate value for activate.
     */
    public ChangePWNDeviceStateActivateRequest(
            String accountName,
            List<PWNDeviceList> deviceList,
            Activate activate) {
        this.accountName = accountName;
        this.deviceList = deviceList;
        this.activate = activate;
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
     * Getter for Activate.
     * @return Returns the Activate
     */
    @JsonGetter("activate")
    public Activate getActivate() {
        return activate;
    }

    /**
     * Setter for Activate.
     * @param activate Value for Activate
     */
    @JsonSetter("activate")
    public void setActivate(Activate activate) {
        this.activate = activate;
    }

    /**
     * Converts this ChangePWNDeviceStateActivateRequest into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "ChangePWNDeviceStateActivateRequest [" + "accountName=" + accountName
                + ", deviceList=" + deviceList + ", activate=" + activate + "]";
    }

    /**
     * Builds a new {@link ChangePWNDeviceStateActivateRequest.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link ChangePWNDeviceStateActivateRequest.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(accountName, deviceList, activate);
        return builder;
    }

    /**
     * Class to build instances of {@link ChangePWNDeviceStateActivateRequest}.
     */
    public static class Builder {
        private String accountName;
        private List<PWNDeviceList> deviceList;
        private Activate activate;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  accountName  String value for accountName.
         * @param  deviceList  List of PWNDeviceList value for deviceList.
         * @param  activate  Activate value for activate.
         */
        public Builder(String accountName, List<PWNDeviceList> deviceList, Activate activate) {
            this.accountName = accountName;
            this.deviceList = deviceList;
            this.activate = activate;
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
         * Setter for activate.
         * @param  activate  Activate value for activate.
         * @return Builder
         */
        public Builder activate(Activate activate) {
            this.activate = activate;
            return this;
        }

        /**
         * Builds a new {@link ChangePWNDeviceStateActivateRequest} object using the set fields.
         * @return {@link ChangePWNDeviceStateActivateRequest}
         */
        public ChangePWNDeviceStateActivateRequest build() {
            return new ChangePWNDeviceStateActivateRequest(accountName, deviceList, activate);
        }
    }
}
