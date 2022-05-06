
package com.ellucian.generated.bpapi.ban.credit_card_type_codes.v1_0_0;

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
    "editChar",
    "msgContents",
    "type",
    "vrMsgNo",
    "detailCode"
})
@Generated("jsonschema2pojo")
public class CreditCardTypeCodes100GetResponse {

    /**
     * Activity Date
     * <p>
     * Lineage reference object : TTVCCRD_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    @JsonPropertyDescription("Lineage reference object : TTVCCRD_ACTIVITY_DATE")
    private Date activityDate;
    /**
     * Edit
     * <p>
     * Lineage reference object : TTVCCRD_EDIT_CHAR
     * (Required)
     * 
     */
    @JsonProperty("editChar")
    @JsonPropertyDescription("Lineage reference object : TTVCCRD_EDIT_CHAR")
    private Double editChar;
    /**
     * Message Description
     * <p>
     * Lineage reference object : TTVCCRD_MSG_CONTENTS
     * (Required)
     * 
     */
    @JsonProperty("msgContents")
    @JsonPropertyDescription("Lineage reference object : TTVCCRD_MSG_CONTENTS")
    private String msgContents;
    /**
     * Type
     * <p>
     * Lineage reference object : TTVCCRD_TYPE
     * (Required)
     * 
     */
    @JsonProperty("type")
    @JsonPropertyDescription("Lineage reference object : TTVCCRD_TYPE")
    private Double type;
    /**
     * Voice Response Message Number
     * <p>
     * Lineage reference object : TTVCCRD_VR_MSG_NO
     * (Required)
     * 
     */
    @JsonProperty("vrMsgNo")
    @JsonPropertyDescription("Lineage reference object : TTVCCRD_VR_MSG_NO")
    private Double vrMsgNo;
    /**
     * Detail Code
     * <p>
     * Lineage reference object : TTVCCRD_DETAIL_CODE
     * (Required)
     * 
     */
    @JsonProperty("detailCode")
    @JsonPropertyDescription("Lineage reference object : TTVCCRD_DETAIL_CODE")
    private String detailCode;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Activity Date
     * <p>
     * Lineage reference object : TTVCCRD_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public Date getActivityDate() {
        return activityDate;
    }

    /**
     * Activity Date
     * <p>
     * Lineage reference object : TTVCCRD_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public void setActivityDate(Date activityDate) {
        this.activityDate = activityDate;
    }

    public CreditCardTypeCodes100GetResponse withActivityDate(Date activityDate) {
        this.activityDate = activityDate;
        return this;
    }

    /**
     * Edit
     * <p>
     * Lineage reference object : TTVCCRD_EDIT_CHAR
     * (Required)
     * 
     */
    @JsonProperty("editChar")
    public Double getEditChar() {
        return editChar;
    }

    /**
     * Edit
     * <p>
     * Lineage reference object : TTVCCRD_EDIT_CHAR
     * (Required)
     * 
     */
    @JsonProperty("editChar")
    public void setEditChar(Double editChar) {
        this.editChar = editChar;
    }

    public CreditCardTypeCodes100GetResponse withEditChar(Double editChar) {
        this.editChar = editChar;
        return this;
    }

    /**
     * Message Description
     * <p>
     * Lineage reference object : TTVCCRD_MSG_CONTENTS
     * (Required)
     * 
     */
    @JsonProperty("msgContents")
    public String getMsgContents() {
        return msgContents;
    }

    /**
     * Message Description
     * <p>
     * Lineage reference object : TTVCCRD_MSG_CONTENTS
     * (Required)
     * 
     */
    @JsonProperty("msgContents")
    public void setMsgContents(String msgContents) {
        this.msgContents = msgContents;
    }

    public CreditCardTypeCodes100GetResponse withMsgContents(String msgContents) {
        this.msgContents = msgContents;
        return this;
    }

    /**
     * Type
     * <p>
     * Lineage reference object : TTVCCRD_TYPE
     * (Required)
     * 
     */
    @JsonProperty("type")
    public Double getType() {
        return type;
    }

