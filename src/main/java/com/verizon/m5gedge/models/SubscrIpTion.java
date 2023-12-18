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
 * This is a model class for SubscrIpTion type.
 */
public class SubscrIpTion {
    private Integer configurationfailures;
    private String createdon;
    private String delegateid;
    private String descrIpTion;
    private Boolean disabled;
    private String email;
    private String filter;
    private String id;
    private String kind;
    private String laststreamingstatus;
    private String laststreamingtime;
    private String lastupdated;
    private String name;
    private Integer networkfailures;
    private Integer streamfailures;
    private String streamkind;
    private String targetid;
    private String targettype;
    private String version;
    private String versionid;

    /**
     * Default constructor.
     */
    public SubscrIpTion() {
    }

    /**
     * Initialization constructor.
     * @param  configurationfailures  Integer value for configurationfailures.
     * @param  createdon  String value for createdon.
     * @param  delegateid  String value for delegateid.
     * @param  descrIpTion  String value for descrIpTion.
     * @param  disabled  Boolean value for disabled.
     * @param  email  String value for email.
     * @param  filter  String value for filter.
     * @param  id  String value for id.
     * @param  kind  String value for kind.
     * @param  laststreamingstatus  String value for laststreamingstatus.
     * @param  laststreamingtime  String value for laststreamingtime.
     * @param  lastupdated  String value for lastupdated.
     * @param  name  String value for name.
     * @param  networkfailures  Integer value for networkfailures.
     * @param  streamfailures  Integer value for streamfailures.
     * @param  streamkind  String value for streamkind.
     * @param  targetid  String value for targetid.
     * @param  targettype  String value for targettype.
     * @param  version  String value for version.
     * @param  versionid  String value for versionid.
     */
    public SubscrIpTion(
            Integer configurationfailures,
            String createdon,
            String delegateid,
            String descrIpTion,
            Boolean disabled,
            String email,
            String filter,
            String id,
            String kind,
            String laststreamingstatus,
            String laststreamingtime,
            String lastupdated,
            String name,
            Integer networkfailures,
            Integer streamfailures,
            String streamkind,
            String targetid,
            String targettype,
            String version,
            String versionid) {
        this.configurationfailures = configurationfailures;
        this.createdon = createdon;
        this.delegateid = delegateid;
        this.descrIpTion = descrIpTion;
        this.disabled = disabled;
        this.email = email;
        this.filter = filter;
        this.id = id;
        this.kind = kind;
        this.laststreamingstatus = laststreamingstatus;
        this.laststreamingtime = laststreamingtime;
        this.lastupdated = lastupdated;
        this.name = name;
        this.networkfailures = networkfailures;
        this.streamfailures = streamfailures;
        this.streamkind = streamkind;
        this.targetid = targetid;
        this.targettype = targettype;
        this.version = version;
        this.versionid = versionid;
    }

    /**
     * Getter for Configurationfailures.
     * The number of streaming failures due to faulty configuration.
     * @return Returns the Integer
     */
    @JsonGetter("configurationfailures")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getConfigurationfailures() {
        return configurationfailures;
    }

    /**
     * Setter for Configurationfailures.
     * The number of streaming failures due to faulty configuration.
     * @param configurationfailures Value for Integer
     */
    @JsonSetter("configurationfailures")
    public void setConfigurationfailures(Integer configurationfailures) {
        this.configurationfailures = configurationfailures;
    }

    /**
     * Getter for Createdon.
     * The number of streaming failures due to faulty configuration.
     * @return Returns the String
     */
    @JsonGetter("createdon")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getCreatedon() {
        return createdon;
    }

    /**
     * Setter for Createdon.
     * The number of streaming failures due to faulty configuration.
     * @param createdon Value for String
     */
    @JsonSetter("createdon")
    public void setCreatedon(String createdon) {
        this.createdon = createdon;
    }

    /**
     * Getter for Delegateid.
     * Not currently used.
     * @return Returns the String
     */
    @JsonGetter("delegateid")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getDelegateid() {
        return delegateid;
    }

    /**
     * Setter for Delegateid.
     * Not currently used.
     * @param delegateid Value for String
     */
    @JsonSetter("delegateid")
    public void setDelegateid(String delegateid) {
        this.delegateid = delegateid;
    }

    /**
     * Getter for DescrIpTion.
     * Description of the subscription.
     * @return Returns the String
     */
    @JsonGetter("description")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getDescrIpTion() {
        return descrIpTion;
    }

