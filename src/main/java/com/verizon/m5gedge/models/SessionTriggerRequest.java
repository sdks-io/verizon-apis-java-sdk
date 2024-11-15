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
 * This is a model class for SessionTriggerRequest type.
 */
public class SessionTriggerRequest {
    private String comparator;
    private Integer threshold;

    /**
     * Default constructor.
     */
    public SessionTriggerRequest() {
    }

    /**
     * Initialization constructor.
     * @param  comparator  String value for comparator.
     * @param  threshold  Integer value for threshold.
     */
    public SessionTriggerRequest(
            String comparator,
            Integer threshold) {
        this.comparator = comparator;
        this.threshold = threshold;
    }

    /**
     * Getter for Comparator.
     * @return Returns the String
     */
    @JsonGetter("comparator")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getComparator() {
        return comparator;
    }

    /**
     * Setter for Comparator.
     * @param comparator Value for String
     */
    @JsonSetter("comparator")
    public void setComparator(String comparator) {
        this.comparator = comparator;
    }

    /**
     * Getter for Threshold.
     * @return Returns the Integer
     */
    @JsonGetter("threshold")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getThreshold() {
        return threshold;
    }

    /**
     * Setter for Threshold.
     * @param threshold Value for Integer
     */
    @JsonSetter("threshold")
    public void setThreshold(Integer threshold) {
        this.threshold = threshold;
    }

    /**
     * Converts this SessionTriggerRequest into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "SessionTriggerRequest [" + "comparator=" + comparator + ", threshold=" + threshold
                + "]";
    }

    /**
     * Builds a new {@link SessionTriggerRequest.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link SessionTriggerRequest.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .comparator(getComparator())
                .threshold(getThreshold());
        return builder;
    }

    /**
     * Class to build instances of {@link SessionTriggerRequest}.
     */
    public static class Builder {
        private String comparator;
        private Integer threshold;



        /**
         * Setter for comparator.
         * @param  comparator  String value for comparator.
         * @return Builder
         */
        public Builder comparator(String comparator) {
            this.comparator = comparator;
            return this;
        }

        /**
         * Setter for threshold.
         * @param  threshold  Integer value for threshold.
         * @return Builder
         */
        public Builder threshold(Integer threshold) {
            this.threshold = threshold;
            return this;
        }

        /**
         * Builds a new {@link SessionTriggerRequest} object using the set fields.
         * @return {@link SessionTriggerRequest}
         */
        public SessionTriggerRequest build() {
            return new SessionTriggerRequest(comparator, threshold);
        }
    }
}