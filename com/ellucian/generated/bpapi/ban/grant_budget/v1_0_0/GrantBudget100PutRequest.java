
package com.ellucian.generated.bpapi.ban.grant_budget.v1_0_0;

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
    "grntBudgDesc",
    "coasCodeDef",
    "endDate",
    "displayGrntBudgCode",
    "transDate",
    "coasCode",
    "yr",
    "displayGrntCode",
    "fundCodeDef",
    "orgnCodeDef",
    "progCodeDef",
    "typeCode"
})
@Generated("jsonschema2pojo")
public class GrantBudget100PutRequest {

    /**
     * Budget Description
     * <p>
     * Lineage reference object : FRBBUDG_GRNT_BUDG_DESC
     * (Required)
     * 
     */
    @JsonProperty("grntBudgDesc")
    @JsonPropertyDescription("Lineage reference object : FRBBUDG_GRNT_BUDG_DESC")
    private String grntBudgDesc;
    /**
     * Chart of Accounts
     * <p>
     * Lineage reference object : FRBBUDG_COAS_CODE_DEF, Lookup lineage reference object : ftvcoas
     * 
     */
    @JsonProperty("coasCodeDef")
    @JsonPropertyDescription("Lineage reference object : FRBBUDG_COAS_CODE_DEF, Lookup lineage reference object : ftvcoas")
    private String coasCodeDef;
    /**
     * End Date
     * <p>
     * Lineage reference object : FRBBUDG_END_DATE
     * 
     */
    @JsonProperty("endDate")
    @JsonPropertyDescription("Lineage reference object : FRBBUDG_END_DATE")
    private Date endDate;
    /**
     * Budget Code
     * <p>
     * Lineage reference object : displayGrntBudgCode, Lookup lineage reference object : frbbudg
     * 
     */
    @JsonProperty("displayGrntBudgCode")
    @JsonPropertyDescription("Lineage reference object : displayGrntBudgCode, Lookup lineage reference object : frbbudg")
    private Object displayGrntBudgCode;
    /**
     * Transaction Date
     * <p>
     * Lineage reference object : FRBBUDG_TRANS_DATE
     * (Required)
     * 
     */
    @JsonProperty("transDate")
    @JsonPropertyDescription("Lineage reference object : FRBBUDG_TRANS_DATE")
    private Date transDate;
    /**
     * Chart of Accounts
     * <p>
     * Lineage reference object : FRBBUDG_COAS_CODE, Lookup lineage reference object : ftvcoas
     * (Required)
     * 
     */
    @JsonProperty("coasCode")
    @JsonPropertyDescription("Lineage reference object : FRBBUDG_COAS_CODE, Lookup lineage reference object : ftvcoas")
    private String coasCode;
    /**
     * Year
     * <p>
     * Lineage reference object : FRBBUDG_YR
     * 
     */
    @JsonProperty("yr")
    @JsonPropertyDescription("Lineage reference object : FRBBUDG_YR")
    private String yr;
    /**
     * Grant
     * <p>
     * Lineage reference object : displayGrntCode
     * 
     */
    @JsonProperty("displayGrntCode")
    @JsonPropertyDescription("Lineage reference object : displayGrntCode")
    private Object displayGrntCode;
    /**
     * Fund
     * <p>
     * Lineage reference object : FRBBUDG_FUND_CODE_DEF
     * 
     */
    @JsonProperty("fundCodeDef")
    @JsonPropertyDescription("Lineage reference object : FRBBUDG_FUND_CODE_DEF")
    private String fundCodeDef;
    /**
     * Organization
     * <p>
     * Lineage reference object : FRBBUDG_ORGN_CODE_DEF
     * 
     */
    @JsonProperty("orgnCodeDef")
    @JsonPropertyDescription("Lineage reference object : FRBBUDG_ORGN_CODE_DEF")
    private String orgnCodeDef;
    /**
     * Program
     * <p>
     * Lineage reference object : FRBBUDG_PROG_CODE_DEF
     * 
     */
    @JsonProperty("progCodeDef")
    @JsonPropertyDescription("Lineage reference object : FRBBUDG_PROG_CODE_DEF")
    private String progCodeDef;
    /**
     * Type
     * <p>
     * Lineage reference object : FRBBUDG_TYPE_CODE
     * (Required)
     * 
     */
    @JsonProperty("typeCode")
    @JsonPropertyDescription("Lineage reference object : FRBBUDG_TYPE_CODE")
    private String typeCode;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Budget Description
     * <p>
     * Lineage reference object : FRBBUDG_GRNT_BUDG_DESC
     * (Required)
     * 
     */
    @JsonProperty("grntBudgDesc")
    public String getGrntBudgDesc() {
        return grntBudgDesc;
    }

