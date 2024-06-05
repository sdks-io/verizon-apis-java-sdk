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
 * This is a model class for ActionAccountGroupShare type.
 */
public class ActionAccountGroupShare {
    private ChangePlan changePlan;

    /**
     * Default constructor.
     */
    public ActionAccountGroupShare() {
    }

    /**
     * Initialization constructor.
     * @param  changePlan  ChangePlan value for changePlan.
     */
    public ActionAccountGroupShare(
            ChangePlan changePlan) {
        this.changePlan = changePlan;
    }

    /**
     * Getter for ChangePlan.
     * @return Returns the ChangePlan
     */
    @JsonGetter("changePlan")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public ChangePlan getChangePlan() {
        return changePlan;
    }

    /**
     * Setter for ChangePlan.
     * @param changePlan Value for ChangePlan
     */
    @JsonSetter("changePlan")
    public void setChangePlan(ChangePlan changePlan) {
        this.changePlan = changePlan;
    }

    /**
     * Converts this ActionAccountGroupShare into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "ActionAccountGroupShare [" + "changePlan=" + changePlan + "]";
    }

    /**
     * Builds a new {@link ActionAccountGroupShare.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link ActionAccountGroupShare.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .changePlan(getChangePlan());
        return builder;
    }

    /**
     * Class to build instances of {@link ActionAccountGroupShare}.
     */
    public static class Builder {
        private ChangePlan changePlan;



        /**
         * Setter for changePlan.
         * @param  changePlan  ChangePlan value for changePlan.
         * @return Builder
         */
        public Builder changePlan(ChangePlan changePlan) {
            this.changePlan = changePlan;
            return this;
        }

        /**
         * Builds a new {@link ActionAccountGroupShare} object using the set fields.
         * @return {@link ActionAccountGroupShare}
         */
        public ActionAccountGroupShare build() {
            return new ActionAccountGroupShare(changePlan);
        }
    }
}