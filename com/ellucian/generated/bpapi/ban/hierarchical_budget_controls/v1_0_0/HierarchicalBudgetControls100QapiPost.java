
package com.ellucian.generated.bpapi.ban.hierarchical_budget_controls.v1_0_0;

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
    "bavlPeriod",
    "bavlSeverity",
    "coasCode",
    "effDate",
    "fundCode",
    "fundCodeBavl",
    "orgnCode",
    "orgnCodeBavl",
    "statusInd",
    "termDate"
})
@Generated("jsonschema2pojo")
public class HierarchicalBudgetControls100QapiPost {

    /**
     * Prd
     * <p>
     * Lineage reference object : FTVHBUD_BAVL_PERIOD
     * 
     */
    @JsonProperty("bavlPeriod")
    @JsonPropertyDescription("Lineage reference object : FTVHBUD_BAVL_PERIOD")
    private String bavlPeriod;
    /**
     * Sev
     * <p>
     * Lineage reference object : FTVHBUD_BAVL_SEVERITY
     * 
     */
    @JsonProperty("bavlSeverity")
    @JsonPropertyDescription("Lineage reference object : FTVHBUD_BAVL_SEVERITY")
    private String bavlSeverity;
    /**
     * COA
     * <p>
     * Lineage reference object : FTVHBUD_COAS_CODE, Lookup lineage reference object : ftvcoas
     * 
     */
    @JsonProperty("coasCode")
    @JsonPropertyDescription("Lineage reference object : FTVHBUD_COAS_CODE, Lookup lineage reference object : ftvcoas")
    private String coasCode;
    /**
     * Effective
     * Date
     * <p>
     * Lineage reference object : FTVHBUD_EFF_DATE
     * 
     */
    @JsonProperty("effDate")
    @JsonPropertyDescription("Lineage reference object : FTVHBUD_EFF_DATE")
    private Date effDate;
    /**
     * Fund
     * <p>
     * Lineage reference object : FTVHBUD_FUND_CODE
     * 
     */
    @JsonProperty("fundCode")
    @JsonPropertyDescription("Lineage reference object : FTVHBUD_FUND_CODE")
    private String fundCode;
    /**
     * Fund
     * <p>
     * Lineage reference object : FTVHBUD_FUND_CODE_BAVL
     * 
     */
    @JsonProperty("fundCodeBavl")
    @JsonPropertyDescription("Lineage reference object : FTVHBUD_FUND_CODE_BAVL")
    private String fundCodeBavl;
    /**
     * Orgn
     * <p>
     * Lineage reference object : FTVHBUD_ORGN_CODE
     * 
     */
    @JsonProperty("orgnCode")
    @JsonPropertyDescription("Lineage reference object : FTVHBUD_ORGN_CODE")
    private String orgnCode;
    /**
     * Orgn
     * <p>
     * Lineage reference object : FTVHBUD_ORGN_CODE_BAVL
     * 
     */
    @JsonProperty("orgnCodeBavl")
    @JsonPropertyDescription("Lineage reference object : FTVHBUD_ORGN_CODE_BAVL")
    private String orgnCodeBavl;
    /**
     * Status
     * <p>
     * Lineage reference object : FTVHBUD_STATUS_IND
     * 
     */
    @JsonProperty("statusInd")
    @JsonPropertyDescription("Lineage reference object : FTVHBUD_STATUS_IND")
    private String statusInd;
    /**
     * Termination
     * Date
     * <p>
     * Lineage reference object : FTVHBUD_TERM_DATE
     * 
     */
    @JsonProperty("termDate")
    @JsonPropertyDescription("Lineage reference object : FTVHBUD_TERM_DATE")
    private Date termDate;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Prd
     * <p>
     * Lineage reference object : FTVHBUD_BAVL_PERIOD
     * 
     */
    @JsonProperty("bavlPeriod")
    public String getBavlPeriod() {
        return bavlPeriod;
    }

    /**
     * Prd
     * <p>
     * Lineage reference object : FTVHBUD_BAVL_PERIOD
     * 
     */
    @JsonProperty("bavlPeriod")
    public void setBavlPeriod(String bavlPeriod) {
        this.bavlPeriod = bavlPeriod;
    }

    public HierarchicalBudgetControls100QapiPost withBavlPeriod(String bavlPeriod) {
        this.bavlPeriod = bavlPeriod;
        return this;
    }

    /**
     * Sev
     * <p>
     * Lineage reference object : FTVHBUD_BAVL_SEVERITY
     * 
     */
    @JsonProperty("bavlSeverity")
    public String getBavlSeverity() {
        return bavlSeverity;
    }

    /**
     * Sev
     * <p>
     * Lineage reference object : FTVHBUD_BAVL_SEVERITY
     * 
     */
    @JsonProperty("bavlSeverity")
    public void setBavlSeverity(String bavlSeverity) {
        this.bavlSeverity = bavlSeverity;
    }

