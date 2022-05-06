
package com.ellucian.generated.bpapi.ban.life_insurance_rule.v1_0_0;

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
    "bdcaCode",
    "inclPrimaryJobInd",
    "inclSecJobInd",
    "inclOverloadJobInd",
    "covMinAmt",
    "bdplCode",
    "roundingInd",
    "covMaxAmt",
    "emplEmprInd",
    "roundingAmt",
    "activityDate"
})
@Generated("jsonschema2pojo")
public class LifeInsuranceRule100QapiPost {

    /**
     * Benefit or Deduction
     * <p>
     * Lineage reference object : PTRLIFI_BDCA_CODE
     * 
     */
    @JsonProperty("bdcaCode")
    @JsonPropertyDescription("Lineage reference object : PTRLIFI_BDCA_CODE")
    private String bdcaCode;
    /**
     * Primary
     * <p>
     * Lineage reference object : PTRLIFI_INCL_PRIMARY_JOB_IND
     * 
     */
    @JsonProperty("inclPrimaryJobInd")
    @JsonPropertyDescription("Lineage reference object : PTRLIFI_INCL_PRIMARY_JOB_IND")
    private String inclPrimaryJobInd;
    /**
     * Secondary
     * <p>
     * Lineage reference object : PTRLIFI_INCL_SEC_JOB_IND
     * 
     */
    @JsonProperty("inclSecJobInd")
    @JsonPropertyDescription("Lineage reference object : PTRLIFI_INCL_SEC_JOB_IND")
    private String inclSecJobInd;
    /**
     * Overload
     * <p>
     * Lineage reference object : PTRLIFI_INCL_OVERLOAD_JOB_IND
     * 
     */
    @JsonProperty("inclOverloadJobInd")
    @JsonPropertyDescription("Lineage reference object : PTRLIFI_INCL_OVERLOAD_JOB_IND")
    private String inclOverloadJobInd;
    /**
     * Coverage Minimum Amount
     * <p>
     * Lineage reference object : PTRLIFI_COV_MIN_AMT
     * 
     */
    @JsonProperty("covMinAmt")
    @JsonPropertyDescription("Lineage reference object : PTRLIFI_COV_MIN_AMT")
    private Double covMinAmt;
    /**
     * Plan
     * <p>
     * Lineage reference object : PTRLIFI_BDPL_CODE
     * 
     */
    @JsonProperty("bdplCode")
    @JsonPropertyDescription("Lineage reference object : PTRLIFI_BDPL_CODE")
    private String bdplCode;
    /**
     * Rounding
     * <p>
     * Lineage reference object : PTRLIFI_ROUNDING_IND
     * 
     */
    @JsonProperty("roundingInd")
    @JsonPropertyDescription("Lineage reference object : PTRLIFI_ROUNDING_IND")
    private String roundingInd;
    /**
     * Coverage Maximum Amount
     * <p>
     * Lineage reference object : PTRLIFI_COV_MAX_AMT
     * 
     */
    @JsonProperty("covMaxAmt")
    @JsonPropertyDescription("Lineage reference object : PTRLIFI_COV_MAX_AMT")
    private Double covMaxAmt;
    /**
     * Deduction Indicator
     * <p>
     * Lineage reference object : PTRLIFI_EMPL_EMPR_IND
     * 
     */
    @JsonProperty("emplEmprInd")
    @JsonPropertyDescription("Lineage reference object : PTRLIFI_EMPL_EMPR_IND")
    private String emplEmprInd;
    /**
     * Coverage Amount
     * <p>
     * Lineage reference object : PTRLIFI_ROUNDING_AMT
     * 
     */
    @JsonProperty("roundingAmt")
    @JsonPropertyDescription("Lineage reference object : PTRLIFI_ROUNDING_AMT")
    private Double roundingAmt;
    /**
     * Activity Date
     * <p>
     * Lineage reference object : PTRLIFI_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    @JsonPropertyDescription("Lineage reference object : PTRLIFI_ACTIVITY_DATE")
    private Date activityDate;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Benefit or Deduction
     * <p>
     * Lineage reference object : PTRLIFI_BDCA_CODE
     * 
     */
    @JsonProperty("bdcaCode")
    public String getBdcaCode() {
        return bdcaCode;
    }

