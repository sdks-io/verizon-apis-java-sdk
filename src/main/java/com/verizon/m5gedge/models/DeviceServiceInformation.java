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
 * This is a model class for DeviceServiceInformation type.
 */
public class DeviceServiceInformation {
    private ApiResponseCode responseType;
    private String imei;
    private boolean bullseyeEnable;

    /**
     * Default constructor.
     */
    public DeviceServiceInformation() {
    }

    /**
     * Initialization constructor.
     * @param  imei  String value for imei.
     * @param  bullseyeEnable  boolean value for bullseyeEnable.
     * @param  responseType  ApiResponseCode value for responseType.
     */
    public DeviceServiceInformation(
            String imei,
            boolean bullseyeEnable,
            ApiResponseCode responseType) {
        this.responseType = responseType;
        this.imei = imei;
        this.bullseyeEnable = bullseyeEnable;
    }

    /**
     * Getter for ResponseType.
     * ResponseCode and/or a message indicating success or failure of the request.
     * @return Returns the ApiResponseCode
     */
    @JsonGetter("responseType")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public ApiResponseCode getResponseType() {
        return responseType;
    }

    /**
     * Setter for ResponseType.
     * ResponseCode and/or a message indicating success or failure of the request.
     * @param responseType Value for ApiResponseCode
     */
    @JsonSetter("responseType")
    public void setResponseType(ApiResponseCode responseType) {
        this.responseType = responseType;
    }

    /**
     * Getter for Imei.
     * The International Mobile Equipment Identifier of the device.
     * @return Returns the String
     */
    @JsonGetter("imei")
    public String getImei() {
        return imei;
    }

    /**
     * Setter for Imei.
     * The International Mobile Equipment Identifier of the device.
     * @param imei Value for String
     */
    @JsonSetter("imei")
    public void setImei(String imei) {
        this.imei = imei;
    }

    /**
     * Getter for BullseyeEnable.
     * Shows if Hyper Precise is enabled (true) or disabled (false).
     * @return Returns the boolean
     */
    @JsonGetter("BullseyeEnable")
    public boolean getBullseyeEnable() {
        return bullseyeEnable;
    }

    /**
     * Setter for BullseyeEnable.
     * Shows if Hyper Precise is enabled (true) or disabled (false).
     * @param bullseyeEnable Value for boolean
     */
    @JsonSetter("BullseyeEnable")
    public void setBullseyeEnable(boolean bullseyeEnable) {
        this.bullseyeEnable = bullseyeEnable;
    }

    /**
     * Converts this DeviceServiceInformation into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "DeviceServiceInformation [" + "imei=" + imei + ", bullseyeEnable=" + bullseyeEnable
                + ", responseType=" + responseType + "]";
    }

    /**
     * Builds a new {@link DeviceServiceInformation.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link DeviceServiceInformation.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(imei, bullseyeEnable)
                .responseType(getResponseType());
        return builder;
    }

    /**
     * Class to build instances of {@link DeviceServiceInformation}.
     */
    public static class Builder {
        private String imei;
        private boolean bullseyeEnable;
        private ApiResponseCode responseType;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  imei  String value for imei.
         * @param  bullseyeEnable  boolean value for bullseyeEnable.
         */
        public Builder(String imei, boolean bullseyeEnable) {
            this.imei = imei;
            this.bullseyeEnable = bullseyeEnable;
        }

        /**
         * Setter for imei.
         * @param  imei  String value for imei.
         * @return Builder
         */
        public Builder imei(String imei) {
            this.imei = imei;
            return this;
        }

        /**
         * Setter for bullseyeEnable.
         * @param  bullseyeEnable  boolean value for bullseyeEnable.
         * @return Builder
         */
        public Builder bullseyeEnable(boolean bullseyeEnable) {
            this.bullseyeEnable = bullseyeEnable;
            return this;
        }

        /**
         * Setter for responseType.
         * @param  responseType  ApiResponseCode value for responseType.
         * @return Builder
         */
        public Builder responseType(ApiResponseCode responseType) {
            this.responseType = responseType;
            return this;
        }

        /**
         * Builds a new {@link DeviceServiceInformation} object using the set fields.
         * @return {@link DeviceServiceInformation}
         */
        public DeviceServiceInformation build() {
            return new DeviceServiceInformation(imei, bullseyeEnable, responseType);
        }
    }
}
