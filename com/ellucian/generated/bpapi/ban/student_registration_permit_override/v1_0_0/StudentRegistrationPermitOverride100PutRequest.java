
package com.ellucian.generated.bpapi.ban.student_registration_permit_override.v1_0_0;

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
    "criteria.sfrsrpoSeqNumb",
    "crseNumb",
    "criteria.activityDate",
    "criteria.sfrsrpoSubjCode",
    "criteria.sfrsrpoCrn",
    "keyblocTermCode",
    "subjCode",
    "criteria.sfrsrpoCrseNumb",
    "criteria.sfrsrpoRovrCode",
    "rovrCode",
    "keyblocId",
    "crn"
})
@Generated("jsonschema2pojo")
public class StudentRegistrationPermitOverride100PutRequest {

    /**
     * Section
     * <p>
     * Lineage reference object : SFRSRPO_SEQ_NUMB
     * 
     */
    @JsonProperty("criteria.sfrsrpoSeqNumb")
    @JsonPropertyDescription("Lineage reference object : SFRSRPO_SEQ_NUMB")
    private String criteriaSfrsrpoSeqNumb;
    /**
     * Course Number
     * <p>
     * Lineage reference object : SFRSRPO_CRSE_NUMB
     * 
     */
    @JsonProperty("crseNumb")
    @JsonPropertyDescription("Lineage reference object : SFRSRPO_CRSE_NUMB")
    private String crseNumb;
    /**
     * Activity Date
     * <p>
     * Lineage reference object : SFRSRPO_ACTIVITY_DATE
     * 
     */
    @JsonProperty("criteria.activityDate")
    @JsonPropertyDescription("Lineage reference object : SFRSRPO_ACTIVITY_DATE")
    private Date criteriaActivityDate;
    /**
     * Subject
     * <p>
     * Lineage reference object : SFRSRPO_SUBJ_CODE, Lookup lineage reference object : stvsubj
     * 
     */
    @JsonProperty("criteria.sfrsrpoSubjCode")
    @JsonPropertyDescription("Lineage reference object : SFRSRPO_SUBJ_CODE, Lookup lineage reference object : stvsubj")
    private String criteriaSfrsrpoSubjCode;
    /**
     * CRN
     * <p>
     * Lineage reference object : SFRSRPO_CRN
     * 
     */
    @JsonProperty("criteria.sfrsrpoCrn")
    @JsonPropertyDescription("Lineage reference object : SFRSRPO_CRN")
    private String criteriaSfrsrpoCrn;
    /**
     * Term
     * <p>
     * Lineage reference object : keyblocTermCode, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("keyblocTermCode")
    @JsonPropertyDescription("Lineage reference object : keyblocTermCode, Lookup lineage reference object : stvterm")
    private String keyblocTermCode;
    /**
     * Subject
     * <p>
     * Lineage reference object : SFRSRPO_SUBJ_CODE, Lookup lineage reference object : stvsubj
     * 
     */
    @JsonProperty("subjCode")
    @JsonPropertyDescription("Lineage reference object : SFRSRPO_SUBJ_CODE, Lookup lineage reference object : stvsubj")
    private String subjCode;
    /**
     * Course Number
     * <p>
     * Lineage reference object : SFRSRPO_CRSE_NUMB
     * 
     */
    @JsonProperty("criteria.sfrsrpoCrseNumb")
    @JsonPropertyDescription("Lineage reference object : SFRSRPO_CRSE_NUMB")
    private String criteriaSfrsrpoCrseNumb;
    /**
     * Permit
     * <p>
     * Lineage reference object : SFRSRPO_ROVR_CODE, Lookup lineage reference object : stvrovr,sfrrovr
     * (Required)
     * 
     */
    @JsonProperty("criteria.sfrsrpoRovrCode")
    @JsonPropertyDescription("Lineage reference object : SFRSRPO_ROVR_CODE, Lookup lineage reference object : stvrovr,sfrrovr")
    private String criteriaSfrsrpoRovrCode;
    /**
     * Permit
     * <p>
     * Lineage reference object : SFRSRPO_ROVR_CODE, Lookup lineage reference object : stvrovr,sfrrovr
     * (Required)
     * 
     */
    @JsonProperty("rovrCode")
    @JsonPropertyDescription("Lineage reference object : SFRSRPO_ROVR_CODE, Lookup lineage reference object : stvrovr,sfrrovr")
    private String rovrCode;
    /**
     * ID
     * <p>
     * Lineage reference object : keyblocId
     * 
     */
    @JsonProperty("keyblocId")
    @JsonPropertyDescription("Lineage reference object : keyblocId")
    private String keyblocId;
    /**
     * CRN
     * <p>
     * Lineage reference object : SFRSRPO_CRN
     * 
     */
    @JsonProperty("crn")
    @JsonPropertyDescription("Lineage reference object : SFRSRPO_CRN")
    private String crn;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Section
     * <p>
     * Lineage reference object : SFRSRPO_SEQ_NUMB
     * 
     */
    @JsonProperty("criteria.sfrsrpoSeqNumb")
    public String getCriteriaSfrsrpoSeqNumb() {
        return criteriaSfrsrpoSeqNumb;
    }

