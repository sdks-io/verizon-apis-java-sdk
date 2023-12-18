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
 * This is a model class for ResourcesEdgeHostedServiceWithProfileId type.
 */
public class ResourcesEdgeHostedServiceWithProfileId {
    private String ern;
    private ResourcesServiceEndpoint serviceEndpoint;
    private String applicationServerProviderId;
    private String applicationId;
    private String serviceDescrIpTion;
    private String serviceProfileID;

    /**
     * Default constructor.
     */
    public ResourcesEdgeHostedServiceWithProfileId() {
    }

    /**
     * Initialization constructor.
     * @param  ern  String value for ern.
     * @param  serviceEndpoint  ResourcesServiceEndpoint value for serviceEndpoint.
     * @param  applicationServerProviderId  String value for applicationServerProviderId.
     * @param  applicationId  String value for applicationId.
     * @param  serviceDescrIpTion  String value for serviceDescrIpTion.
     * @param  serviceProfileID  String value for serviceProfileID.
     */
    public ResourcesEdgeHostedServiceWithProfileId(
            String ern,
            ResourcesServiceEndpoint serviceEndpoint,
            String applicationServerProviderId,
            String applicationId,
            String serviceDescrIpTion,
            String serviceProfileID) {
        this.ern = ern;
        this.serviceEndpoint = serviceEndpoint;
        this.applicationServerProviderId = applicationServerProviderId;
        this.applicationId = applicationId;
        this.serviceDescrIpTion = serviceDescrIpTion;
        this.serviceProfileID = serviceProfileID;
    }

    /**
     * Getter for Ern.
     * Edge Resource Name. A string identifier for a set of edge resources.
     * @return Returns the String
     */
    @JsonGetter("ern")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getErn() {
        return ern;
    }

    /**
     * Setter for Ern.
     * Edge Resource Name. A string identifier for a set of edge resources.
     * @param ern Value for String
     */
    @JsonSetter("ern")
    public void setErn(String ern) {
        this.ern = ern;
    }

    /**
     * Getter for ServiceEndpoint.
     * Service Endpoint path, address, and port.
     * @return Returns the ResourcesServiceEndpoint
     */
    @JsonGetter("serviceEndpoint")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public ResourcesServiceEndpoint getServiceEndpoint() {
        return serviceEndpoint;
    }

    /**
     * Setter for ServiceEndpoint.
     * Service Endpoint path, address, and port.
     * @param serviceEndpoint Value for ResourcesServiceEndpoint
     */
    @JsonSetter("serviceEndpoint")
    public void setServiceEndpoint(ResourcesServiceEndpoint serviceEndpoint) {
        this.serviceEndpoint = serviceEndpoint;
    }

    /**
     * Getter for ApplicationServerProviderId.
     * Unique ID representing the Edge Application Provider.
     * @return Returns the String
     */
    @JsonGetter("applicationServerProviderId")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getApplicationServerProviderId() {
        return applicationServerProviderId;
    }

    /**
     * Setter for ApplicationServerProviderId.
     * Unique ID representing the Edge Application Provider.
     * @param applicationServerProviderId Value for String
     */
    @JsonSetter("applicationServerProviderId")
    public void setApplicationServerProviderId(String applicationServerProviderId) {
        this.applicationServerProviderId = applicationServerProviderId;
    }

    /**
     * Getter for ApplicationId.
     * Unique ID representing the Edge Application.
     * @return Returns the String
     */
    @JsonGetter("applicationId")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getApplicationId() {
        return applicationId;
    }

    /**
     * Setter for ApplicationId.
     * Unique ID representing the Edge Application.
     * @param applicationId Value for String
     */
    @JsonSetter("applicationId")
    public void setApplicationId(String applicationId) {
        this.applicationId = applicationId;
    }

    /**
     * Getter for ServiceDescrIpTion.
     * @return Returns the String
     */
    @JsonGetter("serviceDescription")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getServiceDescrIpTion() {
        return serviceDescrIpTion;
    }

