
package com.ellucian.generated.bpapi.ban.attribute_type_maintenance.v1_0_0;

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
    "coasCode",
    "code",
    "desc",
    "validAllInd",
    "validFundInd",
    "validOrgnInd",
    "validAcctInd",
    "validProgInd",
    "validActvInd",
    "validLocnInd",
    "statusInd",
    "activityDate"
})
@Generated("jsonschema2pojo")
public class AttributeTypeMaintenance100QapiPost {

    /**
     * COA
     * <p>
     * Lineage reference object : FTVATTT_COAS_CODE, Lookup lineage reference object : ftvcoas
     * 
     */
    @JsonProperty("coasCode")
    @JsonPropertyDescription("Lineage reference object : FTVATTT_COAS_CODE, Lookup lineage reference object : ftvcoas")
    private String coasCode;
    /**
     * Attribute Type
     * <p>
     * Lineage reference object : FTVATTT_CODE
     * 
     */
    @JsonProperty("code")
    @JsonPropertyDescription("Lineage reference object : FTVATTT_CODE")
    private String code;
    /**
     * Description
     * <p>
     * Lineage reference object : FTVATTT_DESC
     * 
     */
    @JsonProperty("desc")
    @JsonPropertyDescription("Lineage reference object : FTVATTT_DESC")
    private String desc;
    /**
     * Lineage reference object : FTVATTT_VALID_ALL_IND
     * 
     */
    @JsonProperty("validAllInd")
    @JsonPropertyDescription("Lineage reference object : FTVATTT_VALID_ALL_IND")
    private String validAllInd;
    /**
     * Lineage reference object : FTVATTT_VALID_FUND_IND
     * 
     */
    @JsonProperty("validFundInd")
    @JsonPropertyDescription("Lineage reference object : FTVATTT_VALID_FUND_IND")
    private String validFundInd;
    /**
     * Lineage reference object : FTVATTT_VALID_ORGN_IND
     * 
     */
    @JsonProperty("validOrgnInd")
    @JsonPropertyDescription("Lineage reference object : FTVATTT_VALID_ORGN_IND")
    private String validOrgnInd;
    /**
     * Lineage reference object : FTVATTT_VALID_ACCT_IND
     * 
     */
    @JsonProperty("validAcctInd")
    @JsonPropertyDescription("Lineage reference object : FTVATTT_VALID_ACCT_IND")
    private String validAcctInd;
    /**
     * Lineage reference object : FTVATTT_VALID_PROG_IND
     * 
     */
    @JsonProperty("validProgInd")
    @JsonPropertyDescription("Lineage reference object : FTVATTT_VALID_PROG_IND")
    private String validProgInd;
    /**
     * Lineage reference object : FTVATTT_VALID_ACTV_IND
     * 
     */
    @JsonProperty("validActvInd")
    @JsonPropertyDescription("Lineage reference object : FTVATTT_VALID_ACTV_IND")
    private String validActvInd;
    /**
     * Lineage reference object : FTVATTT_VALID_LOCN_IND
     * 
     */
    @JsonProperty("validLocnInd")
    @JsonPropertyDescription("Lineage reference object : FTVATTT_VALID_LOCN_IND")
    private String validLocnInd;
    /**
     * Lineage reference object : FTVATTT_STATUS_IND
     * 
     */
    @JsonProperty("statusInd")
    @JsonPropertyDescription("Lineage reference object : FTVATTT_STATUS_IND")
    private String statusInd;
    /**
     * Activity Date
     * <p>
     * Lineage reference object : FTVATTT_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    @JsonPropertyDescription("Lineage reference object : FTVATTT_ACTIVITY_DATE")
    private Date activityDate;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * COA
     * <p>
     * Lineage reference object : FTVATTT_COAS_CODE, Lookup lineage reference object : ftvcoas
     * 
     */
    @JsonProperty("coasCode")
    public String getCoasCode() {
        return coasCode;
    }

