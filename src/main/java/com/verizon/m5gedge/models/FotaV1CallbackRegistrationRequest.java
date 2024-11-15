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
 * This is a model class for FotaV1CallbackRegistrationRequest type.
 */
public class FotaV1CallbackRegistrationRequest {
    private String name;
    private String url;
    private String username;
    private String password;

    /**
     * Default constructor.
     */
    public FotaV1CallbackRegistrationRequest() {
    }

    /**
     * Initialization constructor.
     * @param  name  String value for name.
     * @param  url  String value for url.
     * @param  username  String value for username.
     * @param  password  String value for password.
     */
    public FotaV1CallbackRegistrationRequest(
            String name,
            String url,
            String username,
            String password) {
        this.name = name;
        this.url = url;
        this.username = username;
        this.password = password;
    }

    /**
     * Getter for Name.
     * The name of the callback service that you want to subscribe to, which must be 'Fota' for
     * Software Management Services callbacks.
     * @return Returns the String
     */
    @JsonGetter("name")
    public String getName() {
        return name;
    }

    /**
     * Setter for Name.
     * The name of the callback service that you want to subscribe to, which must be 'Fota' for
     * Software Management Services callbacks.
     * @param name Value for String
     */
    @JsonSetter("name")
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Getter for Url.
     * The address on your server where you have enabled a listening service for Software Management
     * Services callback messages.
     * @return Returns the String
     */
    @JsonGetter("url")
    public String getUrl() {
        return url;
    }

    /**
     * Setter for Url.
     * The address on your server where you have enabled a listening service for Software Management
     * Services callback messages.
     * @param url Value for String
     */
    @JsonSetter("url")
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * Getter for Username.
     * The user name that ThingSpace should return in the callback messages.
     * @return Returns the String
     */
    @JsonGetter("username")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getUsername() {
        return username;
    }

    /**
     * Setter for Username.
     * The user name that ThingSpace should return in the callback messages.
     * @param username Value for String
     */
    @JsonSetter("username")
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * Getter for Password.
     * The password that ThingSpace should return in the callback messages.
     * @return Returns the String
     */
    @JsonGetter("password")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getPassword() {
        return password;
    }

    /**
     * Setter for Password.
     * The password that ThingSpace should return in the callback messages.
     * @param password Value for String
     */
    @JsonSetter("password")
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * Converts this FotaV1CallbackRegistrationRequest into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "FotaV1CallbackRegistrationRequest [" + "name=" + name + ", url=" + url
                + ", username=" + username + ", password=" + password + "]";
    }

    /**
     * Builds a new {@link FotaV1CallbackRegistrationRequest.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link FotaV1CallbackRegistrationRequest.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(name, url)
                .username(getUsername())
                .password(getPassword());
        return builder;
    }

    /**
     * Class to build instances of {@link FotaV1CallbackRegistrationRequest}.
     */
    public static class Builder {
        private String name;
        private String url;
        private String username;
        private String password;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  name  String value for name.
         * @param  url  String value for url.
         */
        public Builder(String name, String url) {
            this.name = name;
            this.url = url;
        }

        /**
         * Setter for name.
         * @param  name  String value for name.
         * @return Builder
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * Setter for url.
         * @param  url  String value for url.
         * @return Builder
         */
        public Builder url(String url) {
            this.url = url;
            return this;
        }

        /**
         * Setter for username.
         * @param  username  String value for username.
         * @return Builder
         */
        public Builder username(String username) {
            this.username = username;
            return this;
        }

        /**
         * Setter for password.
         * @param  password  String value for password.
         * @return Builder
         */
        public Builder password(String password) {
            this.password = password;
            return this;
        }

        /**
         * Builds a new {@link FotaV1CallbackRegistrationRequest} object using the set fields.
         * @return {@link FotaV1CallbackRegistrationRequest}
         */
        public FotaV1CallbackRegistrationRequest build() {
            return new FotaV1CallbackRegistrationRequest(name, url, username, password);
        }
    }
}
