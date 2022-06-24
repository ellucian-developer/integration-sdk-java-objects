
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
    "keyblckOrigCode",
    "criteria.origCode",
    "decision",
    "criteria.descNondb",
    "keyblckTermCode",
    "criteria.evenCode",
    "criteria.grade",
    "origCode",
    "keyblckLevlCode",
    "descNondb",
    "grade",
    "evenCode",
    "id",
    "criteria.decision",
    "effectiveDate",
    "criteria.effectiveDate"
})
@Generated("jsonschema2pojo")
public class TranscriptEventsAndCommentsAcademicEvents100PutRequest {

    /**
     * Originator
     * <p>
     * Lineage reference object : keyblckOrigCode, Lookup lineage reference object : stvorig
     * 
     */
    @JsonProperty("keyblckOrigCode")
    @JsonPropertyDescription("Lineage reference object : keyblckOrigCode, Lookup lineage reference object : stvorig")
    private String keyblckOrigCode;
    /**
     * Originator
     * <p>
     * Lineage reference object : SHREVNT_ORIG_CODE, Lookup lineage reference object : stvorig
     * 
     */
    @JsonProperty("criteria.origCode")
    @JsonPropertyDescription("Lineage reference object : SHREVNT_ORIG_CODE, Lookup lineage reference object : stvorig")
    private String criteriaOrigCode;
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
    @JsonProperty("criteria.descNondb")
    private String criteriaDescNondb;
    /**
     * Term
     * <p>
     * Lineage reference object : keyblckTermCode
     * 
     */
    @JsonProperty("keyblckTermCode")
    @JsonPropertyDescription("Lineage reference object : keyblckTermCode")
    private String keyblckTermCode;
    /**
     * Event
     * <p>
     * Lineage reference object : SHREVNT_EVEN_CODE, Lookup lineage reference object : stveven
     * (Required)
     * 
     */
    @JsonProperty("criteria.evenCode")
    @JsonPropertyDescription("Lineage reference object : SHREVNT_EVEN_CODE, Lookup lineage reference object : stveven")
    private String criteriaEvenCode;
    /**
     * Grade
     * <p>
     * Lineage reference object : SHREVNT_GRADE
     * 
     */
    @JsonProperty("criteria.grade")
    @JsonPropertyDescription("Lineage reference object : SHREVNT_GRADE")
    private String criteriaGrade;
    /**
     * Originator
     * <p>
     * Lineage reference object : SHREVNT_ORIG_CODE, Lookup lineage reference object : stvorig
     * 
     */
    @JsonProperty("origCode")
    @JsonPropertyDescription("Lineage reference object : SHREVNT_ORIG_CODE, Lookup lineage reference object : stvorig")
    private String origCode;
    /**
     * Level
     * <p>
     * Lineage reference object : keyblckLevlCode, Lookup lineage reference object : stvlevl
     * 
     */
    @JsonProperty("keyblckLevlCode")
    @JsonPropertyDescription("Lineage reference object : keyblckLevlCode, Lookup lineage reference object : stvlevl")
    private String keyblckLevlCode;
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
     * ID
     * <p>
     * Lineage reference object : id
     * 
     */
    @JsonProperty("id")
    @JsonPropertyDescription("Lineage reference object : id")
    private String id;
    /**
     * Decision
     * <p>
     * Lineage reference object : SHREVNT_DECISION
     * 
     */
    @JsonProperty("criteria.decision")
    @JsonPropertyDescription("Lineage reference object : SHREVNT_DECISION")
    private String criteriaDecision;
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
     * Effective Date
     * <p>
     * Lineage reference object : SHREVNT_EFFECTIVE_DATE
     * 
     */
    @JsonProperty("criteria.effectiveDate")
    @JsonPropertyDescription("Lineage reference object : SHREVNT_EFFECTIVE_DATE")
    private Date criteriaEffectiveDate;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Originator
     * <p>
     * Lineage reference object : keyblckOrigCode, Lookup lineage reference object : stvorig
     * 
     */
    @JsonProperty("keyblckOrigCode")
    public String getKeyblckOrigCode() {
        return keyblckOrigCode;
    }

    /**
     * Originator
     * <p>
     * Lineage reference object : keyblckOrigCode, Lookup lineage reference object : stvorig
     * 
     */
    @JsonProperty("keyblckOrigCode")
    public void setKeyblckOrigCode(String keyblckOrigCode) {
        this.keyblckOrigCode = keyblckOrigCode;
    }

    public TranscriptEventsAndCommentsAcademicEvents100PutRequest withKeyblckOrigCode(String keyblckOrigCode) {
        this.keyblckOrigCode = keyblckOrigCode;
        return this;
    }

