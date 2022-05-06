
package com.ellucian.generated.bpapi.ban.source_background_institution_codes.v1_0_0;

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
    "criteria.admrCode",
    "criteria.activityDate",
    "typeInd",
    "srceInd",
    "fice",
    "criteria.desc",
    "ediCapable",
    "criteria.code",
    "criteria.srceInd",
    "admrCode",
    "criteria.vrMsgNo",
    "criteria.ediCapable",
    "criteria.stvadmrDesc",
    "criteria.fice",
    "criteria.typeInd",
    "vrMsgNo",
    "desc"
})
@Generated("jsonschema2pojo")
public class SourceBackgroundInstitutionCodes100PutRequest {

    /**
     * Admissions Request
     * <p>
     * Lineage reference object : STVSBGI_ADMR_CODE, Lookup lineage reference object : stvadmr
     * 
     */
    @JsonProperty("criteria.admrCode")
    @JsonPropertyDescription("Lineage reference object : STVSBGI_ADMR_CODE, Lookup lineage reference object : stvadmr")
    private String criteriaAdmrCode;
    /**
     * Lineage reference object : STVSBGI_ACTIVITY_DATE
     * 
     */
    @JsonProperty("criteria.activityDate")
    @JsonPropertyDescription("Lineage reference object : STVSBGI_ACTIVITY_DATE")
    private Date criteriaActivityDate;
    /**
     * Type
     * <p>
     * Lineage reference object : STVSBGI_TYPE_IND
     * (Required)
     * 
     */
    @JsonProperty("typeInd")
    @JsonPropertyDescription("Lineage reference object : STVSBGI_TYPE_IND")
    private String typeInd;
    /**
     * Lineage reference object : STVSBGI_SRCE_IND
     * 
     */
    @JsonProperty("srceInd")
    @JsonPropertyDescription("Lineage reference object : STVSBGI_SRCE_IND")
    private String srceInd;
    /**
     * FICE
     * <p>
     * Lineage reference object : STVSBGI_FICE
     * 
     */
    @JsonProperty("fice")
    @JsonPropertyDescription("Lineage reference object : STVSBGI_FICE")
    private String fice;
    /**
     * Description
     * <p>
     * Lineage reference object : STVSBGI_DESC
     * (Required)
     * 
     */
    @JsonProperty("criteria.desc")
    @JsonPropertyDescription("Lineage reference object : STVSBGI_DESC")
    private String criteriaDesc;
    /**
     * Electronic
     * <p>
     * Lineage reference object : STVSBGI_EDI_CAPABLE
     * 
     */
    @JsonProperty("ediCapable")
    @JsonPropertyDescription("Lineage reference object : STVSBGI_EDI_CAPABLE")
    private String ediCapable;
    /**
     * Source or Background Institution
     * <p>
     * Lineage reference object : STVSBGI_CODE
     * (Required)
     * 
     */
    @JsonProperty("criteria.code")
    @JsonPropertyDescription("Lineage reference object : STVSBGI_CODE")
    private String criteriaCode;
    /**
     * Lineage reference object : STVSBGI_SRCE_IND
     * 
     */
    @JsonProperty("criteria.srceInd")
    @JsonPropertyDescription("Lineage reference object : STVSBGI_SRCE_IND")
    private String criteriaSrceInd;
    /**
     * Admissions Request
     * <p>
     * Lineage reference object : STVSBGI_ADMR_CODE, Lookup lineage reference object : stvadmr
     * 
     */
    @JsonProperty("admrCode")
    @JsonPropertyDescription("Lineage reference object : STVSBGI_ADMR_CODE, Lookup lineage reference object : stvadmr")
    private String admrCode;
    /**
     * Voice Response Message Number
     * <p>
     * Lineage reference object : STVSBGI_VR_MSG_NO
     * 
     */
    @JsonProperty("criteria.vrMsgNo")
    @JsonPropertyDescription("Lineage reference object : STVSBGI_VR_MSG_NO")
    private Double criteriaVrMsgNo;
    /**
     * Electronic
     * <p>
     * Lineage reference object : STVSBGI_EDI_CAPABLE
     * 
     */
    @JsonProperty("criteria.ediCapable")
    @JsonPropertyDescription("Lineage reference object : STVSBGI_EDI_CAPABLE")
    private String criteriaEdiCapable;
    /**
     * Admissions Request Description
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.stvadmrDesc")
    private String criteriaStvadmrDesc;
    /**
     * FICE
     * <p>
     * Lineage reference object : STVSBGI_FICE
     * 
     */
    @JsonProperty("criteria.fice")
    @JsonPropertyDescription("Lineage reference object : STVSBGI_FICE")
    private String criteriaFice;
    /**
     * Type
     * <p>
     * Lineage reference object : STVSBGI_TYPE_IND
     * (Required)
     * 
     */
    @JsonProperty("criteria.typeInd")
    @JsonPropertyDescription("Lineage reference object : STVSBGI_TYPE_IND")
    private String criteriaTypeInd;
    /**
     * Voice Response Message Number
     * <p>
     * Lineage reference object : STVSBGI_VR_MSG_NO
     * 
     */
    @JsonProperty("vrMsgNo")
    @JsonPropertyDescription("Lineage reference object : STVSBGI_VR_MSG_NO")
    private Double vrMsgNo;
    /**
     * Description
     * <p>
     * Lineage reference object : STVSBGI_DESC
     * (Required)
     * 
     */
    @JsonProperty("desc")
    @JsonPropertyDescription("Lineage reference object : STVSBGI_DESC")
    private String desc;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Admissions Request
     * <p>
     * Lineage reference object : STVSBGI_ADMR_CODE, Lookup lineage reference object : stvadmr
     * 
     */
    @JsonProperty("criteria.admrCode")
    public String getCriteriaAdmrCode() {
        return criteriaAdmrCode;
    }

