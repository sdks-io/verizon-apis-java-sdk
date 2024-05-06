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
 * This is a model class for AggregateUsageItem type.
 */
public class AggregateUsageItem {
    private String imei;
    private Integer numberOfSessions;
    private Integer bytesTransferred;

    /**
     * Default constructor.
     */
    public AggregateUsageItem() {
    }

    /**
     * Initialization constructor.
     * @param  imei  String value for imei.
     * @param  numberOfSessions  Integer value for numberOfSessions.
     * @param  bytesTransferred  Integer value for bytesTransferred.
     */
    public AggregateUsageItem(
            String imei,
            Integer numberOfSessions,
            Integer bytesTransferred) {
        this.imei = imei;
        this.numberOfSessions = numberOfSessions;
        this.bytesTransferred = bytesTransferred;
    }

    /**
     * Getter for Imei.
     * International Mobile Equipment Identifier. This is the ID of the device reporting usage.
     * @return Returns the String
     */
    @JsonGetter("imei")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getImei() {
        return imei;
    }

    /**
     * Setter for Imei.
     * International Mobile Equipment Identifier. This is the ID of the device reporting usage.
     * @param imei Value for String
     */
    @JsonSetter("imei")
    public void setImei(String imei) {
        this.imei = imei;
    }

    /**
     * Getter for NumberOfSessions.
     * Number of sessions established by the device reporting usage.
     * @return Returns the Integer
     */
    @JsonGetter("numberOfSessions")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getNumberOfSessions() {
        return numberOfSessions;
    }

    /**
     * Setter for NumberOfSessions.
     * Number of sessions established by the device reporting usage.
     * @param numberOfSessions Value for Integer
     */
    @JsonSetter("numberOfSessions")
    public void setNumberOfSessions(Integer numberOfSessions) {
        this.numberOfSessions = numberOfSessions;
    }

    /**
     * Getter for BytesTransferred.
     * The amount of data transferred by the device reporting usage, measured in Bytes.
     * @return Returns the Integer
     */
    @JsonGetter("bytesTransferred")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getBytesTransferred() {
        return bytesTransferred;
    }

    /**
     * Setter for BytesTransferred.
     * The amount of data transferred by the device reporting usage, measured in Bytes.
     * @param bytesTransferred Value for Integer
     */
    @JsonSetter("bytesTransferred")
    public void setBytesTransferred(Integer bytesTransferred) {
        this.bytesTransferred = bytesTransferred;
    }

    /**
     * Converts this AggregateUsageItem into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "AggregateUsageItem [" + "imei=" + imei + ", numberOfSessions=" + numberOfSessions
                + ", bytesTransferred=" + bytesTransferred + "]";
    }

    /**
     * Builds a new {@link AggregateUsageItem.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link AggregateUsageItem.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .imei(getImei())
                .numberOfSessions(getNumberOfSessions())
                .bytesTransferred(getBytesTransferred());
        return builder;
    }

    /**
     * Class to build instances of {@link AggregateUsageItem}.
     */
    public static class Builder {
        private String imei;
        private Integer numberOfSessions;
        private Integer bytesTransferred;



        /**
         * Setter for imei.
         * @param  imei  String value for imei.
         * @return Builder
         */
        public Builder imei(String imei) {
            this.imei = imei;
            return this;
        }

        /**
         * Setter for numberOfSessions.
         * @param  numberOfSessions  Integer value for numberOfSessions.
         * @return Builder
         */
        public Builder numberOfSessions(Integer numberOfSessions) {
            this.numberOfSessions = numberOfSessions;
            return this;
        }

        /**
         * Setter for bytesTransferred.
         * @param  bytesTransferred  Integer value for bytesTransferred.
         * @return Builder
         */
        public Builder bytesTransferred(Integer bytesTransferred) {
            this.bytesTransferred = bytesTransferred;
            return this;
        }

        /**
         * Builds a new {@link AggregateUsageItem} object using the set fields.
         * @return {@link AggregateUsageItem}
         */
        public AggregateUsageItem build() {
            return new AggregateUsageItem(imei, numberOfSessions, bytesTransferred);
        }
    }
}
