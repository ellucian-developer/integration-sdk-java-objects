
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
    "classTitle",
    "effDate",
    "statusInd",
    "ruclCode",
    "termDate",
    "classType",
    "balanceMethod"
})
@Generated("jsonschema2pojo")
public class RulesMaintenance100PostRequest {

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
    @JsonProperty("balanceMethod")
    @JsonPropertyDescription("Lineage reference object : FTVRUCL_BALANCE_METHOD")
    private String balanceMethod;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

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

    public RulesMaintenance100PostRequest withClassTitle(String classTitle) {
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

    public RulesMaintenance100PostRequest withEffDate(Date effDate) {
        this.effDate = effDate;
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

    public RulesMaintenance100PostRequest withStatusInd(String statusInd) {
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

    public RulesMaintenance100PostRequest withRuclCode(String ruclCode) {
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

    public RulesMaintenance100PostRequest withTermDate(Date termDate) {
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

    public RulesMaintenance100PostRequest withClassType(String classType) {
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
    @JsonProperty("balanceMethod")
    public String getBalanceMethod() {
        return balanceMethod;
    }

    /**
     * Balancing Method
     * <p>
     * Lineage reference object : FTVRUCL_BALANCE_METHOD
     * (Required)
     * 
     */
    @JsonProperty("balanceMethod")
    public void setBalanceMethod(String balanceMethod) {
        this.balanceMethod = balanceMethod;
    }

    public RulesMaintenance100PostRequest withBalanceMethod(String balanceMethod) {
        this.balanceMethod = balanceMethod;
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

    public RulesMaintenance100PostRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(RulesMaintenance100PostRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("classTitle");
        sb.append('=');
        sb.append(((this.classTitle == null)?"<null>":this.classTitle));
        sb.append(',');
        sb.append("effDate");
        sb.append('=');
        sb.append(((this.effDate == null)?"<null>":this.effDate));
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
        sb.append("balanceMethod");
        sb.append('=');
        sb.append(((this.balanceMethod == null)?"<null>":this.balanceMethod));
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
        result = ((result* 31)+((this.classTitle == null)? 0 :this.classTitle.hashCode()));
        result = ((result* 31)+((this.effDate == null)? 0 :this.effDate.hashCode()));
        result = ((result* 31)+((this.statusInd == null)? 0 :this.statusInd.hashCode()));
        result = ((result* 31)+((this.ruclCode == null)? 0 :this.ruclCode.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.termDate == null)? 0 :this.termDate.hashCode()));
        result = ((result* 31)+((this.classType == null)? 0 :this.classType.hashCode()));
        result = ((result* 31)+((this.balanceMethod == null)? 0 :this.balanceMethod.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof RulesMaintenance100PostRequest) == false) {
            return false;
        }
        RulesMaintenance100PostRequest rhs = ((RulesMaintenance100PostRequest) other);
        return (((((((((this.classTitle == rhs.classTitle)||((this.classTitle!= null)&&this.classTitle.equals(rhs.classTitle)))&&((this.effDate == rhs.effDate)||((this.effDate!= null)&&this.effDate.equals(rhs.effDate))))&&((this.statusInd == rhs.statusInd)||((this.statusInd!= null)&&this.statusInd.equals(rhs.statusInd))))&&((this.ruclCode == rhs.ruclCode)||((this.ruclCode!= null)&&this.ruclCode.equals(rhs.ruclCode))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.termDate == rhs.termDate)||((this.termDate!= null)&&this.termDate.equals(rhs.termDate))))&&((this.classType == rhs.classType)||((this.classType!= null)&&this.classType.equals(rhs.classType))))&&((this.balanceMethod == rhs.balanceMethod)||((this.balanceMethod!= null)&&this.balanceMethod.equals(rhs.balanceMethod))));
    }

}