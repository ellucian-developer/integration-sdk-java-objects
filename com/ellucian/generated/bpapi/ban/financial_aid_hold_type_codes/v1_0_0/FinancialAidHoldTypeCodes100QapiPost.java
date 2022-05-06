
package com.ellucian.generated.bpapi.ban.financial_aid_hold_type_codes.v1_0_0;

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
    "allAidInd",
    "code",
    "desc",
    "disbInd",
    "federalAidInd",
    "infoAccessInd",
    "instAidInd",
    "memoInd",
    "pckgInd",
    "stateAidInd",
    "titleIvAidInd",
    "userId",
    "vrMsgNo"
})
@Generated("jsonschema2pojo")
public class FinancialAidHoldTypeCodes100QapiPost {

    /**
     * Activity Date
     * <p>
     * Lineage reference object : RTVHOLD_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    @JsonPropertyDescription("Lineage reference object : RTVHOLD_ACTIVITY_DATE")
    private Date activityDate;
    /**
     * Lineage reference object : RTVHOLD_ALL_AID_IND
     * 
     */
    @JsonProperty("allAidInd")
    @JsonPropertyDescription("Lineage reference object : RTVHOLD_ALL_AID_IND")
    private String allAidInd;
    /**
     * Hold Type
     * <p>
     * Lineage reference object : RTVHOLD_CODE
     * 
     */
    @JsonProperty("code")
    @JsonPropertyDescription("Lineage reference object : RTVHOLD_CODE")
    private String code;
    /**
     * Hold Description
     * <p>
     * Lineage reference object : RTVHOLD_DESC
     * 
     */
    @JsonProperty("desc")
    @JsonPropertyDescription("Lineage reference object : RTVHOLD_DESC")
    private String desc;
    /**
     * Lineage reference object : RTVHOLD_DISB_IND
     * 
     */
    @JsonProperty("disbInd")
    @JsonPropertyDescription("Lineage reference object : RTVHOLD_DISB_IND")
    private String disbInd;
    /**
     * Lineage reference object : RTVHOLD_FEDERAL_AID_IND
     * 
     */
    @JsonProperty("federalAidInd")
    @JsonPropertyDescription("Lineage reference object : RTVHOLD_FEDERAL_AID_IND")
    private String federalAidInd;
    /**
     * Lineage reference object : RTVHOLD_INFO_ACCESS_IND
     * 
     */
    @JsonProperty("infoAccessInd")
    @JsonPropertyDescription("Lineage reference object : RTVHOLD_INFO_ACCESS_IND")
    private String infoAccessInd;
    /**
     * Lineage reference object : RTVHOLD_INST_AID_IND
     * 
     */
    @JsonProperty("instAidInd")
    @JsonPropertyDescription("Lineage reference object : RTVHOLD_INST_AID_IND")
    private String instAidInd;
    /**
     * Lineage reference object : RTVHOLD_MEMO_IND
     * 
     */
    @JsonProperty("memoInd")
    @JsonPropertyDescription("Lineage reference object : RTVHOLD_MEMO_IND")
    private String memoInd;
    /**
     * Lineage reference object : RTVHOLD_PCKG_IND
     * 
     */
    @JsonProperty("pckgInd")
    @JsonPropertyDescription("Lineage reference object : RTVHOLD_PCKG_IND")
    private String pckgInd;
    /**
     * Lineage reference object : RTVHOLD_STATE_AID_IND
     * 
     */
    @JsonProperty("stateAidInd")
    @JsonPropertyDescription("Lineage reference object : RTVHOLD_STATE_AID_IND")
    private String stateAidInd;
    /**
     * Lineage reference object : RTVHOLD_TITLE_IV_AID_IND
     * 
     */
    @JsonProperty("titleIvAidInd")
    @JsonPropertyDescription("Lineage reference object : RTVHOLD_TITLE_IV_AID_IND")
    private String titleIvAidInd;
    /**
     * User ID
     * <p>
     * Lineage reference object : RTVHOLD_USER_ID
     * 
     */
    @JsonProperty("userId")
    @JsonPropertyDescription("Lineage reference object : RTVHOLD_USER_ID")
    private String userId;
    /**
     * Message Number
     * <p>
     * Lineage reference object : RTVHOLD_VR_MSG_NO
     * 
     */
    @JsonProperty("vrMsgNo")
    @JsonPropertyDescription("Lineage reference object : RTVHOLD_VR_MSG_NO")
    private Double vrMsgNo;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Activity Date
     * <p>
     * Lineage reference object : RTVHOLD_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public Date getActivityDate() {
        return activityDate;
    }

