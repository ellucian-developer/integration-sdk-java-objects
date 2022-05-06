
package com.ellucian.generated.bpapi.ban.ca_major_minor_concentration_codes.v1_0_0;

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
    "occupationInd",
    "code",
    "systemReqInd",
    "topsCode",
    "aidEligibilityInd",
    "majrTopsCodeDesc",
    "cipcCode",
    "activityDate",
    "validMajorInd",
    "validConcentratnInd",
    "vrMsgNo",
    "sevisEquiv",
    "desc",
    "validMinorInd"
})
@Generated("jsonschema2pojo")
public class CaMajorMinorConcentrationCodes100GetResponse {

    /**
     * Lineage reference object : STVMAJR_OCCUPATION_IND
     * 
     */
    @JsonProperty("occupationInd")
    @JsonPropertyDescription("Lineage reference object : STVMAJR_OCCUPATION_IND")
    private String occupationInd;
    /**
     * Major Code
     * <p>
     * Lineage reference object : STVMAJR_CODE
     * (Required)
     * 
     */
    @JsonProperty("code")
    @JsonPropertyDescription("Lineage reference object : STVMAJR_CODE")
    private String code;
    /**
     * Lineage reference object : STVMAJR_SYSTEM_REQ_IND
     * 
     */
    @JsonProperty("systemReqInd")
    @JsonPropertyDescription("Lineage reference object : STVMAJR_SYSTEM_REQ_IND")
    private String systemReqInd;
    /**
     * Taxonomy of Program (TOP) Code
     * <p>
     * Lineage reference object : STVMAJR_TOPS_CODE, Lookup lineage reference object : stvtops
     * (Required)
     * 
     */
    @JsonProperty("topsCode")
    @JsonPropertyDescription("Lineage reference object : STVMAJR_TOPS_CODE, Lookup lineage reference object : stvtops")
    private String topsCode;
    /**
     * Lineage reference object : STVMAJR_AID_ELIGIBILITY_IND
     * 
     */
    @JsonProperty("aidEligibilityInd")
    @JsonPropertyDescription("Lineage reference object : STVMAJR_AID_ELIGIBILITY_IND")
    private String aidEligibilityInd;
    /**
     * Taxonomy of Program (TOP) Description
     * <p>
     * 
     * 
     */
    @JsonProperty("majrTopsCodeDesc")
    private String majrTopsCodeDesc;
    /**
     * CIPC
     * <p>
     * Lineage reference object : STVMAJR_CIPC_CODE, Lookup lineage reference object : stvcipc
     * 
     */
    @JsonProperty("cipcCode")
    @JsonPropertyDescription("Lineage reference object : STVMAJR_CIPC_CODE, Lookup lineage reference object : stvcipc")
    private String cipcCode;
    /**
     * Activity Date
     * <p>
     * Lineage reference object : STVMAJR_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    @JsonPropertyDescription("Lineage reference object : STVMAJR_ACTIVITY_DATE")
    private Date activityDate;
    /**
     * Lineage reference object : STVMAJR_VALID_MAJOR_IND
     * 
     */
    @JsonProperty("validMajorInd")
    @JsonPropertyDescription("Lineage reference object : STVMAJR_VALID_MAJOR_IND")
    private String validMajorInd;
    /**
     * Lineage reference object : STVMAJR_VALID_CONCENTRATN_IND
     * 
     */
    @JsonProperty("validConcentratnInd")
    @JsonPropertyDescription("Lineage reference object : STVMAJR_VALID_CONCENTRATN_IND")
    private String validConcentratnInd;
    /**
     * Voice Response Message Number
     * <p>
     * Lineage reference object : STVMAJR_VR_MSG_NO
     * 
     */
    @JsonProperty("vrMsgNo")
    @JsonPropertyDescription("Lineage reference object : STVMAJR_VR_MSG_NO")
    private Double vrMsgNo;
    /**
     * SEVIS Equivalent
     * <p>
     * Lineage reference object : STVMAJR_SEVIS_EQUIV
     * 
     */
    @JsonProperty("sevisEquiv")
    @JsonPropertyDescription("Lineage reference object : STVMAJR_SEVIS_EQUIV")
    private String sevisEquiv;
    /**
     * Description
     * <p>
     * Lineage reference object : STVMAJR_DESC
     * (Required)
     * 
     */
    @JsonProperty("desc")
    @JsonPropertyDescription("Lineage reference object : STVMAJR_DESC")
    private String desc;
    /**
     * Lineage reference object : STVMAJR_VALID_MINOR_IND
     * 
     */
    @JsonProperty("validMinorInd")
    @JsonPropertyDescription("Lineage reference object : STVMAJR_VALID_MINOR_IND")
    private String validMinorInd;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Lineage reference object : STVMAJR_OCCUPATION_IND
     * 
     */
    @JsonProperty("occupationInd")
    public String getOccupationInd() {
        return occupationInd;
    }

