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
 * This is a model class for FotaV2SubscrIpTion type.
 */
public class FotaV2SubscrIpTion {
    private String accountName;
    private String purchaseType;
    private Integer licenseCount;
    private Integer licenseUsedCount;
    private String updateTime;

    /**
     * Default constructor.
     */
    public FotaV2SubscrIpTion() {
    }

    /**
     * Initialization constructor.
     * @param  accountName  String value for accountName.
     * @param  purchaseType  String value for purchaseType.
     * @param  licenseCount  Integer value for licenseCount.
     * @param  licenseUsedCount  Integer value for licenseUsedCount.
     * @param  updateTime  String value for updateTime.
     */
    public FotaV2SubscrIpTion(
            String accountName,
            String purchaseType,
            Integer licenseCount,
            Integer licenseUsedCount,
            String updateTime) {
        this.accountName = accountName;
        this.purchaseType = purchaseType;
        this.licenseCount = licenseCount;
        this.licenseUsedCount = licenseUsedCount;
        this.updateTime = updateTime;
    }

    /**
     * Getter for AccountName.
     * Account identifier in "##########-#####".
     * @return Returns the String
     */
    @JsonGetter("accountName")
    @JsonInclude(JsonInclude.Include.NON_NULL)
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
     * Getter for PurchaseType.
     * Subscription models used by the account.
     * @return Returns the String
     */
    @JsonGetter("purchaseType")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getPurchaseType() {
        return purchaseType;
    }

    /**
     * Setter for PurchaseType.
     * Subscription models used by the account.
     * @param purchaseType Value for String
     */
    @JsonSetter("purchaseType")
    public void setPurchaseType(String purchaseType) {
        this.purchaseType = purchaseType;
    }

    /**
     * Getter for LicenseCount.
     * Number of monthly licenses in an MRC subscription.
     * @return Returns the Integer
     */
    @JsonGetter("licenseCount")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getLicenseCount() {
        return licenseCount;
    }

    /**
     * Setter for LicenseCount.
     * Number of monthly licenses in an MRC subscription.
     * @param licenseCount Value for Integer
     */
    @JsonSetter("licenseCount")
    public void setLicenseCount(Integer licenseCount) {
        this.licenseCount = licenseCount;
    }

    /**
     * Getter for LicenseUsedCount.
     * Number of licenses currently assigned to devices.
     * @return Returns the Integer
     */
    @JsonGetter("licenseUsedCount")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getLicenseUsedCount() {
        return licenseUsedCount;
    }

    /**
     * Setter for LicenseUsedCount.
     * Number of licenses currently assigned to devices.
     * @param licenseUsedCount Value for Integer
     */
    @JsonSetter("licenseUsedCount")
    public void setLicenseUsedCount(Integer licenseUsedCount) {
        this.licenseUsedCount = licenseUsedCount;
    }

    /**
     * Getter for UpdateTime.
     * The date and time of when the subscription was last updated.
     * @return Returns the String
     */
    @JsonGetter("updateTime")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getUpdateTime() {
        return updateTime;
    }

    /**
     * Setter for UpdateTime.
     * The date and time of when the subscription was last updated.
     * @param updateTime Value for String
     */
    @JsonSetter("updateTime")
    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * Converts this FotaV2SubscrIpTion into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "FotaV2SubscrIpTion [" + "accountName=" + accountName + ", purchaseType="
                + purchaseType + ", licenseCount=" + licenseCount + ", licenseUsedCount="
                + licenseUsedCount + ", updateTime=" + updateTime + "]";
    }

    /**
     * Builds a new {@link FotaV2SubscrIpTion.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link FotaV2SubscrIpTion.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .accountName(getAccountName())
                .purchaseType(getPurchaseType())
                .licenseCount(getLicenseCount())
                .licenseUsedCount(getLicenseUsedCount())
                .updateTime(getUpdateTime());
        return builder;
    }

    /**
     * Class to build instances of {@link FotaV2SubscrIpTion}.
     */
    public static class Builder {
        private String accountName;
        private String purchaseType;
        private Integer licenseCount;
        private Integer licenseUsedCount;
        private String updateTime;



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
         * Setter for purchaseType.
         * @param  purchaseType  String value for purchaseType.
         * @return Builder
         */
        public Builder purchaseType(String purchaseType) {
            this.purchaseType = purchaseType;
            return this;
        }

        /**
         * Setter for licenseCount.
         * @param  licenseCount  Integer value for licenseCount.
         * @return Builder
         */
        public Builder licenseCount(Integer licenseCount) {
            this.licenseCount = licenseCount;
            return this;
        }

        /**
         * Setter for licenseUsedCount.
         * @param  licenseUsedCount  Integer value for licenseUsedCount.
         * @return Builder
         */
        public Builder licenseUsedCount(Integer licenseUsedCount) {
            this.licenseUsedCount = licenseUsedCount;
            return this;
        }

        /**
         * Setter for updateTime.
         * @param  updateTime  String value for updateTime.
         * @return Builder
         */
        public Builder updateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }

        /**
         * Builds a new {@link FotaV2SubscrIpTion} object using the set fields.
         * @return {@link FotaV2SubscrIpTion}
         */
        public FotaV2SubscrIpTion build() {
            return new FotaV2SubscrIpTion(accountName, purchaseType, licenseCount, licenseUsedCount,
                    updateTime);
        }
    }
}
