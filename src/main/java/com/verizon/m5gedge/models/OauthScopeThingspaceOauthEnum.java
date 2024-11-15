/*
 * VerizonLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.verizon.m5gedge.models;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;


/**
 * OauthScopeThingspaceOauthEnum to be used.
 */
public enum OauthScopeThingspaceOauthEnum {
    /**
     * Grant read-only access to discovery data
     */
    DISCOVERYREAD,

    /**
     * Grant read-only access to service profile data
     */
    SERVICEPROFILEREAD,

    /**
     * Grant write access to service profile data
     */
    SERVICEPROFILEWRITE,

    /**
     * Grant read-only access to Service registry data
     */
    SERVICEREGISTRYREAD,

    /**
     * Grant write access to Service registry data
     */
    SERVICEREGISTRYWRITE,

    /**
     * Full access for /serviceprofiles and /serviceendpoints.
     */
    TS_MEC_FULLACCESS,

    /**
     * Limited access. Will not allow use of /serviceprofiles and /serviceendpoints but will allow discovery.
     */
    TS_MEC_LIMITACCESS,

    TS_APPLICATION_RO,

    /**
     * Read access to the discovery service
     */
    EDGEDISCOVERYREAD,

    /**
     * Read access to the service profile service
     */
    EDGESERVICEPROFILEREAD,

    /**
     * Write access to the service profile service
     */
    EDGESERVICEPROFILEWRITE,

    /**
     * Read access to the service registry service
     */
    EDGESERVICEREGISTRYREAD,

    /**
     * Write access to the service registry service
     */
    EDGESERVICEREGISTRYWRITE,

    /**
     * read access
     */
    READ,

    /**
     * read/write access
     */
    WRITE;


    private static TreeMap<String, OauthScopeThingspaceOauthEnum> valueMap = new TreeMap<>();
    private String value;

    static {
        DISCOVERYREAD.value = "discovery:read";
        SERVICEPROFILEREAD.value = "serviceprofile:read";
        SERVICEPROFILEWRITE.value = "serviceprofile:write";
        SERVICEREGISTRYREAD.value = "serviceregistry:read";
        SERVICEREGISTRYWRITE.value = "serviceregistry:write";
        TS_MEC_FULLACCESS.value = "ts.mec.fullaccess";
        TS_MEC_LIMITACCESS.value = "ts.mec.limitaccess";
        TS_APPLICATION_RO.value = "ts.application.ro";
        EDGEDISCOVERYREAD.value = "edge:discovery:read";
        EDGESERVICEPROFILEREAD.value = "edge:serviceprofile:read";
        EDGESERVICEPROFILEWRITE.value = "edge:serviceprofile:write";
        EDGESERVICEREGISTRYREAD.value = "edge:serviceregistry:read";
        EDGESERVICEREGISTRYWRITE.value = "edge:serviceregistry:write";
        READ.value = "read";
        WRITE.value = "write";

        valueMap.put("discovery:read", DISCOVERYREAD);
        valueMap.put("serviceprofile:read", SERVICEPROFILEREAD);
        valueMap.put("serviceprofile:write", SERVICEPROFILEWRITE);
        valueMap.put("serviceregistry:read", SERVICEREGISTRYREAD);
        valueMap.put("serviceregistry:write", SERVICEREGISTRYWRITE);
        valueMap.put("ts.mec.fullaccess", TS_MEC_FULLACCESS);
        valueMap.put("ts.mec.limitaccess", TS_MEC_LIMITACCESS);
        valueMap.put("ts.application.ro", TS_APPLICATION_RO);
        valueMap.put("edge:discovery:read", EDGEDISCOVERYREAD);
        valueMap.put("edge:serviceprofile:read", EDGESERVICEPROFILEREAD);
        valueMap.put("edge:serviceprofile:write", EDGESERVICEPROFILEWRITE);
        valueMap.put("edge:serviceregistry:read", EDGESERVICEREGISTRYREAD);
        valueMap.put("edge:serviceregistry:write", EDGESERVICEREGISTRYWRITE);
        valueMap.put("read", READ);
        valueMap.put("write", WRITE);
    }

    /**
     * Returns the enum member associated with the given string value.
     * @param toConvert String value to get enum member.
     * @return The enum member against the given string value.
     * @throws IOException when provided value is not mapped to any enum member.
     */
    @JsonCreator
    public static OauthScopeThingspaceOauthEnum constructFromString(String toConvert) throws IOException {
        OauthScopeThingspaceOauthEnum enumValue = fromString(toConvert);
        if (enumValue == null) {
            throw new IOException("Unable to create enum instance with value: " + toConvert);
        }
        return enumValue;
    }

    /**
     * Returns the enum member associated with the given string value.
     * @param toConvert String value to get enum member.
     * @return The enum member against the given string value.
     */
    public static OauthScopeThingspaceOauthEnum fromString(String toConvert) {
        return valueMap.get(toConvert);
    }

    /**
     * Returns the string value associated with the enum member.
     * @return The string value against enum member.
     */
    @JsonValue
    public String value() {
        return value;
    }
        
    /**
     * Get string representation of this enum.
     */
    @Override
    public String toString() {
        return value.toString();
    }

    /**
     * Convert list of OauthScopeThingspaceOauthEnum values to list of string values.
     * @param toConvert The list of OauthScopeThingspaceOauthEnum values to convert.
     * @return List of representative string values.
     */
    public static List<String> toValue(List<OauthScopeThingspaceOauthEnum> toConvert) {
        if (toConvert == null) {
            return null;
        }
        List<String> convertedValues = new ArrayList<>();
        for (OauthScopeThingspaceOauthEnum enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 