    /**
     * Lineage reference object : STVMAJR_OCCUPATION_IND
     * 
     */
    @JsonProperty("occupationInd")
    public void setOccupationInd(String occupationInd) {
        this.occupationInd = occupationInd;
    }

    public CaMajorMinorConcentrationCodes100GetResponse withOccupationInd(String occupationInd) {
        this.occupationInd = occupationInd;
        return this;
    }

    /**
     * Major Code
     * <p>
     * Lineage reference object : STVMAJR_CODE
     * (Required)
     * 
     */
    @JsonProperty("code")
    public String getCode() {
        return code;
    }

    /**
     * Major Code
     * <p>
     * Lineage reference object : STVMAJR_CODE
     * (Required)
     * 
     */
    @JsonProperty("code")
    public void setCode(String code) {
        this.code = code;
    }

    public CaMajorMinorConcentrationCodes100GetResponse withCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * Lineage reference object : STVMAJR_SYSTEM_REQ_IND
     * 
     */
    @JsonProperty("systemReqInd")
    public String getSystemReqInd() {
        return systemReqInd;
    }

    /**
     * Lineage reference object : STVMAJR_SYSTEM_REQ_IND
     * 
     */
    @JsonProperty("systemReqInd")
    public void setSystemReqInd(String systemReqInd) {
        this.systemReqInd = systemReqInd;
    }

    public CaMajorMinorConcentrationCodes100GetResponse withSystemReqInd(String systemReqInd) {
        this.systemReqInd = systemReqInd;
        return this;
    }

    /**
     * Taxonomy of Program (TOP) Code
     * <p>
     * Lineage reference object : STVMAJR_TOPS_CODE, Lookup lineage reference object : stvtops
     * (Required)
     * 
     */
    @JsonProperty("topsCode")
    public String getTopsCode() {
        return topsCode;
    }

    /**
     * Taxonomy of Program (TOP) Code
     * <p>
     * Lineage reference object : STVMAJR_TOPS_CODE, Lookup lineage reference object : stvtops
     * (Required)
     * 
     */
    @JsonProperty("topsCode")
    public void setTopsCode(String topsCode) {
        this.topsCode = topsCode;
    }

    public CaMajorMinorConcentrationCodes100GetResponse withTopsCode(String topsCode) {
        this.topsCode = topsCode;
        return this;
    }

    /**
     * Lineage reference object : STVMAJR_AID_ELIGIBILITY_IND
     * 
     */
    @JsonProperty("aidEligibilityInd")
    public String getAidEligibilityInd() {
        return aidEligibilityInd;
    }

    /**
     * Lineage reference object : STVMAJR_AID_ELIGIBILITY_IND
     * 
     */
    @JsonProperty("aidEligibilityInd")
    public void setAidEligibilityInd(String aidEligibilityInd) {
        this.aidEligibilityInd = aidEligibilityInd;
    }

    public CaMajorMinorConcentrationCodes100GetResponse withAidEligibilityInd(String aidEligibilityInd) {
        this.aidEligibilityInd = aidEligibilityInd;
        return this;
    }

