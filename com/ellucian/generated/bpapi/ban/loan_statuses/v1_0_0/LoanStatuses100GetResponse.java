
package com.ellucian.generated.bpapi.ban.loan_statuses.v1_0_0;

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
    "holdInd",
    "activityDate",
    "code",
    "infoAccessInd",
    "vrMsgNo",
    "desc",
    "inactiveInd"
})
@Generated("jsonschema2pojo")
public class LoanStatuses100GetResponse {

    /**
     * Lineage reference object : RTVLNST_HOLD_IND
     * 
     */
    @JsonProperty("holdInd")
    @JsonPropertyDescription("Lineage reference object : RTVLNST_HOLD_IND")
    private String holdInd;
    /**
     * Activity Date
     * <p>
     * Lineage reference object : RTVLNST_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    @JsonPropertyDescription("Lineage reference object : RTVLNST_ACTIVITY_DATE")
    private Date activityDate;
    /**
     * Loan Status
     * <p>
     * Lineage reference object : RTVLNST_CODE
     * (Required)
     * 
     */
    @JsonProperty("code")
    @JsonPropertyDescription("Lineage reference object : RTVLNST_CODE")
    private String code;
    /**
     * Lineage reference object : RTVLNST_INFO_ACCESS_IND
     * 
     */
    @JsonProperty("infoAccessInd")
    @JsonPropertyDescription("Lineage reference object : RTVLNST_INFO_ACCESS_IND")
    private String infoAccessInd;
    /**
     * VR Msg No
     * <p>
     * Lineage reference object : RTVLNST_VR_MSG_NO
     * 
     */
    @JsonProperty("vrMsgNo")
    @JsonPropertyDescription("Lineage reference object : RTVLNST_VR_MSG_NO")
    private Double vrMsgNo;
    /**
     * Loan Description
     * <p>
     * Lineage reference object : RTVLNST_DESC
     * (Required)
     * 
     */
    @JsonProperty("desc")
    @JsonPropertyDescription("Lineage reference object : RTVLNST_DESC")
    private String desc;
    /**
     * Lineage reference object : RTVLNST_INACTIVE_IND
     * 
     */
    @JsonProperty("inactiveInd")
    @JsonPropertyDescription("Lineage reference object : RTVLNST_INACTIVE_IND")
    private String inactiveInd;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Lineage reference object : RTVLNST_HOLD_IND
     * 
     */
    @JsonProperty("holdInd")
    public String getHoldInd() {
        return holdInd;
    }

    /**
     * Lineage reference object : RTVLNST_HOLD_IND
     * 
     */
    @JsonProperty("holdInd")
    public void setHoldInd(String holdInd) {
        this.holdInd = holdInd;
    }

    public LoanStatuses100GetResponse withHoldInd(String holdInd) {
        this.holdInd = holdInd;
        return this;
    }

    /**
     * Activity Date
     * <p>
     * Lineage reference object : RTVLNST_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public Date getActivityDate() {
        return activityDate;
    }

    /**
     * Activity Date
     * <p>
     * Lineage reference object : RTVLNST_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public void setActivityDate(Date activityDate) {
        this.activityDate = activityDate;
    }

    public LoanStatuses100GetResponse withActivityDate(Date activityDate) {
        this.activityDate = activityDate;
        return this;
    }

    /**
     * Loan Status
     * <p>
     * Lineage reference object : RTVLNST_CODE
     * (Required)
     * 
     */
    @JsonProperty("code")
    public String getCode() {
        return code;
    }

    /**
     * Loan Status
     * <p>
     * Lineage reference object : RTVLNST_CODE
     * (Required)
     * 
     */
    @JsonProperty("code")
    public void setCode(String code) {
        this.code = code;
    }

    public LoanStatuses100GetResponse withCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * Lineage reference object : RTVLNST_INFO_ACCESS_IND
     * 
     */
    @JsonProperty("infoAccessInd")
    public String getInfoAccessInd() {
        return infoAccessInd;
    }

    /**
     * Lineage reference object : RTVLNST_INFO_ACCESS_IND
     * 
     */
    @JsonProperty("infoAccessInd")
    public void setInfoAccessInd(String infoAccessInd) {
        this.infoAccessInd = infoAccessInd;
    }

    public LoanStatuses100GetResponse withInfoAccessInd(String infoAccessInd) {
        this.infoAccessInd = infoAccessInd;
        return this;
    }

    /**
     * VR Msg No
     * <p>
     * Lineage reference object : RTVLNST_VR_MSG_NO
     * 
     */
    @JsonProperty("vrMsgNo")
    public Double getVrMsgNo() {
        return vrMsgNo;
    }

