
package com.ellucian.generated.bpapi.ban.medical_information.v1_0_0;

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
    "criteria.mdeqCode",
    "criteria.mediDescription",
    "criteria.activityDate",
    "criteria.userId",
    "criteria.mediCode",
    "criteria.disaDescription",
    "mediCode",
    "spsrCode",
    "criteria.mdeqDescription",
    "mediCodeDate",
    "onsetAge",
    "criteria.mediCodeDate",
    "mdeqCode",
    "disbInd",
    "criteria.disbInd",
    "disaCode",
    "criteria.disaCode",
    "criteria.spsrCode",
    "comment",
    "id",
    "criteria.spsrDescription",
    "criteria.onsetAge",
    "criteria.comment"
})
@Generated("jsonschema2pojo")
public class MedicalInformation100PutRequest {

    /**
     * Equipment Code
     * <p>
     * Lineage reference object : SPRMEDI_MDEQ_CODE, Lookup lineage reference object : stvmdeq
     * 
     */
    @JsonProperty("criteria.mdeqCode")
    @JsonPropertyDescription("Lineage reference object : SPRMEDI_MDEQ_CODE, Lookup lineage reference object : stvmdeq")
    private String criteriaMdeqCode;
    @JsonProperty("criteria.mediDescription")
    private String criteriaMediDescription;
    /**
     * Activity Date
     * <p>
     * Lineage reference object : SPRMEDI_ACTIVITY_DATE
     * 
     */
    @JsonProperty("criteria.activityDate")
    @JsonPropertyDescription("Lineage reference object : SPRMEDI_ACTIVITY_DATE")
    private Date criteriaActivityDate;
    /**
     * User ID
     * <p>
     * Lineage reference object : SPRMEDI_USER_ID
     * 
     */
    @JsonProperty("criteria.userId")
    @JsonPropertyDescription("Lineage reference object : SPRMEDI_USER_ID")
    private String criteriaUserId;
    /**
     * Medical Code
     * <p>
     * Lineage reference object : SPRMEDI_MEDI_CODE, Lookup lineage reference object : stvmedi
     * (Required)
     * 
     */
    @JsonProperty("criteria.mediCode")
    @JsonPropertyDescription("Lineage reference object : SPRMEDI_MEDI_CODE, Lookup lineage reference object : stvmedi")
    private String criteriaMediCode;
    @JsonProperty("criteria.disaDescription")
    private String criteriaDisaDescription;
    /**
     * Medical Code
     * <p>
     * Lineage reference object : SPRMEDI_MEDI_CODE, Lookup lineage reference object : stvmedi
     * (Required)
     * 
     */
    @JsonProperty("mediCode")
    @JsonPropertyDescription("Lineage reference object : SPRMEDI_MEDI_CODE, Lookup lineage reference object : stvmedi")
    private String mediCode;
    /**
     * Disability Service
     * <p>
     * Lineage reference object : SPRMEDI_SPSR_CODE, Lookup lineage reference object : stvspsr
     * 
     */
    @JsonProperty("spsrCode")
    @JsonPropertyDescription("Lineage reference object : SPRMEDI_SPSR_CODE, Lookup lineage reference object : stvspsr")
    private String spsrCode;
    @JsonProperty("criteria.mdeqDescription")
    private String criteriaMdeqDescription;
    /**
     * Medical Date
     * <p>
     * Lineage reference object : SPRMEDI_MEDI_CODE_DATE
     * 
     */
    @JsonProperty("mediCodeDate")
    @JsonPropertyDescription("Lineage reference object : SPRMEDI_MEDI_CODE_DATE")
    private Date mediCodeDate;
    /**
     * Disability Onset Age
     * <p>
     * Lineage reference object : SPRMEDI_ONSET_AGE
     * 
     */
    @JsonProperty("onsetAge")
    @JsonPropertyDescription("Lineage reference object : SPRMEDI_ONSET_AGE")
    private Double onsetAge;
    /**
     * Medical Date
     * <p>
     * Lineage reference object : SPRMEDI_MEDI_CODE_DATE
     * 
     */
    @JsonProperty("criteria.mediCodeDate")
    @JsonPropertyDescription("Lineage reference object : SPRMEDI_MEDI_CODE_DATE")
    private Date criteriaMediCodeDate;
    /**
     * Equipment Code
     * <p>
     * Lineage reference object : SPRMEDI_MDEQ_CODE, Lookup lineage reference object : stvmdeq
     * 
     */
    @JsonProperty("mdeqCode")
    @JsonPropertyDescription("Lineage reference object : SPRMEDI_MDEQ_CODE, Lookup lineage reference object : stvmdeq")
    private String mdeqCode;
    /**
     * Primary Disability
     * <p>
     * Lineage reference object : SPRMEDI_DISB_IND
     * 
     */
    @JsonProperty("disbInd")
    @JsonPropertyDescription("Lineage reference object : SPRMEDI_DISB_IND")
    private String disbInd;
    /**
     * Primary Disability
     * <p>
     * Lineage reference object : SPRMEDI_DISB_IND
     * 
     */
    @JsonProperty("criteria.disbInd")
    @JsonPropertyDescription("Lineage reference object : SPRMEDI_DISB_IND")
    private String criteriaDisbInd;
    /**
     * Disability Type
     * <p>
     * Lineage reference object : SPRMEDI_DISA_CODE, Lookup lineage reference object : stvdisa
     * 
     */
    @JsonProperty("disaCode")
    @JsonPropertyDescription("Lineage reference object : SPRMEDI_DISA_CODE, Lookup lineage reference object : stvdisa")
    private String disaCode;
    /**
     * Disability Type
     * <p>
     * Lineage reference object : SPRMEDI_DISA_CODE, Lookup lineage reference object : stvdisa
     * 
     */
    @JsonProperty("criteria.disaCode")
    @JsonPropertyDescription("Lineage reference object : SPRMEDI_DISA_CODE, Lookup lineage reference object : stvdisa")
    private String criteriaDisaCode;
    /**
     * Disability Service
     * <p>
     * Lineage reference object : SPRMEDI_SPSR_CODE, Lookup lineage reference object : stvspsr
     * 
     */
    @JsonProperty("criteria.spsrCode")
    @JsonPropertyDescription("Lineage reference object : SPRMEDI_SPSR_CODE, Lookup lineage reference object : stvspsr")
    private String criteriaSpsrCode;
    /**
     * Comment
     * <p>
     * Lineage reference object : SPRMEDI_COMMENT
     * 
     */
    @JsonProperty("comment")
    @JsonPropertyDescription("Lineage reference object : SPRMEDI_COMMENT")
    private String comment;
    /**
     * ID
     * <p>
     * Lineage reference object : id
     * 
     */
    @JsonProperty("id")
    @JsonPropertyDescription("Lineage reference object : id")
    private Object id;
    @JsonProperty("criteria.spsrDescription")
    private String criteriaSpsrDescription;
    /**
     * Disability Onset Age
     * <p>
     * Lineage reference object : SPRMEDI_ONSET_AGE
     * 
     */
    @JsonProperty("criteria.onsetAge")
    @JsonPropertyDescription("Lineage reference object : SPRMEDI_ONSET_AGE")
    private Double criteriaOnsetAge;
    /**
     * Comment
     * <p>
     * Lineage reference object : SPRMEDI_COMMENT
     * 
     */
    @JsonProperty("criteria.comment")
    @JsonPropertyDescription("Lineage reference object : SPRMEDI_COMMENT")
    private String criteriaComment;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Equipment Code
     * <p>
     * Lineage reference object : SPRMEDI_MDEQ_CODE, Lookup lineage reference object : stvmdeq
     * 
     */
    @JsonProperty("criteria.mdeqCode")
    public String getCriteriaMdeqCode() {
        return criteriaMdeqCode;
    }

