
package com.ellucian.generated.bpapi.ban.student_course_registration_audit.v1_0_0;

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
    "fromDate",
    "toDate",
    "id",
    "termCode"
})
@Generated("jsonschema2pojo")
public class StudentCourseRegistrationAudit100GetRequest {

    /**
     * Registration From Date
     * <p>
     * Lineage reference object : fromDate
     * 
     */
    @JsonProperty("fromDate")
    @JsonPropertyDescription("Lineage reference object : fromDate")
    private Object fromDate;
    /**
     * Registration To Date
     * <p>
     * Lineage reference object : toDate
     * 
     */
    @JsonProperty("toDate")
    @JsonPropertyDescription("Lineage reference object : toDate")
    private Object toDate;
    /**
     * ID
     * <p>
     * Lineage reference object : id
     * 
     */
    @JsonProperty("id")
    @JsonPropertyDescription("Lineage reference object : id")
    private Object id;
    /**
     * Term Code
     * <p>
     * Lineage reference object : termCode, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("termCode")
    @JsonPropertyDescription("Lineage reference object : termCode, Lookup lineage reference object : stvterm")
    private Object termCode;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Registration From Date
     * <p>
     * Lineage reference object : fromDate
     * 
     */
    @JsonProperty("fromDate")
    public Object getFromDate() {
        return fromDate;
    }

    /**
     * Registration From Date
     * <p>
     * Lineage reference object : fromDate
     * 
     */
    @JsonProperty("fromDate")
    public void setFromDate(Object fromDate) {
        this.fromDate = fromDate;
    }

    public StudentCourseRegistrationAudit100GetRequest withFromDate(Object fromDate) {
        this.fromDate = fromDate;
        return this;
    }

    /**
     * Registration To Date
     * <p>
     * Lineage reference object : toDate
     * 
     */
    @JsonProperty("toDate")
    public Object getToDate() {
        return toDate;
    }

    /**
     * Registration To Date
     * <p>
     * Lineage reference object : toDate
     * 
     */
    @JsonProperty("toDate")
    public void setToDate(Object toDate) {
        this.toDate = toDate;
    }

    public StudentCourseRegistrationAudit100GetRequest withToDate(Object toDate) {
        this.toDate = toDate;
        return this;
    }

    /**
     * ID
     * <p>
     * Lineage reference object : id
     * 
     */
    @JsonProperty("id")
    public Object getId() {
        return id;
    }

    /**
     * ID
     * <p>
     * Lineage reference object : id
     * 
     */
    @JsonProperty("id")
    public void setId(Object id) {
        this.id = id;
    }

    public StudentCourseRegistrationAudit100GetRequest withId(Object id) {
        this.id = id;
        return this;
    }

    /**
     * Term Code
     * <p>
     * Lineage reference object : termCode, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("termCode")
    public Object getTermCode() {
        return termCode;
    }

    /**
     * Term Code
     * <p>
     * Lineage reference object : termCode, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("termCode")
    public void setTermCode(Object termCode) {
        this.termCode = termCode;
    }

    public StudentCourseRegistrationAudit100GetRequest withTermCode(Object termCode) {
        this.termCode = termCode;
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

    public StudentCourseRegistrationAudit100GetRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(StudentCourseRegistrationAudit100GetRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("fromDate");
        sb.append('=');
        sb.append(((this.fromDate == null)?"<null>":this.fromDate));
        sb.append(',');
        sb.append("toDate");
        sb.append('=');
        sb.append(((this.toDate == null)?"<null>":this.toDate));
        sb.append(',');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("termCode");
        sb.append('=');
        sb.append(((this.termCode == null)?"<null>":this.termCode));
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
        result = ((result* 31)+((this.fromDate == null)? 0 :this.fromDate.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.toDate == null)? 0 :this.toDate.hashCode()));
        result = ((result* 31)+((this.termCode == null)? 0 :this.termCode.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof StudentCourseRegistrationAudit100GetRequest) == false) {
            return false;
        }
        StudentCourseRegistrationAudit100GetRequest rhs = ((StudentCourseRegistrationAudit100GetRequest) other);
        return ((((((this.fromDate == rhs.fromDate)||((this.fromDate!= null)&&this.fromDate.equals(rhs.fromDate)))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.toDate == rhs.toDate)||((this.toDate!= null)&&this.toDate.equals(rhs.toDate))))&&((this.termCode == rhs.termCode)||((this.termCode!= null)&&this.termCode.equals(rhs.termCode))));
    }

}