    /**
     * Benefit or Deduction
     * <p>
     * Lineage reference object : PTRLIFI_BDCA_CODE
     * 
     */
    @JsonProperty("bdcaCode")
    public void setBdcaCode(String bdcaCode) {
        this.bdcaCode = bdcaCode;
    }

    public LifeInsuranceRule100QapiPost withBdcaCode(String bdcaCode) {
        this.bdcaCode = bdcaCode;
        return this;
    }

    /**
     * Primary
     * <p>
     * Lineage reference object : PTRLIFI_INCL_PRIMARY_JOB_IND
     * 
     */
    @JsonProperty("inclPrimaryJobInd")
    public String getInclPrimaryJobInd() {
        return inclPrimaryJobInd;
    }

    /**
     * Primary
     * <p>
     * Lineage reference object : PTRLIFI_INCL_PRIMARY_JOB_IND
     * 
     */
    @JsonProperty("inclPrimaryJobInd")
    public void setInclPrimaryJobInd(String inclPrimaryJobInd) {
        this.inclPrimaryJobInd = inclPrimaryJobInd;
    }

    public LifeInsuranceRule100QapiPost withInclPrimaryJobInd(String inclPrimaryJobInd) {
        this.inclPrimaryJobInd = inclPrimaryJobInd;
        return this;
    }

    /**
     * Secondary
     * <p>
     * Lineage reference object : PTRLIFI_INCL_SEC_JOB_IND
     * 
     */
    @JsonProperty("inclSecJobInd")
    public String getInclSecJobInd() {
        return inclSecJobInd;
    }

    /**
     * Secondary
     * <p>
     * Lineage reference object : PTRLIFI_INCL_SEC_JOB_IND
     * 
     */
    @JsonProperty("inclSecJobInd")
    public void setInclSecJobInd(String inclSecJobInd) {
        this.inclSecJobInd = inclSecJobInd;
    }

    public LifeInsuranceRule100QapiPost withInclSecJobInd(String inclSecJobInd) {
        this.inclSecJobInd = inclSecJobInd;
        return this;
    }

    /**
     * Overload
     * <p>
     * Lineage reference object : PTRLIFI_INCL_OVERLOAD_JOB_IND
     * 
     */
    @JsonProperty("inclOverloadJobInd")
    public String getInclOverloadJobInd() {
        return inclOverloadJobInd;
    }

    /**
     * Overload
     * <p>
     * Lineage reference object : PTRLIFI_INCL_OVERLOAD_JOB_IND
     * 
     */
    @JsonProperty("inclOverloadJobInd")
    public void setInclOverloadJobInd(String inclOverloadJobInd) {
        this.inclOverloadJobInd = inclOverloadJobInd;
    }

    public LifeInsuranceRule100QapiPost withInclOverloadJobInd(String inclOverloadJobInd) {
        this.inclOverloadJobInd = inclOverloadJobInd;
        return this;
    }

    /**
     * Coverage Minimum Amount
     * <p>
     * Lineage reference object : PTRLIFI_COV_MIN_AMT
     * 
     */
    @JsonProperty("covMinAmt")
    public Double getCovMinAmt() {
        return covMinAmt;
    }

    /**
     * Coverage Minimum Amount
     * <p>
     * Lineage reference object : PTRLIFI_COV_MIN_AMT
     * 
     */
    @JsonProperty("covMinAmt")
    public void setCovMinAmt(Double covMinAmt) {
        this.covMinAmt = covMinAmt;
    }

    public LifeInsuranceRule100QapiPost withCovMinAmt(Double covMinAmt) {
        this.covMinAmt = covMinAmt;
        return this;
    }

    /**
     * Plan
     * <p>
     * Lineage reference object : PTRLIFI_BDPL_CODE
     * 
     */
    @JsonProperty("bdplCode")
    public String getBdplCode() {
        return bdplCode;
    }

    /**
     * Plan
     * <p>
     * Lineage reference object : PTRLIFI_BDPL_CODE
     * 
     */
    @JsonProperty("bdplCode")
    public void setBdplCode(String bdplCode) {
        this.bdplCode = bdplCode;
    }

    public LifeInsuranceRule100QapiPost withBdplCode(String bdplCode) {
        this.bdplCode = bdplCode;
        return this;
    }