    /**
     * Taxonomy of Program (TOP) Description
     * <p>
     * 
     * 
     */
    @JsonProperty("majrTopsCodeDesc")
    public String getMajrTopsCodeDesc() {
        return majrTopsCodeDesc;
    }

    /**
     * Taxonomy of Program (TOP) Description
     * <p>
     * 
     * 
     */
    @JsonProperty("majrTopsCodeDesc")
    public void setMajrTopsCodeDesc(String majrTopsCodeDesc) {
        this.majrTopsCodeDesc = majrTopsCodeDesc;
    }

    public CaMajorMinorConcentrationCodes100GetResponse withMajrTopsCodeDesc(String majrTopsCodeDesc) {
        this.majrTopsCodeDesc = majrTopsCodeDesc;
        return this;
    }

    /**
     * CIPC
     * <p>
     * Lineage reference object : STVMAJR_CIPC_CODE, Lookup lineage reference object : stvcipc
     * 
     */
    @JsonProperty("cipcCode")
    public String getCipcCode() {
        return cipcCode;
    }

    /**
     * CIPC
     * <p>
     * Lineage reference object : STVMAJR_CIPC_CODE, Lookup lineage reference object : stvcipc
     * 
     */
    @JsonProperty("cipcCode")
    public void setCipcCode(String cipcCode) {
        this.cipcCode = cipcCode;
    }

    public CaMajorMinorConcentrationCodes100GetResponse withCipcCode(String cipcCode) {
        this.cipcCode = cipcCode;
        return this;
    }

    /**
     * Activity Date
     * <p>
     * Lineage reference object : STVMAJR_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public Date getActivityDate() {
        return activityDate;
    }

    /**
     * Activity Date
     * <p>
     * Lineage reference object : STVMAJR_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public void setActivityDate(Date activityDate) {
        this.activityDate = activityDate;
    }

    public CaMajorMinorConcentrationCodes100GetResponse withActivityDate(Date activityDate) {
        this.activityDate = activityDate;
        return this;
    }

    /**
     * Lineage reference object : STVMAJR_VALID_MAJOR_IND
     * 
     */
    @JsonProperty("validMajorInd")
    public String getValidMajorInd() {
        return validMajorInd;
    }

    /**
     * Lineage reference object : STVMAJR_VALID_MAJOR_IND
     * 
     */
    @JsonProperty("validMajorInd")
    public void setValidMajorInd(String validMajorInd) {
        this.validMajorInd = validMajorInd;
    }

    public CaMajorMinorConcentrationCodes100GetResponse withValidMajorInd(String validMajorInd) {
        this.validMajorInd = validMajorInd;
        return this;
    }

    /**
     * Lineage reference object : STVMAJR_VALID_CONCENTRATN_IND
     * 
     */
    @JsonProperty("validConcentratnInd")
    public String getValidConcentratnInd() {
        return validConcentratnInd;
    }

    /**
     * Lineage reference object : STVMAJR_VALID_CONCENTRATN_IND
     * 
     */
    @JsonProperty("validConcentratnInd")
    public void setValidConcentratnInd(String validConcentratnInd) {
        this.validConcentratnInd = validConcentratnInd;
    }

    public CaMajorMinorConcentrationCodes100GetResponse withValidConcentratnInd(String validConcentratnInd) {
        this.validConcentratnInd = validConcentratnInd;
        return this;
    }

    /**
     * Voice Response Message Number
     * <p>
     * Lineage reference object : STVMAJR_VR_MSG_NO
     * 
     */
    @JsonProperty("vrMsgNo")
    public Double getVrMsgNo() {
        return vrMsgNo;
    }

    /**
     * Voice Response Message Number
     * <p>
     * Lineage reference object : STVMAJR_VR_MSG_NO
     * 
     */
    @JsonProperty("vrMsgNo")
    public void setVrMsgNo(Double vrMsgNo) {
        this.vrMsgNo = vrMsgNo;
    }

    public CaMajorMinorConcentrationCodes100GetResponse withVrMsgNo(Double vrMsgNo) {
        this.vrMsgNo = vrMsgNo;
        return this;
    }