    /**
     * VR Msg No
     * <p>
     * Lineage reference object : RTVLNST_VR_MSG_NO
     * 
     */
    @JsonProperty("vrMsgNo")
    public void setVrMsgNo(Double vrMsgNo) {
        this.vrMsgNo = vrMsgNo;
    }

    public LoanStatuses100GetResponse withVrMsgNo(Double vrMsgNo) {
        this.vrMsgNo = vrMsgNo;
        return this;
    }

    /**
     * Loan Description
     * <p>
     * Lineage reference object : RTVLNST_DESC
     * (Required)
     * 
     */
    @JsonProperty("desc")
    public String getDesc() {
        return desc;
    }

    /**
     * Loan Description
     * <p>
     * Lineage reference object : RTVLNST_DESC
     * (Required)
     * 
     */
    @JsonProperty("desc")
    public void setDesc(String desc) {
        this.desc = desc;
    }

    public LoanStatuses100GetResponse withDesc(String desc) {
        this.desc = desc;
        return this;
    }

    /**
     * Lineage reference object : RTVLNST_INACTIVE_IND
     * 
     */
    @JsonProperty("inactiveInd")
    public String getInactiveInd() {
        return inactiveInd;
    }

    /**
     * Lineage reference object : RTVLNST_INACTIVE_IND
     * 
     */
    @JsonProperty("inactiveInd")
    public void setInactiveInd(String inactiveInd) {
        this.inactiveInd = inactiveInd;
    }

    public LoanStatuses100GetResponse withInactiveInd(String inactiveInd) {
        this.inactiveInd = inactiveInd;
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

    public LoanStatuses100GetResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(LoanStatuses100GetResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("holdInd");
        sb.append('=');
        sb.append(((this.holdInd == null)?"<null>":this.holdInd));
        sb.append(',');
        sb.append("activityDate");
        sb.append('=');
        sb.append(((this.activityDate == null)?"<null>":this.activityDate));
        sb.append(',');
        sb.append("code");
        sb.append('=');
        sb.append(((this.code == null)?"<null>":this.code));
        sb.append(',');
        sb.append("infoAccessInd");
        sb.append('=');
        sb.append(((this.infoAccessInd == null)?"<null>":this.infoAccessInd));
        sb.append(',');
        sb.append("vrMsgNo");
        sb.append('=');
        sb.append(((this.vrMsgNo == null)?"<null>":this.vrMsgNo));
        sb.append(',');
        sb.append("desc");
        sb.append('=');
        sb.append(((this.desc == null)?"<null>":this.desc));
        sb.append(',');
        sb.append("inactiveInd");
        sb.append('=');
        sb.append(((this.inactiveInd == null)?"<null>":this.inactiveInd));
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
        result = ((result* 31)+((this.holdInd == null)? 0 :this.holdInd.hashCode()));
        result = ((result* 31)+((this.activityDate == null)? 0 :this.activityDate.hashCode()));
        result = ((result* 31)+((this.code == null)? 0 :this.code.hashCode()));
        result = ((result* 31)+((this.infoAccessInd == null)? 0 :this.infoAccessInd.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.vrMsgNo == null)? 0 :this.vrMsgNo.hashCode()));
        result = ((result* 31)+((this.desc == null)? 0 :this.desc.hashCode()));
        result = ((result* 31)+((this.inactiveInd == null)? 0 :this.inactiveInd.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof LoanStatuses100GetResponse) == false) {
            return false;
        }
        LoanStatuses100GetResponse rhs = ((LoanStatuses100GetResponse) other);
        return (((((((((this.holdInd == rhs.holdInd)||((this.holdInd!= null)&&this.holdInd.equals(rhs.holdInd)))&&((this.activityDate == rhs.activityDate)||((this.activityDate!= null)&&this.activityDate.equals(rhs.activityDate))))&&((this.code == rhs.code)||((this.code!= null)&&this.code.equals(rhs.code))))&&((this.infoAccessInd == rhs.infoAccessInd)||((this.infoAccessInd!= null)&&this.infoAccessInd.equals(rhs.infoAccessInd))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.vrMsgNo == rhs.vrMsgNo)||((this.vrMsgNo!= null)&&this.vrMsgNo.equals(rhs.vrMsgNo))))&&((this.desc == rhs.desc)||((this.desc!= null)&&this.desc.equals(rhs.desc))))&&((this.inactiveInd == rhs.inactiveInd)||((this.inactiveInd!= null)&&this.inactiveInd.equals(rhs.inactiveInd))));
    }

}
