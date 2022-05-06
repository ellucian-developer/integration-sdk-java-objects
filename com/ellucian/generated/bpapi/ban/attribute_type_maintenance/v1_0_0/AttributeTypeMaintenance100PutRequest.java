
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
    "criteria.validActvInd",
    "criteria.activityDate",
    "validLocnInd",
    "criteria.validAcctInd",
    "criteria.statusInd",
    "criteria.validOrgnInd",
    "validAcctInd",
    "criteria.validFundInd",
    "validAllInd",
    "criteria.desc",
    "criteria.validProgInd",
    "criteria.validAllInd",
    "criteria.code",
    "criteria.validLocnInd",
    "validActvInd",
    "statusInd",
    "validOrgnInd",
    "criteria.coasCode",
    "validFundInd",
    "validProgInd"
})
@Generated("jsonschema2pojo")
public class AttributeTypeMaintenance100PutRequest {

    /**
     * Lineage reference object : FTVATTT_VALID_ACTV_IND
     * 
     */
    @JsonProperty("criteria.validActvInd")
    @JsonPropertyDescription("Lineage reference object : FTVATTT_VALID_ACTV_IND")
    private String criteriaValidActvInd;
    /**
     * Activity Date
     * <p>
     * Lineage reference object : FTVATTT_ACTIVITY_DATE
     * 
     */
    @JsonProperty("criteria.activityDate")
    @JsonPropertyDescription("Lineage reference object : FTVATTT_ACTIVITY_DATE")
    private Date criteriaActivityDate;
    /**
     * Lineage reference object : FTVATTT_VALID_LOCN_IND
     * 
     */
    @JsonProperty("validLocnInd")
    @JsonPropertyDescription("Lineage reference object : FTVATTT_VALID_LOCN_IND")
    private String validLocnInd;
    /**
     * Lineage reference object : FTVATTT_VALID_ACCT_IND
     * 
     */
    @JsonProperty("criteria.validAcctInd")
    @JsonPropertyDescription("Lineage reference object : FTVATTT_VALID_ACCT_IND")
    private String criteriaValidAcctInd;
    /**
     * Lineage reference object : FTVATTT_STATUS_IND
     * 
     */
    @JsonProperty("criteria.statusInd")
    @JsonPropertyDescription("Lineage reference object : FTVATTT_STATUS_IND")
    private String criteriaStatusInd;
    /**
     * Lineage reference object : FTVATTT_VALID_ORGN_IND
     * 
     */
    @JsonProperty("criteria.validOrgnInd")
    @JsonPropertyDescription("Lineage reference object : FTVATTT_VALID_ORGN_IND")
    private String criteriaValidOrgnInd;
    /**
     * Lineage reference object : FTVATTT_VALID_ACCT_IND
     * 
     */
    @JsonProperty("validAcctInd")
    @JsonPropertyDescription("Lineage reference object : FTVATTT_VALID_ACCT_IND")
    private String validAcctInd;
    /**
     * Lineage reference object : FTVATTT_VALID_FUND_IND
     * 
     */
    @JsonProperty("criteria.validFundInd")
    @JsonPropertyDescription("Lineage reference object : FTVATTT_VALID_FUND_IND")
    private String criteriaValidFundInd;
    /**
     * Lineage reference object : FTVATTT_VALID_ALL_IND
     * 
     */
    @JsonProperty("validAllInd")
    @JsonPropertyDescription("Lineage reference object : FTVATTT_VALID_ALL_IND")
    private String validAllInd;
    /**
     * Description
     * <p>
     * Lineage reference object : FTVATTT_DESC
     * (Required)
     * 
     */
    @JsonProperty("criteria.desc")
    @JsonPropertyDescription("Lineage reference object : FTVATTT_DESC")
    private String criteriaDesc;
    /**
     * Lineage reference object : FTVATTT_VALID_PROG_IND
     * 
     */
    @JsonProperty("criteria.validProgInd")
    @JsonPropertyDescription("Lineage reference object : FTVATTT_VALID_PROG_IND")
    private String criteriaValidProgInd;
    /**
     * Lineage reference object : FTVATTT_VALID_ALL_IND
     * 
     */
    @JsonProperty("criteria.validAllInd")
    @JsonPropertyDescription("Lineage reference object : FTVATTT_VALID_ALL_IND")
    private String criteriaValidAllInd;
    /**
     * Attribute Type
     * <p>
     * Lineage reference object : FTVATTT_CODE
     * (Required)
     * 
     */
    @JsonProperty("criteria.code")
    @JsonPropertyDescription("Lineage reference object : FTVATTT_CODE")
    private String criteriaCode;
    /**
     * Lineage reference object : FTVATTT_VALID_LOCN_IND
     * 
     */
    @JsonProperty("criteria.validLocnInd")
    @JsonPropertyDescription("Lineage reference object : FTVATTT_VALID_LOCN_IND")
    private String criteriaValidLocnInd;
    /**
     * Lineage reference object : FTVATTT_VALID_ACTV_IND
     * 
     */
    @JsonProperty("validActvInd")
    @JsonPropertyDescription("Lineage reference object : FTVATTT_VALID_ACTV_IND")
    private String validActvInd;
    /**
     * Lineage reference object : FTVATTT_STATUS_IND
     * 
     */
    @JsonProperty("statusInd")
    @JsonPropertyDescription("Lineage reference object : FTVATTT_STATUS_IND")
    private String statusInd;
    /**
     * Lineage reference object : FTVATTT_VALID_ORGN_IND
     * 
     */
    @JsonProperty("validOrgnInd")
    @JsonPropertyDescription("Lineage reference object : FTVATTT_VALID_ORGN_IND")
    private String validOrgnInd;
    /**
     * COA
     * <p>
     * Lineage reference object : FTVATTT_COAS_CODE, Lookup lineage reference object : ftvcoas
     * (Required)
     * 
     */
    @JsonProperty("criteria.coasCode")
    @JsonPropertyDescription("Lineage reference object : FTVATTT_COAS_CODE, Lookup lineage reference object : ftvcoas")
    private String criteriaCoasCode;
    /**
     * Lineage reference object : FTVATTT_VALID_FUND_IND
     * 
     */
    @JsonProperty("validFundInd")
    @JsonPropertyDescription("Lineage reference object : FTVATTT_VALID_FUND_IND")
    private String validFundInd;
    /**
     * Lineage reference object : FTVATTT_VALID_PROG_IND
     * 
     */
    @JsonProperty("validProgInd")
    @JsonPropertyDescription("Lineage reference object : FTVATTT_VALID_PROG_IND")
    private String validProgInd;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Lineage reference object : FTVATTT_VALID_ACTV_IND
     * 
     */
    @JsonProperty("criteria.validActvInd")
    public String getCriteriaValidActvInd() {
        return criteriaValidActvInd;
    }

