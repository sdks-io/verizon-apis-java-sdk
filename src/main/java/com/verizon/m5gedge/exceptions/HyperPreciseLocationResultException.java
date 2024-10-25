/*
 * VerizonLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.verizon.m5gedge.exceptions;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.verizon.m5gedge.models.ErrorResponseCodeEnum;
import com.verizon.m5gedge.models.HyperPreciseLocationFault;
import io.apimatic.coreinterfaces.http.Context;

/**
 * This is a model class for HyperPreciseLocationResultException type.
 */
public class HyperPreciseLocationResultException extends ApiException {
    private static final long serialVersionUID = -7919105780698194180L;
    private ErrorResponseCodeEnum responseCode;
    private String message;
    private HyperPreciseLocationFault fault;

    /**
     * Initialization constructor.
     * @param   reason  The reason for throwing exception
     * @param   context The context of the API exception
     */
    public HyperPreciseLocationResultException(String reason, Context context) {
        super(reason, context);
    }


    /**
     * Getter for ResponseCode.
     * Error Code.
     * @return Returns the ErrorResponseCodeEnum
     */
    @JsonGetter("responseCode")
    public ErrorResponseCodeEnum getResponseCodeField() {
        return this.responseCode;
    }

    /**
     * Setter for ResponseCode.
     * Error Code.
     * @param responseCodeField Value for ErrorResponseCodeEnum
     */
    @JsonSetter("responseCode")
    private void setResponseCodeField(ErrorResponseCodeEnum responseCodeField) {
        this.responseCode = responseCodeField;
    }

    /**
     * Getter for Message.
     * Error message.
     * @return Returns the String
     */
    @JsonGetter("message")
    public String getMessageField() {
        return this.message;
    }

    /**
     * Setter for Message.
     * Error message.
     * @param messageField Value for String
     */
    @JsonSetter("message")
    private void setMessageField(String messageField) {
        this.message = messageField;
    }

    /**
     * Getter for Fault.
     * Fault occurred while responding.
     * @return Returns the HyperPreciseLocationFault
     */
    @JsonGetter("fault")
    public HyperPreciseLocationFault getFault() {
        return this.fault;
    }

    /**
     * Setter for Fault.
     * Fault occurred while responding.
     * @param fault Value for HyperPreciseLocationFault
     */
    @JsonSetter("fault")
    private void setFault(HyperPreciseLocationFault fault) {
        this.fault = fault;
    }
}