    /**
     * Equipment Code
     * <p>
     * Lineage reference object : SPRMEDI_MDEQ_CODE, Lookup lineage reference object : stvmdeq
     * 
     */
    @JsonProperty("criteria.mdeqCode")
    public void setCriteriaMdeqCode(String criteriaMdeqCode) {
        this.criteriaMdeqCode = criteriaMdeqCode;
    }

    public MedicalInformation100PutRequest withCriteriaMdeqCode(String criteriaMdeqCode) {
        this.criteriaMdeqCode = criteriaMdeqCode;
        return this;
    }

    @JsonProperty("criteria.mediDescription")
    public String getCriteriaMediDescription() {
        return criteriaMediDescription;
    }

    @JsonProperty("criteria.mediDescription")
    public void setCriteriaMediDescription(String criteriaMediDescription) {
        this.criteriaMediDescription = criteriaMediDescription;
    }

    public MedicalInformation100PutRequest withCriteriaMediDescription(String criteriaMediDescription) {
        this.criteriaMediDescription = criteriaMediDescription;
        return this;
    }

    /**
     * Activity Date
     * <p>
     * Lineage reference object : SPRMEDI_ACTIVITY_DATE
     * 
     */
    @JsonProperty("criteria.activityDate")
    public Date getCriteriaActivityDate() {
        return criteriaActivityDate;
    }

