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
 * This is a model class for Keyschunk2 type.
 */
public class Keyschunk2 {
    private Boolean dataPercentage50;
    private Boolean dataPercentage75;
    private Boolean dataPercentage90;
    private Boolean dataPercentage100;
    private Boolean smsPercentage50;
    private Boolean smsPercentage75;
    private Boolean smsPercentage90;
    private Boolean smsPercentage100;
    private Integer noOfDaysB4PromoExp;

    /**
     * Default constructor.
     */
    public Keyschunk2() {
    }

    /**
     * Initialization constructor.
     * @param  dataPercentage50  Boolean value for dataPercentage50.
     * @param  dataPercentage75  Boolean value for dataPercentage75.
     * @param  dataPercentage90  Boolean value for dataPercentage90.
     * @param  dataPercentage100  Boolean value for dataPercentage100.
     * @param  smsPercentage50  Boolean value for smsPercentage50.
     * @param  smsPercentage75  Boolean value for smsPercentage75.
     * @param  smsPercentage90  Boolean value for smsPercentage90.
     * @param  smsPercentage100  Boolean value for smsPercentage100.
     * @param  noOfDaysB4PromoExp  Integer value for noOfDaysB4PromoExp.
     */
    public Keyschunk2(
            Boolean dataPercentage50,
            Boolean dataPercentage75,
            Boolean dataPercentage90,
            Boolean dataPercentage100,
            Boolean smsPercentage50,
            Boolean smsPercentage75,
            Boolean smsPercentage90,
            Boolean smsPercentage100,
            Integer noOfDaysB4PromoExp) {
        this.dataPercentage50 = dataPercentage50;
        this.dataPercentage75 = dataPercentage75;
        this.dataPercentage90 = dataPercentage90;
        this.dataPercentage100 = dataPercentage100;
        this.smsPercentage50 = smsPercentage50;
        this.smsPercentage75 = smsPercentage75;
        this.smsPercentage90 = smsPercentage90;
        this.smsPercentage100 = smsPercentage100;
        this.noOfDaysB4PromoExp = noOfDaysB4PromoExp;
    }

    /**
     * Getter for DataPercentage50.
     * @return Returns the Boolean
     */
    @JsonGetter("dataPercentage50")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getDataPercentage50() {
        return dataPercentage50;
    }

    /**
     * Setter for DataPercentage50.
     * @param dataPercentage50 Value for Boolean
     */
    @JsonSetter("dataPercentage50")
    public void setDataPercentage50(Boolean dataPercentage50) {
        this.dataPercentage50 = dataPercentage50;
    }

    /**
     * Getter for DataPercentage75.
     * @return Returns the Boolean
     */
    @JsonGetter("dataPercentage75")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getDataPercentage75() {
        return dataPercentage75;
    }

    /**
     * Setter for DataPercentage75.
     * @param dataPercentage75 Value for Boolean
     */
    @JsonSetter("dataPercentage75")
    public void setDataPercentage75(Boolean dataPercentage75) {
        this.dataPercentage75 = dataPercentage75;
    }

    /**
     * Getter for DataPercentage90.
     * @return Returns the Boolean
     */
    @JsonGetter("dataPercentage90")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getDataPercentage90() {
        return dataPercentage90;
    }

    /**
     * Setter for DataPercentage90.
     * @param dataPercentage90 Value for Boolean
     */
    @JsonSetter("dataPercentage90")
    public void setDataPercentage90(Boolean dataPercentage90) {
        this.dataPercentage90 = dataPercentage90;
    }

    /**
     * Getter for DataPercentage100.
     * @return Returns the Boolean
     */
    @JsonGetter("dataPercentage100")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getDataPercentage100() {
        return dataPercentage100;
    }

    /**
     * Setter for DataPercentage100.
     * @param dataPercentage100 Value for Boolean
     */
    @JsonSetter("dataPercentage100")
    public void setDataPercentage100(Boolean dataPercentage100) {
        this.dataPercentage100 = dataPercentage100;
    }

    /**
     * Getter for SmsPercentage50.
     * @return Returns the Boolean
     */
    @JsonGetter("smsPercentage50")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getSmsPercentage50() {
        return smsPercentage50;
    }

    /**
     * Setter for SmsPercentage50.
     * @param smsPercentage50 Value for Boolean
     */
    @JsonSetter("smsPercentage50")
    public void setSmsPercentage50(Boolean smsPercentage50) {
        this.smsPercentage50 = smsPercentage50;
    }

    /**
     * Getter for SmsPercentage75.
     * @return Returns the Boolean
     */
    @JsonGetter("smsPercentage75")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getSmsPercentage75() {
        return smsPercentage75;
    }

    /**
     * Setter for SmsPercentage75.
     * @param smsPercentage75 Value for Boolean
     */
    @JsonSetter("smsPercentage75")
    public void setSmsPercentage75(Boolean smsPercentage75) {
        this.smsPercentage75 = smsPercentage75;
    }

    /**
     * Getter for SmsPercentage90.
     * @return Returns the Boolean
     */
    @JsonGetter("smsPercentage90")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getSmsPercentage90() {
        return smsPercentage90;
    }

    /**
     * Setter for SmsPercentage90.
     * @param smsPercentage90 Value for Boolean
     */
    @JsonSetter("smsPercentage90")
    public void setSmsPercentage90(Boolean smsPercentage90) {
        this.smsPercentage90 = smsPercentage90;
    }

    /**
     * Getter for SmsPercentage100.
     * @return Returns the Boolean
     */
    @JsonGetter("smsPercentage100")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getSmsPercentage100() {
        return smsPercentage100;
    }