    /**
     * Admissions Request
     * <p>
     * Lineage reference object : STVSBGI_ADMR_CODE, Lookup lineage reference object : stvadmr
     * 
     */
    @JsonProperty("criteria.admrCode")
    public void setCriteriaAdmrCode(String criteriaAdmrCode) {
        this.criteriaAdmrCode = criteriaAdmrCode;
    }

    public SourceBackgroundInstitutionCodes100PutRequest withCriteriaAdmrCode(String criteriaAdmrCode) {
        this.criteriaAdmrCode = criteriaAdmrCode;
        return this;
    }

    /**
     * Lineage reference object : STVSBGI_ACTIVITY_DATE
     * 
     */
    @JsonProperty("criteria.activityDate")
    public Date getCriteriaActivityDate() {
        return criteriaActivityDate;
    }

    /**
     * Lineage reference object : STVSBGI_ACTIVITY_DATE
     * 
     */
    @JsonProperty("criteria.activityDate")
    public void setCriteriaActivityDate(Date criteriaActivityDate) {
        this.criteriaActivityDate = criteriaActivityDate;
    }

    public SourceBackgroundInstitutionCodes100PutRequest withCriteriaActivityDate(Date criteriaActivityDate) {
        this.criteriaActivityDate = criteriaActivityDate;
        return this;
    }

    /**
     * Type
     * <p>
     * Lineage reference object : STVSBGI_TYPE_IND
     * (Required)
     * 
     */
    @JsonProperty("typeInd")
    public String getTypeInd() {
        return typeInd;
    }

    /**
     * Type
     * <p>
     * Lineage reference object : STVSBGI_TYPE_IND
     * (Required)
     * 
     */
    @JsonProperty("typeInd")
    public void setTypeInd(String typeInd) {
        this.typeInd = typeInd;
    }

    public SourceBackgroundInstitutionCodes100PutRequest withTypeInd(String typeInd) {
        this.typeInd = typeInd;
        return this;
    }

    /**
     * Lineage reference object : STVSBGI_SRCE_IND
     * 
     */
    @JsonProperty("srceInd")
    public String getSrceInd() {
        return srceInd;
    }

    /**
     * Lineage reference object : STVSBGI_SRCE_IND
     * 
     */
    @JsonProperty("srceInd")
    public void setSrceInd(String srceInd) {
        this.srceInd = srceInd;
    }

    public SourceBackgroundInstitutionCodes100PutRequest withSrceInd(String srceInd) {
        this.srceInd = srceInd;
        return this;
    }

