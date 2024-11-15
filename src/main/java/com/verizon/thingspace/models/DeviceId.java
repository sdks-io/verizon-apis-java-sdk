/*
 * VerizonThingSpaceQualityOfServiceAPIEndpointsLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.verizon.thingspace.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * This is a model class for DeviceId type.
 */
public class DeviceId {
    private String id;
    private String kind;

    /**
     * Default constructor.
     */
    public DeviceId() {
    }

    /**
     * Initialization constructor.
     * @param  id  String value for id.
     * @param  kind  String value for kind.
     */
    public DeviceId(
            String id,
            String kind) {
        this.id = id;
        this.kind = kind;
    }

    /**
     * Getter for Id.
     * The numeric or alphanumeric ID value
     * @return Returns the String
     */
    @JsonGetter("id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getId() {
        return id;
    }

    /**
     * Setter for Id.
     * The numeric or alphanumeric ID value
     * @param id Value for String
     */
    @JsonSetter("id")
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Getter for Kind.
     * What the ID value represents, which could be a Mobile Directory Number (MDN) or an
     * International Mobile Equipment Identifier (IMEI) as an example
     * @return Returns the String
     */
    @JsonGetter("kind")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getKind() {
        return kind;
    }

    /**
     * Setter for Kind.
     * What the ID value represents, which could be a Mobile Directory Number (MDN) or an
     * International Mobile Equipment Identifier (IMEI) as an example
     * @param kind Value for String
     */
    @JsonSetter("kind")
    public void setKind(String kind) {
        this.kind = kind;
    }

    /**
     * Converts this DeviceId into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "DeviceId [" + "id=" + id + ", kind=" + kind + "]";
    }

    /**
     * Builds a new {@link DeviceId.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link DeviceId.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .id(getId())
                .kind(getKind());
        return builder;
    }

    /**
     * Class to build instances of {@link DeviceId}.
     */
    public static class Builder {
        private String id;
        private String kind;



        /**
         * Setter for id.
         * @param  id  String value for id.
         * @return Builder
         */
        public Builder id(String id) {
            this.id = id;
            return this;
        }

        /**
         * Setter for kind.
         * @param  kind  String value for kind.
         * @return Builder
         */
        public Builder kind(String kind) {
            this.kind = kind;
            return this;
        }

        /**
         * Builds a new {@link DeviceId} object using the set fields.
         * @return {@link DeviceId}
         */
        public DeviceId build() {
            return new DeviceId(id, kind);
        }
    }
}