
package com.ellucian.generated.bpapi.ban.fund_type_maintenance.v1_0_0;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "criteria.ftvftypCoasCode",
    "criteria.ftvftypStatusInd",
    "criteria.ftvftypInternalFtypCode",
    "criteria.ftvftypActivityDate",
    "criteria.ftvftypFtypCodePred",
    "criteria.ftvftypFtypCode",
    "criteria.ftvftypFundCodeCap",
    "criteria.ftvftypTitle",
    "criteria.ftvftypAcctCodeCap",
    "criteria.ftvftypEffDate",
    "criteria.ftvftypDefOverrideInd",
    "criteria.ftvftypTermDate",
    "criteria.ftvftypEncMultYrInd",
    "criteria.ftvftypBavlKeyFund",
    "criteria.ftvftypBavlKeyOrg",
    "criteria.ftvftypBavlKeyAcct",
    "criteria.ftvftypBavlKeyProg",
    "criteria.ftvftypBavlPeriod",
    "criteria.ftvftypBavlSeverity"
})
@Generated("jsonschema2pojo")
public class FundTypeMaintenance100QapiPost {

    @JsonProperty("criteria.ftvftypCoasCode")
    private String criteriaFtvftypCoasCode;
    @JsonProperty("criteria.ftvftypStatusInd")
    private String criteriaFtvftypStatusInd;
    @JsonProperty("criteria.ftvftypInternalFtypCode")
    private String criteriaFtvftypInternalFtypCode;
    @JsonProperty("criteria.ftvftypActivityDate")
    private String criteriaFtvftypActivityDate;
    @JsonProperty("criteria.ftvftypFtypCodePred")
    private String criteriaFtvftypFtypCodePred;
    @JsonProperty("criteria.ftvftypFtypCode")
    private String criteriaFtvftypFtypCode;
    @JsonProperty("criteria.ftvftypFundCodeCap")
    private String criteriaFtvftypFundCodeCap;
    @JsonProperty("criteria.ftvftypTitle")
    private String criteriaFtvftypTitle;
    @JsonProperty("criteria.ftvftypAcctCodeCap")
    private String criteriaFtvftypAcctCodeCap;
    @JsonProperty("criteria.ftvftypEffDate")
    private String criteriaFtvftypEffDate;
    @JsonProperty("criteria.ftvftypDefOverrideInd")
    private String criteriaFtvftypDefOverrideInd;
    @JsonProperty("criteria.ftvftypTermDate")
    private String criteriaFtvftypTermDate;
    @JsonProperty("criteria.ftvftypEncMultYrInd")
    private String criteriaFtvftypEncMultYrInd;
    @JsonProperty("criteria.ftvftypBavlKeyFund")
    private String criteriaFtvftypBavlKeyFund;
    @JsonProperty("criteria.ftvftypBavlKeyOrg")
    private String criteriaFtvftypBavlKeyOrg;
    @JsonProperty("criteria.ftvftypBavlKeyAcct")
    private String criteriaFtvftypBavlKeyAcct;
    @JsonProperty("criteria.ftvftypBavlKeyProg")
    private String criteriaFtvftypBavlKeyProg;
    @JsonProperty("criteria.ftvftypBavlPeriod")
    private String criteriaFtvftypBavlPeriod;
    @JsonProperty("criteria.ftvftypBavlSeverity")
    private String criteriaFtvftypBavlSeverity;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("criteria.ftvftypCoasCode")
    public String getCriteriaFtvftypCoasCode() {
        return criteriaFtvftypCoasCode;
    }

    @JsonProperty("criteria.ftvftypCoasCode")
    public void setCriteriaFtvftypCoasCode(String criteriaFtvftypCoasCode) {
        this.criteriaFtvftypCoasCode = criteriaFtvftypCoasCode;
    }

    public FundTypeMaintenance100QapiPost withCriteriaFtvftypCoasCode(String criteriaFtvftypCoasCode) {
        this.criteriaFtvftypCoasCode = criteriaFtvftypCoasCode;
        return this;
    }

    @JsonProperty("criteria.ftvftypStatusInd")
    public String getCriteriaFtvftypStatusInd() {
        return criteriaFtvftypStatusInd;
    }

