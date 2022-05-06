
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
    "criteria.detailCode",
    "criteria.msgContents",
    "criteria.activityDate",
    "editChar",
    "criteria.vrMsgNo",
    "msgContents",
    "criteria.editChar",
    "type",
    "vrMsgNo",
    "criteria.type",
    "detailCode"
})
@Generated("jsonschema2pojo")
public class CreditCardTypeCodes100PutRequest {

    /**
     * Detail Code
     * <p>
     * Lineage reference object : TTVCCRD_DETAIL_CODE
     * (Required)
     * 
     */
    @JsonProperty("criteria.detailCode")
    @JsonPropertyDescription("Lineage reference object : TTVCCRD_DETAIL_CODE")
    private String criteriaDetailCode;
    /**
     * Message Description
     * <p>
     * Lineage reference object : TTVCCRD_MSG_CONTENTS
     * (Required)
     * 
     */
    @JsonProperty("criteria.msgContents")
    @JsonPropertyDescription("Lineage reference object : TTVCCRD_MSG_CONTENTS")
    private String criteriaMsgContents;
    /**
     * Activity Date
     * <p>
     * Lineage reference object : TTVCCRD_ACTIVITY_DATE
     * 
     */
    @JsonProperty("criteria.activityDate")
    @JsonPropertyDescription("Lineage reference object : TTVCCRD_ACTIVITY_DATE")
    private Date criteriaActivityDate;
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
     * Voice Response Message Number
     * <p>
     * Lineage reference object : TTVCCRD_VR_MSG_NO
     * (Required)
     * 
     */
    @JsonProperty("criteria.vrMsgNo")
    @JsonPropertyDescription("Lineage reference object : TTVCCRD_VR_MSG_NO")
    private Double criteriaVrMsgNo;
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
     * Edit
     * <p>
     * Lineage reference object : TTVCCRD_EDIT_CHAR
     * (Required)
     * 
     */
    @JsonProperty("criteria.editChar")
    @JsonPropertyDescription("Lineage reference object : TTVCCRD_EDIT_CHAR")
    private Double criteriaEditChar;
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
     * Type
     * <p>
     * Lineage reference object : TTVCCRD_TYPE
     * (Required)
     * 
     */
    @JsonProperty("criteria.type")
    @JsonPropertyDescription("Lineage reference object : TTVCCRD_TYPE")
    private Double criteriaType;
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
     * Detail Code
     * <p>
     * Lineage reference object : TTVCCRD_DETAIL_CODE
     * (Required)
     * 
     */
    @JsonProperty("criteria.detailCode")
    public String getCriteriaDetailCode() {
        return criteriaDetailCode;
    }

    /**
     * Detail Code
     * <p>
     * Lineage reference object : TTVCCRD_DETAIL_CODE
     * (Required)
     * 
     */
    @JsonProperty("criteria.detailCode")
    public void setCriteriaDetailCode(String criteriaDetailCode) {
        this.criteriaDetailCode = criteriaDetailCode;
    }

    public CreditCardTypeCodes100PutRequest withCriteriaDetailCode(String criteriaDetailCode) {
        this.criteriaDetailCode = criteriaDetailCode;
        return this;
    }

    /**
     * Message Description
     * <p>
     * Lineage reference object : TTVCCRD_MSG_CONTENTS
     * (Required)
     * 
     */
    @JsonProperty("criteria.msgContents")
    public String getCriteriaMsgContents() {
        return criteriaMsgContents;
    }

    /**
     * Message Description
     * <p>
     * Lineage reference object : TTVCCRD_MSG_CONTENTS
     * (Required)
     * 
     */
    @JsonProperty("criteria.msgContents")
    public void setCriteriaMsgContents(String criteriaMsgContents) {
        this.criteriaMsgContents = criteriaMsgContents;
    }

    public CreditCardTypeCodes100PutRequest withCriteriaMsgContents(String criteriaMsgContents) {
        this.criteriaMsgContents = criteriaMsgContents;
        return this;
    }

    /**
     * Activity Date
     * <p>
     * Lineage reference object : TTVCCRD_ACTIVITY_DATE
     * 
     */
    @JsonProperty("criteria.activityDate")
    public Date getCriteriaActivityDate() {
        return criteriaActivityDate;
    }

