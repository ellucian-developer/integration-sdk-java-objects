
package com.ellucian.generated.bpapi.ban.ca_residence_codes.v1_0_0;

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
    "inStateInd",
    "activityDate",
    "code",
    "bogwEligInd",
    "systemReqInd",
    "ediEquiv",
    "vrMsgNo",
    "foreignInd",
    "desc"
})
@Generated("jsonschema2pojo")
public class CaResidenceCodes100GetResponse {

    /**
     * Lineage reference object : STVRESD_IN_STATE_IND
     * 
     */
    @JsonProperty("inStateInd")
    @JsonPropertyDescription("Lineage reference object : STVRESD_IN_STATE_IND")
    private String inStateInd;
    /**
     * Activity Date
     * <p>
     * Lineage reference object : STVRESD_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    @JsonPropertyDescription("Lineage reference object : STVRESD_ACTIVITY_DATE")
    private Date activityDate;
    /**
     * Lineage reference object : STVRESD_CODE
     * (Required)
     * 
     */
    @JsonProperty("code")
    @JsonPropertyDescription("Lineage reference object : STVRESD_CODE")
    private String code;
    /**
     * Lineage reference object : STVRESD_BOGW_ELIG_IND
     * 
     */
    @JsonProperty("bogwEligInd")
    @JsonPropertyDescription("Lineage reference object : STVRESD_BOGW_ELIG_IND")
    private String bogwEligInd;
    /**
     * Lineage reference object : STVRESD_SYSTEM_REQ_IND
     * 
     */
    @JsonProperty("systemReqInd")
    @JsonPropertyDescription("Lineage reference object : STVRESD_SYSTEM_REQ_IND")
    private String systemReqInd;
    /**
     * EDI Equiv
     * <p>
     * Lineage reference object : STVRESD_EDI_EQUIV
     * 
     */
    @JsonProperty("ediEquiv")
    @JsonPropertyDescription("Lineage reference object : STVRESD_EDI_EQUIV")
    private String ediEquiv;
    /**
     * VR Msg
     * <p>
     * Lineage reference object : STVRESD_VR_MSG_NO
     * 
     */
    @JsonProperty("vrMsgNo")
    @JsonPropertyDescription("Lineage reference object : STVRESD_VR_MSG_NO")
    private Double vrMsgNo;
    /**
     * Lineage reference object : STVRESD_FOREIGN_IND
     * 
     */
    @JsonProperty("foreignInd")
    @JsonPropertyDescription("Lineage reference object : STVRESD_FOREIGN_IND")
    private String foreignInd;
    /**
     * Description
     * <p>
     * Lineage reference object : STVRESD_DESC
     * (Required)
     * 
     */
    @JsonProperty("desc")
    @JsonPropertyDescription("Lineage reference object : STVRESD_DESC")
    private String desc;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Lineage reference object : STVRESD_IN_STATE_IND
     * 
     */
    @JsonProperty("inStateInd")
    public String getInStateInd() {
        return inStateInd;
    }

    /**
     * Lineage reference object : STVRESD_IN_STATE_IND
     * 
     */
    @JsonProperty("inStateInd")
    public void setInStateInd(String inStateInd) {
        this.inStateInd = inStateInd;
    }

    public CaResidenceCodes100GetResponse withInStateInd(String inStateInd) {
        this.inStateInd = inStateInd;
        return this;
    }

    /**
     * Activity Date
     * <p>
     * Lineage reference object : STVRESD_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public Date getActivityDate() {
        return activityDate;
    }

    /**
     * Activity Date
     * <p>
     * Lineage reference object : STVRESD_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public void setActivityDate(Date activityDate) {
        this.activityDate = activityDate;
    }

    public CaResidenceCodes100GetResponse withActivityDate(Date activityDate) {
        this.activityDate = activityDate;
        return this;
    }

    /**
     * Lineage reference object : STVRESD_CODE
     * (Required)
     * 
     */
    @JsonProperty("code")
    public String getCode() {
        return code;
    }

    /**
     * Lineage reference object : STVRESD_CODE
     * (Required)
     * 
     */
    @JsonProperty("code")
    public void setCode(String code) {
        this.code = code;
    }

    public CaResidenceCodes100GetResponse withCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * Lineage reference object : STVRESD_BOGW_ELIG_IND
     * 
     */
    @JsonProperty("bogwEligInd")
    public String getBogwEligInd() {
        return bogwEligInd;
    }

    /**
     * Lineage reference object : STVRESD_BOGW_ELIG_IND
     * 
     */
    @JsonProperty("bogwEligInd")
    public void setBogwEligInd(String bogwEligInd) {
        this.bogwEligInd = bogwEligInd;
    }

    public CaResidenceCodes100GetResponse withBogwEligInd(String bogwEligInd) {
        this.bogwEligInd = bogwEligInd;
        return this;
    }

    /**
     * Lineage reference object : STVRESD_SYSTEM_REQ_IND
     * 
     */
    @JsonProperty("systemReqInd")
    public String getSystemReqInd() {
        return systemReqInd;
    }

    /**
     * Lineage reference object : STVRESD_SYSTEM_REQ_IND
     * 
     */
    @JsonProperty("systemReqInd")
    public void setSystemReqInd(String systemReqInd) {
        this.systemReqInd = systemReqInd;
    }

    public CaResidenceCodes100GetResponse withSystemReqInd(String systemReqInd) {
        this.systemReqInd = systemReqInd;
        return this;
    }

    /**
     * EDI Equiv
     * <p>
     * Lineage reference object : STVRESD_EDI_EQUIV
     * 
     */
    @JsonProperty("ediEquiv")
    public String getEdiEquiv() {
        return ediEquiv;
    }

