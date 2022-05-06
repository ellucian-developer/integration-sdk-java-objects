
package com.ellucian.generated.bpapi.ban.cipc_codes.v1_0_0;

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
    "cipcCInd",
    "code",
    "activityDate",
    "cipcAInd",
    "cipcBInd",
    "pubYear",
    "sp04ProgramCde",
    "desc"
})
@Generated("jsonschema2pojo")
public class CipcCodes100GetRequest {

    /**
     * Lineage reference object : STVCIPC_CIPC_C_IND
     * 
     */
    @JsonProperty("cipcCInd")
    @JsonPropertyDescription("Lineage reference object : STVCIPC_CIPC_C_IND")
    private String cipcCInd;
    /**
     * Code
     * <p>
     * Lineage reference object : STVCIPC_CODE
     * (Required)
     * 
     */
    @JsonProperty("code")
    @JsonPropertyDescription("Lineage reference object : STVCIPC_CODE")
    private String code;
    /**
     * Activity Date
     * <p>
     * Lineage reference object : STVCIPC_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    @JsonPropertyDescription("Lineage reference object : STVCIPC_ACTIVITY_DATE")
    private Date activityDate;
    /**
     * Lineage reference object : STVCIPC_CIPC_A_IND
     * 
     */
    @JsonProperty("cipcAInd")
    @JsonPropertyDescription("Lineage reference object : STVCIPC_CIPC_A_IND")
    private String cipcAInd;
    /**
     * Lineage reference object : STVCIPC_CIPC_B_IND
     * 
     */
    @JsonProperty("cipcBInd")
    @JsonPropertyDescription("Lineage reference object : STVCIPC_CIPC_B_IND")
    private String cipcBInd;
    /**
     * Publication Year
     * <p>
     * Lineage reference object : STVCIPC_PUB_YEAR
     * (Required)
     * 
     */
    @JsonProperty("pubYear")
    @JsonPropertyDescription("Lineage reference object : STVCIPC_PUB_YEAR")
    private Double pubYear;
    /**
     * Co-unique Code
     * <p>
     * Lineage reference object : STVCIPC_SP04_PROGRAM_CDE
     * 
     */
    @JsonProperty("sp04ProgramCde")
    @JsonPropertyDescription("Lineage reference object : STVCIPC_SP04_PROGRAM_CDE")
    private String sp04ProgramCde;
    /**
     * Description
     * <p>
     * Lineage reference object : STVCIPC_DESC
     * (Required)
     * 
     */
    @JsonProperty("desc")
    @JsonPropertyDescription("Lineage reference object : STVCIPC_DESC")
    private String desc;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Lineage reference object : STVCIPC_CIPC_C_IND
     * 
     */
    @JsonProperty("cipcCInd")
    public String getCipcCInd() {
        return cipcCInd;
    }

    /**
     * Lineage reference object : STVCIPC_CIPC_C_IND
     * 
     */
    @JsonProperty("cipcCInd")
    public void setCipcCInd(String cipcCInd) {
        this.cipcCInd = cipcCInd;
    }

    public CipcCodes100GetRequest withCipcCInd(String cipcCInd) {
        this.cipcCInd = cipcCInd;
        return this;
    }

    /**
     * Code
     * <p>
     * Lineage reference object : STVCIPC_CODE
     * (Required)
     * 
     */
    @JsonProperty("code")
    public String getCode() {
        return code;
    }

    /**
     * Code
     * <p>
     * Lineage reference object : STVCIPC_CODE
     * (Required)
     * 
     */
    @JsonProperty("code")
    public void setCode(String code) {
        this.code = code;
    }

    public CipcCodes100GetRequest withCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * Activity Date
     * <p>
     * Lineage reference object : STVCIPC_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public Date getActivityDate() {
        return activityDate;
    }

    /**
     * Activity Date
     * <p>
     * Lineage reference object : STVCIPC_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public void setActivityDate(Date activityDate) {
        this.activityDate = activityDate;
    }

    public CipcCodes100GetRequest withActivityDate(Date activityDate) {
        this.activityDate = activityDate;
        return this;
    }

    /**
     * Lineage reference object : STVCIPC_CIPC_A_IND
     * 
     */
    @JsonProperty("cipcAInd")
    public String getCipcAInd() {
        return cipcAInd;
    }

    /**
     * Lineage reference object : STVCIPC_CIPC_A_IND
     * 
     */
    @JsonProperty("cipcAInd")
    public void setCipcAInd(String cipcAInd) {
        this.cipcAInd = cipcAInd;
    }

    public CipcCodes100GetRequest withCipcAInd(String cipcAInd) {
        this.cipcAInd = cipcAInd;
        return this;
    }

    /**
     * Lineage reference object : STVCIPC_CIPC_B_IND
     * 
     */
    @JsonProperty("cipcBInd")
    public String getCipcBInd() {
        return cipcBInd;
    }

    /**
     * Lineage reference object : STVCIPC_CIPC_B_IND
     * 
     */
    @JsonProperty("cipcBInd")
    public void setCipcBInd(String cipcBInd) {
        this.cipcBInd = cipcBInd;
    }