    /**
     * Setter for DescrIpTion.
     * Description of the subscription.
     * @param descrIpTion Value for String
     */
    @JsonSetter("description")
    public void setDescrIpTion(String descrIpTion) {
        this.descrIpTion = descrIpTion;
    }

    /**
     * Getter for Disabled.
     * Whether the subscription is currently sending data.
     * @return Returns the Boolean
     */
    @JsonGetter("disabled")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getDisabled() {
        return disabled;
    }

    /**
     * Setter for Disabled.
     * Whether the subscription is currently sending data.
     * @param disabled Value for Boolean
     */
    @JsonSetter("disabled")
    public void setDisabled(Boolean disabled) {
        this.disabled = disabled;
    }

    /**
     * Getter for Email.
     * The address to which any error reports should be delivered.
     * @return Returns the String
     */
    @JsonGetter("email")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getEmail() {
        return email;
    }

    /**
     * Setter for Email.
     * The address to which any error reports should be delivered.
     * @param email Value for String
     */
    @JsonSetter("email")
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Getter for Filter.
     * Filter for events.
     * @return Returns the String
     */
    @JsonGetter("filter")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getFilter() {
        return filter;
    }

    /**
     * Setter for Filter.
     * Filter for events.
     * @param filter Value for String
     */
    @JsonSetter("filter")
    public void setFilter(String filter) {
        this.filter = filter;
    }

    /**
     * Getter for Id.
     * ThingSpace unique ID for the subscription that was created.
     * @return Returns the String
     */
    @JsonGetter("id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getId() {
        return id;
    }

    /**
     * Setter for Id.
     * ThingSpace unique ID for the subscription that was created.
     * @param id Value for String
     */
    @JsonSetter("id")
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Getter for Kind.
     * Identifies the resource kind.
     * @return Returns the String
     */
    @JsonGetter("kind")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getKind() {
        return kind;
    }

    /**
     * Setter for Kind.
     * Identifies the resource kind.
     * @param kind Value for String
     */
    @JsonSetter("kind")
    public void setKind(String kind) {
        this.kind = kind;
    }

    /**
     * Getter for Laststreamingstatus.
     * Possible values: success or fail.
     * @return Returns the String
     */
    @JsonGetter("laststreamingstatus")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getLaststreamingstatus() {
        return laststreamingstatus;
    }

    /**
     * Setter for Laststreamingstatus.
     * Possible values: success or fail.
     * @param laststreamingstatus Value for String
     */
    @JsonSetter("laststreamingstatus")
    public void setLaststreamingstatus(String laststreamingstatus) {
        this.laststreamingstatus = laststreamingstatus;
    }

    /**
     * Getter for Laststreamingtime.
     * The date and time that the last stream send was attempted.
     * @return Returns the String
     */
    @JsonGetter("laststreamingtime")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getLaststreamingtime() {
        return laststreamingtime;
    }

    /**
     * Setter for Laststreamingtime.
     * The date and time that the last stream send was attempted.
     * @param laststreamingtime Value for String
     */
    @JsonSetter("laststreamingtime")
    public void setLaststreamingtime(String laststreamingtime) {
        this.laststreamingtime = laststreamingtime;
    }

    /**
     * Getter for Lastupdated.
     * The date the resource was last updated.
     * @return Returns the String
     */
    @JsonGetter("lastupdated")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getLastupdated() {
        return lastupdated;
    }

    /**
     * Setter for Lastupdated.
     * The date the resource was last updated.
     * @param lastupdated Value for String
     */
    @JsonSetter("lastupdated")
    public void setLastupdated(String lastupdated) {
        this.lastupdated = lastupdated;
    }

    /**
     * Getter for Name.
     * Name of the subscription.
     * @return Returns the String
     */
    @JsonGetter("name")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getName() {
        return name;
    }

    /**
     * Setter for Name.
     * Name of the subscription.
     * @param name Value for String
     */
    @JsonSetter("name")
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Getter for Networkfailures.
     * The number of failures due to network problems.
     * @return Returns the Integer
     */
    @JsonGetter("networkfailures")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getNetworkfailures() {
        return networkfailures;
    }

    /**
     * Setter for Networkfailures.
     * The number of failures due to network problems.
     * @param networkfailures Value for Integer
     */
    @JsonSetter("networkfailures")
    public void setNetworkfailures(Integer networkfailures) {
        this.networkfailures = networkfailures;
    }

    /**
     * Getter for Streamfailures.
     * @return Returns the Integer
     */
    @JsonGetter("streamfailures")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getStreamfailures() {
        return streamfailures;
    }