    /**
     * Originator
     * <p>
     * Lineage reference object : SHREVNT_ORIG_CODE, Lookup lineage reference object : stvorig
     * 
     */
    @JsonProperty("criteria.origCode")
    public String getCriteriaOrigCode() {
        return criteriaOrigCode;
    }

    /**
     * Originator
     * <p>
     * Lineage reference object : SHREVNT_ORIG_CODE, Lookup lineage reference object : stvorig
     * 
     */
    @JsonProperty("criteria.origCode")
    public void setCriteriaOrigCode(String criteriaOrigCode) {
        this.criteriaOrigCode = criteriaOrigCode;
    }

    public TranscriptEventsAndCommentsAcademicEvents100PutRequest withCriteriaOrigCode(String criteriaOrigCode) {
        this.criteriaOrigCode = criteriaOrigCode;
        return this;
    }

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

    public TranscriptEventsAndCommentsAcademicEvents100PutRequest withDecision(String decision) {
        this.decision = decision;
        return this;
    }

    /**
     * Description
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.descNondb")
    public String getCriteriaDescNondb() {
        return criteriaDescNondb;
    }

    /**
     * Description
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.descNondb")
    public void setCriteriaDescNondb(String criteriaDescNondb) {
        this.criteriaDescNondb = criteriaDescNondb;
    }

    public TranscriptEventsAndCommentsAcademicEvents100PutRequest withCriteriaDescNondb(String criteriaDescNondb) {
        this.criteriaDescNondb = criteriaDescNondb;
        return this;
    }

    /**
     * Term
     * <p>
     * Lineage reference object : keyblckTermCode
     * 
     */
    @JsonProperty("keyblckTermCode")
    public String getKeyblckTermCode() {
        return keyblckTermCode;
    }

    /**
     * Term
     * <p>
     * Lineage reference object : keyblckTermCode
     * 
     */
    @JsonProperty("keyblckTermCode")
    public void setKeyblckTermCode(String keyblckTermCode) {
        this.keyblckTermCode = keyblckTermCode;
    }

    public TranscriptEventsAndCommentsAcademicEvents100PutRequest withKeyblckTermCode(String keyblckTermCode) {
        this.keyblckTermCode = keyblckTermCode;
        return this;
    }

    /**
     * Event
     * <p>
     * Lineage reference object : SHREVNT_EVEN_CODE, Lookup lineage reference object : stveven
     * (Required)
     * 
     */
    @JsonProperty("criteria.evenCode")
    public String getCriteriaEvenCode() {
        return criteriaEvenCode;
    }

    /**
     * Event
     * <p>
     * Lineage reference object : SHREVNT_EVEN_CODE, Lookup lineage reference object : stveven
     * (Required)
     * 
     */
    @JsonProperty("criteria.evenCode")
    public void setCriteriaEvenCode(String criteriaEvenCode) {
        this.criteriaEvenCode = criteriaEvenCode;
    }

    public TranscriptEventsAndCommentsAcademicEvents100PutRequest withCriteriaEvenCode(String criteriaEvenCode) {
        this.criteriaEvenCode = criteriaEvenCode;
        return this;
    }

    /**
     * Grade
     * <p>
     * Lineage reference object : SHREVNT_GRADE
     * 
     */
    @JsonProperty("criteria.grade")
    public String getCriteriaGrade() {
        return criteriaGrade;
    }

    /**
     * Grade
     * <p>
     * Lineage reference object : SHREVNT_GRADE
     * 
     */
    @JsonProperty("criteria.grade")
    public void setCriteriaGrade(String criteriaGrade) {
        this.criteriaGrade = criteriaGrade;
    }