    /**
     * Budget Description
     * <p>
     * Lineage reference object : FRBBUDG_GRNT_BUDG_DESC
     * (Required)
     * 
     */
    @JsonProperty("grntBudgDesc")
    public void setGrntBudgDesc(String grntBudgDesc) {
        this.grntBudgDesc = grntBudgDesc;
    }

    public GrantBudget100PutRequest withGrntBudgDesc(String grntBudgDesc) {
        this.grntBudgDesc = grntBudgDesc;
        return this;
    }

    /**
     * Chart of Accounts
     * <p>
     * Lineage reference object : FRBBUDG_COAS_CODE_DEF, Lookup lineage reference object : ftvcoas
     * 
     */
    @JsonProperty("coasCodeDef")
    public String getCoasCodeDef() {
        return coasCodeDef;
    }

    /**
     * Chart of Accounts
     * <p>
     * Lineage reference object : FRBBUDG_COAS_CODE_DEF, Lookup lineage reference object : ftvcoas
     * 
     */
    @JsonProperty("coasCodeDef")
    public void setCoasCodeDef(String coasCodeDef) {
        this.coasCodeDef = coasCodeDef;
    }

    public GrantBudget100PutRequest withCoasCodeDef(String coasCodeDef) {
        this.coasCodeDef = coasCodeDef;
        return this;
    }

    /**
     * End Date
     * <p>
     * Lineage reference object : FRBBUDG_END_DATE
     * 
     */
    @JsonProperty("endDate")
    public Date getEndDate() {
        return endDate;
    }

    /**
     * End Date
     * <p>
     * Lineage reference object : FRBBUDG_END_DATE
     * 
     */
    @JsonProperty("endDate")
    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public GrantBudget100PutRequest withEndDate(Date endDate) {
        this.endDate = endDate;
        return this;
    }

    /**
     * Budget Code
     * <p>
     * Lineage reference object : displayGrntBudgCode, Lookup lineage reference object : frbbudg
     * 
     */
    @JsonProperty("displayGrntBudgCode")
    public Object getDisplayGrntBudgCode() {
        return displayGrntBudgCode;
    }

    /**
     * Budget Code
     * <p>
     * Lineage reference object : displayGrntBudgCode, Lookup lineage reference object : frbbudg
     * 
     */
    @JsonProperty("displayGrntBudgCode")
    public void setDisplayGrntBudgCode(Object displayGrntBudgCode) {
        this.displayGrntBudgCode = displayGrntBudgCode;
    }

    public GrantBudget100PutRequest withDisplayGrntBudgCode(Object displayGrntBudgCode) {
        this.displayGrntBudgCode = displayGrntBudgCode;
        return this;
    }

    /**
     * Transaction Date
     * <p>
     * Lineage reference object : FRBBUDG_TRANS_DATE
     * (Required)
     * 
     */
    @JsonProperty("transDate")
    public Date getTransDate() {
        return transDate;
    }

    /**
     * Transaction Date
     * <p>
     * Lineage reference object : FRBBUDG_TRANS_DATE
     * (Required)
     * 
     */
    @JsonProperty("transDate")
    public void setTransDate(Date transDate) {
        this.transDate = transDate;
    }

    public GrantBudget100PutRequest withTransDate(Date transDate) {
        this.transDate = transDate;
        return this;
    }

    /**
     * Chart of Accounts
     * <p>
     * Lineage reference object : FRBBUDG_COAS_CODE, Lookup lineage reference object : ftvcoas
     * (Required)
     * 
     */
    @JsonProperty("coasCode")
    public String getCoasCode() {
        return coasCode;
    }

    /**
     * Chart of Accounts
     * <p>
     * Lineage reference object : FRBBUDG_COAS_CODE, Lookup lineage reference object : ftvcoas
     * (Required)
     * 
     */
    @JsonProperty("coasCode")
    public void setCoasCode(String coasCode) {
        this.coasCode = coasCode;
    }

    public GrantBudget100PutRequest withCoasCode(String coasCode) {
        this.coasCode = coasCode;
        return this;
    }

    /**
     * Year
     * <p>
     * Lineage reference object : FRBBUDG_YR
     * 
     */
    @JsonProperty("yr")
    public String getYr() {
        return yr;
    }

