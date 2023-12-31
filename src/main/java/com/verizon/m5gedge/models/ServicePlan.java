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
 * This is a model class for ServicePlan type.
 */
public class ServicePlan {
    private String carrierServicePlanCode;
    private String code;
    private List<CustomFields> extendedAttributes;
    private String name;
    private Long sizeKb;

    /**
     * Default constructor.
     */
    public ServicePlan() {
    }

    /**
     * Initialization constructor.
     * @param  carrierServicePlanCode  String value for carrierServicePlanCode.
     * @param  code  String value for code.
     * @param  extendedAttributes  List of CustomFields value for extendedAttributes.
     * @param  name  String value for name.
     * @param  sizeKb  Long value for sizeKb.
     */
    public ServicePlan(
            String carrierServicePlanCode,
            String code,
            List<CustomFields> extendedAttributes,
            String name,
            Long sizeKb) {
        this.carrierServicePlanCode = carrierServicePlanCode;
        this.code = code;
        this.extendedAttributes = extendedAttributes;
        this.name = name;
        this.sizeKb = sizeKb;
    }

    /**
     * Getter for CarrierServicePlanCode.
     * The code that is used by the carrier for the service plan.
     * @return Returns the String
     */
    @JsonGetter("carrierServicePlanCode")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getCarrierServicePlanCode() {
        return carrierServicePlanCode;
    }

    /**
     * Setter for CarrierServicePlanCode.
     * The code that is used by the carrier for the service plan.
     * @param carrierServicePlanCode Value for String
     */
    @JsonSetter("carrierServicePlanCode")
    public void setCarrierServicePlanCode(String carrierServicePlanCode) {
        this.carrierServicePlanCode = carrierServicePlanCode;
    }

    /**
     * Getter for Code.
     * The code of the service plan, which may not be the same as the name.
     * @return Returns the String
     */
    @JsonGetter("code")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getCode() {
        return code;
    }

    /**
     * Setter for Code.
     * The code of the service plan, which may not be the same as the name.
     * @param code Value for String
     */
    @JsonSetter("code")
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * Getter for ExtendedAttributes.
     * Any extended attributes for the service plan, as Key and Value pairs.
     * @return Returns the List of CustomFields
     */
    @JsonGetter("extendedAttributes")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<CustomFields> getExtendedAttributes() {
        return extendedAttributes;
    }

    /**
     * Setter for ExtendedAttributes.
     * Any extended attributes for the service plan, as Key and Value pairs.
     * @param extendedAttributes Value for List of CustomFields
     */
    @JsonSetter("extendedAttributes")
    public void setExtendedAttributes(List<CustomFields> extendedAttributes) {
        this.extendedAttributes = extendedAttributes;
    }

    /**
     * Getter for Name.
     * The name of the service plan.
     * @return Returns the String
     */
    @JsonGetter("name")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getName() {
        return name;
    }

    /**
     * Setter for Name.
     * The name of the service plan.
     * @param name Value for String
     */
    @JsonSetter("name")
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Getter for SizeKb.
     * The size of the service plan in kilobytes.
     * @return Returns the Long
     */
    @JsonGetter("sizeKb")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Long getSizeKb() {
        return sizeKb;
    }

    /**
     * Setter for SizeKb.
     * The size of the service plan in kilobytes.
     * @param sizeKb Value for Long
     */
    @JsonSetter("sizeKb")
    public void setSizeKb(Long sizeKb) {
        this.sizeKb = sizeKb;
    }

    /**
     * Converts this ServicePlan into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "ServicePlan [" + "carrierServicePlanCode=" + carrierServicePlanCode + ", code="
                + code + ", extendedAttributes=" + extendedAttributes + ", name=" + name
                + ", sizeKb=" + sizeKb + "]";
    }

    /**
     * Builds a new {@link ServicePlan.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link ServicePlan.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .carrierServicePlanCode(getCarrierServicePlanCode())
                .code(getCode())
                .extendedAttributes(getExtendedAttributes())
                .name(getName())
                .sizeKb(getSizeKb());
        return builder;
    }

    /**
     * Class to build instances of {@link ServicePlan}.
     */
    public static class Builder {
        private String carrierServicePlanCode;
        private String code;
        private List<CustomFields> extendedAttributes;
        private String name;
        private Long sizeKb;



        /**
         * Setter for carrierServicePlanCode.
         * @param  carrierServicePlanCode  String value for carrierServicePlanCode.
         * @return Builder
         */
        public Builder carrierServicePlanCode(String carrierServicePlanCode) {
            this.carrierServicePlanCode = carrierServicePlanCode;
            return this;
        }

        /**
         * Setter for code.
         * @param  code  String value for code.
         * @return Builder
         */
        public Builder code(String code) {
            this.code = code;
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
         * Setter for name.
         * @param  name  String value for name.
         * @return Builder
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * Setter for sizeKb.
         * @param  sizeKb  Long value for sizeKb.
         * @return Builder
         */
        public Builder sizeKb(Long sizeKb) {
            this.sizeKb = sizeKb;
            return this;
        }

        /**
         * Builds a new {@link ServicePlan} object using the set fields.
         * @return {@link ServicePlan}
         */
        public ServicePlan build() {
            return new ServicePlan(carrierServicePlanCode, code, extendedAttributes, name, sizeKb);
        }
    }
}
