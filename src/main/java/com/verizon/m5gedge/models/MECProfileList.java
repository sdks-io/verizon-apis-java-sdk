/*
 * VerizonLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.verizon.m5gedge.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;
import java.util.List;

/**
 * This is a model class for MECProfileList type.
 */
public class MECProfileList {
    private List<MECProfile> profiles;

    /**
     * Default constructor.
     */
    public MECProfileList() {
    }

    /**
     * Initialization constructor.
     * @param  profiles  List of MECProfile value for profiles.
     */
    public MECProfileList(
            List<MECProfile> profiles) {
        this.profiles = profiles;
    }

    /**
     * Getter for Profiles.
     * @return Returns the List of MECProfile
     */
    @JsonGetter("profiles")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<MECProfile> getProfiles() {
        return profiles;
    }

    /**
     * Setter for Profiles.
     * @param profiles Value for List of MECProfile
     */
    @JsonSetter("profiles")
    public void setProfiles(List<MECProfile> profiles) {
        this.profiles = profiles;
    }

    /**
     * Converts this MECProfileList into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "MECProfileList [" + "profiles=" + profiles + "]";
    }

    /**
     * Builds a new {@link MECProfileList.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link MECProfileList.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .profiles(getProfiles());
        return builder;
    }

    /**
     * Class to build instances of {@link MECProfileList}.
     */
    public static class Builder {
        private List<MECProfile> profiles;



        /**
         * Setter for profiles.
         * @param  profiles  List of MECProfile value for profiles.
         * @return Builder
         */
        public Builder profiles(List<MECProfile> profiles) {
            this.profiles = profiles;
            return this;
        }

        /**
         * Builds a new {@link MECProfileList} object using the set fields.
         * @return {@link MECProfileList}
         */
        public MECProfileList build() {
            return new MECProfileList(profiles);
        }
    }
}
