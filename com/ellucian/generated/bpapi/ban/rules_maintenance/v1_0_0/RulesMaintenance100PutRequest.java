
package com.ellucian.generated.bpapi.ban.rules_maintenance.v1_0_0;

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
    "criteria.effDate",
    "criteria.activityDate",
    "criteria.classTitle",
    "criteria.statusInd",
    "criteria.classType",
    "criteria.termDate",
    "classTitle",
    "effDate",
    "criteria.ruclCode",
    "statusInd",
    "ruclCode",
    "termDate",
    "classType",
    "criteria.balanceMethod"
})
@Generated("jsonschema2pojo")
public class RulesMaintenance100PutRequest {

    /**
     * Start Date
     * <p>
     * Lineage reference object : FTVRUCL_EFF_DATE
     * (Required)
     * 
     */
    @JsonProperty("criteria.effDate")
    @JsonPropertyDescription("Lineage reference object : FTVRUCL_EFF_DATE")
    private Date criteriaEffDate;
    /**
     * Last Activity
     * <p>
     * Lineage reference object : FTVRUCL_ACTIVITY_DATE
     * 
     */
    @JsonProperty("criteria.activityDate")
    @JsonPropertyDescription("Lineage reference object : FTVRUCL_ACTIVITY_DATE")
    private Date criteriaActivityDate;
    /**
     * Lineage reference object : FTVRUCL_CLASS_TITLE
     * (Required)
     * 
     */
    @JsonProperty("criteria.classTitle")
    @JsonPropertyDescription("Lineage reference object : FTVRUCL_CLASS_TITLE")
    private String criteriaClassTitle;
    /**
     * Active
     * <p>
     * Lineage reference object : FTVRUCL_STATUS_IND
     * 
     */
    @JsonProperty("criteria.statusInd")
    @JsonPropertyDescription("Lineage reference object : FTVRUCL_STATUS_IND")
    private String criteriaStatusInd;
    /**
     * Rule Class Type
     * <p>
     * Lineage reference object : FTVRUCL_CLASS_TYPE
     * (Required)
     * 
     */
    @JsonProperty("criteria.classType")
    @JsonPropertyDescription("Lineage reference object : FTVRUCL_CLASS_TYPE")
    private String criteriaClassType;
    /**
     * Termination Date
     * <p>
     * Lineage reference object : FTVRUCL_TERM_DATE
     * 
     */
    @JsonProperty("criteria.termDate")
    @JsonPropertyDescription("Lineage reference object : FTVRUCL_TERM_DATE")
    private Date criteriaTermDate;
    /**
     * Lineage reference object : FTVRUCL_CLASS_TITLE
     * (Required)
     * 
     */
    @JsonProperty("classTitle")
    @JsonPropertyDescription("Lineage reference object : FTVRUCL_CLASS_TITLE")
    private String classTitle;
    /**
     * Start Date
     * <p>
     * Lineage reference object : FTVRUCL_EFF_DATE
     * (Required)
     * 
     */
    @JsonProperty("effDate")
    @JsonPropertyDescription("Lineage reference object : FTVRUCL_EFF_DATE")
    private Date effDate;
    /**
     * Rule Class
     * <p>
     * Lineage reference object : FTVRUCL_RUCL_CODE, Lookup lineage reference object : ftvrucl
     * (Required)
     * 
     */
    @JsonProperty("criteria.ruclCode")
    @JsonPropertyDescription("Lineage reference object : FTVRUCL_RUCL_CODE, Lookup lineage reference object : ftvrucl")
    private String criteriaRuclCode;
    /**
     * Active
     * <p>
     * Lineage reference object : FTVRUCL_STATUS_IND
     * 
     */
    @JsonProperty("statusInd")
    @JsonPropertyDescription("Lineage reference object : FTVRUCL_STATUS_IND")
    private String statusInd;
    /**
     * Rule Class
     * <p>
     * Lineage reference object : FTVRUCL_RUCL_CODE, Lookup lineage reference object : ftvrucl
     * (Required)
     * 
     */
    @JsonProperty("ruclCode")
    @JsonPropertyDescription("Lineage reference object : FTVRUCL_RUCL_CODE, Lookup lineage reference object : ftvrucl")
    private String ruclCode;
    /**
     * Termination Date
     * <p>
     * Lineage reference object : FTVRUCL_TERM_DATE
     * 
     */
    @JsonProperty("termDate")
    @JsonPropertyDescription("Lineage reference object : FTVRUCL_TERM_DATE")
    private Date termDate;
    /**
     * Rule Class Type
     * <p>
     * Lineage reference object : FTVRUCL_CLASS_TYPE
     * (Required)
     * 
     */
    @JsonProperty("classType")
    @JsonPropertyDescription("Lineage reference object : FTVRUCL_CLASS_TYPE")
    private String classType;
    /**
     * Balancing Method
     * <p>
     * Lineage reference object : FTVRUCL_BALANCE_METHOD
     * (Required)
     * 
     */
    @JsonProperty("criteria.balanceMethod")
    @JsonPropertyDescription("Lineage reference object : FTVRUCL_BALANCE_METHOD")
    private String criteriaBalanceMethod;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Start Date
     * <p>
     * Lineage reference object : FTVRUCL_EFF_DATE
     * (Required)
     * 
     */
    @JsonProperty("criteria.effDate")
    public Date getCriteriaEffDate() {
        return criteriaEffDate;
    }

