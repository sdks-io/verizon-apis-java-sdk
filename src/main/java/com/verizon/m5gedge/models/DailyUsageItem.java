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
 * This is a model class for DailyUsageItem type.
 */
public class DailyUsageItem {
    private String startTime;
    private String endTime;
    private Integer numBytes;

    /**
     * Default constructor.
     */
    public DailyUsageItem() {
    }

    /**
     * Initialization constructor.
     * @param  startTime  String value for startTime.
     * @param  endTime  String value for endTime.
     * @param  numBytes  Integer value for numBytes.
     */
    public DailyUsageItem(
            String startTime,
            String endTime,
            Integer numBytes) {
        this.startTime = startTime;
        this.endTime = endTime;
        this.numBytes = numBytes;
    }

    /**
     * Getter for StartTime.
     * Start date of session. ISO 8601 format.
     * @return Returns the String
     */
    @JsonGetter("startTime")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getStartTime() {
        return startTime;
    }

    /**
     * Setter for StartTime.
     * Start date of session. ISO 8601 format.
     * @param startTime Value for String
     */
    @JsonSetter("startTime")
    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    /**
     * Getter for EndTime.
     * End date of session. ISO 8601 format.
     * @return Returns the String
     */
    @JsonGetter("endTime")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getEndTime() {
        return endTime;
    }

    /**
     * Setter for EndTime.
     * End date of session. ISO 8601 format.
     * @param endTime Value for String
     */
    @JsonSetter("endTime")
    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    /**
     * Getter for NumBytes.
     * Amount of data transferred, measured in Bytes.
     * @return Returns the Integer
     */
    @JsonGetter("numBytes")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getNumBytes() {
        return numBytes;
    }

    /**
     * Setter for NumBytes.
     * Amount of data transferred, measured in Bytes.
     * @param numBytes Value for Integer
     */
    @JsonSetter("numBytes")
    public void setNumBytes(Integer numBytes) {
        this.numBytes = numBytes;
    }

    /**
     * Converts this DailyUsageItem into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "DailyUsageItem [" + "startTime=" + startTime + ", endTime=" + endTime
                + ", numBytes=" + numBytes + "]";
    }

    /**
     * Builds a new {@link DailyUsageItem.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link DailyUsageItem.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .startTime(getStartTime())
                .endTime(getEndTime())
                .numBytes(getNumBytes());
        return builder;
    }

    /**
     * Class to build instances of {@link DailyUsageItem}.
     */
    public static class Builder {
        private String startTime;
        private String endTime;
        private Integer numBytes;



        /**
         * Setter for startTime.
         * @param  startTime  String value for startTime.
         * @return Builder
         */
        public Builder startTime(String startTime) {
            this.startTime = startTime;
            return this;
        }

        /**
         * Setter for endTime.
         * @param  endTime  String value for endTime.
         * @return Builder
         */
        public Builder endTime(String endTime) {
            this.endTime = endTime;
            return this;
        }

        /**
         * Setter for numBytes.
         * @param  numBytes  Integer value for numBytes.
         * @return Builder
         */
        public Builder numBytes(Integer numBytes) {
            this.numBytes = numBytes;
            return this;
        }

        /**
         * Builds a new {@link DailyUsageItem} object using the set fields.
         * @return {@link DailyUsageItem}
         */
        public DailyUsageItem build() {
            return new DailyUsageItem(startTime, endTime, numBytes);
        }
    }
}
