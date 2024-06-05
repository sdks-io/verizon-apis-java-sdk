/*
 * VerizonLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.verizon.m5gedge.authentication;

import io.apimatic.core.authentication.HeaderAuth;
import java.util.HashMap;

public class VZM2mTokenManager extends HeaderAuth implements VZM2mTokenCredentials {

    /**
     * Private instance of the auth model containing the auth credentials.
     */
    private VZM2mTokenModel authModel;

    /**
     * Constructor that sets custom header parameters.
     */
    public VZM2mTokenManager(VZM2mTokenModel authModel) {

        super(new HashMap<String,String>() {
            private static final long serialVersionUID = 1L;
            {
                put("VZ-M2M-Token", authModel.getVZM2mToken());
            }
        });

        this.authModel = authModel;
    }

    /**
     * String value for vZM2mToken.
     * @return vZM2mToken
     */
    public String getVZM2mToken() {
        return authModel.getVZM2mToken();
    }

    /**
     * Checks if provided credentials matched with existing ones.
     * @param vZM2mToken String value for credentials.
     * @return true if credentials matched.
     */
    public boolean equals(String vZM2mToken) {
        return vZM2mToken.equals(getVZM2mToken());
    }

    /**
     * Converts this VZM2mTokenManager into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "VZM2mTokenManager [" + "vZM2mToken=" + getVZM2mToken() + "]";
    }
    /**
    * Returns the error message if the auth credentials are not valid.
    * @return the auth specific error message.
    */
    @Override
    public String getErrorMessage() {
        String errorMessage = super.getErrorMessage();
        if (errorMessage == null) {
            return null;
        }

        return "VZM2mToken - " + errorMessage;
     }

}
