
package com.ellucian.generated.bpapi.ban.flexible_benefits_rule.v1_0_0;

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
    "availInd",
    "flexAmt",
    "bdcaCode",
    "emplAmt",
    "premAmt",
    "fsaInd",
    "fsaGracePeriodInd",
    "dednFreq",
    "planCode"
})
@Generated("jsonschema2pojo")
public class FlexibleBenefitsRule100GetRequest {

    /**
     * Lineage reference object : PTRFBEN_AVAIL_IND
     * 
     */
    @JsonProperty("availInd")
    @JsonPropertyDescription("Lineage reference object : PTRFBEN_AVAIL_IND")
    private String availInd;
    /**
     * Flexible Amount
     * <p>
     * Lineage reference object : PTRFBEN_FLEX_AMT
     * 
     */
    @JsonProperty("flexAmt")
    @JsonPropertyDescription("Lineage reference object : PTRFBEN_FLEX_AMT")
    private Double flexAmt;
    /**
     * Benefit or Deduction Code
     * <p>
     * Lineage reference object : PTRFBEN_BDCA_CODE
     * (Required)
     * 
     */
    @JsonProperty("bdcaCode")
    @JsonPropertyDescription("Lineage reference object : PTRFBEN_BDCA_CODE")
    private String bdcaCode;
    /**
     * Employee Amount
     * <p>
     * Lineage reference object : PTRFBEN_EMPL_AMT
     * 
     */
    @JsonProperty("emplAmt")
    @JsonPropertyDescription("Lineage reference object : PTRFBEN_EMPL_AMT")
    private Double emplAmt;
    /**
     * Premium Amount
     * <p>
     * Lineage reference object : PTRFBEN_PREM_AMT
     * 
     */
    @JsonProperty("premAmt")
    @JsonPropertyDescription("Lineage reference object : PTRFBEN_PREM_AMT")
    private Double premAmt;
    /**
     * Lineage reference object : PTRFBEN_FSA_IND
     * 
     */
    @JsonProperty("fsaInd")
    @JsonPropertyDescription("Lineage reference object : PTRFBEN_FSA_IND")
    private String fsaInd;
    /**
     * Lineage reference object : PTRFBEN_FSA_GRACE_PERIOD_IND
     * 
     */
    @JsonProperty("fsaGracePeriodInd")
    @JsonPropertyDescription("Lineage reference object : PTRFBEN_FSA_GRACE_PERIOD_IND")
    private String fsaGracePeriodInd;
    /**
     * Deduction Frequency
     * <p>
     * Lineage reference object : PTRFBEN_DEDN_FREQ
     * (Required)
     * 
     */
    @JsonProperty("dednFreq")
    @JsonPropertyDescription("Lineage reference object : PTRFBEN_DEDN_FREQ")
    private Double dednFreq;
    /**
     * Plan Code
     * <p>
     * Lineage reference object : PTRFBEN_PLAN_CODE
     * 
     */
    @JsonProperty("planCode")
    @JsonPropertyDescription("Lineage reference object : PTRFBEN_PLAN_CODE")
    private String planCode;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Lineage reference object : PTRFBEN_AVAIL_IND
     * 
     */
    @JsonProperty("availInd")
    public String getAvailInd() {
        return availInd;
    }

    /**
     * Lineage reference object : PTRFBEN_AVAIL_IND
     * 
     */
    @JsonProperty("availInd")
    public void setAvailInd(String availInd) {
        this.availInd = availInd;
    }

    public FlexibleBenefitsRule100GetRequest withAvailInd(String availInd) {
        this.availInd = availInd;
        return this;
    }

    /**
     * Flexible Amount
     * <p>
     * Lineage reference object : PTRFBEN_FLEX_AMT
     * 
     */
    @JsonProperty("flexAmt")
    public Double getFlexAmt() {
        return flexAmt;
    }

    /**
     * Flexible Amount
     * <p>
     * Lineage reference object : PTRFBEN_FLEX_AMT
     * 
     */
    @JsonProperty("flexAmt")
    public void setFlexAmt(Double flexAmt) {
        this.flexAmt = flexAmt;
    }

    public FlexibleBenefitsRule100GetRequest withFlexAmt(Double flexAmt) {
        this.flexAmt = flexAmt;
        return this;
    }