    /**
     * Type
     * <p>
     * Lineage reference object : TTVCCRD_TYPE
     * (Required)
     * 
     */
    @JsonProperty("type")
    public void setType(Double type) {
        this.type = type;
    }

    public CreditCardTypeCodes100GetResponse withType(Double type) {
        this.type = type;
        return this;
    }

    /**
     * Voice Response Message Number
     * <p>
     * Lineage reference object : TTVCCRD_VR_MSG_NO
     * (Required)
     * 
     */
    @JsonProperty("vrMsgNo")
    public Double getVrMsgNo() {
        return vrMsgNo;
    }

    /**
     * Voice Response Message Number
     * <p>
     * Lineage reference object : TTVCCRD_VR_MSG_NO
     * (Required)
     * 
     */
    @JsonProperty("vrMsgNo")
    public void setVrMsgNo(Double vrMsgNo) {
        this.vrMsgNo = vrMsgNo;
    }

    public CreditCardTypeCodes100GetResponse withVrMsgNo(Double vrMsgNo) {
        this.vrMsgNo = vrMsgNo;
        return this;
    }

    /**
     * Detail Code
     * <p>
     * Lineage reference object : TTVCCRD_DETAIL_CODE
     * (Required)
     * 
     */
    @JsonProperty("detailCode")
    public String getDetailCode() {
        return detailCode;
    }

    /**
     * Detail Code
     * <p>
     * Lineage reference object : TTVCCRD_DETAIL_CODE
     * (Required)
     * 
     */
    @JsonProperty("detailCode")
    public void setDetailCode(String detailCode) {
        this.detailCode = detailCode;
    }

    public CreditCardTypeCodes100GetResponse withDetailCode(String detailCode) {
        this.detailCode = detailCode;
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

    public CreditCardTypeCodes100GetResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(CreditCardTypeCodes100GetResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("activityDate");
        sb.append('=');
        sb.append(((this.activityDate == null)?"<null>":this.activityDate));
        sb.append(',');
        sb.append("editChar");
        sb.append('=');
        sb.append(((this.editChar == null)?"<null>":this.editChar));
        sb.append(',');
        sb.append("msgContents");
        sb.append('=');
        sb.append(((this.msgContents == null)?"<null>":this.msgContents));
        sb.append(',');
        sb.append("type");
        sb.append('=');
        sb.append(((this.type == null)?"<null>":this.type));
        sb.append(',');
        sb.append("vrMsgNo");
        sb.append('=');
        sb.append(((this.vrMsgNo == null)?"<null>":this.vrMsgNo));
        sb.append(',');
        sb.append("detailCode");
        sb.append('=');
        sb.append(((this.detailCode == null)?"<null>":this.detailCode));
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
        result = ((result* 31)+((this.activityDate == null)? 0 :this.activityDate.hashCode()));
        result = ((result* 31)+((this.editChar == null)? 0 :this.editChar.hashCode()));
        result = ((result* 31)+((this.msgContents == null)? 0 :this.msgContents.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.type == null)? 0 :this.type.hashCode()));
        result = ((result* 31)+((this.vrMsgNo == null)? 0 :this.vrMsgNo.hashCode()));
        result = ((result* 31)+((this.detailCode == null)? 0 :this.detailCode.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof CreditCardTypeCodes100GetResponse) == false) {
            return false;
        }
        CreditCardTypeCodes100GetResponse rhs = ((CreditCardTypeCodes100GetResponse) other);
        return ((((((((this.activityDate == rhs.activityDate)||((this.activityDate!= null)&&this.activityDate.equals(rhs.activityDate)))&&((this.editChar == rhs.editChar)||((this.editChar!= null)&&this.editChar.equals(rhs.editChar))))&&((this.msgContents == rhs.msgContents)||((this.msgContents!= null)&&this.msgContents.equals(rhs.msgContents))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.type == rhs.type)||((this.type!= null)&&this.type.equals(rhs.type))))&&((this.vrMsgNo == rhs.vrMsgNo)||((this.vrMsgNo!= null)&&this.vrMsgNo.equals(rhs.vrMsgNo))))&&((this.detailCode == rhs.detailCode)||((this.detailCode!= null)&&this.detailCode.equals(rhs.detailCode))));
    }

}
