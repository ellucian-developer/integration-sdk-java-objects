
package com.ellucian.generated.bpapi.ban.student_course_fee_assessment_query.v1_0_0;

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
    "estsCode",
    "estsDate",
    "sfbrfstTuitRefund",
    "stvestsDesc",
    "sfbrfstFeesRefund"
})
@Generated("jsonschema2pojo")
public class Sfbetrm {

    /**
     * Status
     * <p>
     * Lineage reference object : SFBETRM_ESTS_CODE, Lookup lineage reference object : stvests
     * 
     */
    @JsonProperty("estsCode")
    @JsonPropertyDescription("Lineage reference object : SFBETRM_ESTS_CODE, Lookup lineage reference object : stvests")
    private String estsCode;
    /**
     * Status Date
     * <p>
     * Lineage reference object : SFBETRM_ESTS_DATE
     * 
     */
    @JsonProperty("estsDate")
    @JsonPropertyDescription("Lineage reference object : SFBETRM_ESTS_DATE")
    private Date estsDate;
    /**
     * Percentage Tuition Refund
     * <p>
     * 
     * 
     */
    @JsonProperty("sfbrfstTuitRefund")
    private Double sfbrfstTuitRefund;
    /**
     * Description
     * <p>
     * 
     * 
     */
    @JsonProperty("stvestsDesc")
    private String stvestsDesc;
    /**
     * Percentage Fee Refund
     * <p>
     * 
     * 
     */
    @JsonProperty("sfbrfstFeesRefund")
    private Double sfbrfstFeesRefund;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Status
     * <p>
     * Lineage reference object : SFBETRM_ESTS_CODE, Lookup lineage reference object : stvests
     * 
     */
    @JsonProperty("estsCode")
    public String getEstsCode() {
        return estsCode;
    }

    /**
     * Status
     * <p>
     * Lineage reference object : SFBETRM_ESTS_CODE, Lookup lineage reference object : stvests
     * 
     */
    @JsonProperty("estsCode")
    public void setEstsCode(String estsCode) {
        this.estsCode = estsCode;
    }

    public Sfbetrm withEstsCode(String estsCode) {
        this.estsCode = estsCode;
        return this;
    }

    /**
     * Status Date
     * <p>
     * Lineage reference object : SFBETRM_ESTS_DATE
     * 
     */
    @JsonProperty("estsDate")
    public Date getEstsDate() {
        return estsDate;
    }

    /**
     * Status Date
     * <p>
     * Lineage reference object : SFBETRM_ESTS_DATE
     * 
     */
    @JsonProperty("estsDate")
    public void setEstsDate(Date estsDate) {
        this.estsDate = estsDate;
    }

    public Sfbetrm withEstsDate(Date estsDate) {
        this.estsDate = estsDate;
        return this;
    }

    /**
     * Percentage Tuition Refund
     * <p>
     * 
     * 
     */
    @JsonProperty("sfbrfstTuitRefund")
    public Double getSfbrfstTuitRefund() {
        return sfbrfstTuitRefund;
    }

    /**
     * Percentage Tuition Refund
     * <p>
     * 
     * 
     */
    @JsonProperty("sfbrfstTuitRefund")
    public void setSfbrfstTuitRefund(Double sfbrfstTuitRefund) {
        this.sfbrfstTuitRefund = sfbrfstTuitRefund;
    }

    public Sfbetrm withSfbrfstTuitRefund(Double sfbrfstTuitRefund) {
        this.sfbrfstTuitRefund = sfbrfstTuitRefund;
        return this;
    }

    /**
     * Description
     * <p>
     * 
     * 
     */
    @JsonProperty("stvestsDesc")
    public String getStvestsDesc() {
        return stvestsDesc;
    }

    /**
     * Description
     * <p>
     * 
     * 
     */
    @JsonProperty("stvestsDesc")
    public void setStvestsDesc(String stvestsDesc) {
        this.stvestsDesc = stvestsDesc;
    }

    public Sfbetrm withStvestsDesc(String stvestsDesc) {
        this.stvestsDesc = stvestsDesc;
        return this;
    }

    /**
     * Percentage Fee Refund
     * <p>
     * 
     * 
     */
    @JsonProperty("sfbrfstFeesRefund")
    public Double getSfbrfstFeesRefund() {
        return sfbrfstFeesRefund;
    }

    /**
     * Percentage Fee Refund
     * <p>
     * 
     * 
     */
    @JsonProperty("sfbrfstFeesRefund")
    public void setSfbrfstFeesRefund(Double sfbrfstFeesRefund) {
        this.sfbrfstFeesRefund = sfbrfstFeesRefund;
    }

    public Sfbetrm withSfbrfstFeesRefund(Double sfbrfstFeesRefund) {
        this.sfbrfstFeesRefund = sfbrfstFeesRefund;
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

    public Sfbetrm withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Sfbetrm.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("estsCode");
        sb.append('=');
        sb.append(((this.estsCode == null)?"<null>":this.estsCode));
        sb.append(',');
        sb.append("estsDate");
        sb.append('=');
        sb.append(((this.estsDate == null)?"<null>":this.estsDate));
        sb.append(',');
        sb.append("sfbrfstTuitRefund");
        sb.append('=');
        sb.append(((this.sfbrfstTuitRefund == null)?"<null>":this.sfbrfstTuitRefund));
        sb.append(',');
        sb.append("stvestsDesc");
        sb.append('=');
        sb.append(((this.stvestsDesc == null)?"<null>":this.stvestsDesc));
        sb.append(',');
        sb.append("sfbrfstFeesRefund");
        sb.append('=');
        sb.append(((this.sfbrfstFeesRefund == null)?"<null>":this.sfbrfstFeesRefund));
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
        result = ((result* 31)+((this.estsCode == null)? 0 :this.estsCode.hashCode()));
        result = ((result* 31)+((this.estsDate == null)? 0 :this.estsDate.hashCode()));
        result = ((result* 31)+((this.sfbrfstTuitRefund == null)? 0 :this.sfbrfstTuitRefund.hashCode()));
        result = ((result* 31)+((this.stvestsDesc == null)? 0 :this.stvestsDesc.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.sfbrfstFeesRefund == null)? 0 :this.sfbrfstFeesRefund.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Sfbetrm) == false) {
            return false;
        }
        Sfbetrm rhs = ((Sfbetrm) other);
        return (((((((this.estsCode == rhs.estsCode)||((this.estsCode!= null)&&this.estsCode.equals(rhs.estsCode)))&&((this.estsDate == rhs.estsDate)||((this.estsDate!= null)&&this.estsDate.equals(rhs.estsDate))))&&((this.sfbrfstTuitRefund == rhs.sfbrfstTuitRefund)||((this.sfbrfstTuitRefund!= null)&&this.sfbrfstTuitRefund.equals(rhs.sfbrfstTuitRefund))))&&((this.stvestsDesc == rhs.stvestsDesc)||((this.stvestsDesc!= null)&&this.stvestsDesc.equals(rhs.stvestsDesc))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.sfbrfstFeesRefund == rhs.sfbrfstFeesRefund)||((this.sfbrfstFeesRefund!= null)&&this.sfbrfstFeesRefund.equals(rhs.sfbrfstFeesRefund))));
    }

}
