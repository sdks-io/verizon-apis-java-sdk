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
 * This is a model class for CreateDeviceGroupRequest type.
 */
public class CreateDeviceGroupRequest {
    private String accountName;
    private String groupDescription;
    private String groupName;
    private List<DeviceId> devicesToAdd;

    /**
     * Default constructor.
     */
    public CreateDeviceGroupRequest() {
    }

    /**
     * Initialization constructor.
     * @param  accountName  String value for accountName.
     * @param  groupDescription  String value for groupDescription.
     * @param  groupName  String value for groupName.
     * @param  devicesToAdd  List of DeviceId value for devicesToAdd.
     */
    public CreateDeviceGroupRequest(
            String accountName,
            String groupDescription,
            String groupName,
            List<DeviceId> devicesToAdd) {
        this.accountName = accountName;
        this.groupDescription = groupDescription;
        this.groupName = groupName;
        this.devicesToAdd = devicesToAdd;
    }

    /**
     * Getter for AccountName.
     * The Verizon billing account that the device group will belong to. An account name is usually
     * numeric, and must include any leading zeros.
     * @return Returns the String
     */
    @JsonGetter("accountName")
    public String getAccountName() {
        return accountName;
    }

    /**
     * Setter for AccountName.
     * The Verizon billing account that the device group will belong to. An account name is usually
     * numeric, and must include any leading zeros.
     * @param accountName Value for String
     */
    @JsonSetter("accountName")
    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    /**
     * Getter for GroupDescription.
     * A description for the device group.
     * @return Returns the String
     */
    @JsonGetter("groupDescription")
    public String getGroupDescription() {
        return groupDescription;
    }

    /**
     * Setter for GroupDescription.
     * A description for the device group.
     * @param groupDescription Value for String
     */
    @JsonSetter("groupDescription")
    public void setGroupDescription(String groupDescription) {
        this.groupDescription = groupDescription;
    }

    /**
     * Getter for GroupName.
     * The name for the new device group. This name must be unique within the specified account.
     * @return Returns the String
     */
    @JsonGetter("groupName")
    public String getGroupName() {
        return groupName;
    }

    /**
     * Setter for GroupName.
     * The name for the new device group. This name must be unique within the specified account.
     * @param groupName Value for String
     */
    @JsonSetter("groupName")
    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    /**
     * Getter for DevicesToAdd.
     * Zero or more devices to add to the device group. You can use POST /devices/actions/list to
     * get a list of all devices in the account.
     * @return Returns the List of DeviceId
     */
    @JsonGetter("devicesToAdd")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<DeviceId> getDevicesToAdd() {
        return devicesToAdd;
    }

    /**
     * Setter for DevicesToAdd.
     * Zero or more devices to add to the device group. You can use POST /devices/actions/list to
     * get a list of all devices in the account.
     * @param devicesToAdd Value for List of DeviceId
     */
    @JsonSetter("devicesToAdd")
    public void setDevicesToAdd(List<DeviceId> devicesToAdd) {
        this.devicesToAdd = devicesToAdd;
    }

    /**
     * Converts this CreateDeviceGroupRequest into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "CreateDeviceGroupRequest [" + "accountName=" + accountName + ", groupDescription="
                + groupDescription + ", groupName=" + groupName + ", devicesToAdd=" + devicesToAdd
                + "]";
    }

    /**
     * Builds a new {@link CreateDeviceGroupRequest.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link CreateDeviceGroupRequest.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(accountName, groupDescription, groupName)
                .devicesToAdd(getDevicesToAdd());
        return builder;
    }

    /**
     * Class to build instances of {@link CreateDeviceGroupRequest}.
     */
    public static class Builder {
        private String accountName;
        private String groupDescription;
        private String groupName;
        private List<DeviceId> devicesToAdd;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  accountName  String value for accountName.
         * @param  groupDescription  String value for groupDescription.
         * @param  groupName  String value for groupName.
         */
        public Builder(String accountName, String groupDescription, String groupName) {
            this.accountName = accountName;
            this.groupDescription = groupDescription;
            this.groupName = groupName;
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
         * Setter for groupDescription.
         * @param  groupDescription  String value for groupDescription.
         * @return Builder
         */
        public Builder groupDescription(String groupDescription) {
            this.groupDescription = groupDescription;
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
         * Setter for devicesToAdd.
         * @param  devicesToAdd  List of DeviceId value for devicesToAdd.
         * @return Builder
         */
        public Builder devicesToAdd(List<DeviceId> devicesToAdd) {
            this.devicesToAdd = devicesToAdd;
            return this;
        }

        /**
         * Builds a new {@link CreateDeviceGroupRequest} object using the set fields.
         * @return {@link CreateDeviceGroupRequest}
         */
        public CreateDeviceGroupRequest build() {
            return new CreateDeviceGroupRequest(accountName, groupDescription, groupName,
                    devicesToAdd);
        }
    }
}