    /**
     * Start Date
     * <p>
     * Lineage reference object : FTVRUCL_EFF_DATE
     * (Required)
     * 
     */
    @JsonProperty("criteria.effDate")
    public void setCriteriaEffDate(Date criteriaEffDate) {
        this.criteriaEffDate = criteriaEffDate;
    }

    public RulesMaintenance100PutRequest withCriteriaEffDate(Date criteriaEffDate) {
        this.criteriaEffDate = criteriaEffDate;
        return this;
    }

    /**
     * Last Activity
     * <p>
     * Lineage reference object : FTVRUCL_ACTIVITY_DATE
     * 
     */
    @JsonProperty("criteria.activityDate")
    public Date getCriteriaActivityDate() {
        return criteriaActivityDate;
    }

    /**
     * Last Activity
     * <p>
     * Lineage reference object : FTVRUCL_ACTIVITY_DATE
     * 
     */
    @JsonProperty("criteria.activityDate")
    public void setCriteriaActivityDate(Date criteriaActivityDate) {
        this.criteriaActivityDate = criteriaActivityDate;
    }

    public RulesMaintenance100PutRequest withCriteriaActivityDate(Date criteriaActivityDate) {
        this.criteriaActivityDate = criteriaActivityDate;
        return this;
    }

    /**
     * Lineage reference object : FTVRUCL_CLASS_TITLE
     * (Required)
     * 
     */
    @JsonProperty("criteria.classTitle")
    public String getCriteriaClassTitle() {
        return criteriaClassTitle;
    }

    /**
     * Lineage reference object : FTVRUCL_CLASS_TITLE
     * (Required)
     * 
     */
    @JsonProperty("criteria.classTitle")
    public void setCriteriaClassTitle(String criteriaClassTitle) {
        this.criteriaClassTitle = criteriaClassTitle;
    }

    public RulesMaintenance100PutRequest withCriteriaClassTitle(String criteriaClassTitle) {
        this.criteriaClassTitle = criteriaClassTitle;
        return this;
    }

    /**
     * Active
     * <p>
     * Lineage reference object : FTVRUCL_STATUS_IND
     * 
     */
    @JsonProperty("criteria.statusInd")
    public String getCriteriaStatusInd() {
        return criteriaStatusInd;
    }

    /**
     * Active
     * <p>
     * Lineage reference object : FTVRUCL_STATUS_IND
     * 
     */
    @JsonProperty("criteria.statusInd")
    public void setCriteriaStatusInd(String criteriaStatusInd) {
        this.criteriaStatusInd = criteriaStatusInd;
    }

    public RulesMaintenance100PutRequest withCriteriaStatusInd(String criteriaStatusInd) {
        this.criteriaStatusInd = criteriaStatusInd;
        return this;
    }

    /**
     * Rule Class Type
     * <p>
     * Lineage reference object : FTVRUCL_CLASS_TYPE
     * (Required)
     * 
     */
    @JsonProperty("criteria.classType")
    public String getCriteriaClassType() {
        return criteriaClassType;
    }

