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
 * This is a model class for PricePlanTrigger type.
 */
public class PricePlanTrigger {
    private AccountGroupShare accountGroupShare;

    /**
     * Default constructor.
     */
    public PricePlanTrigger() {
    }

    /**
     * Initialization constructor.
     * @param  accountGroupShare  AccountGroupShare value for accountGroupShare.
     */
    public PricePlanTrigger(
            AccountGroupShare accountGroupShare) {
        this.accountGroupShare = accountGroupShare;
    }

    /**
     * Getter for AccountGroupShare.
     * @return Returns the AccountGroupShare
     */
    @JsonGetter("accountGroupShare")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public AccountGroupShare getAccountGroupShare() {
        return accountGroupShare;
    }

    /**
     * Setter for AccountGroupShare.
     * @param accountGroupShare Value for AccountGroupShare
     */
    @JsonSetter("accountGroupShare")
    public void setAccountGroupShare(AccountGroupShare accountGroupShare) {
        this.accountGroupShare = accountGroupShare;
    }

    /**
     * Converts this PricePlanTrigger into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "PricePlanTrigger [" + "accountGroupShare=" + accountGroupShare + "]";
    }

    /**
     * Builds a new {@link PricePlanTrigger.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link PricePlanTrigger.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .accountGroupShare(getAccountGroupShare());
        return builder;
    }

    /**
     * Class to build instances of {@link PricePlanTrigger}.
     */
    public static class Builder {
        private AccountGroupShare accountGroupShare;



        /**
         * Setter for accountGroupShare.
         * @param  accountGroupShare  AccountGroupShare value for accountGroupShare.
         * @return Builder
         */
        public Builder accountGroupShare(AccountGroupShare accountGroupShare) {
            this.accountGroupShare = accountGroupShare;
            return this;
        }

        /**
         * Builds a new {@link PricePlanTrigger} object using the set fields.
         * @return {@link PricePlanTrigger}
         */
        public PricePlanTrigger build() {
            return new PricePlanTrigger(accountGroupShare);
        }
    }
}