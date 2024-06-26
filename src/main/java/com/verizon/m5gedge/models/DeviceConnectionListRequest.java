/*
 * VerizonLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.verizon.m5gedge.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * This is a model class for DeviceConnectionListRequest type.
 */
public class DeviceConnectionListRequest {
    private DeviceId deviceId;
    private String earliest;
    private String latest;

    /**
     * Default constructor.
     */
    public DeviceConnectionListRequest() {
    }

    /**
     * Initialization constructor.
     * @param  deviceId  DeviceId value for deviceId.
     * @param  earliest  String value for earliest.
     * @param  latest  String value for latest.
     */
    public DeviceConnectionListRequest(
            DeviceId deviceId,
            String earliest,
            String latest) {
        this.deviceId = deviceId;
        this.earliest = earliest;
        this.latest = latest;
    }

    /**
     * Getter for DeviceId.
     * An identifier for a single device.
     * @return Returns the DeviceId
     */
    @JsonGetter("deviceId")
    public DeviceId getDeviceId() {
        return deviceId;
    }

    /**
     * Setter for DeviceId.
     * An identifier for a single device.
     * @param deviceId Value for DeviceId
     */
    @JsonSetter("deviceId")
    public void setDeviceId(DeviceId deviceId) {
        this.deviceId = deviceId;
    }

    /**
     * Getter for Earliest.
     * The earliest date and time for which you want connection events.
     * @return Returns the String
     */
    @JsonGetter("earliest")
    public String getEarliest() {
        return earliest;
    }

    /**
     * Setter for Earliest.
     * The earliest date and time for which you want connection events.
     * @param earliest Value for String
     */
    @JsonSetter("earliest")
    public void setEarliest(String earliest) {
        this.earliest = earliest;
    }

    /**
     * Getter for Latest.
     * The last date and time for which you want connection events.
     * @return Returns the String
     */
    @JsonGetter("latest")
    public String getLatest() {
        return latest;
    }

    /**
     * Setter for Latest.
     * The last date and time for which you want connection events.
     * @param latest Value for String
     */
    @JsonSetter("latest")
    public void setLatest(String latest) {
        this.latest = latest;
    }

    /**
     * Converts this DeviceConnectionListRequest into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "DeviceConnectionListRequest [" + "deviceId=" + deviceId + ", earliest=" + earliest
                + ", latest=" + latest + "]";
    }

    /**
     * Builds a new {@link DeviceConnectionListRequest.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link DeviceConnectionListRequest.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(deviceId, earliest, latest);
        return builder;
    }

    /**
     * Class to build instances of {@link DeviceConnectionListRequest}.
     */
    public static class Builder {
        private DeviceId deviceId;
        private String earliest;
        private String latest;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  deviceId  DeviceId value for deviceId.
         * @param  earliest  String value for earliest.
         * @param  latest  String value for latest.
         */
        public Builder(DeviceId deviceId, String earliest, String latest) {
            this.deviceId = deviceId;
            this.earliest = earliest;
            this.latest = latest;
        }

        /**
         * Setter for deviceId.
         * @param  deviceId  DeviceId value for deviceId.
         * @return Builder
         */
        public Builder deviceId(DeviceId deviceId) {
            this.deviceId = deviceId;
            return this;
        }

        /**
         * Setter for earliest.
         * @param  earliest  String value for earliest.
         * @return Builder
         */
        public Builder earliest(String earliest) {
            this.earliest = earliest;
            return this;
        }

        /**
         * Setter for latest.
         * @param  latest  String value for latest.
         * @return Builder
         */
        public Builder latest(String latest) {
            this.latest = latest;
            return this;
        }

        /**
         * Builds a new {@link DeviceConnectionListRequest} object using the set fields.
         * @return {@link DeviceConnectionListRequest}
         */
        public DeviceConnectionListRequest build() {
            return new DeviceConnectionListRequest(deviceId, earliest, latest);
        }
    }
}
