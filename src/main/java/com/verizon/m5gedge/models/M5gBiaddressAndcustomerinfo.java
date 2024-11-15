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
 * This is a model class for M5gBiaddressAndcustomerinfo type.
 */
public class M5gBiaddressAndcustomerinfo {
    private M5gBiprimaryPlaceofuse primaryPlaceofuse;

    /**
     * Default constructor.
     */
    public M5gBiaddressAndcustomerinfo() {
    }

    /**
     * Initialization constructor.
     * @param  primaryPlaceofuse  M5gBiprimaryPlaceofuse value for primaryPlaceofuse.
     */
    public M5gBiaddressAndcustomerinfo(
            M5gBiprimaryPlaceofuse primaryPlaceofuse) {
        this.primaryPlaceofuse = primaryPlaceofuse;
    }

    /**
     * Getter for PrimaryPlaceofuse.
     * @return Returns the M5gBiprimaryPlaceofuse
     */
    @JsonGetter("primaryPlaceofuse")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public M5gBiprimaryPlaceofuse getPrimaryPlaceofuse() {
        return primaryPlaceofuse;
    }

    /**
     * Setter for PrimaryPlaceofuse.
     * @param primaryPlaceofuse Value for M5gBiprimaryPlaceofuse
     */
    @JsonSetter("primaryPlaceofuse")
    public void setPrimaryPlaceofuse(M5gBiprimaryPlaceofuse primaryPlaceofuse) {
        this.primaryPlaceofuse = primaryPlaceofuse;
    }

    /**
     * Converts this M5gBiaddressAndcustomerinfo into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "M5gBiaddressAndcustomerinfo [" + "primaryPlaceofuse=" + primaryPlaceofuse + "]";
    }

    /**
     * Builds a new {@link M5gBiaddressAndcustomerinfo.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link M5gBiaddressAndcustomerinfo.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .primaryPlaceofuse(getPrimaryPlaceofuse());
        return builder;
    }

    /**
     * Class to build instances of {@link M5gBiaddressAndcustomerinfo}.
     */
    public static class Builder {
        private M5gBiprimaryPlaceofuse primaryPlaceofuse;



        /**
         * Setter for primaryPlaceofuse.
         * @param  primaryPlaceofuse  M5gBiprimaryPlaceofuse value for primaryPlaceofuse.
         * @return Builder
         */
        public Builder primaryPlaceofuse(M5gBiprimaryPlaceofuse primaryPlaceofuse) {
            this.primaryPlaceofuse = primaryPlaceofuse;
            return this;
        }

        /**
         * Builds a new {@link M5gBiaddressAndcustomerinfo} object using the set fields.
         * @return {@link M5gBiaddressAndcustomerinfo}
         */
        public M5gBiaddressAndcustomerinfo build() {
            return new M5gBiaddressAndcustomerinfo(primaryPlaceofuse);
        }
    }
}
