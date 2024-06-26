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
 * This is a model class for SecuritySubscription type.
 */
public class SecuritySubscription {
    private List<ExtendedAttributes> extendedAttributes;
    private Integer licenseAssigned;
    private Integer licenseAvailable;
    private Integer licensePurchased;
    private String licenseType;
    private String skuNumber;

    /**
     * Default constructor.
     */
    public SecuritySubscription() {
    }

    /**
     * Initialization constructor.
     * @param  extendedAttributes  List of ExtendedAttributes value for extendedAttributes.
     * @param  licenseAssigned  Integer value for licenseAssigned.
     * @param  licenseAvailable  Integer value for licenseAvailable.
     * @param  licensePurchased  Integer value for licensePurchased.
     * @param  licenseType  String value for licenseType.
     * @param  skuNumber  String value for skuNumber.
     */
    public SecuritySubscription(
            List<ExtendedAttributes> extendedAttributes,
            Integer licenseAssigned,
            Integer licenseAvailable,
            Integer licensePurchased,
            String licenseType,
            String skuNumber) {
        this.extendedAttributes = extendedAttributes;
        this.licenseAssigned = licenseAssigned;
        this.licenseAvailable = licenseAvailable;
        this.licensePurchased = licensePurchased;
        this.licenseType = licenseType;
        this.skuNumber = skuNumber;
    }

    /**
     * Getter for ExtendedAttributes.
     * Attributes of the subscription.
     * @return Returns the List of ExtendedAttributes
     */
    @JsonGetter("extendedAttributes")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<ExtendedAttributes> getExtendedAttributes() {
        return extendedAttributes;
    }

    /**
     * Setter for ExtendedAttributes.
     * Attributes of the subscription.
     * @param extendedAttributes Value for List of ExtendedAttributes
     */
    @JsonSetter("extendedAttributes")
    public void setExtendedAttributes(List<ExtendedAttributes> extendedAttributes) {
        this.extendedAttributes = extendedAttributes;
    }

    /**
     * Getter for LicenseAssigned.
     * The total number of licenses for this license type that are assigned to device SIMs.
     * @return Returns the Integer
     */
    @JsonGetter("licenseAssigned")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getLicenseAssigned() {
        return licenseAssigned;
    }

    /**
     * Setter for LicenseAssigned.
     * The total number of licenses for this license type that are assigned to device SIMs.
     * @param licenseAssigned Value for Integer
     */
    @JsonSetter("licenseAssigned")
    public void setLicenseAssigned(Integer licenseAssigned) {
        this.licenseAssigned = licenseAssigned;
    }

    /**
     * Getter for LicenseAvailable.
     * The total number of licenses for this license type that are available to assign to device
     * SIMs.
     * @return Returns the Integer
     */
    @JsonGetter("licenseAvailable")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getLicenseAvailable() {
        return licenseAvailable;
    }

    /**
     * Setter for LicenseAvailable.
     * The total number of licenses for this license type that are available to assign to device
     * SIMs.
     * @param licenseAvailable Value for Integer
     */
    @JsonSetter("licenseAvailable")
    public void setLicenseAvailable(Integer licenseAvailable) {
        this.licenseAvailable = licenseAvailable;
    }

    /**
     * Getter for LicensePurchased.
     * The total number of licenses purchased for the license type.
     * @return Returns the Integer
     */
    @JsonGetter("licensePurchased")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getLicensePurchased() {
        return licensePurchased;
    }

    /**
     * Setter for LicensePurchased.
     * The total number of licenses purchased for the license type.
     * @param licensePurchased Value for Integer
     */
    @JsonSetter("licensePurchased")
    public void setLicensePurchased(Integer licensePurchased) {
        this.licensePurchased = licensePurchased;
    }

    /**
     * Getter for LicenseType.
     * The license type associated with the skuNumber.
     * @return Returns the String
     */
    @JsonGetter("licenseType")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getLicenseType() {
        return licenseType;
    }

    /**
     * Setter for LicenseType.
     * The license type associated with the skuNumber.
     * @param licenseType Value for String
     */
    @JsonSetter("licenseType")
    public void setLicenseType(String licenseType) {
        this.licenseType = licenseType;
    }

    /**
     * Getter for SkuNumber.
     * The skuNumber that identifies the license type.
     * @return Returns the String
     */
    @JsonGetter("skuNumber")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getSkuNumber() {
        return skuNumber;
    }

    /**
     * Setter for SkuNumber.
     * The skuNumber that identifies the license type.
     * @param skuNumber Value for String
     */
    @JsonSetter("skuNumber")
    public void setSkuNumber(String skuNumber) {
        this.skuNumber = skuNumber;
    }

    /**
     * Converts this SecuritySubscription into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "SecuritySubscription [" + "extendedAttributes=" + extendedAttributes
                + ", licenseAssigned=" + licenseAssigned + ", licenseAvailable=" + licenseAvailable
                + ", licensePurchased=" + licensePurchased + ", licenseType=" + licenseType
                + ", skuNumber=" + skuNumber + "]";
    }

    /**
     * Builds a new {@link SecuritySubscription.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link SecuritySubscription.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .extendedAttributes(getExtendedAttributes())
                .licenseAssigned(getLicenseAssigned())
                .licenseAvailable(getLicenseAvailable())
                .licensePurchased(getLicensePurchased())
                .licenseType(getLicenseType())
                .skuNumber(getSkuNumber());
        return builder;
    }

    /**
     * Class to build instances of {@link SecuritySubscription}.
     */
    public static class Builder {
        private List<ExtendedAttributes> extendedAttributes;
        private Integer licenseAssigned;
        private Integer licenseAvailable;
        private Integer licensePurchased;
        private String licenseType;
        private String skuNumber;



        /**
         * Setter for extendedAttributes.
         * @param  extendedAttributes  List of ExtendedAttributes value for extendedAttributes.
         * @return Builder
         */
        public Builder extendedAttributes(List<ExtendedAttributes> extendedAttributes) {
            this.extendedAttributes = extendedAttributes;
            return this;
        }

        /**
         * Setter for licenseAssigned.
         * @param  licenseAssigned  Integer value for licenseAssigned.
         * @return Builder
         */
        public Builder licenseAssigned(Integer licenseAssigned) {
            this.licenseAssigned = licenseAssigned;
            return this;
        }

        /**
         * Setter for licenseAvailable.
         * @param  licenseAvailable  Integer value for licenseAvailable.
         * @return Builder
         */
        public Builder licenseAvailable(Integer licenseAvailable) {
            this.licenseAvailable = licenseAvailable;
            return this;
        }

        /**
         * Setter for licensePurchased.
         * @param  licensePurchased  Integer value for licensePurchased.
         * @return Builder
         */
        public Builder licensePurchased(Integer licensePurchased) {
            this.licensePurchased = licensePurchased;
            return this;
        }

        /**
         * Setter for licenseType.
         * @param  licenseType  String value for licenseType.
         * @return Builder
         */
        public Builder licenseType(String licenseType) {
            this.licenseType = licenseType;
            return this;
        }

        /**
         * Setter for skuNumber.
         * @param  skuNumber  String value for skuNumber.
         * @return Builder
         */
        public Builder skuNumber(String skuNumber) {
            this.skuNumber = skuNumber;
            return this;
        }

        /**
         * Builds a new {@link SecuritySubscription} object using the set fields.
         * @return {@link SecuritySubscription}
         */
        public SecuritySubscription build() {
            return new SecuritySubscription(extendedAttributes, licenseAssigned, licenseAvailable,
                    licensePurchased, licenseType, skuNumber);
        }
    }
}