    @JsonProperty("criteria.ftvftypStatusInd")
    public void setCriteriaFtvftypStatusInd(String criteriaFtvftypStatusInd) {
        this.criteriaFtvftypStatusInd = criteriaFtvftypStatusInd;
    }

    public FundTypeMaintenance100QapiPost withCriteriaFtvftypStatusInd(String criteriaFtvftypStatusInd) {
        this.criteriaFtvftypStatusInd = criteriaFtvftypStatusInd;
        return this;
    }

    @JsonProperty("criteria.ftvftypInternalFtypCode")
    public String getCriteriaFtvftypInternalFtypCode() {
        return criteriaFtvftypInternalFtypCode;
    }

    @JsonProperty("criteria.ftvftypInternalFtypCode")
    public void setCriteriaFtvftypInternalFtypCode(String criteriaFtvftypInternalFtypCode) {
        this.criteriaFtvftypInternalFtypCode = criteriaFtvftypInternalFtypCode;
    }

    public FundTypeMaintenance100QapiPost withCriteriaFtvftypInternalFtypCode(String criteriaFtvftypInternalFtypCode) {
        this.criteriaFtvftypInternalFtypCode = criteriaFtvftypInternalFtypCode;
        return this;
    }

    @JsonProperty("criteria.ftvftypActivityDate")
    public String getCriteriaFtvftypActivityDate() {
        return criteriaFtvftypActivityDate;
    }

    @JsonProperty("criteria.ftvftypActivityDate")
    public void setCriteriaFtvftypActivityDate(String criteriaFtvftypActivityDate) {
        this.criteriaFtvftypActivityDate = criteriaFtvftypActivityDate;
    }

    public FundTypeMaintenance100QapiPost withCriteriaFtvftypActivityDate(String criteriaFtvftypActivityDate) {
        this.criteriaFtvftypActivityDate = criteriaFtvftypActivityDate;
        return this;
    }

    @JsonProperty("criteria.ftvftypFtypCodePred")
    public String getCriteriaFtvftypFtypCodePred() {
        return criteriaFtvftypFtypCodePred;
    }

    @JsonProperty("criteria.ftvftypFtypCodePred")
    public void setCriteriaFtvftypFtypCodePred(String criteriaFtvftypFtypCodePred) {
        this.criteriaFtvftypFtypCodePred = criteriaFtvftypFtypCodePred;
    }

    public FundTypeMaintenance100QapiPost withCriteriaFtvftypFtypCodePred(String criteriaFtvftypFtypCodePred) {
        this.criteriaFtvftypFtypCodePred = criteriaFtvftypFtypCodePred;
        return this;
    }

    @JsonProperty("criteria.ftvftypFtypCode")
    public String getCriteriaFtvftypFtypCode() {
        return criteriaFtvftypFtypCode;
    }

    @JsonProperty("criteria.ftvftypFtypCode")
    public void setCriteriaFtvftypFtypCode(String criteriaFtvftypFtypCode) {
        this.criteriaFtvftypFtypCode = criteriaFtvftypFtypCode;
    }

    public FundTypeMaintenance100QapiPost withCriteriaFtvftypFtypCode(String criteriaFtvftypFtypCode) {
        this.criteriaFtvftypFtypCode = criteriaFtvftypFtypCode;
        return this;
    }

    @JsonProperty("criteria.ftvftypFundCodeCap")
    public String getCriteriaFtvftypFundCodeCap() {
        return criteriaFtvftypFundCodeCap;
    }

    @JsonProperty("criteria.ftvftypFundCodeCap")
    public void setCriteriaFtvftypFundCodeCap(String criteriaFtvftypFundCodeCap) {
        this.criteriaFtvftypFundCodeCap = criteriaFtvftypFundCodeCap;
    }

    public FundTypeMaintenance100QapiPost withCriteriaFtvftypFundCodeCap(String criteriaFtvftypFundCodeCap) {
        this.criteriaFtvftypFundCodeCap = criteriaFtvftypFundCodeCap;
        return this;
    }

    @JsonProperty("criteria.ftvftypTitle")
    public String getCriteriaFtvftypTitle() {
        return criteriaFtvftypTitle;
    }

    @JsonProperty("criteria.ftvftypTitle")
    public void setCriteriaFtvftypTitle(String criteriaFtvftypTitle) {
        this.criteriaFtvftypTitle = criteriaFtvftypTitle;
    }

