/*
 * VerizonLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.verizon.m5gedge.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * This is a model class for DeviceLabels type.
 */
public class DeviceLabels {
    private String name;
    private String value;

    /**
     * Default constructor.
     */
    public DeviceLabels() {
    }

    /**
     * Initialization constructor.
     * @param  name  String value for name.
     * @param  value  String value for value.
     */
    public DeviceLabels(
            String name,
            String value) {
        this.name = name;
        this.value = value;
    }

    /**
     * Getter for Name.
     * The label you want to associate with the device.
     * @return Returns the String
     */
    @JsonGetter("name")
    public String getName() {
        return name;
    }

    /**
     * Setter for Name.
     * The label you want to associate with the device.
     * @param name Value for String
     */
    @JsonSetter("name")
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Getter for Value.
     * The value of label
     * @return Returns the String
     */
    @JsonGetter("value")
    public String getValue() {
        return value;
    }

    /**
     * Setter for Value.
     * The value of label
     * @param value Value for String
     */
    @JsonSetter("value")
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Converts this DeviceLabels into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "DeviceLabels [" + "name=" + name + ", value=" + value + "]";
    }

    /**
     * Builds a new {@link DeviceLabels.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link DeviceLabels.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(name, value);
        return builder;
    }

    /**
     * Class to build instances of {@link DeviceLabels}.
     */
    public static class Builder {
        private String name;
        private String value;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  name  String value for name.
         * @param  value  String value for value.
         */
        public Builder(String name, String value) {
            this.name = name;
            this.value = value;
        }

        /**
         * Setter for name.
         * @param  name  String value for name.
         * @return Builder
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * Setter for value.
         * @param  value  String value for value.
         * @return Builder
         */
        public Builder value(String value) {
            this.value = value;
            return this;
        }

        /**
         * Builds a new {@link DeviceLabels} object using the set fields.
         * @return {@link DeviceLabels}
         */
        public DeviceLabels build() {
            return new DeviceLabels(name, value);
        }
    }
}
