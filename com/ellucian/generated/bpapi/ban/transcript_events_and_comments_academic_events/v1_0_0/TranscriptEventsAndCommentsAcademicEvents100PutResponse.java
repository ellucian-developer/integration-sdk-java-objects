
package com.ellucian.generated.bpapi.ban.transcript_events_and_comments_academic_events.v1_0_0;

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
    "decision",
    "descNondb",
    "grade",
    "evenCode",
    "effectiveDate",
    "origCode",
    "stvevenTransInd"
})
@Generated("jsonschema2pojo")
public class TranscriptEventsAndCommentsAcademicEvents100PutResponse {

    /**
     * Decision
     * <p>
     * Lineage reference object : SHREVNT_DECISION
     * 
     */
    @JsonProperty("decision")
    @JsonPropertyDescription("Lineage reference object : SHREVNT_DECISION")
    private String decision;
    /**
     * Description
     * <p>
     * 
     * 
     */
    @JsonProperty("descNondb")
    private String descNondb;
    /**
     * Grade
     * <p>
     * Lineage reference object : SHREVNT_GRADE
     * 
     */
    @JsonProperty("grade")
    @JsonPropertyDescription("Lineage reference object : SHREVNT_GRADE")
    private String grade;
    /**
     * Event
     * <p>
     * Lineage reference object : SHREVNT_EVEN_CODE, Lookup lineage reference object : stveven
     * (Required)
     * 
     */
    @JsonProperty("evenCode")
    @JsonPropertyDescription("Lineage reference object : SHREVNT_EVEN_CODE, Lookup lineage reference object : stveven")
    private String evenCode;
    /**
     * Effective Date
     * <p>
     * Lineage reference object : SHREVNT_EFFECTIVE_DATE
     * 
     */
    @JsonProperty("effectiveDate")
    @JsonPropertyDescription("Lineage reference object : SHREVNT_EFFECTIVE_DATE")
    private Date effectiveDate;
    /**
     * Originator
     * <p>
     * Lineage reference object : SHREVNT_ORIG_CODE, Lookup lineage reference object : stvorig
     * 
     */
    @JsonProperty("origCode")
    @JsonPropertyDescription("Lineage reference object : SHREVNT_ORIG_CODE, Lookup lineage reference object : stvorig")
    private String origCode;
    @JsonProperty("stvevenTransInd")
    private String stvevenTransInd;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Decision
     * <p>
     * Lineage reference object : SHREVNT_DECISION
     * 
     */
    @JsonProperty("decision")
    public String getDecision() {
        return decision;
    }

    /**
     * Decision
     * <p>
     * Lineage reference object : SHREVNT_DECISION
     * 
     */
    @JsonProperty("decision")
    public void setDecision(String decision) {
        this.decision = decision;
    }

    public TranscriptEventsAndCommentsAcademicEvents100PutResponse withDecision(String decision) {
        this.decision = decision;
        return this;
    }

    /**
     * Description
     * <p>
     * 
     * 
     */
    @JsonProperty("descNondb")
    public String getDescNondb() {
        return descNondb;
    }

    /**
     * Description
     * <p>
     * 
     * 
     */
    @JsonProperty("descNondb")
    public void setDescNondb(String descNondb) {
        this.descNondb = descNondb;
    }

    public TranscriptEventsAndCommentsAcademicEvents100PutResponse withDescNondb(String descNondb) {
        this.descNondb = descNondb;
        return this;
    }

    /**
     * Grade
     * <p>
     * Lineage reference object : SHREVNT_GRADE
     * 
     */
    @JsonProperty("grade")
    public String getGrade() {
        return grade;
    }

    /**
     * Grade
     * <p>
     * Lineage reference object : SHREVNT_GRADE
     * 
     */
    @JsonProperty("grade")
    public void setGrade(String grade) {
        this.grade = grade;
    }

    public TranscriptEventsAndCommentsAcademicEvents100PutResponse withGrade(String grade) {
        this.grade = grade;
        return this;
    }

    /**
     * Event
     * <p>
     * Lineage reference object : SHREVNT_EVEN_CODE, Lookup lineage reference object : stveven
     * (Required)
     * 
     */
    @JsonProperty("evenCode")
    public String getEvenCode() {
        return evenCode;
    }

    /**
     * Event
     * <p>
     * Lineage reference object : SHREVNT_EVEN_CODE, Lookup lineage reference object : stveven
     * (Required)
     * 
     */
    @JsonProperty("evenCode")
    public void setEvenCode(String evenCode) {
        this.evenCode = evenCode;
    }

    public TranscriptEventsAndCommentsAcademicEvents100PutResponse withEvenCode(String evenCode) {
        this.evenCode = evenCode;
        return this;
    }

