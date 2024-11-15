/*
 * VerizonLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.verizon.m5gedge.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * This is a model class for FotaV3SuccessResult type.
 */
public class FotaV3SuccessResult {
    private boolean success;

    /**
     * Default constructor.
     */
    public FotaV3SuccessResult() {
    }

    /**
     * Initialization constructor.
     * @param  success  boolean value for success.
     */
    public FotaV3SuccessResult(
            boolean success) {
        this.success = success;
    }

    /**
     * Getter for Success.
     * True or false.
     * @return Returns the boolean
     */
    @JsonGetter("success")
    public boolean getSuccess() {
        return success;
    }

    /**
     * Setter for Success.
     * True or false.
     * @param success Value for boolean
     */
    @JsonSetter("success")
    public void setSuccess(boolean success) {
        this.success = success;
    }

    /**
     * Converts this FotaV3SuccessResult into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "FotaV3SuccessResult [" + "success=" + success + "]";
    }

    /**
     * Builds a new {@link FotaV3SuccessResult.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link FotaV3SuccessResult.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(success);
        return builder;
    }

    /**
     * Class to build instances of {@link FotaV3SuccessResult}.
     */
    public static class Builder {
        private boolean success;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  success  boolean value for success.
         */
        public Builder(boolean success) {
            this.success = success;
        }

        /**
         * Setter for success.
         * @param  success  boolean value for success.
         * @return Builder
         */
        public Builder success(boolean success) {
            this.success = success;
            return this;
        }

        /**
         * Builds a new {@link FotaV3SuccessResult} object using the set fields.
         * @return {@link FotaV3SuccessResult}
         */
        public FotaV3SuccessResult build() {
            return new FotaV3SuccessResult(success);
        }
    }
}