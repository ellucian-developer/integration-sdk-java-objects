
package com.ellucian.generated.bpapi.ban.visa_type_codes.v1_0_0;

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
    "activityDate",
    "admrCode",
    "code",
    "desc",
    "nonResInd",
    "sevisEquiv",
    "statscanCde2",
    "vrMsgNo"
})
@Generated("jsonschema2pojo")
public class VisaTypeCodes100QapiPost {

    /**
     * Activity Date
     * <p>
     * Lineage reference object : STVVTYP_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    @JsonPropertyDescription("Lineage reference object : STVVTYP_ACTIVITY_DATE")
    private Date activityDate;
    /**
     * Admissions Checklist Request Item
     * <p>
     * Lineage reference object : STVVTYP_ADMR_CODE, Lookup lineage reference object : stvadmr
     * 
     */
    @JsonProperty("admrCode")
    @JsonPropertyDescription("Lineage reference object : STVVTYP_ADMR_CODE, Lookup lineage reference object : stvadmr")
    private String admrCode;
    /**
     * Visa Type
     * <p>
     * Lineage reference object : STVVTYP_CODE
     * 
     */
    @JsonProperty("code")
    @JsonPropertyDescription("Lineage reference object : STVVTYP_CODE")
    private String code;
    /**
     * Description
     * <p>
     * Lineage reference object : STVVTYP_DESC
     * 
     */
    @JsonProperty("desc")
    @JsonPropertyDescription("Lineage reference object : STVVTYP_DESC")
    private String desc;
    /**
     * Lineage reference object : STVVTYP_NON_RES_IND
     * 
     */
    @JsonProperty("nonResInd")
    @JsonPropertyDescription("Lineage reference object : STVVTYP_NON_RES_IND")
    private String nonResInd;
    /**
     * SEVIS Code
     * <p>
     * Lineage reference object : STVVTYP_SEVIS_EQUIV
     * 
     */
    @JsonProperty("sevisEquiv")
    @JsonPropertyDescription("Lineage reference object : STVVTYP_SEVIS_EQUIV")
    private String sevisEquiv;
    /**
     * Canadian Statistics Code
     * <p>
     * Lineage reference object : STVVTYP_STATSCAN_CDE2
     * 
     */
    @JsonProperty("statscanCde2")
    @JsonPropertyDescription("Lineage reference object : STVVTYP_STATSCAN_CDE2")
    private Double statscanCde2;
    /**
     * Voice Response Message Number
     * <p>
     * Lineage reference object : STVVTYP_VR_MSG_NO
     * 
     */
    @JsonProperty("vrMsgNo")
    @JsonPropertyDescription("Lineage reference object : STVVTYP_VR_MSG_NO")
    private Double vrMsgNo;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Activity Date
     * <p>
     * Lineage reference object : STVVTYP_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public Date getActivityDate() {
        return activityDate;
    }

    /**
     * Activity Date
     * <p>
     * Lineage reference object : STVVTYP_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public void setActivityDate(Date activityDate) {
        this.activityDate = activityDate;
    }

    public VisaTypeCodes100QapiPost withActivityDate(Date activityDate) {
        this.activityDate = activityDate;
        return this;
    }

    /**
     * Admissions Checklist Request Item
     * <p>
     * Lineage reference object : STVVTYP_ADMR_CODE, Lookup lineage reference object : stvadmr
     * 
     */
    @JsonProperty("admrCode")
    public String getAdmrCode() {
        return admrCode;
    }

    /**
     * Admissions Checklist Request Item
     * <p>
     * Lineage reference object : STVVTYP_ADMR_CODE, Lookup lineage reference object : stvadmr
     * 
     */
    @JsonProperty("admrCode")
    public void setAdmrCode(String admrCode) {
        this.admrCode = admrCode;
    }

    public VisaTypeCodes100QapiPost withAdmrCode(String admrCode) {
        this.admrCode = admrCode;
        return this;
    }

    /**
     * Visa Type
     * <p>
     * Lineage reference object : STVVTYP_CODE
     * 
     */
    @JsonProperty("code")
    public String getCode() {
        return code;
    }

    /**
     * Visa Type
     * <p>
     * Lineage reference object : STVVTYP_CODE
     * 
     */
    @JsonProperty("code")
    public void setCode(String code) {
        this.code = code;
    }

    public VisaTypeCodes100QapiPost withCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * Description
     * <p>
     * Lineage reference object : STVVTYP_DESC
     * 
     */
    @JsonProperty("desc")
    public String getDesc() {
        return desc;
    }

    /**
     * Description
     * <p>
     * Lineage reference object : STVVTYP_DESC
     * 
     */
    @JsonProperty("desc")
    public void setDesc(String desc) {
        this.desc = desc;
    }

    public VisaTypeCodes100QapiPost withDesc(String desc) {
        this.desc = desc;
        return this;
    }

    /**
     * Lineage reference object : STVVTYP_NON_RES_IND
     * 
     */
    @JsonProperty("nonResInd")
    public String getNonResInd() {
        return nonResInd;
    }

    /**
     * Lineage reference object : STVVTYP_NON_RES_IND
     * 
     */
    @JsonProperty("nonResInd")
    public void setNonResInd(String nonResInd) {
        this.nonResInd = nonResInd;
    }

    public VisaTypeCodes100QapiPost withNonResInd(String nonResInd) {
        this.nonResInd = nonResInd;
        return this;
    }

