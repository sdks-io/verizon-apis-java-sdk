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
 * This is a model class for PromoAlert1 type.
 */
public class PromoAlert1 {
    private List<Object> filterCriteria;
    private List<Keyschunk2> condition;
    private Boolean enablePromoExp;

    /**
     * Default constructor.
     */
    public PromoAlert1() {
    }

    /**
     * Initialization constructor.
     * @param  filterCriteria  List of Object value for filterCriteria.
     * @param  condition  List of Keyschunk2 value for condition.
     * @param  enablePromoExp  Boolean value for enablePromoExp.
     */
    public PromoAlert1(
            List<Object> filterCriteria,
            List<Keyschunk2> condition,
            Boolean enablePromoExp) {
        this.filterCriteria = filterCriteria;
        this.condition = condition;
        this.enablePromoExp = enablePromoExp;
    }

    /**
     * Getter for FilterCriteria.
     * @return Returns the List of Object
     */
    @JsonGetter("filterCriteria")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<Object> getFilterCriteria() {
        return filterCriteria;
    }

    /**
     * Setter for FilterCriteria.
     * @param filterCriteria Value for List of Object
     */
    @JsonSetter("filterCriteria")
    public void setFilterCriteria(List<Object> filterCriteria) {
        this.filterCriteria = filterCriteria;
    }

    /**
     * Getter for Condition.
     * @return Returns the List of Keyschunk2
     */
    @JsonGetter("condition")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<Keyschunk2> getCondition() {
        return condition;
    }

    /**
     * Setter for Condition.
     * @param condition Value for List of Keyschunk2
     */
    @JsonSetter("condition")
    public void setCondition(List<Keyschunk2> condition) {
        this.condition = condition;
    }

    /**
     * Getter for EnablePromoExp.
     * @return Returns the Boolean
     */
    @JsonGetter("enablePromoExp")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getEnablePromoExp() {
        return enablePromoExp;
    }

    /**
     * Setter for EnablePromoExp.
     * @param enablePromoExp Value for Boolean
     */
    @JsonSetter("enablePromoExp")
    public void setEnablePromoExp(Boolean enablePromoExp) {
        this.enablePromoExp = enablePromoExp;
    }

    /**
     * Converts this PromoAlert1 into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "PromoAlert1 [" + "filterCriteria=" + filterCriteria + ", condition=" + condition
                + ", enablePromoExp=" + enablePromoExp + "]";
    }

    /**
     * Builds a new {@link PromoAlert1.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link PromoAlert1.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .filterCriteria(getFilterCriteria())
                .condition(getCondition())
                .enablePromoExp(getEnablePromoExp());
        return builder;
    }

    /**
     * Class to build instances of {@link PromoAlert1}.
     */
    public static class Builder {
        private List<Object> filterCriteria;
        private List<Keyschunk2> condition;
        private Boolean enablePromoExp;



        /**
         * Setter for filterCriteria.
         * @param  filterCriteria  List of Object value for filterCriteria.
         * @return Builder
         */
        public Builder filterCriteria(List<Object> filterCriteria) {
            this.filterCriteria = filterCriteria;
            return this;
        }

        /**
         * Setter for condition.
         * @param  condition  List of Keyschunk2 value for condition.
         * @return Builder
         */
        public Builder condition(List<Keyschunk2> condition) {
            this.condition = condition;
            return this;
        }

        /**
         * Setter for enablePromoExp.
         * @param  enablePromoExp  Boolean value for enablePromoExp.
         * @return Builder
         */
        public Builder enablePromoExp(Boolean enablePromoExp) {
            this.enablePromoExp = enablePromoExp;
            return this;
        }

        /**
         * Builds a new {@link PromoAlert1} object using the set fields.
         * @return {@link PromoAlert1}
         */
        public PromoAlert1 build() {
            return new PromoAlert1(filterCriteria, condition, enablePromoExp);
        }
    }
}