    /**
     * Activity Date
     * <p>
     * Lineage reference object : RTVHOLD_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public void setActivityDate(Date activityDate) {
        this.activityDate = activityDate;
    }

    public FinancialAidHoldTypeCodes100QapiPost withActivityDate(Date activityDate) {
        this.activityDate = activityDate;
        return this;
    }

    /**
     * Lineage reference object : RTVHOLD_ALL_AID_IND
     * 
     */
    @JsonProperty("allAidInd")
    public String getAllAidInd() {
        return allAidInd;
    }

    /**
     * Lineage reference object : RTVHOLD_ALL_AID_IND
     * 
     */
    @JsonProperty("allAidInd")
    public void setAllAidInd(String allAidInd) {
        this.allAidInd = allAidInd;
    }

    public FinancialAidHoldTypeCodes100QapiPost withAllAidInd(String allAidInd) {
        this.allAidInd = allAidInd;
        return this;
    }

    /**
     * Hold Type
     * <p>
     * Lineage reference object : RTVHOLD_CODE
     * 
     */
    @JsonProperty("code")
    public String getCode() {
        return code;
    }

    /**
     * Hold Type
     * <p>
     * Lineage reference object : RTVHOLD_CODE
     * 
     */
    @JsonProperty("code")
    public void setCode(String code) {
        this.code = code;
    }

    public FinancialAidHoldTypeCodes100QapiPost withCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * Hold Description
     * <p>
     * Lineage reference object : RTVHOLD_DESC
     * 
     */
    @JsonProperty("desc")
    public String getDesc() {
        return desc;
    }

    /**
     * Hold Description
     * <p>
     * Lineage reference object : RTVHOLD_DESC
     * 
     */
    @JsonProperty("desc")
    public void setDesc(String desc) {
        this.desc = desc;
    }

    public FinancialAidHoldTypeCodes100QapiPost withDesc(String desc) {
        this.desc = desc;
        return this;
    }

    /**
     * Lineage reference object : RTVHOLD_DISB_IND
     * 
     */
    @JsonProperty("disbInd")
    public String getDisbInd() {
        return disbInd;
    }

    /**
     * Lineage reference object : RTVHOLD_DISB_IND
     * 
     */
    @JsonProperty("disbInd")
    public void setDisbInd(String disbInd) {
        this.disbInd = disbInd;
    }

    public FinancialAidHoldTypeCodes100QapiPost withDisbInd(String disbInd) {
        this.disbInd = disbInd;
        return this;
    }

    /**
     * Lineage reference object : RTVHOLD_FEDERAL_AID_IND
     * 
     */
    @JsonProperty("federalAidInd")
    public String getFederalAidInd() {
        return federalAidInd;
    }

    /**
     * Lineage reference object : RTVHOLD_FEDERAL_AID_IND
     * 
     */
    @JsonProperty("federalAidInd")
    public void setFederalAidInd(String federalAidInd) {
        this.federalAidInd = federalAidInd;
    }

    public FinancialAidHoldTypeCodes100QapiPost withFederalAidInd(String federalAidInd) {
        this.federalAidInd = federalAidInd;
        return this;
    }

    /**
     * Lineage reference object : RTVHOLD_INFO_ACCESS_IND
     * 
     */
    @JsonProperty("infoAccessInd")
    public String getInfoAccessInd() {
        return infoAccessInd;
    }

    /**
     * Lineage reference object : RTVHOLD_INFO_ACCESS_IND
     * 
     */
    @JsonProperty("infoAccessInd")
    public void setInfoAccessInd(String infoAccessInd) {
        this.infoAccessInd = infoAccessInd;
    }

    public FinancialAidHoldTypeCodes100QapiPost withInfoAccessInd(String infoAccessInd) {
        this.infoAccessInd = infoAccessInd;
        return this;
    }

    /**
     * Lineage reference object : RTVHOLD_INST_AID_IND
     * 
     */
    @JsonProperty("instAidInd")
    public String getInstAidInd() {
        return instAidInd;
    }

    /**
     * Lineage reference object : RTVHOLD_INST_AID_IND
     * 
     */
    @JsonProperty("instAidInd")
    public void setInstAidInd(String instAidInd) {
        this.instAidInd = instAidInd;
    }

    public FinancialAidHoldTypeCodes100QapiPost withInstAidInd(String instAidInd) {
        this.instAidInd = instAidInd;
        return this;
    }

    /**
     * Lineage reference object : RTVHOLD_MEMO_IND
     * 
     */
    @JsonProperty("memoInd")
    public String getMemoInd() {
        return memoInd;
    }

