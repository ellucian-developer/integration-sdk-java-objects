
package com.ellucian.generated.bpapi.ban.course_search.v1_0_0;

import java.util.Date;
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
    "scacrseCrseNumb",
    "scacrseSubjCode",
    "scacrseStartDate",
    "scacrseEndDate"
})
@Generated("jsonschema2pojo")
public class CourseSearch100GetRequest {

    /**
     * Course
     * <p>
     * Lineage reference object : scacrseCrseNumb, Lookup lineage reference object : scbcrse,scbcrky
     * 
     */
    @JsonProperty("scacrseCrseNumb")
    @JsonPropertyDescription("Lineage reference object : scacrseCrseNumb, Lookup lineage reference object : scbcrse,scbcrky")
    private String scacrseCrseNumb;
    /**
     * Subject
     * <p>
     * Lineage reference object : scacrseSubjCode, Lookup lineage reference object : stvsubj
     * 
     */
    @JsonProperty("scacrseSubjCode")
    @JsonPropertyDescription("Lineage reference object : scacrseSubjCode, Lookup lineage reference object : stvsubj")
    private String scacrseSubjCode;
    /**
     * From  Date
     * <p>
     * Lineage reference object : scacrseStartDate
     * 
     */
    @JsonProperty("scacrseStartDate")
    @JsonPropertyDescription("Lineage reference object : scacrseStartDate")
    private Date scacrseStartDate;
    /**
     * To Date
     * <p>
     * Lineage reference object : scacrseEndDate
     * 
     */
    @JsonProperty("scacrseEndDate")
    @JsonPropertyDescription("Lineage reference object : scacrseEndDate")
    private Date scacrseEndDate;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Course
     * <p>
     * Lineage reference object : scacrseCrseNumb, Lookup lineage reference object : scbcrse,scbcrky
     * 
     */
    @JsonProperty("scacrseCrseNumb")
    public String getScacrseCrseNumb() {
        return scacrseCrseNumb;
    }

    /**
     * Course
     * <p>
     * Lineage reference object : scacrseCrseNumb, Lookup lineage reference object : scbcrse,scbcrky
     * 
     */
    @JsonProperty("scacrseCrseNumb")
    public void setScacrseCrseNumb(String scacrseCrseNumb) {
        this.scacrseCrseNumb = scacrseCrseNumb;
    }

    public CourseSearch100GetRequest withScacrseCrseNumb(String scacrseCrseNumb) {
        this.scacrseCrseNumb = scacrseCrseNumb;
        return this;
    }

    /**
     * Subject
     * <p>
     * Lineage reference object : scacrseSubjCode, Lookup lineage reference object : stvsubj
     * 
     */
    @JsonProperty("scacrseSubjCode")
    public String getScacrseSubjCode() {
        return scacrseSubjCode;
    }

    /**
     * Subject
     * <p>
     * Lineage reference object : scacrseSubjCode, Lookup lineage reference object : stvsubj
     * 
     */
    @JsonProperty("scacrseSubjCode")
    public void setScacrseSubjCode(String scacrseSubjCode) {
        this.scacrseSubjCode = scacrseSubjCode;
    }

    public CourseSearch100GetRequest withScacrseSubjCode(String scacrseSubjCode) {
        this.scacrseSubjCode = scacrseSubjCode;
        return this;
    }

    /**
     * From  Date
     * <p>
     * Lineage reference object : scacrseStartDate
     * 
     */
    @JsonProperty("scacrseStartDate")
    public Date getScacrseStartDate() {
        return scacrseStartDate;
    }

    /**
     * From  Date
     * <p>
     * Lineage reference object : scacrseStartDate
     * 
     */
    @JsonProperty("scacrseStartDate")
    public void setScacrseStartDate(Date scacrseStartDate) {
        this.scacrseStartDate = scacrseStartDate;
    }

    public CourseSearch100GetRequest withScacrseStartDate(Date scacrseStartDate) {
        this.scacrseStartDate = scacrseStartDate;
        return this;
    }

    /**
     * To Date
     * <p>
     * Lineage reference object : scacrseEndDate
     * 
     */
    @JsonProperty("scacrseEndDate")
    public Date getScacrseEndDate() {
        return scacrseEndDate;
    }

    /**
     * To Date
     * <p>
     * Lineage reference object : scacrseEndDate
     * 
     */
    @JsonProperty("scacrseEndDate")
    public void setScacrseEndDate(Date scacrseEndDate) {
        this.scacrseEndDate = scacrseEndDate;
    }

    public CourseSearch100GetRequest withScacrseEndDate(Date scacrseEndDate) {
        this.scacrseEndDate = scacrseEndDate;
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

    public CourseSearch100GetRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(CourseSearch100GetRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("scacrseCrseNumb");
        sb.append('=');
        sb.append(((this.scacrseCrseNumb == null)?"<null>":this.scacrseCrseNumb));
        sb.append(',');
        sb.append("scacrseSubjCode");
        sb.append('=');
        sb.append(((this.scacrseSubjCode == null)?"<null>":this.scacrseSubjCode));
        sb.append(',');
        sb.append("scacrseStartDate");
        sb.append('=');
        sb.append(((this.scacrseStartDate == null)?"<null>":this.scacrseStartDate));
        sb.append(',');
        sb.append("scacrseEndDate");
        sb.append('=');
        sb.append(((this.scacrseEndDate == null)?"<null>":this.scacrseEndDate));
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
        result = ((result* 31)+((this.scacrseStartDate == null)? 0 :this.scacrseStartDate.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.scacrseEndDate == null)? 0 :this.scacrseEndDate.hashCode()));
        result = ((result* 31)+((this.scacrseCrseNumb == null)? 0 :this.scacrseCrseNumb.hashCode()));
        result = ((result* 31)+((this.scacrseSubjCode == null)? 0 :this.scacrseSubjCode.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof CourseSearch100GetRequest) == false) {
            return false;
        }
        CourseSearch100GetRequest rhs = ((CourseSearch100GetRequest) other);
        return ((((((this.scacrseStartDate == rhs.scacrseStartDate)||((this.scacrseStartDate!= null)&&this.scacrseStartDate.equals(rhs.scacrseStartDate)))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.scacrseEndDate == rhs.scacrseEndDate)||((this.scacrseEndDate!= null)&&this.scacrseEndDate.equals(rhs.scacrseEndDate))))&&((this.scacrseCrseNumb == rhs.scacrseCrseNumb)||((this.scacrseCrseNumb!= null)&&this.scacrseCrseNumb.equals(rhs.scacrseCrseNumb))))&&((this.scacrseSubjCode == rhs.scacrseSubjCode)||((this.scacrseSubjCode!= null)&&this.scacrseSubjCode.equals(rhs.scacrseSubjCode))));
    }

}