    /**
     * SEVIS Equivalent
     * <p>
     * Lineage reference object : STVMAJR_SEVIS_EQUIV
     * 
     */
    @JsonProperty("sevisEquiv")
    public String getSevisEquiv() {
        return sevisEquiv;
    }

    /**
     * SEVIS Equivalent
     * <p>
     * Lineage reference object : STVMAJR_SEVIS_EQUIV
     * 
     */
    @JsonProperty("sevisEquiv")
    public void setSevisEquiv(String sevisEquiv) {
        this.sevisEquiv = sevisEquiv;
    }

    public CaMajorMinorConcentrationCodes100GetResponse withSevisEquiv(String sevisEquiv) {
        this.sevisEquiv = sevisEquiv;
        return this;
    }

    /**
     * Description
     * <p>
     * Lineage reference object : STVMAJR_DESC
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
     * Lineage reference object : STVMAJR_DESC
     * (Required)
     * 
     */
    @JsonProperty("desc")
    public void setDesc(String desc) {
        this.desc = desc;
    }

    public CaMajorMinorConcentrationCodes100GetResponse withDesc(String desc) {
        this.desc = desc;
        return this;
    }

    /**
     * Lineage reference object : STVMAJR_VALID_MINOR_IND
     * 
     */
    @JsonProperty("validMinorInd")
    public String getValidMinorInd() {
        return validMinorInd;
    }

    /**
     * Lineage reference object : STVMAJR_VALID_MINOR_IND
     * 
     */
    @JsonProperty("validMinorInd")
    public void setValidMinorInd(String validMinorInd) {
        this.validMinorInd = validMinorInd;
    }

