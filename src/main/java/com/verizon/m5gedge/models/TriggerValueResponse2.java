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
 * This is a model class for TriggerValueResponse2 type.
 */
public class TriggerValueResponse2 {
    private List<Triggervalues2> triggers;

    /**
     * Default constructor.
     */
    public TriggerValueResponse2() {
    }

    /**
     * Initialization constructor.
     * @param  triggers  List of Triggervalues2 value for triggers.
     */
    public TriggerValueResponse2(
            List<Triggervalues2> triggers) {
        this.triggers = triggers;
    }

    /**
     * Getter for Triggers.
     * @return Returns the List of Triggervalues2
     */
    @JsonGetter("triggers")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<Triggervalues2> getTriggers() {
        return triggers;
    }

    /**
     * Setter for Triggers.
     * @param triggers Value for List of Triggervalues2
     */
    @JsonSetter("triggers")
    public void setTriggers(List<Triggervalues2> triggers) {
        this.triggers = triggers;
    }

    /**
     * Converts this TriggerValueResponse2 into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "TriggerValueResponse2 [" + "triggers=" + triggers + "]";
    }

    /**
     * Builds a new {@link TriggerValueResponse2.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link TriggerValueResponse2.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .triggers(getTriggers());
        return builder;
    }

    /**
     * Class to build instances of {@link TriggerValueResponse2}.
     */
    public static class Builder {
        private List<Triggervalues2> triggers;



        /**
         * Setter for triggers.
         * @param  triggers  List of Triggervalues2 value for triggers.
         * @return Builder
         */
        public Builder triggers(List<Triggervalues2> triggers) {
            this.triggers = triggers;
            return this;
        }

        /**
         * Builds a new {@link TriggerValueResponse2} object using the set fields.
         * @return {@link TriggerValueResponse2}
         */
        public TriggerValueResponse2 build() {
            return new TriggerValueResponse2(triggers);
        }
    }
}
