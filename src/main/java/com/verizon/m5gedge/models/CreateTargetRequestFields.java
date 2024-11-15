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
 * This is a model class for CreateTargetRequestFields type.
 */
public class CreateTargetRequestFields {
    private FieldsHttpHeaders httpheaders;
    private List<String> devicetypes;

    /**
     * Default constructor.
     */
    public CreateTargetRequestFields() {
    }

    /**
     * Initialization constructor.
     * @param  httpheaders  FieldsHttpHeaders value for httpheaders.
     * @param  devicetypes  List of String value for devicetypes.
     */
    public CreateTargetRequestFields(
            FieldsHttpHeaders httpheaders,
            List<String> devicetypes) {
        this.httpheaders = httpheaders;
        this.devicetypes = devicetypes;
    }

    /**
     * Getter for Httpheaders.
     * @return Returns the FieldsHttpHeaders
     */
    @JsonGetter("httpheaders")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public FieldsHttpHeaders getHttpheaders() {
        return httpheaders;
    }

    /**
     * Setter for Httpheaders.
     * @param httpheaders Value for FieldsHttpHeaders
     */
    @JsonSetter("httpheaders")
    public void setHttpheaders(FieldsHttpHeaders httpheaders) {
        this.httpheaders = httpheaders;
    }

    /**
     * Getter for Devicetypes.
     * List of device types.
     * @return Returns the List of String
     */
    @JsonGetter("devicetypes")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<String> getDevicetypes() {
        return devicetypes;
    }

    /**
     * Setter for Devicetypes.
     * List of device types.
     * @param devicetypes Value for List of String
     */
    @JsonSetter("devicetypes")
    public void setDevicetypes(List<String> devicetypes) {
        this.devicetypes = devicetypes;
    }

    /**
     * Converts this CreateTargetRequestFields into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "CreateTargetRequestFields [" + "httpheaders=" + httpheaders + ", devicetypes="
                + devicetypes + "]";
    }

    /**
     * Builds a new {@link CreateTargetRequestFields.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link CreateTargetRequestFields.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .httpheaders(getHttpheaders())
                .devicetypes(getDevicetypes());
        return builder;
    }

    /**
     * Class to build instances of {@link CreateTargetRequestFields}.
     */
    public static class Builder {
        private FieldsHttpHeaders httpheaders;
        private List<String> devicetypes;



        /**
         * Setter for httpheaders.
         * @param  httpheaders  FieldsHttpHeaders value for httpheaders.
         * @return Builder
         */
        public Builder httpheaders(FieldsHttpHeaders httpheaders) {
            this.httpheaders = httpheaders;
            return this;
        }

        /**
         * Setter for devicetypes.
         * @param  devicetypes  List of String value for devicetypes.
         * @return Builder
         */
        public Builder devicetypes(List<String> devicetypes) {
            this.devicetypes = devicetypes;
            return this;
        }

        /**
         * Builds a new {@link CreateTargetRequestFields} object using the set fields.
         * @return {@link CreateTargetRequestFields}
         */
        public CreateTargetRequestFields build() {
            return new CreateTargetRequestFields(httpheaders, devicetypes);
        }
    }
}
