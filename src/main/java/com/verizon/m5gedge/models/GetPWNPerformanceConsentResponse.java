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
 * This is a model class for GetPWNPerformanceConsentResponse type.
 */
public class GetPWNPerformanceConsentResponse {
    private String consent;

    /**
     * Default constructor.
     */
    public GetPWNPerformanceConsentResponse() {
    }

    /**
     * Initialization constructor.
     * @param  consent  String value for consent.
     */
    public GetPWNPerformanceConsentResponse(
            String consent) {
        this.consent = consent;
    }

    /**
     * Getter for Consent.
     * PWN Performance Consent Response.
     * @return Returns the String
     */
    @JsonGetter("consent")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getConsent() {
        return consent;
    }

    /**
     * Setter for Consent.
     * PWN Performance Consent Response.
     * @param consent Value for String
     */
    @JsonSetter("consent")
    public void setConsent(String consent) {
        this.consent = consent;
    }

    /**
     * Converts this GetPWNPerformanceConsentResponse into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "GetPWNPerformanceConsentResponse [" + "consent=" + consent + "]";
    }

    /**
     * Builds a new {@link GetPWNPerformanceConsentResponse.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link GetPWNPerformanceConsentResponse.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .consent(getConsent());
        return builder;
    }

    /**
     * Class to build instances of {@link GetPWNPerformanceConsentResponse}.
     */
    public static class Builder {
        private String consent;



        /**
         * Setter for consent.
         * @param  consent  String value for consent.
         * @return Builder
         */
        public Builder consent(String consent) {
            this.consent = consent;
            return this;
        }

        /**
         * Builds a new {@link GetPWNPerformanceConsentResponse} object using the set fields.
         * @return {@link GetPWNPerformanceConsentResponse}
         */
        public GetPWNPerformanceConsentResponse build() {
            return new GetPWNPerformanceConsentResponse(consent);
        }
    }
}