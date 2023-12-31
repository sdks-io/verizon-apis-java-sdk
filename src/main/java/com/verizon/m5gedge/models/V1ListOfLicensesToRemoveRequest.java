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
 * This is a model class for V1ListOfLicensesToRemoveRequest type.
 */
public class V1ListOfLicensesToRemoveRequest {
    private String type;
    private List<String> deviceList;

    /**
     * Default constructor.
     */
    public V1ListOfLicensesToRemoveRequest() {
    }

    /**
     * Initialization constructor.
     * @param  deviceList  List of String value for deviceList.
     * @param  type  String value for type.
     */
    public V1ListOfLicensesToRemoveRequest(
            List<String> deviceList,
            String type) {
        this.type = type;
        this.deviceList = deviceList;
    }

    /**
     * Getter for Type.
     * Set to 'append' to append the devices in the current request to the existing list. If there
     * is no existing list then it will be created with only these devices. Leave this parameter out
     * when you want to replace the existing list with the devices in the current request.
     * @return Returns the String
     */
    @JsonGetter("type")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getType() {
        return type;
    }

    /**
     * Setter for Type.
     * Set to 'append' to append the devices in the current request to the existing list. If there
     * is no existing list then it will be created with only these devices. Leave this parameter out
     * when you want to replace the existing list with the devices in the current request.
     * @param type Value for String
     */
    @JsonSetter("type")
    public void setType(String type) {
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
     * Converts this V1ListOfLicensesToRemoveRequest into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "V1ListOfLicensesToRemoveRequest [" + "deviceList=" + deviceList + ", type=" + type
                + "]";
    }

    /**
     * Builds a new {@link V1ListOfLicensesToRemoveRequest.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link V1ListOfLicensesToRemoveRequest.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(deviceList)
                .type(getType());
        return builder;
    }

    /**
     * Class to build instances of {@link V1ListOfLicensesToRemoveRequest}.
     */
    public static class Builder {
        private List<String> deviceList;
        private String type;

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
         * Setter for type.
         * @param  type  String value for type.
         * @return Builder
         */
        public Builder type(String type) {
            this.type = type;
            return this;
        }

        /**
         * Builds a new {@link V1ListOfLicensesToRemoveRequest} object using the set fields.
         * @return {@link V1ListOfLicensesToRemoveRequest}
         */
        public V1ListOfLicensesToRemoveRequest build() {
            return new V1ListOfLicensesToRemoveRequest(deviceList, type);
        }
    }
}
