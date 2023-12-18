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
 * This is a model class for QosDeviceId type.
 */
public class QosDeviceId {
    private String id;
    private String kind;

    /**
     * Default constructor.
     */
    public QosDeviceId() {
    }

    /**
     * Initialization constructor.
     * @param  id  String value for id.
     * @param  kind  String value for kind.
     */
    public QosDeviceId(
            String id,
            String kind) {
        this.id = id;
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
     * Converts this QosDeviceId into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "QosDeviceId [" + "id=" + id + ", kind=" + kind + "]";
    }

    /**
     * Builds a new {@link QosDeviceId.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link QosDeviceId.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .id(getId())
                .kind(getKind());
        return builder;
    }

    /**
     * Class to build instances of {@link QosDeviceId}.
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
         * Builds a new {@link QosDeviceId} object using the set fields.
         * @return {@link QosDeviceId}
         */
        public QosDeviceId build() {
            return new QosDeviceId(id, kind);
        }
    }
}
