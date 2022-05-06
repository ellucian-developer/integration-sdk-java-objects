
package com.ellucian.generated.bpapi.ban.bank_routing_number_codes.v1_0_0;

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
    "codeBankRoutNum",
    "userId",
    "desc"
})
@Generated("jsonschema2pojo")
public class BankRoutingNumberCodes100GetResponse {

    /**
     * Activity Date
     * <p>
     * Lineage reference object : GXVDIRD_ACTIVITY_DATE
     * (Required)
     * 
     */
    @JsonProperty("activityDate")
    @JsonPropertyDescription("Lineage reference object : GXVDIRD_ACTIVITY_DATE")
    private Date activityDate;
    /**
     * Bank Routing Number
     * <p>
     * Lineage reference object : GXVDIRD_CODE_BANK_ROUT_NUM
     * (Required)
     * 
     */
    @JsonProperty("codeBankRoutNum")
    @JsonPropertyDescription("Lineage reference object : GXVDIRD_CODE_BANK_ROUT_NUM")
    private String codeBankRoutNum;
    /**
     * Lineage reference object : GXVDIRD_USER_ID
     * 
     */
    @JsonProperty("userId")
    @JsonPropertyDescription("Lineage reference object : GXVDIRD_USER_ID")
    private String userId;
    /**
     * Bank Name
     * <p>
     * Lineage reference object : GXVDIRD_DESC
     * (Required)
     * 
     */
    @JsonProperty("desc")
    @JsonPropertyDescription("Lineage reference object : GXVDIRD_DESC")
    private String desc;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Activity Date
     * <p>
     * Lineage reference object : GXVDIRD_ACTIVITY_DATE
     * (Required)
     * 
     */
    @JsonProperty("activityDate")
    public Date getActivityDate() {
        return activityDate;
    }

    /**
     * Activity Date
     * <p>
     * Lineage reference object : GXVDIRD_ACTIVITY_DATE
     * (Required)
     * 
     */
    @JsonProperty("activityDate")
    public void setActivityDate(Date activityDate) {
        this.activityDate = activityDate;
    }

    public BankRoutingNumberCodes100GetResponse withActivityDate(Date activityDate) {
        this.activityDate = activityDate;
        return this;
    }

    /**
     * Bank Routing Number
     * <p>
     * Lineage reference object : GXVDIRD_CODE_BANK_ROUT_NUM
     * (Required)
     * 
     */
    @JsonProperty("codeBankRoutNum")
    public String getCodeBankRoutNum() {
        return codeBankRoutNum;
    }

    /**
     * Bank Routing Number
     * <p>
     * Lineage reference object : GXVDIRD_CODE_BANK_ROUT_NUM
     * (Required)
     * 
     */
    @JsonProperty("codeBankRoutNum")
    public void setCodeBankRoutNum(String codeBankRoutNum) {
        this.codeBankRoutNum = codeBankRoutNum;
    }

    public BankRoutingNumberCodes100GetResponse withCodeBankRoutNum(String codeBankRoutNum) {
        this.codeBankRoutNum = codeBankRoutNum;
        return this;
    }

    /**
     * Lineage reference object : GXVDIRD_USER_ID
     * 
     */
    @JsonProperty("userId")
    public String getUserId() {
        return userId;
    }

    /**
     * Lineage reference object : GXVDIRD_USER_ID
     * 
     */
    @JsonProperty("userId")
    public void setUserId(String userId) {
        this.userId = userId;
    }

    public BankRoutingNumberCodes100GetResponse withUserId(String userId) {
        this.userId = userId;
        return this;
    }

    /**
     * Bank Name
     * <p>
     * Lineage reference object : GXVDIRD_DESC
     * (Required)
     * 
     */
    @JsonProperty("desc")
    public String getDesc() {
        return desc;
    }

    /**
     * Bank Name
     * <p>
     * Lineage reference object : GXVDIRD_DESC
     * (Required)
     * 
     */
    @JsonProperty("desc")
    public void setDesc(String desc) {
        this.desc = desc;
    }

    public BankRoutingNumberCodes100GetResponse withDesc(String desc) {
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

    public BankRoutingNumberCodes100GetResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(BankRoutingNumberCodes100GetResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("activityDate");
        sb.append('=');
        sb.append(((this.activityDate == null)?"<null>":this.activityDate));
        sb.append(',');
        sb.append("codeBankRoutNum");
        sb.append('=');
        sb.append(((this.codeBankRoutNum == null)?"<null>":this.codeBankRoutNum));
        sb.append(',');
        sb.append("userId");
        sb.append('=');
        sb.append(((this.userId == null)?"<null>":this.userId));
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
        result = ((result* 31)+((this.codeBankRoutNum == null)? 0 :this.codeBankRoutNum.hashCode()));
        result = ((result* 31)+((this.activityDate == null)? 0 :this.activityDate.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.userId == null)? 0 :this.userId.hashCode()));
        result = ((result* 31)+((this.desc == null)? 0 :this.desc.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof BankRoutingNumberCodes100GetResponse) == false) {
            return false;
        }
        BankRoutingNumberCodes100GetResponse rhs = ((BankRoutingNumberCodes100GetResponse) other);
        return ((((((this.codeBankRoutNum == rhs.codeBankRoutNum)||((this.codeBankRoutNum!= null)&&this.codeBankRoutNum.equals(rhs.codeBankRoutNum)))&&((this.activityDate == rhs.activityDate)||((this.activityDate!= null)&&this.activityDate.equals(rhs.activityDate))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.userId == rhs.userId)||((this.userId!= null)&&this.userId.equals(rhs.userId))))&&((this.desc == rhs.desc)||((this.desc!= null)&&this.desc.equals(rhs.desc))));
    }

}
