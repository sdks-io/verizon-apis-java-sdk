/*
 * VerizonLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.verizon.m5gedge.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;
import java.util.List;

/**
 * This is a model class for V3AccountDeviceList type.
 */
public class V3AccountDeviceList {
    private String accountName;
    private boolean hasMoreData;
    private String lastSeenDeviceId;
    private int maxPageSize;
    private List<V3AccountDevice> deviceList;

    /**
     * Default constructor.
     */
    public V3AccountDeviceList() {
    }

    /**
     * Initialization constructor.
     * @param  accountName  String value for accountName.
     * @param  hasMoreData  boolean value for hasMoreData.
     * @param  maxPageSize  int value for maxPageSize.
     * @param  deviceList  List of V3AccountDevice value for deviceList.
     * @param  lastSeenDeviceId  String value for lastSeenDeviceId.
     */
    public V3AccountDeviceList(
            String accountName,
            boolean hasMoreData,
            int maxPageSize,
            List<V3AccountDevice> deviceList,
            String lastSeenDeviceId) {
        this.accountName = accountName;
        this.hasMoreData = hasMoreData;
        this.lastSeenDeviceId = lastSeenDeviceId;
        this.maxPageSize = maxPageSize;
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
     * Getter for HasMoreData.
     * Has more device flag?
     * @return Returns the boolean
     */
    @JsonGetter("hasMoreData")
    public boolean getHasMoreData() {
        return hasMoreData;
    }

    /**
     * Setter for HasMoreData.
     * Has more device flag?
     * @param hasMoreData Value for boolean
     */
    @JsonSetter("hasMoreData")
    public void setHasMoreData(boolean hasMoreData) {
        this.hasMoreData = hasMoreData;
    }

    /**
     * Getter for LastSeenDeviceId.
     * Last seen device identifier.
     * @return Returns the String
     */
    @JsonGetter("lastSeenDeviceId")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getLastSeenDeviceId() {
        return lastSeenDeviceId;
    }

    /**
     * Setter for LastSeenDeviceId.
     * Last seen device identifier.
     * @param lastSeenDeviceId Value for String
     */
    @JsonSetter("lastSeenDeviceId")
    public void setLastSeenDeviceId(String lastSeenDeviceId) {
        this.lastSeenDeviceId = lastSeenDeviceId;
    }

    /**
     * Getter for MaxPageSize.
     * Maximum page size.
     * @return Returns the int
     */
    @JsonGetter("maxPageSize")
    public int getMaxPageSize() {
        return maxPageSize;
    }

    /**
     * Setter for MaxPageSize.
     * Maximum page size.
     * @param maxPageSize Value for int
     */
    @JsonSetter("maxPageSize")
    public void setMaxPageSize(int maxPageSize) {
        this.maxPageSize = maxPageSize;
    }

    /**
     * Getter for DeviceList.
     * Account device list.
     * @return Returns the List of V3AccountDevice
     */
    @JsonGetter("deviceList")
    public List<V3AccountDevice> getDeviceList() {
        return deviceList;
    }

    /**
     * Setter for DeviceList.
     * Account device list.
     * @param deviceList Value for List of V3AccountDevice
     */
    @JsonSetter("deviceList")
    public void setDeviceList(List<V3AccountDevice> deviceList) {
        this.deviceList = deviceList;
    }

    /**
     * Converts this V3AccountDeviceList into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "V3AccountDeviceList [" + "accountName=" + accountName + ", hasMoreData="
                + hasMoreData + ", maxPageSize=" + maxPageSize + ", deviceList=" + deviceList
                + ", lastSeenDeviceId=" + lastSeenDeviceId + "]";
    }

    /**
     * Builds a new {@link V3AccountDeviceList.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link V3AccountDeviceList.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(accountName, hasMoreData, maxPageSize, deviceList)
                .lastSeenDeviceId(getLastSeenDeviceId());
        return builder;
    }

    /**
     * Class to build instances of {@link V3AccountDeviceList}.
     */
    public static class Builder {
        private String accountName;
        private boolean hasMoreData;
        private int maxPageSize;
        private List<V3AccountDevice> deviceList;
        private String lastSeenDeviceId;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  accountName  String value for accountName.
         * @param  hasMoreData  boolean value for hasMoreData.
         * @param  maxPageSize  int value for maxPageSize.
         * @param  deviceList  List of V3AccountDevice value for deviceList.
         */
        public Builder(String accountName, boolean hasMoreData, int maxPageSize,
                List<V3AccountDevice> deviceList) {
            this.accountName = accountName;
            this.hasMoreData = hasMoreData;
            this.maxPageSize = maxPageSize;
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
         * Setter for hasMoreData.
         * @param  hasMoreData  boolean value for hasMoreData.
         * @return Builder
         */
        public Builder hasMoreData(boolean hasMoreData) {
            this.hasMoreData = hasMoreData;
            return this;
        }

        /**
         * Setter for maxPageSize.
         * @param  maxPageSize  int value for maxPageSize.
         * @return Builder
         */
        public Builder maxPageSize(int maxPageSize) {
            this.maxPageSize = maxPageSize;
            return this;
        }

        /**
         * Setter for deviceList.
         * @param  deviceList  List of V3AccountDevice value for deviceList.
         * @return Builder
         */
        public Builder deviceList(List<V3AccountDevice> deviceList) {
            this.deviceList = deviceList;
            return this;
        }

        /**
         * Setter for lastSeenDeviceId.
         * @param  lastSeenDeviceId  String value for lastSeenDeviceId.
         * @return Builder
         */
        public Builder lastSeenDeviceId(String lastSeenDeviceId) {
            this.lastSeenDeviceId = lastSeenDeviceId;
            return this;
        }

        /**
         * Builds a new {@link V3AccountDeviceList} object using the set fields.
         * @return {@link V3AccountDeviceList}
         */
        public V3AccountDeviceList build() {
            return new V3AccountDeviceList(accountName, hasMoreData, maxPageSize, deviceList,
                    lastSeenDeviceId);
        }
    }
}