    /**
     * Setter for Streamfailures.
     * @param streamfailures Value for Integer
     */
    @JsonSetter("streamfailures")
    public void setStreamfailures(Integer streamfailures) {
        this.streamfailures = streamfailures;
    }

    /**
     * Getter for Streamkind.
     * The event type that will be sent in the data stream.
     * @return Returns the String
     */
    @JsonGetter("streamkind")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getStreamkind() {
        return streamkind;
    }

    /**
     * Setter for Streamkind.
     * The event type that will be sent in the data stream.
     * @param streamkind Value for String
     */
    @JsonSetter("streamkind")
    public void setStreamkind(String streamkind) {
        this.streamkind = streamkind;
    }

    /**
     * Getter for Targetid.
     * Target to be used for dispatching events.
     * @return Returns the String
     */
    @JsonGetter("targetid")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getTargetid() {
        return targetid;
    }

    /**
     * Setter for Targetid.
     * Target to be used for dispatching events.
     * @param targetid Value for String
     */
    @JsonSetter("targetid")
    public void setTargetid(String targetid) {
        this.targetid = targetid;
    }

    /**
     * Getter for Targettype.
     * @return Returns the String
     */
    @JsonGetter("targettype")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getTargettype() {
        return targettype;
    }

    /**
     * Setter for Targettype.
     * @param targettype Value for String
     */
    @JsonSetter("targettype")
    public void setTargettype(String targettype) {
        this.targettype = targettype;
    }

    /**
     * Getter for Version.
     * Version of the underlying schema resource.
     * @return Returns the String
     */
    @JsonGetter("version")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getVersion() {
        return version;
    }

    /**
     * Setter for Version.
     * Version of the underlying schema resource.
     * @param version Value for String
     */
    @JsonSetter("version")
    public void setVersion(String version) {
        this.version = version;
    }

    /**
     * Getter for Versionid.
     * The version of the resource.
     * @return Returns the String
     */
    @JsonGetter("versionid")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getVersionid() {
        return versionid;
    }

    /**
     * Setter for Versionid.
     * The version of the resource.
     * @param versionid Value for String
     */
    @JsonSetter("versionid")
    public void setVersionid(String versionid) {
        this.versionid = versionid;
    }

    /**
     * Converts this SubscrIpTion into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "SubscrIpTion [" + "configurationfailures=" + configurationfailures + ", createdon="
                + createdon + ", delegateid=" + delegateid + ", descrIpTion=" + descrIpTion
                + ", disabled=" + disabled + ", email=" + email + ", filter=" + filter + ", id="
                + id + ", kind=" + kind + ", laststreamingstatus=" + laststreamingstatus
                + ", laststreamingtime=" + laststreamingtime + ", lastupdated=" + lastupdated
                + ", name=" + name + ", networkfailures=" + networkfailures + ", streamfailures="
                + streamfailures + ", streamkind=" + streamkind + ", targetid=" + targetid
                + ", targettype=" + targettype + ", version=" + version + ", versionid=" + versionid
                + "]";
    }

    /**
     * Builds a new {@link SubscrIpTion.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link SubscrIpTion.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .configurationfailures(getConfigurationfailures())
                .createdon(getCreatedon())
                .delegateid(getDelegateid())
                .descrIpTion(getDescrIpTion())
                .disabled(getDisabled())
                .email(getEmail())
                .filter(getFilter())
                .id(getId())
                .kind(getKind())
                .laststreamingstatus(getLaststreamingstatus())
                .laststreamingtime(getLaststreamingtime())
                .lastupdated(getLastupdated())
                .name(getName())
                .networkfailures(getNetworkfailures())
                .streamfailures(getStreamfailures())
                .streamkind(getStreamkind())
                .targetid(getTargetid())
                .targettype(getTargettype())
                .version(getVersion())
                .versionid(getVersionid());
        return builder;
    }

    /**
     * Class to build instances of {@link SubscrIpTion}.
     */
    public static class Builder {
        private Integer configurationfailures;
        private String createdon;
        private String delegateid;
        private String descrIpTion;
        private Boolean disabled;
        private String email;
        private String filter;
        private String id;
        private String kind;
        private String laststreamingstatus;
        private String laststreamingtime;
        private String lastupdated;
        private String name;
        private Integer networkfailures;
        private Integer streamfailures;
        private String streamkind;
        private String targetid;
        private String targettype;
        private String version;
        private String versionid;



