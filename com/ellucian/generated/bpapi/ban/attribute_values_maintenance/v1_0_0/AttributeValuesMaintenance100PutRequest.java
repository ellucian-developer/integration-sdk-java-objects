
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
    "criteria.activityDate",
    "code",
    "validLocnInd",
    "criteria.validAcctInd",
    "endDate",
    "criteria.endDate",
    "coasCode",
    "criteria.validOrgnInd",
    "criteria.validFundInd",
    "criteria.desc",
    "criteria.beginDate",
    "criteria.validAllInd",
    "criteria.gasbDeferInd",
    "criteria.code",
    "criteria.validLocnInd",
    "atttCode",
    "validOrgnInd",
    "validFundInd",
    "validProgInd",
    "gasbDeferInd",
    "criteria.validActvInd",
    "validAcctInd",
    "validAllInd",
    "criteria.validProgInd",
    "beginDate",
    "validActvInd",
    "desc"
})
@Generated("jsonschema2pojo")
public class AttributeValuesMaintenance100PutRequest {

    /**
     * Activity Date
     * <p>
     * Lineage reference object : FTRATTV_ACTIVITY_DATE
     * 
     */
    @JsonProperty("criteria.activityDate")
    @JsonPropertyDescription("Lineage reference object : FTRATTV_ACTIVITY_DATE")
    private Date criteriaActivityDate;
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
     * Lineage reference object : FTRATTV_VALID_ACCT_IND
     * 
     */
    @JsonProperty("criteria.validAcctInd")
    @JsonPropertyDescription("Lineage reference object : FTRATTV_VALID_ACCT_IND")
    private String criteriaValidAcctInd;
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
     * End Date
     * <p>
     * Lineage reference object : FTRATTV_END_DATE
     * 
     */
    @JsonProperty("criteria.endDate")
    @JsonPropertyDescription("Lineage reference object : FTRATTV_END_DATE")
    private Date criteriaEndDate;
    /**
     * Chart of Accounts
     * <p>
     * Lineage reference object : coasCode, Lookup lineage reference object : ftvcoas
     * 
     */
    @JsonProperty("coasCode")
    @JsonPropertyDescription("Lineage reference object : coasCode, Lookup lineage reference object : ftvcoas")
    private Object coasCode;
    /**
     * Lineage reference object : FTRATTV_VALID_ORGN_IND
     * 
     */
    @JsonProperty("criteria.validOrgnInd")
    @JsonPropertyDescription("Lineage reference object : FTRATTV_VALID_ORGN_IND")
    private String criteriaValidOrgnInd;
    /**
     * Lineage reference object : FTRATTV_VALID_FUND_IND
     * 
     */
    @JsonProperty("criteria.validFundInd")
    @JsonPropertyDescription("Lineage reference object : FTRATTV_VALID_FUND_IND")
    private String criteriaValidFundInd;
    /**
     * Description
     * <p>
     * Lineage reference object : FTRATTV_DESC
     * (Required)
     * 
     */
    @JsonProperty("criteria.desc")
    @JsonPropertyDescription("Lineage reference object : FTRATTV_DESC")
    private String criteriaDesc;
    /**
     * Begin Date
     * <p>
     * Lineage reference object : FTRATTV_BEGIN_DATE
     * (Required)
     * 
     */
    @JsonProperty("criteria.beginDate")
    @JsonPropertyDescription("Lineage reference object : FTRATTV_BEGIN_DATE")
    private Date criteriaBeginDate;
    /**
     * Lineage reference object : FTRATTV_VALID_ALL_IND
     * 
     */
    @JsonProperty("criteria.validAllInd")
    @JsonPropertyDescription("Lineage reference object : FTRATTV_VALID_ALL_IND")
    private String criteriaValidAllInd;
    /**
     * Lineage reference object : FTRATTV_GASB_DEFER_IND
     * 
     */
    @JsonProperty("criteria.gasbDeferInd")
    @JsonPropertyDescription("Lineage reference object : FTRATTV_GASB_DEFER_IND")
    private String criteriaGasbDeferInd;
    /**
     * Attribute Value
     * <p>
     * Lineage reference object : FTRATTV_CODE
     * (Required)
     * 
     */
    @JsonProperty("criteria.code")
    @JsonPropertyDescription("Lineage reference object : FTRATTV_CODE")
    private String criteriaCode;
    /**
     * Lineage reference object : FTRATTV_VALID_LOCN_IND
     * 
     */
    @JsonProperty("criteria.validLocnInd")
    @JsonPropertyDescription("Lineage reference object : FTRATTV_VALID_LOCN_IND")
    private String criteriaValidLocnInd;
    /**
     * Attribute Type
     * <p>
     * Lineage reference object : atttCode, Lookup lineage reference object : ftvattt
     * 
     */
    @JsonProperty("atttCode")
    @JsonPropertyDescription("Lineage reference object : atttCode, Lookup lineage reference object : ftvattt")
    private Object atttCode;
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
     * Lineage reference object : FTRATTV_GASB_DEFER_IND
     * 
     */
    @JsonProperty("gasbDeferInd")
    @JsonPropertyDescription("Lineage reference object : FTRATTV_GASB_DEFER_IND")
    private String gasbDeferInd;
    /**
     * Lineage reference object : FTRATTV_VALID_ACTV_IND
     * 
     */
    @JsonProperty("criteria.validActvInd")
    @JsonPropertyDescription("Lineage reference object : FTRATTV_VALID_ACTV_IND")
    private String criteriaValidActvInd;
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
     * Lineage reference object : FTRATTV_VALID_PROG_IND
     * 
     */
    @JsonProperty("criteria.validProgInd")
    @JsonPropertyDescription("Lineage reference object : FTRATTV_VALID_PROG_IND")
    private String criteriaValidProgInd;
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
     * Lineage reference object : FTRATTV_VALID_ACTV_IND
     * 
     */
    @JsonProperty("validActvInd")
    @JsonPropertyDescription("Lineage reference object : FTRATTV_VALID_ACTV_IND")
    private String validActvInd;
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
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Activity Date
     * <p>
     * Lineage reference object : FTRATTV_ACTIVITY_DATE
     * 
     */
    @JsonProperty("criteria.activityDate")
    public Date getCriteriaActivityDate() {
        return criteriaActivityDate;
    }