    /**
     * Effective Date
     * <p>
     * Lineage reference object : SHREVNT_EFFECTIVE_DATE
     * 
     */
    @JsonProperty("effectiveDate")
    public Date getEffectiveDate() {
        return effectiveDate;
    }

    /**
     * Effective Date
     * <p>
     * Lineage reference object : SHREVNT_EFFECTIVE_DATE
     * 
     */
    @JsonProperty("effectiveDate")
    public void setEffectiveDate(Date effectiveDate) {
        this.effectiveDate = effectiveDate;
    }

    public TranscriptEventsAndCommentsAcademicEvents100PutResponse withEffectiveDate(Date effectiveDate) {
        this.effectiveDate = effectiveDate;
        return this;
    }

    /**
     * Originator
     * <p>
     * Lineage reference object : SHREVNT_ORIG_CODE, Lookup lineage reference object : stvorig
     * 
     */
    @JsonProperty("origCode")
    public String getOrigCode() {
        return origCode;
    }

    /**
     * Originator
     * <p>
     * Lineage reference object : SHREVNT_ORIG_CODE, Lookup lineage reference object : stvorig
     * 
     */
    @JsonProperty("origCode")
    public void setOrigCode(String origCode) {
        this.origCode = origCode;
    }

    public TranscriptEventsAndCommentsAcademicEvents100PutResponse withOrigCode(String origCode) {
        this.origCode = origCode;
        return this;
    }

    @JsonProperty("stvevenTransInd")
    public String getStvevenTransInd() {
        return stvevenTransInd;
    }

    @JsonProperty("stvevenTransInd")
    public void setStvevenTransInd(String stvevenTransInd) {
        this.stvevenTransInd = stvevenTransInd;
    }

    public TranscriptEventsAndCommentsAcademicEvents100PutResponse withStvevenTransInd(String stvevenTransInd) {
        this.stvevenTransInd = stvevenTransInd;
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

    public TranscriptEventsAndCommentsAcademicEvents100PutResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(TranscriptEventsAndCommentsAcademicEvents100PutResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("decision");
        sb.append('=');
        sb.append(((this.decision == null)?"<null>":this.decision));
        sb.append(',');
        sb.append("descNondb");
        sb.append('=');
        sb.append(((this.descNondb == null)?"<null>":this.descNondb));
        sb.append(',');
        sb.append("grade");
        sb.append('=');
        sb.append(((this.grade == null)?"<null>":this.grade));
        sb.append(',');
        sb.append("evenCode");
        sb.append('=');
        sb.append(((this.evenCode == null)?"<null>":this.evenCode));
        sb.append(',');
        sb.append("effectiveDate");
        sb.append('=');
        sb.append(((this.effectiveDate == null)?"<null>":this.effectiveDate));
        sb.append(',');
        sb.append("origCode");
        sb.append('=');
        sb.append(((this.origCode == null)?"<null>":this.origCode));
        sb.append(',');
        sb.append("stvevenTransInd");
        sb.append('=');
        sb.append(((this.stvevenTransInd == null)?"<null>":this.stvevenTransInd));
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
        result = ((result* 31)+((this.decision == null)? 0 :this.decision.hashCode()));
        result = ((result* 31)+((this.descNondb == null)? 0 :this.descNondb.hashCode()));
        result = ((result* 31)+((this.grade == null)? 0 :this.grade.hashCode()));
        result = ((result* 31)+((this.evenCode == null)? 0 :this.evenCode.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.effectiveDate == null)? 0 :this.effectiveDate.hashCode()));
        result = ((result* 31)+((this.origCode == null)? 0 :this.origCode.hashCode()));
        result = ((result* 31)+((this.stvevenTransInd == null)? 0 :this.stvevenTransInd.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof TranscriptEventsAndCommentsAcademicEvents100PutResponse) == false) {
            return false;
        }
        TranscriptEventsAndCommentsAcademicEvents100PutResponse rhs = ((TranscriptEventsAndCommentsAcademicEvents100PutResponse) other);
        return (((((((((this.decision == rhs.decision)||((this.decision!= null)&&this.decision.equals(rhs.decision)))&&((this.descNondb == rhs.descNondb)||((this.descNondb!= null)&&this.descNondb.equals(rhs.descNondb))))&&((this.grade == rhs.grade)||((this.grade!= null)&&this.grade.equals(rhs.grade))))&&((this.evenCode == rhs.evenCode)||((this.evenCode!= null)&&this.evenCode.equals(rhs.evenCode))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.effectiveDate == rhs.effectiveDate)||((this.effectiveDate!= null)&&this.effectiveDate.equals(rhs.effectiveDate))))&&((this.origCode == rhs.origCode)||((this.origCode!= null)&&this.origCode.equals(rhs.origCode))))&&((this.stvevenTransInd == rhs.stvevenTransInd)||((this.stvevenTransInd!= null)&&this.stvevenTransInd.equals(rhs.stvevenTransInd))));
    }

}
