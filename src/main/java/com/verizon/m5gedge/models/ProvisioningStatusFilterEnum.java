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
 * ProvisioningStatusFilterEnum to be used.
 */
public enum ProvisioningStatusFilterEnum {
    UNKNOWN,

    DEACTIVATED,

    ACTIVATED,

    DEACTIVE,

    ACTIVE,

    SUSPEND,

    PENDING_ACTIVATION,

    PENDING_DEACTIVATION,

    PRE_ACTIVE,

    ACTIVATION_READY,

    INVENTORY,

    PURGED,

    REPLACED,

    RETIRED,

    TEST_READY;


    private static TreeMap<String, ProvisioningStatusFilterEnum> valueMap = new TreeMap<>();
    private String value;

    static {
        UNKNOWN.value = "UNKNOWN";
        DEACTIVATED.value = "DEACTIVATED";
        ACTIVATED.value = "ACTIVATED";
        DEACTIVE.value = "DEACTIVE";
        ACTIVE.value = "ACTIVE";
        SUSPEND.value = "SUSPEND";
        PENDING_ACTIVATION.value = "PENDING_ACTIVATION";
        PENDING_DEACTIVATION.value = "PENDING_DEACTIVATION";
        PRE_ACTIVE.value = "PRE_ACTIVE";
        ACTIVATION_READY.value = "ACTIVATION_READY";
        INVENTORY.value = "INVENTORY";
        PURGED.value = "PURGED";
        REPLACED.value = "REPLACED";
        RETIRED.value = "RETIRED";
        TEST_READY.value = "TEST_READY";

        valueMap.put("UNKNOWN", UNKNOWN);
        valueMap.put("DEACTIVATED", DEACTIVATED);
        valueMap.put("ACTIVATED", ACTIVATED);
        valueMap.put("DEACTIVE", DEACTIVE);
        valueMap.put("ACTIVE", ACTIVE);
        valueMap.put("SUSPEND", SUSPEND);
        valueMap.put("PENDING_ACTIVATION", PENDING_ACTIVATION);
        valueMap.put("PENDING_DEACTIVATION", PENDING_DEACTIVATION);
        valueMap.put("PRE_ACTIVE", PRE_ACTIVE);
        valueMap.put("ACTIVATION_READY", ACTIVATION_READY);
        valueMap.put("INVENTORY", INVENTORY);
        valueMap.put("PURGED", PURGED);
        valueMap.put("REPLACED", REPLACED);
        valueMap.put("RETIRED", RETIRED);
        valueMap.put("TEST_READY", TEST_READY);
    }

    /**
     * Returns the enum member associated with the given string value.
     * @param toConvert String value to get enum member.
     * @return The enum member against the given string value.
     * @throws IOException when provided value is not mapped to any enum member.
     */
    @JsonCreator
    public static ProvisioningStatusFilterEnum constructFromString(String toConvert) throws IOException {
        ProvisioningStatusFilterEnum enumValue = fromString(toConvert);
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
    public static ProvisioningStatusFilterEnum fromString(String toConvert) {
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
     * Convert list of ProvisioningStatusFilterEnum values to list of string values.
     * @param toConvert The list of ProvisioningStatusFilterEnum values to convert.
     * @return List of representative string values.
     */
    public static List<String> toValue(List<ProvisioningStatusFilterEnum> toConvert) {
        if (toConvert == null) {
            return null;
        }
        List<String> convertedValues = new ArrayList<>();
        for (ProvisioningStatusFilterEnum enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 