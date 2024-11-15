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
 * This is a model class for Notification type.
 */
public class Notification {
    private String notificationType;
    private Boolean callback;
    private Boolean emailNotification;
    private String notificationGroupName;
    private Integer notificationFrequencyFactor;
    private String notificationFrequencyInterval;
    private String externalEmailRecipients;
    private Boolean smsNotification;
    private List<SmsNumbers> smsNumbers;
    private Boolean reminder;
    private String severity;

    /**
     * Default constructor.
     */
    public Notification() {
    }

    /**
     * Initialization constructor.
     * @param  notificationType  String value for notificationType.
     * @param  callback  Boolean value for callback.
     * @param  emailNotification  Boolean value for emailNotification.
     * @param  notificationGroupName  String value for notificationGroupName.
     * @param  notificationFrequencyFactor  Integer value for notificationFrequencyFactor.
     * @param  notificationFrequencyInterval  String value for notificationFrequencyInterval.
     * @param  externalEmailRecipients  String value for externalEmailRecipients.
     * @param  smsNotification  Boolean value for smsNotification.
     * @param  smsNumbers  List of SmsNumbers value for smsNumbers.
     * @param  reminder  Boolean value for reminder.
     * @param  severity  String value for severity.
     */
    public Notification(
            String notificationType,
            Boolean callback,
            Boolean emailNotification,
            String notificationGroupName,
            Integer notificationFrequencyFactor,
            String notificationFrequencyInterval,
            String externalEmailRecipients,
            Boolean smsNotification,
            List<SmsNumbers> smsNumbers,
            Boolean reminder,
            String severity) {
        this.notificationType = notificationType;
        this.callback = callback;
        this.emailNotification = emailNotification;
        this.notificationGroupName = notificationGroupName;
        this.notificationFrequencyFactor = notificationFrequencyFactor;
        this.notificationFrequencyInterval = notificationFrequencyInterval;
        this.externalEmailRecipients = externalEmailRecipients;
        this.smsNotification = smsNotification;
        this.smsNumbers = smsNumbers;
        this.reminder = reminder;
        this.severity = severity;
    }

    /**
     * Getter for NotificationType.
     * @return Returns the String
     */
    @JsonGetter("notificationType")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getNotificationType() {
        return notificationType;
    }

    /**
     * Setter for NotificationType.
     * @param notificationType Value for String
     */
    @JsonSetter("notificationType")
    public void setNotificationType(String notificationType) {
        this.notificationType = notificationType;
    }

    /**
     * Getter for Callback.
     * @return Returns the Boolean
     */
    @JsonGetter("callback")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getCallback() {
        return callback;
    }

    /**
     * Setter for Callback.
     * @param callback Value for Boolean
     */
    @JsonSetter("callback")
    public void setCallback(Boolean callback) {
        this.callback = callback;
    }

    /**
     * Getter for EmailNotification.
     * @return Returns the Boolean
     */
    @JsonGetter("emailNotification")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getEmailNotification() {
        return emailNotification;
    }

    /**
     * Setter for EmailNotification.
     * @param emailNotification Value for Boolean
     */
    @JsonSetter("emailNotification")
    public void setEmailNotification(Boolean emailNotification) {
        this.emailNotification = emailNotification;
    }

    /**
     * Getter for NotificationGroupName.
     * @return Returns the String
     */
    @JsonGetter("notificationGroupName")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getNotificationGroupName() {
        return notificationGroupName;
    }

    /**
     * Setter for NotificationGroupName.
     * @param notificationGroupName Value for String
     */
    @JsonSetter("notificationGroupName")
    public void setNotificationGroupName(String notificationGroupName) {
        this.notificationGroupName = notificationGroupName;
    }

    /**
     * Getter for NotificationFrequencyFactor.
     * @return Returns the Integer
     */
    @JsonGetter("notificationFrequencyFactor")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getNotificationFrequencyFactor() {
        return notificationFrequencyFactor;
    }

