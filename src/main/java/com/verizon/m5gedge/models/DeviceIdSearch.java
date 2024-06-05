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
 * This is a model class for DeviceIdSearch type.
 */
public class DeviceIdSearch {
    private String contains;
    private String startswith;
    private String endswith;
    private String kind;

    /**
     * Default constructor.
     */
    public DeviceIdSearch() {
    }

    /**
     * Initialization constructor.
     * @param  contains  String value for contains.
     * @param  kind  String value for kind.
     * @param  startswith  String value for startswith.
     * @param  endswith  String value for endswith.
     */
    public DeviceIdSearch(
            String contains,
            String kind,
            String startswith,
            String endswith) {
        this.contains = contains;
        this.startswith = startswith;
        this.endswith = endswith;
        this.kind = kind;
    }

    /**
     * Getter for Contains.
     * The string appears anywhere in the identifer.
     * @return Returns the String
     */
    @JsonGetter("contains")
    public String getContains() {
        return contains;
    }

    /**
     * Setter for Contains.
     * The string appears anywhere in the identifer.
     * @param contains Value for String
     */
    @JsonSetter("contains")
    public void setContains(String contains) {
        this.contains = contains;
    }

    /**
     * Getter for Startswith.
     * The identifer must start with the specified string.
     * @return Returns the String
     */
    @JsonGetter("startswith")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getStartswith() {
        return startswith;
    }

    /**
     * Setter for Startswith.
     * The identifer must start with the specified string.
     * @param startswith Value for String
     */
    @JsonSetter("startswith")
    public void setStartswith(String startswith) {
        this.startswith = startswith;
    }

    /**
     * Getter for Endswith.
     * The identifier must end with the specified string.
     * @return Returns the String
     */
    @JsonGetter("endswith")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getEndswith() {
        return endswith;
    }

    /**
     * Setter for Endswith.
     * The identifier must end with the specified string.
     * @param endswith Value for String
     */
    @JsonSetter("endswith")
    public void setEndswith(String endswith) {
        this.endswith = endswith;
    }

    /**
     * Getter for Kind.
     * The type of the device identifier. Valid types of identifiers are:ESN (decimal),EID,ICCID (up
     * to 20 digits),IMEI (up to 16 digits),MDN,MEID (hexadecimal),MSISDN.
     * @return Returns the String
     */
    @JsonGetter("kind")
    public String getKind() {
        return kind;
    }

    /**
     * Setter for Kind.
     * The type of the device identifier. Valid types of identifiers are:ESN (decimal),EID,ICCID (up
     * to 20 digits),IMEI (up to 16 digits),MDN,MEID (hexadecimal),MSISDN.
     * @param kind Value for String
     */
    @JsonSetter("kind")
    public void setKind(String kind) {
        this.kind = kind;
    }

    /**
     * Converts this DeviceIdSearch into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "DeviceIdSearch [" + "contains=" + contains + ", kind=" + kind + ", startswith="
                + startswith + ", endswith=" + endswith + "]";
    }

    /**
     * Builds a new {@link DeviceIdSearch.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link DeviceIdSearch.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(contains, kind)
                .startswith(getStartswith())
                .endswith(getEndswith());
        return builder;
    }

    /**
     * Class to build instances of {@link DeviceIdSearch}.
     */
    public static class Builder {
        private String contains;
        private String kind;
        private String startswith;
        private String endswith;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  contains  String value for contains.
         * @param  kind  String value for kind.
         */
        public Builder(String contains, String kind) {
            this.contains = contains;
            this.kind = kind;
        }

        /**
         * Setter for contains.
         * @param  contains  String value for contains.
         * @return Builder
         */
        public Builder contains(String contains) {
            this.contains = contains;
            return this;
        }

        /**
         * Setter for kind.
         * @param  kind  String value for kind.
         * @return Builder
         */
        public Builder kind(String kind) {
            this.kind = kind;
            return this;
        }

        /**
         * Setter for startswith.
         * @param  startswith  String value for startswith.
         * @return Builder
         */
        public Builder startswith(String startswith) {
            this.startswith = startswith;
            return this;
        }

        /**
         * Setter for endswith.
         * @param  endswith  String value for endswith.
         * @return Builder
         */
        public Builder endswith(String endswith) {
            this.endswith = endswith;
            return this;
        }

        /**
         * Builds a new {@link DeviceIdSearch} object using the set fields.
         * @return {@link DeviceIdSearch}
         */
        public DeviceIdSearch build() {
            return new DeviceIdSearch(contains, kind, startswith, endswith);
        }
    }
}
