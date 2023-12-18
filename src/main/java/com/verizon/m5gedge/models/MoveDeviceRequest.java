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
 * This is a model class for MoveDeviceRequest type.
 */
public class MoveDeviceRequest {
    private String accountName;
    private DeviceFilter filter;
    private List<CustomFields> customFields;
    private List<AccountDeviceList> devices;
    private String groupName;
    private String carrierIpPoolName;
    private String servicePlan;

    /**
     * Default constructor.
     */
    public MoveDeviceRequest() {
    }

    /**
     * Initialization constructor.
     * @param  accountName  String value for accountName.
     * @param  filter  DeviceFilter value for filter.
     * @param  customFields  List of CustomFields value for customFields.
     * @param  devices  List of AccountDeviceList value for devices.
     * @param  groupName  String value for groupName.
     * @param  carrierIpPoolName  String value for carrierIpPoolName.
     * @param  servicePlan  String value for servicePlan.
     */
    public MoveDeviceRequest(
            String accountName,
            DeviceFilter filter,
            List<CustomFields> customFields,
            List<AccountDeviceList> devices,
            String groupName,
            String carrierIpPoolName,
            String servicePlan) {
        this.accountName = accountName;
        this.filter = filter;
        this.customFields = customFields;
        this.devices = devices;
        this.groupName = groupName;
        this.carrierIpPoolName = carrierIpPoolName;
        this.servicePlan = servicePlan;
    }

    /**
     * Getter for AccountName.
     * The name of the billing account that you want to move the devices to.
     * @return Returns the String
     */
    @JsonGetter("accountName")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getAccountName() {
        return accountName;
    }

    /**
     * Setter for AccountName.
     * The name of the billing account that you want to move the devices to.
     * @param accountName Value for String
     */
    @JsonSetter("accountName")
    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    /**
     * Getter for Filter.
     * Specify the kind of the device identifier, the type of match, and the string that you want to
     * match.
     * @return Returns the DeviceFilter
     */
    @JsonGetter("filter")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public DeviceFilter getFilter() {
        return filter;
    }

    /**
     * Setter for Filter.
     * Specify the kind of the device identifier, the type of match, and the string that you want to
     * match.
     * @param filter Value for DeviceFilter
     */
    @JsonSetter("filter")
    public void setFilter(DeviceFilter filter) {
        this.filter = filter;
    }

    /**
     * Getter for CustomFields.
     * Custom field names and values, if you want to only include devices that have matching values.
     * @return Returns the List of CustomFields
     */
    @JsonGetter("customFields")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<CustomFields> getCustomFields() {
        return customFields;
    }

    /**
     * Setter for CustomFields.
     * Custom field names and values, if you want to only include devices that have matching values.
     * @param customFields Value for List of CustomFields
     */
    @JsonSetter("customFields")
    public void setCustomFields(List<CustomFields> customFields) {
        this.customFields = customFields;
    }

    /**
     * Getter for Devices.
     * Up to 10,000 devices that you want to move to a different account, specified by device
     * identifier.
     * @return Returns the List of AccountDeviceList
     */
    @JsonGetter("devices")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<AccountDeviceList> getDevices() {
        return devices;
    }

    /**
     * Setter for Devices.
     * Up to 10,000 devices that you want to move to a different account, specified by device
     * identifier.
     * @param devices Value for List of AccountDeviceList
     */
    @JsonSetter("devices")
    public void setDevices(List<AccountDeviceList> devices) {
        this.devices = devices;
    }

    /**
     * Getter for GroupName.
     * The name of a device group, to only include devices in that group.
     * @return Returns the String
     */
    @JsonGetter("groupName")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getGroupName() {
        return groupName;
    }

    /**
     * Setter for GroupName.
     * The name of a device group, to only include devices in that group.
     * @param groupName Value for String
     */
    @JsonSetter("groupName")
    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    /**
     * Getter for CarrierIpPoolName.
     * The pool from which device IP addresses will be derived in the new account. If you do not
     * include this element, the default pool will be used.
     * @return Returns the String
     */
    @JsonGetter("carrierIpPoolName")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getCarrierIpPoolName() {
        return carrierIpPoolName;
    }