    /**
     * Setter for NotificationFrequencyFactor.
     * @param notificationFrequencyFactor Value for Integer
     */
    @JsonSetter("notificationFrequencyFactor")
    public void setNotificationFrequencyFactor(Integer notificationFrequencyFactor) {
        this.notificationFrequencyFactor = notificationFrequencyFactor;
    }

    /**
     * Getter for NotificationFrequencyInterval.
     * @return Returns the String
     */
    @JsonGetter("notificationFrequencyInterval")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getNotificationFrequencyInterval() {
        return notificationFrequencyInterval;
    }

    /**
     * Setter for NotificationFrequencyInterval.
     * @param notificationFrequencyInterval Value for String
     */
    @JsonSetter("notificationFrequencyInterval")
    public void setNotificationFrequencyInterval(String notificationFrequencyInterval) {
        this.notificationFrequencyInterval = notificationFrequencyInterval;
    }

    /**
     * Getter for ExternalEmailRecipients.
     * @return Returns the String
     */
    @JsonGetter("externalEmailRecipients")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getExternalEmailRecipients() {
        return externalEmailRecipients;
    }

    /**
     * Setter for ExternalEmailRecipients.
     * @param externalEmailRecipients Value for String
     */
    @JsonSetter("externalEmailRecipients")
    public void setExternalEmailRecipients(String externalEmailRecipients) {
        this.externalEmailRecipients = externalEmailRecipients;
    }

    /**
     * Getter for SmsNotification.
     * @return Returns the Boolean
     */
    @JsonGetter("smsNotification")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getSmsNotification() {
        return smsNotification;
    }

    /**
     * Setter for SmsNotification.
     * @param smsNotification Value for Boolean
     */
    @JsonSetter("smsNotification")
    public void setSmsNotification(Boolean smsNotification) {
        this.smsNotification = smsNotification;
    }

    /**
     * Getter for SmsNumbers.
     * @return Returns the List of SmsNumbers
     */
    @JsonGetter("smsNumbers")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<SmsNumbers> getSmsNumbers() {
        return smsNumbers;
    }

    /**
     * Setter for SmsNumbers.
     * @param smsNumbers Value for List of SmsNumbers
     */
    @JsonSetter("smsNumbers")
    public void setSmsNumbers(List<SmsNumbers> smsNumbers) {
        this.smsNumbers = smsNumbers;
    }

    /**
     * Getter for Reminder.
     * @return Returns the Boolean
     */
    @JsonGetter("reminder")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getReminder() {
        return reminder;
    }

    /**
     * Setter for Reminder.
     * @param reminder Value for Boolean
     */
    @JsonSetter("reminder")
    public void setReminder(Boolean reminder) {
        this.reminder = reminder;
    }

    /**
     * Getter for Severity.
     * @return Returns the String
     */
    @JsonGetter("severity")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getSeverity() {
        return severity;
    }

    /**
     * Setter for Severity.
     * @param severity Value for String
     */
    @JsonSetter("severity")
    public void setSeverity(String severity) {
        this.severity = severity;
    }

    /**
     * Converts this Notification into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "Notification [" + "notificationType=" + notificationType + ", callback=" + callback
                + ", emailNotification=" + emailNotification + ", notificationGroupName="
                + notificationGroupName + ", notificationFrequencyFactor="
                + notificationFrequencyFactor + ", notificationFrequencyInterval="
                + notificationFrequencyInterval + ", externalEmailRecipients="
                + externalEmailRecipients + ", smsNotification=" + smsNotification + ", smsNumbers="
                + smsNumbers + ", reminder=" + reminder + ", severity=" + severity + "]";
    }

    /**
     * Builds a new {@link Notification.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link Notification.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .notificationType(getNotificationType())
                .callback(getCallback())
                .emailNotification(getEmailNotification())
                .notificationGroupName(getNotificationGroupName())
                .notificationFrequencyFactor(getNotificationFrequencyFactor())
                .notificationFrequencyInterval(getNotificationFrequencyInterval())
                .externalEmailRecipients(getExternalEmailRecipients())
                .smsNotification(getSmsNotification())
                .smsNumbers(getSmsNumbers())
                .reminder(getReminder())
                .severity(getSeverity());
        return builder;
    }

    /**
     * Class to build instances of {@link Notification}.
     */
    public static class Builder {
        private String notificationType;
        private Boolean callback;
        private Boolean emailNotification;
        private String notificationGroupName;
        private Integer notificationFrequencyFactor;
        private String notificationFrequencyInterval;
        private String externalEmailRecipients;
        private Boolean smsNotification;
        private List<SmsNumbers> smsNumbers;
        private Boolean reminder;
        private String severity;