    /**
     * Lineage reference object : RTVHOLD_MEMO_IND
     * 
     */
    @JsonProperty("memoInd")
    public void setMemoInd(String memoInd) {
        this.memoInd = memoInd;
    }

    public FinancialAidHoldTypeCodes100QapiPost withMemoInd(String memoInd) {
        this.memoInd = memoInd;
        return this;
    }

    /**
     * Lineage reference object : RTVHOLD_PCKG_IND
     * 
     */
    @JsonProperty("pckgInd")
    public String getPckgInd() {
        return pckgInd;
    }

    /**
     * Lineage reference object : RTVHOLD_PCKG_IND
     * 
     */
    @JsonProperty("pckgInd")
    public void setPckgInd(String pckgInd) {
        this.pckgInd = pckgInd;
    }

    public FinancialAidHoldTypeCodes100QapiPost withPckgInd(String pckgInd) {
        this.pckgInd = pckgInd;
        return this;
    }

    /**
     * Lineage reference object : RTVHOLD_STATE_AID_IND
     * 
     */
    @JsonProperty("stateAidInd")
    public String getStateAidInd() {
        return stateAidInd;
    }

    /**
     * Lineage reference object : RTVHOLD_STATE_AID_IND
     * 
     */
    @JsonProperty("stateAidInd")
    public void setStateAidInd(String stateAidInd) {
        this.stateAidInd = stateAidInd;
    }

    public FinancialAidHoldTypeCodes100QapiPost withStateAidInd(String stateAidInd) {
        this.stateAidInd = stateAidInd;
        return this;
    }

    /**
     * Lineage reference object : RTVHOLD_TITLE_IV_AID_IND
     * 
     */
    @JsonProperty("titleIvAidInd")
    public String getTitleIvAidInd() {
        return titleIvAidInd;
    }

    /**
     * Lineage reference object : RTVHOLD_TITLE_IV_AID_IND
     * 
     */
    @JsonProperty("titleIvAidInd")
    public void setTitleIvAidInd(String titleIvAidInd) {
        this.titleIvAidInd = titleIvAidInd;
    }

    public FinancialAidHoldTypeCodes100QapiPost withTitleIvAidInd(String titleIvAidInd) {
        this.titleIvAidInd = titleIvAidInd;
        return this;
    }

    /**
     * User ID
     * <p>
     * Lineage reference object : RTVHOLD_USER_ID
     * 
     */
    @JsonProperty("userId")
    public String getUserId() {
        return userId;
    }

    /**
     * User ID
     * <p>
     * Lineage reference object : RTVHOLD_USER_ID
     * 
     */
    @JsonProperty("userId")
    public void setUserId(String userId) {
        this.userId = userId;
    }

    public FinancialAidHoldTypeCodes100QapiPost withUserId(String userId) {
        this.userId = userId;
        return this;
    }

    /**
     * Message Number
     * <p>
     * Lineage reference object : RTVHOLD_VR_MSG_NO
     * 
     */
    @JsonProperty("vrMsgNo")
    public Double getVrMsgNo() {
        return vrMsgNo;
    }

    /**
     * Message Number
     * <p>
     * Lineage reference object : RTVHOLD_VR_MSG_NO
     * 
     */
    @JsonProperty("vrMsgNo")
    public void setVrMsgNo(Double vrMsgNo) {
        this.vrMsgNo = vrMsgNo;
    }

