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
 * This is a model class for AnomalyTriggerValue type.
 */
public class AnomalyTriggerValue {
    private String triggerId;
    private String triggerName;
    private String organizationName;
    private String triggerCategory;
    private List<TriggerAttributesOptions> triggerAttributes;
    private String createdAt;
    private String modifiedAt;

    /**
     * Default constructor.
     */
    public AnomalyTriggerValue() {
    }

    /**
     * Initialization constructor.
     * @param  triggerId  String value for triggerId.
     * @param  triggerName  String value for triggerName.
     * @param  organizationName  String value for organizationName.
     * @param  triggerCategory  String value for triggerCategory.
     * @param  triggerAttributes  List of TriggerAttributesOptions value for triggerAttributes.
     * @param  createdAt  String value for createdAt.
     * @param  modifiedAt  String value for modifiedAt.
     */
    public AnomalyTriggerValue(
            String triggerId,
            String triggerName,
            String organizationName,
            String triggerCategory,
            List<TriggerAttributesOptions> triggerAttributes,
            String createdAt,
            String modifiedAt) {
        this.triggerId = triggerId;
        this.triggerName = triggerName;
        this.organizationName = organizationName;
        this.triggerCategory = triggerCategory;
        this.triggerAttributes = triggerAttributes;
        this.createdAt = createdAt;
        this.modifiedAt = modifiedAt;
    }

    /**
     * Getter for TriggerId.
     * The system assigned name of the trigger being updated.
     * @return Returns the String
     */
    @JsonGetter("triggerId")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getTriggerId() {
        return triggerId;
    }

    /**
     * Setter for TriggerId.
     * The system assigned name of the trigger being updated.
     * @param triggerId Value for String
     */
    @JsonSetter("triggerId")
    public void setTriggerId(String triggerId) {
        this.triggerId = triggerId;
    }

    /**
     * Getter for TriggerName.
     * The user defined name of the trigger.
     * @return Returns the String
     */
    @JsonGetter("triggerName")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getTriggerName() {
        return triggerName;
    }

    /**
     * Setter for TriggerName.
     * The user defined name of the trigger.
     * @param triggerName Value for String
     */
    @JsonSetter("triggerName")
    public void setTriggerName(String triggerName) {
        this.triggerName = triggerName;
    }

    /**
     * Getter for OrganizationName.
     * The user assigned name of the organization associated with the trigger.
     * @return Returns the String
     */
    @JsonGetter("organizationName")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getOrganizationName() {
        return organizationName;
    }

    /**
     * Setter for OrganizationName.
     * The user assigned name of the organization associated with the trigger.
     * @param organizationName Value for String
     */
    @JsonSetter("organizationName")
    public void setOrganizationName(String organizationName) {
        this.organizationName = organizationName;
    }

    /**
     * Getter for TriggerCategory.
     * This is the value to use in the request body to detect anomalous behaivior. The values in
     * this table will only be relevant when this parameter is set to this value.
     * @return Returns the String
     */
    @JsonGetter("triggerCategory")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getTriggerCategory() {
        return triggerCategory;
    }

    /**
     * Setter for TriggerCategory.
     * This is the value to use in the request body to detect anomalous behaivior. The values in
     * this table will only be relevant when this parameter is set to this value.
     * @param triggerCategory Value for String
     */
    @JsonSetter("triggerCategory")
    public void setTriggerCategory(String triggerCategory) {
        this.triggerCategory = triggerCategory;
    }

    /**
     * Getter for TriggerAttributes.
     * Additional details and keys for the trigger.
     * @return Returns the List of TriggerAttributesOptions
     */
    @JsonGetter("triggerAttributes")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<TriggerAttributesOptions> getTriggerAttributes() {
        return triggerAttributes;
    }

    /**
     * Setter for TriggerAttributes.
     * Additional details and keys for the trigger.
     * @param triggerAttributes Value for List of TriggerAttributesOptions
     */
    @JsonSetter("triggerAttributes")
    public void setTriggerAttributes(List<TriggerAttributesOptions> triggerAttributes) {
        this.triggerAttributes = triggerAttributes;
    }