        /**
         * Setter for notificationType.
         * @param  notificationType  String value for notificationType.
         * @return Builder
         */
        public Builder notificationType(String notificationType) {
            this.notificationType = notificationType;
            return this;
        }

        /**
         * Setter for callback.
         * @param  callback  Boolean value for callback.
         * @return Builder
         */
        public Builder callback(Boolean callback) {
            this.callback = callback;
            return this;
        }

        /**
         * Setter for emailNotification.
         * @param  emailNotification  Boolean value for emailNotification.
         * @return Builder
         */
        public Builder emailNotification(Boolean emailNotification) {
            this.emailNotification = emailNotification;
            return this;
        }

        /**
         * Setter for notificationGroupName.
         * @param  notificationGroupName  String value for notificationGroupName.
         * @return Builder
         */
        public Builder notificationGroupName(String notificationGroupName) {
            this.notificationGroupName = notificationGroupName;
            return this;
        }

        /**
         * Setter for notificationFrequencyFactor.
         * @param  notificationFrequencyFactor  Integer value for notificationFrequencyFactor.
         * @return Builder
         */
        public Builder notificationFrequencyFactor(Integer notificationFrequencyFactor) {
            this.notificationFrequencyFactor = notificationFrequencyFactor;
            return this;
        }

        /**
         * Setter for notificationFrequencyInterval.
         * @param  notificationFrequencyInterval  String value for notificationFrequencyInterval.
         * @return Builder
         */
        public Builder notificationFrequencyInterval(String notificationFrequencyInterval) {
            this.notificationFrequencyInterval = notificationFrequencyInterval;
            return this;
        }

        /**
         * Setter for externalEmailRecipients.
         * @param  externalEmailRecipients  String value for externalEmailRecipients.
         * @return Builder
         */
        public Builder externalEmailRecipients(String externalEmailRecipients) {
            this.externalEmailRecipients = externalEmailRecipients;
            return this;
        }

        /**
         * Setter for smsNotification.
         * @param  smsNotification  Boolean value for smsNotification.
         * @return Builder
         */
        public Builder smsNotification(Boolean smsNotification) {
            this.smsNotification = smsNotification;
            return this;
        }

        /**
         * Setter for smsNumbers.
         * @param  smsNumbers  List of SmsNumbers value for smsNumbers.
         * @return Builder
         */
        public Builder smsNumbers(List<SmsNumbers> smsNumbers) {
            this.smsNumbers = smsNumbers;
            return this;
        }

        /**
         * Setter for reminder.
         * @param  reminder  Boolean value for reminder.
         * @return Builder
         */
        public Builder reminder(Boolean reminder) {
            this.reminder = reminder;
            return this;
        }

        /**
         * Setter for severity.
         * @param  severity  String value for severity.
         * @return Builder
         */
        public Builder severity(String severity) {
            this.severity = severity;
            return this;
        }

        /**
         * Builds a new {@link Notification} object using the set fields.
         * @return {@link Notification}
         */
        public Notification build() {
            return new Notification(notificationType, callback, emailNotification,
                    notificationGroupName, notificationFrequencyFactor,
                    notificationFrequencyInterval, externalEmailRecipients, smsNotification,
                    smsNumbers, reminder, severity);
        }
    }
}
