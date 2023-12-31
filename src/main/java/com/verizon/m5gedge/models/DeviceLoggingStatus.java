/*
 * VerizonLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.verizon.m5gedge.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.verizon.m5gedge.DateTimeHelper;
import java.time.LocalDate;

/**
 * This is a model class for DeviceLoggingStatus type.
 */
public class DeviceLoggingStatus {
    private String deviceId;
    private LocalDate expiryDate;

    /**
     * Default constructor.
     */
    public DeviceLoggingStatus() {
    }

    /**
     * Initialization constructor.
     * @param  deviceId  String value for deviceId.
     * @param  expiryDate  LocalDate value for expiryDate.
     */
    public DeviceLoggingStatus(
            String deviceId,
            LocalDate expiryDate) {
        this.deviceId = deviceId;
        this.expiryDate = expiryDate;
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
     * Getter for ExpiryDate.
     * The date when device logging expires.
     * @return Returns the LocalDate
     */
    @JsonGetter("expiryDate")
    @JsonSerialize(using = DateTimeHelper.SimpleDateSerializer.class)
    public LocalDate getExpiryDate() {
        return expiryDate;
    }

    /**
     * Setter for ExpiryDate.
     * The date when device logging expires.
     * @param expiryDate Value for LocalDate
     */
    @JsonSetter("expiryDate")
    @JsonDeserialize(using = DateTimeHelper.SimpleDateDeserializer.class)
    public void setExpiryDate(LocalDate expiryDate) {
        this.expiryDate = expiryDate;
    }

    /**
     * Converts this DeviceLoggingStatus into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "DeviceLoggingStatus [" + "deviceId=" + deviceId + ", expiryDate=" + expiryDate
                + "]";
    }

    /**
     * Builds a new {@link DeviceLoggingStatus.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link DeviceLoggingStatus.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(deviceId, expiryDate);
        return builder;
    }

    /**
     * Class to build instances of {@link DeviceLoggingStatus}.
     */
    public static class Builder {
        private String deviceId;
        private LocalDate expiryDate;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  deviceId  String value for deviceId.
         * @param  expiryDate  LocalDate value for expiryDate.
         */
        public Builder(String deviceId, LocalDate expiryDate) {
            this.deviceId = deviceId;
            this.expiryDate = expiryDate;
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
         * Setter for expiryDate.
         * @param  expiryDate  LocalDate value for expiryDate.
         * @return Builder
         */
        public Builder expiryDate(LocalDate expiryDate) {
            this.expiryDate = expiryDate;
            return this;
        }

        /**
         * Builds a new {@link DeviceLoggingStatus} object using the set fields.
         * @return {@link DeviceLoggingStatus}
         */
        public DeviceLoggingStatus build() {
            return new DeviceLoggingStatus(deviceId, expiryDate);
        }
    }
}
