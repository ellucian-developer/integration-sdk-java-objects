
package com.ellucian.generated.bpapi.ban.attribute_values_maintenance.v1_0_0;

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
    "code",
    "validLocnInd",
    "endDate",
    "validAcctInd",
    "validAllInd",
    "beginDate",
    "activityDate",
    "validActvInd",
    "validOrgnInd",
    "validFundInd",
    "validProgInd",
    "desc",
    "gasbDeferInd"
})
@Generated("jsonschema2pojo")
public class AttributeValuesMaintenance100GetResponse {

    /**
     * Attribute Value
     * <p>
     * Lineage reference object : FTRATTV_CODE
     * (Required)
     * 
     */
    @JsonProperty("code")
    @JsonPropertyDescription("Lineage reference object : FTRATTV_CODE")
    private String code;
    /**
     * Lineage reference object : FTRATTV_VALID_LOCN_IND
     * 
     */
    @JsonProperty("validLocnInd")
    @JsonPropertyDescription("Lineage reference object : FTRATTV_VALID_LOCN_IND")
    private String validLocnInd;
    /**
     * End Date
     * <p>
     * Lineage reference object : FTRATTV_END_DATE
     * 
     */
    @JsonProperty("endDate")
    @JsonPropertyDescription("Lineage reference object : FTRATTV_END_DATE")
    private Date endDate;
    /**
     * Lineage reference object : FTRATTV_VALID_ACCT_IND
     * 
     */
    @JsonProperty("validAcctInd")
    @JsonPropertyDescription("Lineage reference object : FTRATTV_VALID_ACCT_IND")
    private String validAcctInd;
    /**
     * Lineage reference object : FTRATTV_VALID_ALL_IND
     * 
     */
    @JsonProperty("validAllInd")
    @JsonPropertyDescription("Lineage reference object : FTRATTV_VALID_ALL_IND")
    private String validAllInd;
    /**
     * Begin Date
     * <p>
     * Lineage reference object : FTRATTV_BEGIN_DATE
     * (Required)
     * 
     */
    @JsonProperty("beginDate")
    @JsonPropertyDescription("Lineage reference object : FTRATTV_BEGIN_DATE")
    private Date beginDate;
    /**
     * Activity Date
     * <p>
     * Lineage reference object : FTRATTV_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    @JsonPropertyDescription("Lineage reference object : FTRATTV_ACTIVITY_DATE")
    private Date activityDate;
    /**
     * Lineage reference object : FTRATTV_VALID_ACTV_IND
     * 
     */
    @JsonProperty("validActvInd")
    @JsonPropertyDescription("Lineage reference object : FTRATTV_VALID_ACTV_IND")
    private String validActvInd;
    /**
     * Lineage reference object : FTRATTV_VALID_ORGN_IND
     * 
     */
    @JsonProperty("validOrgnInd")
    @JsonPropertyDescription("Lineage reference object : FTRATTV_VALID_ORGN_IND")
    private String validOrgnInd;
    /**
     * Lineage reference object : FTRATTV_VALID_FUND_IND
     * 
     */
    @JsonProperty("validFundInd")
    @JsonPropertyDescription("Lineage reference object : FTRATTV_VALID_FUND_IND")
    private String validFundInd;
    /**
     * Lineage reference object : FTRATTV_VALID_PROG_IND
     * 
     */
    @JsonProperty("validProgInd")
    @JsonPropertyDescription("Lineage reference object : FTRATTV_VALID_PROG_IND")
    private String validProgInd;
    /**
     * Description
     * <p>
     * Lineage reference object : FTRATTV_DESC
     * (Required)
     * 
     */
    @JsonProperty("desc")
    @JsonPropertyDescription("Lineage reference object : FTRATTV_DESC")
    private String desc;
    /**
     * Lineage reference object : FTRATTV_GASB_DEFER_IND
     * 
     */
    @JsonProperty("gasbDeferInd")
    @JsonPropertyDescription("Lineage reference object : FTRATTV_GASB_DEFER_IND")
    private String gasbDeferInd;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Attribute Value
     * <p>
     * Lineage reference object : FTRATTV_CODE
     * (Required)
     * 
     */
    @JsonProperty("code")
    public String getCode() {
        return code;
    }

