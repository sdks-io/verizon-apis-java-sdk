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
 * This is a model class for FirmwarePackage type.
 */
public class FirmwarePackage {
    private String firmwareName;
    private String firmwareFrom;
    private String firmwareTo;
    private LocalDateTime launchDate;
    private String releaseNote;
    private String model;
    private String make;
    private CampaignMetaInfoProtocolEnum protocol;

    /**
     * Default constructor.
     */
    public FirmwarePackage() {
        protocol = CampaignMetaInfoProtocolEnum.LW_M2M;
    }

    /**
     * Initialization constructor.
     * @param  firmwareName  String value for firmwareName.
     * @param  firmwareFrom  String value for firmwareFrom.
     * @param  firmwareTo  String value for firmwareTo.
     * @param  launchDate  LocalDateTime value for launchDate.
     * @param  releaseNote  String value for releaseNote.
     * @param  model  String value for model.
     * @param  make  String value for make.
     * @param  protocol  CampaignMetaInfoProtocolEnum value for protocol.
     */
    public FirmwarePackage(
            String firmwareName,
            String firmwareFrom,
            String firmwareTo,
            LocalDateTime launchDate,
            String releaseNote,
            String model,
            String make,
            CampaignMetaInfoProtocolEnum protocol) {
        this.firmwareName = firmwareName;
        this.firmwareFrom = firmwareFrom;
        this.firmwareTo = firmwareTo;
        this.launchDate = launchDate;
        this.releaseNote = releaseNote;
        this.model = model;
        this.make = make;
        this.protocol = protocol;
    }

    /**
     * Getter for FirmwareName.
     * Firmware name.
     * @return Returns the String
     */
    @JsonGetter("firmwareName")
    public String getFirmwareName() {
        return firmwareName;
    }

    /**
     * Setter for FirmwareName.
     * Firmware name.
     * @param firmwareName Value for String
     */
    @JsonSetter("firmwareName")
    public void setFirmwareName(String firmwareName) {
        this.firmwareName = firmwareName;
    }

    /**
     * Getter for FirmwareFrom.
     * Firmware from version.
     * @return Returns the String
     */
    @JsonGetter("firmwareFrom")
    public String getFirmwareFrom() {
        return firmwareFrom;
    }

    /**
     * Setter for FirmwareFrom.
     * Firmware from version.
     * @param firmwareFrom Value for String
     */
    @JsonSetter("firmwareFrom")
    public void setFirmwareFrom(String firmwareFrom) {
        this.firmwareFrom = firmwareFrom;
    }

    /**
     * Getter for FirmwareTo.
     * Firmware to version.
     * @return Returns the String
     */
    @JsonGetter("firmwareTo")
    public String getFirmwareTo() {
        return firmwareTo;
    }

    /**
     * Setter for FirmwareTo.
     * Firmware to version.
     * @param firmwareTo Value for String
     */
    @JsonSetter("firmwareTo")
    public void setFirmwareTo(String firmwareTo) {
        this.firmwareTo = firmwareTo;
    }

    /**
     * Getter for LaunchDate.
     * Firmware launch date.
     * @return Returns the LocalDateTime
     */
    @JsonGetter("launchDate")
    @JsonSerialize(using = DateTimeHelper.Rfc8601DateTimeSerializer.class)
    public LocalDateTime getLaunchDate() {
        return launchDate;
    }

    /**
     * Setter for LaunchDate.
     * Firmware launch date.
     * @param launchDate Value for LocalDateTime
     */
    @JsonSetter("launchDate")
    @JsonDeserialize(using = DateTimeHelper.Rfc8601DateTimeDeserializer.class)
    public void setLaunchDate(LocalDateTime launchDate) {
        this.launchDate = launchDate;
    }

    /**
     * Getter for ReleaseNote.
     * Firmware release note.
     * @return Returns the String
     */
    @JsonGetter("releaseNote")
    public String getReleaseNote() {
        return releaseNote;
    }

    /**
     * Setter for ReleaseNote.
     * Firmware release note.
     * @param releaseNote Value for String
     */
    @JsonSetter("releaseNote")
    public void setReleaseNote(String releaseNote) {
        this.releaseNote = releaseNote;
    }

    /**
     * Getter for Model.
     * Firmware applicable device model.
     * @return Returns the String
     */
    @JsonGetter("model")
    public String getModel() {
        return model;
    }

    /**
     * Setter for Model.
     * Firmware applicable device model.
     * @param model Value for String
     */
    @JsonSetter("model")
    public void setModel(String model) {
        this.model = model;
    }

    /**
     * Getter for Make.
     * Firmware applicable device make.
     * @return Returns the String
     */
    @JsonGetter("make")
    public String getMake() {
        return make;
    }

    /**
     * Setter for Make.
     * Firmware applicable device make.
     * @param make Value for String
     */
    @JsonSetter("make")
    public void setMake(String make) {
        this.make = make;
    }

