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
 * This is a model class for DeviceExtendedDiagnosticsResult type.
 */
public class DeviceExtendedDiagnosticsResult {
    private List<DiagnosticsCategory> categories;

    /**
     * Default constructor.
     */
    public DeviceExtendedDiagnosticsResult() {
    }

    /**
     * Initialization constructor.
     * @param  categories  List of DiagnosticsCategory value for categories.
     */
    public DeviceExtendedDiagnosticsResult(
            List<DiagnosticsCategory> categories) {
        this.categories = categories;
    }

    /**
     * Getter for Categories.
     * The response includes various types of information about the device, grouped into categories.
     * Each category object contains the category name and a list of Extended Attribute objects as
     * key-value pairs.
     * @return Returns the List of DiagnosticsCategory
     */
    @JsonGetter("categories")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<DiagnosticsCategory> getCategories() {
        return categories;
    }

    /**
     * Setter for Categories.
     * The response includes various types of information about the device, grouped into categories.
     * Each category object contains the category name and a list of Extended Attribute objects as
     * key-value pairs.
     * @param categories Value for List of DiagnosticsCategory
     */
    @JsonSetter("categories")
    public void setCategories(List<DiagnosticsCategory> categories) {
        this.categories = categories;
    }

    /**
     * Converts this DeviceExtendedDiagnosticsResult into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "DeviceExtendedDiagnosticsResult [" + "categories=" + categories + "]";
    }

    /**
     * Builds a new {@link DeviceExtendedDiagnosticsResult.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link DeviceExtendedDiagnosticsResult.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .categories(getCategories());
        return builder;
    }

    /**
     * Class to build instances of {@link DeviceExtendedDiagnosticsResult}.
     */
    public static class Builder {
        private List<DiagnosticsCategory> categories;



        /**
         * Setter for categories.
         * @param  categories  List of DiagnosticsCategory value for categories.
         * @return Builder
         */
        public Builder categories(List<DiagnosticsCategory> categories) {
            this.categories = categories;
            return this;
        }

        /**
         * Builds a new {@link DeviceExtendedDiagnosticsResult} object using the set fields.
         * @return {@link DeviceExtendedDiagnosticsResult}
         */
        public DeviceExtendedDiagnosticsResult build() {
            return new DeviceExtendedDiagnosticsResult(categories);
        }
    }
}