    /**
     * COA
     * <p>
     * Lineage reference object : FTVATTT_COAS_CODE, Lookup lineage reference object : ftvcoas
     * 
     */
    @JsonProperty("coasCode")
    public void setCoasCode(String coasCode) {
        this.coasCode = coasCode;
    }

    public AttributeTypeMaintenance100QapiPost withCoasCode(String coasCode) {
        this.coasCode = coasCode;
        return this;
    }

    /**
     * Attribute Type
     * <p>
     * Lineage reference object : FTVATTT_CODE
     * 
     */
    @JsonProperty("code")
    public String getCode() {
        return code;
    }

    /**
     * Attribute Type
     * <p>
     * Lineage reference object : FTVATTT_CODE
     * 
     */
    @JsonProperty("code")
    public void setCode(String code) {
        this.code = code;
    }

    public AttributeTypeMaintenance100QapiPost withCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * Description
     * <p>
     * Lineage reference object : FTVATTT_DESC
     * 
     */
    @JsonProperty("desc")
    public String getDesc() {
        return desc;
    }

    /**
     * Description
     * <p>
     * Lineage reference object : FTVATTT_DESC
     * 
     */
    @JsonProperty("desc")
    public void setDesc(String desc) {
        this.desc = desc;
    }

    public AttributeTypeMaintenance100QapiPost withDesc(String desc) {
        this.desc = desc;
        return this;
    }

    /**
     * Lineage reference object : FTVATTT_VALID_ALL_IND
     * 
     */
    @JsonProperty("validAllInd")
    public String getValidAllInd() {
        return validAllInd;
    }

    /**
     * Lineage reference object : FTVATTT_VALID_ALL_IND
     * 
     */
    @JsonProperty("validAllInd")
    public void setValidAllInd(String validAllInd) {
        this.validAllInd = validAllInd;
    }

    public AttributeTypeMaintenance100QapiPost withValidAllInd(String validAllInd) {
        this.validAllInd = validAllInd;
        return this;
    }

    /**
     * Lineage reference object : FTVATTT_VALID_FUND_IND
     * 
     */
    @JsonProperty("validFundInd")
    public String getValidFundInd() {
        return validFundInd;
    }

    /**
     * Lineage reference object : FTVATTT_VALID_FUND_IND
     * 
     */
    @JsonProperty("validFundInd")
    public void setValidFundInd(String validFundInd) {
        this.validFundInd = validFundInd;
    }

    public AttributeTypeMaintenance100QapiPost withValidFundInd(String validFundInd) {
        this.validFundInd = validFundInd;
        return this;
    }

    /**
     * Lineage reference object : FTVATTT_VALID_ORGN_IND
     * 
     */
    @JsonProperty("validOrgnInd")
    public String getValidOrgnInd() {
        return validOrgnInd;
    }

    /**
     * Lineage reference object : FTVATTT_VALID_ORGN_IND
     * 
     */
    @JsonProperty("validOrgnInd")
    public void setValidOrgnInd(String validOrgnInd) {
        this.validOrgnInd = validOrgnInd;
    }

    public AttributeTypeMaintenance100QapiPost withValidOrgnInd(String validOrgnInd) {
        this.validOrgnInd = validOrgnInd;
        return this;
    }

    /**
     * Lineage reference object : FTVATTT_VALID_ACCT_IND
     * 
     */
    @JsonProperty("validAcctInd")
    public String getValidAcctInd() {
        return validAcctInd;
    }

    /**
     * Lineage reference object : FTVATTT_VALID_ACCT_IND
     * 
     */
    @JsonProperty("validAcctInd")
    public void setValidAcctInd(String validAcctInd) {
        this.validAcctInd = validAcctInd;
    }

    public AttributeTypeMaintenance100QapiPost withValidAcctInd(String validAcctInd) {
        this.validAcctInd = validAcctInd;
        return this;
    }