    /**
     * Setter for ServiceDescrIpTion.
     * @param serviceDescrIpTion Value for String
     */
    @JsonSetter("serviceDescription")
    public void setServiceDescrIpTion(String serviceDescrIpTion) {
        this.serviceDescrIpTion = serviceDescrIpTion;
    }

    /**
     * Getter for ServiceProfileID.
     * The system assigned ID of the service profile.
     * @return Returns the String
     */
    @JsonGetter("serviceProfileID")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getServiceProfileID() {
        return serviceProfileID;
    }

    /**
     * Setter for ServiceProfileID.
     * The system assigned ID of the service profile.
     * @param serviceProfileID Value for String
     */
    @JsonSetter("serviceProfileID")
    public void setServiceProfileID(String serviceProfileID) {
        this.serviceProfileID = serviceProfileID;
    }

    /**
     * Converts this ResourcesEdgeHostedServiceWithProfileId into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "ResourcesEdgeHostedServiceWithProfileId [" + "ern=" + ern + ", serviceEndpoint="
                + serviceEndpoint + ", applicationServerProviderId=" + applicationServerProviderId
                + ", applicationId=" + applicationId + ", serviceDescrIpTion=" + serviceDescrIpTion
                + ", serviceProfileID=" + serviceProfileID + "]";
    }

    /**
     * Builds a new {@link ResourcesEdgeHostedServiceWithProfileId.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link ResourcesEdgeHostedServiceWithProfileId.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .ern(getErn())
                .serviceEndpoint(getServiceEndpoint())
                .applicationServerProviderId(getApplicationServerProviderId())
                .applicationId(getApplicationId())
                .serviceDescrIpTion(getServiceDescrIpTion())
                .serviceProfileID(getServiceProfileID());
        return builder;
    }

    /**
     * Class to build instances of {@link ResourcesEdgeHostedServiceWithProfileId}.
     */
    public static class Builder {
        private String ern;
        private ResourcesServiceEndpoint serviceEndpoint;
        private String applicationServerProviderId;
        private String applicationId;
        private String serviceDescrIpTion;
        private String serviceProfileID;



        /**
         * Setter for ern.
         * @param  ern  String value for ern.
         * @return Builder
         */
        public Builder ern(String ern) {
            this.ern = ern;
            return this;
        }

        /**
         * Setter for serviceEndpoint.
         * @param  serviceEndpoint  ResourcesServiceEndpoint value for serviceEndpoint.
         * @return Builder
         */
        public Builder serviceEndpoint(ResourcesServiceEndpoint serviceEndpoint) {
            this.serviceEndpoint = serviceEndpoint;
            return this;
        }

        /**
         * Setter for applicationServerProviderId.
         * @param  applicationServerProviderId  String value for applicationServerProviderId.
         * @return Builder
         */
        public Builder applicationServerProviderId(String applicationServerProviderId) {
            this.applicationServerProviderId = applicationServerProviderId;
            return this;
        }

        /**
         * Setter for applicationId.
         * @param  applicationId  String value for applicationId.
         * @return Builder
         */
        public Builder applicationId(String applicationId) {
            this.applicationId = applicationId;
            return this;
        }

        /**
         * Setter for serviceDescrIpTion.
         * @param  serviceDescrIpTion  String value for serviceDescrIpTion.
         * @return Builder
         */
        public Builder serviceDescrIpTion(String serviceDescrIpTion) {
            this.serviceDescrIpTion = serviceDescrIpTion;
            return this;
        }

        /**
         * Setter for serviceProfileID.
         * @param  serviceProfileID  String value for serviceProfileID.
         * @return Builder
         */
        public Builder serviceProfileID(String serviceProfileID) {
            this.serviceProfileID = serviceProfileID;
            return this;
        }

        /**
         * Builds a new {@link ResourcesEdgeHostedServiceWithProfileId} object using the set fields.
         * @return {@link ResourcesEdgeHostedServiceWithProfileId}
         */
        public ResourcesEdgeHostedServiceWithProfileId build() {
            return new ResourcesEdgeHostedServiceWithProfileId(ern, serviceEndpoint,
                    applicationServerProviderId, applicationId, serviceDescrIpTion,
                    serviceProfileID);
        }
    }
}