    /**
     * Attribute Value
     * <p>
     * Lineage reference object : FTRATTV_CODE
     * (Required)
     * 
     */
    @JsonProperty("code")
    public void setCode(String code) {
        this.code = code;
    }

    public AttributeValuesMaintenance100GetResponse withCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * Lineage reference object : FTRATTV_VALID_LOCN_IND
     * 
     */
    @JsonProperty("validLocnInd")
    public String getValidLocnInd() {
        return validLocnInd;
    }

    /**
     * Lineage reference object : FTRATTV_VALID_LOCN_IND
     * 
     */
    @JsonProperty("validLocnInd")
    public void setValidLocnInd(String validLocnInd) {
        this.validLocnInd = validLocnInd;
    }

    public AttributeValuesMaintenance100GetResponse withValidLocnInd(String validLocnInd) {
        this.validLocnInd = validLocnInd;
        return this;
    }

    /**
     * End Date
     * <p>
     * Lineage reference object : FTRATTV_END_DATE
     * 
     */
    @JsonProperty("endDate")
    public Date getEndDate() {
        return endDate;
    }

    /**
     * End Date
     * <p>
     * Lineage reference object : FTRATTV_END_DATE
     * 
     */
    @JsonProperty("endDate")
    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public AttributeValuesMaintenance100GetResponse withEndDate(Date endDate) {
        this.endDate = endDate;
        return this;
    }

    /**
     * Lineage reference object : FTRATTV_VALID_ACCT_IND
     * 
     */
    @JsonProperty("validAcctInd")
    public String getValidAcctInd() {
        return validAcctInd;
    }

    /**
     * Lineage reference object : FTRATTV_VALID_ACCT_IND
     * 
     */
    @JsonProperty("validAcctInd")
    public void setValidAcctInd(String validAcctInd) {
        this.validAcctInd = validAcctInd;
    }

    public AttributeValuesMaintenance100GetResponse withValidAcctInd(String validAcctInd) {
        this.validAcctInd = validAcctInd;
        return this;
    }

    /**
     * Lineage reference object : FTRATTV_VALID_ALL_IND
     * 
     */
    @JsonProperty("validAllInd")
    public String getValidAllInd() {
        return validAllInd;
    }

    /**
     * Lineage reference object : FTRATTV_VALID_ALL_IND
     * 
     */
    @JsonProperty("validAllInd")
    public void setValidAllInd(String validAllInd) {
        this.validAllInd = validAllInd;
    }

    public AttributeValuesMaintenance100GetResponse withValidAllInd(String validAllInd) {
        this.validAllInd = validAllInd;
        return this;
    }

    /**
     * Begin Date
     * <p>
     * Lineage reference object : FTRATTV_BEGIN_DATE
     * (Required)
     * 
     */
    @JsonProperty("beginDate")
    public Date getBeginDate() {
        return beginDate;
    }

    /**
     * Begin Date
     * <p>
     * Lineage reference object : FTRATTV_BEGIN_DATE
     * (Required)
     * 
     */
    @JsonProperty("beginDate")
    public void setBeginDate(Date beginDate) {
        this.beginDate = beginDate;
    }

    public AttributeValuesMaintenance100GetResponse withBeginDate(Date beginDate) {
        this.beginDate = beginDate;
        return this;
    }

    /**
     * Activity Date
     * <p>
     * Lineage reference object : FTRATTV_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public Date getActivityDate() {
        return activityDate;
    }

    /**
     * Activity Date
     * <p>
     * Lineage reference object : FTRATTV_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public void setActivityDate(Date activityDate) {
        this.activityDate = activityDate;
    }

    public AttributeValuesMaintenance100GetResponse withActivityDate(Date activityDate) {
        this.activityDate = activityDate;
        return this;
    }

    /**
     * Lineage reference object : FTRATTV_VALID_ACTV_IND
     * 
     */
    @JsonProperty("validActvInd")
    public String getValidActvInd() {
        return validActvInd;
    }

    /**
     * Lineage reference object : FTRATTV_VALID_ACTV_IND
     * 
     */
    @JsonProperty("validActvInd")
    public void setValidActvInd(String validActvInd) {
        this.validActvInd = validActvInd;
    }