    /**
     * Year
     * <p>
     * Lineage reference object : FRBBUDG_YR
     * 
     */
    @JsonProperty("yr")
    public void setYr(String yr) {
        this.yr = yr;
    }

    public GrantBudget100PutRequest withYr(String yr) {
        this.yr = yr;
        return this;
    }

    /**
     * Grant
     * <p>
     * Lineage reference object : displayGrntCode
     * 
     */
    @JsonProperty("displayGrntCode")
    public Object getDisplayGrntCode() {
        return displayGrntCode;
    }

    /**
     * Grant
     * <p>
     * Lineage reference object : displayGrntCode
     * 
     */
    @JsonProperty("displayGrntCode")
    public void setDisplayGrntCode(Object displayGrntCode) {
        this.displayGrntCode = displayGrntCode;
    }

    public GrantBudget100PutRequest withDisplayGrntCode(Object displayGrntCode) {
        this.displayGrntCode = displayGrntCode;
        return this;
    }

    /**
     * Fund
     * <p>
     * Lineage reference object : FRBBUDG_FUND_CODE_DEF
     * 
     */
    @JsonProperty("fundCodeDef")
    public String getFundCodeDef() {
        return fundCodeDef;
    }

    /**
     * Fund
     * <p>
     * Lineage reference object : FRBBUDG_FUND_CODE_DEF
     * 
     */
    @JsonProperty("fundCodeDef")
    public void setFundCodeDef(String fundCodeDef) {
        this.fundCodeDef = fundCodeDef;
    }

    public GrantBudget100PutRequest withFundCodeDef(String fundCodeDef) {
        this.fundCodeDef = fundCodeDef;
        return this;
    }

    /**
     * Organization
     * <p>
     * Lineage reference object : FRBBUDG_ORGN_CODE_DEF
     * 
     */
    @JsonProperty("orgnCodeDef")
    public String getOrgnCodeDef() {
        return orgnCodeDef;
    }

    /**
     * Organization
     * <p>
     * Lineage reference object : FRBBUDG_ORGN_CODE_DEF
     * 
     */
    @JsonProperty("orgnCodeDef")
    public void setOrgnCodeDef(String orgnCodeDef) {
        this.orgnCodeDef = orgnCodeDef;
    }

    public GrantBudget100PutRequest withOrgnCodeDef(String orgnCodeDef) {
        this.orgnCodeDef = orgnCodeDef;
        return this;
    }

    /**
     * Program
     * <p>
     * Lineage reference object : FRBBUDG_PROG_CODE_DEF
     * 
     */
    @JsonProperty("progCodeDef")
    public String getProgCodeDef() {
        return progCodeDef;
    }

    /**
     * Program
     * <p>
     * Lineage reference object : FRBBUDG_PROG_CODE_DEF
     * 
     */
    @JsonProperty("progCodeDef")
    public void setProgCodeDef(String progCodeDef) {
        this.progCodeDef = progCodeDef;
    }

    public GrantBudget100PutRequest withProgCodeDef(String progCodeDef) {
        this.progCodeDef = progCodeDef;
        return this;
    }

    /**
     * Type
     * <p>
     * Lineage reference object : FRBBUDG_TYPE_CODE
     * (Required)
     * 
     */
    @JsonProperty("typeCode")
    public String getTypeCode() {
        return typeCode;
    }

    /**
     * Type
     * <p>
     * Lineage reference object : FRBBUDG_TYPE_CODE
     * (Required)
     * 
     */
    @JsonProperty("typeCode")
    public void setTypeCode(String typeCode) {
        this.typeCode = typeCode;
    }

