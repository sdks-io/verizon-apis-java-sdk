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
 * This is a model class for AggregatedReportCallbackResult type.
 */
public class AggregatedReportCallbackResult {
    private String txid;
    private AggregatedReportCallbackStatusEnum status;

    /**
     * Default constructor.
     */
    public AggregatedReportCallbackResult() {
    }

    /**
     * Initialization constructor.
     * @param  txid  String value for txid.
     * @param  status  AggregatedReportCallbackStatusEnum value for status.
     */
    public AggregatedReportCallbackResult(
            String txid,
            AggregatedReportCallbackStatusEnum status) {
        this.txid = txid;
        this.status = status;
    }

    /**
     * Getter for Txid.
     * A unique string that associates the request with the location report information that is sent
     * in asynchronous callback message.ThingSpace will send a separate callback message for each
     * device that was in the request. All of the callback messages will have the same txid.
     * @return Returns the String
     */
    @JsonGetter("txid")
    public String getTxid() {
        return txid;
    }

    /**
     * Setter for Txid.
     * A unique string that associates the request with the location report information that is sent
     * in asynchronous callback message.ThingSpace will send a separate callback message for each
     * device that was in the request. All of the callback messages will have the same txid.
     * @param txid Value for String
     */
    @JsonSetter("txid")
    public void setTxid(String txid) {
        this.txid = txid;
    }

    /**
     * Getter for Status.
     * QUEUED or COMPLETED. Requests for IoT devices with cacheMode=0 (cached) have
     * status=COMPLETED; all other requests are QUEUED.
     * @return Returns the AggregatedReportCallbackStatusEnum
     */
    @JsonGetter("status")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public AggregatedReportCallbackStatusEnum getStatus() {
        return status;
    }

    /**
     * Setter for Status.
     * QUEUED or COMPLETED. Requests for IoT devices with cacheMode=0 (cached) have
     * status=COMPLETED; all other requests are QUEUED.
     * @param status Value for AggregatedReportCallbackStatusEnum
     */
    @JsonSetter("status")
    public void setStatus(AggregatedReportCallbackStatusEnum status) {
        this.status = status;
    }

    /**
     * Converts this AggregatedReportCallbackResult into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "AggregatedReportCallbackResult [" + "txid=" + txid + ", status=" + status + "]";
    }

    /**
     * Builds a new {@link AggregatedReportCallbackResult.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link AggregatedReportCallbackResult.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(txid)
                .status(getStatus());
        return builder;
    }

    /**
     * Class to build instances of {@link AggregatedReportCallbackResult}.
     */
    public static class Builder {
        private String txid;
        private AggregatedReportCallbackStatusEnum status;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  txid  String value for txid.
         */
        public Builder(String txid) {
            this.txid = txid;
        }

        /**
         * Setter for txid.
         * @param  txid  String value for txid.
         * @return Builder
         */
        public Builder txid(String txid) {
            this.txid = txid;
            return this;
        }

        /**
         * Setter for status.
         * @param  status  AggregatedReportCallbackStatusEnum value for status.
         * @return Builder
         */
        public Builder status(AggregatedReportCallbackStatusEnum status) {
            this.status = status;
            return this;
        }

        /**
         * Builds a new {@link AggregatedReportCallbackResult} object using the set fields.
         * @return {@link AggregatedReportCallbackResult}
         */
        public AggregatedReportCallbackResult build() {
            return new AggregatedReportCallbackResult(txid, status);
        }
    }
}