    /**
     * Lineage reference object : FTVATTT_VALID_PROG_IND
     * 
     */
    @JsonProperty("validProgInd")
    public String getValidProgInd() {
        return validProgInd;
    }

    /**
     * Lineage reference object : FTVATTT_VALID_PROG_IND
     * 
     */
    @JsonProperty("validProgInd")
    public void setValidProgInd(String validProgInd) {
        this.validProgInd = validProgInd;
    }

    public AttributeTypeMaintenance100QapiPost withValidProgInd(String validProgInd) {
        this.validProgInd = validProgInd;
        return this;
    }

    /**
     * Lineage reference object : FTVATTT_VALID_ACTV_IND
     * 
     */
    @JsonProperty("validActvInd")
    public String getValidActvInd() {
        return validActvInd;
    }

    /**
     * Lineage reference object : FTVATTT_VALID_ACTV_IND
     * 
     */
    @JsonProperty("validActvInd")
    public void setValidActvInd(String validActvInd) {
        this.validActvInd = validActvInd;
    }

    public AttributeTypeMaintenance100QapiPost withValidActvInd(String validActvInd) {
        this.validActvInd = validActvInd;
        return this;
    }

    /**
     * Lineage reference object : FTVATTT_VALID_LOCN_IND
     * 
     */
    @JsonProperty("validLocnInd")
    public String getValidLocnInd() {
        return validLocnInd;
    }

    /**
     * Lineage reference object : FTVATTT_VALID_LOCN_IND
     * 
     */
    @JsonProperty("validLocnInd")
    public void setValidLocnInd(String validLocnInd) {
        this.validLocnInd = validLocnInd;
    }

    public AttributeTypeMaintenance100QapiPost withValidLocnInd(String validLocnInd) {
        this.validLocnInd = validLocnInd;
        return this;
    }

    /**
     * Lineage reference object : FTVATTT_STATUS_IND
     * 
     */
    @JsonProperty("statusInd")
    public String getStatusInd() {
        return statusInd;
    }

    /**
     * Lineage reference object : FTVATTT_STATUS_IND
     * 
     */
    @JsonProperty("statusInd")
    public void setStatusInd(String statusInd) {
        this.statusInd = statusInd;
    }

    public AttributeTypeMaintenance100QapiPost withStatusInd(String statusInd) {
        this.statusInd = statusInd;
        return this;
    }

