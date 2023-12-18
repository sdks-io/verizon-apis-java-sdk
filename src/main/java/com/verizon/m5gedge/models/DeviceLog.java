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
 * This is a model class for DeviceLog type.
 */
public class DeviceLog {
    private String deviceId;
    private LocalDateTime logTime;
    private String logType;
    private String eventLog;
    private String binaryLogFileBase64;
    private String binaryLogFilename;

    /**
     * Default constructor.
     */
    public DeviceLog() {
    }

    /**
     * Initialization constructor.
     * @param  deviceId  String value for deviceId.
     * @param  logTime  LocalDateTime value for logTime.
     * @param  logType  String value for logType.
     * @param  eventLog  String value for eventLog.
     * @param  binaryLogFileBase64  String value for binaryLogFileBase64.
     * @param  binaryLogFilename  String value for binaryLogFilename.
     */
    public DeviceLog(
            String deviceId,
            LocalDateTime logTime,
            String logType,
            String eventLog,
            String binaryLogFileBase64,
            String binaryLogFilename) {
        this.deviceId = deviceId;
        this.logTime = logTime;
        this.logType = logType;
        this.eventLog = eventLog;
        this.binaryLogFileBase64 = binaryLogFileBase64;
        this.binaryLogFilename = binaryLogFilename;
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
     * Getter for LogTime.
     * Time of log.
     * @return Returns the LocalDateTime
     */
    @JsonGetter("logTime")
    @JsonSerialize(using = DateTimeHelper.Rfc8601DateTimeSerializer.class)
    public LocalDateTime getLogTime() {
        return logTime;
    }

    /**
     * Setter for LogTime.
     * Time of log.
     * @param logTime Value for LocalDateTime
     */
    @JsonSetter("logTime")
    @JsonDeserialize(using = DateTimeHelper.Rfc8601DateTimeDeserializer.class)
    public void setLogTime(LocalDateTime logTime) {
        this.logTime = logTime;
    }

    /**
     * Getter for LogType.
     * Log type (one of SoftwareUpdate, Event, UserNotification, AgentService, Wireless,
     * WirelessWeb, MobileBroadbandModem, WindowsMDM).
     * @return Returns the String
     */
    @JsonGetter("logType")
    public String getLogType() {
        return logType;
    }

    /**
     * Setter for LogType.
     * Log type (one of SoftwareUpdate, Event, UserNotification, AgentService, Wireless,
     * WirelessWeb, MobileBroadbandModem, WindowsMDM).
     * @param logType Value for String
     */
    @JsonSetter("logType")
    public void setLogType(String logType) {
        this.logType = logType;
    }

    /**
     * Getter for EventLog.
     * Event log.
     * @return Returns the String
     */
    @JsonGetter("eventLog")
    public String getEventLog() {
        return eventLog;
    }

    /**
     * Setter for EventLog.
     * Event log.
     * @param eventLog Value for String
     */
    @JsonSetter("eventLog")
    public void setEventLog(String eventLog) {
        this.eventLog = eventLog;
    }

    /**
     * Getter for BinaryLogFileBase64.
     * Base64-encoded contents of binary log file.
     * @return Returns the String
     */
    @JsonGetter("binaryLogFileBase64")
    public String getBinaryLogFileBase64() {
        return binaryLogFileBase64;
    }

    /**
     * Setter for BinaryLogFileBase64.
     * Base64-encoded contents of binary log file.
     * @param binaryLogFileBase64 Value for String
     */
    @JsonSetter("binaryLogFileBase64")
    public void setBinaryLogFileBase64(String binaryLogFileBase64) {
        this.binaryLogFileBase64 = binaryLogFileBase64;
    }

    /**
     * Getter for BinaryLogFilename.
     * File name of binary log file.
     * @return Returns the String
     */
    @JsonGetter("binaryLogFilename")
    public String getBinaryLogFilename() {
        return binaryLogFilename;
    }

    /**
     * Setter for BinaryLogFilename.
     * File name of binary log file.
     * @param binaryLogFilename Value for String
     */
    @JsonSetter("binaryLogFilename")
    public void setBinaryLogFilename(String binaryLogFilename) {
        this.binaryLogFilename = binaryLogFilename;
    }

    /**
     * Converts this DeviceLog into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "DeviceLog [" + "deviceId=" + deviceId + ", logTime=" + logTime + ", logType="
                + logType + ", eventLog=" + eventLog + ", binaryLogFileBase64="
                + binaryLogFileBase64 + ", binaryLogFilename=" + binaryLogFilename + "]";
    }

    /**
     * Builds a new {@link DeviceLog.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link DeviceLog.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(deviceId, logTime, logType, eventLog, binaryLogFileBase64,
                binaryLogFilename);
        return builder;
    }

    /**
     * Class to build instances of {@link DeviceLog}.
     */
    public static class Builder {
        private String deviceId;
        private LocalDateTime logTime;
        private String logType;
        private String eventLog;
        private String binaryLogFileBase64;
        private String binaryLogFilename;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  deviceId  String value for deviceId.
         * @param  logTime  LocalDateTime value for logTime.
         * @param  logType  String value for logType.
         * @param  eventLog  String value for eventLog.
         * @param  binaryLogFileBase64  String value for binaryLogFileBase64.
         * @param  binaryLogFilename  String value for binaryLogFilename.
         */
        public Builder(String deviceId, LocalDateTime logTime, String logType, String eventLog,
                String binaryLogFileBase64, String binaryLogFilename) {
            this.deviceId = deviceId;
            this.logTime = logTime;
            this.logType = logType;
            this.eventLog = eventLog;
            this.binaryLogFileBase64 = binaryLogFileBase64;
            this.binaryLogFilename = binaryLogFilename;
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
         * Setter for logTime.
         * @param  logTime  LocalDateTime value for logTime.
         * @return Builder
         */
        public Builder logTime(LocalDateTime logTime) {
            this.logTime = logTime;
            return this;
        }

        /**
         * Setter for logType.
         * @param  logType  String value for logType.
         * @return Builder
         */
        public Builder logType(String logType) {
            this.logType = logType;
            return this;
        }

        /**
         * Setter for eventLog.
         * @param  eventLog  String value for eventLog.
         * @return Builder
         */
        public Builder eventLog(String eventLog) {
            this.eventLog = eventLog;
            return this;
        }

        /**
         * Setter for binaryLogFileBase64.
         * @param  binaryLogFileBase64  String value for binaryLogFileBase64.
         * @return Builder
         */
        public Builder binaryLogFileBase64(String binaryLogFileBase64) {
            this.binaryLogFileBase64 = binaryLogFileBase64;
            return this;
        }

        /**
         * Setter for binaryLogFilename.
         * @param  binaryLogFilename  String value for binaryLogFilename.
         * @return Builder
         */
        public Builder binaryLogFilename(String binaryLogFilename) {
            this.binaryLogFilename = binaryLogFilename;
            return this;
        }

        /**
         * Builds a new {@link DeviceLog} object using the set fields.
         * @return {@link DeviceLog}
         */
        public DeviceLog build() {
            return new DeviceLog(deviceId, logTime, logType, eventLog, binaryLogFileBase64,
                    binaryLogFilename);
        }
    }
}
