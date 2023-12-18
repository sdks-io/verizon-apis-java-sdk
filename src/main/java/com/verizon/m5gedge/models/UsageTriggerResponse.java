/*
 * VerizonLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.verizon.m5gedge.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * This is a model class for UsageTriggerResponse type.
 */
public class UsageTriggerResponse {
    private String triggerId;
    private String triggerName;
    private String accountName;
    private ServiceNameEnum serviceName;
    private String thresholdValue;
    private boolean allowExcess;
    private boolean sendSmsNotification;
    private String smsPhoneNumbers;
    private boolean sendEmailNotification;
    private String emailAddresses;
    private String createDate;
    private String updateDate;

    /**
     * Default constructor.
     */
    public UsageTriggerResponse() {
        serviceName = ServiceNameEnum.LOCATION;
    }

    /**
     * Initialization constructor.
     * @param  triggerId  String value for triggerId.
     * @param  triggerName  String value for triggerName.
     * @param  accountName  String value for accountName.
     * @param  serviceName  ServiceNameEnum value for serviceName.
     * @param  thresholdValue  String value for thresholdValue.
     * @param  allowExcess  boolean value for allowExcess.
     * @param  sendSmsNotification  boolean value for sendSmsNotification.
     * @param  smsPhoneNumbers  String value for smsPhoneNumbers.
     * @param  sendEmailNotification  boolean value for sendEmailNotification.
     * @param  emailAddresses  String value for emailAddresses.
     * @param  createDate  String value for createDate.
     * @param  updateDate  String value for updateDate.
     */
    public UsageTriggerResponse(
            String triggerId,
            String triggerName,
            String accountName,
            ServiceNameEnum serviceName,
            String thresholdValue,
            boolean allowExcess,
            boolean sendSmsNotification,
            String smsPhoneNumbers,
            boolean sendEmailNotification,
            String emailAddresses,
            String createDate,
            String updateDate) {
        this.triggerId = triggerId;
        this.triggerName = triggerName;
        this.accountName = accountName;
        this.serviceName = serviceName;
        this.thresholdValue = thresholdValue;
        this.allowExcess = allowExcess;
        this.sendSmsNotification = sendSmsNotification;
        this.smsPhoneNumbers = smsPhoneNumbers;
        this.sendEmailNotification = sendEmailNotification;
        this.emailAddresses = emailAddresses;
        this.createDate = createDate;
        this.updateDate = updateDate;
    }

    /**
     * Getter for TriggerId.
     * Unique usage triggerId
     * @return Returns the String
     */
    @JsonGetter("triggerId")
    public String getTriggerId() {
        return triggerId;
    }

    /**
     * Setter for TriggerId.
     * Unique usage triggerId
     * @param triggerId Value for String
     */
    @JsonSetter("triggerId")
    public void setTriggerId(String triggerId) {
        this.triggerId = triggerId;
    }

    /**
     * Getter for TriggerName.
     * Usage trigger name
     * @return Returns the String
     */
    @JsonGetter("triggerName")
    public String getTriggerName() {
        return triggerName;
    }

    /**
     * Setter for TriggerName.
     * Usage trigger name
     * @param triggerName Value for String
     */
    @JsonSetter("triggerName")
    public void setTriggerName(String triggerName) {
        this.triggerName = triggerName;
    }

    /**
     * Getter for AccountName.
     * Account name
     * @return Returns the String
     */
    @JsonGetter("accountName")
    public String getAccountName() {
        return accountName;
    }

    /**
     * Setter for AccountName.
     * Account name
     * @param accountName Value for String
     */
    @JsonSetter("accountName")
    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    /**
     * Getter for ServiceName.
     * Service name
     * @return Returns the ServiceNameEnum
     */
    @JsonGetter("serviceName")
    public ServiceNameEnum getServiceName() {
        return serviceName;
    }

    /**
     * Setter for ServiceName.
     * Service name
     * @param serviceName Value for ServiceNameEnum
     */
    @JsonSetter("serviceName")
    public void setServiceName(ServiceNameEnum serviceName) {
        this.serviceName = serviceName;
    }

    /**
     * Getter for ThresholdValue.
     * Percent of subscription at which trigger will send an alert
     * @return Returns the String
     */
    @JsonGetter("thresholdValue")
    public String getThresholdValue() {
        return thresholdValue;
    }

    /**
     * Setter for ThresholdValue.
     * Percent of subscription at which trigger will send an alert
     * @param thresholdValue Value for String
     */
    @JsonSetter("thresholdValue")
    public void setThresholdValue(String thresholdValue) {
        this.thresholdValue = thresholdValue;
    }

    /**
     * Getter for AllowExcess.
     * allowExcess determines whether to restrict usage after exceeds limits
     * @return Returns the boolean
     */
    @JsonGetter("allowExcess")
    public boolean getAllowExcess() {
        return allowExcess;
    }

