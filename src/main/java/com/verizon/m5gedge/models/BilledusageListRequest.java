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
 * This is a model class for BilledusageListRequest type.
 */
public class BilledusageListRequest {
    private String accountName;
    private LabelsList labels;
    private List<DeviceList> deviceIds;
    private BillingCycle billingCycle;

    /**
     * Default constructor.
     */
    public BilledusageListRequest() {
    }

    /**
     * Initialization constructor.
     * @param  accountName  String value for accountName.
     * @param  labels  LabelsList value for labels.
     * @param  deviceIds  List of DeviceList value for deviceIds.
     * @param  billingCycle  BillingCycle value for billingCycle.
     */
    public BilledusageListRequest(
            String accountName,
            LabelsList labels,
            List<DeviceList> deviceIds,
            BillingCycle billingCycle) {
        this.accountName = accountName;
        this.labels = labels;
        this.deviceIds = deviceIds;
        this.billingCycle = billingCycle;
    }

    /**
     * Getter for AccountName.
     * @return Returns the String
     */
    @JsonGetter("accountName")
    public String getAccountName() {
        return accountName;
    }

    /**
     * Setter for AccountName.
     * @param accountName Value for String
     */
    @JsonSetter("accountName")
    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    /**
     * Getter for Labels.
     * @return Returns the LabelsList
     */
    @JsonGetter("labels")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public LabelsList getLabels() {
        return labels;
    }

    /**
     * Setter for Labels.
     * @param labels Value for LabelsList
     */
    @JsonSetter("labels")
    public void setLabels(LabelsList labels) {
        this.labels = labels;
    }

    /**
     * Getter for DeviceIds.
     * @return Returns the List of DeviceList
     */
    @JsonGetter("deviceIds")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<DeviceList> getDeviceIds() {
        return deviceIds;
    }

    /**
     * Setter for DeviceIds.
     * @param deviceIds Value for List of DeviceList
     */
    @JsonSetter("deviceIds")
    public void setDeviceIds(List<DeviceList> deviceIds) {
        this.deviceIds = deviceIds;
    }

    /**
     * Getter for BillingCycle.
     * @return Returns the BillingCycle
     */
    @JsonGetter("billingCycle")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public BillingCycle getBillingCycle() {
        return billingCycle;
    }

    /**
     * Setter for BillingCycle.
     * @param billingCycle Value for BillingCycle
     */
    @JsonSetter("billingCycle")
    public void setBillingCycle(BillingCycle billingCycle) {
        this.billingCycle = billingCycle;
    }

    /**
     * Converts this BilledusageListRequest into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "BilledusageListRequest [" + "accountName=" + accountName + ", labels=" + labels
                + ", deviceIds=" + deviceIds + ", billingCycle=" + billingCycle + "]";
    }

    /**
     * Builds a new {@link BilledusageListRequest.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link BilledusageListRequest.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(accountName)
                .labels(getLabels())
                .deviceIds(getDeviceIds())
                .billingCycle(getBillingCycle());
        return builder;
    }

    /**
     * Class to build instances of {@link BilledusageListRequest}.
     */
    public static class Builder {
        private String accountName;
        private LabelsList labels;
        private List<DeviceList> deviceIds;
        private BillingCycle billingCycle;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  accountName  String value for accountName.
         */
        public Builder(String accountName) {
            this.accountName = accountName;
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
         * Setter for labels.
         * @param  labels  LabelsList value for labels.
         * @return Builder
         */
        public Builder labels(LabelsList labels) {
            this.labels = labels;
            return this;
        }

        /**
         * Setter for deviceIds.
         * @param  deviceIds  List of DeviceList value for deviceIds.
         * @return Builder
         */
        public Builder deviceIds(List<DeviceList> deviceIds) {
            this.deviceIds = deviceIds;
            return this;
        }

        /**
         * Setter for billingCycle.
         * @param  billingCycle  BillingCycle value for billingCycle.
         * @return Builder
         */
        public Builder billingCycle(BillingCycle billingCycle) {
            this.billingCycle = billingCycle;
            return this;
        }

        /**
         * Builds a new {@link BilledusageListRequest} object using the set fields.
         * @return {@link BilledusageListRequest}
         */
        public BilledusageListRequest build() {
            return new BilledusageListRequest(accountName, labels, deviceIds, billingCycle);
        }
    }
}