    /**
     * Activity Date
     * <p>
     * Lineage reference object : SPRMEDI_ACTIVITY_DATE
     * 
     */
    @JsonProperty("criteria.activityDate")
    public void setCriteriaActivityDate(Date criteriaActivityDate) {
        this.criteriaActivityDate = criteriaActivityDate;
    }

    public MedicalInformation100PutRequest withCriteriaActivityDate(Date criteriaActivityDate) {
        this.criteriaActivityDate = criteriaActivityDate;
        return this;
    }

    /**
     * User ID
     * <p>
     * Lineage reference object : SPRMEDI_USER_ID
     * 
     */
    @JsonProperty("criteria.userId")
    public String getCriteriaUserId() {
        return criteriaUserId;
    }

    /**
     * User ID
     * <p>
     * Lineage reference object : SPRMEDI_USER_ID
     * 
     */
    @JsonProperty("criteria.userId")
    public void setCriteriaUserId(String criteriaUserId) {
        this.criteriaUserId = criteriaUserId;
    }

    public MedicalInformation100PutRequest withCriteriaUserId(String criteriaUserId) {
        this.criteriaUserId = criteriaUserId;
        return this;
    }

    /**
     * Medical Code
     * <p>
     * Lineage reference object : SPRMEDI_MEDI_CODE, Lookup lineage reference object : stvmedi
     * (Required)
     * 
     */
    @JsonProperty("criteria.mediCode")
    public String getCriteriaMediCode() {
        return criteriaMediCode;
    }

    /**
     * Medical Code
     * <p>
     * Lineage reference object : SPRMEDI_MEDI_CODE, Lookup lineage reference object : stvmedi
     * (Required)
     * 
     */
    @JsonProperty("criteria.mediCode")
    public void setCriteriaMediCode(String criteriaMediCode) {
        this.criteriaMediCode = criteriaMediCode;
    }

    public MedicalInformation100PutRequest withCriteriaMediCode(String criteriaMediCode) {
        this.criteriaMediCode = criteriaMediCode;
        return this;
    }

    @JsonProperty("criteria.disaDescription")
    public String getCriteriaDisaDescription() {
        return criteriaDisaDescription;
    }

    @JsonProperty("criteria.disaDescription")
    public void setCriteriaDisaDescription(String criteriaDisaDescription) {
        this.criteriaDisaDescription = criteriaDisaDescription;
    }

    public MedicalInformation100PutRequest withCriteriaDisaDescription(String criteriaDisaDescription) {
        this.criteriaDisaDescription = criteriaDisaDescription;
        return this;
    }

    /**
     * Medical Code
     * <p>
     * Lineage reference object : SPRMEDI_MEDI_CODE, Lookup lineage reference object : stvmedi
     * (Required)
     * 
     */
    @JsonProperty("mediCode")
    public String getMediCode() {
        return mediCode;
    }

    /**
     * Medical Code
     * <p>
     * Lineage reference object : SPRMEDI_MEDI_CODE, Lookup lineage reference object : stvmedi
     * (Required)
     * 
     */
    @JsonProperty("mediCode")
    public void setMediCode(String mediCode) {
        this.mediCode = mediCode;
    }

    public MedicalInformation100PutRequest withMediCode(String mediCode) {
        this.mediCode = mediCode;
        return this;
    }

    /**
     * Disability Service
     * <p>
     * Lineage reference object : SPRMEDI_SPSR_CODE, Lookup lineage reference object : stvspsr
     * 
     */
    @JsonProperty("spsrCode")
    public String getSpsrCode() {
        return spsrCode;
    }

