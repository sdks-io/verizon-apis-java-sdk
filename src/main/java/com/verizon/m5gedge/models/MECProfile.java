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
 * This is a model class for MECProfile type.
 */
public class MECProfile {
    private String profileId;
    private String profileName;

    /**
     * Default constructor.
     */
    public MECProfile() {
    }

    /**
     * Initialization constructor.
     * @param  profileId  String value for profileId.
     * @param  profileName  String value for profileName.
     */
    public MECProfile(
            String profileId,
            String profileName) {
        this.profileId = profileId;
        this.profileName = profileName;
    }

    /**
     * Getter for ProfileId.
     * @return Returns the String
     */
    @JsonGetter("profileId")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getProfileId() {
        return profileId;
    }

    /**
     * Setter for ProfileId.
     * @param profileId Value for String
     */
    @JsonSetter("profileId")
    public void setProfileId(String profileId) {
        this.profileId = profileId;
    }

    /**
     * Getter for ProfileName.
     * @return Returns the String
     */
    @JsonGetter("profileName")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getProfileName() {
        return profileName;
    }

    /**
     * Setter for ProfileName.
     * @param profileName Value for String
     */
    @JsonSetter("profileName")
    public void setProfileName(String profileName) {
        this.profileName = profileName;
    }

    /**
     * Converts this MECProfile into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "MECProfile [" + "profileId=" + profileId + ", profileName=" + profileName + "]";
    }

    /**
     * Builds a new {@link MECProfile.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link MECProfile.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .profileId(getProfileId())
                .profileName(getProfileName());
        return builder;
    }

    /**
     * Class to build instances of {@link MECProfile}.
     */
    public static class Builder {
        private String profileId;
        private String profileName;



        /**
         * Setter for profileId.
         * @param  profileId  String value for profileId.
         * @return Builder
         */
        public Builder profileId(String profileId) {
            this.profileId = profileId;
            return this;
        }

        /**
         * Setter for profileName.
         * @param  profileName  String value for profileName.
         * @return Builder
         */
        public Builder profileName(String profileName) {
            this.profileName = profileName;
            return this;
        }

        /**
         * Builds a new {@link MECProfile} object using the set fields.
         * @return {@link MECProfile}
         */
        public MECProfile build() {
            return new MECProfile(profileId, profileName);
        }
    }
}