    /**
     * Getter for CreatedAt.
     * Timestamp for whe the trigger was created.
     * @return Returns the String
     */
    @JsonGetter("createdAt")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getCreatedAt() {
        return createdAt;
    }

    /**
     * Setter for CreatedAt.
     * Timestamp for whe the trigger was created.
     * @param createdAt Value for String
     */
    @JsonSetter("createdAt")
    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * Getter for ModifiedAt.
     * Timestamp for the most recent time the trigger was modified.
     * @return Returns the String
     */
    @JsonGetter("modifiedAt")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getModifiedAt() {
        return modifiedAt;
    }

    /**
     * Setter for ModifiedAt.
     * Timestamp for the most recent time the trigger was modified.
     * @param modifiedAt Value for String
     */
    @JsonSetter("modifiedAt")
    public void setModifiedAt(String modifiedAt) {
        this.modifiedAt = modifiedAt;
    }

    /**
     * Converts this AnomalyTriggerValue into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "AnomalyTriggerValue [" + "triggerId=" + triggerId + ", triggerName=" + triggerName
                + ", organizationName=" + organizationName + ", triggerCategory=" + triggerCategory
                + ", triggerAttributes=" + triggerAttributes + ", createdAt=" + createdAt
                + ", modifiedAt=" + modifiedAt + "]";
    }

    /**
     * Builds a new {@link AnomalyTriggerValue.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link AnomalyTriggerValue.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .triggerId(getTriggerId())
                .triggerName(getTriggerName())
                .organizationName(getOrganizationName())
                .triggerCategory(getTriggerCategory())
                .triggerAttributes(getTriggerAttributes())
                .createdAt(getCreatedAt())
                .modifiedAt(getModifiedAt());
        return builder;
    }

    /**
     * Class to build instances of {@link AnomalyTriggerValue}.
     */
    public static class Builder {
        private String triggerId;
        private String triggerName;
        private String organizationName;
        private String triggerCategory;
        private List<TriggerAttributesOptions> triggerAttributes;
        private String createdAt;
        private String modifiedAt;



        /**
         * Setter for triggerId.
         * @param  triggerId  String value for triggerId.
         * @return Builder
         */
        public Builder triggerId(String triggerId) {
            this.triggerId = triggerId;
            return this;
        }

        /**
         * Setter for triggerName.
         * @param  triggerName  String value for triggerName.
         * @return Builder
         */
        public Builder triggerName(String triggerName) {
            this.triggerName = triggerName;
            return this;
        }

        /**
         * Setter for organizationName.
         * @param  organizationName  String value for organizationName.
         * @return Builder
         */
        public Builder organizationName(String organizationName) {
            this.organizationName = organizationName;
            return this;
        }

        /**
         * Setter for triggerCategory.
         * @param  triggerCategory  String value for triggerCategory.
         * @return Builder
         */
        public Builder triggerCategory(String triggerCategory) {
            this.triggerCategory = triggerCategory;
            return this;
        }

        /**
         * Setter for triggerAttributes.
         * @param  triggerAttributes  List of TriggerAttributesOptions value for triggerAttributes.
         * @return Builder
         */
        public Builder triggerAttributes(List<TriggerAttributesOptions> triggerAttributes) {
            this.triggerAttributes = triggerAttributes;
            return this;
        }

        /**
         * Setter for createdAt.
         * @param  createdAt  String value for createdAt.
         * @return Builder
         */
        public Builder createdAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        /**
         * Setter for modifiedAt.
         * @param  modifiedAt  String value for modifiedAt.
         * @return Builder
         */
        public Builder modifiedAt(String modifiedAt) {
            this.modifiedAt = modifiedAt;
            return this;
        }

        /**
         * Builds a new {@link AnomalyTriggerValue} object using the set fields.
         * @return {@link AnomalyTriggerValue}
         */
        public AnomalyTriggerValue build() {
            return new AnomalyTriggerValue(triggerId, triggerName, organizationName,
                    triggerCategory, triggerAttributes, createdAt, modifiedAt);
        }
    }
}