    public FundTypeMaintenance100QapiPost withCriteriaFtvftypTitle(String criteriaFtvftypTitle) {
        this.criteriaFtvftypTitle = criteriaFtvftypTitle;
        return this;
    }

    @JsonProperty("criteria.ftvftypAcctCodeCap")
    public String getCriteriaFtvftypAcctCodeCap() {
        return criteriaFtvftypAcctCodeCap;
    }

    @JsonProperty("criteria.ftvftypAcctCodeCap")
    public void setCriteriaFtvftypAcctCodeCap(String criteriaFtvftypAcctCodeCap) {
        this.criteriaFtvftypAcctCodeCap = criteriaFtvftypAcctCodeCap;
    }

    public FundTypeMaintenance100QapiPost withCriteriaFtvftypAcctCodeCap(String criteriaFtvftypAcctCodeCap) {
        this.criteriaFtvftypAcctCodeCap = criteriaFtvftypAcctCodeCap;
        return this;
    }

    @JsonProperty("criteria.ftvftypEffDate")
    public String getCriteriaFtvftypEffDate() {
        return criteriaFtvftypEffDate;
    }

    @JsonProperty("criteria.ftvftypEffDate")
    public void setCriteriaFtvftypEffDate(String criteriaFtvftypEffDate) {
        this.criteriaFtvftypEffDate = criteriaFtvftypEffDate;
    }

    public FundTypeMaintenance100QapiPost withCriteriaFtvftypEffDate(String criteriaFtvftypEffDate) {
        this.criteriaFtvftypEffDate = criteriaFtvftypEffDate;
        return this;
    }

    @JsonProperty("criteria.ftvftypDefOverrideInd")
    public String getCriteriaFtvftypDefOverrideInd() {
        return criteriaFtvftypDefOverrideInd;
    }

    @JsonProperty("criteria.ftvftypDefOverrideInd")
    public void setCriteriaFtvftypDefOverrideInd(String criteriaFtvftypDefOverrideInd) {
        this.criteriaFtvftypDefOverrideInd = criteriaFtvftypDefOverrideInd;
    }

    public FundTypeMaintenance100QapiPost withCriteriaFtvftypDefOverrideInd(String criteriaFtvftypDefOverrideInd) {
        this.criteriaFtvftypDefOverrideInd = criteriaFtvftypDefOverrideInd;
        return this;
    }

    @JsonProperty("criteria.ftvftypTermDate")
    public String getCriteriaFtvftypTermDate() {
        return criteriaFtvftypTermDate;
    }

    @JsonProperty("criteria.ftvftypTermDate")
    public void setCriteriaFtvftypTermDate(String criteriaFtvftypTermDate) {
        this.criteriaFtvftypTermDate = criteriaFtvftypTermDate;
    }

    public FundTypeMaintenance100QapiPost withCriteriaFtvftypTermDate(String criteriaFtvftypTermDate) {
        this.criteriaFtvftypTermDate = criteriaFtvftypTermDate;
        return this;
    }

    @JsonProperty("criteria.ftvftypEncMultYrInd")
    public String getCriteriaFtvftypEncMultYrInd() {
        return criteriaFtvftypEncMultYrInd;
    }

    @JsonProperty("criteria.ftvftypEncMultYrInd")
    public void setCriteriaFtvftypEncMultYrInd(String criteriaFtvftypEncMultYrInd) {
        this.criteriaFtvftypEncMultYrInd = criteriaFtvftypEncMultYrInd;
    }

    public FundTypeMaintenance100QapiPost withCriteriaFtvftypEncMultYrInd(String criteriaFtvftypEncMultYrInd) {
        this.criteriaFtvftypEncMultYrInd = criteriaFtvftypEncMultYrInd;
        return this;
    }

    @JsonProperty("criteria.ftvftypBavlKeyFund")
    public String getCriteriaFtvftypBavlKeyFund() {
        return criteriaFtvftypBavlKeyFund;
    }

    @JsonProperty("criteria.ftvftypBavlKeyFund")
    public void setCriteriaFtvftypBavlKeyFund(String criteriaFtvftypBavlKeyFund) {
        this.criteriaFtvftypBavlKeyFund = criteriaFtvftypBavlKeyFund;
    }

