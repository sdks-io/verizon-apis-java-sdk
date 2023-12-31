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
 * This is a model class for V3LicenseDevice type.
 */
public class V3LicenseDevice {
    private String deviceId;
    private String assignmentTime;

    /**
     * Default constructor.
     */
    public V3LicenseDevice() {
    }

    /**
     * Initialization constructor.
     * @param  deviceId  String value for deviceId.
     * @param  assignmentTime  String value for assignmentTime.
     */
    public V3LicenseDevice(
            String deviceId,
            String assignmentTime) {
        this.deviceId = deviceId;
        this.assignmentTime = assignmentTime;
    }

    /**
     * Getter for DeviceId.
     * Device IMEI.
     * @return Returns the String
     */
    @JsonGetter("deviceId")
    public String getDeviceId() {
        return deviceId;
    }

    /**
     * Setter for DeviceId.
     * Device IMEI.
     * @param deviceId Value for String
     */
    @JsonSetter("deviceId")
    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    /**
     * Getter for AssignmentTime.
     * License assignment time.
     * @return Returns the String
     */
    @JsonGetter("assignmentTime")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getAssignmentTime() {
        return assignmentTime;
    }

    /**
     * Setter for AssignmentTime.
     * License assignment time.
     * @param assignmentTime Value for String
     */
    @JsonSetter("assignmentTime")
    public void setAssignmentTime(String assignmentTime) {
        this.assignmentTime = assignmentTime;
    }

    /**
     * Converts this V3LicenseDevice into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "V3LicenseDevice [" + "deviceId=" + deviceId + ", assignmentTime=" + assignmentTime
                + "]";
    }

    /**
     * Builds a new {@link V3LicenseDevice.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link V3LicenseDevice.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(deviceId)
                .assignmentTime(getAssignmentTime());
        return builder;
    }

    /**
     * Class to build instances of {@link V3LicenseDevice}.
     */
    public static class Builder {
        private String deviceId;
        private String assignmentTime;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  deviceId  String value for deviceId.
         */
        public Builder(String deviceId) {
            this.deviceId = deviceId;
        }

        /**
         * Setter for deviceId.
         * @param  deviceId  String value for deviceId.
         * @return Builder
         */
        public Builder deviceId(String deviceId) {
            this.deviceId = deviceId;
            return this;
        }

        /**
         * Setter for assignmentTime.
         * @param  assignmentTime  String value for assignmentTime.
         * @return Builder
         */
        public Builder assignmentTime(String assignmentTime) {
            this.assignmentTime = assignmentTime;
            return this;
        }

        /**
         * Builds a new {@link V3LicenseDevice} object using the set fields.
         * @return {@link V3LicenseDevice}
         */
        public V3LicenseDevice build() {
            return new V3LicenseDevice(deviceId, assignmentTime);
        }
    }
}