    /**
     * Section
     * <p>
     * Lineage reference object : SFRSRPO_SEQ_NUMB
     * 
     */
    @JsonProperty("criteria.sfrsrpoSeqNumb")
    public void setCriteriaSfrsrpoSeqNumb(String criteriaSfrsrpoSeqNumb) {
        this.criteriaSfrsrpoSeqNumb = criteriaSfrsrpoSeqNumb;
    }

    public StudentRegistrationPermitOverride100PutRequest withCriteriaSfrsrpoSeqNumb(String criteriaSfrsrpoSeqNumb) {
        this.criteriaSfrsrpoSeqNumb = criteriaSfrsrpoSeqNumb;
        return this;
    }

    /**
     * Course Number
     * <p>
     * Lineage reference object : SFRSRPO_CRSE_NUMB
     * 
     */
    @JsonProperty("crseNumb")
    public String getCrseNumb() {
        return crseNumb;
    }

    /**
     * Course Number
     * <p>
     * Lineage reference object : SFRSRPO_CRSE_NUMB
     * 
     */
    @JsonProperty("crseNumb")
    public void setCrseNumb(String crseNumb) {
        this.crseNumb = crseNumb;
    }

    public StudentRegistrationPermitOverride100PutRequest withCrseNumb(String crseNumb) {
        this.crseNumb = crseNumb;
        return this;
    }

    /**
     * Activity Date
     * <p>
     * Lineage reference object : SFRSRPO_ACTIVITY_DATE
     * 
     */
    @JsonProperty("criteria.activityDate")
    public Date getCriteriaActivityDate() {
        return criteriaActivityDate;
    }

    /**
     * Activity Date
     * <p>
     * Lineage reference object : SFRSRPO_ACTIVITY_DATE
     * 
     */
    @JsonProperty("criteria.activityDate")
    public void setCriteriaActivityDate(Date criteriaActivityDate) {
        this.criteriaActivityDate = criteriaActivityDate;
    }

    public StudentRegistrationPermitOverride100PutRequest withCriteriaActivityDate(Date criteriaActivityDate) {
        this.criteriaActivityDate = criteriaActivityDate;
        return this;
    }

    /**
     * Subject
     * <p>
     * Lineage reference object : SFRSRPO_SUBJ_CODE, Lookup lineage reference object : stvsubj
     * 
     */
    @JsonProperty("criteria.sfrsrpoSubjCode")
    public String getCriteriaSfrsrpoSubjCode() {
        return criteriaSfrsrpoSubjCode;
    }

    /**
     * Subject
     * <p>
     * Lineage reference object : SFRSRPO_SUBJ_CODE, Lookup lineage reference object : stvsubj
     * 
     */
    @JsonProperty("criteria.sfrsrpoSubjCode")
    public void setCriteriaSfrsrpoSubjCode(String criteriaSfrsrpoSubjCode) {
        this.criteriaSfrsrpoSubjCode = criteriaSfrsrpoSubjCode;
    }

    public StudentRegistrationPermitOverride100PutRequest withCriteriaSfrsrpoSubjCode(String criteriaSfrsrpoSubjCode) {
        this.criteriaSfrsrpoSubjCode = criteriaSfrsrpoSubjCode;
        return this;
    }

