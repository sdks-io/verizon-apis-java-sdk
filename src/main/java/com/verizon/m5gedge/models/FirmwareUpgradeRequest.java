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
import java.util.List;

/**
 * This is a model class for FirmwareUpgradeRequest type.
 */
public class FirmwareUpgradeRequest {
    private String accountName;
    private String firmwareName;
    private String firmwareTo;
    private LocalDate startDate;
    private LocalDate endDate;
    private List<String> deviceList;

    /**
     * Default constructor.
     */
    public FirmwareUpgradeRequest() {
    }

    /**
     * Initialization constructor.
     * @param  accountName  String value for accountName.
     * @param  firmwareName  String value for firmwareName.
     * @param  firmwareTo  String value for firmwareTo.
     * @param  startDate  LocalDate value for startDate.
     * @param  endDate  LocalDate value for endDate.
     * @param  deviceList  List of String value for deviceList.
     */
    public FirmwareUpgradeRequest(
            String accountName,
            String firmwareName,
            String firmwareTo,
            LocalDate startDate,
            LocalDate endDate,
            List<String> deviceList) {
        this.accountName = accountName;
        this.firmwareName = firmwareName;
        this.firmwareTo = firmwareTo;
        this.startDate = startDate;
        this.endDate = endDate;
        this.deviceList = deviceList;
    }

    /**
     * Getter for AccountName.
     * Account identifier in "##########-#####".
     * @return Returns the String
     */
    @JsonGetter("accountName")
    public String getAccountName() {
        return accountName;
    }

    /**
     * Setter for AccountName.
     * Account identifier in "##########-#####".
     * @param accountName Value for String
     */
    @JsonSetter("accountName")
    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    /**
     * Getter for FirmwareName.
     * The name of the firmware image that will be used for the upgrade, from a GET /firmware
     * response.
     * @return Returns the String
     */
    @JsonGetter("firmwareName")
    public String getFirmwareName() {
        return firmwareName;
    }

    /**
     * Setter for FirmwareName.
     * The name of the firmware image that will be used for the upgrade, from a GET /firmware
     * response.
     * @param firmwareName Value for String
     */
    @JsonSetter("firmwareName")
    public void setFirmwareName(String firmwareName) {
        this.firmwareName = firmwareName;
    }

    /**
     * Getter for FirmwareTo.
     * The name of the firmware version that will be on the devices after a successful upgrade.
     * @return Returns the String
     */
    @JsonGetter("firmwareTo")
    public String getFirmwareTo() {
        return firmwareTo;
    }

    /**
     * Setter for FirmwareTo.
     * The name of the firmware version that will be on the devices after a successful upgrade.
     * @param firmwareTo Value for String
     */
    @JsonSetter("firmwareTo")
    public void setFirmwareTo(String firmwareTo) {
        this.firmwareTo = firmwareTo;
    }

    /**
     * Getter for StartDate.
     * The date that the upgrade begins.
     * @return Returns the LocalDate
     */
    @JsonGetter("startDate")
    @JsonSerialize(using = DateTimeHelper.SimpleDateSerializer.class)
    public LocalDate getStartDate() {
        return startDate;
    }

    /**
     * Setter for StartDate.
     * The date that the upgrade begins.
     * @param startDate Value for LocalDate
     */
    @JsonSetter("startDate")
    @JsonDeserialize(using = DateTimeHelper.SimpleDateDeserializer.class)
    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    /**
     * Getter for EndDate.
     * The date that the upgrade ends.
     * @return Returns the LocalDate
     */
    @JsonGetter("endDate")
    @JsonSerialize(using = DateTimeHelper.SimpleDateSerializer.class)
    public LocalDate getEndDate() {
        return endDate;
    }

    /**
     * Setter for EndDate.
     * The date that the upgrade ends.
     * @param endDate Value for LocalDate
     */
    @JsonSetter("endDate")
    @JsonDeserialize(using = DateTimeHelper.SimpleDateDeserializer.class)
    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    /**
     * Getter for DeviceList.
     * The IMEIs of the devices.
     * @return Returns the List of String
     */
    @JsonGetter("deviceList")
    public List<String> getDeviceList() {
        return deviceList;
    }

    /**
     * Setter for DeviceList.
     * The IMEIs of the devices.
     * @param deviceList Value for List of String
     */
    @JsonSetter("deviceList")
    public void setDeviceList(List<String> deviceList) {
        this.deviceList = deviceList;
    }

    /**
     * Converts this FirmwareUpgradeRequest into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "FirmwareUpgradeRequest [" + "accountName=" + accountName + ", firmwareName="
                + firmwareName + ", firmwareTo=" + firmwareTo + ", startDate=" + startDate
                + ", endDate=" + endDate + ", deviceList=" + deviceList + "]";
    }

    /**
     * Builds a new {@link FirmwareUpgradeRequest.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link FirmwareUpgradeRequest.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(accountName, firmwareName, firmwareTo, startDate, endDate,
                deviceList);
        return builder;
    }

    /**
     * Class to build instances of {@link FirmwareUpgradeRequest}.
     */
    public static class Builder {
        private String accountName;
        private String firmwareName;
        private String firmwareTo;
        private LocalDate startDate;
        private LocalDate endDate;
        private List<String> deviceList;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  accountName  String value for accountName.
         * @param  firmwareName  String value for firmwareName.
         * @param  firmwareTo  String value for firmwareTo.
         * @param  startDate  LocalDate value for startDate.
         * @param  endDate  LocalDate value for endDate.
         * @param  deviceList  List of String value for deviceList.
         */
        public Builder(String accountName, String firmwareName, String firmwareTo,
                LocalDate startDate, LocalDate endDate, List<String> deviceList) {
            this.accountName = accountName;
            this.firmwareName = firmwareName;
            this.firmwareTo = firmwareTo;
            this.startDate = startDate;
            this.endDate = endDate;
            this.deviceList = deviceList;
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
         * Setter for firmwareName.
         * @param  firmwareName  String value for firmwareName.
         * @return Builder
         */
        public Builder firmwareName(String firmwareName) {
            this.firmwareName = firmwareName;
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
         * Setter for startDate.
         * @param  startDate  LocalDate value for startDate.
         * @return Builder
         */
        public Builder startDate(LocalDate startDate) {
            this.startDate = startDate;
            return this;
        }

        /**
         * Setter for endDate.
         * @param  endDate  LocalDate value for endDate.
         * @return Builder
         */
        public Builder endDate(LocalDate endDate) {
            this.endDate = endDate;
            return this;
        }

        /**
         * Setter for deviceList.
         * @param  deviceList  List of String value for deviceList.
         * @return Builder
         */
        public Builder deviceList(List<String> deviceList) {
            this.deviceList = deviceList;
            return this;
        }

        /**
         * Builds a new {@link FirmwareUpgradeRequest} object using the set fields.
         * @return {@link FirmwareUpgradeRequest}
         */
        public FirmwareUpgradeRequest build() {
            return new FirmwareUpgradeRequest(accountName, firmwareName, firmwareTo, startDate,
                    endDate, deviceList);
        }
    }
}