    public HierarchicalBudgetControls100QapiPost withBavlSeverity(String bavlSeverity) {
        this.bavlSeverity = bavlSeverity;
        return this;
    }

    /**
     * COA
     * <p>
     * Lineage reference object : FTVHBUD_COAS_CODE, Lookup lineage reference object : ftvcoas
     * 
     */
    @JsonProperty("coasCode")
    public String getCoasCode() {
        return coasCode;
    }

    /**
     * COA
     * <p>
     * Lineage reference object : FTVHBUD_COAS_CODE, Lookup lineage reference object : ftvcoas
     * 
     */
    @JsonProperty("coasCode")
    public void setCoasCode(String coasCode) {
        this.coasCode = coasCode;
    }

    public HierarchicalBudgetControls100QapiPost withCoasCode(String coasCode) {
        this.coasCode = coasCode;
        return this;
    }

    /**
     * Effective
     * Date
     * <p>
     * Lineage reference object : FTVHBUD_EFF_DATE
     * 
     */
    @JsonProperty("effDate")
    public Date getEffDate() {
        return effDate;
    }

    /**
     * Effective
     * Date
     * <p>
     * Lineage reference object : FTVHBUD_EFF_DATE
     * 
     */
    @JsonProperty("effDate")
    public void setEffDate(Date effDate) {
        this.effDate = effDate;
    }

    public HierarchicalBudgetControls100QapiPost withEffDate(Date effDate) {
        this.effDate = effDate;
        return this;
    }

    /**
     * Fund
     * <p>
     * Lineage reference object : FTVHBUD_FUND_CODE
     * 
     */
    @JsonProperty("fundCode")
    public String getFundCode() {
        return fundCode;
    }

    /**
     * Fund
     * <p>
     * Lineage reference object : FTVHBUD_FUND_CODE
     * 
     */
    @JsonProperty("fundCode")
    public void setFundCode(String fundCode) {
        this.fundCode = fundCode;
    }

    public HierarchicalBudgetControls100QapiPost withFundCode(String fundCode) {
        this.fundCode = fundCode;
        return this;
    }

    /**
     * Fund
     * <p>
     * Lineage reference object : FTVHBUD_FUND_CODE_BAVL
     * 
     */
    @JsonProperty("fundCodeBavl")
    public String getFundCodeBavl() {
        return fundCodeBavl;
    }

    /**
     * Fund
     * <p>
     * Lineage reference object : FTVHBUD_FUND_CODE_BAVL
     * 
     */
    @JsonProperty("fundCodeBavl")
    public void setFundCodeBavl(String fundCodeBavl) {
        this.fundCodeBavl = fundCodeBavl;
    }

    public HierarchicalBudgetControls100QapiPost withFundCodeBavl(String fundCodeBavl) {
        this.fundCodeBavl = fundCodeBavl;
        return this;
    }

    /**
     * Orgn
     * <p>
     * Lineage reference object : FTVHBUD_ORGN_CODE
     * 
     */
    @JsonProperty("orgnCode")
    public String getOrgnCode() {
        return orgnCode;
    }

    /**
     * Orgn
     * <p>
     * Lineage reference object : FTVHBUD_ORGN_CODE
     * 
     */
    @JsonProperty("orgnCode")
    public void setOrgnCode(String orgnCode) {
        this.orgnCode = orgnCode;
    }

    public HierarchicalBudgetControls100QapiPost withOrgnCode(String orgnCode) {
        this.orgnCode = orgnCode;
        return this;
    }

    /**
     * Orgn
     * <p>
     * Lineage reference object : FTVHBUD_ORGN_CODE_BAVL
     * 
     */
    @JsonProperty("orgnCodeBavl")
    public String getOrgnCodeBavl() {
        return orgnCodeBavl;
    }

    /**
     * Orgn
     * <p>
     * Lineage reference object : FTVHBUD_ORGN_CODE_BAVL
     * 
     */
    @JsonProperty("orgnCodeBavl")
    public void setOrgnCodeBavl(String orgnCodeBavl) {
        this.orgnCodeBavl = orgnCodeBavl;
    }

    public HierarchicalBudgetControls100QapiPost withOrgnCodeBavl(String orgnCodeBavl) {
        this.orgnCodeBavl = orgnCodeBavl;
        return this;
    }

    /**
     * Status
     * <p>
     * Lineage reference object : FTVHBUD_STATUS_IND
     * 
     */
    @JsonProperty("statusInd")
    public String getStatusInd() {
        return statusInd;
    }

    /**
     * Status
     * <p>
     * Lineage reference object : FTVHBUD_STATUS_IND
     * 
     */
    @JsonProperty("statusInd")
    public void setStatusInd(String statusInd) {
        this.statusInd = statusInd;
    }

    public HierarchicalBudgetControls100QapiPost withStatusInd(String statusInd) {
        this.statusInd = statusInd;
        return this;
    }

