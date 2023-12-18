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
 * This is a model class for V3CampaignHistory type.
 */
public class V3CampaignHistory {
    private boolean hasMoreData;
    private String lastSeenCampaignId;
    private List<V3CampaignMetaInfo> campaignList;

    /**
     * Default constructor.
     */
    public V3CampaignHistory() {
    }

    /**
     * Initialization constructor.
     * @param  hasMoreData  boolean value for hasMoreData.
     * @param  campaignList  List of V3CampaignMetaInfo value for campaignList.
     * @param  lastSeenCampaignId  String value for lastSeenCampaignId.
     */
    public V3CampaignHistory(
            boolean hasMoreData,
            List<V3CampaignMetaInfo> campaignList,
            String lastSeenCampaignId) {
        this.hasMoreData = hasMoreData;
        this.lastSeenCampaignId = lastSeenCampaignId;
        this.campaignList = campaignList;
    }

    /**
     * Getter for HasMoreData.
     * Has more report flag?
     * @return Returns the boolean
     */
    @JsonGetter("hasMoreData")
    public boolean getHasMoreData() {
        return hasMoreData;
    }

    /**
     * Setter for HasMoreData.
     * Has more report flag?
     * @param hasMoreData Value for boolean
     */
    @JsonSetter("hasMoreData")
    public void setHasMoreData(boolean hasMoreData) {
        this.hasMoreData = hasMoreData;
    }

    /**
     * Getter for LastSeenCampaignId.
     * Campaign identifier.
     * @return Returns the String
     */
    @JsonGetter("lastSeenCampaignId")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getLastSeenCampaignId() {
        return lastSeenCampaignId;
    }

    /**
     * Setter for LastSeenCampaignId.
     * Campaign identifier.
     * @param lastSeenCampaignId Value for String
     */
    @JsonSetter("lastSeenCampaignId")
    public void setLastSeenCampaignId(String lastSeenCampaignId) {
        this.lastSeenCampaignId = lastSeenCampaignId;
    }

    /**
     * Getter for CampaignList.
     * Firmware upgrade list.
     * @return Returns the List of V3CampaignMetaInfo
     */
    @JsonGetter("campaignList")
    public List<V3CampaignMetaInfo> getCampaignList() {
        return campaignList;
    }

    /**
     * Setter for CampaignList.
     * Firmware upgrade list.
     * @param campaignList Value for List of V3CampaignMetaInfo
     */
    @JsonSetter("campaignList")
    public void setCampaignList(List<V3CampaignMetaInfo> campaignList) {
        this.campaignList = campaignList;
    }

    /**
     * Converts this V3CampaignHistory into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "V3CampaignHistory [" + "hasMoreData=" + hasMoreData + ", campaignList="
                + campaignList + ", lastSeenCampaignId=" + lastSeenCampaignId + "]";
    }

    /**
     * Builds a new {@link V3CampaignHistory.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link V3CampaignHistory.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(hasMoreData, campaignList)
                .lastSeenCampaignId(getLastSeenCampaignId());
        return builder;
    }

    /**
     * Class to build instances of {@link V3CampaignHistory}.
     */
    public static class Builder {
        private boolean hasMoreData;
        private List<V3CampaignMetaInfo> campaignList;
        private String lastSeenCampaignId;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  hasMoreData  boolean value for hasMoreData.
         * @param  campaignList  List of V3CampaignMetaInfo value for campaignList.
         */
        public Builder(boolean hasMoreData, List<V3CampaignMetaInfo> campaignList) {
            this.hasMoreData = hasMoreData;
            this.campaignList = campaignList;
        }

        /**
         * Setter for hasMoreData.
         * @param  hasMoreData  boolean value for hasMoreData.
         * @return Builder
         */
        public Builder hasMoreData(boolean hasMoreData) {
            this.hasMoreData = hasMoreData;
            return this;
        }

        /**
         * Setter for campaignList.
         * @param  campaignList  List of V3CampaignMetaInfo value for campaignList.
         * @return Builder
         */
        public Builder campaignList(List<V3CampaignMetaInfo> campaignList) {
            this.campaignList = campaignList;
            return this;
        }

        /**
         * Setter for lastSeenCampaignId.
         * @param  lastSeenCampaignId  String value for lastSeenCampaignId.
         * @return Builder
         */
        public Builder lastSeenCampaignId(String lastSeenCampaignId) {
            this.lastSeenCampaignId = lastSeenCampaignId;
            return this;
        }

        /**
         * Builds a new {@link V3CampaignHistory} object using the set fields.
         * @return {@link V3CampaignHistory}
         */
        public V3CampaignHistory build() {
            return new V3CampaignHistory(hasMoreData, campaignList, lastSeenCampaignId);
        }
    }
}