    public GrantBudget100PutRequest withTypeCode(String typeCode) {
        this.typeCode = typeCode;
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

    public GrantBudget100PutRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(GrantBudget100PutRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("grntBudgDesc");
        sb.append('=');
        sb.append(((this.grntBudgDesc == null)?"<null>":this.grntBudgDesc));
        sb.append(',');
        sb.append("coasCodeDef");
        sb.append('=');
        sb.append(((this.coasCodeDef == null)?"<null>":this.coasCodeDef));
        sb.append(',');
        sb.append("endDate");
        sb.append('=');
        sb.append(((this.endDate == null)?"<null>":this.endDate));
        sb.append(',');
        sb.append("displayGrntBudgCode");
        sb.append('=');
        sb.append(((this.displayGrntBudgCode == null)?"<null>":this.displayGrntBudgCode));
        sb.append(',');
        sb.append("transDate");
        sb.append('=');
        sb.append(((this.transDate == null)?"<null>":this.transDate));
        sb.append(',');
        sb.append("coasCode");
        sb.append('=');
        sb.append(((this.coasCode == null)?"<null>":this.coasCode));
        sb.append(',');
        sb.append("yr");
        sb.append('=');
        sb.append(((this.yr == null)?"<null>":this.yr));
        sb.append(',');
        sb.append("displayGrntCode");
        sb.append('=');
        sb.append(((this.displayGrntCode == null)?"<null>":this.displayGrntCode));
        sb.append(',');
        sb.append("fundCodeDef");
        sb.append('=');
        sb.append(((this.fundCodeDef == null)?"<null>":this.fundCodeDef));
        sb.append(',');
        sb.append("orgnCodeDef");
        sb.append('=');
        sb.append(((this.orgnCodeDef == null)?"<null>":this.orgnCodeDef));
        sb.append(',');
        sb.append("progCodeDef");
        sb.append('=');
        sb.append(((this.progCodeDef == null)?"<null>":this.progCodeDef));
        sb.append(',');
        sb.append("typeCode");
        sb.append('=');
        sb.append(((this.typeCode == null)?"<null>":this.typeCode));
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
        result = ((result* 31)+((this.grntBudgDesc == null)? 0 :this.grntBudgDesc.hashCode()));
        result = ((result* 31)+((this.coasCodeDef == null)? 0 :this.coasCodeDef.hashCode()));
        result = ((result* 31)+((this.endDate == null)? 0 :this.endDate.hashCode()));
        result = ((result* 31)+((this.displayGrntBudgCode == null)? 0 :this.displayGrntBudgCode.hashCode()));
        result = ((result* 31)+((this.coasCode == null)? 0 :this.coasCode.hashCode()));
        result = ((result* 31)+((this.orgnCodeDef == null)? 0 :this.orgnCodeDef.hashCode()));
        result = ((result* 31)+((this.typeCode == null)? 0 :this.typeCode.hashCode()));
        result = ((result* 31)+((this.transDate == null)? 0 :this.transDate.hashCode()));
        result = ((result* 31)+((this.yr == null)? 0 :this.yr.hashCode()));
        result = ((result* 31)+((this.displayGrntCode == null)? 0 :this.displayGrntCode.hashCode()));
        result = ((result* 31)+((this.fundCodeDef == null)? 0 :this.fundCodeDef.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.progCodeDef == null)? 0 :this.progCodeDef.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof GrantBudget100PutRequest) == false) {
            return false;
        }
        GrantBudget100PutRequest rhs = ((GrantBudget100PutRequest) other);
        return ((((((((((((((this.grntBudgDesc == rhs.grntBudgDesc)||((this.grntBudgDesc!= null)&&this.grntBudgDesc.equals(rhs.grntBudgDesc)))&&((this.coasCodeDef == rhs.coasCodeDef)||((this.coasCodeDef!= null)&&this.coasCodeDef.equals(rhs.coasCodeDef))))&&((this.endDate == rhs.endDate)||((this.endDate!= null)&&this.endDate.equals(rhs.endDate))))&&((this.displayGrntBudgCode == rhs.displayGrntBudgCode)||((this.displayGrntBudgCode!= null)&&this.displayGrntBudgCode.equals(rhs.displayGrntBudgCode))))&&((this.coasCode == rhs.coasCode)||((this.coasCode!= null)&&this.coasCode.equals(rhs.coasCode))))&&((this.orgnCodeDef == rhs.orgnCodeDef)||((this.orgnCodeDef!= null)&&this.orgnCodeDef.equals(rhs.orgnCodeDef))))&&((this.typeCode == rhs.typeCode)||((this.typeCode!= null)&&this.typeCode.equals(rhs.typeCode))))&&((this.transDate == rhs.transDate)||((this.transDate!= null)&&this.transDate.equals(rhs.transDate))))&&((this.yr == rhs.yr)||((this.yr!= null)&&this.yr.equals(rhs.yr))))&&((this.displayGrntCode == rhs.displayGrntCode)||((this.displayGrntCode!= null)&&this.displayGrntCode.equals(rhs.displayGrntCode))))&&((this.fundCodeDef == rhs.fundCodeDef)||((this.fundCodeDef!= null)&&this.fundCodeDef.equals(rhs.fundCodeDef))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.progCodeDef == rhs.progCodeDef)||((this.progCodeDef!= null)&&this.progCodeDef.equals(rhs.progCodeDef))));
    }

}