    /**
     * Rule Class Type
     * <p>
     * Lineage reference object : FTVRUCL_CLASS_TYPE
     * (Required)
     * 
     */
    @JsonProperty("criteria.classType")
    public void setCriteriaClassType(String criteriaClassType) {
        this.criteriaClassType = criteriaClassType;
    }

    public RulesMaintenance100PutRequest withCriteriaClassType(String criteriaClassType) {
        this.criteriaClassType = criteriaClassType;
        return this;
    }

    /**
     * Termination Date
     * <p>
     * Lineage reference object : FTVRUCL_TERM_DATE
     * 
     */
    @JsonProperty("criteria.termDate")
    public Date getCriteriaTermDate() {
        return criteriaTermDate;
    }

    /**
     * Termination Date
     * <p>
     * Lineage reference object : FTVRUCL_TERM_DATE
     * 
     */
    @JsonProperty("criteria.termDate")
    public void setCriteriaTermDate(Date criteriaTermDate) {
        this.criteriaTermDate = criteriaTermDate;
    }

    public RulesMaintenance100PutRequest withCriteriaTermDate(Date criteriaTermDate) {
        this.criteriaTermDate = criteriaTermDate;
        return this;
    }

    /**
     * Lineage reference object : FTVRUCL_CLASS_TITLE
     * (Required)
     * 
     */
    @JsonProperty("classTitle")
    public String getClassTitle() {
        return classTitle;
    }

    /**
     * Lineage reference object : FTVRUCL_CLASS_TITLE
     * (Required)
     * 
     */
    @JsonProperty("classTitle")
    public void setClassTitle(String classTitle) {
        this.classTitle = classTitle;
    }

    public RulesMaintenance100PutRequest withClassTitle(String classTitle) {
        this.classTitle = classTitle;
        return this;
    }

    /**
     * Start Date
     * <p>
     * Lineage reference object : FTVRUCL_EFF_DATE
     * (Required)
     * 
     */
    @JsonProperty("effDate")
    public Date getEffDate() {
        return effDate;
    }

    /**
     * Start Date
     * <p>
     * Lineage reference object : FTVRUCL_EFF_DATE
     * (Required)
     * 
     */
    @JsonProperty("effDate")
    public void setEffDate(Date effDate) {
        this.effDate = effDate;
    }

    public RulesMaintenance100PutRequest withEffDate(Date effDate) {
        this.effDate = effDate;
        return this;
    }

    /**
     * Rule Class
     * <p>
     * Lineage reference object : FTVRUCL_RUCL_CODE, Lookup lineage reference object : ftvrucl
     * (Required)
     * 
     */
    @JsonProperty("criteria.ruclCode")
    public String getCriteriaRuclCode() {
        return criteriaRuclCode;
    }

    /**
     * Rule Class
     * <p>
     * Lineage reference object : FTVRUCL_RUCL_CODE, Lookup lineage reference object : ftvrucl
     * (Required)
     * 
     */
    @JsonProperty("criteria.ruclCode")
    public void setCriteriaRuclCode(String criteriaRuclCode) {
        this.criteriaRuclCode = criteriaRuclCode;
    }

    public RulesMaintenance100PutRequest withCriteriaRuclCode(String criteriaRuclCode) {
        this.criteriaRuclCode = criteriaRuclCode;
        return this;
    }

    /**
     * Active
     * <p>
     * Lineage reference object : FTVRUCL_STATUS_IND
     * 
     */
    @JsonProperty("statusInd")
    public String getStatusInd() {
        return statusInd;
    }

    /**
     * Active
     * <p>
     * Lineage reference object : FTVRUCL_STATUS_IND
     * 
     */
    @JsonProperty("statusInd")
    public void setStatusInd(String statusInd) {
        this.statusInd = statusInd;
    }

    public RulesMaintenance100PutRequest withStatusInd(String statusInd) {
        this.statusInd = statusInd;
        return this;
    }

    /**
     * Rule Class
     * <p>
     * Lineage reference object : FTVRUCL_RUCL_CODE, Lookup lineage reference object : ftvrucl
     * (Required)
     * 
     */
    @JsonProperty("ruclCode")
    public String getRuclCode() {
        return ruclCode;
    }

    /**
     * Rule Class
     * <p>
     * Lineage reference object : FTVRUCL_RUCL_CODE, Lookup lineage reference object : ftvrucl
     * (Required)
     * 
     */
    @JsonProperty("ruclCode")
    public void setRuclCode(String ruclCode) {
        this.ruclCode = ruclCode;
    }

