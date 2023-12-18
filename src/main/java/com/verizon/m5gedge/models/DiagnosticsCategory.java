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
 * This is a model class for DiagnosticsCategory type.
 */
public class DiagnosticsCategory {
    private String categoryName;
    private List<CustomFields> extendedAttributes;

    /**
     * Default constructor.
     */
    public DiagnosticsCategory() {
    }

    /**
     * Initialization constructor.
     * @param  categoryName  String value for categoryName.
     * @param  extendedAttributes  List of CustomFields value for extendedAttributes.
     */
    public DiagnosticsCategory(
            String categoryName,
            List<CustomFields> extendedAttributes) {
        this.categoryName = categoryName;
        this.extendedAttributes = extendedAttributes;
    }

    /**
     * Getter for CategoryName.
     * The name of the category.
     * @return Returns the String
     */
    @JsonGetter("categoryName")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getCategoryName() {
        return categoryName;
    }

    /**
     * Setter for CategoryName.
     * The name of the category.
     * @param categoryName Value for String
     */
    @JsonSetter("categoryName")
    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    /**
     * Getter for ExtendedAttributes.
     * A list of Extended Attribute objects as key-value pairs.
     * @return Returns the List of CustomFields
     */
    @JsonGetter("extendedAttributes")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<CustomFields> getExtendedAttributes() {
        return extendedAttributes;
    }

    /**
     * Setter for ExtendedAttributes.
     * A list of Extended Attribute objects as key-value pairs.
     * @param extendedAttributes Value for List of CustomFields
     */
    @JsonSetter("extendedAttributes")
    public void setExtendedAttributes(List<CustomFields> extendedAttributes) {
        this.extendedAttributes = extendedAttributes;
    }

    /**
     * Converts this DiagnosticsCategory into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "DiagnosticsCategory [" + "categoryName=" + categoryName + ", extendedAttributes="
                + extendedAttributes + "]";
    }

    /**
     * Builds a new {@link DiagnosticsCategory.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link DiagnosticsCategory.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .categoryName(getCategoryName())
                .extendedAttributes(getExtendedAttributes());
        return builder;
    }

    /**
     * Class to build instances of {@link DiagnosticsCategory}.
     */
    public static class Builder {
        private String categoryName;
        private List<CustomFields> extendedAttributes;



        /**
         * Setter for categoryName.
         * @param  categoryName  String value for categoryName.
         * @return Builder
         */
        public Builder categoryName(String categoryName) {
            this.categoryName = categoryName;
            return this;
        }

        /**
         * Setter for extendedAttributes.
         * @param  extendedAttributes  List of CustomFields value for extendedAttributes.
         * @return Builder
         */
        public Builder extendedAttributes(List<CustomFields> extendedAttributes) {
            this.extendedAttributes = extendedAttributes;
            return this;
        }

        /**
         * Builds a new {@link DiagnosticsCategory} object using the set fields.
         * @return {@link DiagnosticsCategory}
         */
        public DiagnosticsCategory build() {
            return new DiagnosticsCategory(categoryName, extendedAttributes);
        }
    }
}
