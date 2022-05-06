
package com.ellucian.generated.bpapi.ban.section_comment.v1_0_0;

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
    "criteria.textNarrative",
    "criteria.activityDate",
    "ssasectTermCode",
    "criteria.ssbdescActivityDate",
    "ssasectCrn",
    "criteria.text",
    "text",
    "textNarrative"
})
@Generated("jsonschema2pojo")
public class SectionComment100PutRequest {

    /**
     * Section Long Text
     * <p>
     * Lineage reference object : SSBDESC_TEXT_NARRATIVE
     * 
     */
    @JsonProperty("criteria.textNarrative")
    @JsonPropertyDescription("Lineage reference object : SSBDESC_TEXT_NARRATIVE")
    private Object criteriaTextNarrative;
    /**
     * Lineage reference object : SSRTEXT_ACTIVITY_DATE
     * 
     */
    @JsonProperty("criteria.activityDate")
    @JsonPropertyDescription("Lineage reference object : SSRTEXT_ACTIVITY_DATE")
    private Date criteriaActivityDate;
    /**
     * Term
     * <p>
     * Lineage reference object : ssasectTermCode, Lookup lineage reference object : stvterm
     * (Required)
     * 
     */
    @JsonProperty("ssasectTermCode")
    @JsonPropertyDescription("Lineage reference object : ssasectTermCode, Lookup lineage reference object : stvterm")
    private Object ssasectTermCode;
    /**
     * Activity Date
     * <p>
     * Lineage reference object : SSBDESC_ACTIVITY_DATE
     * 
     */
    @JsonProperty("criteria.ssbdescActivityDate")
    @JsonPropertyDescription("Lineage reference object : SSBDESC_ACTIVITY_DATE")
    private Date criteriaSsbdescActivityDate;
    /**
     * CRN
     * <p>
     * Lineage reference object : ssasectCrn
     * 
     */
    @JsonProperty("ssasectCrn")
    @JsonPropertyDescription("Lineage reference object : ssasectCrn")
    private Object ssasectCrn;
    /**
     * Section Text
     * <p>
     * Lineage reference object : SSRTEXT_TEXT
     * (Required)
     * 
     */
    @JsonProperty("criteria.text")
    @JsonPropertyDescription("Lineage reference object : SSRTEXT_TEXT")
    private String criteriaText;
    /**
     * Section Text
     * <p>
     * Lineage reference object : SSRTEXT_TEXT
     * (Required)
     * 
     */
    @JsonProperty("text")
    @JsonPropertyDescription("Lineage reference object : SSRTEXT_TEXT")
    private String text;
    /**
     * Section Long Text
     * <p>
     * Lineage reference object : SSBDESC_TEXT_NARRATIVE
     * 
     */
    @JsonProperty("textNarrative")
    @JsonPropertyDescription("Lineage reference object : SSBDESC_TEXT_NARRATIVE")
    private Object textNarrative;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Section Long Text
     * <p>
     * Lineage reference object : SSBDESC_TEXT_NARRATIVE
     * 
     */
    @JsonProperty("criteria.textNarrative")
    public Object getCriteriaTextNarrative() {
        return criteriaTextNarrative;
    }

    /**
     * Section Long Text
     * <p>
     * Lineage reference object : SSBDESC_TEXT_NARRATIVE
     * 
     */
    @JsonProperty("criteria.textNarrative")
    public void setCriteriaTextNarrative(Object criteriaTextNarrative) {
        this.criteriaTextNarrative = criteriaTextNarrative;
    }

    public SectionComment100PutRequest withCriteriaTextNarrative(Object criteriaTextNarrative) {
        this.criteriaTextNarrative = criteriaTextNarrative;
        return this;
    }

    /**
     * Lineage reference object : SSRTEXT_ACTIVITY_DATE
     * 
     */
    @JsonProperty("criteria.activityDate")
    public Date getCriteriaActivityDate() {
        return criteriaActivityDate;
    }

    /**
     * Lineage reference object : SSRTEXT_ACTIVITY_DATE
     * 
     */
    @JsonProperty("criteria.activityDate")
    public void setCriteriaActivityDate(Date criteriaActivityDate) {
        this.criteriaActivityDate = criteriaActivityDate;
    }