    /**
     * Lineage reference object : FTVATTT_VALID_ACTV_IND
     * 
     */
    @JsonProperty("criteria.validActvInd")
    public void setCriteriaValidActvInd(String criteriaValidActvInd) {
        this.criteriaValidActvInd = criteriaValidActvInd;
    }

    public AttributeTypeMaintenance100PutRequest withCriteriaValidActvInd(String criteriaValidActvInd) {
        this.criteriaValidActvInd = criteriaValidActvInd;
        return this;
    }

    /**
     * Activity Date
     * <p>
     * Lineage reference object : FTVATTT_ACTIVITY_DATE
     * 
     */
    @JsonProperty("criteria.activityDate")
    public Date getCriteriaActivityDate() {
        return criteriaActivityDate;
    }

    /**
     * Activity Date
     * <p>
     * Lineage reference object : FTVATTT_ACTIVITY_DATE
     * 
     */
    @JsonProperty("criteria.activityDate")
    public void setCriteriaActivityDate(Date criteriaActivityDate) {
        this.criteriaActivityDate = criteriaActivityDate;
    }

    public AttributeTypeMaintenance100PutRequest withCriteriaActivityDate(Date criteriaActivityDate) {
        this.criteriaActivityDate = criteriaActivityDate;
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

    public AttributeTypeMaintenance100PutRequest withValidLocnInd(String validLocnInd) {
        this.validLocnInd = validLocnInd;
        return this;
    }

    /**
     * Lineage reference object : FTVATTT_VALID_ACCT_IND
     * 
     */
    @JsonProperty("criteria.validAcctInd")
    public String getCriteriaValidAcctInd() {
        return criteriaValidAcctInd;
    }

    /**
     * Lineage reference object : FTVATTT_VALID_ACCT_IND
     * 
     */
    @JsonProperty("criteria.validAcctInd")
    public void setCriteriaValidAcctInd(String criteriaValidAcctInd) {
        this.criteriaValidAcctInd = criteriaValidAcctInd;
    }

    public AttributeTypeMaintenance100PutRequest withCriteriaValidAcctInd(String criteriaValidAcctInd) {
        this.criteriaValidAcctInd = criteriaValidAcctInd;
        return this;
    }

    /**
     * Lineage reference object : FTVATTT_STATUS_IND
     * 
     */
    @JsonProperty("criteria.statusInd")
    public String getCriteriaStatusInd() {
        return criteriaStatusInd;
    }

    /**
     * Lineage reference object : FTVATTT_STATUS_IND
     * 
     */
    @JsonProperty("criteria.statusInd")
    public void setCriteriaStatusInd(String criteriaStatusInd) {
        this.criteriaStatusInd = criteriaStatusInd;
    }

    public AttributeTypeMaintenance100PutRequest withCriteriaStatusInd(String criteriaStatusInd) {
        this.criteriaStatusInd = criteriaStatusInd;
        return this;
    }

    /**
     * Lineage reference object : FTVATTT_VALID_ORGN_IND
     * 
     */
    @JsonProperty("criteria.validOrgnInd")
    public String getCriteriaValidOrgnInd() {
        return criteriaValidOrgnInd;
    }

    /**
     * Lineage reference object : FTVATTT_VALID_ORGN_IND
     * 
     */
    @JsonProperty("criteria.validOrgnInd")
    public void setCriteriaValidOrgnInd(String criteriaValidOrgnInd) {
        this.criteriaValidOrgnInd = criteriaValidOrgnInd;
    }

    public AttributeTypeMaintenance100PutRequest withCriteriaValidOrgnInd(String criteriaValidOrgnInd) {
        this.criteriaValidOrgnInd = criteriaValidOrgnInd;
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

    public AttributeTypeMaintenance100PutRequest withValidAcctInd(String validAcctInd) {
        this.validAcctInd = validAcctInd;
        return this;
    }

    /**
     * Lineage reference object : FTVATTT_VALID_FUND_IND
     * 
     */
    @JsonProperty("criteria.validFundInd")
    public String getCriteriaValidFundInd() {
        return criteriaValidFundInd;
    }

    /**
     * Lineage reference object : FTVATTT_VALID_FUND_IND
     * 
     */
    @JsonProperty("criteria.validFundInd")
    public void setCriteriaValidFundInd(String criteriaValidFundInd) {
        this.criteriaValidFundInd = criteriaValidFundInd;
    }

    public AttributeTypeMaintenance100PutRequest withCriteriaValidFundInd(String criteriaValidFundInd) {
        this.criteriaValidFundInd = criteriaValidFundInd;
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

    public AttributeTypeMaintenance100PutRequest withValidAllInd(String validAllInd) {
        this.validAllInd = validAllInd;
        return this;
    }

    /**
     * Description
     * <p>
     * Lineage reference object : FTVATTT_DESC
     * (Required)
     * 
     */
    @JsonProperty("criteria.desc")
    public String getCriteriaDesc() {
        return criteriaDesc;
    }

    /**
     * Description
     * <p>
     * Lineage reference object : FTVATTT_DESC
     * (Required)
     * 
     */
    @JsonProperty("criteria.desc")
    public void setCriteriaDesc(String criteriaDesc) {
        this.criteriaDesc = criteriaDesc;
    }

    public AttributeTypeMaintenance100PutRequest withCriteriaDesc(String criteriaDesc) {
        this.criteriaDesc = criteriaDesc;
        return this;
    }

    /**
     * Lineage reference object : FTVATTT_VALID_PROG_IND
     * 
     */
    @JsonProperty("criteria.validProgInd")
    public String getCriteriaValidProgInd() {
        return criteriaValidProgInd;
    }

    /**
     * Lineage reference object : FTVATTT_VALID_PROG_IND
     * 
     */
    @JsonProperty("criteria.validProgInd")
    public void setCriteriaValidProgInd(String criteriaValidProgInd) {
        this.criteriaValidProgInd = criteriaValidProgInd;
    }

    public AttributeTypeMaintenance100PutRequest withCriteriaValidProgInd(String criteriaValidProgInd) {
        this.criteriaValidProgInd = criteriaValidProgInd;
        return this;
    }

    /**
     * Lineage reference object : FTVATTT_VALID_ALL_IND
     * 
     */
    @JsonProperty("criteria.validAllInd")
    public String getCriteriaValidAllInd() {
        return criteriaValidAllInd;
    }

    /**
     * Lineage reference object : FTVATTT_VALID_ALL_IND
     * 
     */
    @JsonProperty("criteria.validAllInd")
    public void setCriteriaValidAllInd(String criteriaValidAllInd) {
        this.criteriaValidAllInd = criteriaValidAllInd;
    }

    public AttributeTypeMaintenance100PutRequest withCriteriaValidAllInd(String criteriaValidAllInd) {
        this.criteriaValidAllInd = criteriaValidAllInd;
        return this;
    }

    /**
     * Attribute Type
     * <p>
     * Lineage reference object : FTVATTT_CODE
     * (Required)
     * 
     */
    @JsonProperty("criteria.code")
    public String getCriteriaCode() {
        return criteriaCode;
    }

    /**
     * Attribute Type
     * <p>
     * Lineage reference object : FTVATTT_CODE
     * (Required)
     * 
     */
    @JsonProperty("criteria.code")
    public void setCriteriaCode(String criteriaCode) {
        this.criteriaCode = criteriaCode;
    }

    public AttributeTypeMaintenance100PutRequest withCriteriaCode(String criteriaCode) {
        this.criteriaCode = criteriaCode;
        return this;
    }

    /**
     * Lineage reference object : FTVATTT_VALID_LOCN_IND
     * 
     */
    @JsonProperty("criteria.validLocnInd")
    public String getCriteriaValidLocnInd() {
        return criteriaValidLocnInd;
    }

    /**
     * Lineage reference object : FTVATTT_VALID_LOCN_IND
     * 
     */
    @JsonProperty("criteria.validLocnInd")
    public void setCriteriaValidLocnInd(String criteriaValidLocnInd) {
        this.criteriaValidLocnInd = criteriaValidLocnInd;
    }

    public AttributeTypeMaintenance100PutRequest withCriteriaValidLocnInd(String criteriaValidLocnInd) {
        this.criteriaValidLocnInd = criteriaValidLocnInd;
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

    public AttributeTypeMaintenance100PutRequest withValidActvInd(String validActvInd) {
        this.validActvInd = validActvInd;
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

    public AttributeTypeMaintenance100PutRequest withStatusInd(String statusInd) {
        this.statusInd = statusInd;
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

    public AttributeTypeMaintenance100PutRequest withValidOrgnInd(String validOrgnInd) {
        this.validOrgnInd = validOrgnInd;
        return this;
    }

    /**
     * COA
     * <p>
     * Lineage reference object : FTVATTT_COAS_CODE, Lookup lineage reference object : ftvcoas
     * (Required)
     * 
     */
    @JsonProperty("criteria.coasCode")
    public String getCriteriaCoasCode() {
        return criteriaCoasCode;
    }

    /**
     * COA
     * <p>
     * Lineage reference object : FTVATTT_COAS_CODE, Lookup lineage reference object : ftvcoas
     * (Required)
     * 
     */
    @JsonProperty("criteria.coasCode")
    public void setCriteriaCoasCode(String criteriaCoasCode) {
        this.criteriaCoasCode = criteriaCoasCode;
    }

    public AttributeTypeMaintenance100PutRequest withCriteriaCoasCode(String criteriaCoasCode) {
        this.criteriaCoasCode = criteriaCoasCode;
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

    public AttributeTypeMaintenance100PutRequest withValidFundInd(String validFundInd) {
        this.validFundInd = validFundInd;
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

    public AttributeTypeMaintenance100PutRequest withValidProgInd(String validProgInd) {
        this.validProgInd = validProgInd;
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

    public AttributeTypeMaintenance100PutRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(AttributeTypeMaintenance100PutRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("criteriaValidActvInd");
        sb.append('=');
        sb.append(((this.criteriaValidActvInd == null)?"<null>":this.criteriaValidActvInd));
        sb.append(',');
        sb.append("criteriaActivityDate");
        sb.append('=');
        sb.append(((this.criteriaActivityDate == null)?"<null>":this.criteriaActivityDate));
        sb.append(',');
        sb.append("validLocnInd");
        sb.append('=');
        sb.append(((this.validLocnInd == null)?"<null>":this.validLocnInd));
        sb.append(',');
        sb.append("criteriaValidAcctInd");
        sb.append('=');
        sb.append(((this.criteriaValidAcctInd == null)?"<null>":this.criteriaValidAcctInd));
        sb.append(',');
        sb.append("criteriaStatusInd");
        sb.append('=');
        sb.append(((this.criteriaStatusInd == null)?"<null>":this.criteriaStatusInd));
        sb.append(',');
        sb.append("criteriaValidOrgnInd");
        sb.append('=');
        sb.append(((this.criteriaValidOrgnInd == null)?"<null>":this.criteriaValidOrgnInd));
        sb.append(',');
        sb.append("validAcctInd");
        sb.append('=');
        sb.append(((this.validAcctInd == null)?"<null>":this.validAcctInd));
        sb.append(',');
        sb.append("criteriaValidFundInd");
        sb.append('=');
        sb.append(((this.criteriaValidFundInd == null)?"<null>":this.criteriaValidFundInd));
        sb.append(',');
        sb.append("validAllInd");
        sb.append('=');
        sb.append(((this.validAllInd == null)?"<null>":this.validAllInd));
        sb.append(',');
        sb.append("criteriaDesc");
        sb.append('=');
        sb.append(((this.criteriaDesc == null)?"<null>":this.criteriaDesc));
        sb.append(',');
        sb.append("criteriaValidProgInd");
        sb.append('=');
        sb.append(((this.criteriaValidProgInd == null)?"<null>":this.criteriaValidProgInd));
        sb.append(',');
        sb.append("criteriaValidAllInd");
        sb.append('=');
        sb.append(((this.criteriaValidAllInd == null)?"<null>":this.criteriaValidAllInd));
        sb.append(',');
        sb.append("criteriaCode");
        sb.append('=');
        sb.append(((this.criteriaCode == null)?"<null>":this.criteriaCode));
        sb.append(',');
        sb.append("criteriaValidLocnInd");
        sb.append('=');
        sb.append(((this.criteriaValidLocnInd == null)?"<null>":this.criteriaValidLocnInd));
        sb.append(',');
        sb.append("validActvInd");
        sb.append('=');
        sb.append(((this.validActvInd == null)?"<null>":this.validActvInd));
        sb.append(',');
        sb.append("statusInd");
        sb.append('=');
        sb.append(((this.statusInd == null)?"<null>":this.statusInd));
        sb.append(',');
        sb.append("validOrgnInd");
        sb.append('=');
        sb.append(((this.validOrgnInd == null)?"<null>":this.validOrgnInd));
        sb.append(',');
        sb.append("criteriaCoasCode");
        sb.append('=');
        sb.append(((this.criteriaCoasCode == null)?"<null>":this.criteriaCoasCode));
        sb.append(',');
        sb.append("validFundInd");
        sb.append('=');
        sb.append(((this.validFundInd == null)?"<null>":this.validFundInd));
        sb.append(',');
        sb.append("validProgInd");
        sb.append('=');
        sb.append(((this.validProgInd == null)?"<null>":this.validProgInd));
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
        result = ((result* 31)+((this.criteriaCode == null)? 0 :this.criteriaCode.hashCode()));
        result = ((result* 31)+((this.validLocnInd == null)? 0 :this.validLocnInd.hashCode()));
        result = ((result* 31)+((this.criteriaValidActvInd == null)? 0 :this.criteriaValidActvInd.hashCode()));
        result = ((result* 31)+((this.criteriaValidAcctInd == null)? 0 :this.criteriaValidAcctInd.hashCode()));
        result = ((result* 31)+((this.criteriaCoasCode == null)? 0 :this.criteriaCoasCode.hashCode()));
        result = ((result* 31)+((this.criteriaValidProgInd == null)? 0 :this.criteriaValidProgInd.hashCode()));
        result = ((result* 31)+((this.validAcctInd == null)? 0 :this.validAcctInd.hashCode()));
        result = ((result* 31)+((this.validAllInd == null)? 0 :this.validAllInd.hashCode()));
        result = ((result* 31)+((this.criteriaValidFundInd == null)? 0 :this.criteriaValidFundInd.hashCode()));
        result = ((result* 31)+((this.criteriaValidLocnInd == null)? 0 :this.criteriaValidLocnInd.hashCode()));
        result = ((result* 31)+((this.criteriaStatusInd == null)? 0 :this.criteriaStatusInd.hashCode()));
        result = ((result* 31)+((this.validActvInd == null)? 0 :this.validActvInd.hashCode()));
        result = ((result* 31)+((this.criteriaValidOrgnInd == null)? 0 :this.criteriaValidOrgnInd.hashCode()));
        result = ((result* 31)+((this.statusInd == null)? 0 :this.statusInd.hashCode()));
        result = ((result* 31)+((this.validOrgnInd == null)? 0 :this.validOrgnInd.hashCode()));
        result = ((result* 31)+((this.criteriaValidAllInd == null)? 0 :this.criteriaValidAllInd.hashCode()));
        result = ((result* 31)+((this.validFundInd == null)? 0 :this.validFundInd.hashCode()));
        result = ((result* 31)+((this.validProgInd == null)? 0 :this.validProgInd.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.criteriaDesc == null)? 0 :this.criteriaDesc.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof AttributeTypeMaintenance100PutRequest) == false) {
            return false;
        }
        AttributeTypeMaintenance100PutRequest rhs = ((AttributeTypeMaintenance100PutRequest) other);
        return ((((((((((((((((((((((this.criteriaActivityDate == rhs.criteriaActivityDate)||((this.criteriaActivityDate!= null)&&this.criteriaActivityDate.equals(rhs.criteriaActivityDate)))&&((this.criteriaCode == rhs.criteriaCode)||((this.criteriaCode!= null)&&this.criteriaCode.equals(rhs.criteriaCode))))&&((this.validLocnInd == rhs.validLocnInd)||((this.validLocnInd!= null)&&this.validLocnInd.equals(rhs.validLocnInd))))&&((this.criteriaValidActvInd == rhs.criteriaValidActvInd)||((this.criteriaValidActvInd!= null)&&this.criteriaValidActvInd.equals(rhs.criteriaValidActvInd))))&&((this.criteriaValidAcctInd == rhs.criteriaValidAcctInd)||((this.criteriaValidAcctInd!= null)&&this.criteriaValidAcctInd.equals(rhs.criteriaValidAcctInd))))&&((this.criteriaCoasCode == rhs.criteriaCoasCode)||((this.criteriaCoasCode!= null)&&this.criteriaCoasCode.equals(rhs.criteriaCoasCode))))&&((this.criteriaValidProgInd == rhs.criteriaValidProgInd)||((this.criteriaValidProgInd!= null)&&this.criteriaValidProgInd.equals(rhs.criteriaValidProgInd))))&&((this.validAcctInd == rhs.validAcctInd)||((this.validAcctInd!= null)&&this.validAcctInd.equals(rhs.validAcctInd))))&&((this.validAllInd == rhs.validAllInd)||((this.validAllInd!= null)&&this.validAllInd.equals(rhs.validAllInd))))&&((this.criteriaValidFundInd == rhs.criteriaValidFundInd)||((this.criteriaValidFundInd!= null)&&this.criteriaValidFundInd.equals(rhs.criteriaValidFundInd))))&&((this.criteriaValidLocnInd == rhs.criteriaValidLocnInd)||((this.criteriaValidLocnInd!= null)&&this.criteriaValidLocnInd.equals(rhs.criteriaValidLocnInd))))&&((this.criteriaStatusInd == rhs.criteriaStatusInd)||((this.criteriaStatusInd!= null)&&this.criteriaStatusInd.equals(rhs.criteriaStatusInd))))&&((this.validActvInd == rhs.validActvInd)||((this.validActvInd!= null)&&this.validActvInd.equals(rhs.validActvInd))))&&((this.criteriaValidOrgnInd == rhs.criteriaValidOrgnInd)||((this.criteriaValidOrgnInd!= null)&&this.criteriaValidOrgnInd.equals(rhs.criteriaValidOrgnInd))))&&((this.statusInd == rhs.statusInd)||((this.statusInd!= null)&&this.statusInd.equals(rhs.statusInd))))&&((this.validOrgnInd == rhs.validOrgnInd)||((this.validOrgnInd!= null)&&this.validOrgnInd.equals(rhs.validOrgnInd))))&&((this.criteriaValidAllInd == rhs.criteriaValidAllInd)||((this.criteriaValidAllInd!= null)&&this.criteriaValidAllInd.equals(rhs.criteriaValidAllInd))))&&((this.validFundInd == rhs.validFundInd)||((this.validFundInd!= null)&&this.validFundInd.equals(rhs.validFundInd))))&&((this.validProgInd == rhs.validProgInd)||((this.validProgInd!= null)&&this.validProgInd.equals(rhs.validProgInd))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.criteriaDesc == rhs.criteriaDesc)||((this.criteriaDesc!= null)&&this.criteriaDesc.equals(rhs.criteriaDesc))));
    }

}
