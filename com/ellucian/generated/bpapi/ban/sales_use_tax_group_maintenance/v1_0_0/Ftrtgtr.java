
package com.ellucian.generated.bpapi.ban.sales_use_tax_group_maintenance.v1_0_0;

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
    "taxRatePriorityCode",
    "taxRatePercent",
    "taxRateTitle",
    "tratCode",
    "taxRateExemptPercent"
})
@Generated("jsonschema2pojo")
public class Ftrtgtr {

    /**
     * Priority Code
     * <p>
     * 
     * 
     */
    @JsonProperty("taxRatePriorityCode")
    private String taxRatePriorityCode;
    /**
     * Rate
     * <p>
     * 
     * 
     */
    @JsonProperty("taxRatePercent")
    private Double taxRatePercent;
    @JsonProperty("taxRateTitle")
    private String taxRateTitle;
    /**
     * Tax Code
     * <p>
     * Lineage reference object : FTRTGTR_TRAT_CODE, Lookup lineage reference object : ftvtrat
     * (Required)
     * 
     */
    @JsonProperty("tratCode")
    @JsonPropertyDescription("Lineage reference object : FTRTGTR_TRAT_CODE, Lookup lineage reference object : ftvtrat")
    private String tratCode;
    /**
     * Rebate Percent
     * <p>
     * 
     * 
     */
    @JsonProperty("taxRateExemptPercent")
    private String taxRateExemptPercent;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Priority Code
     * <p>
     * 
     * 
     */
    @JsonProperty("taxRatePriorityCode")
    public String getTaxRatePriorityCode() {
        return taxRatePriorityCode;
    }

    /**
     * Priority Code
     * <p>
     * 
     * 
     */
    @JsonProperty("taxRatePriorityCode")
    public void setTaxRatePriorityCode(String taxRatePriorityCode) {
        this.taxRatePriorityCode = taxRatePriorityCode;
    }

    public Ftrtgtr withTaxRatePriorityCode(String taxRatePriorityCode) {
        this.taxRatePriorityCode = taxRatePriorityCode;
        return this;
    }

    /**
     * Rate
     * <p>
     * 
     * 
     */
    @JsonProperty("taxRatePercent")
    public Double getTaxRatePercent() {
        return taxRatePercent;
    }

    /**
     * Rate
     * <p>
     * 
     * 
     */
    @JsonProperty("taxRatePercent")
    public void setTaxRatePercent(Double taxRatePercent) {
        this.taxRatePercent = taxRatePercent;
    }

    public Ftrtgtr withTaxRatePercent(Double taxRatePercent) {
        this.taxRatePercent = taxRatePercent;
        return this;
    }

    @JsonProperty("taxRateTitle")
    public String getTaxRateTitle() {
        return taxRateTitle;
    }

    @JsonProperty("taxRateTitle")
    public void setTaxRateTitle(String taxRateTitle) {
        this.taxRateTitle = taxRateTitle;
    }

    public Ftrtgtr withTaxRateTitle(String taxRateTitle) {
        this.taxRateTitle = taxRateTitle;
        return this;
    }

    /**
     * Tax Code
     * <p>
     * Lineage reference object : FTRTGTR_TRAT_CODE, Lookup lineage reference object : ftvtrat
     * (Required)
     * 
     */
    @JsonProperty("tratCode")
    public String getTratCode() {
        return tratCode;
    }

    /**
     * Tax Code
     * <p>
     * Lineage reference object : FTRTGTR_TRAT_CODE, Lookup lineage reference object : ftvtrat
     * (Required)
     * 
     */
    @JsonProperty("tratCode")
    public void setTratCode(String tratCode) {
        this.tratCode = tratCode;
    }

    public Ftrtgtr withTratCode(String tratCode) {
        this.tratCode = tratCode;
        return this;
    }

    /**
     * Rebate Percent
     * <p>
     * 
     * 
     */
    @JsonProperty("taxRateExemptPercent")
    public String getTaxRateExemptPercent() {
        return taxRateExemptPercent;
    }

    /**
     * Rebate Percent
     * <p>
     * 
     * 
     */
    @JsonProperty("taxRateExemptPercent")
    public void setTaxRateExemptPercent(String taxRateExemptPercent) {
        this.taxRateExemptPercent = taxRateExemptPercent;
    }

    public Ftrtgtr withTaxRateExemptPercent(String taxRateExemptPercent) {
        this.taxRateExemptPercent = taxRateExemptPercent;
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

    public Ftrtgtr withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Ftrtgtr.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("taxRatePriorityCode");
        sb.append('=');
        sb.append(((this.taxRatePriorityCode == null)?"<null>":this.taxRatePriorityCode));
        sb.append(',');
        sb.append("taxRatePercent");
        sb.append('=');
        sb.append(((this.taxRatePercent == null)?"<null>":this.taxRatePercent));
        sb.append(',');
        sb.append("taxRateTitle");
        sb.append('=');
        sb.append(((this.taxRateTitle == null)?"<null>":this.taxRateTitle));
        sb.append(',');
        sb.append("tratCode");
        sb.append('=');
        sb.append(((this.tratCode == null)?"<null>":this.tratCode));
        sb.append(',');
        sb.append("taxRateExemptPercent");
        sb.append('=');
        sb.append(((this.taxRateExemptPercent == null)?"<null>":this.taxRateExemptPercent));
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
        result = ((result* 31)+((this.taxRatePriorityCode == null)? 0 :this.taxRatePriorityCode.hashCode()));
        result = ((result* 31)+((this.taxRatePercent == null)? 0 :this.taxRatePercent.hashCode()));
        result = ((result* 31)+((this.taxRateTitle == null)? 0 :this.taxRateTitle.hashCode()));
        result = ((result* 31)+((this.tratCode == null)? 0 :this.tratCode.hashCode()));
        result = ((result* 31)+((this.taxRateExemptPercent == null)? 0 :this.taxRateExemptPercent.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Ftrtgtr) == false) {
            return false;
        }
        Ftrtgtr rhs = ((Ftrtgtr) other);
        return (((((((this.taxRatePriorityCode == rhs.taxRatePriorityCode)||((this.taxRatePriorityCode!= null)&&this.taxRatePriorityCode.equals(rhs.taxRatePriorityCode)))&&((this.taxRatePercent == rhs.taxRatePercent)||((this.taxRatePercent!= null)&&this.taxRatePercent.equals(rhs.taxRatePercent))))&&((this.taxRateTitle == rhs.taxRateTitle)||((this.taxRateTitle!= null)&&this.taxRateTitle.equals(rhs.taxRateTitle))))&&((this.tratCode == rhs.tratCode)||((this.tratCode!= null)&&this.tratCode.equals(rhs.tratCode))))&&((this.taxRateExemptPercent == rhs.taxRateExemptPercent)||((this.taxRateExemptPercent!= null)&&this.taxRateExemptPercent.equals(rhs.taxRateExemptPercent))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
    }

}
