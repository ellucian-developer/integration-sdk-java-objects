
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
    "id",
    "keyblckLevlCode",
    "keyblckOrigCode",
    "keyblckTermCode",
    "evenCode",
    "descNondb",
    "origCode",
    "decision",
    "grade",
    "effectiveDate"
})
@Generated("jsonschema2pojo")
public class TranscriptEventsAndCommentsAcademicEvents100QapiPost {

    @JsonProperty("id")
    private String id;
    @JsonProperty("keyblckLevlCode")
    private String keyblckLevlCode;
    @JsonProperty("keyblckOrigCode")
    private String keyblckOrigCode;
    @JsonProperty("keyblckTermCode")
    private String keyblckTermCode;
    /**
     * Event
     * <p>
     * Lineage reference object : SHREVNT_EVEN_CODE, Lookup lineage reference object : stveven
     * 
     */
    @JsonProperty("evenCode")
    @JsonPropertyDescription("Lineage reference object : SHREVNT_EVEN_CODE, Lookup lineage reference object : stveven")
    private String evenCode;
    /**
     * Description
     * <p>
     * 
     * 
     */
    @JsonProperty("descNondb")
    private String descNondb;
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
     * Decision
     * <p>
     * Lineage reference object : SHREVNT_DECISION
     * 
     */
    @JsonProperty("decision")
    @JsonPropertyDescription("Lineage reference object : SHREVNT_DECISION")
    private String decision;
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
     * Effective Date
     * <p>
     * Lineage reference object : SHREVNT_EFFECTIVE_DATE
     * 
     */
    @JsonProperty("effectiveDate")
    @JsonPropertyDescription("Lineage reference object : SHREVNT_EFFECTIVE_DATE")
    private Date effectiveDate;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    public TranscriptEventsAndCommentsAcademicEvents100QapiPost withId(String id) {
        this.id = id;
        return this;
    }

    @JsonProperty("keyblckLevlCode")
    public String getKeyblckLevlCode() {
        return keyblckLevlCode;
    }

    @JsonProperty("keyblckLevlCode")
    public void setKeyblckLevlCode(String keyblckLevlCode) {
        this.keyblckLevlCode = keyblckLevlCode;
    }

    public TranscriptEventsAndCommentsAcademicEvents100QapiPost withKeyblckLevlCode(String keyblckLevlCode) {
        this.keyblckLevlCode = keyblckLevlCode;
        return this;
    }

    @JsonProperty("keyblckOrigCode")
    public String getKeyblckOrigCode() {
        return keyblckOrigCode;
    }

    @JsonProperty("keyblckOrigCode")
    public void setKeyblckOrigCode(String keyblckOrigCode) {
        this.keyblckOrigCode = keyblckOrigCode;
    }

    public TranscriptEventsAndCommentsAcademicEvents100QapiPost withKeyblckOrigCode(String keyblckOrigCode) {
        this.keyblckOrigCode = keyblckOrigCode;
        return this;
    }

    @JsonProperty("keyblckTermCode")
    public String getKeyblckTermCode() {
        return keyblckTermCode;
    }

    @JsonProperty("keyblckTermCode")
    public void setKeyblckTermCode(String keyblckTermCode) {
        this.keyblckTermCode = keyblckTermCode;
    }

    public TranscriptEventsAndCommentsAcademicEvents100QapiPost withKeyblckTermCode(String keyblckTermCode) {
        this.keyblckTermCode = keyblckTermCode;
        return this;
    }

    /**
     * Event
     * <p>
     * Lineage reference object : SHREVNT_EVEN_CODE, Lookup lineage reference object : stveven
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
     * 
     */
    @JsonProperty("evenCode")
    public void setEvenCode(String evenCode) {
        this.evenCode = evenCode;
    }

