
package com.ellucian.generated.bpapi.ban.complementary_activities_submission_inquiry.v1_0_0;

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
    "program",
    "termCode",
    "id",
    "categoryCode",
    "activityCode",
    "casvDesc",
    "collCode",
    "sequenceNumber"
})
@Generated("jsonschema2pojo")
public class ComplementaryActivitiesSubmissionInquiry100QapiPost {

    /**
     * Program
     * <p>
     * Lineage reference object : SOVCASA_PROGRAM
     * 
     */
    @JsonProperty("program")
    @JsonPropertyDescription("Lineage reference object : SOVCASA_PROGRAM")
    private String program;
    /**
     * Term
     * <p>
     * Lineage reference object : SOVCASA_TERM_CODE
     * 
     */
    @JsonProperty("termCode")
    @JsonPropertyDescription("Lineage reference object : SOVCASA_TERM_CODE")
    private String termCode;
    /**
     * ID
     * <p>
     * 
     * 
     */
    @JsonProperty("id")
    private String id;
    /**
     * Category
     * <p>
     * Lineage reference object : SOVCASA_CATEGORY_CODE
     * 
     */
    @JsonProperty("categoryCode")
    @JsonPropertyDescription("Lineage reference object : SOVCASA_CATEGORY_CODE")
    private String categoryCode;
    /**
     * Activity
     * <p>
     * Lineage reference object : SOVCASA_ACTIVITY_CODE
     * 
     */
    @JsonProperty("activityCode")
    @JsonPropertyDescription("Lineage reference object : SOVCASA_ACTIVITY_CODE")
    private String activityCode;
    /**
     * Status
     * <p>
     * Lineage reference object : SOVCASA_CASV_DESC
     * 
     */
    @JsonProperty("casvDesc")
    @JsonPropertyDescription("Lineage reference object : SOVCASA_CASV_DESC")
    private String casvDesc;
    /**
     * College
     * <p>
     * Lineage reference object : SOVCASA_COLL_CODE
     * 
     */
    @JsonProperty("collCode")
    @JsonPropertyDescription("Lineage reference object : SOVCASA_COLL_CODE")
    private String collCode;
    /**
     * CA Request ID
     * <p>
     * Lineage reference object : SOVCASA_SEQUENCE_NUMBER
     * 
     */
    @JsonProperty("sequenceNumber")
    @JsonPropertyDescription("Lineage reference object : SOVCASA_SEQUENCE_NUMBER")
    private Double sequenceNumber;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Program
     * <p>
     * Lineage reference object : SOVCASA_PROGRAM
     * 
     */
    @JsonProperty("program")
    public String getProgram() {
        return program;
    }

    /**
     * Program
     * <p>
     * Lineage reference object : SOVCASA_PROGRAM
     * 
     */
    @JsonProperty("program")
    public void setProgram(String program) {
        this.program = program;
    }

    public ComplementaryActivitiesSubmissionInquiry100QapiPost withProgram(String program) {
        this.program = program;
        return this;
    }

    /**
     * Term
     * <p>
     * Lineage reference object : SOVCASA_TERM_CODE
     * 
     */
    @JsonProperty("termCode")
    public String getTermCode() {
        return termCode;
    }

    /**
     * Term
     * <p>
     * Lineage reference object : SOVCASA_TERM_CODE
     * 
     */
    @JsonProperty("termCode")
    public void setTermCode(String termCode) {
        this.termCode = termCode;
    }

    public ComplementaryActivitiesSubmissionInquiry100QapiPost withTermCode(String termCode) {
        this.termCode = termCode;
        return this;
    }

    /**
     * ID
     * <p>
     * 
     * 
     */
    @JsonProperty("id")
    public String getId() {
        return id;
    }

    /**
     * ID
     * <p>
     * 
     * 
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    public ComplementaryActivitiesSubmissionInquiry100QapiPost withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Category
     * <p>
     * Lineage reference object : SOVCASA_CATEGORY_CODE
     * 
     */
    @JsonProperty("categoryCode")
    public String getCategoryCode() {
        return categoryCode;
    }

    /**
     * Category
     * <p>
     * Lineage reference object : SOVCASA_CATEGORY_CODE
     * 
     */
    @JsonProperty("categoryCode")
    public void setCategoryCode(String categoryCode) {
        this.categoryCode = categoryCode;
    }

    public ComplementaryActivitiesSubmissionInquiry100QapiPost withCategoryCode(String categoryCode) {
        this.categoryCode = categoryCode;
        return this;
    }

    /**
     * Activity
     * <p>
     * Lineage reference object : SOVCASA_ACTIVITY_CODE
     * 
     */
    @JsonProperty("activityCode")
    public String getActivityCode() {
        return activityCode;
    }

    /**
     * Activity
     * <p>
     * Lineage reference object : SOVCASA_ACTIVITY_CODE
     * 
     */
    @JsonProperty("activityCode")
    public void setActivityCode(String activityCode) {
        this.activityCode = activityCode;
    }