    /**
     * Disability Service
     * <p>
     * Lineage reference object : SPRMEDI_SPSR_CODE, Lookup lineage reference object : stvspsr
     * 
     */
    @JsonProperty("spsrCode")
    public void setSpsrCode(String spsrCode) {
        this.spsrCode = spsrCode;
    }

    public MedicalInformation100PutRequest withSpsrCode(String spsrCode) {
        this.spsrCode = spsrCode;
        return this;
    }

    @JsonProperty("criteria.mdeqDescription")
    public String getCriteriaMdeqDescription() {
        return criteriaMdeqDescription;
    }

    @JsonProperty("criteria.mdeqDescription")
    public void setCriteriaMdeqDescription(String criteriaMdeqDescription) {
        this.criteriaMdeqDescription = criteriaMdeqDescription;
    }

    public MedicalInformation100PutRequest withCriteriaMdeqDescription(String criteriaMdeqDescription) {
        this.criteriaMdeqDescription = criteriaMdeqDescription;
        return this;
    }

    /**
     * Medical Date
     * <p>
     * Lineage reference object : SPRMEDI_MEDI_CODE_DATE
     * 
     */
    @JsonProperty("mediCodeDate")
    public Date getMediCodeDate() {
        return mediCodeDate;
    }

    /**
     * Medical Date
     * <p>
     * Lineage reference object : SPRMEDI_MEDI_CODE_DATE
     * 
     */
    @JsonProperty("mediCodeDate")
    public void setMediCodeDate(Date mediCodeDate) {
        this.mediCodeDate = mediCodeDate;
    }

    public MedicalInformation100PutRequest withMediCodeDate(Date mediCodeDate) {
        this.mediCodeDate = mediCodeDate;
        return this;
    }

    /**
     * Disability Onset Age
     * <p>
     * Lineage reference object : SPRMEDI_ONSET_AGE
     * 
     */
    @JsonProperty("onsetAge")
    public Double getOnsetAge() {
        return onsetAge;
    }

    /**
     * Disability Onset Age
     * <p>
     * Lineage reference object : SPRMEDI_ONSET_AGE
     * 
     */
    @JsonProperty("onsetAge")
    public void setOnsetAge(Double onsetAge) {
        this.onsetAge = onsetAge;
    }

    public MedicalInformation100PutRequest withOnsetAge(Double onsetAge) {
        this.onsetAge = onsetAge;
        return this;
    }

    /**
     * Medical Date
     * <p>
     * Lineage reference object : SPRMEDI_MEDI_CODE_DATE
     * 
     */
    @JsonProperty("criteria.mediCodeDate")
    public Date getCriteriaMediCodeDate() {
        return criteriaMediCodeDate;
    }

    /**
     * Medical Date
     * <p>
     * Lineage reference object : SPRMEDI_MEDI_CODE_DATE
     * 
     */
    @JsonProperty("criteria.mediCodeDate")
    public void setCriteriaMediCodeDate(Date criteriaMediCodeDate) {
        this.criteriaMediCodeDate = criteriaMediCodeDate;
    }

    public MedicalInformation100PutRequest withCriteriaMediCodeDate(Date criteriaMediCodeDate) {
        this.criteriaMediCodeDate = criteriaMediCodeDate;
        return this;
    }

    /**
     * Equipment Code
     * <p>
     * Lineage reference object : SPRMEDI_MDEQ_CODE, Lookup lineage reference object : stvmdeq
     * 
     */
    @JsonProperty("mdeqCode")
    public String getMdeqCode() {
        return mdeqCode;
    }

    /**
     * Equipment Code
     * <p>
     * Lineage reference object : SPRMEDI_MDEQ_CODE, Lookup lineage reference object : stvmdeq
     * 
     */
    @JsonProperty("mdeqCode")
    public void setMdeqCode(String mdeqCode) {
        this.mdeqCode = mdeqCode;
    }

    public MedicalInformation100PutRequest withMdeqCode(String mdeqCode) {
        this.mdeqCode = mdeqCode;
        return this;
    }

