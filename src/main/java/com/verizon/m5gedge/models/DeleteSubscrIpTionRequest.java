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
 * This is a model class for DeleteSubscrIpTionRequest type.
 */
public class DeleteSubscrIpTionRequest {
    private AccountIdentifier accountidentifier;
    private ResourceIdentifier resourceidentifier;

    /**
     * Default constructor.
     */
    public DeleteSubscrIpTionRequest() {
    }

    /**
     * Initialization constructor.
     * @param  accountidentifier  AccountIdentifier value for accountidentifier.
     * @param  resourceidentifier  ResourceIdentifier value for resourceidentifier.
     */
    public DeleteSubscrIpTionRequest(
            AccountIdentifier accountidentifier,
            ResourceIdentifier resourceidentifier) {
        this.accountidentifier = accountidentifier;
        this.resourceidentifier = resourceidentifier;
    }

    /**
     * Getter for Accountidentifier.
     * The ID of the authenticating billing account, in the format
     * `{"billingaccountid":"1234567890-12345"}`.
     * @return Returns the AccountIdentifier
     */
    @JsonGetter("accountidentifier")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public AccountIdentifier getAccountidentifier() {
        return accountidentifier;
    }

    /**
     * Setter for Accountidentifier.
     * The ID of the authenticating billing account, in the format
     * `{"billingaccountid":"1234567890-12345"}`.
     * @param accountidentifier Value for AccountIdentifier
     */
    @JsonSetter("accountidentifier")
    public void setAccountidentifier(AccountIdentifier accountidentifier) {
        this.accountidentifier = accountidentifier;
    }

    /**
     * Getter for Resourceidentifier.
     * The ID of the target to delete, in the format {"id": "dd1682d3-2d80-cefc-f3ee-25154800beff"}.
     * @return Returns the ResourceIdentifier
     */
    @JsonGetter("resourceidentifier")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public ResourceIdentifier getResourceidentifier() {
        return resourceidentifier;
    }

    /**
     * Setter for Resourceidentifier.
     * The ID of the target to delete, in the format {"id": "dd1682d3-2d80-cefc-f3ee-25154800beff"}.
     * @param resourceidentifier Value for ResourceIdentifier
     */
    @JsonSetter("resourceidentifier")
    public void setResourceidentifier(ResourceIdentifier resourceidentifier) {
        this.resourceidentifier = resourceidentifier;
    }

    /**
     * Converts this DeleteSubscrIpTionRequest into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "DeleteSubscrIpTionRequest [" + "accountidentifier=" + accountidentifier
                + ", resourceidentifier=" + resourceidentifier + "]";
    }

    /**
     * Builds a new {@link DeleteSubscrIpTionRequest.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link DeleteSubscrIpTionRequest.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .accountidentifier(getAccountidentifier())
                .resourceidentifier(getResourceidentifier());
        return builder;
    }

    /**
     * Class to build instances of {@link DeleteSubscrIpTionRequest}.
     */
    public static class Builder {
        private AccountIdentifier accountidentifier;
        private ResourceIdentifier resourceidentifier;



        /**
         * Setter for accountidentifier.
         * @param  accountidentifier  AccountIdentifier value for accountidentifier.
         * @return Builder
         */
        public Builder accountidentifier(AccountIdentifier accountidentifier) {
            this.accountidentifier = accountidentifier;
            return this;
        }

        /**
         * Setter for resourceidentifier.
         * @param  resourceidentifier  ResourceIdentifier value for resourceidentifier.
         * @return Builder
         */
        public Builder resourceidentifier(ResourceIdentifier resourceidentifier) {
            this.resourceidentifier = resourceidentifier;
            return this;
        }

        /**
         * Builds a new {@link DeleteSubscrIpTionRequest} object using the set fields.
         * @return {@link DeleteSubscrIpTionRequest}
         */
        public DeleteSubscrIpTionRequest build() {
            return new DeleteSubscrIpTionRequest(accountidentifier, resourceidentifier);
        }
    }
}