    /**
     * FICE
     * <p>
     * Lineage reference object : STVSBGI_FICE
     * 
     */
    @JsonProperty("fice")
    public String getFice() {
        return fice;
    }

    /**
     * FICE
     * <p>
     * Lineage reference object : STVSBGI_FICE
     * 
     */
    @JsonProperty("fice")
    public void setFice(String fice) {
        this.fice = fice;
    }

    public SourceBackgroundInstitutionCodes100PutRequest withFice(String fice) {
        this.fice = fice;
        return this;
    }

    /**
     * Description
     * <p>
     * Lineage reference object : STVSBGI_DESC
     * (Required)
     * 
     */
    @JsonProperty("criteria.desc")
    public String getCriteriaDesc() {
        return criteriaDesc;
    }

    /**
     * Description
     * <p>
     * Lineage reference object : STVSBGI_DESC
     * (Required)
     * 
     */
    @JsonProperty("criteria.desc")
    public void setCriteriaDesc(String criteriaDesc) {
        this.criteriaDesc = criteriaDesc;
    }

    public SourceBackgroundInstitutionCodes100PutRequest withCriteriaDesc(String criteriaDesc) {
        this.criteriaDesc = criteriaDesc;
        return this;
    }

    /**
     * Electronic
     * <p>
     * Lineage reference object : STVSBGI_EDI_CAPABLE
     * 
     */
    @JsonProperty("ediCapable")
    public String getEdiCapable() {
        return ediCapable;
    }

    /**
     * Electronic
     * <p>
     * Lineage reference object : STVSBGI_EDI_CAPABLE
     * 
     */
    @JsonProperty("ediCapable")
    public void setEdiCapable(String ediCapable) {
        this.ediCapable = ediCapable;
    }

    public SourceBackgroundInstitutionCodes100PutRequest withEdiCapable(String ediCapable) {
        this.ediCapable = ediCapable;
        return this;
    }

    /**
     * Source or Background Institution
     * <p>
     * Lineage reference object : STVSBGI_CODE
     * (Required)
     * 
     */
    @JsonProperty("criteria.code")
    public String getCriteriaCode() {
        return criteriaCode;
    }

    /**
     * Source or Background Institution
     * <p>
     * Lineage reference object : STVSBGI_CODE
     * (Required)
     * 
     */
    @JsonProperty("criteria.code")
    public void setCriteriaCode(String criteriaCode) {
        this.criteriaCode = criteriaCode;
    }

    public SourceBackgroundInstitutionCodes100PutRequest withCriteriaCode(String criteriaCode) {
        this.criteriaCode = criteriaCode;
        return this;
    }

    /**
     * Lineage reference object : STVSBGI_SRCE_IND
     * 
     */
    @JsonProperty("criteria.srceInd")
    public String getCriteriaSrceInd() {
        return criteriaSrceInd;
    }

    /**
     * Lineage reference object : STVSBGI_SRCE_IND
     * 
     */
    @JsonProperty("criteria.srceInd")
    public void setCriteriaSrceInd(String criteriaSrceInd) {
        this.criteriaSrceInd = criteriaSrceInd;
    }

    public SourceBackgroundInstitutionCodes100PutRequest withCriteriaSrceInd(String criteriaSrceInd) {
        this.criteriaSrceInd = criteriaSrceInd;
        return this;
    }

    /**
     * Admissions Request
     * <p>
     * Lineage reference object : STVSBGI_ADMR_CODE, Lookup lineage reference object : stvadmr
     * 
     */
    @JsonProperty("admrCode")
    public String getAdmrCode() {
        return admrCode;
    }

    /**
     * Admissions Request
     * <p>
     * Lineage reference object : STVSBGI_ADMR_CODE, Lookup lineage reference object : stvadmr
     * 
     */
    @JsonProperty("admrCode")
    public void setAdmrCode(String admrCode) {
        this.admrCode = admrCode;
    }

    public SourceBackgroundInstitutionCodes100PutRequest withAdmrCode(String admrCode) {
        this.admrCode = admrCode;
        return this;
    }

    /**
     * Voice Response Message Number
     * <p>
     * Lineage reference object : STVSBGI_VR_MSG_NO
     * 
     */
    @JsonProperty("criteria.vrMsgNo")
    public Double getCriteriaVrMsgNo() {
        return criteriaVrMsgNo;
    }