    /**
     * Benefit or Deduction Code
     * <p>
     * Lineage reference object : PTRFBEN_BDCA_CODE
     * (Required)
     * 
     */
    @JsonProperty("bdcaCode")
    public String getBdcaCode() {
        return bdcaCode;
    }

    /**
     * Benefit or Deduction Code
     * <p>
     * Lineage reference object : PTRFBEN_BDCA_CODE
     * (Required)
     * 
     */
    @JsonProperty("bdcaCode")
    public void setBdcaCode(String bdcaCode) {
        this.bdcaCode = bdcaCode;
    }

    public FlexibleBenefitsRule100GetRequest withBdcaCode(String bdcaCode) {
        this.bdcaCode = bdcaCode;
        return this;
    }

    /**
     * Employee Amount
     * <p>
     * Lineage reference object : PTRFBEN_EMPL_AMT
     * 
     */
    @JsonProperty("emplAmt")
    public Double getEmplAmt() {
        return emplAmt;
    }

    /**
     * Employee Amount
     * <p>
     * Lineage reference object : PTRFBEN_EMPL_AMT
     * 
     */
    @JsonProperty("emplAmt")
    public void setEmplAmt(Double emplAmt) {
        this.emplAmt = emplAmt;
    }

    public FlexibleBenefitsRule100GetRequest withEmplAmt(Double emplAmt) {
        this.emplAmt = emplAmt;
        return this;
    }

    /**
     * Premium Amount
     * <p>
     * Lineage reference object : PTRFBEN_PREM_AMT
     * 
     */
    @JsonProperty("premAmt")
    public Double getPremAmt() {
        return premAmt;
    }

    /**
     * Premium Amount
     * <p>
     * Lineage reference object : PTRFBEN_PREM_AMT
     * 
     */
    @JsonProperty("premAmt")
    public void setPremAmt(Double premAmt) {
        this.premAmt = premAmt;
    }

    public FlexibleBenefitsRule100GetRequest withPremAmt(Double premAmt) {
        this.premAmt = premAmt;
        return this;
    }

    /**
     * Lineage reference object : PTRFBEN_FSA_IND
     * 
     */
    @JsonProperty("fsaInd")
    public String getFsaInd() {
        return fsaInd;
    }

    /**
     * Lineage reference object : PTRFBEN_FSA_IND
     * 
     */
    @JsonProperty("fsaInd")
    public void setFsaInd(String fsaInd) {
        this.fsaInd = fsaInd;
    }

    public FlexibleBenefitsRule100GetRequest withFsaInd(String fsaInd) {
        this.fsaInd = fsaInd;
        return this;
    }

    /**
     * Lineage reference object : PTRFBEN_FSA_GRACE_PERIOD_IND
     * 
     */
    @JsonProperty("fsaGracePeriodInd")
    public String getFsaGracePeriodInd() {
        return fsaGracePeriodInd;
    }

    /**
     * Lineage reference object : PTRFBEN_FSA_GRACE_PERIOD_IND
     * 
     */
    @JsonProperty("fsaGracePeriodInd")
    public void setFsaGracePeriodInd(String fsaGracePeriodInd) {
        this.fsaGracePeriodInd = fsaGracePeriodInd;
    }

    public FlexibleBenefitsRule100GetRequest withFsaGracePeriodInd(String fsaGracePeriodInd) {
        this.fsaGracePeriodInd = fsaGracePeriodInd;
        return this;
    }

    /**
     * Deduction Frequency
     * <p>
     * Lineage reference object : PTRFBEN_DEDN_FREQ
     * (Required)
     * 
     */
    @JsonProperty("dednFreq")
    public Double getDednFreq() {
        return dednFreq;
    }

    /**
     * Deduction Frequency
     * <p>
     * Lineage reference object : PTRFBEN_DEDN_FREQ
     * (Required)
     * 
     */
    @JsonProperty("dednFreq")
    public void setDednFreq(Double dednFreq) {
        this.dednFreq = dednFreq;
    }

    public FlexibleBenefitsRule100GetRequest withDednFreq(Double dednFreq) {
        this.dednFreq = dednFreq;
        return this;
    }

    /**
     * Plan Code
     * <p>
     * Lineage reference object : PTRFBEN_PLAN_CODE
     * 
     */
    @JsonProperty("planCode")
    public String getPlanCode() {
        return planCode;
    }