    /**
     * EDI Equiv
     * <p>
     * Lineage reference object : STVRESD_EDI_EQUIV
     * 
     */
    @JsonProperty("ediEquiv")
    public void setEdiEquiv(String ediEquiv) {
        this.ediEquiv = ediEquiv;
    }

    public CaResidenceCodes100GetResponse withEdiEquiv(String ediEquiv) {
        this.ediEquiv = ediEquiv;
        return this;
    }

    /**
     * VR Msg
     * <p>
     * Lineage reference object : STVRESD_VR_MSG_NO
     * 
     */
    @JsonProperty("vrMsgNo")
    public Double getVrMsgNo() {
        return vrMsgNo;
    }

    /**
     * VR Msg
     * <p>
     * Lineage reference object : STVRESD_VR_MSG_NO
     * 
     */
    @JsonProperty("vrMsgNo")
    public void setVrMsgNo(Double vrMsgNo) {
        this.vrMsgNo = vrMsgNo;
    }

    public CaResidenceCodes100GetResponse withVrMsgNo(Double vrMsgNo) {
        this.vrMsgNo = vrMsgNo;
        return this;
    }

    /**
     * Lineage reference object : STVRESD_FOREIGN_IND
     * 
     */
    @JsonProperty("foreignInd")
    public String getForeignInd() {
        return foreignInd;
    }

    /**
     * Lineage reference object : STVRESD_FOREIGN_IND
     * 
     */
    @JsonProperty("foreignInd")
    public void setForeignInd(String foreignInd) {
        this.foreignInd = foreignInd;
    }

    public CaResidenceCodes100GetResponse withForeignInd(String foreignInd) {
        this.foreignInd = foreignInd;
        return this;
    }

    /**
     * Description
     * <p>
     * Lineage reference object : STVRESD_DESC
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
     * Lineage reference object : STVRESD_DESC
     * (Required)
     * 
     */
    @JsonProperty("desc")
    public void setDesc(String desc) {
        this.desc = desc;
    }

    public CaResidenceCodes100GetResponse withDesc(String desc) {
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

    public CaResidenceCodes100GetResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(CaResidenceCodes100GetResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("inStateInd");
        sb.append('=');
        sb.append(((this.inStateInd == null)?"<null>":this.inStateInd));
        sb.append(',');
        sb.append("activityDate");
        sb.append('=');
        sb.append(((this.activityDate == null)?"<null>":this.activityDate));
        sb.append(',');
        sb.append("code");
        sb.append('=');
        sb.append(((this.code == null)?"<null>":this.code));
        sb.append(',');
        sb.append("bogwEligInd");
        sb.append('=');
        sb.append(((this.bogwEligInd == null)?"<null>":this.bogwEligInd));
        sb.append(',');
        sb.append("systemReqInd");
        sb.append('=');
        sb.append(((this.systemReqInd == null)?"<null>":this.systemReqInd));
        sb.append(',');
        sb.append("ediEquiv");
        sb.append('=');
        sb.append(((this.ediEquiv == null)?"<null>":this.ediEquiv));
        sb.append(',');
        sb.append("vrMsgNo");
        sb.append('=');
        sb.append(((this.vrMsgNo == null)?"<null>":this.vrMsgNo));
        sb.append(',');
        sb.append("foreignInd");
        sb.append('=');
        sb.append(((this.foreignInd == null)?"<null>":this.foreignInd));
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
        result = ((result* 31)+((this.inStateInd == null)? 0 :this.inStateInd.hashCode()));
        result = ((result* 31)+((this.activityDate == null)? 0 :this.activityDate.hashCode()));
        result = ((result* 31)+((this.code == null)? 0 :this.code.hashCode()));
        result = ((result* 31)+((this.bogwEligInd == null)? 0 :this.bogwEligInd.hashCode()));
        result = ((result* 31)+((this.systemReqInd == null)? 0 :this.systemReqInd.hashCode()));
        result = ((result* 31)+((this.ediEquiv == null)? 0 :this.ediEquiv.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.vrMsgNo == null)? 0 :this.vrMsgNo.hashCode()));
        result = ((result* 31)+((this.foreignInd == null)? 0 :this.foreignInd.hashCode()));
        result = ((result* 31)+((this.desc == null)? 0 :this.desc.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof CaResidenceCodes100GetResponse) == false) {
            return false;
        }
        CaResidenceCodes100GetResponse rhs = ((CaResidenceCodes100GetResponse) other);
        return (((((((((((this.inStateInd == rhs.inStateInd)||((this.inStateInd!= null)&&this.inStateInd.equals(rhs.inStateInd)))&&((this.activityDate == rhs.activityDate)||((this.activityDate!= null)&&this.activityDate.equals(rhs.activityDate))))&&((this.code == rhs.code)||((this.code!= null)&&this.code.equals(rhs.code))))&&((this.bogwEligInd == rhs.bogwEligInd)||((this.bogwEligInd!= null)&&this.bogwEligInd.equals(rhs.bogwEligInd))))&&((this.systemReqInd == rhs.systemReqInd)||((this.systemReqInd!= null)&&this.systemReqInd.equals(rhs.systemReqInd))))&&((this.ediEquiv == rhs.ediEquiv)||((this.ediEquiv!= null)&&this.ediEquiv.equals(rhs.ediEquiv))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.vrMsgNo == rhs.vrMsgNo)||((this.vrMsgNo!= null)&&this.vrMsgNo.equals(rhs.vrMsgNo))))&&((this.foreignInd == rhs.foreignInd)||((this.foreignInd!= null)&&this.foreignInd.equals(rhs.foreignInd))))&&((this.desc == rhs.desc)||((this.desc!= null)&&this.desc.equals(rhs.desc))));
    }

}
