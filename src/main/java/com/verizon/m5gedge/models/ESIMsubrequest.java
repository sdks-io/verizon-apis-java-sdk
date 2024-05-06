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
 * This is a model class for ESIMsubrequest type.
 */
public class ESIMsubrequest {
    private String id;
    private String kind;
    private Status1Enum status;

    /**
     * Default constructor.
     */
    public ESIMsubrequest() {
    }

    /**
     * Initialization constructor.
     * @param  id  String value for id.
     * @param  kind  String value for kind.
     * @param  status  Status1Enum value for status.
     */
    public ESIMsubrequest(
            String id,
            String kind,
            Status1Enum status) {
        this.id = id;
        this.kind = kind;
        this.status = status;
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
     * Getter for Status.
     * @return Returns the Status1Enum
     */
    @JsonGetter("status")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Status1Enum getStatus() {
        return status;
    }

    /**
     * Setter for Status.
     * @param status Value for Status1Enum
     */
    @JsonSetter("status")
    public void setStatus(Status1Enum status) {
        this.status = status;
    }

    /**
     * Converts this ESIMsubrequest into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "ESIMsubrequest [" + "id=" + id + ", kind=" + kind + ", status=" + status + "]";
    }

    /**
     * Builds a new {@link ESIMsubrequest.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link ESIMsubrequest.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .id(getId())
                .kind(getKind())
                .status(getStatus());
        return builder;
    }

    /**
     * Class to build instances of {@link ESIMsubrequest}.
     */
    public static class Builder {
        private String id;
        private String kind;
        private Status1Enum status;



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
         * Setter for status.
         * @param  status  Status1Enum value for status.
         * @return Builder
         */
        public Builder status(Status1Enum status) {
            this.status = status;
            return this;
        }

        /**
         * Builds a new {@link ESIMsubrequest} object using the set fields.
         * @return {@link ESIMsubrequest}
         */
        public ESIMsubrequest build() {
            return new ESIMsubrequest(id, kind, status);
        }
    }
}