    /**
     * Plan Code
     * <p>
     * Lineage reference object : PTRFBEN_PLAN_CODE
     * 
     */
    @JsonProperty("planCode")
    public void setPlanCode(String planCode) {
        this.planCode = planCode;
    }

    public FlexibleBenefitsRule100GetRequest withPlanCode(String planCode) {
        this.planCode = planCode;
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

    public FlexibleBenefitsRule100GetRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(FlexibleBenefitsRule100GetRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("availInd");
        sb.append('=');
        sb.append(((this.availInd == null)?"<null>":this.availInd));
        sb.append(',');
        sb.append("flexAmt");
        sb.append('=');
        sb.append(((this.flexAmt == null)?"<null>":this.flexAmt));
        sb.append(',');
        sb.append("bdcaCode");
        sb.append('=');
        sb.append(((this.bdcaCode == null)?"<null>":this.bdcaCode));
        sb.append(',');
        sb.append("emplAmt");
        sb.append('=');
        sb.append(((this.emplAmt == null)?"<null>":this.emplAmt));
        sb.append(',');
        sb.append("premAmt");
        sb.append('=');
        sb.append(((this.premAmt == null)?"<null>":this.premAmt));
        sb.append(',');
        sb.append("fsaInd");
        sb.append('=');
        sb.append(((this.fsaInd == null)?"<null>":this.fsaInd));
        sb.append(',');
        sb.append("fsaGracePeriodInd");
        sb.append('=');
        sb.append(((this.fsaGracePeriodInd == null)?"<null>":this.fsaGracePeriodInd));
        sb.append(',');
        sb.append("dednFreq");
        sb.append('=');
        sb.append(((this.dednFreq == null)?"<null>":this.dednFreq));
        sb.append(',');
        sb.append("planCode");
        sb.append('=');
        sb.append(((this.planCode == null)?"<null>":this.planCode));
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
        result = ((result* 31)+((this.availInd == null)? 0 :this.availInd.hashCode()));
        result = ((result* 31)+((this.flexAmt == null)? 0 :this.flexAmt.hashCode()));
        result = ((result* 31)+((this.bdcaCode == null)? 0 :this.bdcaCode.hashCode()));
        result = ((result* 31)+((this.emplAmt == null)? 0 :this.emplAmt.hashCode()));
        result = ((result* 31)+((this.premAmt == null)? 0 :this.premAmt.hashCode()));
        result = ((result* 31)+((this.fsaInd == null)? 0 :this.fsaInd.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.fsaGracePeriodInd == null)? 0 :this.fsaGracePeriodInd.hashCode()));
        result = ((result* 31)+((this.dednFreq == null)? 0 :this.dednFreq.hashCode()));
        result = ((result* 31)+((this.planCode == null)? 0 :this.planCode.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof FlexibleBenefitsRule100GetRequest) == false) {
            return false;
        }
        FlexibleBenefitsRule100GetRequest rhs = ((FlexibleBenefitsRule100GetRequest) other);
        return (((((((((((this.availInd == rhs.availInd)||((this.availInd!= null)&&this.availInd.equals(rhs.availInd)))&&((this.flexAmt == rhs.flexAmt)||((this.flexAmt!= null)&&this.flexAmt.equals(rhs.flexAmt))))&&((this.bdcaCode == rhs.bdcaCode)||((this.bdcaCode!= null)&&this.bdcaCode.equals(rhs.bdcaCode))))&&((this.emplAmt == rhs.emplAmt)||((this.emplAmt!= null)&&this.emplAmt.equals(rhs.emplAmt))))&&((this.premAmt == rhs.premAmt)||((this.premAmt!= null)&&this.premAmt.equals(rhs.premAmt))))&&((this.fsaInd == rhs.fsaInd)||((this.fsaInd!= null)&&this.fsaInd.equals(rhs.fsaInd))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.fsaGracePeriodInd == rhs.fsaGracePeriodInd)||((this.fsaGracePeriodInd!= null)&&this.fsaGracePeriodInd.equals(rhs.fsaGracePeriodInd))))&&((this.dednFreq == rhs.dednFreq)||((this.dednFreq!= null)&&this.dednFreq.equals(rhs.dednFreq))))&&((this.planCode == rhs.planCode)||((this.planCode!= null)&&this.planCode.equals(rhs.planCode))));
    }

}
