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
 * This is a model class for GIODeviceId type.
 */
public class GIODeviceId {
    private String kind;
    private String id;

    /**
     * Default constructor.
     */
    public GIODeviceId() {
    }

    /**
     * Initialization constructor.
     * @param  kind  String value for kind.
     * @param  id  String value for id.
     */
    public GIODeviceId(
            String kind,
            String id) {
        this.kind = kind;
        this.id = id;
    }

    /**
     * Getter for Kind.
     * @return Returns the String
     */
    @JsonGetter("kind")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getKind() {
        return kind;
    }

    /**
     * Setter for Kind.
     * @param kind Value for String
     */
    @JsonSetter("kind")
    public void setKind(String kind) {
        this.kind = kind;
    }

    /**
     * Getter for Id.
     * @return Returns the String
     */
    @JsonGetter("id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getId() {
        return id;
    }

    /**
     * Setter for Id.
     * @param id Value for String
     */
    @JsonSetter("id")
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Converts this GIODeviceId into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "GIODeviceId [" + "kind=" + kind + ", id=" + id + "]";
    }

    /**
     * Builds a new {@link GIODeviceId.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link GIODeviceId.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .kind(getKind())
                .id(getId());
        return builder;
    }

    /**
     * Class to build instances of {@link GIODeviceId}.
     */
    public static class Builder {
        private String kind;
        private String id;



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
         * Setter for id.
         * @param  id  String value for id.
         * @return Builder
         */
        public Builder id(String id) {
            this.id = id;
            return this;
        }

        /**
         * Builds a new {@link GIODeviceId} object using the set fields.
         * @return {@link GIODeviceId}
         */
        public GIODeviceId build() {
            return new GIODeviceId(kind, id);
        }
    }
}
