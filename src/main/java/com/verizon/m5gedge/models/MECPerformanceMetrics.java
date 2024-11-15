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
 * This is a model class for MECPerformanceMetrics type.
 */
public class MECPerformanceMetrics {
    private String queryStatus;
    private String start;
    private String end;
    private List<MECPerformanceQueryResult> queryResult;

    /**
     * Default constructor.
     */
    public MECPerformanceMetrics() {
    }

    /**
     * Initialization constructor.
     * @param  queryStatus  String value for queryStatus.
     * @param  start  String value for start.
     * @param  end  String value for end.
     * @param  queryResult  List of MECPerformanceQueryResult value for queryResult.
     */
    public MECPerformanceMetrics(
            String queryStatus,
            String start,
            String end,
            List<MECPerformanceQueryResult> queryResult) {
        this.queryStatus = queryStatus;
        this.start = start;
        this.end = end;
        this.queryResult = queryResult;
    }

    /**
     * Getter for QueryStatus.
     * Success or Failed.
     * @return Returns the String
     */
    @JsonGetter("QueryStatus")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getQueryStatus() {
        return queryStatus;
    }

    /**
     * Setter for QueryStatus.
     * Success or Failed.
     * @param queryStatus Value for String
     */
    @JsonSetter("QueryStatus")
    public void setQueryStatus(String queryStatus) {
        this.queryStatus = queryStatus;
    }

    /**
     * Getter for Start.
     * Timestamp of the query's start, format:mm/dd/yyyy,hr:min:sec.
     * @return Returns the String
     */
    @JsonGetter("Start")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getStart() {
        return start;
    }

    /**
     * Setter for Start.
     * Timestamp of the query's start, format:mm/dd/yyyy,hr:min:sec.
     * @param start Value for String
     */
    @JsonSetter("Start")
    public void setStart(String start) {
        this.start = start;
    }

    /**
     * Getter for End.
     * Timestamp of the query's end , format:mm/dd/yyyy, hr:min:sec.
     * @return Returns the String
     */
    @JsonGetter("End")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getEnd() {
        return end;
    }

    /**
     * Setter for End.
     * Timestamp of the query's end , format:mm/dd/yyyy, hr:min:sec.
     * @param end Value for String
     */
    @JsonSetter("End")
    public void setEnd(String end) {
        this.end = end;
    }

    /**
     * Getter for QueryResult.
     * MEC performance query result.
     * @return Returns the List of MECPerformanceQueryResult
     */
    @JsonGetter("QueryResult")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<MECPerformanceQueryResult> getQueryResult() {
        return queryResult;
    }

    /**
     * Setter for QueryResult.
     * MEC performance query result.
     * @param queryResult Value for List of MECPerformanceQueryResult
     */
    @JsonSetter("QueryResult")
    public void setQueryResult(List<MECPerformanceQueryResult> queryResult) {
        this.queryResult = queryResult;
    }

    /**
     * Converts this MECPerformanceMetrics into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "MECPerformanceMetrics [" + "queryStatus=" + queryStatus + ", start=" + start
                + ", end=" + end + ", queryResult=" + queryResult + "]";
    }

    /**
     * Builds a new {@link MECPerformanceMetrics.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link MECPerformanceMetrics.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .queryStatus(getQueryStatus())
                .start(getStart())
                .end(getEnd())
                .queryResult(getQueryResult());
        return builder;
    }

    /**
     * Class to build instances of {@link MECPerformanceMetrics}.
     */
    public static class Builder {
        private String queryStatus;
        private String start;
        private String end;
        private List<MECPerformanceQueryResult> queryResult;



        /**
         * Setter for queryStatus.
         * @param  queryStatus  String value for queryStatus.
         * @return Builder
         */
        public Builder queryStatus(String queryStatus) {
            this.queryStatus = queryStatus;
            return this;
        }

        /**
         * Setter for start.
         * @param  start  String value for start.
         * @return Builder
         */
        public Builder start(String start) {
            this.start = start;
            return this;
        }

        /**
         * Setter for end.
         * @param  end  String value for end.
         * @return Builder
         */
        public Builder end(String end) {
            this.end = end;
            return this;
        }

        /**
         * Setter for queryResult.
         * @param  queryResult  List of MECPerformanceQueryResult value for queryResult.
         * @return Builder
         */
        public Builder queryResult(List<MECPerformanceQueryResult> queryResult) {
            this.queryResult = queryResult;
            return this;
        }

        /**
         * Builds a new {@link MECPerformanceMetrics} object using the set fields.
         * @return {@link MECPerformanceMetrics}
         */
        public MECPerformanceMetrics build() {
            return new MECPerformanceMetrics(queryStatus, start, end, queryResult);
        }
    }
}
