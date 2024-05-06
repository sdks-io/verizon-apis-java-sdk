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
 * This is a model class for NotificationReportStatusRequest type.
 */
public class NotificationReportStatusRequest {
    private String accountName;
    private DeviceId device;
    private String requestType;
    private String requestExpirationTime;

    /**
     * Default constructor.
     */
    public NotificationReportStatusRequest() {
    }

    /**
     * Initialization constructor.
     * @param  accountName  String value for accountName.
     * @param  device  DeviceId value for device.
     * @param  requestType  String value for requestType.
     * @param  requestExpirationTime  String value for requestExpirationTime.
     */
    public NotificationReportStatusRequest(
            String accountName,
            DeviceId device,
            String requestType,
            String requestExpirationTime) {
        this.accountName = accountName;
        this.device = device;
        this.requestType = requestType;
        this.requestExpirationTime = requestExpirationTime;
    }

    /**
     * Getter for AccountName.
     * The name of a billing account.
     * @return Returns the String
     */
    @JsonGetter("accountName")
    public String getAccountName() {
        return accountName;
    }

    /**
     * Setter for AccountName.
     * The name of a billing account.
     * @param accountName Value for String
     */
    @JsonSetter("accountName")
    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    /**
     * Getter for Device.
     * An identifier for a single device.
     * @return Returns the DeviceId
     */
    @JsonGetter("device")
    public DeviceId getDevice() {
        return device;
    }

    /**
     * Setter for Device.
     * An identifier for a single device.
     * @param device Value for DeviceId
     */
    @JsonSetter("device")
    public void setDevice(DeviceId device) {
        this.device = device;
    }

    /**
     * Getter for RequestType.
     * The type of request.
     * @return Returns the String
     */
    @JsonGetter("requestType")
    public String getRequestType() {
        return requestType;
    }

    /**
     * Setter for RequestType.
     * The type of request.
     * @param requestType Value for String
     */
    @JsonSetter("requestType")
    public void setRequestType(String requestType) {
        this.requestType = requestType;
    }

    /**
     * Getter for RequestExpirationTime.
     * The time at which the request expires.
     * @return Returns the String
     */
    @JsonGetter("requestExpirationTime")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getRequestExpirationTime() {
        return requestExpirationTime;
    }

    /**
     * Setter for RequestExpirationTime.
     * The time at which the request expires.
     * @param requestExpirationTime Value for String
     */
    @JsonSetter("requestExpirationTime")
    public void setRequestExpirationTime(String requestExpirationTime) {
        this.requestExpirationTime = requestExpirationTime;
    }

    /**
     * Converts this NotificationReportStatusRequest into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "NotificationReportStatusRequest [" + "accountName=" + accountName + ", device="
                + device + ", requestType=" + requestType + ", requestExpirationTime="
                + requestExpirationTime + "]";
    }

    /**
     * Builds a new {@link NotificationReportStatusRequest.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link NotificationReportStatusRequest.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(accountName, device, requestType)
                .requestExpirationTime(getRequestExpirationTime());
        return builder;
    }

    /**
     * Class to build instances of {@link NotificationReportStatusRequest}.
     */
    public static class Builder {
        private String accountName;
        private DeviceId device;
        private String requestType;
        private String requestExpirationTime;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  accountName  String value for accountName.
         * @param  device  DeviceId value for device.
         * @param  requestType  String value for requestType.
         */
        public Builder(String accountName, DeviceId device, String requestType) {
            this.accountName = accountName;
            this.device = device;
            this.requestType = requestType;
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
         * Setter for device.
         * @param  device  DeviceId value for device.
         * @return Builder
         */
        public Builder device(DeviceId device) {
            this.device = device;
            return this;
        }

        /**
         * Setter for requestType.
         * @param  requestType  String value for requestType.
         * @return Builder
         */
        public Builder requestType(String requestType) {
            this.requestType = requestType;
            return this;
        }

        /**
         * Setter for requestExpirationTime.
         * @param  requestExpirationTime  String value for requestExpirationTime.
         * @return Builder
         */
        public Builder requestExpirationTime(String requestExpirationTime) {
            this.requestExpirationTime = requestExpirationTime;
            return this;
        }

        /**
         * Builds a new {@link NotificationReportStatusRequest} object using the set fields.
         * @return {@link NotificationReportStatusRequest}
         */
        public NotificationReportStatusRequest build() {
            return new NotificationReportStatusRequest(accountName, device, requestType,
                    requestExpirationTime);
        }
    }
}