    public RulesMaintenance100PutRequest withRuclCode(String ruclCode) {
        this.ruclCode = ruclCode;
        return this;
    }

    /**
     * Termination Date
     * <p>
     * Lineage reference object : FTVRUCL_TERM_DATE
     * 
     */
    @JsonProperty("termDate")
    public Date getTermDate() {
        return termDate;
    }

    /**
     * Termination Date
     * <p>
     * Lineage reference object : FTVRUCL_TERM_DATE
     * 
     */
    @JsonProperty("termDate")
    public void setTermDate(Date termDate) {
        this.termDate = termDate;
    }

    public RulesMaintenance100PutRequest withTermDate(Date termDate) {
        this.termDate = termDate;
        return this;
    }

    /**
     * Rule Class Type
     * <p>
     * Lineage reference object : FTVRUCL_CLASS_TYPE
     * (Required)
     * 
     */
    @JsonProperty("classType")
    public String getClassType() {
        return classType;
    }

    /**
     * Rule Class Type
     * <p>
     * Lineage reference object : FTVRUCL_CLASS_TYPE
     * (Required)
     * 
     */
    @JsonProperty("classType")
    public void setClassType(String classType) {
        this.classType = classType;
    }

    public RulesMaintenance100PutRequest withClassType(String classType) {
        this.classType = classType;
        return this;
    }

    /**
     * Balancing Method
     * <p>
     * Lineage reference object : FTVRUCL_BALANCE_METHOD
     * (Required)
     * 
     */
    @JsonProperty("criteria.balanceMethod")
    public String getCriteriaBalanceMethod() {
        return criteriaBalanceMethod;
    }

    /**
     * Balancing Method
     * <p>
     * Lineage reference object : FTVRUCL_BALANCE_METHOD
     * (Required)
     * 
     */
    @JsonProperty("criteria.balanceMethod")
    public void setCriteriaBalanceMethod(String criteriaBalanceMethod) {
        this.criteriaBalanceMethod = criteriaBalanceMethod;
    }