    public FundTypeMaintenance100QapiPost withCriteriaFtvftypBavlKeyFund(String criteriaFtvftypBavlKeyFund) {
        this.criteriaFtvftypBavlKeyFund = criteriaFtvftypBavlKeyFund;
        return this;
    }

    @JsonProperty("criteria.ftvftypBavlKeyOrg")
    public String getCriteriaFtvftypBavlKeyOrg() {
        return criteriaFtvftypBavlKeyOrg;
    }

    @JsonProperty("criteria.ftvftypBavlKeyOrg")
    public void setCriteriaFtvftypBavlKeyOrg(String criteriaFtvftypBavlKeyOrg) {
        this.criteriaFtvftypBavlKeyOrg = criteriaFtvftypBavlKeyOrg;
    }

    public FundTypeMaintenance100QapiPost withCriteriaFtvftypBavlKeyOrg(String criteriaFtvftypBavlKeyOrg) {
        this.criteriaFtvftypBavlKeyOrg = criteriaFtvftypBavlKeyOrg;
        return this;
    }

    @JsonProperty("criteria.ftvftypBavlKeyAcct")
    public String getCriteriaFtvftypBavlKeyAcct() {
        return criteriaFtvftypBavlKeyAcct;
    }

    @JsonProperty("criteria.ftvftypBavlKeyAcct")
    public void setCriteriaFtvftypBavlKeyAcct(String criteriaFtvftypBavlKeyAcct) {
        this.criteriaFtvftypBavlKeyAcct = criteriaFtvftypBavlKeyAcct;
    }

    public FundTypeMaintenance100QapiPost withCriteriaFtvftypBavlKeyAcct(String criteriaFtvftypBavlKeyAcct) {
        this.criteriaFtvftypBavlKeyAcct = criteriaFtvftypBavlKeyAcct;
        return this;
    }

    @JsonProperty("criteria.ftvftypBavlKeyProg")
    public String getCriteriaFtvftypBavlKeyProg() {
        return criteriaFtvftypBavlKeyProg;
    }

    @JsonProperty("criteria.ftvftypBavlKeyProg")
    public void setCriteriaFtvftypBavlKeyProg(String criteriaFtvftypBavlKeyProg) {
        this.criteriaFtvftypBavlKeyProg = criteriaFtvftypBavlKeyProg;
    }

    public FundTypeMaintenance100QapiPost withCriteriaFtvftypBavlKeyProg(String criteriaFtvftypBavlKeyProg) {
        this.criteriaFtvftypBavlKeyProg = criteriaFtvftypBavlKeyProg;
        return this;
    }

    @JsonProperty("criteria.ftvftypBavlPeriod")
    public String getCriteriaFtvftypBavlPeriod() {
        return criteriaFtvftypBavlPeriod;
    }

    @JsonProperty("criteria.ftvftypBavlPeriod")
    public void setCriteriaFtvftypBavlPeriod(String criteriaFtvftypBavlPeriod) {
        this.criteriaFtvftypBavlPeriod = criteriaFtvftypBavlPeriod;
    }

    public FundTypeMaintenance100QapiPost withCriteriaFtvftypBavlPeriod(String criteriaFtvftypBavlPeriod) {
        this.criteriaFtvftypBavlPeriod = criteriaFtvftypBavlPeriod;
        return this;
    }

    @JsonProperty("criteria.ftvftypBavlSeverity")
    public String getCriteriaFtvftypBavlSeverity() {
        return criteriaFtvftypBavlSeverity;
    }

    @JsonProperty("criteria.ftvftypBavlSeverity")
    public void setCriteriaFtvftypBavlSeverity(String criteriaFtvftypBavlSeverity) {
        this.criteriaFtvftypBavlSeverity = criteriaFtvftypBavlSeverity;
    }