    public FinancialAidHoldTypeCodes100QapiPost withVrMsgNo(Double vrMsgNo) {
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

    public FinancialAidHoldTypeCodes100QapiPost withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(FinancialAidHoldTypeCodes100QapiPost.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("activityDate");
        sb.append('=');
        sb.append(((this.activityDate == null)?"<null>":this.activityDate));
        sb.append(',');
        sb.append("allAidInd");
        sb.append('=');
        sb.append(((this.allAidInd == null)?"<null>":this.allAidInd));
        sb.append(',');
        sb.append("code");
        sb.append('=');
        sb.append(((this.code == null)?"<null>":this.code));
        sb.append(',');
        sb.append("desc");
        sb.append('=');
        sb.append(((this.desc == null)?"<null>":this.desc));
        sb.append(',');
        sb.append("disbInd");
        sb.append('=');
        sb.append(((this.disbInd == null)?"<null>":this.disbInd));
        sb.append(',');
        sb.append("federalAidInd");
        sb.append('=');
        sb.append(((this.federalAidInd == null)?"<null>":this.federalAidInd));
        sb.append(',');
        sb.append("infoAccessInd");
        sb.append('=');
        sb.append(((this.infoAccessInd == null)?"<null>":this.infoAccessInd));
        sb.append(',');
        sb.append("instAidInd");
        sb.append('=');
        sb.append(((this.instAidInd == null)?"<null>":this.instAidInd));
        sb.append(',');
        sb.append("memoInd");
        sb.append('=');
        sb.append(((this.memoInd == null)?"<null>":this.memoInd));
        sb.append(',');
        sb.append("pckgInd");
        sb.append('=');
        sb.append(((this.pckgInd == null)?"<null>":this.pckgInd));
        sb.append(',');
        sb.append("stateAidInd");
        sb.append('=');
        sb.append(((this.stateAidInd == null)?"<null>":this.stateAidInd));
        sb.append(',');
        sb.append("titleIvAidInd");
        sb.append('=');
        sb.append(((this.titleIvAidInd == null)?"<null>":this.titleIvAidInd));
        sb.append(',');
        sb.append("userId");
        sb.append('=');
        sb.append(((this.userId == null)?"<null>":this.userId));
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
        result = ((result* 31)+((this.code == null)? 0 :this.code.hashCode()));
        result = ((result* 31)+((this.stateAidInd == null)? 0 :this.stateAidInd.hashCode()));
        result = ((result* 31)+((this.titleIvAidInd == null)? 0 :this.titleIvAidInd.hashCode()));
        result = ((result* 31)+((this.federalAidInd == null)? 0 :this.federalAidInd.hashCode()));
        result = ((result* 31)+((this.infoAccessInd == null)? 0 :this.infoAccessInd.hashCode()));
        result = ((result* 31)+((this.allAidInd == null)? 0 :this.allAidInd.hashCode()));
        result = ((result* 31)+((this.instAidInd == null)? 0 :this.instAidInd.hashCode()));
        result = ((result* 31)+((this.pckgInd == null)? 0 :this.pckgInd.hashCode()));
        result = ((result* 31)+((this.userId == null)? 0 :this.userId.hashCode()));
        result = ((result* 31)+((this.memoInd == null)? 0 :this.memoInd.hashCode()));
        result = ((result* 31)+((this.activityDate == null)? 0 :this.activityDate.hashCode()));
        result = ((result* 31)+((this.disbInd == null)? 0 :this.disbInd.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.vrMsgNo == null)? 0 :this.vrMsgNo.hashCode()));
        result = ((result* 31)+((this.desc == null)? 0 :this.desc.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof FinancialAidHoldTypeCodes100QapiPost) == false) {
            return false;
        }
        FinancialAidHoldTypeCodes100QapiPost rhs = ((FinancialAidHoldTypeCodes100QapiPost) other);
        return ((((((((((((((((this.code == rhs.code)||((this.code!= null)&&this.code.equals(rhs.code)))&&((this.stateAidInd == rhs.stateAidInd)||((this.stateAidInd!= null)&&this.stateAidInd.equals(rhs.stateAidInd))))&&((this.titleIvAidInd == rhs.titleIvAidInd)||((this.titleIvAidInd!= null)&&this.titleIvAidInd.equals(rhs.titleIvAidInd))))&&((this.federalAidInd == rhs.federalAidInd)||((this.federalAidInd!= null)&&this.federalAidInd.equals(rhs.federalAidInd))))&&((this.infoAccessInd == rhs.infoAccessInd)||((this.infoAccessInd!= null)&&this.infoAccessInd.equals(rhs.infoAccessInd))))&&((this.allAidInd == rhs.allAidInd)||((this.allAidInd!= null)&&this.allAidInd.equals(rhs.allAidInd))))&&((this.instAidInd == rhs.instAidInd)||((this.instAidInd!= null)&&this.instAidInd.equals(rhs.instAidInd))))&&((this.pckgInd == rhs.pckgInd)||((this.pckgInd!= null)&&this.pckgInd.equals(rhs.pckgInd))))&&((this.userId == rhs.userId)||((this.userId!= null)&&this.userId.equals(rhs.userId))))&&((this.memoInd == rhs.memoInd)||((this.memoInd!= null)&&this.memoInd.equals(rhs.memoInd))))&&((this.activityDate == rhs.activityDate)||((this.activityDate!= null)&&this.activityDate.equals(rhs.activityDate))))&&((this.disbInd == rhs.disbInd)||((this.disbInd!= null)&&this.disbInd.equals(rhs.disbInd))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.vrMsgNo == rhs.vrMsgNo)||((this.vrMsgNo!= null)&&this.vrMsgNo.equals(rhs.vrMsgNo))))&&((this.desc == rhs.desc)||((this.desc!= null)&&this.desc.equals(rhs.desc))));
    }

}