    public SectionComment100PutRequest withCriteriaActivityDate(Date criteriaActivityDate) {
        this.criteriaActivityDate = criteriaActivityDate;
        return this;
    }

    /**
     * Term
     * <p>
     * Lineage reference object : ssasectTermCode, Lookup lineage reference object : stvterm
     * (Required)
     * 
     */
    @JsonProperty("ssasectTermCode")
    public Object getSsasectTermCode() {
        return ssasectTermCode;
    }

    /**
     * Term
     * <p>
     * Lineage reference object : ssasectTermCode, Lookup lineage reference object : stvterm
     * (Required)
     * 
     */
    @JsonProperty("ssasectTermCode")
    public void setSsasectTermCode(Object ssasectTermCode) {
        this.ssasectTermCode = ssasectTermCode;
    }

    public SectionComment100PutRequest withSsasectTermCode(Object ssasectTermCode) {
        this.ssasectTermCode = ssasectTermCode;
        return this;
    }

    /**
     * Activity Date
     * <p>
     * Lineage reference object : SSBDESC_ACTIVITY_DATE
     * 
     */
    @JsonProperty("criteria.ssbdescActivityDate")
    public Date getCriteriaSsbdescActivityDate() {
        return criteriaSsbdescActivityDate;
    }

    /**
     * Activity Date
     * <p>
     * Lineage reference object : SSBDESC_ACTIVITY_DATE
     * 
     */
    @JsonProperty("criteria.ssbdescActivityDate")
    public void setCriteriaSsbdescActivityDate(Date criteriaSsbdescActivityDate) {
        this.criteriaSsbdescActivityDate = criteriaSsbdescActivityDate;
    }

    public SectionComment100PutRequest withCriteriaSsbdescActivityDate(Date criteriaSsbdescActivityDate) {
        this.criteriaSsbdescActivityDate = criteriaSsbdescActivityDate;
        return this;
    }

    /**
     * CRN
     * <p>
     * Lineage reference object : ssasectCrn
     * 
     */
    @JsonProperty("ssasectCrn")
    public Object getSsasectCrn() {
        return ssasectCrn;
    }

    /**
     * CRN
     * <p>
     * Lineage reference object : ssasectCrn
     * 
     */
    @JsonProperty("ssasectCrn")
    public void setSsasectCrn(Object ssasectCrn) {
        this.ssasectCrn = ssasectCrn;
    }

    public SectionComment100PutRequest withSsasectCrn(Object ssasectCrn) {
        this.ssasectCrn = ssasectCrn;
        return this;
    }

    /**
     * Section Text
     * <p>
     * Lineage reference object : SSRTEXT_TEXT
     * (Required)
     * 
     */
    @JsonProperty("criteria.text")
    public String getCriteriaText() {
        return criteriaText;
    }

    /**
     * Section Text
     * <p>
     * Lineage reference object : SSRTEXT_TEXT
     * (Required)
     * 
     */
    @JsonProperty("criteria.text")
    public void setCriteriaText(String criteriaText) {
        this.criteriaText = criteriaText;
    }

    public SectionComment100PutRequest withCriteriaText(String criteriaText) {
        this.criteriaText = criteriaText;
        return this;
    }

    /**
     * Section Text
     * <p>
     * Lineage reference object : SSRTEXT_TEXT
     * (Required)
     * 
     */
    @JsonProperty("text")
    public String getText() {
        return text;
    }

    /**
     * Section Text
     * <p>
     * Lineage reference object : SSRTEXT_TEXT
     * (Required)
     * 
     */
    @JsonProperty("text")
    public void setText(String text) {
        this.text = text;
    }

    public SectionComment100PutRequest withText(String text) {
        this.text = text;
        return this;
    }

    /**
     * Section Long Text
     * <p>
     * Lineage reference object : SSBDESC_TEXT_NARRATIVE
     * 
     */
    @JsonProperty("textNarrative")
    public Object getTextNarrative() {
        return textNarrative;
    }