    /**
     * Rounding
     * <p>
     * Lineage reference object : PTRLIFI_ROUNDING_IND
     * 
     */
    @JsonProperty("roundingInd")
    public String getRoundingInd() {
        return roundingInd;
    }

    /**
     * Rounding
     * <p>
     * Lineage reference object : PTRLIFI_ROUNDING_IND
     * 
     */
    @JsonProperty("roundingInd")
    public void setRoundingInd(String roundingInd) {
        this.roundingInd = roundingInd;
    }

    public LifeInsuranceRule100QapiPost withRoundingInd(String roundingInd) {
        this.roundingInd = roundingInd;
        return this;
    }

    /**
     * Coverage Maximum Amount
     * <p>
     * Lineage reference object : PTRLIFI_COV_MAX_AMT
     * 
     */
    @JsonProperty("covMaxAmt")
    public Double getCovMaxAmt() {
        return covMaxAmt;
    }

    /**
     * Coverage Maximum Amount
     * <p>
     * Lineage reference object : PTRLIFI_COV_MAX_AMT
     * 
     */
    @JsonProperty("covMaxAmt")
    public void setCovMaxAmt(Double covMaxAmt) {
        this.covMaxAmt = covMaxAmt;
    }

    public LifeInsuranceRule100QapiPost withCovMaxAmt(Double covMaxAmt) {
        this.covMaxAmt = covMaxAmt;
        return this;
    }

    /**
     * Deduction Indicator
     * <p>
     * Lineage reference object : PTRLIFI_EMPL_EMPR_IND
     * 
     */
    @JsonProperty("emplEmprInd")
    public String getEmplEmprInd() {
        return emplEmprInd;
    }

    /**
     * Deduction Indicator
     * <p>
     * Lineage reference object : PTRLIFI_EMPL_EMPR_IND
     * 
     */
    @JsonProperty("emplEmprInd")
    public void setEmplEmprInd(String emplEmprInd) {
        this.emplEmprInd = emplEmprInd;
    }

    public LifeInsuranceRule100QapiPost withEmplEmprInd(String emplEmprInd) {
        this.emplEmprInd = emplEmprInd;
        return this;
    }

    /**
     * Coverage Amount
     * <p>
     * Lineage reference object : PTRLIFI_ROUNDING_AMT
     * 
     */
    @JsonProperty("roundingAmt")
    public Double getRoundingAmt() {
        return roundingAmt;
    }

    /**
     * Coverage Amount
     * <p>
     * Lineage reference object : PTRLIFI_ROUNDING_AMT
     * 
     */
    @JsonProperty("roundingAmt")
    public void setRoundingAmt(Double roundingAmt) {
        this.roundingAmt = roundingAmt;
    }

    public LifeInsuranceRule100QapiPost withRoundingAmt(Double roundingAmt) {
        this.roundingAmt = roundingAmt;
        return this;
    }

