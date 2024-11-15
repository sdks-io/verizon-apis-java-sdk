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
 * This is a model class for FotaV1CallbackRegistrationResult type.
 */
public class FotaV1CallbackRegistrationResult {
    private String accountName;
    private String serviceName;

    /**
     * Default constructor.
     */
    public FotaV1CallbackRegistrationResult() {
    }

    /**
     * Initialization constructor.
     * @param  accountName  String value for accountName.
     * @param  serviceName  String value for serviceName.
     */
    public FotaV1CallbackRegistrationResult(
            String accountName,
            String serviceName) {
        this.accountName = accountName;
        this.serviceName = serviceName;
    }

    /**
     * Getter for AccountName.
     * The name of the billing account for which callback messages will be sent.
     * @return Returns the String
     */
    @JsonGetter("accountName")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getAccountName() {
        return accountName;
    }

    /**
     * Setter for AccountName.
     * The name of the billing account for which callback messages will be sent.
     * @param accountName Value for String
     */
    @JsonSetter("accountName")
    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    /**
     * Getter for ServiceName.
     * The name of the callback service, which identifies the type and format of messages that will
     * be sent to the registered URL. This will be 'Fota' for the Software Management Services
     * callback.
     * @return Returns the String
     */
    @JsonGetter("serviceName")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getServiceName() {
        return serviceName;
    }

    /**
     * Setter for ServiceName.
     * The name of the callback service, which identifies the type and format of messages that will
     * be sent to the registered URL. This will be 'Fota' for the Software Management Services
     * callback.
     * @param serviceName Value for String
     */
    @JsonSetter("serviceName")
    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    /**
     * Converts this FotaV1CallbackRegistrationResult into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "FotaV1CallbackRegistrationResult [" + "accountName=" + accountName
                + ", serviceName=" + serviceName + "]";
    }

    /**
     * Builds a new {@link FotaV1CallbackRegistrationResult.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link FotaV1CallbackRegistrationResult.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .accountName(getAccountName())
                .serviceName(getServiceName());
        return builder;
    }

    /**
     * Class to build instances of {@link FotaV1CallbackRegistrationResult}.
     */
    public static class Builder {
        private String accountName;
        private String serviceName;



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
         * Setter for serviceName.
         * @param  serviceName  String value for serviceName.
         * @return Builder
         */
        public Builder serviceName(String serviceName) {
            this.serviceName = serviceName;
            return this;
        }

        /**
         * Builds a new {@link FotaV1CallbackRegistrationResult} object using the set fields.
         * @return {@link FotaV1CallbackRegistrationResult}
         */
        public FotaV1CallbackRegistrationResult build() {
            return new FotaV1CallbackRegistrationResult(accountName, serviceName);
        }
    }
}
