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
 * This is a model class for GroupName type.
 */
public class GroupName {
    private String mDefault;

    /**
     * Default constructor.
     */
    public GroupName() {
    }

    /**
     * Initialization constructor.
     * @param  mDefault  String value for mDefault.
     */
    public GroupName(
            String mDefault) {
        this.mDefault = mDefault;
    }

    /**
     * Getter for Default.
     * @return Returns the String
     */
    @JsonGetter("Default")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getDefault() {
        return mDefault;
    }

    /**
     * Setter for Default.
     * @param mDefault Value for String
     */
    @JsonSetter("Default")
    public void setDefault(String mDefault) {
        this.mDefault = mDefault;
    }

    /**
     * Converts this GroupName into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "GroupName [" + "mDefault=" + mDefault + "]";
    }

    /**
     * Builds a new {@link GroupName.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link GroupName.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .mDefault(getDefault());
        return builder;
    }

    /**
     * Class to build instances of {@link GroupName}.
     */
    public static class Builder {
        private String mDefault;



        /**
         * Setter for mDefault.
         * @param  mDefault  String value for mDefault.
         * @return Builder
         */
        public Builder mDefault(String mDefault) {
            this.mDefault = mDefault;
            return this;
        }

        /**
         * Builds a new {@link GroupName} object using the set fields.
         * @return {@link GroupName}
         */
        public GroupName build() {
            return new GroupName(mDefault);
        }
    }
}