    /**
     * CRN
     * <p>
     * Lineage reference object : SFRSRPO_CRN
     * 
     */
    @JsonProperty("criteria.sfrsrpoCrn")
    public String getCriteriaSfrsrpoCrn() {
        return criteriaSfrsrpoCrn;
    }

    /**
     * CRN
     * <p>
     * Lineage reference object : SFRSRPO_CRN
     * 
     */
    @JsonProperty("criteria.sfrsrpoCrn")
    public void setCriteriaSfrsrpoCrn(String criteriaSfrsrpoCrn) {
        this.criteriaSfrsrpoCrn = criteriaSfrsrpoCrn;
    }

    public StudentRegistrationPermitOverride100PutRequest withCriteriaSfrsrpoCrn(String criteriaSfrsrpoCrn) {
        this.criteriaSfrsrpoCrn = criteriaSfrsrpoCrn;
        return this;
    }

    /**
     * Term
     * <p>
     * Lineage reference object : keyblocTermCode, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("keyblocTermCode")
    public String getKeyblocTermCode() {
        return keyblocTermCode;
    }

    /**
     * Term
     * <p>
     * Lineage reference object : keyblocTermCode, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("keyblocTermCode")
    public void setKeyblocTermCode(String keyblocTermCode) {
        this.keyblocTermCode = keyblocTermCode;
    }

    public StudentRegistrationPermitOverride100PutRequest withKeyblocTermCode(String keyblocTermCode) {
        this.keyblocTermCode = keyblocTermCode;
        return this;
    }

    /**
     * Subject
     * <p>
     * Lineage reference object : SFRSRPO_SUBJ_CODE, Lookup lineage reference object : stvsubj
     * 
     */
    @JsonProperty("subjCode")
    public String getSubjCode() {
        return subjCode;
    }

    /**
     * Subject
     * <p>
     * Lineage reference object : SFRSRPO_SUBJ_CODE, Lookup lineage reference object : stvsubj
     * 
     */
    @JsonProperty("subjCode")
    public void setSubjCode(String subjCode) {
        this.subjCode = subjCode;
    }

    public StudentRegistrationPermitOverride100PutRequest withSubjCode(String subjCode) {
        this.subjCode = subjCode;
        return this;
    }

    /**
     * Course Number
     * <p>
     * Lineage reference object : SFRSRPO_CRSE_NUMB
     * 
     */
    @JsonProperty("criteria.sfrsrpoCrseNumb")
    public String getCriteriaSfrsrpoCrseNumb() {
        return criteriaSfrsrpoCrseNumb;
    }

    /**
     * Course Number
     * <p>
     * Lineage reference object : SFRSRPO_CRSE_NUMB
     * 
     */
    @JsonProperty("criteria.sfrsrpoCrseNumb")
    public void setCriteriaSfrsrpoCrseNumb(String criteriaSfrsrpoCrseNumb) {
        this.criteriaSfrsrpoCrseNumb = criteriaSfrsrpoCrseNumb;
    }

    public StudentRegistrationPermitOverride100PutRequest withCriteriaSfrsrpoCrseNumb(String criteriaSfrsrpoCrseNumb) {
        this.criteriaSfrsrpoCrseNumb = criteriaSfrsrpoCrseNumb;
        return this;
    }

    /**
     * Permit
     * <p>
     * Lineage reference object : SFRSRPO_ROVR_CODE, Lookup lineage reference object : stvrovr,sfrrovr
     * (Required)
     * 
     */
    @JsonProperty("criteria.sfrsrpoRovrCode")
    public String getCriteriaSfrsrpoRovrCode() {
        return criteriaSfrsrpoRovrCode;
    }

    /**
     * Permit
     * <p>
     * Lineage reference object : SFRSRPO_ROVR_CODE, Lookup lineage reference object : stvrovr,sfrrovr
     * (Required)
     * 
     */
    @JsonProperty("criteria.sfrsrpoRovrCode")
    public void setCriteriaSfrsrpoRovrCode(String criteriaSfrsrpoRovrCode) {
        this.criteriaSfrsrpoRovrCode = criteriaSfrsrpoRovrCode;
    }

    public StudentRegistrationPermitOverride100PutRequest withCriteriaSfrsrpoRovrCode(String criteriaSfrsrpoRovrCode) {
        this.criteriaSfrsrpoRovrCode = criteriaSfrsrpoRovrCode;
        return this;
    }