    /**
     * SEVIS Code
     * <p>
     * Lineage reference object : STVVTYP_SEVIS_EQUIV
     * 
     */
    @JsonProperty("sevisEquiv")
    public String getSevisEquiv() {
        return sevisEquiv;
    }

    /**
     * SEVIS Code
     * <p>
     * Lineage reference object : STVVTYP_SEVIS_EQUIV
     * 
     */
    @JsonProperty("sevisEquiv")
    public void setSevisEquiv(String sevisEquiv) {
        this.sevisEquiv = sevisEquiv;
    }

    public VisaTypeCodes100QapiPost withSevisEquiv(String sevisEquiv) {
        this.sevisEquiv = sevisEquiv;
        return this;
    }

    /**
     * Canadian Statistics Code
     * <p>
     * Lineage reference object : STVVTYP_STATSCAN_CDE2
     * 
     */
    @JsonProperty("statscanCde2")
    public Double getStatscanCde2() {
        return statscanCde2;
    }

    /**
     * Canadian Statistics Code
     * <p>
     * Lineage reference object : STVVTYP_STATSCAN_CDE2
     * 
     */
    @JsonProperty("statscanCde2")
    public void setStatscanCde2(Double statscanCde2) {
        this.statscanCde2 = statscanCde2;
    }

    public VisaTypeCodes100QapiPost withStatscanCde2(Double statscanCde2) {
        this.statscanCde2 = statscanCde2;
        return this;
    }

    /**
     * Voice Response Message Number
     * <p>
     * Lineage reference object : STVVTYP_VR_MSG_NO
     * 
     */
    @JsonProperty("vrMsgNo")
    public Double getVrMsgNo() {
        return vrMsgNo;
    }

    /**
     * Voice Response Message Number
     * <p>
     * Lineage reference object : STVVTYP_VR_MSG_NO
     * 
     */
    @JsonProperty("vrMsgNo")
    public void setVrMsgNo(Double vrMsgNo) {
        this.vrMsgNo = vrMsgNo;
    }

    public VisaTypeCodes100QapiPost withVrMsgNo(Double vrMsgNo) {
        this.vrMsgNo = vrMsgNo;
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

    public VisaTypeCodes100QapiPost withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(VisaTypeCodes100QapiPost.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("activityDate");
        sb.append('=');
        sb.append(((this.activityDate == null)?"<null>":this.activityDate));
        sb.append(',');
        sb.append("admrCode");
        sb.append('=');
        sb.append(((this.admrCode == null)?"<null>":this.admrCode));
        sb.append(',');
        sb.append("code");
        sb.append('=');
        sb.append(((this.code == null)?"<null>":this.code));
        sb.append(',');
        sb.append("desc");
        sb.append('=');
        sb.append(((this.desc == null)?"<null>":this.desc));
        sb.append(',');
        sb.append("nonResInd");
        sb.append('=');
        sb.append(((this.nonResInd == null)?"<null>":this.nonResInd));
        sb.append(',');
        sb.append("sevisEquiv");
        sb.append('=');
        sb.append(((this.sevisEquiv == null)?"<null>":this.sevisEquiv));
        sb.append(',');
        sb.append("statscanCde2");
        sb.append('=');
        sb.append(((this.statscanCde2 == null)?"<null>":this.statscanCde2));
        sb.append(',');
        sb.append("vrMsgNo");
        sb.append('=');
        sb.append(((this.vrMsgNo == null)?"<null>":this.vrMsgNo));
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
        result = ((result* 31)+((this.admrCode == null)? 0 :this.admrCode.hashCode()));
        result = ((result* 31)+((this.activityDate == null)? 0 :this.activityDate.hashCode()));
        result = ((result* 31)+((this.code == null)? 0 :this.code.hashCode()));
        result = ((result* 31)+((this.nonResInd == null)? 0 :this.nonResInd.hashCode()));
        result = ((result* 31)+((this.statscanCde2 == null)? 0 :this.statscanCde2 .hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.vrMsgNo == null)? 0 :this.vrMsgNo.hashCode()));
        result = ((result* 31)+((this.sevisEquiv == null)? 0 :this.sevisEquiv.hashCode()));
        result = ((result* 31)+((this.desc == null)? 0 :this.desc.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof VisaTypeCodes100QapiPost) == false) {
            return false;
        }
        VisaTypeCodes100QapiPost rhs = ((VisaTypeCodes100QapiPost) other);
        return ((((((((((this.admrCode == rhs.admrCode)||((this.admrCode!= null)&&this.admrCode.equals(rhs.admrCode)))&&((this.activityDate == rhs.activityDate)||((this.activityDate!= null)&&this.activityDate.equals(rhs.activityDate))))&&((this.code == rhs.code)||((this.code!= null)&&this.code.equals(rhs.code))))&&((this.nonResInd == rhs.nonResInd)||((this.nonResInd!= null)&&this.nonResInd.equals(rhs.nonResInd))))&&((this.statscanCde2 == rhs.statscanCde2)||((this.statscanCde2 != null)&&this.statscanCde2 .equals(rhs.statscanCde2))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.vrMsgNo == rhs.vrMsgNo)||((this.vrMsgNo!= null)&&this.vrMsgNo.equals(rhs.vrMsgNo))))&&((this.sevisEquiv == rhs.sevisEquiv)||((this.sevisEquiv!= null)&&this.sevisEquiv.equals(rhs.sevisEquiv))))&&((this.desc == rhs.desc)||((this.desc!= null)&&this.desc.equals(rhs.desc))));
    }

}