    /**
     * Setter for AllowExcess.
     * allowExcess determines whether to restrict usage after exceeds limits
     * @param allowExcess Value for boolean
     */
    @JsonSetter("allowExcess")
    public void setAllowExcess(boolean allowExcess) {
        this.allowExcess = allowExcess;
    }

    /**
     * Getter for SendSmsNotification.
     * Send SMS (text) alerts when the thresholdValue is reached.
     * @return Returns the boolean
     */
    @JsonGetter("sendSmsNotification")
    public boolean getSendSmsNotification() {
        return sendSmsNotification;
    }

    /**
     * Setter for SendSmsNotification.
     * Send SMS (text) alerts when the thresholdValue is reached.
     * @param sendSmsNotification Value for boolean
     */
    @JsonSetter("sendSmsNotification")
    public void setSendSmsNotification(boolean sendSmsNotification) {
        this.sendSmsNotification = sendSmsNotification;
    }

    /**
     * Getter for SmsPhoneNumbers.
     * comma seperated value of list of Phone numbers for SMS notifications
     * @return Returns the String
     */
    @JsonGetter("smsPhoneNumbers")
    public String getSmsPhoneNumbers() {
        return smsPhoneNumbers;
    }

    /**
     * Setter for SmsPhoneNumbers.
     * comma seperated value of list of Phone numbers for SMS notifications
     * @param smsPhoneNumbers Value for String
     */
    @JsonSetter("smsPhoneNumbers")
    public void setSmsPhoneNumbers(String smsPhoneNumbers) {
        this.smsPhoneNumbers = smsPhoneNumbers;
    }

    /**
     * Getter for SendEmailNotification.
     * Send email alerts when the thresholdValue is reached.
     * @return Returns the boolean
     */
    @JsonGetter("sendEmailNotification")
    public boolean getSendEmailNotification() {
        return sendEmailNotification;
    }

    /**
     * Setter for SendEmailNotification.
     * Send email alerts when the thresholdValue is reached.
     * @param sendEmailNotification Value for boolean
     */
    @JsonSetter("sendEmailNotification")
    public void setSendEmailNotification(boolean sendEmailNotification) {
        this.sendEmailNotification = sendEmailNotification;
    }

    /**
     * Getter for EmailAddresses.
     * comma seperated value of list of Email addresses for Email notifications
     * @return Returns the String
     */
    @JsonGetter("emailAddresses")
    public String getEmailAddresses() {
        return emailAddresses;
    }

    /**
     * Setter for EmailAddresses.
     * comma seperated value of list of Email addresses for Email notifications
     * @param emailAddresses Value for String
     */
    @JsonSetter("emailAddresses")
    public void setEmailAddresses(String emailAddresses) {
        this.emailAddresses = emailAddresses;
    }

    /**
     * Getter for CreateDate.
     * UTC Date when the usage trigger was created
     * @return Returns the String
     */
    @JsonGetter("createDate")
    public String getCreateDate() {
        return createDate;
    }

