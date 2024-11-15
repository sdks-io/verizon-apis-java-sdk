/*
 * VerizonLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.verizon.m5gedge.exceptions;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;
import io.apimatic.coreinterfaces.http.Context;

/**
 * This is a model class for DeviceDiagnosticsResultException type.
 */
public class DeviceDiagnosticsResultException extends ApiException {
    private static final long serialVersionUID = 5716183771827439245L;
    private String errorCode;
    private String errorMessage;

    /**
     * Initialization constructor.
     * @param   reason  The reason for throwing exception
     * @param   context The context of the API exception
     */
    public DeviceDiagnosticsResultException(String reason, Context context) {
        super(reason, context);
    }


    /**
     * Getter for ErrorCode.
     * Simple error code.
     * @return Returns the String
     */
    @JsonGetter("errorCode")
    public String getErrorCode() {
        return this.errorCode;
    }

    /**
     * Setter for ErrorCode.
     * Simple error code.
     * @param errorCode Value for String
     */
    @JsonSetter("errorCode")
    private void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    /**
     * Getter for ErrorMessage.
     * Detailed error message.
     * @return Returns the String
     */
    @JsonGetter("errorMessage")
    public String getErrorMessage() {
        return this.errorMessage;
    }

    /**
     * Setter for ErrorMessage.
     * Detailed error message.
     * @param errorMessage Value for String
     */
    @JsonSetter("errorMessage")
    private void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }
}