    /**
     * Permit
     * <p>
     * Lineage reference object : SFRSRPO_ROVR_CODE, Lookup lineage reference object : stvrovr,sfrrovr
     * (Required)
     * 
     */
    @JsonProperty("rovrCode")
    public String getRovrCode() {
        return rovrCode;
    }

    /**
     * Permit
     * <p>
     * Lineage reference object : SFRSRPO_ROVR_CODE, Lookup lineage reference object : stvrovr,sfrrovr
     * (Required)
     * 
     */
    @JsonProperty("rovrCode")
    public void setRovrCode(String rovrCode) {
        this.rovrCode = rovrCode;
    }

    public StudentRegistrationPermitOverride100PutRequest withRovrCode(String rovrCode) {
        this.rovrCode = rovrCode;
        return this;
    }

    /**
     * ID
     * <p>
     * Lineage reference object : keyblocId
     * 
     */
    @JsonProperty("keyblocId")
    public String getKeyblocId() {
        return keyblocId;
    }

    /**
     * ID
     * <p>
     * Lineage reference object : keyblocId
     * 
     */
    @JsonProperty("keyblocId")
    public void setKeyblocId(String keyblocId) {
        this.keyblocId = keyblocId;
    }

    public StudentRegistrationPermitOverride100PutRequest withKeyblocId(String keyblocId) {
        this.keyblocId = keyblocId;
        return this;
    }

    /**
     * CRN
     * <p>
     * Lineage reference object : SFRSRPO_CRN
     * 
     */
    @JsonProperty("crn")
    public String getCrn() {
        return crn;
    }

    /**
     * CRN
     * <p>
     * Lineage reference object : SFRSRPO_CRN
     * 
     */
    @JsonProperty("crn")
    public void setCrn(String crn) {
        this.crn = crn;
    }

