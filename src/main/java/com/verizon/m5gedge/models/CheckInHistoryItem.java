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
import java.time.LocalDateTime;

/**
 * This is a model class for CheckInHistoryItem type.
 */
public class CheckInHistoryItem {
    private String deviceId;
    private String clientType;
    private String result;
    private String failureType;
    private LocalDateTime timeCompleted;

    /**
     * Default constructor.
     */
    public CheckInHistoryItem() {
    }

    /**
     * Initialization constructor.
     * @param  deviceId  String value for deviceId.
     * @param  clientType  String value for clientType.
     * @param  result  String value for result.
     * @param  failureType  String value for failureType.
     * @param  timeCompleted  LocalDateTime value for timeCompleted.
     */
    public CheckInHistoryItem(
            String deviceId,
            String clientType,
            String result,
            String failureType,
            LocalDateTime timeCompleted) {
        this.deviceId = deviceId;
        this.clientType = clientType;
        this.result = result;
        this.failureType = failureType;
        this.timeCompleted = timeCompleted;
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
     * Getter for ClientType.
     * Type of client.
     * @return Returns the String
     */
    @JsonGetter("clientType")
    public String getClientType() {
        return clientType;
    }

    /**
     * Setter for ClientType.
     * Type of client.
     * @param clientType Value for String
     */
    @JsonSetter("clientType")
    public void setClientType(String clientType) {
        this.clientType = clientType;
    }

    /**
     * Getter for Result.
     * @return Returns the String
     */
    @JsonGetter("result")
    public String getResult() {
        return result;
    }

    /**
     * Setter for Result.
     * @param result Value for String
     */
    @JsonSetter("result")
    public void setResult(String result) {
        this.result = result;
    }

    /**
     * Getter for FailureType.
     * @return Returns the String
     */
    @JsonGetter("failureType")
    public String getFailureType() {
        return failureType;
    }

    /**
     * Setter for FailureType.
     * @param failureType Value for String
     */
    @JsonSetter("failureType")
    public void setFailureType(String failureType) {
        this.failureType = failureType;
    }

    /**
     * Getter for TimeCompleted.
     * @return Returns the LocalDateTime
     */
    @JsonGetter("timeCompleted")
    @JsonSerialize(using = DateTimeHelper.Rfc8601DateTimeSerializer.class)
    public LocalDateTime getTimeCompleted() {
        return timeCompleted;
    }

    /**
     * Setter for TimeCompleted.
     * @param timeCompleted Value for LocalDateTime
     */
    @JsonSetter("timeCompleted")
    @JsonDeserialize(using = DateTimeHelper.Rfc8601DateTimeDeserializer.class)
    public void setTimeCompleted(LocalDateTime timeCompleted) {
        this.timeCompleted = timeCompleted;
    }

    /**
     * Converts this CheckInHistoryItem into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "CheckInHistoryItem [" + "deviceId=" + deviceId + ", clientType=" + clientType
                + ", result=" + result + ", failureType=" + failureType + ", timeCompleted="
                + timeCompleted + "]";
    }

    /**
     * Builds a new {@link CheckInHistoryItem.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link CheckInHistoryItem.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(deviceId, clientType, result, failureType, timeCompleted);
        return builder;
    }

    /**
     * Class to build instances of {@link CheckInHistoryItem}.
     */
    public static class Builder {
        private String deviceId;
        private String clientType;
        private String result;
        private String failureType;
        private LocalDateTime timeCompleted;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  deviceId  String value for deviceId.
         * @param  clientType  String value for clientType.
         * @param  result  String value for result.
         * @param  failureType  String value for failureType.
         * @param  timeCompleted  LocalDateTime value for timeCompleted.
         */
        public Builder(String deviceId, String clientType, String result, String failureType,
                LocalDateTime timeCompleted) {
            this.deviceId = deviceId;
            this.clientType = clientType;
            this.result = result;
            this.failureType = failureType;
            this.timeCompleted = timeCompleted;
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
         * Setter for clientType.
         * @param  clientType  String value for clientType.
         * @return Builder
         */
        public Builder clientType(String clientType) {
            this.clientType = clientType;
            return this;
        }

        /**
         * Setter for result.
         * @param  result  String value for result.
         * @return Builder
         */
        public Builder result(String result) {
            this.result = result;
            return this;
        }

        /**
         * Setter for failureType.
         * @param  failureType  String value for failureType.
         * @return Builder
         */
        public Builder failureType(String failureType) {
            this.failureType = failureType;
            return this;
        }

        /**
         * Setter for timeCompleted.
         * @param  timeCompleted  LocalDateTime value for timeCompleted.
         * @return Builder
         */
        public Builder timeCompleted(LocalDateTime timeCompleted) {
            this.timeCompleted = timeCompleted;
            return this;
        }

        /**
         * Builds a new {@link CheckInHistoryItem} object using the set fields.
         * @return {@link CheckInHistoryItem}
         */
        public CheckInHistoryItem build() {
            return new CheckInHistoryItem(deviceId, clientType, result, failureType, timeCompleted);
        }
    }
}