    public ComplementaryActivitiesSubmissionInquiry100QapiPost withActivityCode(String activityCode) {
        this.activityCode = activityCode;
        return this;
    }

    /**
     * Status
     * <p>
     * Lineage reference object : SOVCASA_CASV_DESC
     * 
     */
    @JsonProperty("casvDesc")
    public String getCasvDesc() {
        return casvDesc;
    }

    /**
     * Status
     * <p>
     * Lineage reference object : SOVCASA_CASV_DESC
     * 
     */
    @JsonProperty("casvDesc")
    public void setCasvDesc(String casvDesc) {
        this.casvDesc = casvDesc;
    }

    public ComplementaryActivitiesSubmissionInquiry100QapiPost withCasvDesc(String casvDesc) {
        this.casvDesc = casvDesc;
        return this;
    }

    /**
     * College
     * <p>
     * Lineage reference object : SOVCASA_COLL_CODE
     * 
     */
    @JsonProperty("collCode")
    public String getCollCode() {
        return collCode;
    }

    /**
     * College
     * <p>
     * Lineage reference object : SOVCASA_COLL_CODE
     * 
     */
    @JsonProperty("collCode")
    public void setCollCode(String collCode) {
        this.collCode = collCode;
    }

    public ComplementaryActivitiesSubmissionInquiry100QapiPost withCollCode(String collCode) {
        this.collCode = collCode;
        return this;
    }

    /**
     * CA Request ID
     * <p>
     * Lineage reference object : SOVCASA_SEQUENCE_NUMBER
     * 
     */
    @JsonProperty("sequenceNumber")
    public Double getSequenceNumber() {
        return sequenceNumber;
    }

    /**
     * CA Request ID
     * <p>
     * Lineage reference object : SOVCASA_SEQUENCE_NUMBER
     * 
     */
    @JsonProperty("sequenceNumber")
    public void setSequenceNumber(Double sequenceNumber) {
        this.sequenceNumber = sequenceNumber;
    }

    public ComplementaryActivitiesSubmissionInquiry100QapiPost withSequenceNumber(Double sequenceNumber) {
        this.sequenceNumber = sequenceNumber;
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

    public ComplementaryActivitiesSubmissionInquiry100QapiPost withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ComplementaryActivitiesSubmissionInquiry100QapiPost.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("program");
        sb.append('=');
        sb.append(((this.program == null)?"<null>":this.program));
        sb.append(',');
        sb.append("termCode");
        sb.append('=');
        sb.append(((this.termCode == null)?"<null>":this.termCode));
        sb.append(',');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("categoryCode");
        sb.append('=');
        sb.append(((this.categoryCode == null)?"<null>":this.categoryCode));
        sb.append(',');
        sb.append("activityCode");
        sb.append('=');
        sb.append(((this.activityCode == null)?"<null>":this.activityCode));
        sb.append(',');
        sb.append("casvDesc");
        sb.append('=');
        sb.append(((this.casvDesc == null)?"<null>":this.casvDesc));
        sb.append(',');
        sb.append("collCode");
        sb.append('=');
        sb.append(((this.collCode == null)?"<null>":this.collCode));
        sb.append(',');
        sb.append("sequenceNumber");
        sb.append('=');
        sb.append(((this.sequenceNumber == null)?"<null>":this.sequenceNumber));
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
        result = ((result* 31)+((this.activityCode == null)? 0 :this.activityCode.hashCode()));
        result = ((result* 31)+((this.sequenceNumber == null)? 0 :this.sequenceNumber.hashCode()));
        result = ((result* 31)+((this.program == null)? 0 :this.program.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.categoryCode == null)? 0 :this.categoryCode.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.collCode == null)? 0 :this.collCode.hashCode()));
        result = ((result* 31)+((this.termCode == null)? 0 :this.termCode.hashCode()));
        result = ((result* 31)+((this.casvDesc == null)? 0 :this.casvDesc.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ComplementaryActivitiesSubmissionInquiry100QapiPost) == false) {
            return false;
        }
        ComplementaryActivitiesSubmissionInquiry100QapiPost rhs = ((ComplementaryActivitiesSubmissionInquiry100QapiPost) other);
        return ((((((((((this.activityCode == rhs.activityCode)||((this.activityCode!= null)&&this.activityCode.equals(rhs.activityCode)))&&((this.sequenceNumber == rhs.sequenceNumber)||((this.sequenceNumber!= null)&&this.sequenceNumber.equals(rhs.sequenceNumber))))&&((this.program == rhs.program)||((this.program!= null)&&this.program.equals(rhs.program))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.categoryCode == rhs.categoryCode)||((this.categoryCode!= null)&&this.categoryCode.equals(rhs.categoryCode))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.collCode == rhs.collCode)||((this.collCode!= null)&&this.collCode.equals(rhs.collCode))))&&((this.termCode == rhs.termCode)||((this.termCode!= null)&&this.termCode.equals(rhs.termCode))))&&((this.casvDesc == rhs.casvDesc)||((this.casvDesc!= null)&&this.casvDesc.equals(rhs.casvDesc))));
    }

}
