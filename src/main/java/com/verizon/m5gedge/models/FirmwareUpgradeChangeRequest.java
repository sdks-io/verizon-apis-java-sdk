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
 * This is a model class for FirmwareUpgradeChangeRequest type.
 */
public class FirmwareUpgradeChangeRequest {
    private FirmwareTypeListEnum type;
    private List<String> deviceList;

    /**
     * Default constructor.
     */
    public FirmwareUpgradeChangeRequest() {
    }

    /**
     * Initialization constructor.
     * @param  type  FirmwareTypeListEnum value for type.
     * @param  deviceList  List of String value for deviceList.
     */
    public FirmwareUpgradeChangeRequest(
            FirmwareTypeListEnum type,
            List<String> deviceList) {
        this.type = type;
        this.deviceList = deviceList;
    }

    /**
     * Getter for Type.
     * Possible values are `append` or `remove`
     * @return Returns the FirmwareTypeListEnum
     */
    @JsonGetter("type")
    public FirmwareTypeListEnum getType() {
        return type;
    }

    /**
     * Setter for Type.
     * Possible values are `append` or `remove`
     * @param type Value for FirmwareTypeListEnum
     */
    @JsonSetter("type")
    public void setType(FirmwareTypeListEnum type) {
        this.type = type;
    }

    /**
     * Getter for DeviceList.
     * The IMEIs of the devices.
     * @return Returns the List of String
     */
    @JsonGetter("deviceList")
    public List<String> getDeviceList() {
        return deviceList;
    }

    /**
     * Setter for DeviceList.
     * The IMEIs of the devices.
     * @param deviceList Value for List of String
     */
    @JsonSetter("deviceList")
    public void setDeviceList(List<String> deviceList) {
        this.deviceList = deviceList;
    }

    /**
     * Converts this FirmwareUpgradeChangeRequest into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "FirmwareUpgradeChangeRequest [" + "type=" + type + ", deviceList=" + deviceList
                + "]";
    }

    /**
     * Builds a new {@link FirmwareUpgradeChangeRequest.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link FirmwareUpgradeChangeRequest.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(type, deviceList);
        return builder;
    }

    /**
     * Class to build instances of {@link FirmwareUpgradeChangeRequest}.
     */
    public static class Builder {
        private FirmwareTypeListEnum type;
        private List<String> deviceList;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  type  FirmwareTypeListEnum value for type.
         * @param  deviceList  List of String value for deviceList.
         */
        public Builder(FirmwareTypeListEnum type, List<String> deviceList) {
            this.type = type;
            this.deviceList = deviceList;
        }

        /**
         * Setter for type.
         * @param  type  FirmwareTypeListEnum value for type.
         * @return Builder
         */
        public Builder type(FirmwareTypeListEnum type) {
            this.type = type;
            return this;
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
         * Builds a new {@link FirmwareUpgradeChangeRequest} object using the set fields.
         * @return {@link FirmwareUpgradeChangeRequest}
         */
        public FirmwareUpgradeChangeRequest build() {
            return new FirmwareUpgradeChangeRequest(type, deviceList);
        }
    }
}