    /**
     * Activity Date
     * <p>
     * Lineage reference object : FTVATTT_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public Date getActivityDate() {
        return activityDate;
    }

    /**
     * Activity Date
     * <p>
     * Lineage reference object : FTVATTT_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public void setActivityDate(Date activityDate) {
        this.activityDate = activityDate;
    }

    public AttributeTypeMaintenance100QapiPost withActivityDate(Date activityDate) {
        this.activityDate = activityDate;
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

    public AttributeTypeMaintenance100QapiPost withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(AttributeTypeMaintenance100QapiPost.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("coasCode");
        sb.append('=');
        sb.append(((this.coasCode == null)?"<null>":this.coasCode));
        sb.append(',');
        sb.append("code");
        sb.append('=');
        sb.append(((this.code == null)?"<null>":this.code));
        sb.append(',');
        sb.append("desc");
        sb.append('=');
        sb.append(((this.desc == null)?"<null>":this.desc));
        sb.append(',');
        sb.append("validAllInd");
        sb.append('=');
        sb.append(((this.validAllInd == null)?"<null>":this.validAllInd));
        sb.append(',');
        sb.append("validFundInd");
        sb.append('=');
        sb.append(((this.validFundInd == null)?"<null>":this.validFundInd));
        sb.append(',');
        sb.append("validOrgnInd");
        sb.append('=');
        sb.append(((this.validOrgnInd == null)?"<null>":this.validOrgnInd));
        sb.append(',');
        sb.append("validAcctInd");
        sb.append('=');
        sb.append(((this.validAcctInd == null)?"<null>":this.validAcctInd));
        sb.append(',');
        sb.append("validProgInd");
        sb.append('=');
        sb.append(((this.validProgInd == null)?"<null>":this.validProgInd));
        sb.append(',');
        sb.append("validActvInd");
        sb.append('=');
        sb.append(((this.validActvInd == null)?"<null>":this.validActvInd));
        sb.append(',');
        sb.append("validLocnInd");
        sb.append('=');
        sb.append(((this.validLocnInd == null)?"<null>":this.validLocnInd));
        sb.append(',');
        sb.append("statusInd");
        sb.append('=');
        sb.append(((this.statusInd == null)?"<null>":this.statusInd));
        sb.append(',');
        sb.append("activityDate");
        sb.append('=');
        sb.append(((this.activityDate == null)?"<null>":this.activityDate));
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
        result = ((result* 31)+((this.validLocnInd == null)? 0 :this.validLocnInd.hashCode()));
        result = ((result* 31)+((this.coasCode == null)? 0 :this.coasCode.hashCode()));
        result = ((result* 31)+((this.validAcctInd == null)? 0 :this.validAcctInd.hashCode()));
        result = ((result* 31)+((this.validAllInd == null)? 0 :this.validAllInd.hashCode()));
        result = ((result* 31)+((this.activityDate == null)? 0 :this.activityDate.hashCode()));
        result = ((result* 31)+((this.validActvInd == null)? 0 :this.validActvInd.hashCode()));
        result = ((result* 31)+((this.statusInd == null)? 0 :this.statusInd.hashCode()));
        result = ((result* 31)+((this.validOrgnInd == null)? 0 :this.validOrgnInd.hashCode()));
        result = ((result* 31)+((this.validFundInd == null)? 0 :this.validFundInd.hashCode()));
        result = ((result* 31)+((this.validProgInd == null)? 0 :this.validProgInd.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.desc == null)? 0 :this.desc.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof AttributeTypeMaintenance100QapiPost) == false) {
            return false;
        }
        AttributeTypeMaintenance100QapiPost rhs = ((AttributeTypeMaintenance100QapiPost) other);
        return ((((((((((((((this.code == rhs.code)||((this.code!= null)&&this.code.equals(rhs.code)))&&((this.validLocnInd == rhs.validLocnInd)||((this.validLocnInd!= null)&&this.validLocnInd.equals(rhs.validLocnInd))))&&((this.coasCode == rhs.coasCode)||((this.coasCode!= null)&&this.coasCode.equals(rhs.coasCode))))&&((this.validAcctInd == rhs.validAcctInd)||((this.validAcctInd!= null)&&this.validAcctInd.equals(rhs.validAcctInd))))&&((this.validAllInd == rhs.validAllInd)||((this.validAllInd!= null)&&this.validAllInd.equals(rhs.validAllInd))))&&((this.activityDate == rhs.activityDate)||((this.activityDate!= null)&&this.activityDate.equals(rhs.activityDate))))&&((this.validActvInd == rhs.validActvInd)||((this.validActvInd!= null)&&this.validActvInd.equals(rhs.validActvInd))))&&((this.statusInd == rhs.statusInd)||((this.statusInd!= null)&&this.statusInd.equals(rhs.statusInd))))&&((this.validOrgnInd == rhs.validOrgnInd)||((this.validOrgnInd!= null)&&this.validOrgnInd.equals(rhs.validOrgnInd))))&&((this.validFundInd == rhs.validFundInd)||((this.validFundInd!= null)&&this.validFundInd.equals(rhs.validFundInd))))&&((this.validProgInd == rhs.validProgInd)||((this.validProgInd!= null)&&this.validProgInd.equals(rhs.validProgInd))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.desc == rhs.desc)||((this.desc!= null)&&this.desc.equals(rhs.desc))));
    }

}