    public AttributeValuesMaintenance100GetResponse withValidActvInd(String validActvInd) {
        this.validActvInd = validActvInd;
        return this;
    }

    /**
     * Lineage reference object : FTRATTV_VALID_ORGN_IND
     * 
     */
    @JsonProperty("validOrgnInd")
    public String getValidOrgnInd() {
        return validOrgnInd;
    }

    /**
     * Lineage reference object : FTRATTV_VALID_ORGN_IND
     * 
     */
    @JsonProperty("validOrgnInd")
    public void setValidOrgnInd(String validOrgnInd) {
        this.validOrgnInd = validOrgnInd;
    }

    public AttributeValuesMaintenance100GetResponse withValidOrgnInd(String validOrgnInd) {
        this.validOrgnInd = validOrgnInd;
        return this;
    }

    /**
     * Lineage reference object : FTRATTV_VALID_FUND_IND
     * 
     */
    @JsonProperty("validFundInd")
    public String getValidFundInd() {
        return validFundInd;
    }

    /**
     * Lineage reference object : FTRATTV_VALID_FUND_IND
     * 
     */
    @JsonProperty("validFundInd")
    public void setValidFundInd(String validFundInd) {
        this.validFundInd = validFundInd;
    }

    public AttributeValuesMaintenance100GetResponse withValidFundInd(String validFundInd) {
        this.validFundInd = validFundInd;
        return this;
    }

    /**
     * Lineage reference object : FTRATTV_VALID_PROG_IND
     * 
     */
    @JsonProperty("validProgInd")
    public String getValidProgInd() {
        return validProgInd;
    }

    /**
     * Lineage reference object : FTRATTV_VALID_PROG_IND
     * 
     */
    @JsonProperty("validProgInd")
    public void setValidProgInd(String validProgInd) {
        this.validProgInd = validProgInd;
    }

    public AttributeValuesMaintenance100GetResponse withValidProgInd(String validProgInd) {
        this.validProgInd = validProgInd;
        return this;
    }

    /**
     * Description
     * <p>
     * Lineage reference object : FTRATTV_DESC
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
     * Lineage reference object : FTRATTV_DESC
     * (Required)
     * 
     */
    @JsonProperty("desc")
    public void setDesc(String desc) {
        this.desc = desc;
    }

    public AttributeValuesMaintenance100GetResponse withDesc(String desc) {
        this.desc = desc;
        return this;
    }

    /**
     * Lineage reference object : FTRATTV_GASB_DEFER_IND
     * 
     */
    @JsonProperty("gasbDeferInd")
    public String getGasbDeferInd() {
        return gasbDeferInd;
    }

    /**
     * Lineage reference object : FTRATTV_GASB_DEFER_IND
     * 
     */
    @JsonProperty("gasbDeferInd")
    public void setGasbDeferInd(String gasbDeferInd) {
        this.gasbDeferInd = gasbDeferInd;
    }