    /**
     * Activity Date
     * <p>
     * Lineage reference object : TTVCCRD_ACTIVITY_DATE
     * 
     */
    @JsonProperty("criteria.activityDate")
    public void setCriteriaActivityDate(Date criteriaActivityDate) {
        this.criteriaActivityDate = criteriaActivityDate;
    }

    public CreditCardTypeCodes100PutRequest withCriteriaActivityDate(Date criteriaActivityDate) {
        this.criteriaActivityDate = criteriaActivityDate;
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

    public CreditCardTypeCodes100PutRequest withEditChar(Double editChar) {
        this.editChar = editChar;
        return this;
    }

    /**
     * Voice Response Message Number
     * <p>
     * Lineage reference object : TTVCCRD_VR_MSG_NO
     * (Required)
     * 
     */
    @JsonProperty("criteria.vrMsgNo")
    public Double getCriteriaVrMsgNo() {
        return criteriaVrMsgNo;
    }

    /**
     * Voice Response Message Number
     * <p>
     * Lineage reference object : TTVCCRD_VR_MSG_NO
     * (Required)
     * 
     */
    @JsonProperty("criteria.vrMsgNo")
    public void setCriteriaVrMsgNo(Double criteriaVrMsgNo) {
        this.criteriaVrMsgNo = criteriaVrMsgNo;
    }

    public CreditCardTypeCodes100PutRequest withCriteriaVrMsgNo(Double criteriaVrMsgNo) {
        this.criteriaVrMsgNo = criteriaVrMsgNo;
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

    public CreditCardTypeCodes100PutRequest withMsgContents(String msgContents) {
        this.msgContents = msgContents;
        return this;
    }

    /**
     * Edit
     * <p>
     * Lineage reference object : TTVCCRD_EDIT_CHAR
     * (Required)
     * 
     */
    @JsonProperty("criteria.editChar")
    public Double getCriteriaEditChar() {
        return criteriaEditChar;
    }

    /**
     * Edit
     * <p>
     * Lineage reference object : TTVCCRD_EDIT_CHAR
     * (Required)
     * 
     */
    @JsonProperty("criteria.editChar")
    public void setCriteriaEditChar(Double criteriaEditChar) {
        this.criteriaEditChar = criteriaEditChar;
    }

    public CreditCardTypeCodes100PutRequest withCriteriaEditChar(Double criteriaEditChar) {
        this.criteriaEditChar = criteriaEditChar;
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

    public CreditCardTypeCodes100PutRequest withType(Double type) {
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

    public CreditCardTypeCodes100PutRequest withVrMsgNo(Double vrMsgNo) {
        this.vrMsgNo = vrMsgNo;
        return this;
    }

    /**
     * Type
     * <p>
     * Lineage reference object : TTVCCRD_TYPE
     * (Required)
     * 
     */
    @JsonProperty("criteria.type")
    public Double getCriteriaType() {
        return criteriaType;
    }

    /**
     * Type
     * <p>
     * Lineage reference object : TTVCCRD_TYPE
     * (Required)
     * 
     */
    @JsonProperty("criteria.type")
    public void setCriteriaType(Double criteriaType) {
        this.criteriaType = criteriaType;
    }

    public CreditCardTypeCodes100PutRequest withCriteriaType(Double criteriaType) {
        this.criteriaType = criteriaType;
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

    public CreditCardTypeCodes100PutRequest withDetailCode(String detailCode) {
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

    public CreditCardTypeCodes100PutRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(CreditCardTypeCodes100PutRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("criteriaDetailCode");
        sb.append('=');
        sb.append(((this.criteriaDetailCode == null)?"<null>":this.criteriaDetailCode));
        sb.append(',');
        sb.append("criteriaMsgContents");
        sb.append('=');
        sb.append(((this.criteriaMsgContents == null)?"<null>":this.criteriaMsgContents));
        sb.append(',');
        sb.append("criteriaActivityDate");
        sb.append('=');
        sb.append(((this.criteriaActivityDate == null)?"<null>":this.criteriaActivityDate));
        sb.append(',');
        sb.append("editChar");
        sb.append('=');
        sb.append(((this.editChar == null)?"<null>":this.editChar));
        sb.append(',');
        sb.append("criteriaVrMsgNo");
        sb.append('=');
        sb.append(((this.criteriaVrMsgNo == null)?"<null>":this.criteriaVrMsgNo));
        sb.append(',');
        sb.append("msgContents");
        sb.append('=');
        sb.append(((this.msgContents == null)?"<null>":this.msgContents));
        sb.append(',');
        sb.append("criteriaEditChar");
        sb.append('=');
        sb.append(((this.criteriaEditChar == null)?"<null>":this.criteriaEditChar));
        sb.append(',');
        sb.append("type");
        sb.append('=');
        sb.append(((this.type == null)?"<null>":this.type));
        sb.append(',');
        sb.append("vrMsgNo");
        sb.append('=');
        sb.append(((this.vrMsgNo == null)?"<null>":this.vrMsgNo));
        sb.append(',');
        sb.append("criteriaType");
        sb.append('=');
        sb.append(((this.criteriaType == null)?"<null>":this.criteriaType));
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
        result = ((result* 31)+((this.criteriaActivityDate == null)? 0 :this.criteriaActivityDate.hashCode()));
        result = ((result* 31)+((this.criteriaEditChar == null)? 0 :this.criteriaEditChar.hashCode()));
        result = ((result* 31)+((this.criteriaMsgContents == null)? 0 :this.criteriaMsgContents.hashCode()));
        result = ((result* 31)+((this.criteriaVrMsgNo == null)? 0 :this.criteriaVrMsgNo.hashCode()));
        result = ((result* 31)+((this.msgContents == null)? 0 :this.msgContents.hashCode()));
        result = ((result* 31)+((this.type == null)? 0 :this.type.hashCode()));
        result = ((result* 31)+((this.criteriaType == null)? 0 :this.criteriaType.hashCode()));
        result = ((result* 31)+((this.detailCode == null)? 0 :this.detailCode.hashCode()));
        result = ((result* 31)+((this.criteriaDetailCode == null)? 0 :this.criteriaDetailCode.hashCode()));
        result = ((result* 31)+((this.editChar == null)? 0 :this.editChar.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.vrMsgNo == null)? 0 :this.vrMsgNo.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof CreditCardTypeCodes100PutRequest) == false) {
            return false;
        }
        CreditCardTypeCodes100PutRequest rhs = ((CreditCardTypeCodes100PutRequest) other);
        return (((((((((((((this.criteriaActivityDate == rhs.criteriaActivityDate)||((this.criteriaActivityDate!= null)&&this.criteriaActivityDate.equals(rhs.criteriaActivityDate)))&&((this.criteriaEditChar == rhs.criteriaEditChar)||((this.criteriaEditChar!= null)&&this.criteriaEditChar.equals(rhs.criteriaEditChar))))&&((this.criteriaMsgContents == rhs.criteriaMsgContents)||((this.criteriaMsgContents!= null)&&this.criteriaMsgContents.equals(rhs.criteriaMsgContents))))&&((this.criteriaVrMsgNo == rhs.criteriaVrMsgNo)||((this.criteriaVrMsgNo!= null)&&this.criteriaVrMsgNo.equals(rhs.criteriaVrMsgNo))))&&((this.msgContents == rhs.msgContents)||((this.msgContents!= null)&&this.msgContents.equals(rhs.msgContents))))&&((this.type == rhs.type)||((this.type!= null)&&this.type.equals(rhs.type))))&&((this.criteriaType == rhs.criteriaType)||((this.criteriaType!= null)&&this.criteriaType.equals(rhs.criteriaType))))&&((this.detailCode == rhs.detailCode)||((this.detailCode!= null)&&this.detailCode.equals(rhs.detailCode))))&&((this.criteriaDetailCode == rhs.criteriaDetailCode)||((this.criteriaDetailCode!= null)&&this.criteriaDetailCode.equals(rhs.criteriaDetailCode))))&&((this.editChar == rhs.editChar)||((this.editChar!= null)&&this.editChar.equals(rhs.editChar))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.vrMsgNo == rhs.vrMsgNo)||((this.vrMsgNo!= null)&&this.vrMsgNo.equals(rhs.vrMsgNo))));
    }

}