    public CaMajorMinorConcentrationCodes100GetResponse withValidMinorInd(String validMinorInd) {
        this.validMinorInd = validMinorInd;
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

    public CaMajorMinorConcentrationCodes100GetResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(CaMajorMinorConcentrationCodes100GetResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("occupationInd");
        sb.append('=');
        sb.append(((this.occupationInd == null)?"<null>":this.occupationInd));
        sb.append(',');
        sb.append("code");
        sb.append('=');
        sb.append(((this.code == null)?"<null>":this.code));
        sb.append(',');
        sb.append("systemReqInd");
        sb.append('=');
        sb.append(((this.systemReqInd == null)?"<null>":this.systemReqInd));
        sb.append(',');
        sb.append("topsCode");
        sb.append('=');
        sb.append(((this.topsCode == null)?"<null>":this.topsCode));
        sb.append(',');
        sb.append("aidEligibilityInd");
        sb.append('=');
        sb.append(((this.aidEligibilityInd == null)?"<null>":this.aidEligibilityInd));
        sb.append(',');
        sb.append("majrTopsCodeDesc");
        sb.append('=');
        sb.append(((this.majrTopsCodeDesc == null)?"<null>":this.majrTopsCodeDesc));
        sb.append(',');
        sb.append("cipcCode");
        sb.append('=');
        sb.append(((this.cipcCode == null)?"<null>":this.cipcCode));
        sb.append(',');
        sb.append("activityDate");
        sb.append('=');
        sb.append(((this.activityDate == null)?"<null>":this.activityDate));
        sb.append(',');
        sb.append("validMajorInd");
        sb.append('=');
        sb.append(((this.validMajorInd == null)?"<null>":this.validMajorInd));
        sb.append(',');
        sb.append("validConcentratnInd");
        sb.append('=');
        sb.append(((this.validConcentratnInd == null)?"<null>":this.validConcentratnInd));
        sb.append(',');
        sb.append("vrMsgNo");
        sb.append('=');
        sb.append(((this.vrMsgNo == null)?"<null>":this.vrMsgNo));
        sb.append(',');
        sb.append("sevisEquiv");
        sb.append('=');
        sb.append(((this.sevisEquiv == null)?"<null>":this.sevisEquiv));
        sb.append(',');
        sb.append("desc");
        sb.append('=');
        sb.append(((this.desc == null)?"<null>":this.desc));
        sb.append(',');
        sb.append("validMinorInd");
        sb.append('=');
        sb.append(((this.validMinorInd == null)?"<null>":this.validMinorInd));
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
        result = ((result* 31)+((this.occupationInd == null)? 0 :this.occupationInd.hashCode()));
        result = ((result* 31)+((this.code == null)? 0 :this.code.hashCode()));
        result = ((result* 31)+((this.systemReqInd == null)? 0 :this.systemReqInd.hashCode()));
        result = ((result* 31)+((this.topsCode == null)? 0 :this.topsCode.hashCode()));
        result = ((result* 31)+((this.aidEligibilityInd == null)? 0 :this.aidEligibilityInd.hashCode()));
        result = ((result* 31)+((this.majrTopsCodeDesc == null)? 0 :this.majrTopsCodeDesc.hashCode()));
        result = ((result* 31)+((this.cipcCode == null)? 0 :this.cipcCode.hashCode()));
        result = ((result* 31)+((this.activityDate == null)? 0 :this.activityDate.hashCode()));
        result = ((result* 31)+((this.validMajorInd == null)? 0 :this.validMajorInd.hashCode()));
        result = ((result* 31)+((this.validConcentratnInd == null)? 0 :this.validConcentratnInd.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.vrMsgNo == null)? 0 :this.vrMsgNo.hashCode()));
        result = ((result* 31)+((this.sevisEquiv == null)? 0 :this.sevisEquiv.hashCode()));
        result = ((result* 31)+((this.desc == null)? 0 :this.desc.hashCode()));
        result = ((result* 31)+((this.validMinorInd == null)? 0 :this.validMinorInd.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof CaMajorMinorConcentrationCodes100GetResponse) == false) {
            return false;
        }
        CaMajorMinorConcentrationCodes100GetResponse rhs = ((CaMajorMinorConcentrationCodes100GetResponse) other);
        return ((((((((((((((((this.occupationInd == rhs.occupationInd)||((this.occupationInd!= null)&&this.occupationInd.equals(rhs.occupationInd)))&&((this.code == rhs.code)||((this.code!= null)&&this.code.equals(rhs.code))))&&((this.systemReqInd == rhs.systemReqInd)||((this.systemReqInd!= null)&&this.systemReqInd.equals(rhs.systemReqInd))))&&((this.topsCode == rhs.topsCode)||((this.topsCode!= null)&&this.topsCode.equals(rhs.topsCode))))&&((this.aidEligibilityInd == rhs.aidEligibilityInd)||((this.aidEligibilityInd!= null)&&this.aidEligibilityInd.equals(rhs.aidEligibilityInd))))&&((this.majrTopsCodeDesc == rhs.majrTopsCodeDesc)||((this.majrTopsCodeDesc!= null)&&this.majrTopsCodeDesc.equals(rhs.majrTopsCodeDesc))))&&((this.cipcCode == rhs.cipcCode)||((this.cipcCode!= null)&&this.cipcCode.equals(rhs.cipcCode))))&&((this.activityDate == rhs.activityDate)||((this.activityDate!= null)&&this.activityDate.equals(rhs.activityDate))))&&((this.validMajorInd == rhs.validMajorInd)||((this.validMajorInd!= null)&&this.validMajorInd.equals(rhs.validMajorInd))))&&((this.validConcentratnInd == rhs.validConcentratnInd)||((this.validConcentratnInd!= null)&&this.validConcentratnInd.equals(rhs.validConcentratnInd))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.vrMsgNo == rhs.vrMsgNo)||((this.vrMsgNo!= null)&&this.vrMsgNo.equals(rhs.vrMsgNo))))&&((this.sevisEquiv == rhs.sevisEquiv)||((this.sevisEquiv!= null)&&this.sevisEquiv.equals(rhs.sevisEquiv))))&&((this.desc == rhs.desc)||((this.desc!= null)&&this.desc.equals(rhs.desc))))&&((this.validMinorInd == rhs.validMinorInd)||((this.validMinorInd!= null)&&this.validMinorInd.equals(rhs.validMinorInd))));
    }

}