    /**
     * Setter for SmsPercentage100.
     * @param smsPercentage100 Value for Boolean
     */
    @JsonSetter("smsPercentage100")
    public void setSmsPercentage100(Boolean smsPercentage100) {
        this.smsPercentage100 = smsPercentage100;
    }

    /**
     * Getter for NoOfDaysB4PromoExp.
     * @return Returns the Integer
     */
    @JsonGetter("NoOfDaysB4PromoExp")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getNoOfDaysB4PromoExp() {
        return noOfDaysB4PromoExp;
    }

    /**
     * Setter for NoOfDaysB4PromoExp.
     * @param noOfDaysB4PromoExp Value for Integer
     */
    @JsonSetter("NoOfDaysB4PromoExp")
    public void setNoOfDaysB4PromoExp(Integer noOfDaysB4PromoExp) {
        this.noOfDaysB4PromoExp = noOfDaysB4PromoExp;
    }

    /**
     * Converts this Keyschunk2 into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "Keyschunk2 [" + "dataPercentage50=" + dataPercentage50 + ", dataPercentage75="
                + dataPercentage75 + ", dataPercentage90=" + dataPercentage90
                + ", dataPercentage100=" + dataPercentage100 + ", smsPercentage50="
                + smsPercentage50 + ", smsPercentage75=" + smsPercentage75 + ", smsPercentage90="
                + smsPercentage90 + ", smsPercentage100=" + smsPercentage100
                + ", noOfDaysB4PromoExp=" + noOfDaysB4PromoExp + "]";
    }

    /**
     * Builds a new {@link Keyschunk2.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link Keyschunk2.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .dataPercentage50(getDataPercentage50())
                .dataPercentage75(getDataPercentage75())
                .dataPercentage90(getDataPercentage90())
                .dataPercentage100(getDataPercentage100())
                .smsPercentage50(getSmsPercentage50())
                .smsPercentage75(getSmsPercentage75())
                .smsPercentage90(getSmsPercentage90())
                .smsPercentage100(getSmsPercentage100())
                .noOfDaysB4PromoExp(getNoOfDaysB4PromoExp());
        return builder;
    }

    /**
     * Class to build instances of {@link Keyschunk2}.
     */
    public static class Builder {
        private Boolean dataPercentage50;
        private Boolean dataPercentage75;
        private Boolean dataPercentage90;
        private Boolean dataPercentage100;
        private Boolean smsPercentage50;
        private Boolean smsPercentage75;
        private Boolean smsPercentage90;
        private Boolean smsPercentage100;
        private Integer noOfDaysB4PromoExp;



        /**
         * Setter for dataPercentage50.
         * @param  dataPercentage50  Boolean value for dataPercentage50.
         * @return Builder
         */
        public Builder dataPercentage50(Boolean dataPercentage50) {
            this.dataPercentage50 = dataPercentage50;
            return this;
        }

        /**
         * Setter for dataPercentage75.
         * @param  dataPercentage75  Boolean value for dataPercentage75.
         * @return Builder
         */
        public Builder dataPercentage75(Boolean dataPercentage75) {
            this.dataPercentage75 = dataPercentage75;
            return this;
        }

        /**
         * Setter for dataPercentage90.
         * @param  dataPercentage90  Boolean value for dataPercentage90.
         * @return Builder
         */
        public Builder dataPercentage90(Boolean dataPercentage90) {
            this.dataPercentage90 = dataPercentage90;
            return this;
        }

        /**
         * Setter for dataPercentage100.
         * @param  dataPercentage100  Boolean value for dataPercentage100.
         * @return Builder
         */
        public Builder dataPercentage100(Boolean dataPercentage100) {
            this.dataPercentage100 = dataPercentage100;
            return this;
        }

        /**
         * Setter for smsPercentage50.
         * @param  smsPercentage50  Boolean value for smsPercentage50.
         * @return Builder
         */
        public Builder smsPercentage50(Boolean smsPercentage50) {
            this.smsPercentage50 = smsPercentage50;
            return this;
        }

        /**
         * Setter for smsPercentage75.
         * @param  smsPercentage75  Boolean value for smsPercentage75.
         * @return Builder
         */
        public Builder smsPercentage75(Boolean smsPercentage75) {
            this.smsPercentage75 = smsPercentage75;
            return this;
        }

        /**
         * Setter for smsPercentage90.
         * @param  smsPercentage90  Boolean value for smsPercentage90.
         * @return Builder
         */
        public Builder smsPercentage90(Boolean smsPercentage90) {
            this.smsPercentage90 = smsPercentage90;
            return this;
        }

        /**
         * Setter for smsPercentage100.
         * @param  smsPercentage100  Boolean value for smsPercentage100.
         * @return Builder
         */
        public Builder smsPercentage100(Boolean smsPercentage100) {
            this.smsPercentage100 = smsPercentage100;
            return this;
        }

        /**
         * Setter for noOfDaysB4PromoExp.
         * @param  noOfDaysB4PromoExp  Integer value for noOfDaysB4PromoExp.
         * @return Builder
         */
        public Builder noOfDaysB4PromoExp(Integer noOfDaysB4PromoExp) {
            this.noOfDaysB4PromoExp = noOfDaysB4PromoExp;
            return this;
        }

        /**
         * Builds a new {@link Keyschunk2} object using the set fields.
         * @return {@link Keyschunk2}
         */
        public Keyschunk2 build() {
            return new Keyschunk2(dataPercentage50, dataPercentage75, dataPercentage90,
                    dataPercentage100, smsPercentage50, smsPercentage75, smsPercentage90,
                    smsPercentage100, noOfDaysB4PromoExp);
        }
    }
}