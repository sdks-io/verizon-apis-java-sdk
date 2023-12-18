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
 * This is a model class for Acceleration type.
 */
public class Acceleration {
    private String x;
    private String y;
    private String z;

    /**
     * Default constructor.
     */
    public Acceleration() {
    }

    /**
     * Initialization constructor.
     * @param  x  String value for x.
     * @param  y  String value for y.
     * @param  z  String value for z.
     */
    public Acceleration(
            String x,
            String y,
            String z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    /**
     * Getter for X.
     * @return Returns the String
     */
    @JsonGetter("x")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getX() {
        return x;
    }

    /**
     * Setter for X.
     * @param x Value for String
     */
    @JsonSetter("x")
    public void setX(String x) {
        this.x = x;
    }

    /**
     * Getter for Y.
     * @return Returns the String
     */
    @JsonGetter("y")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getY() {
        return y;
    }

    /**
     * Setter for Y.
     * @param y Value for String
     */
    @JsonSetter("y")
    public void setY(String y) {
        this.y = y;
    }

    /**
     * Getter for Z.
     * @return Returns the String
     */
    @JsonGetter("z")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getZ() {
        return z;
    }

    /**
     * Setter for Z.
     * @param z Value for String
     */
    @JsonSetter("z")
    public void setZ(String z) {
        this.z = z;
    }

    /**
     * Converts this Acceleration into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "Acceleration [" + "x=" + x + ", y=" + y + ", z=" + z + "]";
    }

    /**
     * Builds a new {@link Acceleration.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link Acceleration.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .x(getX())
                .y(getY())
                .z(getZ());
        return builder;
    }

    /**
     * Class to build instances of {@link Acceleration}.
     */
    public static class Builder {
        private String x;
        private String y;
        private String z;



        /**
         * Setter for x.
         * @param  x  String value for x.
         * @return Builder
         */
        public Builder x(String x) {
            this.x = x;
            return this;
        }

        /**
         * Setter for y.
         * @param  y  String value for y.
         * @return Builder
         */
        public Builder y(String y) {
            this.y = y;
            return this;
        }

        /**
         * Setter for z.
         * @param  z  String value for z.
         * @return Builder
         */
        public Builder z(String z) {
            this.z = z;
            return this;
        }

        /**
         * Builds a new {@link Acceleration} object using the set fields.
         * @return {@link Acceleration}
         */
        public Acceleration build() {
            return new Acceleration(x, y, z);
        }
    }
}