    /**
     * Setter for CreateDate.
     * UTC Date when the usage trigger was created
     * @param createDate Value for String
     */
    @JsonSetter("createDate")
    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }

    /**
     * Getter for UpdateDate.
     * UTC Date when the usage trigger was last updated
     * @return Returns the String
     */
    @JsonGetter("updateDate")
    public String getUpdateDate() {
        return updateDate;
    }

    /**
     * Setter for UpdateDate.
     * UTC Date when the usage trigger was last updated
     * @param updateDate Value for String
     */
    @JsonSetter("updateDate")
    public void setUpdateDate(String updateDate) {
        this.updateDate = updateDate;
    }

    /**
     * Converts this UsageTriggerResponse into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "UsageTriggerResponse [" + "triggerId=" + triggerId + ", triggerName=" + triggerName
                + ", accountName=" + accountName + ", serviceName=" + serviceName
                + ", thresholdValue=" + thresholdValue + ", allowExcess=" + allowExcess
                + ", sendSmsNotification=" + sendSmsNotification + ", smsPhoneNumbers="
                + smsPhoneNumbers + ", sendEmailNotification=" + sendEmailNotification
                + ", emailAddresses=" + emailAddresses + ", createDate=" + createDate
                + ", updateDate=" + updateDate + "]";
    }

    /**
     * Builds a new {@link UsageTriggerResponse.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link UsageTriggerResponse.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(triggerId, triggerName, accountName, serviceName,
                thresholdValue, allowExcess, sendSmsNotification, smsPhoneNumbers,
                sendEmailNotification, emailAddresses, createDate, updateDate);
        return builder;
    }

    /**
     * Class to build instances of {@link UsageTriggerResponse}.
     */
    public static class Builder {
        private String triggerId;
        private String triggerName;
        private String accountName;
        private ServiceNameEnum serviceName = ServiceNameEnum.LOCATION;
        private String thresholdValue;
        private boolean allowExcess;
        private boolean sendSmsNotification;
        private String smsPhoneNumbers;
        private boolean sendEmailNotification;
        private String emailAddresses;
        private String createDate;
        private String updateDate;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  triggerId  String value for triggerId.
         * @param  triggerName  String value for triggerName.
         * @param  accountName  String value for accountName.
         * @param  serviceName  ServiceNameEnum value for serviceName.
         * @param  thresholdValue  String value for thresholdValue.
         * @param  allowExcess  boolean value for allowExcess.
         * @param  sendSmsNotification  boolean value for sendSmsNotification.
         * @param  smsPhoneNumbers  String value for smsPhoneNumbers.
         * @param  sendEmailNotification  boolean value for sendEmailNotification.
         * @param  emailAddresses  String value for emailAddresses.
         * @param  createDate  String value for createDate.
         * @param  updateDate  String value for updateDate.
         */
        public Builder(String triggerId, String triggerName, String accountName,
                ServiceNameEnum serviceName, String thresholdValue, boolean allowExcess,
                boolean sendSmsNotification, String smsPhoneNumbers, boolean sendEmailNotification,
                String emailAddresses, String createDate, String updateDate) {
            this.triggerId = triggerId;
            this.triggerName = triggerName;
            this.accountName = accountName;
            this.serviceName = serviceName;
            this.thresholdValue = thresholdValue;
            this.allowExcess = allowExcess;
            this.sendSmsNotification = sendSmsNotification;
            this.smsPhoneNumbers = smsPhoneNumbers;
            this.sendEmailNotification = sendEmailNotification;
            this.emailAddresses = emailAddresses;
            this.createDate = createDate;
            this.updateDate = updateDate;
        }

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
         * Setter for accountName.
         * @param  accountName  String value for accountName.
         * @return Builder
         */
        public Builder accountName(String accountName) {
            this.accountName = accountName;
            return this;
        }

        /**
         * Setter for serviceName.
         * @param  serviceName  ServiceNameEnum value for serviceName.
         * @return Builder
         */
        public Builder serviceName(ServiceNameEnum serviceName) {
            this.serviceName = serviceName;
            return this;
        }

        /**
         * Setter for thresholdValue.
         * @param  thresholdValue  String value for thresholdValue.
         * @return Builder
         */
        public Builder thresholdValue(String thresholdValue) {
            this.thresholdValue = thresholdValue;
            return this;
        }

        /**
         * Setter for allowExcess.
         * @param  allowExcess  boolean value for allowExcess.
         * @return Builder
         */
        public Builder allowExcess(boolean allowExcess) {
            this.allowExcess = allowExcess;
            return this;
        }

        /**
         * Setter for sendSmsNotification.
         * @param  sendSmsNotification  boolean value for sendSmsNotification.
         * @return Builder
         */
        public Builder sendSmsNotification(boolean sendSmsNotification) {
            this.sendSmsNotification = sendSmsNotification;
            return this;
        }

        /**
         * Setter for smsPhoneNumbers.
         * @param  smsPhoneNumbers  String value for smsPhoneNumbers.
         * @return Builder
         */
        public Builder smsPhoneNumbers(String smsPhoneNumbers) {
            this.smsPhoneNumbers = smsPhoneNumbers;
            return this;
        }

        /**
         * Setter for sendEmailNotification.
         * @param  sendEmailNotification  boolean value for sendEmailNotification.
         * @return Builder
         */
        public Builder sendEmailNotification(boolean sendEmailNotification) {
            this.sendEmailNotification = sendEmailNotification;
            return this;
        }

        /**
         * Setter for emailAddresses.
         * @param  emailAddresses  String value for emailAddresses.
         * @return Builder
         */
        public Builder emailAddresses(String emailAddresses) {
            this.emailAddresses = emailAddresses;
            return this;
        }

        /**
         * Setter for createDate.
         * @param  createDate  String value for createDate.
         * @return Builder
         */
        public Builder createDate(String createDate) {
            this.createDate = createDate;
            return this;
        }

        /**
         * Setter for updateDate.
         * @param  updateDate  String value for updateDate.
         * @return Builder
         */
        public Builder updateDate(String updateDate) {
            this.updateDate = updateDate;
            return this;
        }

        /**
         * Builds a new {@link UsageTriggerResponse} object using the set fields.
         * @return {@link UsageTriggerResponse}
         */
        public UsageTriggerResponse build() {
            return new UsageTriggerResponse(triggerId, triggerName, accountName, serviceName,
                    thresholdValue, allowExcess, sendSmsNotification, smsPhoneNumbers,
                    sendEmailNotification, emailAddresses, createDate, updateDate);
        }
    }
}