    /**
     * Setter for CarrierIpPoolName.
     * The pool from which device IP addresses will be derived in the new account. If you do not
     * include this element, the default pool will be used.
     * @param carrierIpPoolName Value for String
     */
    @JsonSetter("carrierIpPoolName")
    public void setCarrierIpPoolName(String carrierIpPoolName) {
        this.carrierIpPoolName = carrierIpPoolName;
    }

    /**
     * Getter for ServicePlan.
     * The service plan code that you want to assign to the devices in the new account. If you do
     * not include this element, ThingSpace will attempt to use the current service plan, which will
     * result in a error if the new account does not have that service plan.
     * @return Returns the String
     */
    @JsonGetter("servicePlan")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getServicePlan() {
        return servicePlan;
    }

    /**
     * Setter for ServicePlan.
     * The service plan code that you want to assign to the devices in the new account. If you do
     * not include this element, ThingSpace will attempt to use the current service plan, which will
     * result in a error if the new account does not have that service plan.
     * @param servicePlan Value for String
     */
    @JsonSetter("servicePlan")
    public void setServicePlan(String servicePlan) {
        this.servicePlan = servicePlan;
    }

    /**
     * Converts this MoveDeviceRequest into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "MoveDeviceRequest [" + "accountName=" + accountName + ", filter=" + filter
                + ", customFields=" + customFields + ", devices=" + devices + ", groupName="
                + groupName + ", carrierIpPoolName=" + carrierIpPoolName + ", servicePlan="
                + servicePlan + "]";
    }

    /**
     * Builds a new {@link MoveDeviceRequest.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link MoveDeviceRequest.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .accountName(getAccountName())
                .filter(getFilter())
                .customFields(getCustomFields())
                .devices(getDevices())
                .groupName(getGroupName())
                .carrierIpPoolName(getCarrierIpPoolName())
                .servicePlan(getServicePlan());
        return builder;
    }

    /**
     * Class to build instances of {@link MoveDeviceRequest}.
     */
    public static class Builder {
        private String accountName;
        private DeviceFilter filter;
        private List<CustomFields> customFields;
        private List<AccountDeviceList> devices;
        private String groupName;
        private String carrierIpPoolName;
        private String servicePlan;



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
         * Setter for filter.
         * @param  filter  DeviceFilter value for filter.
         * @return Builder
         */
        public Builder filter(DeviceFilter filter) {
            this.filter = filter;
            return this;
        }

        /**
         * Setter for customFields.
         * @param  customFields  List of CustomFields value for customFields.
         * @return Builder
         */
        public Builder customFields(List<CustomFields> customFields) {
            this.customFields = customFields;
            return this;
        }

        /**
         * Setter for devices.
         * @param  devices  List of AccountDeviceList value for devices.
         * @return Builder
         */
        public Builder devices(List<AccountDeviceList> devices) {
            this.devices = devices;
            return this;
        }

        /**
         * Setter for groupName.
         * @param  groupName  String value for groupName.
         * @return Builder
         */
        public Builder groupName(String groupName) {
            this.groupName = groupName;
            return this;
        }

        /**
         * Setter for carrierIpPoolName.
         * @param  carrierIpPoolName  String value for carrierIpPoolName.
         * @return Builder
         */
        public Builder carrierIpPoolName(String carrierIpPoolName) {
            this.carrierIpPoolName = carrierIpPoolName;
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
         * Builds a new {@link MoveDeviceRequest} object using the set fields.
         * @return {@link MoveDeviceRequest}
         */
        public MoveDeviceRequest build() {
            return new MoveDeviceRequest(accountName, filter, customFields, devices, groupName,
                    carrierIpPoolName, servicePlan);
        }
    }
}
