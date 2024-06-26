/*
 * VerizonLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.verizon.m5gedge.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * This is a model class for DateFilter type.
 */
public class DateFilter {
    private String earliest;
    private String latest;

    /**
     * Default constructor.
     */
    public DateFilter() {
    }

    /**
     * Initialization constructor.
     * @param  earliest  String value for earliest.
     * @param  latest  String value for latest.
     */
    public DateFilter(
            String earliest,
            String latest) {
        this.earliest = earliest;
        this.latest = latest;
    }

    /**
     * Getter for Earliest.
     * Only include devices that were added after this date and time.
     * @return Returns the String
     */
    @JsonGetter("earliest")
    public String getEarliest() {
        return earliest;
    }

    /**
     * Setter for Earliest.
     * Only include devices that were added after this date and time.
     * @param earliest Value for String
     */
    @JsonSetter("earliest")
    public void setEarliest(String earliest) {
        this.earliest = earliest;
    }

    /**
     * Getter for Latest.
     * Only include devices that were added before this date and time.
     * @return Returns the String
     */
    @JsonGetter("latest")
    public String getLatest() {
        return latest;
    }

    /**
     * Setter for Latest.
     * Only include devices that were added before this date and time.
     * @param latest Value for String
     */
    @JsonSetter("latest")
    public void setLatest(String latest) {
        this.latest = latest;
    }

    /**
     * Converts this DateFilter into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "DateFilter [" + "earliest=" + earliest + ", latest=" + latest + "]";
    }

    /**
     * Builds a new {@link DateFilter.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link DateFilter.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(earliest, latest);
        return builder;
    }

    /**
     * Class to build instances of {@link DateFilter}.
     */
    public static class Builder {
        private String earliest;
        private String latest;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  earliest  String value for earliest.
         * @param  latest  String value for latest.
         */
        public Builder(String earliest, String latest) {
            this.earliest = earliest;
            this.latest = latest;
        }

        /**
         * Setter for earliest.
         * @param  earliest  String value for earliest.
         * @return Builder
         */
        public Builder earliest(String earliest) {
            this.earliest = earliest;
            return this;
        }

        /**
         * Setter for latest.
         * @param  latest  String value for latest.
         * @return Builder
         */
        public Builder latest(String latest) {
            this.latest = latest;
            return this;
        }

        /**
         * Builds a new {@link DateFilter} object using the set fields.
         * @return {@link DateFilter}
         */
        public DateFilter build() {
            return new DateFilter(earliest, latest);
        }
    }
}