    public TranscriptEventsAndCommentsAcademicEvents100PutRequest withCriteriaGrade(String criteriaGrade) {
        this.criteriaGrade = criteriaGrade;
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

    public TranscriptEventsAndCommentsAcademicEvents100PutRequest withOrigCode(String origCode) {
        this.origCode = origCode;
        return this;
    }

    /**
     * Level
     * <p>
     * Lineage reference object : keyblckLevlCode, Lookup lineage reference object : stvlevl
     * 
     */
    @JsonProperty("keyblckLevlCode")
    public String getKeyblckLevlCode() {
        return keyblckLevlCode;
    }

    /**
     * Level
     * <p>
     * Lineage reference object : keyblckLevlCode, Lookup lineage reference object : stvlevl
     * 
     */
    @JsonProperty("keyblckLevlCode")
    public void setKeyblckLevlCode(String keyblckLevlCode) {
        this.keyblckLevlCode = keyblckLevlCode;
    }

    public TranscriptEventsAndCommentsAcademicEvents100PutRequest withKeyblckLevlCode(String keyblckLevlCode) {
        this.keyblckLevlCode = keyblckLevlCode;
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

    public TranscriptEventsAndCommentsAcademicEvents100PutRequest withDescNondb(String descNondb) {
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

    public TranscriptEventsAndCommentsAcademicEvents100PutRequest withGrade(String grade) {
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

    public TranscriptEventsAndCommentsAcademicEvents100PutRequest withEvenCode(String evenCode) {
        this.evenCode = evenCode;
        return this;
    }

    /**
     * ID
     * <p>
     * Lineage reference object : id
     * 
     */
    @JsonProperty("id")
    public String getId() {
        return id;
    }

    /**
     * ID
     * <p>
     * Lineage reference object : id
     * 
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    public TranscriptEventsAndCommentsAcademicEvents100PutRequest withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Decision
     * <p>
     * Lineage reference object : SHREVNT_DECISION
     * 
     */
    @JsonProperty("criteria.decision")
    public String getCriteriaDecision() {
        return criteriaDecision;
    }

    /**
     * Decision
     * <p>
     * Lineage reference object : SHREVNT_DECISION
     * 
     */
    @JsonProperty("criteria.decision")
    public void setCriteriaDecision(String criteriaDecision) {
        this.criteriaDecision = criteriaDecision;
    }

    public TranscriptEventsAndCommentsAcademicEvents100PutRequest withCriteriaDecision(String criteriaDecision) {
        this.criteriaDecision = criteriaDecision;
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

    public TranscriptEventsAndCommentsAcademicEvents100PutRequest withEffectiveDate(Date effectiveDate) {
        this.effectiveDate = effectiveDate;
        return this;
    }

    /**
     * Effective Date
     * <p>
     * Lineage reference object : SHREVNT_EFFECTIVE_DATE
     * 
     */
    @JsonProperty("criteria.effectiveDate")
    public Date getCriteriaEffectiveDate() {
        return criteriaEffectiveDate;
    }

    /**
     * Effective Date
     * <p>
     * Lineage reference object : SHREVNT_EFFECTIVE_DATE
     * 
     */
    @JsonProperty("criteria.effectiveDate")
    public void setCriteriaEffectiveDate(Date criteriaEffectiveDate) {
        this.criteriaEffectiveDate = criteriaEffectiveDate;
    }

    public TranscriptEventsAndCommentsAcademicEvents100PutRequest withCriteriaEffectiveDate(Date criteriaEffectiveDate) {
        this.criteriaEffectiveDate = criteriaEffectiveDate;
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

    public TranscriptEventsAndCommentsAcademicEvents100PutRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(TranscriptEventsAndCommentsAcademicEvents100PutRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("keyblckOrigCode");
        sb.append('=');
        sb.append(((this.keyblckOrigCode == null)?"<null>":this.keyblckOrigCode));
        sb.append(',');
        sb.append("criteriaOrigCode");
        sb.append('=');
        sb.append(((this.criteriaOrigCode == null)?"<null>":this.criteriaOrigCode));
        sb.append(',');
        sb.append("decision");
        sb.append('=');
        sb.append(((this.decision == null)?"<null>":this.decision));
        sb.append(',');
        sb.append("criteriaDescNondb");
        sb.append('=');
        sb.append(((this.criteriaDescNondb == null)?"<null>":this.criteriaDescNondb));
        sb.append(',');
        sb.append("keyblckTermCode");
        sb.append('=');
        sb.append(((this.keyblckTermCode == null)?"<null>":this.keyblckTermCode));
        sb.append(',');
        sb.append("criteriaEvenCode");
        sb.append('=');
        sb.append(((this.criteriaEvenCode == null)?"<null>":this.criteriaEvenCode));
        sb.append(',');
        sb.append("criteriaGrade");
        sb.append('=');
        sb.append(((this.criteriaGrade == null)?"<null>":this.criteriaGrade));
        sb.append(',');
        sb.append("origCode");
        sb.append('=');
        sb.append(((this.origCode == null)?"<null>":this.origCode));
        sb.append(',');
        sb.append("keyblckLevlCode");
        sb.append('=');
        sb.append(((this.keyblckLevlCode == null)?"<null>":this.keyblckLevlCode));
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
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("criteriaDecision");
        sb.append('=');
        sb.append(((this.criteriaDecision == null)?"<null>":this.criteriaDecision));
        sb.append(',');
        sb.append("effectiveDate");
        sb.append('=');
        sb.append(((this.effectiveDate == null)?"<null>":this.effectiveDate));
        sb.append(',');
        sb.append("criteriaEffectiveDate");
        sb.append('=');
        sb.append(((this.criteriaEffectiveDate == null)?"<null>":this.criteriaEffectiveDate));
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
        result = ((result* 31)+((this.keyblckOrigCode == null)? 0 :this.keyblckOrigCode.hashCode()));
        result = ((result* 31)+((this.decision == null)? 0 :this.decision.hashCode()));
        result = ((result* 31)+((this.criteriaOrigCode == null)? 0 :this.criteriaOrigCode.hashCode()));
        result = ((result* 31)+((this.keyblckTermCode == null)? 0 :this.keyblckTermCode.hashCode()));
        result = ((result* 31)+((this.criteriaDescNondb == null)? 0 :this.criteriaDescNondb.hashCode()));
        result = ((result* 31)+((this.criteriaGrade == null)? 0 :this.criteriaGrade.hashCode()));
        result = ((result* 31)+((this.criteriaEvenCode == null)? 0 :this.criteriaEvenCode.hashCode()));
        result = ((result* 31)+((this.origCode == null)? 0 :this.origCode.hashCode()));
        result = ((result* 31)+((this.keyblckLevlCode == null)? 0 :this.keyblckLevlCode.hashCode()));
        result = ((result* 31)+((this.criteriaEffectiveDate == null)? 0 :this.criteriaEffectiveDate.hashCode()));
        result = ((result* 31)+((this.descNondb == null)? 0 :this.descNondb.hashCode()));
        result = ((result* 31)+((this.grade == null)? 0 :this.grade.hashCode()));
        result = ((result* 31)+((this.criteriaDecision == null)? 0 :this.criteriaDecision.hashCode()));
        result = ((result* 31)+((this.evenCode == null)? 0 :this.evenCode.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.effectiveDate == null)? 0 :this.effectiveDate.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof TranscriptEventsAndCommentsAcademicEvents100PutRequest) == false) {
            return false;
        }
        TranscriptEventsAndCommentsAcademicEvents100PutRequest rhs = ((TranscriptEventsAndCommentsAcademicEvents100PutRequest) other);
        return ((((((((((((((((((this.keyblckOrigCode == rhs.keyblckOrigCode)||((this.keyblckOrigCode!= null)&&this.keyblckOrigCode.equals(rhs.keyblckOrigCode)))&&((this.decision == rhs.decision)||((this.decision!= null)&&this.decision.equals(rhs.decision))))&&((this.criteriaOrigCode == rhs.criteriaOrigCode)||((this.criteriaOrigCode!= null)&&this.criteriaOrigCode.equals(rhs.criteriaOrigCode))))&&((this.keyblckTermCode == rhs.keyblckTermCode)||((this.keyblckTermCode!= null)&&this.keyblckTermCode.equals(rhs.keyblckTermCode))))&&((this.criteriaDescNondb == rhs.criteriaDescNondb)||((this.criteriaDescNondb!= null)&&this.criteriaDescNondb.equals(rhs.criteriaDescNondb))))&&((this.criteriaGrade == rhs.criteriaGrade)||((this.criteriaGrade!= null)&&this.criteriaGrade.equals(rhs.criteriaGrade))))&&((this.criteriaEvenCode == rhs.criteriaEvenCode)||((this.criteriaEvenCode!= null)&&this.criteriaEvenCode.equals(rhs.criteriaEvenCode))))&&((this.origCode == rhs.origCode)||((this.origCode!= null)&&this.origCode.equals(rhs.origCode))))&&((this.keyblckLevlCode == rhs.keyblckLevlCode)||((this.keyblckLevlCode!= null)&&this.keyblckLevlCode.equals(rhs.keyblckLevlCode))))&&((this.criteriaEffectiveDate == rhs.criteriaEffectiveDate)||((this.criteriaEffectiveDate!= null)&&this.criteriaEffectiveDate.equals(rhs.criteriaEffectiveDate))))&&((this.descNondb == rhs.descNondb)||((this.descNondb!= null)&&this.descNondb.equals(rhs.descNondb))))&&((this.grade == rhs.grade)||((this.grade!= null)&&this.grade.equals(rhs.grade))))&&((this.criteriaDecision == rhs.criteriaDecision)||((this.criteriaDecision!= null)&&this.criteriaDecision.equals(rhs.criteriaDecision))))&&((this.evenCode == rhs.evenCode)||((this.evenCode!= null)&&this.evenCode.equals(rhs.evenCode))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.effectiveDate == rhs.effectiveDate)||((this.effectiveDate!= null)&&this.effectiveDate.equals(rhs.effectiveDate))));
    }

}
