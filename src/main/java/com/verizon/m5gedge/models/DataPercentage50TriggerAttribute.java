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
 * This is a model class for DataPercentage50TriggerAttribute type.
 */
public class DataPercentage50TriggerAttribute {
    private String key;
    private Boolean value;

    /**
     * Default constructor.
     */
    public DataPercentage50TriggerAttribute() {
    }

    /**
     * Initialization constructor.
     * @param  key  String value for key.
     * @param  value  Boolean value for value.
     */
    public DataPercentage50TriggerAttribute(
            String key,
            Boolean value) {
        this.key = key;
        this.value = value;
    }

    /**
     * Getter for Key.
     * Key data percentage 50.
     * @return Returns the String
     */
    @JsonGetter("key")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getKey() {
        return key;
    }

    /**
     * Setter for Key.
     * Key data percentage 50.
     * @param key Value for String
     */
    @JsonSetter("key")
    public void setKey(String key) {
        this.key = key;
    }

    /**
     * Getter for Value.
     * DataPercentage50&lt;br /&gt;True - Trigger on Data percentage is over 50% used&lt;br /&gt;False - Do not
     * trigger when over 50% used.
     * @return Returns the Boolean
     */
    @JsonGetter("value")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getValue() {
        return value;
    }

    /**
     * Setter for Value.
     * DataPercentage50&lt;br /&gt;True - Trigger on Data percentage is over 50% used&lt;br /&gt;False - Do not
     * trigger when over 50% used.
     * @param value Value for Boolean
     */
    @JsonSetter("value")
    public void setValue(Boolean value) {
        this.value = value;
    }

    /**
     * Converts this DataPercentage50TriggerAttribute into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "DataPercentage50TriggerAttribute [" + "key=" + key + ", value=" + value + "]";
    }

    /**
     * Builds a new {@link DataPercentage50TriggerAttribute.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link DataPercentage50TriggerAttribute.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .key(getKey())
                .value(getValue());
        return builder;
    }

    /**
     * Class to build instances of {@link DataPercentage50TriggerAttribute}.
     */
    public static class Builder {
        private String key;
        private Boolean value;



        /**
         * Setter for key.
         * @param  key  String value for key.
         * @return Builder
         */
        public Builder key(String key) {
            this.key = key;
            return this;
        }

        /**
         * Setter for value.
         * @param  value  Boolean value for value.
         * @return Builder
         */
        public Builder value(Boolean value) {
            this.value = value;
            return this;
        }

        /**
         * Builds a new {@link DataPercentage50TriggerAttribute} object using the set fields.
         * @return {@link DataPercentage50TriggerAttribute}
         */
        public DataPercentage50TriggerAttribute build() {
            return new DataPercentage50TriggerAttribute(key, value);
        }
    }
}