    public RulesMaintenance100PutRequest withCriteriaBalanceMethod(String criteriaBalanceMethod) {
        this.criteriaBalanceMethod = criteriaBalanceMethod;
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

    public RulesMaintenance100PutRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(RulesMaintenance100PutRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("criteriaEffDate");
        sb.append('=');
        sb.append(((this.criteriaEffDate == null)?"<null>":this.criteriaEffDate));
        sb.append(',');
        sb.append("criteriaActivityDate");
        sb.append('=');
        sb.append(((this.criteriaActivityDate == null)?"<null>":this.criteriaActivityDate));
        sb.append(',');
        sb.append("criteriaClassTitle");
        sb.append('=');
        sb.append(((this.criteriaClassTitle == null)?"<null>":this.criteriaClassTitle));
        sb.append(',');
        sb.append("criteriaStatusInd");
        sb.append('=');
        sb.append(((this.criteriaStatusInd == null)?"<null>":this.criteriaStatusInd));
        sb.append(',');
        sb.append("criteriaClassType");
        sb.append('=');
        sb.append(((this.criteriaClassType == null)?"<null>":this.criteriaClassType));
        sb.append(',');
        sb.append("criteriaTermDate");
        sb.append('=');
        sb.append(((this.criteriaTermDate == null)?"<null>":this.criteriaTermDate));
        sb.append(',');
        sb.append("classTitle");
        sb.append('=');
        sb.append(((this.classTitle == null)?"<null>":this.classTitle));
        sb.append(',');
        sb.append("effDate");
        sb.append('=');
        sb.append(((this.effDate == null)?"<null>":this.effDate));
        sb.append(',');
        sb.append("criteriaRuclCode");
        sb.append('=');
        sb.append(((this.criteriaRuclCode == null)?"<null>":this.criteriaRuclCode));
        sb.append(',');
        sb.append("statusInd");
        sb.append('=');
        sb.append(((this.statusInd == null)?"<null>":this.statusInd));
        sb.append(',');
        sb.append("ruclCode");
        sb.append('=');
        sb.append(((this.ruclCode == null)?"<null>":this.ruclCode));
        sb.append(',');
        sb.append("termDate");
        sb.append('=');
        sb.append(((this.termDate == null)?"<null>":this.termDate));
        sb.append(',');
        sb.append("classType");
        sb.append('=');
        sb.append(((this.classType == null)?"<null>":this.classType));
        sb.append(',');
        sb.append("criteriaBalanceMethod");
        sb.append('=');
        sb.append(((this.criteriaBalanceMethod == null)?"<null>":this.criteriaBalanceMethod));
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
        result = ((result* 31)+((this.criteriaClassType == null)? 0 :this.criteriaClassType.hashCode()));
        result = ((result* 31)+((this.criteriaBalanceMethod == null)? 0 :this.criteriaBalanceMethod.hashCode()));
        result = ((result* 31)+((this.criteriaTermDate == null)? 0 :this.criteriaTermDate.hashCode()));
        result = ((result* 31)+((this.criteriaClassTitle == null)? 0 :this.criteriaClassTitle.hashCode()));
        result = ((result* 31)+((this.criteriaStatusInd == null)? 0 :this.criteriaStatusInd.hashCode()));
        result = ((result* 31)+((this.criteriaEffDate == null)? 0 :this.criteriaEffDate.hashCode()));
        result = ((result* 31)+((this.classTitle == null)? 0 :this.classTitle.hashCode()));
        result = ((result* 31)+((this.effDate == null)? 0 :this.effDate.hashCode()));
        result = ((result* 31)+((this.criteriaRuclCode == null)? 0 :this.criteriaRuclCode.hashCode()));
        result = ((result* 31)+((this.statusInd == null)? 0 :this.statusInd.hashCode()));
        result = ((result* 31)+((this.ruclCode == null)? 0 :this.ruclCode.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.termDate == null)? 0 :this.termDate.hashCode()));
        result = ((result* 31)+((this.classType == null)? 0 :this.classType.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof RulesMaintenance100PutRequest) == false) {
            return false;
        }
        RulesMaintenance100PutRequest rhs = ((RulesMaintenance100PutRequest) other);
        return ((((((((((((((((this.criteriaActivityDate == rhs.criteriaActivityDate)||((this.criteriaActivityDate!= null)&&this.criteriaActivityDate.equals(rhs.criteriaActivityDate)))&&((this.criteriaClassType == rhs.criteriaClassType)||((this.criteriaClassType!= null)&&this.criteriaClassType.equals(rhs.criteriaClassType))))&&((this.criteriaBalanceMethod == rhs.criteriaBalanceMethod)||((this.criteriaBalanceMethod!= null)&&this.criteriaBalanceMethod.equals(rhs.criteriaBalanceMethod))))&&((this.criteriaTermDate == rhs.criteriaTermDate)||((this.criteriaTermDate!= null)&&this.criteriaTermDate.equals(rhs.criteriaTermDate))))&&((this.criteriaClassTitle == rhs.criteriaClassTitle)||((this.criteriaClassTitle!= null)&&this.criteriaClassTitle.equals(rhs.criteriaClassTitle))))&&((this.criteriaStatusInd == rhs.criteriaStatusInd)||((this.criteriaStatusInd!= null)&&this.criteriaStatusInd.equals(rhs.criteriaStatusInd))))&&((this.criteriaEffDate == rhs.criteriaEffDate)||((this.criteriaEffDate!= null)&&this.criteriaEffDate.equals(rhs.criteriaEffDate))))&&((this.classTitle == rhs.classTitle)||((this.classTitle!= null)&&this.classTitle.equals(rhs.classTitle))))&&((this.effDate == rhs.effDate)||((this.effDate!= null)&&this.effDate.equals(rhs.effDate))))&&((this.criteriaRuclCode == rhs.criteriaRuclCode)||((this.criteriaRuclCode!= null)&&this.criteriaRuclCode.equals(rhs.criteriaRuclCode))))&&((this.statusInd == rhs.statusInd)||((this.statusInd!= null)&&this.statusInd.equals(rhs.statusInd))))&&((this.ruclCode == rhs.ruclCode)||((this.ruclCode!= null)&&this.ruclCode.equals(rhs.ruclCode))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.termDate == rhs.termDate)||((this.termDate!= null)&&this.termDate.equals(rhs.termDate))))&&((this.classType == rhs.classType)||((this.classType!= null)&&this.classType.equals(rhs.classType))));
    }

}