    /**
     * Voice Response Message Number
     * <p>
     * Lineage reference object : STVSBGI_VR_MSG_NO
     * 
     */
    @JsonProperty("criteria.vrMsgNo")
    public void setCriteriaVrMsgNo(Double criteriaVrMsgNo) {
        this.criteriaVrMsgNo = criteriaVrMsgNo;
    }

    public SourceBackgroundInstitutionCodes100PutRequest withCriteriaVrMsgNo(Double criteriaVrMsgNo) {
        this.criteriaVrMsgNo = criteriaVrMsgNo;
        return this;
    }

    /**
     * Electronic
     * <p>
     * Lineage reference object : STVSBGI_EDI_CAPABLE
     * 
     */
    @JsonProperty("criteria.ediCapable")
    public String getCriteriaEdiCapable() {
        return criteriaEdiCapable;
    }

    /**
     * Electronic
     * <p>
     * Lineage reference object : STVSBGI_EDI_CAPABLE
     * 
     */
    @JsonProperty("criteria.ediCapable")
    public void setCriteriaEdiCapable(String criteriaEdiCapable) {
        this.criteriaEdiCapable = criteriaEdiCapable;
    }

    public SourceBackgroundInstitutionCodes100PutRequest withCriteriaEdiCapable(String criteriaEdiCapable) {
        this.criteriaEdiCapable = criteriaEdiCapable;
        return this;
    }

    /**
     * Admissions Request Description
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.stvadmrDesc")
    public String getCriteriaStvadmrDesc() {
        return criteriaStvadmrDesc;
    }

    /**
     * Admissions Request Description
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.stvadmrDesc")
    public void setCriteriaStvadmrDesc(String criteriaStvadmrDesc) {
        this.criteriaStvadmrDesc = criteriaStvadmrDesc;
    }

    public SourceBackgroundInstitutionCodes100PutRequest withCriteriaStvadmrDesc(String criteriaStvadmrDesc) {
        this.criteriaStvadmrDesc = criteriaStvadmrDesc;
        return this;
    }

    /**
     * FICE
     * <p>
     * Lineage reference object : STVSBGI_FICE
     * 
     */
    @JsonProperty("criteria.fice")
    public String getCriteriaFice() {
        return criteriaFice;
    }

    /**
     * FICE
     * <p>
     * Lineage reference object : STVSBGI_FICE
     * 
     */
    @JsonProperty("criteria.fice")
    public void setCriteriaFice(String criteriaFice) {
        this.criteriaFice = criteriaFice;
    }

    public SourceBackgroundInstitutionCodes100PutRequest withCriteriaFice(String criteriaFice) {
        this.criteriaFice = criteriaFice;
        return this;
    }

    /**
     * Type
     * <p>
     * Lineage reference object : STVSBGI_TYPE_IND
     * (Required)
     * 
     */
    @JsonProperty("criteria.typeInd")
    public String getCriteriaTypeInd() {
        return criteriaTypeInd;
    }

    /**
     * Type
     * <p>
     * Lineage reference object : STVSBGI_TYPE_IND
     * (Required)
     * 
     */
    @JsonProperty("criteria.typeInd")
    public void setCriteriaTypeInd(String criteriaTypeInd) {
        this.criteriaTypeInd = criteriaTypeInd;
    }

    public SourceBackgroundInstitutionCodes100PutRequest withCriteriaTypeInd(String criteriaTypeInd) {
        this.criteriaTypeInd = criteriaTypeInd;
        return this;
    }

    /**
     * Voice Response Message Number
     * <p>
     * Lineage reference object : STVSBGI_VR_MSG_NO
     * 
     */
    @JsonProperty("vrMsgNo")
    public Double getVrMsgNo() {
        return vrMsgNo;
    }

    /**
     * Voice Response Message Number
     * <p>
     * Lineage reference object : STVSBGI_VR_MSG_NO
     * 
     */
    @JsonProperty("vrMsgNo")
    public void setVrMsgNo(Double vrMsgNo) {
        this.vrMsgNo = vrMsgNo;
    }

    public SourceBackgroundInstitutionCodes100PutRequest withVrMsgNo(Double vrMsgNo) {
        this.vrMsgNo = vrMsgNo;
        return this;
    }

