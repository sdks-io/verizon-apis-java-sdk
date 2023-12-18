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
 * This is a model class for ActivateDeviceProfileRequest type.
 */
public class ActivateDeviceProfileRequest {
    private List<DeviceList> devices;
    private String accountName;
    private String servicePlan;
    private String mdnZIpCode;

    /**
     * Default constructor.
     */
    public ActivateDeviceProfileRequest() {
    }

    /**
     * Initialization constructor.
     * @param  devices  List of DeviceList value for devices.
     * @param  accountName  String value for accountName.
     * @param  servicePlan  String value for servicePlan.
     * @param  mdnZIpCode  String value for mdnZIpCode.
     */
    public ActivateDeviceProfileRequest(
            List<DeviceList> devices,
            String accountName,
            String servicePlan,
            String mdnZIpCode) {
        this.devices = devices;
        this.accountName = accountName;
        this.servicePlan = servicePlan;
        this.mdnZIpCode = mdnZIpCode;
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
     * Getter for AccountName.
     * @return Returns the String
     */
    @JsonGetter("accountName")
    @JsonInclude(JsonInclude.Include.NON_NULL)
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
     * Getter for ServicePlan.
     * @return Returns the String
     */
    @JsonGetter("servicePlan")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getServicePlan() {
        return servicePlan;
    }

    /**
     * Setter for ServicePlan.
     * @param servicePlan Value for String
     */
    @JsonSetter("servicePlan")
    public void setServicePlan(String servicePlan) {
        this.servicePlan = servicePlan;
    }

    /**
     * Getter for MdnZIpCode.
     * @return Returns the String
     */
    @JsonGetter("mdnZipCode")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getMdnZIpCode() {
        return mdnZIpCode;
    }

    /**
     * Setter for MdnZIpCode.
     * @param mdnZIpCode Value for String
     */
    @JsonSetter("mdnZipCode")
    public void setMdnZIpCode(String mdnZIpCode) {
        this.mdnZIpCode = mdnZIpCode;
    }

    /**
     * Converts this ActivateDeviceProfileRequest into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "ActivateDeviceProfileRequest [" + "devices=" + devices + ", accountName="
                + accountName + ", servicePlan=" + servicePlan + ", mdnZIpCode=" + mdnZIpCode + "]";
    }

    /**
     * Builds a new {@link ActivateDeviceProfileRequest.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link ActivateDeviceProfileRequest.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .devices(getDevices())
                .accountName(getAccountName())
                .servicePlan(getServicePlan())
                .mdnZIpCode(getMdnZIpCode());
        return builder;
    }

    /**
     * Class to build instances of {@link ActivateDeviceProfileRequest}.
     */
    public static class Builder {
        private List<DeviceList> devices;
        private String accountName;
        private String servicePlan;
        private String mdnZIpCode;



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
         * Setter for accountName.
         * @param  accountName  String value for accountName.
         * @return Builder
         */
        public Builder accountName(String accountName) {
            this.accountName = accountName;
            return this;
        }

        /**
         * Setter for servicePlan.
         * @param  servicePlan  String value for servicePlan.
         * @return Builder
         */
        public Builder servicePlan(String servicePlan) {
            this.servicePlan = servicePlan;
            return this;
        }

        /**
         * Setter for mdnZIpCode.
         * @param  mdnZIpCode  String value for mdnZIpCode.
         * @return Builder
         */
        public Builder mdnZIpCode(String mdnZIpCode) {
            this.mdnZIpCode = mdnZIpCode;
            return this;
        }

        /**
         * Builds a new {@link ActivateDeviceProfileRequest} object using the set fields.
         * @return {@link ActivateDeviceProfileRequest}
         */
        public ActivateDeviceProfileRequest build() {
            return new ActivateDeviceProfileRequest(devices, accountName, servicePlan, mdnZIpCode);
        }
    }
}