    /**
     * Activity Date
     * <p>
     * Lineage reference object : PTRLIFI_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public Date getActivityDate() {
        return activityDate;
    }

    /**
     * Activity Date
     * <p>
     * Lineage reference object : PTRLIFI_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public void setActivityDate(Date activityDate) {
        this.activityDate = activityDate;
    }

    public LifeInsuranceRule100QapiPost withActivityDate(Date activityDate) {
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

    public LifeInsuranceRule100QapiPost withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(LifeInsuranceRule100QapiPost.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("bdcaCode");
        sb.append('=');
        sb.append(((this.bdcaCode == null)?"<null>":this.bdcaCode));
        sb.append(',');
        sb.append("inclPrimaryJobInd");
        sb.append('=');
        sb.append(((this.inclPrimaryJobInd == null)?"<null>":this.inclPrimaryJobInd));
        sb.append(',');
        sb.append("inclSecJobInd");
        sb.append('=');
        sb.append(((this.inclSecJobInd == null)?"<null>":this.inclSecJobInd));
        sb.append(',');
        sb.append("inclOverloadJobInd");
        sb.append('=');
        sb.append(((this.inclOverloadJobInd == null)?"<null>":this.inclOverloadJobInd));
        sb.append(',');
        sb.append("covMinAmt");
        sb.append('=');
        sb.append(((this.covMinAmt == null)?"<null>":this.covMinAmt));
        sb.append(',');
        sb.append("bdplCode");
        sb.append('=');
        sb.append(((this.bdplCode == null)?"<null>":this.bdplCode));
        sb.append(',');
        sb.append("roundingInd");
        sb.append('=');
        sb.append(((this.roundingInd == null)?"<null>":this.roundingInd));
        sb.append(',');
        sb.append("covMaxAmt");
        sb.append('=');
        sb.append(((this.covMaxAmt == null)?"<null>":this.covMaxAmt));
        sb.append(',');
        sb.append("emplEmprInd");
        sb.append('=');
        sb.append(((this.emplEmprInd == null)?"<null>":this.emplEmprInd));
        sb.append(',');
        sb.append("roundingAmt");
        sb.append('=');
        sb.append(((this.roundingAmt == null)?"<null>":this.roundingAmt));
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
        result = ((result* 31)+((this.inclOverloadJobInd == null)? 0 :this.inclOverloadJobInd.hashCode()));
        result = ((result* 31)+((this.covMaxAmt == null)? 0 :this.covMaxAmt.hashCode()));
        result = ((result* 31)+((this.bdcaCode == null)? 0 :this.bdcaCode.hashCode()));
        result = ((result* 31)+((this.roundingAmt == null)? 0 :this.roundingAmt.hashCode()));
        result = ((result* 31)+((this.inclPrimaryJobInd == null)? 0 :this.inclPrimaryJobInd.hashCode()));
        result = ((result* 31)+((this.emplEmprInd == null)? 0 :this.emplEmprInd.hashCode()));
        result = ((result* 31)+((this.activityDate == null)? 0 :this.activityDate.hashCode()));
        result = ((result* 31)+((this.covMinAmt == null)? 0 :this.covMinAmt.hashCode()));
        result = ((result* 31)+((this.bdplCode == null)? 0 :this.bdplCode.hashCode()));
        result = ((result* 31)+((this.inclSecJobInd == null)? 0 :this.inclSecJobInd.hashCode()));
        result = ((result* 31)+((this.roundingInd == null)? 0 :this.roundingInd.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof LifeInsuranceRule100QapiPost) == false) {
            return false;
        }
        LifeInsuranceRule100QapiPost rhs = ((LifeInsuranceRule100QapiPost) other);
        return (((((((((((((this.inclOverloadJobInd == rhs.inclOverloadJobInd)||((this.inclOverloadJobInd!= null)&&this.inclOverloadJobInd.equals(rhs.inclOverloadJobInd)))&&((this.covMaxAmt == rhs.covMaxAmt)||((this.covMaxAmt!= null)&&this.covMaxAmt.equals(rhs.covMaxAmt))))&&((this.bdcaCode == rhs.bdcaCode)||((this.bdcaCode!= null)&&this.bdcaCode.equals(rhs.bdcaCode))))&&((this.roundingAmt == rhs.roundingAmt)||((this.roundingAmt!= null)&&this.roundingAmt.equals(rhs.roundingAmt))))&&((this.inclPrimaryJobInd == rhs.inclPrimaryJobInd)||((this.inclPrimaryJobInd!= null)&&this.inclPrimaryJobInd.equals(rhs.inclPrimaryJobInd))))&&((this.emplEmprInd == rhs.emplEmprInd)||((this.emplEmprInd!= null)&&this.emplEmprInd.equals(rhs.emplEmprInd))))&&((this.activityDate == rhs.activityDate)||((this.activityDate!= null)&&this.activityDate.equals(rhs.activityDate))))&&((this.covMinAmt == rhs.covMinAmt)||((this.covMinAmt!= null)&&this.covMinAmt.equals(rhs.covMinAmt))))&&((this.bdplCode == rhs.bdplCode)||((this.bdplCode!= null)&&this.bdplCode.equals(rhs.bdplCode))))&&((this.inclSecJobInd == rhs.inclSecJobInd)||((this.inclSecJobInd!= null)&&this.inclSecJobInd.equals(rhs.inclSecJobInd))))&&((this.roundingInd == rhs.roundingInd)||((this.roundingInd!= null)&&this.roundingInd.equals(rhs.roundingInd))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
    }

}
