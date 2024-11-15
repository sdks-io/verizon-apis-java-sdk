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

/**
 * This is a model class for Firmware type.
 */
public class Firmware {
    private String firmwareName;
    private String participantName;
    private LocalDateTime launchDate;
    private String releaseNote;
    private String model;
    private String make;
    private String fromVersion;
    private String toVersion;

    /**
     * Default constructor.
     */
    public Firmware() {
    }

    /**
     * Initialization constructor.
     * @param  firmwareName  String value for firmwareName.
     * @param  participantName  String value for participantName.
     * @param  launchDate  LocalDateTime value for launchDate.
     * @param  releaseNote  String value for releaseNote.
     * @param  model  String value for model.
     * @param  make  String value for make.
     * @param  fromVersion  String value for fromVersion.
     * @param  toVersion  String value for toVersion.
     */
    public Firmware(
            String firmwareName,
            String participantName,
            LocalDateTime launchDate,
            String releaseNote,
            String model,
            String make,
            String fromVersion,
            String toVersion) {
        this.firmwareName = firmwareName;
        this.participantName = participantName;
        this.launchDate = launchDate;
        this.releaseNote = releaseNote;
        this.model = model;
        this.make = make;
        this.fromVersion = fromVersion;
        this.toVersion = toVersion;
    }

    /**
     * Getter for FirmwareName.
     * The name of the firmware image, provided by the device manufacturer.
     * @return Returns the String
     */
    @JsonGetter("firmwareName")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getFirmwareName() {
        return firmwareName;
    }

    /**
     * Setter for FirmwareName.
     * The name of the firmware image, provided by the device manufacturer.
     * @param firmwareName Value for String
     */
    @JsonSetter("firmwareName")
    public void setFirmwareName(String firmwareName) {
        this.firmwareName = firmwareName;
    }

    /**
     * Getter for ParticipantName.
     * Internal reference; can be ignored.
     * @return Returns the String
     */
    @JsonGetter("participantName")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getParticipantName() {
        return participantName;
    }

    /**
     * Setter for ParticipantName.
     * Internal reference; can be ignored.
     * @param participantName Value for String
     */
    @JsonSetter("participantName")
    public void setParticipantName(String participantName) {
        this.participantName = participantName;
    }

    /**
     * Getter for LaunchDate.
     * The release date of the firmware image.
     * @return Returns the LocalDateTime
     */
    @JsonGetter("launchDate")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = DateTimeHelper.Rfc8601DateTimeSerializer.class)
    public LocalDateTime getLaunchDate() {
        return launchDate;
    }

    /**
     * Setter for LaunchDate.
     * The release date of the firmware image.
     * @param launchDate Value for LocalDateTime
     */
    @JsonSetter("launchDate")
    @JsonDeserialize(using = DateTimeHelper.Rfc8601DateTimeDeserializer.class)
    public void setLaunchDate(LocalDateTime launchDate) {
        this.launchDate = launchDate;
    }

    /**
     * Getter for ReleaseNote.
     * Additional information about the release.
     * @return Returns the String
     */
    @JsonGetter("releaseNote")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getReleaseNote() {
        return releaseNote;
    }

    /**
     * Setter for ReleaseNote.
     * Additional information about the release.
     * @param releaseNote Value for String
     */
    @JsonSetter("releaseNote")
    public void setReleaseNote(String releaseNote) {
        this.releaseNote = releaseNote;
    }

    /**
     * Getter for Model.
     * The device model that the firmware applies to.
     * @return Returns the String
     */
    @JsonGetter("model")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getModel() {
        return model;
    }

    /**
     * Setter for Model.
     * The device model that the firmware applies to.
     * @param model Value for String
     */
    @JsonSetter("model")
    public void setModel(String model) {
        this.model = model;
    }

    /**
     * Getter for Make.
     * The device make that the firmware applies to.
     * @return Returns the String
     */
    @JsonGetter("make")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getMake() {
        return make;
    }

    /**
     * Setter for Make.
     * The device make that the firmware applies to.
     * @param make Value for String
     */
    @JsonSetter("make")
    public void setMake(String make) {
        this.make = make;
    }

    /**
     * Getter for FromVersion.
     * The firmware version that must currently be on the device to upgrade.
     * @return Returns the String
     */
    @JsonGetter("fromVersion")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getFromVersion() {
        return fromVersion;
    }

    /**
     * Setter for FromVersion.
     * The firmware version that must currently be on the device to upgrade.
     * @param fromVersion Value for String
     */
    @JsonSetter("fromVersion")
    public void setFromVersion(String fromVersion) {
        this.fromVersion = fromVersion;
    }

    /**
     * Getter for ToVersion.
     * The firmware version that will be on the device after an upgrade.
     * @return Returns the String
     */
    @JsonGetter("toVersion")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getToVersion() {
        return toVersion;
    }

    /**
     * Setter for ToVersion.
     * The firmware version that will be on the device after an upgrade.
     * @param toVersion Value for String
     */
    @JsonSetter("toVersion")
    public void setToVersion(String toVersion) {
        this.toVersion = toVersion;
    }

    /**
     * Converts this Firmware into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "Firmware [" + "firmwareName=" + firmwareName + ", participantName="
                + participantName + ", launchDate=" + launchDate + ", releaseNote=" + releaseNote
                + ", model=" + model + ", make=" + make + ", fromVersion=" + fromVersion
                + ", toVersion=" + toVersion + "]";
    }

    /**
     * Builds a new {@link Firmware.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link Firmware.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .firmwareName(getFirmwareName())
                .participantName(getParticipantName())
                .launchDate(getLaunchDate())
                .releaseNote(getReleaseNote())
                .model(getModel())
                .make(getMake())
                .fromVersion(getFromVersion())
                .toVersion(getToVersion());
        return builder;
    }

    /**
     * Class to build instances of {@link Firmware}.
     */
    public static class Builder {
        private String firmwareName;
        private String participantName;
        private LocalDateTime launchDate;
        private String releaseNote;
        private String model;
        private String make;
        private String fromVersion;
        private String toVersion;



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
         * Setter for participantName.
         * @param  participantName  String value for participantName.
         * @return Builder
         */
        public Builder participantName(String participantName) {
            this.participantName = participantName;
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
         * Setter for fromVersion.
         * @param  fromVersion  String value for fromVersion.
         * @return Builder
         */
        public Builder fromVersion(String fromVersion) {
            this.fromVersion = fromVersion;
            return this;
        }

        /**
         * Setter for toVersion.
         * @param  toVersion  String value for toVersion.
         * @return Builder
         */
        public Builder toVersion(String toVersion) {
            this.toVersion = toVersion;
            return this;
        }

        /**
         * Builds a new {@link Firmware} object using the set fields.
         * @return {@link Firmware}
         */
        public Firmware build() {
            return new Firmware(firmwareName, participantName, launchDate, releaseNote, model, make,
                    fromVersion, toVersion);
        }
    }
}
