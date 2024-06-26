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
 * This is a model class for DeviceGroupDevicesData type.
 */
public class DeviceGroupDevicesData {
    private String description;
    private List<AccountDeviceList> devices;
    private Boolean hasMoreData;
    private String name;

    /**
     * Default constructor.
     */
    public DeviceGroupDevicesData() {
    }

    /**
     * Initialization constructor.
     * @param  description  String value for description.
     * @param  devices  List of AccountDeviceList value for devices.
     * @param  hasMoreData  Boolean value for hasMoreData.
     * @param  name  String value for name.
     */
    public DeviceGroupDevicesData(
            String description,
            List<AccountDeviceList> devices,
            Boolean hasMoreData,
            String name) {
        this.description = description;
        this.devices = devices;
        this.hasMoreData = hasMoreData;
        this.name = name;
    }

    /**
     * Getter for Description.
     * The description of the device group.
     * @return Returns the String
     */
    @JsonGetter("description")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getDescription() {
        return description;
    }

    /**
     * Setter for Description.
     * The description of the device group.
     * @param description Value for String
     */
    @JsonSetter("description")
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Getter for Devices.
     * The devices in the device group.
     * @return Returns the List of AccountDeviceList
     */
    @JsonGetter("devices")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<AccountDeviceList> getDevices() {
        return devices;
    }

    /**
     * Setter for Devices.
     * The devices in the device group.
     * @param devices Value for List of AccountDeviceList
     */
    @JsonSetter("devices")
    public void setDevices(List<AccountDeviceList> devices) {
        this.devices = devices;
    }

    /**
     * Getter for HasMoreData.
     * False for a status 200 response.True for a status 202 response, indicating that there is more
     * data to be retrieved.
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
     * data to be retrieved.
     * @param hasMoreData Value for Boolean
     */
    @JsonSetter("hasMoreData")
    public void setHasMoreData(Boolean hasMoreData) {
        this.hasMoreData = hasMoreData;
    }

    /**
     * Getter for Name.
     * The name of the device group.
     * @return Returns the String
     */
    @JsonGetter("name")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getName() {
        return name;
    }

    /**
     * Setter for Name.
     * The name of the device group.
     * @param name Value for String
     */
    @JsonSetter("name")
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Converts this DeviceGroupDevicesData into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "DeviceGroupDevicesData [" + "description=" + description + ", devices=" + devices
                + ", hasMoreData=" + hasMoreData + ", name=" + name + "]";
    }

    /**
     * Builds a new {@link DeviceGroupDevicesData.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link DeviceGroupDevicesData.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .description(getDescription())
                .devices(getDevices())
                .hasMoreData(getHasMoreData())
                .name(getName());
        return builder;
    }

    /**
     * Class to build instances of {@link DeviceGroupDevicesData}.
     */
    public static class Builder {
        private String description;
        private List<AccountDeviceList> devices;
        private Boolean hasMoreData;
        private String name;



        /**
         * Setter for description.
         * @param  description  String value for description.
         * @return Builder
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * Setter for devices.
         * @param  devices  List of AccountDeviceList value for devices.
         * @return Builder
         */
        public Builder devices(List<AccountDeviceList> devices) {
            this.devices = devices;
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
         * Setter for name.
         * @param  name  String value for name.
         * @return Builder
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * Builds a new {@link DeviceGroupDevicesData} object using the set fields.
         * @return {@link DeviceGroupDevicesData}
         */
        public DeviceGroupDevicesData build() {
            return new DeviceGroupDevicesData(description, devices, hasMoreData, name);
        }
    }
}