    public StudentRegistrationPermitOverride100PutRequest withCrn(String crn) {
        this.crn = crn;
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

    public StudentRegistrationPermitOverride100PutRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(StudentRegistrationPermitOverride100PutRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("criteriaSfrsrpoSeqNumb");
        sb.append('=');
        sb.append(((this.criteriaSfrsrpoSeqNumb == null)?"<null>":this.criteriaSfrsrpoSeqNumb));
        sb.append(',');
        sb.append("crseNumb");
        sb.append('=');
        sb.append(((this.crseNumb == null)?"<null>":this.crseNumb));
        sb.append(',');
        sb.append("criteriaActivityDate");
        sb.append('=');
        sb.append(((this.criteriaActivityDate == null)?"<null>":this.criteriaActivityDate));
        sb.append(',');
        sb.append("criteriaSfrsrpoSubjCode");
        sb.append('=');
        sb.append(((this.criteriaSfrsrpoSubjCode == null)?"<null>":this.criteriaSfrsrpoSubjCode));
        sb.append(',');
        sb.append("criteriaSfrsrpoCrn");
        sb.append('=');
        sb.append(((this.criteriaSfrsrpoCrn == null)?"<null>":this.criteriaSfrsrpoCrn));
        sb.append(',');
        sb.append("keyblocTermCode");
        sb.append('=');
        sb.append(((this.keyblocTermCode == null)?"<null>":this.keyblocTermCode));
        sb.append(',');
        sb.append("subjCode");
        sb.append('=');
        sb.append(((this.subjCode == null)?"<null>":this.subjCode));
        sb.append(',');
        sb.append("criteriaSfrsrpoCrseNumb");
        sb.append('=');
        sb.append(((this.criteriaSfrsrpoCrseNumb == null)?"<null>":this.criteriaSfrsrpoCrseNumb));
        sb.append(',');
        sb.append("criteriaSfrsrpoRovrCode");
        sb.append('=');
        sb.append(((this.criteriaSfrsrpoRovrCode == null)?"<null>":this.criteriaSfrsrpoRovrCode));
        sb.append(',');
        sb.append("rovrCode");
        sb.append('=');
        sb.append(((this.rovrCode == null)?"<null>":this.rovrCode));
        sb.append(',');
        sb.append("keyblocId");
        sb.append('=');
        sb.append(((this.keyblocId == null)?"<null>":this.keyblocId));
        sb.append(',');
        sb.append("crn");
        sb.append('=');
        sb.append(((this.crn == null)?"<null>":this.crn));
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
        result = ((result* 31)+((this.keyblocTermCode == null)? 0 :this.keyblocTermCode.hashCode()));
        result = ((result* 31)+((this.subjCode == null)? 0 :this.subjCode.hashCode()));
        result = ((result* 31)+((this.criteriaSfrsrpoSeqNumb == null)? 0 :this.criteriaSfrsrpoSeqNumb.hashCode()));
        result = ((result* 31)+((this.crseNumb == null)? 0 :this.crseNumb.hashCode()));
        result = ((result* 31)+((this.criteriaSfrsrpoSubjCode == null)? 0 :this.criteriaSfrsrpoSubjCode.hashCode()));
        result = ((result* 31)+((this.criteriaSfrsrpoRovrCode == null)? 0 :this.criteriaSfrsrpoRovrCode.hashCode()));
        result = ((result* 31)+((this.criteriaSfrsrpoCrseNumb == null)? 0 :this.criteriaSfrsrpoCrseNumb.hashCode()));
        result = ((result* 31)+((this.rovrCode == null)? 0 :this.rovrCode.hashCode()));
        result = ((result* 31)+((this.criteriaSfrsrpoCrn == null)? 0 :this.criteriaSfrsrpoCrn.hashCode()));
        result = ((result* 31)+((this.keyblocId == null)? 0 :this.keyblocId.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.crn == null)? 0 :this.crn.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof StudentRegistrationPermitOverride100PutRequest) == false) {
            return false;
        }
        StudentRegistrationPermitOverride100PutRequest rhs = ((StudentRegistrationPermitOverride100PutRequest) other);
        return ((((((((((((((this.criteriaActivityDate == rhs.criteriaActivityDate)||((this.criteriaActivityDate!= null)&&this.criteriaActivityDate.equals(rhs.criteriaActivityDate)))&&((this.keyblocTermCode == rhs.keyblocTermCode)||((this.keyblocTermCode!= null)&&this.keyblocTermCode.equals(rhs.keyblocTermCode))))&&((this.subjCode == rhs.subjCode)||((this.subjCode!= null)&&this.subjCode.equals(rhs.subjCode))))&&((this.criteriaSfrsrpoSeqNumb == rhs.criteriaSfrsrpoSeqNumb)||((this.criteriaSfrsrpoSeqNumb!= null)&&this.criteriaSfrsrpoSeqNumb.equals(rhs.criteriaSfrsrpoSeqNumb))))&&((this.crseNumb == rhs.crseNumb)||((this.crseNumb!= null)&&this.crseNumb.equals(rhs.crseNumb))))&&((this.criteriaSfrsrpoSubjCode == rhs.criteriaSfrsrpoSubjCode)||((this.criteriaSfrsrpoSubjCode!= null)&&this.criteriaSfrsrpoSubjCode.equals(rhs.criteriaSfrsrpoSubjCode))))&&((this.criteriaSfrsrpoRovrCode == rhs.criteriaSfrsrpoRovrCode)||((this.criteriaSfrsrpoRovrCode!= null)&&this.criteriaSfrsrpoRovrCode.equals(rhs.criteriaSfrsrpoRovrCode))))&&((this.criteriaSfrsrpoCrseNumb == rhs.criteriaSfrsrpoCrseNumb)||((this.criteriaSfrsrpoCrseNumb!= null)&&this.criteriaSfrsrpoCrseNumb.equals(rhs.criteriaSfrsrpoCrseNumb))))&&((this.rovrCode == rhs.rovrCode)||((this.rovrCode!= null)&&this.rovrCode.equals(rhs.rovrCode))))&&((this.criteriaSfrsrpoCrn == rhs.criteriaSfrsrpoCrn)||((this.criteriaSfrsrpoCrn!= null)&&this.criteriaSfrsrpoCrn.equals(rhs.criteriaSfrsrpoCrn))))&&((this.keyblocId == rhs.keyblocId)||((this.keyblocId!= null)&&this.keyblocId.equals(rhs.keyblocId))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.crn == rhs.crn)||((this.crn!= null)&&this.crn.equals(rhs.crn))));
    }

}