    /**
     * Description
     * <p>
     * Lineage reference object : STVSBGI_DESC
     * (Required)
     * 
     */
    @JsonProperty("desc")
    public String getDesc() {
        return desc;
    }

    /**
     * Description
     * <p>
     * Lineage reference object : STVSBGI_DESC
     * (Required)
     * 
     */
    @JsonProperty("desc")
    public void setDesc(String desc) {
        this.desc = desc;
    }

    public SourceBackgroundInstitutionCodes100PutRequest withDesc(String desc) {
        this.desc = desc;
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

    public SourceBackgroundInstitutionCodes100PutRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(SourceBackgroundInstitutionCodes100PutRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("criteriaAdmrCode");
        sb.append('=');
        sb.append(((this.criteriaAdmrCode == null)?"<null>":this.criteriaAdmrCode));
        sb.append(',');
        sb.append("criteriaActivityDate");
        sb.append('=');
        sb.append(((this.criteriaActivityDate == null)?"<null>":this.criteriaActivityDate));
        sb.append(',');
        sb.append("typeInd");
        sb.append('=');
        sb.append(((this.typeInd == null)?"<null>":this.typeInd));
        sb.append(',');
        sb.append("srceInd");
        sb.append('=');
        sb.append(((this.srceInd == null)?"<null>":this.srceInd));
        sb.append(',');
        sb.append("fice");
        sb.append('=');
        sb.append(((this.fice == null)?"<null>":this.fice));
        sb.append(',');
        sb.append("criteriaDesc");
        sb.append('=');
        sb.append(((this.criteriaDesc == null)?"<null>":this.criteriaDesc));
        sb.append(',');
        sb.append("ediCapable");
        sb.append('=');
        sb.append(((this.ediCapable == null)?"<null>":this.ediCapable));
        sb.append(',');
        sb.append("criteriaCode");
        sb.append('=');
        sb.append(((this.criteriaCode == null)?"<null>":this.criteriaCode));
        sb.append(',');
        sb.append("criteriaSrceInd");
        sb.append('=');
        sb.append(((this.criteriaSrceInd == null)?"<null>":this.criteriaSrceInd));
        sb.append(',');
        sb.append("admrCode");
        sb.append('=');
        sb.append(((this.admrCode == null)?"<null>":this.admrCode));
        sb.append(',');
        sb.append("criteriaVrMsgNo");
        sb.append('=');
        sb.append(((this.criteriaVrMsgNo == null)?"<null>":this.criteriaVrMsgNo));
        sb.append(',');
        sb.append("criteriaEdiCapable");
        sb.append('=');
        sb.append(((this.criteriaEdiCapable == null)?"<null>":this.criteriaEdiCapable));
        sb.append(',');
        sb.append("criteriaStvadmrDesc");
        sb.append('=');
        sb.append(((this.criteriaStvadmrDesc == null)?"<null>":this.criteriaStvadmrDesc));
        sb.append(',');
        sb.append("criteriaFice");
        sb.append('=');
        sb.append(((this.criteriaFice == null)?"<null>":this.criteriaFice));
        sb.append(',');
        sb.append("criteriaTypeInd");
        sb.append('=');
        sb.append(((this.criteriaTypeInd == null)?"<null>":this.criteriaTypeInd));
        sb.append(',');
        sb.append("vrMsgNo");
        sb.append('=');
        sb.append(((this.vrMsgNo == null)?"<null>":this.vrMsgNo));
        sb.append(',');
        sb.append("desc");
        sb.append('=');
        sb.append(((this.desc == null)?"<null>":this.desc));
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
        result = ((result* 31)+((this.criteriaCode == null)? 0 :this.criteriaCode.hashCode()));
        result = ((result* 31)+((this.typeInd == null)? 0 :this.typeInd.hashCode()));
        result = ((result* 31)+((this.criteriaSrceInd == null)? 0 :this.criteriaSrceInd.hashCode()));
        result = ((result* 31)+((this.criteriaAdmrCode == null)? 0 :this.criteriaAdmrCode.hashCode()));
        result = ((result* 31)+((this.criteriaVrMsgNo == null)? 0 :this.criteriaVrMsgNo.hashCode()));
        result = ((result* 31)+((this.srceInd == null)? 0 :this.srceInd.hashCode()));
        result = ((result* 31)+((this.fice == null)? 0 :this.fice.hashCode()));
        result = ((result* 31)+((this.criteriaFice == null)? 0 :this.criteriaFice.hashCode()));
        result = ((result* 31)+((this.criteriaTypeInd == null)? 0 :this.criteriaTypeInd.hashCode()));
        result = ((result* 31)+((this.ediCapable == null)? 0 :this.ediCapable.hashCode()));
        result = ((result* 31)+((this.criteriaEdiCapable == null)? 0 :this.criteriaEdiCapable.hashCode()));
        result = ((result* 31)+((this.criteriaStvadmrDesc == null)? 0 :this.criteriaStvadmrDesc.hashCode()));
        result = ((result* 31)+((this.admrCode == null)? 0 :this.admrCode.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.vrMsgNo == null)? 0 :this.vrMsgNo.hashCode()));
        result = ((result* 31)+((this.criteriaDesc == null)? 0 :this.criteriaDesc.hashCode()));
        result = ((result* 31)+((this.desc == null)? 0 :this.desc.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof SourceBackgroundInstitutionCodes100PutRequest) == false) {
            return false;
        }
        SourceBackgroundInstitutionCodes100PutRequest rhs = ((SourceBackgroundInstitutionCodes100PutRequest) other);
        return (((((((((((((((((((this.criteriaActivityDate == rhs.criteriaActivityDate)||((this.criteriaActivityDate!= null)&&this.criteriaActivityDate.equals(rhs.criteriaActivityDate)))&&((this.criteriaCode == rhs.criteriaCode)||((this.criteriaCode!= null)&&this.criteriaCode.equals(rhs.criteriaCode))))&&((this.typeInd == rhs.typeInd)||((this.typeInd!= null)&&this.typeInd.equals(rhs.typeInd))))&&((this.criteriaSrceInd == rhs.criteriaSrceInd)||((this.criteriaSrceInd!= null)&&this.criteriaSrceInd.equals(rhs.criteriaSrceInd))))&&((this.criteriaAdmrCode == rhs.criteriaAdmrCode)||((this.criteriaAdmrCode!= null)&&this.criteriaAdmrCode.equals(rhs.criteriaAdmrCode))))&&((this.criteriaVrMsgNo == rhs.criteriaVrMsgNo)||((this.criteriaVrMsgNo!= null)&&this.criteriaVrMsgNo.equals(rhs.criteriaVrMsgNo))))&&((this.srceInd == rhs.srceInd)||((this.srceInd!= null)&&this.srceInd.equals(rhs.srceInd))))&&((this.fice == rhs.fice)||((this.fice!= null)&&this.fice.equals(rhs.fice))))&&((this.criteriaFice == rhs.criteriaFice)||((this.criteriaFice!= null)&&this.criteriaFice.equals(rhs.criteriaFice))))&&((this.criteriaTypeInd == rhs.criteriaTypeInd)||((this.criteriaTypeInd!= null)&&this.criteriaTypeInd.equals(rhs.criteriaTypeInd))))&&((this.ediCapable == rhs.ediCapable)||((this.ediCapable!= null)&&this.ediCapable.equals(rhs.ediCapable))))&&((this.criteriaEdiCapable == rhs.criteriaEdiCapable)||((this.criteriaEdiCapable!= null)&&this.criteriaEdiCapable.equals(rhs.criteriaEdiCapable))))&&((this.criteriaStvadmrDesc == rhs.criteriaStvadmrDesc)||((this.criteriaStvadmrDesc!= null)&&this.criteriaStvadmrDesc.equals(rhs.criteriaStvadmrDesc))))&&((this.admrCode == rhs.admrCode)||((this.admrCode!= null)&&this.admrCode.equals(rhs.admrCode))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.vrMsgNo == rhs.vrMsgNo)||((this.vrMsgNo!= null)&&this.vrMsgNo.equals(rhs.vrMsgNo))))&&((this.criteriaDesc == rhs.criteriaDesc)||((this.criteriaDesc!= null)&&this.criteriaDesc.equals(rhs.criteriaDesc))))&&((this.desc == rhs.desc)||((this.desc!= null)&&this.desc.equals(rhs.desc))));
    }

}
