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
 * This is a model class for SecuritySubscrIpTionResult type.
 */
public class SecuritySubscrIpTionResult {
    private String accountName;
    private List<SecuritySubscrIpTion> subscrIpTionList;

    /**
     * Default constructor.
     */
    public SecuritySubscrIpTionResult() {
    }

    /**
     * Initialization constructor.
     * @param  accountName  String value for accountName.
     * @param  subscrIpTionList  List of SecuritySubscrIpTion value for subscrIpTionList.
     */
    public SecuritySubscrIpTionResult(
            String accountName,
            List<SecuritySubscrIpTion> subscrIpTionList) {
        this.accountName = accountName;
        this.subscrIpTionList = subscrIpTionList;
    }

    /**
     * Getter for AccountName.
     * The name of a billing account.
     * @return Returns the String
     */
    @JsonGetter("accountName")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getAccountName() {
        return accountName;
    }

    /**
     * Setter for AccountName.
     * The name of a billing account.
     * @param accountName Value for String
     */
    @JsonSetter("accountName")
    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    /**
     * Getter for SubscrIpTionList.
     * The list of SKU numbers and counts for each license type specified in the request.
     * @return Returns the List of SecuritySubscrIpTion
     */
    @JsonGetter("subscriptionList")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<SecuritySubscrIpTion> getSubscrIpTionList() {
        return subscrIpTionList;
    }

    /**
     * Setter for SubscrIpTionList.
     * The list of SKU numbers and counts for each license type specified in the request.
     * @param subscrIpTionList Value for List of SecuritySubscrIpTion
     */
    @JsonSetter("subscriptionList")
    public void setSubscrIpTionList(List<SecuritySubscrIpTion> subscrIpTionList) {
        this.subscrIpTionList = subscrIpTionList;
    }

    /**
     * Converts this SecuritySubscrIpTionResult into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "SecuritySubscrIpTionResult [" + "accountName=" + accountName + ", subscrIpTionList="
                + subscrIpTionList + "]";
    }

    /**
     * Builds a new {@link SecuritySubscrIpTionResult.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link SecuritySubscrIpTionResult.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .accountName(getAccountName())
                .subscrIpTionList(getSubscrIpTionList());
        return builder;
    }

    /**
     * Class to build instances of {@link SecuritySubscrIpTionResult}.
     */
    public static class Builder {
        private String accountName;
        private List<SecuritySubscrIpTion> subscrIpTionList;



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
         * Setter for subscrIpTionList.
         * @param  subscrIpTionList  List of SecuritySubscrIpTion value for subscrIpTionList.
         * @return Builder
         */
        public Builder subscrIpTionList(List<SecuritySubscrIpTion> subscrIpTionList) {
            this.subscrIpTionList = subscrIpTionList;
            return this;
        }

        /**
         * Builds a new {@link SecuritySubscrIpTionResult} object using the set fields.
         * @return {@link SecuritySubscrIpTionResult}
         */
        public SecuritySubscrIpTionResult build() {
            return new SecuritySubscrIpTionResult(accountName, subscrIpTionList);
        }
    }
}
