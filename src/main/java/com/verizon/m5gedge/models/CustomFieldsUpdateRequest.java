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
 * This is a model class for CustomFieldsUpdateRequest type.
 */
public class CustomFieldsUpdateRequest {
    private String accountName;
    private List<CustomFields> customFields;
    private List<CustomFields> customFieldsToUpdate;
    private List<AccountDeviceList> devices;
    private String groupName;
    private String servicePlan;

    /**
     * Default constructor.
     */
    public CustomFieldsUpdateRequest() {
    }

    /**
     * Initialization constructor.
     * @param  accountName  String value for accountName.
     * @param  customFields  List of CustomFields value for customFields.
     * @param  customFieldsToUpdate  List of CustomFields value for customFieldsToUpdate.
     * @param  devices  List of AccountDeviceList value for devices.
     * @param  groupName  String value for groupName.
     * @param  servicePlan  String value for servicePlan.
     */
    public CustomFieldsUpdateRequest(
            String accountName,
            List<CustomFields> customFields,
            List<CustomFields> customFieldsToUpdate,
            List<AccountDeviceList> devices,
            String groupName,
            String servicePlan) {
        this.accountName = accountName;
        this.customFields = customFields;
        this.customFieldsToUpdate = customFieldsToUpdate;
        this.devices = devices;
        this.groupName = groupName;
        this.servicePlan = servicePlan;
    }

    /**
     * Getter for AccountName.
     * The name of a billing account.This parameter is only required if the UWS account used for the
     * current API session has access to multiple billing accounts.An account name is usually
     * numeric, and must include any leading zeros.
     * @return Returns the String
     */
    @JsonGetter("accountName")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getAccountName() {
        return accountName;
    }

    /**
     * Setter for AccountName.
     * The name of a billing account.This parameter is only required if the UWS account used for the
     * current API session has access to multiple billing accounts.An account name is usually
     * numeric, and must include any leading zeros.
     * @param accountName Value for String
     */
    @JsonSetter("accountName")
    public void setAccountName(String accountName) {
        this.accountName = accountName;
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
     * Getter for CustomFieldsToUpdate.
     * The names and new values of any custom fields that you want to change.
     * @return Returns the List of CustomFields
     */
    @JsonGetter("customFieldsToUpdate")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<CustomFields> getCustomFieldsToUpdate() {
        return customFieldsToUpdate;
    }

    /**
     * Setter for CustomFieldsToUpdate.
     * The names and new values of any custom fields that you want to change.
     * @param customFieldsToUpdate Value for List of CustomFields
     */
    @JsonSetter("customFieldsToUpdate")
    public void setCustomFieldsToUpdate(List<CustomFields> customFieldsToUpdate) {
        this.customFieldsToUpdate = customFieldsToUpdate;
    }

    /**
     * Getter for Devices.
     * The devices that you want to change.
     * @return Returns the List of AccountDeviceList
     */
    @JsonGetter("devices")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<AccountDeviceList> getDevices() {
        return devices;
    }

    /**
     * Setter for Devices.
     * The devices that you want to change.
     * @param devices Value for List of AccountDeviceList
     */
    @JsonSetter("devices")
    public void setDevices(List<AccountDeviceList> devices) {
        this.devices = devices;
    }

    /**
     * Getter for GroupName.
     * The name of a device group, if you want to only include devices in that group.
     * @return Returns the String
     */
    @JsonGetter("groupName")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getGroupName() {
        return groupName;
    }

    /**
     * Setter for GroupName.
     * The name of a device group, if you want to only include devices in that group.
     * @param groupName Value for String
     */
    @JsonSetter("groupName")
    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    /**
     * Getter for ServicePlan.
     * The name of a service plan, if you want to only include devices that have that service plan.
     * @return Returns the String
     */
    @JsonGetter("servicePlan")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getServicePlan() {
        return servicePlan;
    }

    /**
     * Setter for ServicePlan.
     * The name of a service plan, if you want to only include devices that have that service plan.
     * @param servicePlan Value for String
     */
    @JsonSetter("servicePlan")
    public void setServicePlan(String servicePlan) {
        this.servicePlan = servicePlan;
    }

    /**
     * Converts this CustomFieldsUpdateRequest into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "CustomFieldsUpdateRequest [" + "accountName=" + accountName + ", customFields="
                + customFields + ", customFieldsToUpdate=" + customFieldsToUpdate + ", devices="
                + devices + ", groupName=" + groupName + ", servicePlan=" + servicePlan + "]";
    }

    /**
     * Builds a new {@link CustomFieldsUpdateRequest.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link CustomFieldsUpdateRequest.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .accountName(getAccountName())
                .customFields(getCustomFields())
                .customFieldsToUpdate(getCustomFieldsToUpdate())
                .devices(getDevices())
                .groupName(getGroupName())
                .servicePlan(getServicePlan());
        return builder;
    }

    /**
     * Class to build instances of {@link CustomFieldsUpdateRequest}.
     */
    public static class Builder {
        private String accountName;
        private List<CustomFields> customFields;
        private List<CustomFields> customFieldsToUpdate;
        private List<AccountDeviceList> devices;
        private String groupName;
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
         * Setter for customFields.
         * @param  customFields  List of CustomFields value for customFields.
         * @return Builder
         */
        public Builder customFields(List<CustomFields> customFields) {
            this.customFields = customFields;
            return this;
        }

        /**
         * Setter for customFieldsToUpdate.
         * @param  customFieldsToUpdate  List of CustomFields value for customFieldsToUpdate.
         * @return Builder
         */
        public Builder customFieldsToUpdate(List<CustomFields> customFieldsToUpdate) {
            this.customFieldsToUpdate = customFieldsToUpdate;
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
         * Setter for servicePlan.
         * @param  servicePlan  String value for servicePlan.
         * @return Builder
         */
        public Builder servicePlan(String servicePlan) {
            this.servicePlan = servicePlan;
            return this;
        }

        /**
         * Builds a new {@link CustomFieldsUpdateRequest} object using the set fields.
         * @return {@link CustomFieldsUpdateRequest}
         */
        public CustomFieldsUpdateRequest build() {
            return new CustomFieldsUpdateRequest(accountName, customFields, customFieldsToUpdate,
                    devices, groupName, servicePlan);
        }
    }
}