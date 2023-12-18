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
 * This is a model class for ListMECPlatformsResult type.
 */
public class ListMECPlatformsResult {
    private List<MECPlatformResource> mECPlatforms;

    /**
     * Default constructor.
     */
    public ListMECPlatformsResult() {
    }

    /**
     * Initialization constructor.
     * @param  mECPlatforms  List of MECPlatformResource value for mECPlatforms.
     */
    public ListMECPlatformsResult(
            List<MECPlatformResource> mECPlatforms) {
        this.mECPlatforms = mECPlatforms;
    }

    /**
     * Getter for MECPlatforms.
     * A list of optimal MEC Platforms where you can register your deployed application.
     * @return Returns the List of MECPlatformResource
     */
    @JsonGetter("MECPlatforms")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<MECPlatformResource> getMECPlatforms() {
        return mECPlatforms;
    }

    /**
     * Setter for MECPlatforms.
     * A list of optimal MEC Platforms where you can register your deployed application.
     * @param mECPlatforms Value for List of MECPlatformResource
     */
    @JsonSetter("MECPlatforms")
    public void setMECPlatforms(List<MECPlatformResource> mECPlatforms) {
        this.mECPlatforms = mECPlatforms;
    }

    /**
     * Converts this ListMECPlatformsResult into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "ListMECPlatformsResult [" + "mECPlatforms=" + mECPlatforms + "]";
    }

    /**
     * Builds a new {@link ListMECPlatformsResult.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link ListMECPlatformsResult.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .mECPlatforms(getMECPlatforms());
        return builder;
    }

    /**
     * Class to build instances of {@link ListMECPlatformsResult}.
     */
    public static class Builder {
        private List<MECPlatformResource> mECPlatforms;



        /**
         * Setter for mECPlatforms.
         * @param  mECPlatforms  List of MECPlatformResource value for mECPlatforms.
         * @return Builder
         */
        public Builder mECPlatforms(List<MECPlatformResource> mECPlatforms) {
            this.mECPlatforms = mECPlatforms;
            return this;
        }

        /**
         * Builds a new {@link ListMECPlatformsResult} object using the set fields.
         * @return {@link ListMECPlatformsResult}
         */
        public ListMECPlatformsResult build() {
            return new ListMECPlatformsResult(mECPlatforms);
        }
    }
}
