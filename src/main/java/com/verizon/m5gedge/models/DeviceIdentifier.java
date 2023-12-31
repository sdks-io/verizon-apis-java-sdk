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
 * This is a model class for DeviceIdentifier type.
 */
public class DeviceIdentifier {
    private String kind;
    private String id;
    private String mdn;

    /**
     * Default constructor.
     */
    public DeviceIdentifier() {
    }

    /**
     * Initialization constructor.
     * @param  kind  String value for kind.
     * @param  id  String value for id.
     * @param  mdn  String value for mdn.
     */
    public DeviceIdentifier(
            String kind,
            String id,
            String mdn) {
        this.kind = kind;
        this.id = id;
        this.mdn = mdn;
    }

    /**
     * Getter for Kind.
     * Kind of device.
     * @return Returns the String
     */
    @JsonGetter("kind")
    public String getKind() {
        return kind;
    }

    /**
     * Setter for Kind.
     * Kind of device.
     * @param kind Value for String
     */
    @JsonSetter("kind")
    public void setKind(String kind) {
        this.kind = kind;
    }

    /**
     * Getter for Id.
     * Device Identity number.
     * @return Returns the String
     */
    @JsonGetter("id")
    public String getId() {
        return id;
    }

    /**
     * Setter for Id.
     * Device Identity number.
     * @param id Value for String
     */
    @JsonSetter("id")
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Getter for Mdn.
     * Device MDN number.
     * @return Returns the String
     */
    @JsonGetter("mdn")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getMdn() {
        return mdn;
    }

    /**
     * Setter for Mdn.
     * Device MDN number.
     * @param mdn Value for String
     */
    @JsonSetter("mdn")
    public void setMdn(String mdn) {
        this.mdn = mdn;
    }

    /**
     * Converts this DeviceIdentifier into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "DeviceIdentifier [" + "kind=" + kind + ", id=" + id + ", mdn=" + mdn + "]";
    }

    /**
     * Builds a new {@link DeviceIdentifier.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link DeviceIdentifier.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(kind, id)
                .mdn(getMdn());
        return builder;
    }

    /**
     * Class to build instances of {@link DeviceIdentifier}.
     */
    public static class Builder {
        private String kind;
        private String id;
        private String mdn;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  kind  String value for kind.
         * @param  id  String value for id.
         */
        public Builder(String kind, String id) {
            this.kind = kind;
            this.id = id;
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
         * Setter for id.
         * @param  id  String value for id.
         * @return Builder
         */
        public Builder id(String id) {
            this.id = id;
            return this;
        }

        /**
         * Setter for mdn.
         * @param  mdn  String value for mdn.
         * @return Builder
         */
        public Builder mdn(String mdn) {
            this.mdn = mdn;
            return this;
        }

        /**
         * Builds a new {@link DeviceIdentifier} object using the set fields.
         * @return {@link DeviceIdentifier}
         */
        public DeviceIdentifier build() {
            return new DeviceIdentifier(kind, id, mdn);
        }
    }
}