    /**
     * Primary Disability
     * <p>
     * Lineage reference object : SPRMEDI_DISB_IND
     * 
     */
    @JsonProperty("disbInd")
    public String getDisbInd() {
        return disbInd;
    }

    /**
     * Primary Disability
     * <p>
     * Lineage reference object : SPRMEDI_DISB_IND
     * 
     */
    @JsonProperty("disbInd")
    public void setDisbInd(String disbInd) {
        this.disbInd = disbInd;
    }

    public MedicalInformation100PutRequest withDisbInd(String disbInd) {
        this.disbInd = disbInd;
        return this;
    }

    /**
     * Primary Disability
     * <p>
     * Lineage reference object : SPRMEDI_DISB_IND
     * 
     */
    @JsonProperty("criteria.disbInd")
    public String getCriteriaDisbInd() {
        return criteriaDisbInd;
    }

    /**
     * Primary Disability
     * <p>
     * Lineage reference object : SPRMEDI_DISB_IND
     * 
     */
    @JsonProperty("criteria.disbInd")
    public void setCriteriaDisbInd(String criteriaDisbInd) {
        this.criteriaDisbInd = criteriaDisbInd;
    }

    public MedicalInformation100PutRequest withCriteriaDisbInd(String criteriaDisbInd) {
        this.criteriaDisbInd = criteriaDisbInd;
        return this;
    }

    /**
     * Disability Type
     * <p>
     * Lineage reference object : SPRMEDI_DISA_CODE, Lookup lineage reference object : stvdisa
     * 
     */
    @JsonProperty("disaCode")
    public String getDisaCode() {
        return disaCode;
    }

    /**
     * Disability Type
     * <p>
     * Lineage reference object : SPRMEDI_DISA_CODE, Lookup lineage reference object : stvdisa
     * 
     */
    @JsonProperty("disaCode")
    public void setDisaCode(String disaCode) {
        this.disaCode = disaCode;
    }

    public MedicalInformation100PutRequest withDisaCode(String disaCode) {
        this.disaCode = disaCode;
        return this;
    }

    /**
     * Disability Type
     * <p>
     * Lineage reference object : SPRMEDI_DISA_CODE, Lookup lineage reference object : stvdisa
     * 
     */
    @JsonProperty("criteria.disaCode")
    public String getCriteriaDisaCode() {
        return criteriaDisaCode;
    }

    /**
     * Disability Type
     * <p>
     * Lineage reference object : SPRMEDI_DISA_CODE, Lookup lineage reference object : stvdisa
     * 
     */
    @JsonProperty("criteria.disaCode")
    public void setCriteriaDisaCode(String criteriaDisaCode) {
        this.criteriaDisaCode = criteriaDisaCode;
    }

    public MedicalInformation100PutRequest withCriteriaDisaCode(String criteriaDisaCode) {
        this.criteriaDisaCode = criteriaDisaCode;
        return this;
    }

    /**
     * Disability Service
     * <p>
     * Lineage reference object : SPRMEDI_SPSR_CODE, Lookup lineage reference object : stvspsr
     * 
     */
    @JsonProperty("criteria.spsrCode")
    public String getCriteriaSpsrCode() {
        return criteriaSpsrCode;
    }

    /**
     * Disability Service
     * <p>
     * Lineage reference object : SPRMEDI_SPSR_CODE, Lookup lineage reference object : stvspsr
     * 
     */
    @JsonProperty("criteria.spsrCode")
    public void setCriteriaSpsrCode(String criteriaSpsrCode) {
        this.criteriaSpsrCode = criteriaSpsrCode;
    }

    public MedicalInformation100PutRequest withCriteriaSpsrCode(String criteriaSpsrCode) {
        this.criteriaSpsrCode = criteriaSpsrCode;
        return this;
    }

    /**
     * Comment
     * <p>
     * Lineage reference object : SPRMEDI_COMMENT
     * 
     */
    @JsonProperty("comment")
    public String getComment() {
        return comment;
    }

    /**
     * Comment
     * <p>
     * Lineage reference object : SPRMEDI_COMMENT
     * 
     */
    @JsonProperty("comment")
    public void setComment(String comment) {
        this.comment = comment;
    }

