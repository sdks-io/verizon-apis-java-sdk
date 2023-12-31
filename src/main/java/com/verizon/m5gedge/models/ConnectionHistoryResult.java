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
 * This is a model class for ConnectionHistoryResult type.
 */
public class ConnectionHistoryResult {
    private List<ConnectionEvent> connectionHistory;
    private Boolean hasMoreData;

    /**
     * Default constructor.
     */
    public ConnectionHistoryResult() {
    }

    /**
     * Initialization constructor.
     * @param  connectionHistory  List of ConnectionEvent value for connectionHistory.
     * @param  hasMoreData  Boolean value for hasMoreData.
     */
    public ConnectionHistoryResult(
            List<ConnectionEvent> connectionHistory,
            Boolean hasMoreData) {
        this.connectionHistory = connectionHistory;
        this.hasMoreData = hasMoreData;
    }

    /**
     * Getter for ConnectionHistory.
     * Device connection events, sorted by the occurredAt timestamp, oldest first.
     * @return Returns the List of ConnectionEvent
     */
    @JsonGetter("connectionHistory")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<ConnectionEvent> getConnectionHistory() {
        return connectionHistory;
    }

    /**
     * Setter for ConnectionHistory.
     * Device connection events, sorted by the occurredAt timestamp, oldest first.
     * @param connectionHistory Value for List of ConnectionEvent
     */
    @JsonSetter("connectionHistory")
    public void setConnectionHistory(List<ConnectionEvent> connectionHistory) {
        this.connectionHistory = connectionHistory;
    }

    /**
     * Getter for HasMoreData.
     * False for a status 200 response.True for a status 202 response, indicating that there is more
     * data to be retrieved. Send another request, adjusting the earliest value in the request based
     * on the occuredAt value for the last device in the current response.
     * @return Returns the Boolean
     */
    @JsonGetter("hasMoreData")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getHasMoreData() {
        return hasMoreData;
    }

    /**
     * Setter for HasMoreData.
     * False for a status 200 response.True for a status 202 response, indicating that there is more
     * data to be retrieved. Send another request, adjusting the earliest value in the request based
     * on the occuredAt value for the last device in the current response.
     * @param hasMoreData Value for Boolean
     */
    @JsonSetter("hasMoreData")
    public void setHasMoreData(Boolean hasMoreData) {
        this.hasMoreData = hasMoreData;
    }

    /**
     * Converts this ConnectionHistoryResult into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "ConnectionHistoryResult [" + "connectionHistory=" + connectionHistory
                + ", hasMoreData=" + hasMoreData + "]";
    }

    /**
     * Builds a new {@link ConnectionHistoryResult.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link ConnectionHistoryResult.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .connectionHistory(getConnectionHistory())
                .hasMoreData(getHasMoreData());
        return builder;
    }

    /**
     * Class to build instances of {@link ConnectionHistoryResult}.
     */
    public static class Builder {
        private List<ConnectionEvent> connectionHistory;
        private Boolean hasMoreData;



        /**
         * Setter for connectionHistory.
         * @param  connectionHistory  List of ConnectionEvent value for connectionHistory.
         * @return Builder
         */
        public Builder connectionHistory(List<ConnectionEvent> connectionHistory) {
            this.connectionHistory = connectionHistory;
            return this;
        }

        /**
         * Setter for hasMoreData.
         * @param  hasMoreData  Boolean value for hasMoreData.
         * @return Builder
         */
        public Builder hasMoreData(Boolean hasMoreData) {
            this.hasMoreData = hasMoreData;
            return this;
        }

        /**
         * Builds a new {@link ConnectionHistoryResult} object using the set fields.
         * @return {@link ConnectionHistoryResult}
         */
        public ConnectionHistoryResult build() {
            return new ConnectionHistoryResult(connectionHistory, hasMoreData);
        }
    }
}
