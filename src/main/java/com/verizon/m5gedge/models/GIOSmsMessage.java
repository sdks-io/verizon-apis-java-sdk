/*
 * VerizonLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.verizon.m5gedge.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.verizon.m5gedge.DateTimeHelper;
import java.time.LocalDateTime;
import java.util.List;

/**
 * This is a model class for GIOSmsMessage type.
 */
public class GIOSmsMessage {
    private List<GIODeviceId> deviceIds;
    private String message;
    private LocalDateTime timestamp;

    /**
     * Default constructor.
     */
    public GIOSmsMessage() {
    }

    /**
     * Initialization constructor.
     * @param  deviceIds  List of GIODeviceId value for deviceIds.
     * @param  message  String value for message.
     * @param  timestamp  LocalDateTime value for timestamp.
     */
    public GIOSmsMessage(
            List<GIODeviceId> deviceIds,
            String message,
            LocalDateTime timestamp) {
        this.deviceIds = deviceIds;
        this.message = message;
        this.timestamp = timestamp;
    }

    /**
     * Getter for DeviceIds.
     * @return Returns the List of GIODeviceId
     */
    @JsonGetter("deviceIds")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<GIODeviceId> getDeviceIds() {
        return deviceIds;
    }

    /**
     * Setter for DeviceIds.
     * @param deviceIds Value for List of GIODeviceId
     */
    @JsonSetter("deviceIds")
    public void setDeviceIds(List<GIODeviceId> deviceIds) {
        this.deviceIds = deviceIds;
    }

    /**
     * Getter for Message.
     * @return Returns the String
     */
    @JsonGetter("message")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getMessage() {
        return message;
    }

    /**
     * Setter for Message.
     * @param message Value for String
     */
    @JsonSetter("message")
    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * Getter for Timestamp.
     * @return Returns the LocalDateTime
     */
    @JsonGetter("timestamp")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = DateTimeHelper.Rfc8601DateTimeSerializer.class)
    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    /**
     * Setter for Timestamp.
     * @param timestamp Value for LocalDateTime
     */
    @JsonSetter("timestamp")
    @JsonDeserialize(using = DateTimeHelper.Rfc8601DateTimeDeserializer.class)
    public void setTimestamp(LocalDateTime timestamp) {
        this.timestamp = timestamp;
    }

    /**
     * Converts this GIOSmsMessage into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "GIOSmsMessage [" + "deviceIds=" + deviceIds + ", message=" + message
                + ", timestamp=" + timestamp + "]";
    }

    /**
     * Builds a new {@link GIOSmsMessage.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link GIOSmsMessage.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .deviceIds(getDeviceIds())
                .message(getMessage())
                .timestamp(getTimestamp());
        return builder;
    }

    /**
     * Class to build instances of {@link GIOSmsMessage}.
     */
    public static class Builder {
        private List<GIODeviceId> deviceIds;
        private String message;
        private LocalDateTime timestamp;



        /**
         * Setter for deviceIds.
         * @param  deviceIds  List of GIODeviceId value for deviceIds.
         * @return Builder
         */
        public Builder deviceIds(List<GIODeviceId> deviceIds) {
            this.deviceIds = deviceIds;
            return this;
        }

        /**
         * Setter for message.
         * @param  message  String value for message.
         * @return Builder
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * Setter for timestamp.
         * @param  timestamp  LocalDateTime value for timestamp.
         * @return Builder
         */
        public Builder timestamp(LocalDateTime timestamp) {
            this.timestamp = timestamp;
            return this;
        }

        /**
         * Builds a new {@link GIOSmsMessage} object using the set fields.
         * @return {@link GIOSmsMessage}
         */
        public GIOSmsMessage build() {
            return new GIOSmsMessage(deviceIds, message, timestamp);
        }
    }
}