    /**
     * Termination
     * Date
     * <p>
     * Lineage reference object : FTVHBUD_TERM_DATE
     * 
     */
    @JsonProperty("termDate")
    public Date getTermDate() {
        return termDate;
    }

    /**
     * Termination
     * Date
     * <p>
     * Lineage reference object : FTVHBUD_TERM_DATE
     * 
     */
    @JsonProperty("termDate")
    public void setTermDate(Date termDate) {
        this.termDate = termDate;
    }

    public HierarchicalBudgetControls100QapiPost withTermDate(Date termDate) {
        this.termDate = termDate;
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

    public HierarchicalBudgetControls100QapiPost withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(HierarchicalBudgetControls100QapiPost.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("bavlPeriod");
        sb.append('=');
        sb.append(((this.bavlPeriod == null)?"<null>":this.bavlPeriod));
        sb.append(',');
        sb.append("bavlSeverity");
        sb.append('=');
        sb.append(((this.bavlSeverity == null)?"<null>":this.bavlSeverity));
        sb.append(',');
        sb.append("coasCode");
        sb.append('=');
        sb.append(((this.coasCode == null)?"<null>":this.coasCode));
        sb.append(',');
        sb.append("effDate");
        sb.append('=');
        sb.append(((this.effDate == null)?"<null>":this.effDate));
        sb.append(',');
        sb.append("fundCode");
        sb.append('=');
        sb.append(((this.fundCode == null)?"<null>":this.fundCode));
        sb.append(',');
        sb.append("fundCodeBavl");
        sb.append('=');
        sb.append(((this.fundCodeBavl == null)?"<null>":this.fundCodeBavl));
        sb.append(',');
        sb.append("orgnCode");
        sb.append('=');
        sb.append(((this.orgnCode == null)?"<null>":this.orgnCode));
        sb.append(',');
        sb.append("orgnCodeBavl");
        sb.append('=');
        sb.append(((this.orgnCodeBavl == null)?"<null>":this.orgnCodeBavl));
        sb.append(',');
        sb.append("statusInd");
        sb.append('=');
        sb.append(((this.statusInd == null)?"<null>":this.statusInd));
        sb.append(',');
        sb.append("termDate");
        sb.append('=');
        sb.append(((this.termDate == null)?"<null>":this.termDate));
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
        result = ((result* 31)+((this.effDate == null)? 0 :this.effDate.hashCode()));
        result = ((result* 31)+((this.orgnCodeBavl == null)? 0 :this.orgnCodeBavl.hashCode()));
        result = ((result* 31)+((this.fundCode == null)? 0 :this.fundCode.hashCode()));
        result = ((result* 31)+((this.statusInd == null)? 0 :this.statusInd.hashCode()));
        result = ((result* 31)+((this.bavlPeriod == null)? 0 :this.bavlPeriod.hashCode()));
        result = ((result* 31)+((this.coasCode == null)? 0 :this.coasCode.hashCode()));
        result = ((result* 31)+((this.fundCodeBavl == null)? 0 :this.fundCodeBavl.hashCode()));
        result = ((result* 31)+((this.bavlSeverity == null)? 0 :this.bavlSeverity.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.termDate == null)? 0 :this.termDate.hashCode()));
        result = ((result* 31)+((this.orgnCode == null)? 0 :this.orgnCode.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof HierarchicalBudgetControls100QapiPost) == false) {
            return false;
        }
        HierarchicalBudgetControls100QapiPost rhs = ((HierarchicalBudgetControls100QapiPost) other);
        return ((((((((((((this.effDate == rhs.effDate)||((this.effDate!= null)&&this.effDate.equals(rhs.effDate)))&&((this.orgnCodeBavl == rhs.orgnCodeBavl)||((this.orgnCodeBavl!= null)&&this.orgnCodeBavl.equals(rhs.orgnCodeBavl))))&&((this.fundCode == rhs.fundCode)||((this.fundCode!= null)&&this.fundCode.equals(rhs.fundCode))))&&((this.statusInd == rhs.statusInd)||((this.statusInd!= null)&&this.statusInd.equals(rhs.statusInd))))&&((this.bavlPeriod == rhs.bavlPeriod)||((this.bavlPeriod!= null)&&this.bavlPeriod.equals(rhs.bavlPeriod))))&&((this.coasCode == rhs.coasCode)||((this.coasCode!= null)&&this.coasCode.equals(rhs.coasCode))))&&((this.fundCodeBavl == rhs.fundCodeBavl)||((this.fundCodeBavl!= null)&&this.fundCodeBavl.equals(rhs.fundCodeBavl))))&&((this.bavlSeverity == rhs.bavlSeverity)||((this.bavlSeverity!= null)&&this.bavlSeverity.equals(rhs.bavlSeverity))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.termDate == rhs.termDate)||((this.termDate!= null)&&this.termDate.equals(rhs.termDate))))&&((this.orgnCode == rhs.orgnCode)||((this.orgnCode!= null)&&this.orgnCode.equals(rhs.orgnCode))));
    }

}
