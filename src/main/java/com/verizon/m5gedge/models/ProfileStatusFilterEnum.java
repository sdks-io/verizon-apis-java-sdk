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
 * ProfileStatusFilterEnum to be used.
 */
public enum ProfileStatusFilterEnum {
    ENABLE,

    DISABLE,

    DOWNLOAD_DISABLE,

    DOWNLOAD_ENABLE,

    NOT_DOWNLOADED,

    UNKNOWN,

    DELETE;


    private static TreeMap<String, ProfileStatusFilterEnum> valueMap = new TreeMap<>();
    private String value;

    static {
        ENABLE.value = "ENABLE";
        DISABLE.value = "DISABLE";
        DOWNLOAD_DISABLE.value = "DOWNLOAD_DISABLE";
        DOWNLOAD_ENABLE.value = "DOWNLOAD_ENABLE";
        NOT_DOWNLOADED.value = "NOT_DOWNLOADED";
        UNKNOWN.value = "UNKNOWN";
        DELETE.value = "DELETE";

        valueMap.put("ENABLE", ENABLE);
        valueMap.put("DISABLE", DISABLE);
        valueMap.put("DOWNLOAD_DISABLE", DOWNLOAD_DISABLE);
        valueMap.put("DOWNLOAD_ENABLE", DOWNLOAD_ENABLE);
        valueMap.put("NOT_DOWNLOADED", NOT_DOWNLOADED);
        valueMap.put("UNKNOWN", UNKNOWN);
        valueMap.put("DELETE", DELETE);
    }

    /**
     * Returns the enum member associated with the given string value.
     * @param toConvert String value to get enum member.
     * @return The enum member against the given string value.
     * @throws IOException when provided value is not mapped to any enum member.
     */
    @JsonCreator
    public static ProfileStatusFilterEnum constructFromString(String toConvert) throws IOException {
        ProfileStatusFilterEnum enumValue = fromString(toConvert);
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
    public static ProfileStatusFilterEnum fromString(String toConvert) {
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
     * Convert list of ProfileStatusFilterEnum values to list of string values.
     * @param toConvert The list of ProfileStatusFilterEnum values to convert.
     * @return List of representative string values.
     */
    public static List<String> toValue(List<ProfileStatusFilterEnum> toConvert) {
        if (toConvert == null) {
            return null;
        }
        List<String> convertedValues = new ArrayList<>();
        for (ProfileStatusFilterEnum enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 