    public MedicalInformation100PutRequest withComment(String comment) {
        this.comment = comment;
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

    public MedicalInformation100PutRequest withId(Object id) {
        this.id = id;
        return this;
    }

    @JsonProperty("criteria.spsrDescription")
    public String getCriteriaSpsrDescription() {
        return criteriaSpsrDescription;
    }

    @JsonProperty("criteria.spsrDescription")
    public void setCriteriaSpsrDescription(String criteriaSpsrDescription) {
        this.criteriaSpsrDescription = criteriaSpsrDescription;
    }

    public MedicalInformation100PutRequest withCriteriaSpsrDescription(String criteriaSpsrDescription) {
        this.criteriaSpsrDescription = criteriaSpsrDescription;
        return this;
    }

    /**
     * Disability Onset Age
     * <p>
     * Lineage reference object : SPRMEDI_ONSET_AGE
     * 
     */
    @JsonProperty("criteria.onsetAge")
    public Double getCriteriaOnsetAge() {
        return criteriaOnsetAge;
    }

    /**
     * Disability Onset Age
     * <p>
     * Lineage reference object : SPRMEDI_ONSET_AGE
     * 
     */
    @JsonProperty("criteria.onsetAge")
    public void setCriteriaOnsetAge(Double criteriaOnsetAge) {
        this.criteriaOnsetAge = criteriaOnsetAge;
    }

    public MedicalInformation100PutRequest withCriteriaOnsetAge(Double criteriaOnsetAge) {
        this.criteriaOnsetAge = criteriaOnsetAge;
        return this;
    }

    /**
     * Comment
     * <p>
     * Lineage reference object : SPRMEDI_COMMENT
     * 
     */
    @JsonProperty("criteria.comment")
    public String getCriteriaComment() {
        return criteriaComment;
    }

    /**
     * Comment
     * <p>
     * Lineage reference object : SPRMEDI_COMMENT
     * 
     */
    @JsonProperty("criteria.comment")
    public void setCriteriaComment(String criteriaComment) {
        this.criteriaComment = criteriaComment;
    }

    public MedicalInformation100PutRequest withCriteriaComment(String criteriaComment) {
        this.criteriaComment = criteriaComment;
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

    public MedicalInformation100PutRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(MedicalInformation100PutRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("criteriaMdeqCode");
        sb.append('=');
        sb.append(((this.criteriaMdeqCode == null)?"<null>":this.criteriaMdeqCode));
        sb.append(',');
        sb.append("criteriaMediDescription");
        sb.append('=');
        sb.append(((this.criteriaMediDescription == null)?"<null>":this.criteriaMediDescription));
        sb.append(',');
        sb.append("criteriaActivityDate");
        sb.append('=');
        sb.append(((this.criteriaActivityDate == null)?"<null>":this.criteriaActivityDate));
        sb.append(',');
        sb.append("criteriaUserId");
        sb.append('=');
        sb.append(((this.criteriaUserId == null)?"<null>":this.criteriaUserId));
        sb.append(',');
        sb.append("criteriaMediCode");
        sb.append('=');
        sb.append(((this.criteriaMediCode == null)?"<null>":this.criteriaMediCode));
        sb.append(',');
        sb.append("criteriaDisaDescription");
        sb.append('=');
        sb.append(((this.criteriaDisaDescription == null)?"<null>":this.criteriaDisaDescription));
        sb.append(',');
        sb.append("mediCode");
        sb.append('=');
        sb.append(((this.mediCode == null)?"<null>":this.mediCode));
        sb.append(',');
        sb.append("spsrCode");
        sb.append('=');
        sb.append(((this.spsrCode == null)?"<null>":this.spsrCode));
        sb.append(',');
        sb.append("criteriaMdeqDescription");
        sb.append('=');
        sb.append(((this.criteriaMdeqDescription == null)?"<null>":this.criteriaMdeqDescription));
        sb.append(',');
        sb.append("mediCodeDate");
        sb.append('=');
        sb.append(((this.mediCodeDate == null)?"<null>":this.mediCodeDate));
        sb.append(',');
        sb.append("onsetAge");
        sb.append('=');
        sb.append(((this.onsetAge == null)?"<null>":this.onsetAge));
        sb.append(',');
        sb.append("criteriaMediCodeDate");
        sb.append('=');
        sb.append(((this.criteriaMediCodeDate == null)?"<null>":this.criteriaMediCodeDate));
        sb.append(',');
        sb.append("mdeqCode");
        sb.append('=');
        sb.append(((this.mdeqCode == null)?"<null>":this.mdeqCode));
        sb.append(',');
        sb.append("disbInd");
        sb.append('=');
        sb.append(((this.disbInd == null)?"<null>":this.disbInd));
        sb.append(',');
        sb.append("criteriaDisbInd");
        sb.append('=');
        sb.append(((this.criteriaDisbInd == null)?"<null>":this.criteriaDisbInd));
        sb.append(',');
        sb.append("disaCode");
        sb.append('=');
        sb.append(((this.disaCode == null)?"<null>":this.disaCode));
        sb.append(',');
        sb.append("criteriaDisaCode");
        sb.append('=');
        sb.append(((this.criteriaDisaCode == null)?"<null>":this.criteriaDisaCode));
        sb.append(',');
        sb.append("criteriaSpsrCode");
        sb.append('=');
        sb.append(((this.criteriaSpsrCode == null)?"<null>":this.criteriaSpsrCode));
        sb.append(',');
        sb.append("comment");
        sb.append('=');
        sb.append(((this.comment == null)?"<null>":this.comment));
        sb.append(',');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("criteriaSpsrDescription");
        sb.append('=');
        sb.append(((this.criteriaSpsrDescription == null)?"<null>":this.criteriaSpsrDescription));
        sb.append(',');
        sb.append("criteriaOnsetAge");
        sb.append('=');
        sb.append(((this.criteriaOnsetAge == null)?"<null>":this.criteriaOnsetAge));
        sb.append(',');
        sb.append("criteriaComment");
        sb.append('=');
        sb.append(((this.criteriaComment == null)?"<null>":this.criteriaComment));
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
        result = ((result* 31)+((this.criteriaMdeqCode == null)? 0 :this.criteriaMdeqCode.hashCode()));
        result = ((result* 31)+((this.criteriaSpsrCode == null)? 0 :this.criteriaSpsrCode.hashCode()));
        result = ((result* 31)+((this.criteriaOnsetAge == null)? 0 :this.criteriaOnsetAge.hashCode()));
        result = ((result* 31)+((this.criteriaComment == null)? 0 :this.criteriaComment.hashCode()));
        result = ((result* 31)+((this.spsrCode == null)? 0 :this.spsrCode.hashCode()));
        result = ((result* 31)+((this.mediCodeDate == null)? 0 :this.mediCodeDate.hashCode()));
        result = ((result* 31)+((this.onsetAge == null)? 0 :this.onsetAge.hashCode()));
        result = ((result* 31)+((this.criteriaDisbInd == null)? 0 :this.criteriaDisbInd.hashCode()));
        result = ((result* 31)+((this.criteriaMdeqDescription == null)? 0 :this.criteriaMdeqDescription.hashCode()));
        result = ((result* 31)+((this.mdeqCode == null)? 0 :this.mdeqCode.hashCode()));
        result = ((result* 31)+((this.criteriaMediCodeDate == null)? 0 :this.criteriaMediCodeDate.hashCode()));
        result = ((result* 31)+((this.criteriaMediDescription == null)? 0 :this.criteriaMediDescription.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.criteriaActivityDate == null)? 0 :this.criteriaActivityDate.hashCode()));
        result = ((result* 31)+((this.criteriaMediCode == null)? 0 :this.criteriaMediCode.hashCode()));
        result = ((result* 31)+((this.mediCode == null)? 0 :this.mediCode.hashCode()));
        result = ((result* 31)+((this.criteriaSpsrDescription == null)? 0 :this.criteriaSpsrDescription.hashCode()));
        result = ((result* 31)+((this.criteriaDisaDescription == null)? 0 :this.criteriaDisaDescription.hashCode()));
        result = ((result* 31)+((this.criteriaUserId == null)? 0 :this.criteriaUserId.hashCode()));
        result = ((result* 31)+((this.disbInd == null)? 0 :this.disbInd.hashCode()));
        result = ((result* 31)+((this.disaCode == null)? 0 :this.disaCode.hashCode()));
        result = ((result* 31)+((this.comment == null)? 0 :this.comment.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.criteriaDisaCode == null)? 0 :this.criteriaDisaCode.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof MedicalInformation100PutRequest) == false) {
            return false;
        }
        MedicalInformation100PutRequest rhs = ((MedicalInformation100PutRequest) other);
        return (((((((((((((((((((((((((this.criteriaMdeqCode == rhs.criteriaMdeqCode)||((this.criteriaMdeqCode!= null)&&this.criteriaMdeqCode.equals(rhs.criteriaMdeqCode)))&&((this.criteriaSpsrCode == rhs.criteriaSpsrCode)||((this.criteriaSpsrCode!= null)&&this.criteriaSpsrCode.equals(rhs.criteriaSpsrCode))))&&((this.criteriaOnsetAge == rhs.criteriaOnsetAge)||((this.criteriaOnsetAge!= null)&&this.criteriaOnsetAge.equals(rhs.criteriaOnsetAge))))&&((this.criteriaComment == rhs.criteriaComment)||((this.criteriaComment!= null)&&this.criteriaComment.equals(rhs.criteriaComment))))&&((this.spsrCode == rhs.spsrCode)||((this.spsrCode!= null)&&this.spsrCode.equals(rhs.spsrCode))))&&((this.mediCodeDate == rhs.mediCodeDate)||((this.mediCodeDate!= null)&&this.mediCodeDate.equals(rhs.mediCodeDate))))&&((this.onsetAge == rhs.onsetAge)||((this.onsetAge!= null)&&this.onsetAge.equals(rhs.onsetAge))))&&((this.criteriaDisbInd == rhs.criteriaDisbInd)||((this.criteriaDisbInd!= null)&&this.criteriaDisbInd.equals(rhs.criteriaDisbInd))))&&((this.criteriaMdeqDescription == rhs.criteriaMdeqDescription)||((this.criteriaMdeqDescription!= null)&&this.criteriaMdeqDescription.equals(rhs.criteriaMdeqDescription))))&&((this.mdeqCode == rhs.mdeqCode)||((this.mdeqCode!= null)&&this.mdeqCode.equals(rhs.mdeqCode))))&&((this.criteriaMediCodeDate == rhs.criteriaMediCodeDate)||((this.criteriaMediCodeDate!= null)&&this.criteriaMediCodeDate.equals(rhs.criteriaMediCodeDate))))&&((this.criteriaMediDescription == rhs.criteriaMediDescription)||((this.criteriaMediDescription!= null)&&this.criteriaMediDescription.equals(rhs.criteriaMediDescription))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.criteriaActivityDate == rhs.criteriaActivityDate)||((this.criteriaActivityDate!= null)&&this.criteriaActivityDate.equals(rhs.criteriaActivityDate))))&&((this.criteriaMediCode == rhs.criteriaMediCode)||((this.criteriaMediCode!= null)&&this.criteriaMediCode.equals(rhs.criteriaMediCode))))&&((this.mediCode == rhs.mediCode)||((this.mediCode!= null)&&this.mediCode.equals(rhs.mediCode))))&&((this.criteriaSpsrDescription == rhs.criteriaSpsrDescription)||((this.criteriaSpsrDescription!= null)&&this.criteriaSpsrDescription.equals(rhs.criteriaSpsrDescription))))&&((this.criteriaDisaDescription == rhs.criteriaDisaDescription)||((this.criteriaDisaDescription!= null)&&this.criteriaDisaDescription.equals(rhs.criteriaDisaDescription))))&&((this.criteriaUserId == rhs.criteriaUserId)||((this.criteriaUserId!= null)&&this.criteriaUserId.equals(rhs.criteriaUserId))))&&((this.disbInd == rhs.disbInd)||((this.disbInd!= null)&&this.disbInd.equals(rhs.disbInd))))&&((this.disaCode == rhs.disaCode)||((this.disaCode!= null)&&this.disaCode.equals(rhs.disaCode))))&&((this.comment == rhs.comment)||((this.comment!= null)&&this.comment.equals(rhs.comment))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.criteriaDisaCode == rhs.criteriaDisaCode)||((this.criteriaDisaCode!= null)&&this.criteriaDisaCode.equals(rhs.criteriaDisaCode))));
    }

}
