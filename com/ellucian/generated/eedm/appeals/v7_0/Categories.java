
package com.ellucian.generated.eedm.appeals.v7_0;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Categories
 * <p>
 * A group of custom categorizations use for appeals.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "unit",
    "group",
    "segment",
    "segmentRecency",
    "region"
})
@Generated("jsonschema2pojo")
public class Categories {

    /**
     * Unit
     * <p>
     * A user defined categorization of the appeal.
     * 
     */
    @JsonProperty("unit")
    @JsonPropertyDescription("A user defined categorization of the appeal.")
    private Object unit;
    /**
     * Group
     * <p>
     * A user defined categorization of the appeal.
     * 
     */
    @JsonProperty("group")
    @JsonPropertyDescription("A user defined categorization of the appeal.")
    private Object group;
    /**
     * Segment
     * <p>
     * A user defined categorization of the appeal.
     * 
     */
    @JsonProperty("segment")
    @JsonPropertyDescription("A user defined categorization of the appeal.")
    private Object segment;
    /**
     * Segment Recency
     * <p>
     * A user defined categorization of the appeal.
     * 
     */
    @JsonProperty("segmentRecency")
    @JsonPropertyDescription("A user defined categorization of the appeal.")
    private Object segmentRecency;
    /**
     * Region
     * <p>
     * A user defined categorization of the appeal.
     * 
     */
    @JsonProperty("region")
    @JsonPropertyDescription("A user defined categorization of the appeal.")
    private Object region;

    /**
     * Unit
     * <p>
     * A user defined categorization of the appeal.
     * 
     */
    @JsonProperty("unit")
    public Object getUnit() {
        return unit;
    }

    /**
     * Unit
     * <p>
     * A user defined categorization of the appeal.
     * 
     */
    @JsonProperty("unit")
    public void setUnit(Object unit) {
        this.unit = unit;
    }

    public Categories withUnit(Object unit) {
        this.unit = unit;
        return this;
    }

    /**
     * Group
     * <p>
     * A user defined categorization of the appeal.
     * 
     */
    @JsonProperty("group")
    public Object getGroup() {
        return group;
    }

    /**
     * Group
     * <p>
     * A user defined categorization of the appeal.
     * 
     */
    @JsonProperty("group")
    public void setGroup(Object group) {
        this.group = group;
    }

    public Categories withGroup(Object group) {
        this.group = group;
        return this;
    }

    /**
     * Segment
     * <p>
     * A user defined categorization of the appeal.
     * 
     */
    @JsonProperty("segment")
    public Object getSegment() {
        return segment;
    }

    /**
     * Segment
     * <p>
     * A user defined categorization of the appeal.
     * 
     */
    @JsonProperty("segment")
    public void setSegment(Object segment) {
        this.segment = segment;
    }

    public Categories withSegment(Object segment) {
        this.segment = segment;
        return this;
    }

    /**
     * Segment Recency
     * <p>
     * A user defined categorization of the appeal.
     * 
     */
    @JsonProperty("segmentRecency")
    public Object getSegmentRecency() {
        return segmentRecency;
    }

    /**
     * Segment Recency
     * <p>
     * A user defined categorization of the appeal.
     * 
     */
    @JsonProperty("segmentRecency")
    public void setSegmentRecency(Object segmentRecency) {
        this.segmentRecency = segmentRecency;
    }

    public Categories withSegmentRecency(Object segmentRecency) {
        this.segmentRecency = segmentRecency;
        return this;
    }

    /**
     * Region
     * <p>
     * A user defined categorization of the appeal.
     * 
     */
    @JsonProperty("region")
    public Object getRegion() {
        return region;
    }

    /**
     * Region
     * <p>
     * A user defined categorization of the appeal.
     * 
     */
    @JsonProperty("region")
    public void setRegion(Object region) {
        this.region = region;
    }

    public Categories withRegion(Object region) {
        this.region = region;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Categories.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("unit");
        sb.append('=');
        sb.append(((this.unit == null)?"<null>":this.unit));
        sb.append(',');
        sb.append("group");
        sb.append('=');
        sb.append(((this.group == null)?"<null>":this.group));
        sb.append(',');
        sb.append("segment");
        sb.append('=');
        sb.append(((this.segment == null)?"<null>":this.segment));
        sb.append(',');
        sb.append("segmentRecency");
        sb.append('=');
        sb.append(((this.segmentRecency == null)?"<null>":this.segmentRecency));
        sb.append(',');
        sb.append("region");
        sb.append('=');
        sb.append(((this.region == null)?"<null>":this.region));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = ((result* 31)+((this.unit == null)? 0 :this.unit.hashCode()));
        result = ((result* 31)+((this.region == null)? 0 :this.region.hashCode()));
        result = ((result* 31)+((this.segmentRecency == null)? 0 :this.segmentRecency.hashCode()));
        result = ((result* 31)+((this.group == null)? 0 :this.group.hashCode()));
        result = ((result* 31)+((this.segment == null)? 0 :this.segment.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Categories) == false) {
            return false;
        }
        Categories rhs = ((Categories) other);
        return ((((((this.unit == rhs.unit)||((this.unit!= null)&&this.unit.equals(rhs.unit)))&&((this.region == rhs.region)||((this.region!= null)&&this.region.equals(rhs.region))))&&((this.segmentRecency == rhs.segmentRecency)||((this.segmentRecency!= null)&&this.segmentRecency.equals(rhs.segmentRecency))))&&((this.group == rhs.group)||((this.group!= null)&&this.group.equals(rhs.group))))&&((this.segment == rhs.segment)||((this.segment!= null)&&this.segment.equals(rhs.segment))));
    }

}