    public CipcCodes100GetRequest withCipcBInd(String cipcBInd) {
        this.cipcBInd = cipcBInd;
        return this;
    }

    /**
     * Publication Year
     * <p>
     * Lineage reference object : STVCIPC_PUB_YEAR
     * (Required)
     * 
     */
    @JsonProperty("pubYear")
    public Double getPubYear() {
        return pubYear;
    }

    /**
     * Publication Year
     * <p>
     * Lineage reference object : STVCIPC_PUB_YEAR
     * (Required)
     * 
     */
    @JsonProperty("pubYear")
    public void setPubYear(Double pubYear) {
        this.pubYear = pubYear;
    }

    public CipcCodes100GetRequest withPubYear(Double pubYear) {
        this.pubYear = pubYear;
        return this;
    }

    /**
     * Co-unique Code
     * <p>
     * Lineage reference object : STVCIPC_SP04_PROGRAM_CDE
     * 
     */
    @JsonProperty("sp04ProgramCde")
    public String getSp04ProgramCde() {
        return sp04ProgramCde;
    }

    /**
     * Co-unique Code
     * <p>
     * Lineage reference object : STVCIPC_SP04_PROGRAM_CDE
     * 
     */
    @JsonProperty("sp04ProgramCde")
    public void setSp04ProgramCde(String sp04ProgramCde) {
        this.sp04ProgramCde = sp04ProgramCde;
    }

    public CipcCodes100GetRequest withSp04ProgramCde(String sp04ProgramCde) {
        this.sp04ProgramCde = sp04ProgramCde;
        return this;
    }

    /**
     * Description
     * <p>
     * Lineage reference object : STVCIPC_DESC
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
     * Lineage reference object : STVCIPC_DESC
     * (Required)
     * 
     */
    @JsonProperty("desc")
    public void setDesc(String desc) {
        this.desc = desc;
    }

    public CipcCodes100GetRequest withDesc(String desc) {
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

    public CipcCodes100GetRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(CipcCodes100GetRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("cipcCInd");
        sb.append('=');
        sb.append(((this.cipcCInd == null)?"<null>":this.cipcCInd));
        sb.append(',');
        sb.append("code");
        sb.append('=');
        sb.append(((this.code == null)?"<null>":this.code));
        sb.append(',');
        sb.append("activityDate");
        sb.append('=');
        sb.append(((this.activityDate == null)?"<null>":this.activityDate));
        sb.append(',');
        sb.append("cipcAInd");
        sb.append('=');
        sb.append(((this.cipcAInd == null)?"<null>":this.cipcAInd));
        sb.append(',');
        sb.append("cipcBInd");
        sb.append('=');
        sb.append(((this.cipcBInd == null)?"<null>":this.cipcBInd));
        sb.append(',');
        sb.append("pubYear");
        sb.append('=');
        sb.append(((this.pubYear == null)?"<null>":this.pubYear));
        sb.append(',');
        sb.append("sp04ProgramCde");
        sb.append('=');
        sb.append(((this.sp04ProgramCde == null)?"<null>":this.sp04ProgramCde));
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
        result = ((result* 31)+((this.cipcCInd == null)? 0 :this.cipcCInd.hashCode()));
        result = ((result* 31)+((this.code == null)? 0 :this.code.hashCode()));
        result = ((result* 31)+((this.activityDate == null)? 0 :this.activityDate.hashCode()));
        result = ((result* 31)+((this.cipcAInd == null)? 0 :this.cipcAInd.hashCode()));
        result = ((result* 31)+((this.cipcBInd == null)? 0 :this.cipcBInd.hashCode()));
        result = ((result* 31)+((this.pubYear == null)? 0 :this.pubYear.hashCode()));
        result = ((result* 31)+((this.sp04ProgramCde == null)? 0 :this.sp04ProgramCde.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.desc == null)? 0 :this.desc.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof CipcCodes100GetRequest) == false) {
            return false;
        }
        CipcCodes100GetRequest rhs = ((CipcCodes100GetRequest) other);
        return ((((((((((this.cipcCInd == rhs.cipcCInd)||((this.cipcCInd!= null)&&this.cipcCInd.equals(rhs.cipcCInd)))&&((this.code == rhs.code)||((this.code!= null)&&this.code.equals(rhs.code))))&&((this.activityDate == rhs.activityDate)||((this.activityDate!= null)&&this.activityDate.equals(rhs.activityDate))))&&((this.cipcAInd == rhs.cipcAInd)||((this.cipcAInd!= null)&&this.cipcAInd.equals(rhs.cipcAInd))))&&((this.cipcBInd == rhs.cipcBInd)||((this.cipcBInd!= null)&&this.cipcBInd.equals(rhs.cipcBInd))))&&((this.pubYear == rhs.pubYear)||((this.pubYear!= null)&&this.pubYear.equals(rhs.pubYear))))&&((this.sp04ProgramCde == rhs.sp04ProgramCde)||((this.sp04ProgramCde!= null)&&this.sp04ProgramCde.equals(rhs.sp04ProgramCde))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.desc == rhs.desc)||((this.desc!= null)&&this.desc.equals(rhs.desc))));
    }

}
