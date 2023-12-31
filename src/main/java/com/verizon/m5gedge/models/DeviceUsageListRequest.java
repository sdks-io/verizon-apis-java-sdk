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
 * This is a model class for DeviceUsageListRequest type.
 */
public class DeviceUsageListRequest {
    private DeviceId deviceId;
    private String earliest;
    private String latest;
    private Label label;

    /**
     * Default constructor.
     */
    public DeviceUsageListRequest() {
    }

    /**
     * Initialization constructor.
     * @param  deviceId  DeviceId value for deviceId.
     * @param  earliest  String value for earliest.
     * @param  latest  String value for latest.
     * @param  label  Label value for label.
     */
    public DeviceUsageListRequest(
            DeviceId deviceId,
            String earliest,
            String latest,
            Label label) {
        this.deviceId = deviceId;
        this.earliest = earliest;
        this.latest = latest;
        this.label = label;
    }

    /**
     * Getter for DeviceId.
     * An identifier for a single device.
     * @return Returns the DeviceId
     */
    @JsonGetter("deviceId")
    @JsonInclude(JsonInclude.Include.NON_NULL)
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
     * The earliest date for which you want usage data.
     * @return Returns the String
     */
    @JsonGetter("earliest")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getEarliest() {
        return earliest;
    }

    /**
     * Setter for Earliest.
     * The earliest date for which you want usage data.
     * @param earliest Value for String
     */
    @JsonSetter("earliest")
    public void setEarliest(String earliest) {
        this.earliest = earliest;
    }

    /**
     * Getter for Latest.
     * The last date for which you want usage data.
     * @return Returns the String
     */
    @JsonGetter("latest")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getLatest() {
        return latest;
    }

    /**
     * Setter for Latest.
     * The last date for which you want usage data.
     * @param latest Value for String
     */
    @JsonSetter("latest")
    public void setLatest(String latest) {
        this.latest = latest;
    }

    /**
     * Getter for Label.
     * @return Returns the Label
     */
    @JsonGetter("label")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Label getLabel() {
        return label;
    }

    /**
     * Setter for Label.
     * @param label Value for Label
     */
    @JsonSetter("label")
    public void setLabel(Label label) {
        this.label = label;
    }

    /**
     * Converts this DeviceUsageListRequest into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "DeviceUsageListRequest [" + "deviceId=" + deviceId + ", earliest=" + earliest
                + ", latest=" + latest + ", label=" + label + "]";
    }

    /**
     * Builds a new {@link DeviceUsageListRequest.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link DeviceUsageListRequest.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .deviceId(getDeviceId())
                .earliest(getEarliest())
                .latest(getLatest())
                .label(getLabel());
        return builder;
    }

    /**
     * Class to build instances of {@link DeviceUsageListRequest}.
     */
    public static class Builder {
        private DeviceId deviceId;
        private String earliest;
        private String latest;
        private Label label;



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
         * Setter for label.
         * @param  label  Label value for label.
         * @return Builder
         */
        public Builder label(Label label) {
            this.label = label;
            return this;
        }

        /**
         * Builds a new {@link DeviceUsageListRequest} object using the set fields.
         * @return {@link DeviceUsageListRequest}
         */
        public DeviceUsageListRequest build() {
            return new DeviceUsageListRequest(deviceId, earliest, latest, label);
        }
    }
}
