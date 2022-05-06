
package com.ellucian.generated.bpapi.ban.course_base_maintenance.v1_0_0;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "termCodeStart",
    "termCodeEnd"
})
@Generated("jsonschema2pojo")
public class CourseBaseMaintenance100PutResponse {

    /**
     * Start Term
     * <p>
     * Lineage reference object : SCBCRKY_TERM_CODE_START, Lookup lineage reference object : stvterm
     * (Required)
     * 
     */
    @JsonProperty("termCodeStart")
    @JsonPropertyDescription("Lineage reference object : SCBCRKY_TERM_CODE_START, Lookup lineage reference object : stvterm")
    private String termCodeStart;
    /**
     * End Term
     * <p>
     * Lineage reference object : SCBCRKY_TERM_CODE_END, Lookup lineage reference object : stvterm
     * (Required)
     * 
     */
    @JsonProperty("termCodeEnd")
    @JsonPropertyDescription("Lineage reference object : SCBCRKY_TERM_CODE_END, Lookup lineage reference object : stvterm")
    private String termCodeEnd;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Start Term
     * <p>
     * Lineage reference object : SCBCRKY_TERM_CODE_START, Lookup lineage reference object : stvterm
     * (Required)
     * 
     */
    @JsonProperty("termCodeStart")
    public String getTermCodeStart() {
        return termCodeStart;
    }

    /**
     * Start Term
     * <p>
     * Lineage reference object : SCBCRKY_TERM_CODE_START, Lookup lineage reference object : stvterm
     * (Required)
     * 
     */
    @JsonProperty("termCodeStart")
    public void setTermCodeStart(String termCodeStart) {
        this.termCodeStart = termCodeStart;
    }

    public CourseBaseMaintenance100PutResponse withTermCodeStart(String termCodeStart) {
        this.termCodeStart = termCodeStart;
        return this;
    }

    /**
     * End Term
     * <p>
     * Lineage reference object : SCBCRKY_TERM_CODE_END, Lookup lineage reference object : stvterm
     * (Required)
     * 
     */
    @JsonProperty("termCodeEnd")
    public String getTermCodeEnd() {
        return termCodeEnd;
    }

    /**
     * End Term
     * <p>
     * Lineage reference object : SCBCRKY_TERM_CODE_END, Lookup lineage reference object : stvterm
     * (Required)
     * 
     */
    @JsonProperty("termCodeEnd")
    public void setTermCodeEnd(String termCodeEnd) {
        this.termCodeEnd = termCodeEnd;
    }

    public CourseBaseMaintenance100PutResponse withTermCodeEnd(String termCodeEnd) {
        this.termCodeEnd = termCodeEnd;
        return this;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public CourseBaseMaintenance100PutResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(CourseBaseMaintenance100PutResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("termCodeStart");
        sb.append('=');
        sb.append(((this.termCodeStart == null)?"<null>":this.termCodeStart));
        sb.append(',');
        sb.append("termCodeEnd");
        sb.append('=');
        sb.append(((this.termCodeEnd == null)?"<null>":this.termCodeEnd));
        sb.append(',');
        sb.append("additionalProperties");
        sb.append('=');
        sb.append(((this.additionalProperties == null)?"<null>":this.additionalProperties));
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
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.termCodeStart == null)? 0 :this.termCodeStart.hashCode()));
        result = ((result* 31)+((this.termCodeEnd == null)? 0 :this.termCodeEnd.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof CourseBaseMaintenance100PutResponse) == false) {
            return false;
        }
        CourseBaseMaintenance100PutResponse rhs = ((CourseBaseMaintenance100PutResponse) other);
        return ((((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties)))&&((this.termCodeStart == rhs.termCodeStart)||((this.termCodeStart!= null)&&this.termCodeStart.equals(rhs.termCodeStart))))&&((this.termCodeEnd == rhs.termCodeEnd)||((this.termCodeEnd!= null)&&this.termCodeEnd.equals(rhs.termCodeEnd))));
    }

}
