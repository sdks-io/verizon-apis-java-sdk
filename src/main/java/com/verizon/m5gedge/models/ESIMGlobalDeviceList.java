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
 * This is a model class for ESIMGlobalDeviceList type.
 */
public class ESIMGlobalDeviceList {
    private String accountName;
    private ProvisioningStatusFilterEnum provisioningStatusFilter;
    private ProfileStatusFilterEnum profileStatusFilter;
    private String carrierNameFilter;
    private List<DeviceId2> deviceFilter;

    /**
     * Default constructor.
     */
    public ESIMGlobalDeviceList() {
    }

    /**
     * Initialization constructor.
     * @param  accountName  String value for accountName.
     * @param  provisioningStatusFilter  ProvisioningStatusFilterEnum value for
     *         provisioningStatusFilter.
     * @param  profileStatusFilter  ProfileStatusFilterEnum value for profileStatusFilter.
     * @param  carrierNameFilter  String value for carrierNameFilter.
     * @param  deviceFilter  List of DeviceId2 value for deviceFilter.
     */
    public ESIMGlobalDeviceList(
            String accountName,
            ProvisioningStatusFilterEnum provisioningStatusFilter,
            ProfileStatusFilterEnum profileStatusFilter,
            String carrierNameFilter,
            List<DeviceId2> deviceFilter) {
        this.accountName = accountName;
        this.provisioningStatusFilter = provisioningStatusFilter;
        this.profileStatusFilter = profileStatusFilter;
        this.carrierNameFilter = carrierNameFilter;
        this.deviceFilter = deviceFilter;
    }

    /**
     * Getter for AccountName.
     * The numeric name of the account.
     * @return Returns the String
     */
    @JsonGetter("accountName")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getAccountName() {
        return accountName;
    }

    /**
     * Setter for AccountName.
     * The numeric name of the account.
     * @param accountName Value for String
     */
    @JsonSetter("accountName")
    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    /**
     * Getter for ProvisioningStatusFilter.
     * The last status of the device as a list filter.
     * @return Returns the ProvisioningStatusFilterEnum
     */
    @JsonGetter("provisioningStatusFilter")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public ProvisioningStatusFilterEnum getProvisioningStatusFilter() {
        return provisioningStatusFilter;
    }

    /**
     * Setter for ProvisioningStatusFilter.
     * The last status of the device as a list filter.
     * @param provisioningStatusFilter Value for ProvisioningStatusFilterEnum
     */
    @JsonSetter("provisioningStatusFilter")
    public void setProvisioningStatusFilter(ProvisioningStatusFilterEnum provisioningStatusFilter) {
        this.provisioningStatusFilter = provisioningStatusFilter;
    }

    /**
     * Getter for ProfileStatusFilter.
     * The last status of the device's profile as a filter.
     * @return Returns the ProfileStatusFilterEnum
     */
    @JsonGetter("profileStatusFilter")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public ProfileStatusFilterEnum getProfileStatusFilter() {
        return profileStatusFilter;
    }

    /**
     * Setter for ProfileStatusFilter.
     * The last status of the device's profile as a filter.
     * @param profileStatusFilter Value for ProfileStatusFilterEnum
     */
    @JsonSetter("profileStatusFilter")
    public void setProfileStatusFilter(ProfileStatusFilterEnum profileStatusFilter) {
        this.profileStatusFilter = profileStatusFilter;
    }

    /**
     * Getter for CarrierNameFilter.
     * The cellular service provider.
     * @return Returns the String
     */
    @JsonGetter("carrierNameFilter")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getCarrierNameFilter() {
        return carrierNameFilter;
    }

    /**
     * Setter for CarrierNameFilter.
     * The cellular service provider.
     * @param carrierNameFilter Value for String
     */
    @JsonSetter("carrierNameFilter")
    public void setCarrierNameFilter(String carrierNameFilter) {
        this.carrierNameFilter = carrierNameFilter;
    }

    /**
     * Getter for DeviceFilter.
     * An array of device identifiers to filter the list.
     * @return Returns the List of DeviceId2
     */
    @JsonGetter("deviceFilter")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<DeviceId2> getDeviceFilter() {
        return deviceFilter;
    }

    /**
     * Setter for DeviceFilter.
     * An array of device identifiers to filter the list.
     * @param deviceFilter Value for List of DeviceId2
     */
    @JsonSetter("deviceFilter")
    public void setDeviceFilter(List<DeviceId2> deviceFilter) {
        this.deviceFilter = deviceFilter;
    }

    /**
     * Converts this ESIMGlobalDeviceList into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "ESIMGlobalDeviceList [" + "accountName=" + accountName
                + ", provisioningStatusFilter=" + provisioningStatusFilter
                + ", profileStatusFilter=" + profileStatusFilter + ", carrierNameFilter="
                + carrierNameFilter + ", deviceFilter=" + deviceFilter + "]";
    }

    /**
     * Builds a new {@link ESIMGlobalDeviceList.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link ESIMGlobalDeviceList.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .accountName(getAccountName())
                .provisioningStatusFilter(getProvisioningStatusFilter())
                .profileStatusFilter(getProfileStatusFilter())
                .carrierNameFilter(getCarrierNameFilter())
                .deviceFilter(getDeviceFilter());
        return builder;
    }

    /**
     * Class to build instances of {@link ESIMGlobalDeviceList}.
     */
    public static class Builder {
        private String accountName;
        private ProvisioningStatusFilterEnum provisioningStatusFilter;
        private ProfileStatusFilterEnum profileStatusFilter;
        private String carrierNameFilter;
        private List<DeviceId2> deviceFilter;



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
         * Setter for provisioningStatusFilter.
         * @param  provisioningStatusFilter  ProvisioningStatusFilterEnum value for
         *         provisioningStatusFilter.
         * @return Builder
         */
        public Builder provisioningStatusFilter(
                ProvisioningStatusFilterEnum provisioningStatusFilter) {
            this.provisioningStatusFilter = provisioningStatusFilter;
            return this;
        }

        /**
         * Setter for profileStatusFilter.
         * @param  profileStatusFilter  ProfileStatusFilterEnum value for profileStatusFilter.
         * @return Builder
         */
        public Builder profileStatusFilter(ProfileStatusFilterEnum profileStatusFilter) {
            this.profileStatusFilter = profileStatusFilter;
            return this;
        }

        /**
         * Setter for carrierNameFilter.
         * @param  carrierNameFilter  String value for carrierNameFilter.
         * @return Builder
         */
        public Builder carrierNameFilter(String carrierNameFilter) {
            this.carrierNameFilter = carrierNameFilter;
            return this;
        }

        /**
         * Setter for deviceFilter.
         * @param  deviceFilter  List of DeviceId2 value for deviceFilter.
         * @return Builder
         */
        public Builder deviceFilter(List<DeviceId2> deviceFilter) {
            this.deviceFilter = deviceFilter;
            return this;
        }

        /**
         * Builds a new {@link ESIMGlobalDeviceList} object using the set fields.
         * @return {@link ESIMGlobalDeviceList}
         */
        public ESIMGlobalDeviceList build() {
            return new ESIMGlobalDeviceList(accountName, provisioningStatusFilter,
                    profileStatusFilter, carrierNameFilter, deviceFilter);
        }
    }
}