    public FundTypeMaintenance100QapiPost withCriteriaFtvftypBavlSeverity(String criteriaFtvftypBavlSeverity) {
        this.criteriaFtvftypBavlSeverity = criteriaFtvftypBavlSeverity;
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

    public FundTypeMaintenance100QapiPost withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(FundTypeMaintenance100QapiPost.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("criteriaFtvftypCoasCode");
        sb.append('=');
        sb.append(((this.criteriaFtvftypCoasCode == null)?"<null>":this.criteriaFtvftypCoasCode));
        sb.append(',');
        sb.append("criteriaFtvftypStatusInd");
        sb.append('=');
        sb.append(((this.criteriaFtvftypStatusInd == null)?"<null>":this.criteriaFtvftypStatusInd));
        sb.append(',');
        sb.append("criteriaFtvftypInternalFtypCode");
        sb.append('=');
        sb.append(((this.criteriaFtvftypInternalFtypCode == null)?"<null>":this.criteriaFtvftypInternalFtypCode));
        sb.append(',');
        sb.append("criteriaFtvftypActivityDate");
        sb.append('=');
        sb.append(((this.criteriaFtvftypActivityDate == null)?"<null>":this.criteriaFtvftypActivityDate));
        sb.append(',');
        sb.append("criteriaFtvftypFtypCodePred");
        sb.append('=');
        sb.append(((this.criteriaFtvftypFtypCodePred == null)?"<null>":this.criteriaFtvftypFtypCodePred));
        sb.append(',');
        sb.append("criteriaFtvftypFtypCode");
        sb.append('=');
        sb.append(((this.criteriaFtvftypFtypCode == null)?"<null>":this.criteriaFtvftypFtypCode));
        sb.append(',');
        sb.append("criteriaFtvftypFundCodeCap");
        sb.append('=');
        sb.append(((this.criteriaFtvftypFundCodeCap == null)?"<null>":this.criteriaFtvftypFundCodeCap));
        sb.append(',');
        sb.append("criteriaFtvftypTitle");
        sb.append('=');
        sb.append(((this.criteriaFtvftypTitle == null)?"<null>":this.criteriaFtvftypTitle));
        sb.append(',');
        sb.append("criteriaFtvftypAcctCodeCap");
        sb.append('=');
        sb.append(((this.criteriaFtvftypAcctCodeCap == null)?"<null>":this.criteriaFtvftypAcctCodeCap));
        sb.append(',');
        sb.append("criteriaFtvftypEffDate");
        sb.append('=');
        sb.append(((this.criteriaFtvftypEffDate == null)?"<null>":this.criteriaFtvftypEffDate));
        sb.append(',');
        sb.append("criteriaFtvftypDefOverrideInd");
        sb.append('=');
        sb.append(((this.criteriaFtvftypDefOverrideInd == null)?"<null>":this.criteriaFtvftypDefOverrideInd));
        sb.append(',');
        sb.append("criteriaFtvftypTermDate");
        sb.append('=');
        sb.append(((this.criteriaFtvftypTermDate == null)?"<null>":this.criteriaFtvftypTermDate));
        sb.append(',');
        sb.append("criteriaFtvftypEncMultYrInd");
        sb.append('=');
        sb.append(((this.criteriaFtvftypEncMultYrInd == null)?"<null>":this.criteriaFtvftypEncMultYrInd));
        sb.append(',');
        sb.append("criteriaFtvftypBavlKeyFund");
        sb.append('=');
        sb.append(((this.criteriaFtvftypBavlKeyFund == null)?"<null>":this.criteriaFtvftypBavlKeyFund));
        sb.append(',');
        sb.append("criteriaFtvftypBavlKeyOrg");
        sb.append('=');
        sb.append(((this.criteriaFtvftypBavlKeyOrg == null)?"<null>":this.criteriaFtvftypBavlKeyOrg));
        sb.append(',');
        sb.append("criteriaFtvftypBavlKeyAcct");
        sb.append('=');
        sb.append(((this.criteriaFtvftypBavlKeyAcct == null)?"<null>":this.criteriaFtvftypBavlKeyAcct));
        sb.append(',');
        sb.append("criteriaFtvftypBavlKeyProg");
        sb.append('=');
        sb.append(((this.criteriaFtvftypBavlKeyProg == null)?"<null>":this.criteriaFtvftypBavlKeyProg));
        sb.append(',');
        sb.append("criteriaFtvftypBavlPeriod");
        sb.append('=');
        sb.append(((this.criteriaFtvftypBavlPeriod == null)?"<null>":this.criteriaFtvftypBavlPeriod));
        sb.append(',');
        sb.append("criteriaFtvftypBavlSeverity");
        sb.append('=');
        sb.append(((this.criteriaFtvftypBavlSeverity == null)?"<null>":this.criteriaFtvftypBavlSeverity));
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
        result = ((result* 31)+((this.criteriaFtvftypBavlKeyAcct == null)? 0 :this.criteriaFtvftypBavlKeyAcct.hashCode()));
        result = ((result* 31)+((this.criteriaFtvftypBavlPeriod == null)? 0 :this.criteriaFtvftypBavlPeriod.hashCode()));
        result = ((result* 31)+((this.criteriaFtvftypBavlKeyProg == null)? 0 :this.criteriaFtvftypBavlKeyProg.hashCode()));
        result = ((result* 31)+((this.criteriaFtvftypFundCodeCap == null)? 0 :this.criteriaFtvftypFundCodeCap.hashCode()));
        result = ((result* 31)+((this.criteriaFtvftypInternalFtypCode == null)? 0 :this.criteriaFtvftypInternalFtypCode.hashCode()));
        result = ((result* 31)+((this.criteriaFtvftypBavlSeverity == null)? 0 :this.criteriaFtvftypBavlSeverity.hashCode()));
        result = ((result* 31)+((this.criteriaFtvftypCoasCode == null)? 0 :this.criteriaFtvftypCoasCode.hashCode()));
        result = ((result* 31)+((this.criteriaFtvftypTermDate == null)? 0 :this.criteriaFtvftypTermDate.hashCode()));
        result = ((result* 31)+((this.criteriaFtvftypFtypCode == null)? 0 :this.criteriaFtvftypFtypCode.hashCode()));
        result = ((result* 31)+((this.criteriaFtvftypActivityDate == null)? 0 :this.criteriaFtvftypActivityDate.hashCode()));
        result = ((result* 31)+((this.criteriaFtvftypEncMultYrInd == null)? 0 :this.criteriaFtvftypEncMultYrInd.hashCode()));
        result = ((result* 31)+((this.criteriaFtvftypBavlKeyFund == null)? 0 :this.criteriaFtvftypBavlKeyFund.hashCode()));
        result = ((result* 31)+((this.criteriaFtvftypEffDate == null)? 0 :this.criteriaFtvftypEffDate.hashCode()));
        result = ((result* 31)+((this.criteriaFtvftypTitle == null)? 0 :this.criteriaFtvftypTitle.hashCode()));
        result = ((result* 31)+((this.criteriaFtvftypStatusInd == null)? 0 :this.criteriaFtvftypStatusInd.hashCode()));
        result = ((result* 31)+((this.criteriaFtvftypDefOverrideInd == null)? 0 :this.criteriaFtvftypDefOverrideInd.hashCode()));
        result = ((result* 31)+((this.criteriaFtvftypBavlKeyOrg == null)? 0 :this.criteriaFtvftypBavlKeyOrg.hashCode()));
        result = ((result* 31)+((this.criteriaFtvftypFtypCodePred == null)? 0 :this.criteriaFtvftypFtypCodePred.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.criteriaFtvftypAcctCodeCap == null)? 0 :this.criteriaFtvftypAcctCodeCap.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof FundTypeMaintenance100QapiPost) == false) {
            return false;
        }
        FundTypeMaintenance100QapiPost rhs = ((FundTypeMaintenance100QapiPost) other);
        return (((((((((((((((((((((this.criteriaFtvftypBavlKeyAcct == rhs.criteriaFtvftypBavlKeyAcct)||((this.criteriaFtvftypBavlKeyAcct!= null)&&this.criteriaFtvftypBavlKeyAcct.equals(rhs.criteriaFtvftypBavlKeyAcct)))&&((this.criteriaFtvftypBavlPeriod == rhs.criteriaFtvftypBavlPeriod)||((this.criteriaFtvftypBavlPeriod!= null)&&this.criteriaFtvftypBavlPeriod.equals(rhs.criteriaFtvftypBavlPeriod))))&&((this.criteriaFtvftypBavlKeyProg == rhs.criteriaFtvftypBavlKeyProg)||((this.criteriaFtvftypBavlKeyProg!= null)&&this.criteriaFtvftypBavlKeyProg.equals(rhs.criteriaFtvftypBavlKeyProg))))&&((this.criteriaFtvftypFundCodeCap == rhs.criteriaFtvftypFundCodeCap)||((this.criteriaFtvftypFundCodeCap!= null)&&this.criteriaFtvftypFundCodeCap.equals(rhs.criteriaFtvftypFundCodeCap))))&&((this.criteriaFtvftypInternalFtypCode == rhs.criteriaFtvftypInternalFtypCode)||((this.criteriaFtvftypInternalFtypCode!= null)&&this.criteriaFtvftypInternalFtypCode.equals(rhs.criteriaFtvftypInternalFtypCode))))&&((this.criteriaFtvftypBavlSeverity == rhs.criteriaFtvftypBavlSeverity)||((this.criteriaFtvftypBavlSeverity!= null)&&this.criteriaFtvftypBavlSeverity.equals(rhs.criteriaFtvftypBavlSeverity))))&&((this.criteriaFtvftypCoasCode == rhs.criteriaFtvftypCoasCode)||((this.criteriaFtvftypCoasCode!= null)&&this.criteriaFtvftypCoasCode.equals(rhs.criteriaFtvftypCoasCode))))&&((this.criteriaFtvftypTermDate == rhs.criteriaFtvftypTermDate)||((this.criteriaFtvftypTermDate!= null)&&this.criteriaFtvftypTermDate.equals(rhs.criteriaFtvftypTermDate))))&&((this.criteriaFtvftypFtypCode == rhs.criteriaFtvftypFtypCode)||((this.criteriaFtvftypFtypCode!= null)&&this.criteriaFtvftypFtypCode.equals(rhs.criteriaFtvftypFtypCode))))&&((this.criteriaFtvftypActivityDate == rhs.criteriaFtvftypActivityDate)||((this.criteriaFtvftypActivityDate!= null)&&this.criteriaFtvftypActivityDate.equals(rhs.criteriaFtvftypActivityDate))))&&((this.criteriaFtvftypEncMultYrInd == rhs.criteriaFtvftypEncMultYrInd)||((this.criteriaFtvftypEncMultYrInd!= null)&&this.criteriaFtvftypEncMultYrInd.equals(rhs.criteriaFtvftypEncMultYrInd))))&&((this.criteriaFtvftypBavlKeyFund == rhs.criteriaFtvftypBavlKeyFund)||((this.criteriaFtvftypBavlKeyFund!= null)&&this.criteriaFtvftypBavlKeyFund.equals(rhs.criteriaFtvftypBavlKeyFund))))&&((this.criteriaFtvftypEffDate == rhs.criteriaFtvftypEffDate)||((this.criteriaFtvftypEffDate!= null)&&this.criteriaFtvftypEffDate.equals(rhs.criteriaFtvftypEffDate))))&&((this.criteriaFtvftypTitle == rhs.criteriaFtvftypTitle)||((this.criteriaFtvftypTitle!= null)&&this.criteriaFtvftypTitle.equals(rhs.criteriaFtvftypTitle))))&&((this.criteriaFtvftypStatusInd == rhs.criteriaFtvftypStatusInd)||((this.criteriaFtvftypStatusInd!= null)&&this.criteriaFtvftypStatusInd.equals(rhs.criteriaFtvftypStatusInd))))&&((this.criteriaFtvftypDefOverrideInd == rhs.criteriaFtvftypDefOverrideInd)||((this.criteriaFtvftypDefOverrideInd!= null)&&this.criteriaFtvftypDefOverrideInd.equals(rhs.criteriaFtvftypDefOverrideInd))))&&((this.criteriaFtvftypBavlKeyOrg == rhs.criteriaFtvftypBavlKeyOrg)||((this.criteriaFtvftypBavlKeyOrg!= null)&&this.criteriaFtvftypBavlKeyOrg.equals(rhs.criteriaFtvftypBavlKeyOrg))))&&((this.criteriaFtvftypFtypCodePred == rhs.criteriaFtvftypFtypCodePred)||((this.criteriaFtvftypFtypCodePred!= null)&&this.criteriaFtvftypFtypCodePred.equals(rhs.criteriaFtvftypFtypCodePred))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.criteriaFtvftypAcctCodeCap == rhs.criteriaFtvftypAcctCodeCap)||((this.criteriaFtvftypAcctCodeCap!= null)&&this.criteriaFtvftypAcctCodeCap.equals(rhs.criteriaFtvftypAcctCodeCap))));
    }

}
