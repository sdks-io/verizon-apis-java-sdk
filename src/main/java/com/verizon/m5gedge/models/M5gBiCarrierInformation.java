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
 * This is a model class for M5gBiCarrierInformation type.
 */
public class M5gBiCarrierInformation {
    private String carrierName;

    /**
     * Default constructor.
     */
    public M5gBiCarrierInformation() {
    }

    /**
     * Initialization constructor.
     * @param  carrierName  String value for carrierName.
     */
    public M5gBiCarrierInformation(
            String carrierName) {
        this.carrierName = carrierName;
    }

    /**
     * Getter for CarrierName.
     * @return Returns the String
     */
    @JsonGetter("carrierName")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getCarrierName() {
        return carrierName;
    }

    /**
     * Setter for CarrierName.
     * @param carrierName Value for String
     */
    @JsonSetter("carrierName")
    public void setCarrierName(String carrierName) {
        this.carrierName = carrierName;
    }

    /**
     * Converts this M5gBiCarrierInformation into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "M5gBiCarrierInformation [" + "carrierName=" + carrierName + "]";
    }

    /**
     * Builds a new {@link M5gBiCarrierInformation.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link M5gBiCarrierInformation.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .carrierName(getCarrierName());
        return builder;
    }

    /**
     * Class to build instances of {@link M5gBiCarrierInformation}.
     */
    public static class Builder {
        private String carrierName;



        /**
         * Setter for carrierName.
         * @param  carrierName  String value for carrierName.
         * @return Builder
         */
        public Builder carrierName(String carrierName) {
            this.carrierName = carrierName;
            return this;
        }

        /**
         * Builds a new {@link M5gBiCarrierInformation} object using the set fields.
         * @return {@link M5gBiCarrierInformation}
         */
        public M5gBiCarrierInformation build() {
            return new M5gBiCarrierInformation(carrierName);
        }
    }
}
