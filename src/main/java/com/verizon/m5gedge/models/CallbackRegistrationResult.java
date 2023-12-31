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
 * This is a model class for CallbackRegistrationResult type.
 */
public class CallbackRegistrationResult {
    private String account;
    private CallbackServiceNameEnum name;

    /**
     * Default constructor.
     */
    public CallbackRegistrationResult() {
    }

    /**
     * Initialization constructor.
     * @param  account  String value for account.
     * @param  name  CallbackServiceNameEnum value for name.
     */
    public CallbackRegistrationResult(
            String account,
            CallbackServiceNameEnum name) {
        this.account = account;
        this.name = name;
    }

    /**
     * Getter for Account.
     * The name of the account that registered the callback URL.
     * @return Returns the String
     */
    @JsonGetter("account")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getAccount() {
        return account;
    }

    /**
     * Setter for Account.
     * The name of the account that registered the callback URL.
     * @param account Value for String
     */
    @JsonSetter("account")
    public void setAccount(String account) {
        this.account = account;
    }

    /**
     * Getter for Name.
     * The name of the callback service.
     * @return Returns the CallbackServiceNameEnum
     */
    @JsonGetter("name")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public CallbackServiceNameEnum getName() {
        return name;
    }

    /**
     * Setter for Name.
     * The name of the callback service.
     * @param name Value for CallbackServiceNameEnum
     */
    @JsonSetter("name")
    public void setName(CallbackServiceNameEnum name) {
        this.name = name;
    }

    /**
     * Converts this CallbackRegistrationResult into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "CallbackRegistrationResult [" + "account=" + account + ", name=" + name + "]";
    }

    /**
     * Builds a new {@link CallbackRegistrationResult.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link CallbackRegistrationResult.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .account(getAccount())
                .name(getName());
        return builder;
    }

    /**
     * Class to build instances of {@link CallbackRegistrationResult}.
     */
    public static class Builder {
        private String account;
        private CallbackServiceNameEnum name;



        /**
         * Setter for account.
         * @param  account  String value for account.
         * @return Builder
         */
        public Builder account(String account) {
            this.account = account;
            return this;
        }

        /**
         * Setter for name.
         * @param  name  CallbackServiceNameEnum value for name.
         * @return Builder
         */
        public Builder name(CallbackServiceNameEnum name) {
            this.name = name;
            return this;
        }

        /**
         * Builds a new {@link CallbackRegistrationResult} object using the set fields.
         * @return {@link CallbackRegistrationResult}
         */
        public CallbackRegistrationResult build() {
            return new CallbackRegistrationResult(account, name);
        }
    }
}
