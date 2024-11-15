/*
 * VerizonLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.verizon.m5gedge.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;
import java.util.List;

/**
 * This is a model class for V3LicenseAssignedRemovedResult type.
 */
public class V3LicenseAssignedRemovedResult {
    private String accountName;
    private int licCount;
    private int licUsedCount;
    private List<V3DeviceStatus> deviceList;

    /**
     * Default constructor.
     */
    public V3LicenseAssignedRemovedResult() {
    }

    /**
     * Initialization constructor.
     * @param  accountName  String value for accountName.
     * @param  licCount  int value for licCount.
     * @param  licUsedCount  int value for licUsedCount.
     * @param  deviceList  List of V3DeviceStatus value for deviceList.
     */
    public V3LicenseAssignedRemovedResult(
            String accountName,
            int licCount,
            int licUsedCount,
            List<V3DeviceStatus> deviceList) {
        this.accountName = accountName;
        this.licCount = licCount;
        this.licUsedCount = licUsedCount;
        this.deviceList = deviceList;
    }

    /**
     * Getter for AccountName.
     * Account name.
     * @return Returns the String
     */
    @JsonGetter("accountName")
    public String getAccountName() {
        return accountName;
    }

    /**
     * Setter for AccountName.
     * Account name.
     * @param accountName Value for String
     */
    @JsonSetter("accountName")
    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    /**
     * Getter for LicCount.
     * Total license count.
     * @return Returns the int
     */
    @JsonGetter("licCount")
    public int getLicCount() {
        return licCount;
    }

    /**
     * Setter for LicCount.
     * Total license count.
     * @param licCount Value for int
     */
    @JsonSetter("licCount")
    public void setLicCount(int licCount) {
        this.licCount = licCount;
    }

    /**
     * Getter for LicUsedCount.
     * Assigned license count.
     * @return Returns the int
     */
    @JsonGetter("licUsedCount")
    public int getLicUsedCount() {
        return licUsedCount;
    }

    /**
     * Setter for LicUsedCount.
     * Assigned license count.
     * @param licUsedCount Value for int
     */
    @JsonSetter("licUsedCount")
    public void setLicUsedCount(int licUsedCount) {
        this.licUsedCount = licUsedCount;
    }

    /**
     * Getter for DeviceList.
     * List of devices with id in IMEI.
     * @return Returns the List of V3DeviceStatus
     */
    @JsonGetter("deviceList")
    public List<V3DeviceStatus> getDeviceList() {
        return deviceList;
    }

    /**
     * Setter for DeviceList.
     * List of devices with id in IMEI.
     * @param deviceList Value for List of V3DeviceStatus
     */
    @JsonSetter("deviceList")
    public void setDeviceList(List<V3DeviceStatus> deviceList) {
        this.deviceList = deviceList;
    }

    /**
     * Converts this V3LicenseAssignedRemovedResult into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "V3LicenseAssignedRemovedResult [" + "accountName=" + accountName + ", licCount="
                + licCount + ", licUsedCount=" + licUsedCount + ", deviceList=" + deviceList + "]";
    }

    /**
     * Builds a new {@link V3LicenseAssignedRemovedResult.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link V3LicenseAssignedRemovedResult.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(accountName, licCount, licUsedCount, deviceList);
        return builder;
    }

    /**
     * Class to build instances of {@link V3LicenseAssignedRemovedResult}.
     */
    public static class Builder {
        private String accountName;
        private int licCount;
        private int licUsedCount;
        private List<V3DeviceStatus> deviceList;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  accountName  String value for accountName.
         * @param  licCount  int value for licCount.
         * @param  licUsedCount  int value for licUsedCount.
         * @param  deviceList  List of V3DeviceStatus value for deviceList.
         */
        public Builder(String accountName, int licCount, int licUsedCount,
                List<V3DeviceStatus> deviceList) {
            this.accountName = accountName;
            this.licCount = licCount;
            this.licUsedCount = licUsedCount;
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
         * Setter for licCount.
         * @param  licCount  int value for licCount.
         * @return Builder
         */
        public Builder licCount(int licCount) {
            this.licCount = licCount;
            return this;
        }

        /**
         * Setter for licUsedCount.
         * @param  licUsedCount  int value for licUsedCount.
         * @return Builder
         */
        public Builder licUsedCount(int licUsedCount) {
            this.licUsedCount = licUsedCount;
            return this;
        }

        /**
         * Setter for deviceList.
         * @param  deviceList  List of V3DeviceStatus value for deviceList.
         * @return Builder
         */
        public Builder deviceList(List<V3DeviceStatus> deviceList) {
            this.deviceList = deviceList;
            return this;
        }

        /**
         * Builds a new {@link V3LicenseAssignedRemovedResult} object using the set fields.
         * @return {@link V3LicenseAssignedRemovedResult}
         */
        public V3LicenseAssignedRemovedResult build() {
            return new V3LicenseAssignedRemovedResult(accountName, licCount, licUsedCount,
                    deviceList);
        }
    }
}