    /**
     * Getter for Protocol.
     * Firmware protocol. Valid values include: LWM2M, OMD-DM.
     * @return Returns the CampaignMetaInfoProtocolEnum
     */
    @JsonGetter("protocol")
    public CampaignMetaInfoProtocolEnum getProtocol() {
        return protocol;
    }

    /**
     * Setter for Protocol.
     * Firmware protocol. Valid values include: LWM2M, OMD-DM.
     * @param protocol Value for CampaignMetaInfoProtocolEnum
     */
    @JsonSetter("protocol")
    public void setProtocol(CampaignMetaInfoProtocolEnum protocol) {
        this.protocol = protocol;
    }

    /**
     * Converts this FirmwarePackage into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "FirmwarePackage [" + "firmwareName=" + firmwareName + ", firmwareFrom="
                + firmwareFrom + ", firmwareTo=" + firmwareTo + ", launchDate=" + launchDate
                + ", releaseNote=" + releaseNote + ", model=" + model + ", make=" + make
                + ", protocol=" + protocol + "]";
    }

    /**
     * Builds a new {@link FirmwarePackage.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link FirmwarePackage.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(firmwareName, firmwareFrom, firmwareTo, launchDate,
                releaseNote, model, make, protocol);
        return builder;
    }

    /**
     * Class to build instances of {@link FirmwarePackage}.
     */
    public static class Builder {
        private String firmwareName;
        private String firmwareFrom;
        private String firmwareTo;
        private LocalDateTime launchDate;
        private String releaseNote;
        private String model;
        private String make;
        private CampaignMetaInfoProtocolEnum protocol = CampaignMetaInfoProtocolEnum.LW_M2M;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  firmwareName  String value for firmwareName.
         * @param  firmwareFrom  String value for firmwareFrom.
         * @param  firmwareTo  String value for firmwareTo.
         * @param  launchDate  LocalDateTime value for launchDate.
         * @param  releaseNote  String value for releaseNote.
         * @param  model  String value for model.
         * @param  make  String value for make.
         * @param  protocol  CampaignMetaInfoProtocolEnum value for protocol.
         */
        public Builder(String firmwareName, String firmwareFrom, String firmwareTo,
                LocalDateTime launchDate, String releaseNote, String model, String make,
                CampaignMetaInfoProtocolEnum protocol) {
            this.firmwareName = firmwareName;
            this.firmwareFrom = firmwareFrom;
            this.firmwareTo = firmwareTo;
            this.launchDate = launchDate;
            this.releaseNote = releaseNote;
            this.model = model;
            this.make = make;
            this.protocol = protocol;
        }

        /**
         * Setter for firmwareName.
         * @param  firmwareName  String value for firmwareName.
         * @return Builder
         */
        public Builder firmwareName(String firmwareName) {
            this.firmwareName = firmwareName;
            return this;
        }

        /**
         * Setter for firmwareFrom.
         * @param  firmwareFrom  String value for firmwareFrom.
         * @return Builder
         */
        public Builder firmwareFrom(String firmwareFrom) {
            this.firmwareFrom = firmwareFrom;
            return this;
        }

        /**
         * Setter for firmwareTo.
         * @param  firmwareTo  String value for firmwareTo.
         * @return Builder
         */
        public Builder firmwareTo(String firmwareTo) {
            this.firmwareTo = firmwareTo;
            return this;
        }

        /**
         * Setter for launchDate.
         * @param  launchDate  LocalDateTime value for launchDate.
         * @return Builder
         */
        public Builder launchDate(LocalDateTime launchDate) {
            this.launchDate = launchDate;
            return this;
        }

        /**
         * Setter for releaseNote.
         * @param  releaseNote  String value for releaseNote.
         * @return Builder
         */
        public Builder releaseNote(String releaseNote) {
            this.releaseNote = releaseNote;
            return this;
        }

        /**
         * Setter for model.
         * @param  model  String value for model.
         * @return Builder
         */
        public Builder model(String model) {
            this.model = model;
            return this;
        }

        /**
         * Setter for make.
         * @param  make  String value for make.
         * @return Builder
         */
        public Builder make(String make) {
            this.make = make;
            return this;
        }

        /**
         * Setter for protocol.
         * @param  protocol  CampaignMetaInfoProtocolEnum value for protocol.
         * @return Builder
         */
        public Builder protocol(CampaignMetaInfoProtocolEnum protocol) {
            this.protocol = protocol;
            return this;
        }

        /**
         * Builds a new {@link FirmwarePackage} object using the set fields.
         * @return {@link FirmwarePackage}
         */
        public FirmwarePackage build() {
            return new FirmwarePackage(firmwareName, firmwareFrom, firmwareTo, launchDate,
                    releaseNote, model, make, protocol);
        }
    }
}