        /**
         * Setter for configurationfailures.
         * @param  configurationfailures  Integer value for configurationfailures.
         * @return Builder
         */
        public Builder configurationfailures(Integer configurationfailures) {
            this.configurationfailures = configurationfailures;
            return this;
        }

        /**
         * Setter for createdon.
         * @param  createdon  String value for createdon.
         * @return Builder
         */
        public Builder createdon(String createdon) {
            this.createdon = createdon;
            return this;
        }

        /**
         * Setter for delegateid.
         * @param  delegateid  String value for delegateid.
         * @return Builder
         */
        public Builder delegateid(String delegateid) {
            this.delegateid = delegateid;
            return this;
        }

        /**
         * Setter for descrIpTion.
         * @param  descrIpTion  String value for descrIpTion.
         * @return Builder
         */
        public Builder descrIpTion(String descrIpTion) {
            this.descrIpTion = descrIpTion;
            return this;
        }

        /**
         * Setter for disabled.
         * @param  disabled  Boolean value for disabled.
         * @return Builder
         */
        public Builder disabled(Boolean disabled) {
            this.disabled = disabled;
            return this;
        }

        /**
         * Setter for email.
         * @param  email  String value for email.
         * @return Builder
         */
        public Builder email(String email) {
            this.email = email;
            return this;
        }

        /**
         * Setter for filter.
         * @param  filter  String value for filter.
         * @return Builder
         */
        public Builder filter(String filter) {
            this.filter = filter;
            return this;
        }

        /**
         * Setter for id.
         * @param  id  String value for id.
         * @return Builder
         */
        public Builder id(String id) {
            this.id = id;
            return this;
        }

        /**
         * Setter for kind.
         * @param  kind  String value for kind.
         * @return Builder
         */
        public Builder kind(String kind) {
            this.kind = kind;
            return this;
        }

        /**
         * Setter for laststreamingstatus.
         * @param  laststreamingstatus  String value for laststreamingstatus.
         * @return Builder
         */
        public Builder laststreamingstatus(String laststreamingstatus) {
            this.laststreamingstatus = laststreamingstatus;
            return this;
        }

        /**
         * Setter for laststreamingtime.
         * @param  laststreamingtime  String value for laststreamingtime.
         * @return Builder
         */
        public Builder laststreamingtime(String laststreamingtime) {
            this.laststreamingtime = laststreamingtime;
            return this;
        }

        /**
         * Setter for lastupdated.
         * @param  lastupdated  String value for lastupdated.
         * @return Builder
         */
        public Builder lastupdated(String lastupdated) {
            this.lastupdated = lastupdated;
            return this;
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
         * Setter for networkfailures.
         * @param  networkfailures  Integer value for networkfailures.
         * @return Builder
         */
        public Builder networkfailures(Integer networkfailures) {
            this.networkfailures = networkfailures;
            return this;
        }

        /**
         * Setter for streamfailures.
         * @param  streamfailures  Integer value for streamfailures.
         * @return Builder
         */
        public Builder streamfailures(Integer streamfailures) {
            this.streamfailures = streamfailures;
            return this;
        }

        /**
         * Setter for streamkind.
         * @param  streamkind  String value for streamkind.
         * @return Builder
         */
        public Builder streamkind(String streamkind) {
            this.streamkind = streamkind;
            return this;
        }

        /**
         * Setter for targetid.
         * @param  targetid  String value for targetid.
         * @return Builder
         */
        public Builder targetid(String targetid) {
            this.targetid = targetid;
            return this;
        }

        /**
         * Setter for targettype.
         * @param  targettype  String value for targettype.
         * @return Builder
         */
        public Builder targettype(String targettype) {
            this.targettype = targettype;
            return this;
        }

        /**
         * Setter for version.
         * @param  version  String value for version.
         * @return Builder
         */
        public Builder version(String version) {
            this.version = version;
            return this;
        }

        /**
         * Setter for versionid.
         * @param  versionid  String value for versionid.
         * @return Builder
         */
        public Builder versionid(String versionid) {
            this.versionid = versionid;
            return this;
        }

        /**
         * Builds a new {@link SubscrIpTion} object using the set fields.
         * @return {@link SubscrIpTion}
         */
        public SubscrIpTion build() {
            return new SubscrIpTion(configurationfailures, createdon, delegateid, descrIpTion,
                    disabled, email, filter, id, kind, laststreamingstatus, laststreamingtime,
                    lastupdated, name, networkfailures, streamfailures, streamkind, targetid,
                    targettype, version, versionid);
        }
    }
}
