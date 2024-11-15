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
 * This is a model class for CarrierServicePlan type.
 */
public class CarrierServicePlan {
    private String name;
    private String code;
    private String sizeKb;
    private String carrierServicePlanCode;

    /**
     * Default constructor.
     */
    public CarrierServicePlan() {
    }

    /**
     * Initialization constructor.
     * @param  name  String value for name.
     * @param  code  String value for code.
     * @param  sizeKb  String value for sizeKb.
     * @param  carrierServicePlanCode  String value for carrierServicePlanCode.
     */
    public CarrierServicePlan(
            String name,
            String code,
            String sizeKb,
            String carrierServicePlanCode) {
        this.name = name;
        this.code = code;
        this.sizeKb = sizeKb;
        this.carrierServicePlanCode = carrierServicePlanCode;
    }

    /**
     * Getter for Name.
     * The name of the service plan
     * @return Returns the String
     */
    @JsonGetter("name")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getName() {
        return name;
    }

    /**
     * Setter for Name.
     * The name of the service plan
     * @param name Value for String
     */
    @JsonSetter("name")
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Getter for Code.
     * The inventory name or system name of the service plan
     * @return Returns the String
     */
    @JsonGetter("code")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getCode() {
        return code;
    }

    /**
     * Setter for Code.
     * The inventory name or system name of the service plan
     * @param code Value for String
     */
    @JsonSetter("code")
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * Getter for SizeKb.
     * The ammount of space the service plan will occupy on the Subscriber Information Module (SIM)
     * @return Returns the String
     */
    @JsonGetter("sizeKb")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getSizeKb() {
        return sizeKb;
    }

    /**
     * Setter for SizeKb.
     * The ammount of space the service plan will occupy on the Subscriber Information Module (SIM)
     * @param sizeKb Value for String
     */
    @JsonSetter("sizeKb")
    public void setSizeKb(String sizeKb) {
        this.sizeKb = sizeKb;
    }

    /**
     * Getter for CarrierServicePlanCode.
     * The billing record ID. This can be numeric, alpha or alphanumeric.
     * @return Returns the String
     */
    @JsonGetter("carrierServicePlanCode")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getCarrierServicePlanCode() {
        return carrierServicePlanCode;
    }

    /**
     * Setter for CarrierServicePlanCode.
     * The billing record ID. This can be numeric, alpha or alphanumeric.
     * @param carrierServicePlanCode Value for String
     */
    @JsonSetter("carrierServicePlanCode")
    public void setCarrierServicePlanCode(String carrierServicePlanCode) {
        this.carrierServicePlanCode = carrierServicePlanCode;
    }

    /**
     * Converts this CarrierServicePlan into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "CarrierServicePlan [" + "name=" + name + ", code=" + code + ", sizeKb=" + sizeKb
                + ", carrierServicePlanCode=" + carrierServicePlanCode + "]";
    }

    /**
     * Builds a new {@link CarrierServicePlan.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link CarrierServicePlan.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .name(getName())
                .code(getCode())
                .sizeKb(getSizeKb())
                .carrierServicePlanCode(getCarrierServicePlanCode());
        return builder;
    }

    /**
     * Class to build instances of {@link CarrierServicePlan}.
     */
    public static class Builder {
        private String name;
        private String code;
        private String sizeKb;
        private String carrierServicePlanCode;



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
         * Setter for code.
         * @param  code  String value for code.
         * @return Builder
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Setter for sizeKb.
         * @param  sizeKb  String value for sizeKb.
         * @return Builder
         */
        public Builder sizeKb(String sizeKb) {
            this.sizeKb = sizeKb;
            return this;
        }

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
         * Builds a new {@link CarrierServicePlan} object using the set fields.
         * @return {@link CarrierServicePlan}
         */
        public CarrierServicePlan build() {
            return new CarrierServicePlan(name, code, sizeKb, carrierServicePlanCode);
        }
    }
}