    public TranscriptEventsAndCommentsAcademicEvents100QapiPost withEvenCode(String evenCode) {
        this.evenCode = evenCode;
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

    public TranscriptEventsAndCommentsAcademicEvents100QapiPost withDescNondb(String descNondb) {
        this.descNondb = descNondb;
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

    public TranscriptEventsAndCommentsAcademicEvents100QapiPost withOrigCode(String origCode) {
        this.origCode = origCode;
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

    public TranscriptEventsAndCommentsAcademicEvents100QapiPost withDecision(String decision) {
        this.decision = decision;
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

    public TranscriptEventsAndCommentsAcademicEvents100QapiPost withGrade(String grade) {
        this.grade = grade;
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

    public TranscriptEventsAndCommentsAcademicEvents100QapiPost withEffectiveDate(Date effectiveDate) {
        this.effectiveDate = effectiveDate;
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

    public TranscriptEventsAndCommentsAcademicEvents100QapiPost withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(TranscriptEventsAndCommentsAcademicEvents100QapiPost.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("keyblckLevlCode");
        sb.append('=');
        sb.append(((this.keyblckLevlCode == null)?"<null>":this.keyblckLevlCode));
        sb.append(',');
        sb.append("keyblckOrigCode");
        sb.append('=');
        sb.append(((this.keyblckOrigCode == null)?"<null>":this.keyblckOrigCode));
        sb.append(',');
        sb.append("keyblckTermCode");
        sb.append('=');
        sb.append(((this.keyblckTermCode == null)?"<null>":this.keyblckTermCode));
        sb.append(',');
        sb.append("evenCode");
        sb.append('=');
        sb.append(((this.evenCode == null)?"<null>":this.evenCode));
        sb.append(',');
        sb.append("descNondb");
        sb.append('=');
        sb.append(((this.descNondb == null)?"<null>":this.descNondb));
        sb.append(',');
        sb.append("origCode");
        sb.append('=');
        sb.append(((this.origCode == null)?"<null>":this.origCode));
        sb.append(',');
        sb.append("decision");
        sb.append('=');
        sb.append(((this.decision == null)?"<null>":this.decision));
        sb.append(',');
        sb.append("grade");
        sb.append('=');
        sb.append(((this.grade == null)?"<null>":this.grade));
        sb.append(',');
        sb.append("effectiveDate");
        sb.append('=');
        sb.append(((this.effectiveDate == null)?"<null>":this.effectiveDate));
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
        result = ((result* 31)+((this.keyblckLevlCode == null)? 0 :this.keyblckLevlCode.hashCode()));
        result = ((result* 31)+((this.decision == null)? 0 :this.decision.hashCode()));
        result = ((result* 31)+((this.descNondb == null)? 0 :this.descNondb.hashCode()));
        result = ((result* 31)+((this.grade == null)? 0 :this.grade.hashCode()));
        result = ((result* 31)+((this.keyblckTermCode == null)? 0 :this.keyblckTermCode.hashCode()));
        result = ((result* 31)+((this.evenCode == null)? 0 :this.evenCode.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.effectiveDate == null)? 0 :this.effectiveDate.hashCode()));
        result = ((result* 31)+((this.origCode == null)? 0 :this.origCode.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof TranscriptEventsAndCommentsAcademicEvents100QapiPost) == false) {
            return false;
        }
        TranscriptEventsAndCommentsAcademicEvents100QapiPost rhs = ((TranscriptEventsAndCommentsAcademicEvents100QapiPost) other);
        return ((((((((((((this.keyblckOrigCode == rhs.keyblckOrigCode)||((this.keyblckOrigCode!= null)&&this.keyblckOrigCode.equals(rhs.keyblckOrigCode)))&&((this.keyblckLevlCode == rhs.keyblckLevlCode)||((this.keyblckLevlCode!= null)&&this.keyblckLevlCode.equals(rhs.keyblckLevlCode))))&&((this.decision == rhs.decision)||((this.decision!= null)&&this.decision.equals(rhs.decision))))&&((this.descNondb == rhs.descNondb)||((this.descNondb!= null)&&this.descNondb.equals(rhs.descNondb))))&&((this.grade == rhs.grade)||((this.grade!= null)&&this.grade.equals(rhs.grade))))&&((this.keyblckTermCode == rhs.keyblckTermCode)||((this.keyblckTermCode!= null)&&this.keyblckTermCode.equals(rhs.keyblckTermCode))))&&((this.evenCode == rhs.evenCode)||((this.evenCode!= null)&&this.evenCode.equals(rhs.evenCode))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.effectiveDate == rhs.effectiveDate)||((this.effectiveDate!= null)&&this.effectiveDate.equals(rhs.effectiveDate))))&&((this.origCode == rhs.origCode)||((this.origCode!= null)&&this.origCode.equals(rhs.origCode))));
    }

}
