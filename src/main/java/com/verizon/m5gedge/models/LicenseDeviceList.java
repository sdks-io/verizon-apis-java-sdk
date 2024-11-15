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
 * This is a model class for LicenseDeviceList type.
 */
public class LicenseDeviceList {
    private List<LicenseDeviceId> deviceIds;
    private String ipaddress;

    /**
     * Default constructor.
     */
    public LicenseDeviceList() {
    }

    /**
     * Initialization constructor.
     * @param  deviceIds  List of LicenseDeviceId value for deviceIds.
     * @param  ipaddress  String value for ipaddress.
     */
    public LicenseDeviceList(
            List<LicenseDeviceId> deviceIds,
            String ipaddress) {
        this.deviceIds = deviceIds;
        this.ipaddress = ipaddress;
    }

    /**
     * Getter for DeviceIds.
     * For 4G devices, IMEI (decimal, up to 15 digits).
     * @return Returns the List of LicenseDeviceId
     */
    @JsonGetter("deviceIds")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<LicenseDeviceId> getDeviceIds() {
        return deviceIds;
    }

    /**
     * Setter for DeviceIds.
     * For 4G devices, IMEI (decimal, up to 15 digits).
     * @param deviceIds Value for List of LicenseDeviceId
     */
    @JsonSetter("deviceIds")
    public void setDeviceIds(List<LicenseDeviceId> deviceIds) {
        this.deviceIds = deviceIds;
    }

    /**
     * Getter for Ipaddress.
     * @return Returns the String
     */
    @JsonGetter("ipAddress")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getIpaddress() {
        return ipaddress;
    }

    /**
     * Setter for Ipaddress.
     * @param ipaddress Value for String
     */
    @JsonSetter("ipAddress")
    public void setIpaddress(String ipaddress) {
        this.ipaddress = ipaddress;
    }

    /**
     * Converts this LicenseDeviceList into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "LicenseDeviceList [" + "deviceIds=" + deviceIds + ", ipaddress=" + ipaddress + "]";
    }

    /**
     * Builds a new {@link LicenseDeviceList.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link LicenseDeviceList.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .deviceIds(getDeviceIds())
                .ipaddress(getIpaddress());
        return builder;
    }

    /**
     * Class to build instances of {@link LicenseDeviceList}.
     */
    public static class Builder {
        private List<LicenseDeviceId> deviceIds;
        private String ipaddress;



        /**
         * Setter for deviceIds.
         * @param  deviceIds  List of LicenseDeviceId value for deviceIds.
         * @return Builder
         */
        public Builder deviceIds(List<LicenseDeviceId> deviceIds) {
            this.deviceIds = deviceIds;
            return this;
        }

        /**
         * Setter for ipaddress.
         * @param  ipaddress  String value for ipaddress.
         * @return Builder
         */
        public Builder ipaddress(String ipaddress) {
            this.ipaddress = ipaddress;
            return this;
        }

        /**
         * Builds a new {@link LicenseDeviceList} object using the set fields.
         * @return {@link LicenseDeviceList}
         */
        public LicenseDeviceList build() {
            return new LicenseDeviceList(deviceIds, ipaddress);
        }
    }
}