    /**
     * Section Long Text
     * <p>
     * Lineage reference object : SSBDESC_TEXT_NARRATIVE
     * 
     */
    @JsonProperty("textNarrative")
    public void setTextNarrative(Object textNarrative) {
        this.textNarrative = textNarrative;
    }

    public SectionComment100PutRequest withTextNarrative(Object textNarrative) {
        this.textNarrative = textNarrative;
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

    public SectionComment100PutRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(SectionComment100PutRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("criteriaTextNarrative");
        sb.append('=');
        sb.append(((this.criteriaTextNarrative == null)?"<null>":this.criteriaTextNarrative));
        sb.append(',');
        sb.append("criteriaActivityDate");
        sb.append('=');
        sb.append(((this.criteriaActivityDate == null)?"<null>":this.criteriaActivityDate));
        sb.append(',');
        sb.append("ssasectTermCode");
        sb.append('=');
        sb.append(((this.ssasectTermCode == null)?"<null>":this.ssasectTermCode));
        sb.append(',');
        sb.append("criteriaSsbdescActivityDate");
        sb.append('=');
        sb.append(((this.criteriaSsbdescActivityDate == null)?"<null>":this.criteriaSsbdescActivityDate));
        sb.append(',');
        sb.append("ssasectCrn");
        sb.append('=');
        sb.append(((this.ssasectCrn == null)?"<null>":this.ssasectCrn));
        sb.append(',');
        sb.append("criteriaText");
        sb.append('=');
        sb.append(((this.criteriaText == null)?"<null>":this.criteriaText));
        sb.append(',');
        sb.append("text");
        sb.append('=');
        sb.append(((this.text == null)?"<null>":this.text));
        sb.append(',');
        sb.append("textNarrative");
        sb.append('=');
        sb.append(((this.textNarrative == null)?"<null>":this.textNarrative));
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
        result = ((result* 31)+((this.criteriaActivityDate == null)? 0 :this.criteriaActivityDate.hashCode()));
        result = ((result* 31)+((this.criteriaSsbdescActivityDate == null)? 0 :this.criteriaSsbdescActivityDate.hashCode()));
        result = ((result* 31)+((this.ssasectTermCode == null)? 0 :this.ssasectTermCode.hashCode()));
        result = ((result* 31)+((this.ssasectCrn == null)? 0 :this.ssasectCrn.hashCode()));
        result = ((result* 31)+((this.criteriaText == null)? 0 :this.criteriaText.hashCode()));
        result = ((result* 31)+((this.criteriaTextNarrative == null)? 0 :this.criteriaTextNarrative.hashCode()));
        result = ((result* 31)+((this.text == null)? 0 :this.text.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.textNarrative == null)? 0 :this.textNarrative.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof SectionComment100PutRequest) == false) {
            return false;
        }
        SectionComment100PutRequest rhs = ((SectionComment100PutRequest) other);
        return ((((((((((this.criteriaActivityDate == rhs.criteriaActivityDate)||((this.criteriaActivityDate!= null)&&this.criteriaActivityDate.equals(rhs.criteriaActivityDate)))&&((this.criteriaSsbdescActivityDate == rhs.criteriaSsbdescActivityDate)||((this.criteriaSsbdescActivityDate!= null)&&this.criteriaSsbdescActivityDate.equals(rhs.criteriaSsbdescActivityDate))))&&((this.ssasectTermCode == rhs.ssasectTermCode)||((this.ssasectTermCode!= null)&&this.ssasectTermCode.equals(rhs.ssasectTermCode))))&&((this.ssasectCrn == rhs.ssasectCrn)||((this.ssasectCrn!= null)&&this.ssasectCrn.equals(rhs.ssasectCrn))))&&((this.criteriaText == rhs.criteriaText)||((this.criteriaText!= null)&&this.criteriaText.equals(rhs.criteriaText))))&&((this.criteriaTextNarrative == rhs.criteriaTextNarrative)||((this.criteriaTextNarrative!= null)&&this.criteriaTextNarrative.equals(rhs.criteriaTextNarrative))))&&((this.text == rhs.text)||((this.text!= null)&&this.text.equals(rhs.text))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.textNarrative == rhs.textNarrative)||((this.textNarrative!= null)&&this.textNarrative.equals(rhs.textNarrative))));
    }

}
