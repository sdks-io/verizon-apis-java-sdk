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
 * This is a model class for DeviceList2 type.
 */
public class DeviceList2 {
    private List<DeviceId2> ids;

    /**
     * Default constructor.
     */
    public DeviceList2() {
    }

    /**
     * Initialization constructor.
     * @param  ids  List of DeviceId2 value for ids.
     */
    public DeviceList2(
            List<DeviceId2> ids) {
        this.ids = ids;
    }

    /**
     * Getter for Ids.
     * @return Returns the List of DeviceId2
     */
    @JsonGetter("ids")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<DeviceId2> getIds() {
        return ids;
    }

    /**
     * Setter for Ids.
     * @param ids Value for List of DeviceId2
     */
    @JsonSetter("ids")
    public void setIds(List<DeviceId2> ids) {
        this.ids = ids;
    }

    /**
     * Converts this DeviceList2 into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "DeviceList2 [" + "ids=" + ids + "]";
    }

    /**
     * Builds a new {@link DeviceList2.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link DeviceList2.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .ids(getIds());
        return builder;
    }

    /**
     * Class to build instances of {@link DeviceList2}.
     */
    public static class Builder {
        private List<DeviceId2> ids;



        /**
         * Setter for ids.
         * @param  ids  List of DeviceId2 value for ids.
         * @return Builder
         */
        public Builder ids(List<DeviceId2> ids) {
            this.ids = ids;
            return this;
        }

        /**
         * Builds a new {@link DeviceList2} object using the set fields.
         * @return {@link DeviceList2}
         */
        public DeviceList2 build() {
            return new DeviceList2(ids);
        }
    }
}
