/*
 * VerizonThingSpaceQualityOfServiceAPIEndpointsLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.verizon.thingspace.authentication;

/**
 * A data class for Custom Header Signature credentials.
 */
public class VzM2mSessionTokenModel {
    private String vZM2MToken;

    /**
     * A Constructor for VzM2mSessionTokenModel.
     */
    private VzM2mSessionTokenModel(String vZM2MToken) {
        this.vZM2MToken = vZM2MToken;
    }

    /**
     * Getter for vZM2MToken.
     * @return vZM2MToken The value of VZ-M2M-Token.
     */
    public String getVZM2MToken() {
        return this.vZM2MToken;
    }

    /**
     * Builds a new {@link VzM2mSessionTokenModel.Builder} object.
     * Creates the instance with the state of the current auth model.
     * @return a new {@link VzM2mSessionTokenModel.Builder} object.
     */
    public Builder toBuilder() {
        return new Builder(getVZM2MToken());
    }

    /**
     * A Builder class for Custom Header Signature credentials.
     */
    public static class Builder {
        private String vZM2MToken;

        /**
         * The constructor with required auth credentials.
         * @param vZM2MToken The value of VZM2MToken.
         */
        public Builder(String vZM2MToken) {
            if (vZM2MToken == null) {
                throw new NullPointerException("VZM2MToken cannot be null.");
            }

            this.vZM2MToken = vZM2MToken;
        }

        /**
         * Setter for vZM2MToken.
         * @param vZM2MToken The value of VZ-M2M-Token.
         * @return Builder The current instance of Builder.
         */
        public Builder vZM2MToken(String vZM2MToken) {
            if (vZM2MToken == null) {
                throw new NullPointerException("VZM2MToken cannot be null.");
            }

            this.vZM2MToken = vZM2MToken;
            return this;
        }

        /**
         * Builds the instance of VzM2mSessionTokenModel using the provided credentials.
         * @return The instance of VzM2mSessionTokenModel.
         */
        public VzM2mSessionTokenModel build() {
            return new VzM2mSessionTokenModel(vZM2MToken);
        }
    }
}