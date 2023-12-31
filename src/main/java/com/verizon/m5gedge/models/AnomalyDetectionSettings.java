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
 * This is a model class for AnomalyDetectionSettings type.
 */
public class AnomalyDetectionSettings {
    private String accountName;
    private SensitivityParameters sensitivityParameter;
    private String status;

    /**
     * Default constructor.
     */
    public AnomalyDetectionSettings() {
    }

    /**
     * Initialization constructor.
     * @param  accountName  String value for accountName.
     * @param  sensitivityParameter  SensitivityParameters value for sensitivityParameter.
     * @param  status  String value for status.
     */
    public AnomalyDetectionSettings(
            String accountName,
            SensitivityParameters sensitivityParameter,
            String status) {
        this.accountName = accountName;
        this.sensitivityParameter = sensitivityParameter;
        this.status = status;
    }

    /**
     * Getter for AccountName.
     * Indicates if the account name used has anomaly detection.&lt;br /&gt;Success - The account has
     * anomaly detection.&lt;br /&gt;Failure - The account does not have anomaly detection.
     * @return Returns the String
     */
    @JsonGetter("accountName")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getAccountName() {
        return accountName;
    }

    /**
     * Setter for AccountName.
     * Indicates if the account name used has anomaly detection.&lt;br /&gt;Success - The account has
     * anomaly detection.&lt;br /&gt;Failure - The account does not have anomaly detection.
     * @param accountName Value for String
     */
    @JsonSetter("accountName")
    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    /**
     * Getter for SensitivityParameter.
     * Details for sensitivity parameters.
     * @return Returns the SensitivityParameters
     */
    @JsonGetter("sensitivityParameter")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public SensitivityParameters getSensitivityParameter() {
        return sensitivityParameter;
    }

    /**
     * Setter for SensitivityParameter.
     * Details for sensitivity parameters.
     * @param sensitivityParameter Value for SensitivityParameters
     */
    @JsonSetter("sensitivityParameter")
    public void setSensitivityParameter(SensitivityParameters sensitivityParameter) {
        this.sensitivityParameter = sensitivityParameter;
    }

    /**
     * Getter for Status.
     * Indicates if anomaly detection is active on the account&lt;br /&gt;Active - Anomaly detection is
     * active&lt;br /&gt;Disabled- Anomaly detection is not active.
     * @return Returns the String
     */
    @JsonGetter("status")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getStatus() {
        return status;
    }

    /**
     * Setter for Status.
     * Indicates if anomaly detection is active on the account&lt;br /&gt;Active - Anomaly detection is
     * active&lt;br /&gt;Disabled- Anomaly detection is not active.
     * @param status Value for String
     */
    @JsonSetter("status")
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * Converts this AnomalyDetectionSettings into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "AnomalyDetectionSettings [" + "accountName=" + accountName
                + ", sensitivityParameter=" + sensitivityParameter + ", status=" + status + "]";
    }

    /**
     * Builds a new {@link AnomalyDetectionSettings.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link AnomalyDetectionSettings.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .accountName(getAccountName())
                .sensitivityParameter(getSensitivityParameter())
                .status(getStatus());
        return builder;
    }

    /**
     * Class to build instances of {@link AnomalyDetectionSettings}.
     */
    public static class Builder {
        private String accountName;
        private SensitivityParameters sensitivityParameter;
        private String status;



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
         * Setter for sensitivityParameter.
         * @param  sensitivityParameter  SensitivityParameters value for sensitivityParameter.
         * @return Builder
         */
        public Builder sensitivityParameter(SensitivityParameters sensitivityParameter) {
            this.sensitivityParameter = sensitivityParameter;
            return this;
        }

        /**
         * Setter for status.
         * @param  status  String value for status.
         * @return Builder
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * Builds a new {@link AnomalyDetectionSettings} object using the set fields.
         * @return {@link AnomalyDetectionSettings}
         */
        public AnomalyDetectionSettings build() {
            return new AnomalyDetectionSettings(accountName, sensitivityParameter, status);
        }
    }
}