    /**
     * Activity Date
     * <p>
     * Lineage reference object : FTRATTV_ACTIVITY_DATE
     * 
     */
    @JsonProperty("criteria.activityDate")
    public void setCriteriaActivityDate(Date criteriaActivityDate) {
        this.criteriaActivityDate = criteriaActivityDate;
    }

    public AttributeValuesMaintenance100PutRequest withCriteriaActivityDate(Date criteriaActivityDate) {
        this.criteriaActivityDate = criteriaActivityDate;
        return this;
    }

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

    public AttributeValuesMaintenance100PutRequest withCode(String code) {
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

    public AttributeValuesMaintenance100PutRequest withValidLocnInd(String validLocnInd) {
        this.validLocnInd = validLocnInd;
        return this;
    }

    /**
     * Lineage reference object : FTRATTV_VALID_ACCT_IND
     * 
     */
    @JsonProperty("criteria.validAcctInd")
    public String getCriteriaValidAcctInd() {
        return criteriaValidAcctInd;
    }

    /**
     * Lineage reference object : FTRATTV_VALID_ACCT_IND
     * 
     */
    @JsonProperty("criteria.validAcctInd")
    public void setCriteriaValidAcctInd(String criteriaValidAcctInd) {
        this.criteriaValidAcctInd = criteriaValidAcctInd;
    }

    public AttributeValuesMaintenance100PutRequest withCriteriaValidAcctInd(String criteriaValidAcctInd) {
        this.criteriaValidAcctInd = criteriaValidAcctInd;
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

    public AttributeValuesMaintenance100PutRequest withEndDate(Date endDate) {
        this.endDate = endDate;
        return this;
    }

    /**
     * End Date
     * <p>
     * Lineage reference object : FTRATTV_END_DATE
     * 
     */
    @JsonProperty("criteria.endDate")
    public Date getCriteriaEndDate() {
        return criteriaEndDate;
    }

    /**
     * End Date
     * <p>
     * Lineage reference object : FTRATTV_END_DATE
     * 
     */
    @JsonProperty("criteria.endDate")
    public void setCriteriaEndDate(Date criteriaEndDate) {
        this.criteriaEndDate = criteriaEndDate;
    }

    public AttributeValuesMaintenance100PutRequest withCriteriaEndDate(Date criteriaEndDate) {
        this.criteriaEndDate = criteriaEndDate;
        return this;
    }

    /**
     * Chart of Accounts
     * <p>
     * Lineage reference object : coasCode, Lookup lineage reference object : ftvcoas
     * 
     */
    @JsonProperty("coasCode")
    public Object getCoasCode() {
        return coasCode;
    }

    /**
     * Chart of Accounts
     * <p>
     * Lineage reference object : coasCode, Lookup lineage reference object : ftvcoas
     * 
     */
    @JsonProperty("coasCode")
    public void setCoasCode(Object coasCode) {
        this.coasCode = coasCode;
    }

    public AttributeValuesMaintenance100PutRequest withCoasCode(Object coasCode) {
        this.coasCode = coasCode;
        return this;
    }

    /**
     * Lineage reference object : FTRATTV_VALID_ORGN_IND
     * 
     */
    @JsonProperty("criteria.validOrgnInd")
    public String getCriteriaValidOrgnInd() {
        return criteriaValidOrgnInd;
    }

    /**
     * Lineage reference object : FTRATTV_VALID_ORGN_IND
     * 
     */
    @JsonProperty("criteria.validOrgnInd")
    public void setCriteriaValidOrgnInd(String criteriaValidOrgnInd) {
        this.criteriaValidOrgnInd = criteriaValidOrgnInd;
    }

    public AttributeValuesMaintenance100PutRequest withCriteriaValidOrgnInd(String criteriaValidOrgnInd) {
        this.criteriaValidOrgnInd = criteriaValidOrgnInd;
        return this;
    }

    /**
     * Lineage reference object : FTRATTV_VALID_FUND_IND
     * 
     */
    @JsonProperty("criteria.validFundInd")
    public String getCriteriaValidFundInd() {
        return criteriaValidFundInd;
    }

    /**
     * Lineage reference object : FTRATTV_VALID_FUND_IND
     * 
     */
    @JsonProperty("criteria.validFundInd")
    public void setCriteriaValidFundInd(String criteriaValidFundInd) {
        this.criteriaValidFundInd = criteriaValidFundInd;
    }

    public AttributeValuesMaintenance100PutRequest withCriteriaValidFundInd(String criteriaValidFundInd) {
        this.criteriaValidFundInd = criteriaValidFundInd;
        return this;
    }

    /**
     * Description
     * <p>
     * Lineage reference object : FTRATTV_DESC
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
     * Lineage reference object : FTRATTV_DESC
     * (Required)
     * 
     */
    @JsonProperty("criteria.desc")
    public void setCriteriaDesc(String criteriaDesc) {
        this.criteriaDesc = criteriaDesc;
    }

    public AttributeValuesMaintenance100PutRequest withCriteriaDesc(String criteriaDesc) {
        this.criteriaDesc = criteriaDesc;
        return this;
    }

    /**
     * Begin Date
     * <p>
     * Lineage reference object : FTRATTV_BEGIN_DATE
     * (Required)
     * 
     */
    @JsonProperty("criteria.beginDate")
    public Date getCriteriaBeginDate() {
        return criteriaBeginDate;
    }

    /**
     * Begin Date
     * <p>
     * Lineage reference object : FTRATTV_BEGIN_DATE
     * (Required)
     * 
     */
    @JsonProperty("criteria.beginDate")
    public void setCriteriaBeginDate(Date criteriaBeginDate) {
        this.criteriaBeginDate = criteriaBeginDate;
    }

    public AttributeValuesMaintenance100PutRequest withCriteriaBeginDate(Date criteriaBeginDate) {
        this.criteriaBeginDate = criteriaBeginDate;
        return this;
    }

    /**
     * Lineage reference object : FTRATTV_VALID_ALL_IND
     * 
     */
    @JsonProperty("criteria.validAllInd")
    public String getCriteriaValidAllInd() {
        return criteriaValidAllInd;
    }

    /**
     * Lineage reference object : FTRATTV_VALID_ALL_IND
     * 
     */
    @JsonProperty("criteria.validAllInd")
    public void setCriteriaValidAllInd(String criteriaValidAllInd) {
        this.criteriaValidAllInd = criteriaValidAllInd;
    }

    public AttributeValuesMaintenance100PutRequest withCriteriaValidAllInd(String criteriaValidAllInd) {
        this.criteriaValidAllInd = criteriaValidAllInd;
        return this;
    }

    /**
     * Lineage reference object : FTRATTV_GASB_DEFER_IND
     * 
     */
    @JsonProperty("criteria.gasbDeferInd")
    public String getCriteriaGasbDeferInd() {
        return criteriaGasbDeferInd;
    }

    /**
     * Lineage reference object : FTRATTV_GASB_DEFER_IND
     * 
     */
    @JsonProperty("criteria.gasbDeferInd")
    public void setCriteriaGasbDeferInd(String criteriaGasbDeferInd) {
        this.criteriaGasbDeferInd = criteriaGasbDeferInd;
    }

    public AttributeValuesMaintenance100PutRequest withCriteriaGasbDeferInd(String criteriaGasbDeferInd) {
        this.criteriaGasbDeferInd = criteriaGasbDeferInd;
        return this;
    }

    /**
     * Attribute Value
     * <p>
     * Lineage reference object : FTRATTV_CODE
     * (Required)
     * 
     */
    @JsonProperty("criteria.code")
    public String getCriteriaCode() {
        return criteriaCode;
    }

    /**
     * Attribute Value
     * <p>
     * Lineage reference object : FTRATTV_CODE
     * (Required)
     * 
     */
    @JsonProperty("criteria.code")
    public void setCriteriaCode(String criteriaCode) {
        this.criteriaCode = criteriaCode;
    }

    public AttributeValuesMaintenance100PutRequest withCriteriaCode(String criteriaCode) {
        this.criteriaCode = criteriaCode;
        return this;
    }

    /**
     * Lineage reference object : FTRATTV_VALID_LOCN_IND
     * 
     */
    @JsonProperty("criteria.validLocnInd")
    public String getCriteriaValidLocnInd() {
        return criteriaValidLocnInd;
    }

    /**
     * Lineage reference object : FTRATTV_VALID_LOCN_IND
     * 
     */
    @JsonProperty("criteria.validLocnInd")
    public void setCriteriaValidLocnInd(String criteriaValidLocnInd) {
        this.criteriaValidLocnInd = criteriaValidLocnInd;
    }

    public AttributeValuesMaintenance100PutRequest withCriteriaValidLocnInd(String criteriaValidLocnInd) {
        this.criteriaValidLocnInd = criteriaValidLocnInd;
        return this;
    }

    /**
     * Attribute Type
     * <p>
     * Lineage reference object : atttCode, Lookup lineage reference object : ftvattt
     * 
     */
    @JsonProperty("atttCode")
    public Object getAtttCode() {
        return atttCode;
    }

    /**
     * Attribute Type
     * <p>
     * Lineage reference object : atttCode, Lookup lineage reference object : ftvattt
     * 
     */
    @JsonProperty("atttCode")
    public void setAtttCode(Object atttCode) {
        this.atttCode = atttCode;
    }

    public AttributeValuesMaintenance100PutRequest withAtttCode(Object atttCode) {
        this.atttCode = atttCode;
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

    public AttributeValuesMaintenance100PutRequest withValidOrgnInd(String validOrgnInd) {
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

    public AttributeValuesMaintenance100PutRequest withValidFundInd(String validFundInd) {
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

    public AttributeValuesMaintenance100PutRequest withValidProgInd(String validProgInd) {
        this.validProgInd = validProgInd;
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

    public AttributeValuesMaintenance100PutRequest withGasbDeferInd(String gasbDeferInd) {
        this.gasbDeferInd = gasbDeferInd;
        return this;
    }

    /**
     * Lineage reference object : FTRATTV_VALID_ACTV_IND
     * 
     */
    @JsonProperty("criteria.validActvInd")
    public String getCriteriaValidActvInd() {
        return criteriaValidActvInd;
    }

    /**
     * Lineage reference object : FTRATTV_VALID_ACTV_IND
     * 
     */
    @JsonProperty("criteria.validActvInd")
    public void setCriteriaValidActvInd(String criteriaValidActvInd) {
        this.criteriaValidActvInd = criteriaValidActvInd;
    }

    public AttributeValuesMaintenance100PutRequest withCriteriaValidActvInd(String criteriaValidActvInd) {
        this.criteriaValidActvInd = criteriaValidActvInd;
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

    public AttributeValuesMaintenance100PutRequest withValidAcctInd(String validAcctInd) {
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

    public AttributeValuesMaintenance100PutRequest withValidAllInd(String validAllInd) {
        this.validAllInd = validAllInd;
        return this;
    }

    /**
     * Lineage reference object : FTRATTV_VALID_PROG_IND
     * 
     */
    @JsonProperty("criteria.validProgInd")
    public String getCriteriaValidProgInd() {
        return criteriaValidProgInd;
    }

    /**
     * Lineage reference object : FTRATTV_VALID_PROG_IND
     * 
     */
    @JsonProperty("criteria.validProgInd")
    public void setCriteriaValidProgInd(String criteriaValidProgInd) {
        this.criteriaValidProgInd = criteriaValidProgInd;
    }

    public AttributeValuesMaintenance100PutRequest withCriteriaValidProgInd(String criteriaValidProgInd) {
        this.criteriaValidProgInd = criteriaValidProgInd;
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

    public AttributeValuesMaintenance100PutRequest withBeginDate(Date beginDate) {
        this.beginDate = beginDate;
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

    public AttributeValuesMaintenance100PutRequest withValidActvInd(String validActvInd) {
        this.validActvInd = validActvInd;
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

    public AttributeValuesMaintenance100PutRequest withDesc(String desc) {
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

    public AttributeValuesMaintenance100PutRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(AttributeValuesMaintenance100PutRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("criteriaActivityDate");
        sb.append('=');
        sb.append(((this.criteriaActivityDate == null)?"<null>":this.criteriaActivityDate));
        sb.append(',');
        sb.append("code");
        sb.append('=');
        sb.append(((this.code == null)?"<null>":this.code));
        sb.append(',');
        sb.append("validLocnInd");
        sb.append('=');
        sb.append(((this.validLocnInd == null)?"<null>":this.validLocnInd));
        sb.append(',');
        sb.append("criteriaValidAcctInd");
        sb.append('=');
        sb.append(((this.criteriaValidAcctInd == null)?"<null>":this.criteriaValidAcctInd));
        sb.append(',');
        sb.append("endDate");
        sb.append('=');
        sb.append(((this.endDate == null)?"<null>":this.endDate));
        sb.append(',');
        sb.append("criteriaEndDate");
        sb.append('=');
        sb.append(((this.criteriaEndDate == null)?"<null>":this.criteriaEndDate));
        sb.append(',');
        sb.append("coasCode");
        sb.append('=');
        sb.append(((this.coasCode == null)?"<null>":this.coasCode));
        sb.append(',');
        sb.append("criteriaValidOrgnInd");
        sb.append('=');
        sb.append(((this.criteriaValidOrgnInd == null)?"<null>":this.criteriaValidOrgnInd));
        sb.append(',');
        sb.append("criteriaValidFundInd");
        sb.append('=');
        sb.append(((this.criteriaValidFundInd == null)?"<null>":this.criteriaValidFundInd));
        sb.append(',');
        sb.append("criteriaDesc");
        sb.append('=');
        sb.append(((this.criteriaDesc == null)?"<null>":this.criteriaDesc));
        sb.append(',');
        sb.append("criteriaBeginDate");
        sb.append('=');
        sb.append(((this.criteriaBeginDate == null)?"<null>":this.criteriaBeginDate));
        sb.append(',');
        sb.append("criteriaValidAllInd");
        sb.append('=');
        sb.append(((this.criteriaValidAllInd == null)?"<null>":this.criteriaValidAllInd));
        sb.append(',');
        sb.append("criteriaGasbDeferInd");
        sb.append('=');
        sb.append(((this.criteriaGasbDeferInd == null)?"<null>":this.criteriaGasbDeferInd));
        sb.append(',');
        sb.append("criteriaCode");
        sb.append('=');
        sb.append(((this.criteriaCode == null)?"<null>":this.criteriaCode));
        sb.append(',');
        sb.append("criteriaValidLocnInd");
        sb.append('=');
        sb.append(((this.criteriaValidLocnInd == null)?"<null>":this.criteriaValidLocnInd));
        sb.append(',');
        sb.append("atttCode");
        sb.append('=');
        sb.append(((this.atttCode == null)?"<null>":this.atttCode));
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
        sb.append("gasbDeferInd");
        sb.append('=');
        sb.append(((this.gasbDeferInd == null)?"<null>":this.gasbDeferInd));
        sb.append(',');
        sb.append("criteriaValidActvInd");
        sb.append('=');
        sb.append(((this.criteriaValidActvInd == null)?"<null>":this.criteriaValidActvInd));
        sb.append(',');
        sb.append("validAcctInd");
        sb.append('=');
        sb.append(((this.validAcctInd == null)?"<null>":this.validAcctInd));
        sb.append(',');
        sb.append("validAllInd");
        sb.append('=');
        sb.append(((this.validAllInd == null)?"<null>":this.validAllInd));
        sb.append(',');
        sb.append("criteriaValidProgInd");
        sb.append('=');
        sb.append(((this.criteriaValidProgInd == null)?"<null>":this.criteriaValidProgInd));
        sb.append(',');
        sb.append("beginDate");
        sb.append('=');
        sb.append(((this.beginDate == null)?"<null>":this.beginDate));
        sb.append(',');
        sb.append("validActvInd");
        sb.append('=');
        sb.append(((this.validActvInd == null)?"<null>":this.validActvInd));
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
        result = ((result* 31)+((this.criteriaCode == null)? 0 :this.criteriaCode.hashCode()));
        result = ((result* 31)+((this.code == null)? 0 :this.code.hashCode()));
        result = ((result* 31)+((this.validLocnInd == null)? 0 :this.validLocnInd.hashCode()));
        result = ((result* 31)+((this.endDate == null)? 0 :this.endDate.hashCode()));
        result = ((result* 31)+((this.criteriaValidActvInd == null)? 0 :this.criteriaValidActvInd.hashCode()));
        result = ((result* 31)+((this.coasCode == null)? 0 :this.coasCode.hashCode()));
        result = ((result* 31)+((this.criteriaValidProgInd == null)? 0 :this.criteriaValidProgInd.hashCode()));
        result = ((result* 31)+((this.criteriaValidLocnInd == null)? 0 :this.criteriaValidLocnInd.hashCode()));
        result = ((result* 31)+((this.criteriaBeginDate == null)? 0 :this.criteriaBeginDate.hashCode()));
        result = ((result* 31)+((this.atttCode == null)? 0 :this.atttCode.hashCode()));
        result = ((result* 31)+((this.validOrgnInd == null)? 0 :this.validOrgnInd.hashCode()));
        result = ((result* 31)+((this.criteriaValidAllInd == null)? 0 :this.criteriaValidAllInd.hashCode()));
        result = ((result* 31)+((this.validFundInd == null)? 0 :this.validFundInd.hashCode()));
        result = ((result* 31)+((this.validProgInd == null)? 0 :this.validProgInd.hashCode()));
        result = ((result* 31)+((this.criteriaEndDate == null)? 0 :this.criteriaEndDate.hashCode()));
        result = ((result* 31)+((this.gasbDeferInd == null)? 0 :this.gasbDeferInd.hashCode()));
        result = ((result* 31)+((this.criteriaActivityDate == null)? 0 :this.criteriaActivityDate.hashCode()));
        result = ((result* 31)+((this.criteriaGasbDeferInd == null)? 0 :this.criteriaGasbDeferInd.hashCode()));
        result = ((result* 31)+((this.criteriaValidAcctInd == null)? 0 :this.criteriaValidAcctInd.hashCode()));
        result = ((result* 31)+((this.validAcctInd == null)? 0 :this.validAcctInd.hashCode()));
        result = ((result* 31)+((this.validAllInd == null)? 0 :this.validAllInd.hashCode()));
        result = ((result* 31)+((this.criteriaValidFundInd == null)? 0 :this.criteriaValidFundInd.hashCode()));
        result = ((result* 31)+((this.beginDate == null)? 0 :this.beginDate.hashCode()));
        result = ((result* 31)+((this.validActvInd == null)? 0 :this.validActvInd.hashCode()));
        result = ((result* 31)+((this.criteriaValidOrgnInd == null)? 0 :this.criteriaValidOrgnInd.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.criteriaDesc == null)? 0 :this.criteriaDesc.hashCode()));
        result = ((result* 31)+((this.desc == null)? 0 :this.desc.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof AttributeValuesMaintenance100PutRequest) == false) {
            return false;
        }
        AttributeValuesMaintenance100PutRequest rhs = ((AttributeValuesMaintenance100PutRequest) other);
        return (((((((((((((((((((((((((((((this.criteriaCode == rhs.criteriaCode)||((this.criteriaCode!= null)&&this.criteriaCode.equals(rhs.criteriaCode)))&&((this.code == rhs.code)||((this.code!= null)&&this.code.equals(rhs.code))))&&((this.validLocnInd == rhs.validLocnInd)||((this.validLocnInd!= null)&&this.validLocnInd.equals(rhs.validLocnInd))))&&((this.endDate == rhs.endDate)||((this.endDate!= null)&&this.endDate.equals(rhs.endDate))))&&((this.criteriaValidActvInd == rhs.criteriaValidActvInd)||((this.criteriaValidActvInd!= null)&&this.criteriaValidActvInd.equals(rhs.criteriaValidActvInd))))&&((this.coasCode == rhs.coasCode)||((this.coasCode!= null)&&this.coasCode.equals(rhs.coasCode))))&&((this.criteriaValidProgInd == rhs.criteriaValidProgInd)||((this.criteriaValidProgInd!= null)&&this.criteriaValidProgInd.equals(rhs.criteriaValidProgInd))))&&((this.criteriaValidLocnInd == rhs.criteriaValidLocnInd)||((this.criteriaValidLocnInd!= null)&&this.criteriaValidLocnInd.equals(rhs.criteriaValidLocnInd))))&&((this.criteriaBeginDate == rhs.criteriaBeginDate)||((this.criteriaBeginDate!= null)&&this.criteriaBeginDate.equals(rhs.criteriaBeginDate))))&&((this.atttCode == rhs.atttCode)||((this.atttCode!= null)&&this.atttCode.equals(rhs.atttCode))))&&((this.validOrgnInd == rhs.validOrgnInd)||((this.validOrgnInd!= null)&&this.validOrgnInd.equals(rhs.validOrgnInd))))&&((this.criteriaValidAllInd == rhs.criteriaValidAllInd)||((this.criteriaValidAllInd!= null)&&this.criteriaValidAllInd.equals(rhs.criteriaValidAllInd))))&&((this.validFundInd == rhs.validFundInd)||((this.validFundInd!= null)&&this.validFundInd.equals(rhs.validFundInd))))&&((this.validProgInd == rhs.validProgInd)||((this.validProgInd!= null)&&this.validProgInd.equals(rhs.validProgInd))))&&((this.criteriaEndDate == rhs.criteriaEndDate)||((this.criteriaEndDate!= null)&&this.criteriaEndDate.equals(rhs.criteriaEndDate))))&&((this.gasbDeferInd == rhs.gasbDeferInd)||((this.gasbDeferInd!= null)&&this.gasbDeferInd.equals(rhs.gasbDeferInd))))&&((this.criteriaActivityDate == rhs.criteriaActivityDate)||((this.criteriaActivityDate!= null)&&this.criteriaActivityDate.equals(rhs.criteriaActivityDate))))&&((this.criteriaGasbDeferInd == rhs.criteriaGasbDeferInd)||((this.criteriaGasbDeferInd!= null)&&this.criteriaGasbDeferInd.equals(rhs.criteriaGasbDeferInd))))&&((this.criteriaValidAcctInd == rhs.criteriaValidAcctInd)||((this.criteriaValidAcctInd!= null)&&this.criteriaValidAcctInd.equals(rhs.criteriaValidAcctInd))))&&((this.validAcctInd == rhs.validAcctInd)||((this.validAcctInd!= null)&&this.validAcctInd.equals(rhs.validAcctInd))))&&((this.validAllInd == rhs.validAllInd)||((this.validAllInd!= null)&&this.validAllInd.equals(rhs.validAllInd))))&&((this.criteriaValidFundInd == rhs.criteriaValidFundInd)||((this.criteriaValidFundInd!= null)&&this.criteriaValidFundInd.equals(rhs.criteriaValidFundInd))))&&((this.beginDate == rhs.beginDate)||((this.beginDate!= null)&&this.beginDate.equals(rhs.beginDate))))&&((this.validActvInd == rhs.validActvInd)||((this.validActvInd!= null)&&this.validActvInd.equals(rhs.validActvInd))))&&((this.criteriaValidOrgnInd == rhs.criteriaValidOrgnInd)||((this.criteriaValidOrgnInd!= null)&&this.criteriaValidOrgnInd.equals(rhs.criteriaValidOrgnInd))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.criteriaDesc == rhs.criteriaDesc)||((this.criteriaDesc!= null)&&this.criteriaDesc.equals(rhs.criteriaDesc))))&&((this.desc == rhs.desc)||((this.desc!= null)&&this.desc.equals(rhs.desc))));
    }

}