    public AttributeValuesMaintenance100GetResponse withGasbDeferInd(String gasbDeferInd) {
        this.gasbDeferInd = gasbDeferInd;
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

    public AttributeValuesMaintenance100GetResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(AttributeValuesMaintenance100GetResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("code");
        sb.append('=');
        sb.append(((this.code == null)?"<null>":this.code));
        sb.append(',');
        sb.append("validLocnInd");
        sb.append('=');
        sb.append(((this.validLocnInd == null)?"<null>":this.validLocnInd));
        sb.append(',');
        sb.append("endDate");
        sb.append('=');
        sb.append(((this.endDate == null)?"<null>":this.endDate));
        sb.append(',');
        sb.append("validAcctInd");
        sb.append('=');
        sb.append(((this.validAcctInd == null)?"<null>":this.validAcctInd));
        sb.append(',');
        sb.append("validAllInd");
        sb.append('=');
        sb.append(((this.validAllInd == null)?"<null>":this.validAllInd));
        sb.append(',');
        sb.append("beginDate");
        sb.append('=');
        sb.append(((this.beginDate == null)?"<null>":this.beginDate));
        sb.append(',');
        sb.append("activityDate");
        sb.append('=');
        sb.append(((this.activityDate == null)?"<null>":this.activityDate));
        sb.append(',');
        sb.append("validActvInd");
        sb.append('=');
        sb.append(((this.validActvInd == null)?"<null>":this.validActvInd));
        sb.append(',');
        sb.append("validOrgnInd");
        sb.append('=');
        sb.append(((this.validOrgnInd == null)?"<null>":this.validOrgnInd));
        sb.append(',');
        sb.append("validFundInd");
        sb.append('=');
        sb.append(((this.validFundInd == null)?"<null>":this.validFundInd));
        sb.append(',');
        sb.append("validProgInd");
        sb.append('=');
        sb.append(((this.validProgInd == null)?"<null>":this.validProgInd));
        sb.append(',');
        sb.append("desc");
        sb.append('=');
        sb.append(((this.desc == null)?"<null>":this.desc));
        sb.append(',');
        sb.append("gasbDeferInd");
        sb.append('=');
        sb.append(((this.gasbDeferInd == null)?"<null>":this.gasbDeferInd));
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
        result = ((result* 31)+((this.endDate == null)? 0 :this.endDate.hashCode()));
        result = ((result* 31)+((this.validAcctInd == null)? 0 :this.validAcctInd.hashCode()));
        result = ((result* 31)+((this.validAllInd == null)? 0 :this.validAllInd.hashCode()));
        result = ((result* 31)+((this.beginDate == null)? 0 :this.beginDate.hashCode()));
        result = ((result* 31)+((this.activityDate == null)? 0 :this.activityDate.hashCode()));
        result = ((result* 31)+((this.validActvInd == null)? 0 :this.validActvInd.hashCode()));
        result = ((result* 31)+((this.validOrgnInd == null)? 0 :this.validOrgnInd.hashCode()));
        result = ((result* 31)+((this.validFundInd == null)? 0 :this.validFundInd.hashCode()));
        result = ((result* 31)+((this.validProgInd == null)? 0 :this.validProgInd.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.desc == null)? 0 :this.desc.hashCode()));
        result = ((result* 31)+((this.gasbDeferInd == null)? 0 :this.gasbDeferInd.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof AttributeValuesMaintenance100GetResponse) == false) {
            return false;
        }
        AttributeValuesMaintenance100GetResponse rhs = ((AttributeValuesMaintenance100GetResponse) other);
        return (((((((((((((((this.code == rhs.code)||((this.code!= null)&&this.code.equals(rhs.code)))&&((this.validLocnInd == rhs.validLocnInd)||((this.validLocnInd!= null)&&this.validLocnInd.equals(rhs.validLocnInd))))&&((this.endDate == rhs.endDate)||((this.endDate!= null)&&this.endDate.equals(rhs.endDate))))&&((this.validAcctInd == rhs.validAcctInd)||((this.validAcctInd!= null)&&this.validAcctInd.equals(rhs.validAcctInd))))&&((this.validAllInd == rhs.validAllInd)||((this.validAllInd!= null)&&this.validAllInd.equals(rhs.validAllInd))))&&((this.beginDate == rhs.beginDate)||((this.beginDate!= null)&&this.beginDate.equals(rhs.beginDate))))&&((this.activityDate == rhs.activityDate)||((this.activityDate!= null)&&this.activityDate.equals(rhs.activityDate))))&&((this.validActvInd == rhs.validActvInd)||((this.validActvInd!= null)&&this.validActvInd.equals(rhs.validActvInd))))&&((this.validOrgnInd == rhs.validOrgnInd)||((this.validOrgnInd!= null)&&this.validOrgnInd.equals(rhs.validOrgnInd))))&&((this.validFundInd == rhs.validFundInd)||((this.validFundInd!= null)&&this.validFundInd.equals(rhs.validFundInd))))&&((this.validProgInd == rhs.validProgInd)||((this.validProgInd!= null)&&this.validProgInd.equals(rhs.validProgInd))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.desc == rhs.desc)||((this.desc!= null)&&this.desc.equals(rhs.desc))))&&((this.gasbDeferInd == rhs.gasbDeferInd)||((this.gasbDeferInd!= null)&&this.gasbDeferInd.equals(rhs.gasbDeferInd))));
    }

}
