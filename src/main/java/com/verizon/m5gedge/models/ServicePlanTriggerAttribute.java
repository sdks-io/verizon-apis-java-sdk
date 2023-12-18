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
 * This is a model class for ServicePlanTriggerAttribute type.
 */
public class ServicePlanTriggerAttribute {
    private String key;

    /**
     * Default constructor.
     */
    public ServicePlanTriggerAttribute() {
    }

    /**
     * Initialization constructor.
     * @param  key  String value for key.
     */
    public ServicePlanTriggerAttribute(
            String key) {
        this.key = key;
    }

    /**
     * Getter for Key.
     * The ServicePlan name will be listed here.
     * @return Returns the String
     */
    @JsonGetter("key")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getKey() {
        return key;
    }

    /**
     * Setter for Key.
     * The ServicePlan name will be listed here.
     * @param key Value for String
     */
    @JsonSetter("key")
    public void setKey(String key) {
        this.key = key;
    }

    /**
     * Converts this ServicePlanTriggerAttribute into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "ServicePlanTriggerAttribute [" + "key=" + key + "]";
    }

    /**
     * Builds a new {@link ServicePlanTriggerAttribute.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link ServicePlanTriggerAttribute.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .key(getKey());
        return builder;
    }

    /**
     * Class to build instances of {@link ServicePlanTriggerAttribute}.
     */
    public static class Builder {
        private String key;



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
         * Builds a new {@link ServicePlanTriggerAttribute} object using the set fields.
         * @return {@link ServicePlanTriggerAttribute}
         */
        public ServicePlanTriggerAttribute build() {
            return new ServicePlanTriggerAttribute(key);
        }
    }
}
