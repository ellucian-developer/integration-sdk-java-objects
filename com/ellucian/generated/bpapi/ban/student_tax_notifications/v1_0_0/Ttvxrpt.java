
package com.ellucian.generated.bpapi.ban.student_tax_notifications.v1_0_0;

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
    "detailDesc",
    "futureInd",
    "proRated",
    "futureIndSg",
    "taxDateSrc",
    "taxAmount",
    "detailCode",
    "futureIndPr",
    "taxDate",
    "termCode"
})
@Generated("jsonschema2pojo")
public class Ttvxrpt {

    /**
     * Description
     * <p>
     * Lineage reference object : TTVXRPT_DETAIL_DESC
     * 
     */
    @JsonProperty("detailDesc")
    @JsonPropertyDescription("Lineage reference object : TTVXRPT_DETAIL_DESC")
    private String detailDesc;
    /**
     * Lineage reference object : TTVXRPT_FUTURE_IND
     * 
     */
    @JsonProperty("futureInd")
    @JsonPropertyDescription("Lineage reference object : TTVXRPT_FUTURE_IND")
    private String futureInd;
    /**
     * Lineage reference object : TTVXRPT_PRO_RATED
     * 
     */
    @JsonProperty("proRated")
    @JsonPropertyDescription("Lineage reference object : TTVXRPT_PRO_RATED")
    private String proRated;
    /**
     * Lineage reference object : TTVXRPT_FUTURE_IND_SG
     * 
     */
    @JsonProperty("futureIndSg")
    @JsonPropertyDescription("Lineage reference object : TTVXRPT_FUTURE_IND_SG")
    private String futureIndSg;
    /**
     * Date Source
     * <p>
     * 
     * 
     */
    @JsonProperty("taxDateSrc")
    private String taxDateSrc;
    /**
     * Tax Amount
     * <p>
     * Lineage reference object : TTVXRPT_TAX_AMOUNT
     * 
     */
    @JsonProperty("taxAmount")
    @JsonPropertyDescription("Lineage reference object : TTVXRPT_TAX_AMOUNT")
    private Double taxAmount;
    /**
     * Detail Code
     * <p>
     * Lineage reference object : TTVXRPT_DETAIL_CODE
     * 
     */
    @JsonProperty("detailCode")
    @JsonPropertyDescription("Lineage reference object : TTVXRPT_DETAIL_CODE")
    private String detailCode;
    /**
     * Lineage reference object : TTVXRPT_FUTURE_IND_PR
     * 
     */
    @JsonProperty("futureIndPr")
    @JsonPropertyDescription("Lineage reference object : TTVXRPT_FUTURE_IND_PR")
    private String futureIndPr;
    /**
     * Effective Tax Date
     * <p>
     * Lineage reference object : TTVXRPT_TAX_DATE
     * 
     */
    @JsonProperty("taxDate")
    @JsonPropertyDescription("Lineage reference object : TTVXRPT_TAX_DATE")
    private Date taxDate;
    /**
     * Term
     * <p>
     * Lineage reference object : TTVXRPT_TERM_CODE
     * 
     */
    @JsonProperty("termCode")
    @JsonPropertyDescription("Lineage reference object : TTVXRPT_TERM_CODE")
    private String termCode;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Description
     * <p>
     * Lineage reference object : TTVXRPT_DETAIL_DESC
     * 
     */
    @JsonProperty("detailDesc")
    public String getDetailDesc() {
        return detailDesc;
    }

    /**
     * Description
     * <p>
     * Lineage reference object : TTVXRPT_DETAIL_DESC
     * 
     */
    @JsonProperty("detailDesc")
    public void setDetailDesc(String detailDesc) {
        this.detailDesc = detailDesc;
    }

    public Ttvxrpt withDetailDesc(String detailDesc) {
        this.detailDesc = detailDesc;
        return this;
    }

    /**
     * Lineage reference object : TTVXRPT_FUTURE_IND
     * 
     */
    @JsonProperty("futureInd")
    public String getFutureInd() {
        return futureInd;
    }

    /**
     * Lineage reference object : TTVXRPT_FUTURE_IND
     * 
     */
    @JsonProperty("futureInd")
    public void setFutureInd(String futureInd) {
        this.futureInd = futureInd;
    }

    public Ttvxrpt withFutureInd(String futureInd) {
        this.futureInd = futureInd;
        return this;
    }

    /**
     * Lineage reference object : TTVXRPT_PRO_RATED
     * 
     */
    @JsonProperty("proRated")
    public String getProRated() {
        return proRated;
    }

    /**
     * Lineage reference object : TTVXRPT_PRO_RATED
     * 
     */
    @JsonProperty("proRated")
    public void setProRated(String proRated) {
        this.proRated = proRated;
    }

    public Ttvxrpt withProRated(String proRated) {
        this.proRated = proRated;
        return this;
    }

    /**
     * Lineage reference object : TTVXRPT_FUTURE_IND_SG
     * 
     */
    @JsonProperty("futureIndSg")
    public String getFutureIndSg() {
        return futureIndSg;
    }

    /**
     * Lineage reference object : TTVXRPT_FUTURE_IND_SG
     * 
     */
    @JsonProperty("futureIndSg")
    public void setFutureIndSg(String futureIndSg) {
        this.futureIndSg = futureIndSg;
    }

    public Ttvxrpt withFutureIndSg(String futureIndSg) {
        this.futureIndSg = futureIndSg;
        return this;
    }

    /**
     * Date Source
     * <p>
     * 
     * 
     */
    @JsonProperty("taxDateSrc")
    public String getTaxDateSrc() {
        return taxDateSrc;
    }

    /**
     * Date Source
     * <p>
     * 
     * 
     */
    @JsonProperty("taxDateSrc")
    public void setTaxDateSrc(String taxDateSrc) {
        this.taxDateSrc = taxDateSrc;
    }

    public Ttvxrpt withTaxDateSrc(String taxDateSrc) {
        this.taxDateSrc = taxDateSrc;
        return this;
    }

    /**
     * Tax Amount
     * <p>
     * Lineage reference object : TTVXRPT_TAX_AMOUNT
     * 
     */
    @JsonProperty("taxAmount")
    public Double getTaxAmount() {
        return taxAmount;
    }

    /**
     * Tax Amount
     * <p>
     * Lineage reference object : TTVXRPT_TAX_AMOUNT
     * 
     */
    @JsonProperty("taxAmount")
    public void setTaxAmount(Double taxAmount) {
        this.taxAmount = taxAmount;
    }

    public Ttvxrpt withTaxAmount(Double taxAmount) {
        this.taxAmount = taxAmount;
        return this;
    }

    /**
     * Detail Code
     * <p>
     * Lineage reference object : TTVXRPT_DETAIL_CODE
     * 
     */
    @JsonProperty("detailCode")
    public String getDetailCode() {
        return detailCode;
    }

    /**
     * Detail Code
     * <p>
     * Lineage reference object : TTVXRPT_DETAIL_CODE
     * 
     */
    @JsonProperty("detailCode")
    public void setDetailCode(String detailCode) {
        this.detailCode = detailCode;
    }

    public Ttvxrpt withDetailCode(String detailCode) {
        this.detailCode = detailCode;
        return this;
    }

    /**
     * Lineage reference object : TTVXRPT_FUTURE_IND_PR
     * 
     */
    @JsonProperty("futureIndPr")
    public String getFutureIndPr() {
        return futureIndPr;
    }

    /**
     * Lineage reference object : TTVXRPT_FUTURE_IND_PR
     * 
     */
    @JsonProperty("futureIndPr")
    public void setFutureIndPr(String futureIndPr) {
        this.futureIndPr = futureIndPr;
    }

    public Ttvxrpt withFutureIndPr(String futureIndPr) {
        this.futureIndPr = futureIndPr;
        return this;
    }

    /**
     * Effective Tax Date
     * <p>
     * Lineage reference object : TTVXRPT_TAX_DATE
     * 
     */
    @JsonProperty("taxDate")
    public Date getTaxDate() {
        return taxDate;
    }

    /**
     * Effective Tax Date
     * <p>
     * Lineage reference object : TTVXRPT_TAX_DATE
     * 
     */
    @JsonProperty("taxDate")
    public void setTaxDate(Date taxDate) {
        this.taxDate = taxDate;
    }

    public Ttvxrpt withTaxDate(Date taxDate) {
        this.taxDate = taxDate;
        return this;
    }

    /**
     * Term
     * <p>
     * Lineage reference object : TTVXRPT_TERM_CODE
     * 
     */
    @JsonProperty("termCode")
    public String getTermCode() {
        return termCode;
    }

    /**
     * Term
     * <p>
     * Lineage reference object : TTVXRPT_TERM_CODE
     * 
     */
    @JsonProperty("termCode")
    public void setTermCode(String termCode) {
        this.termCode = termCode;
    }

    public Ttvxrpt withTermCode(String termCode) {
        this.termCode = termCode;
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

    public Ttvxrpt withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Ttvxrpt.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("detailDesc");
        sb.append('=');
        sb.append(((this.detailDesc == null)?"<null>":this.detailDesc));
        sb.append(',');
        sb.append("futureInd");
        sb.append('=');
        sb.append(((this.futureInd == null)?"<null>":this.futureInd));
        sb.append(',');
        sb.append("proRated");
        sb.append('=');
        sb.append(((this.proRated == null)?"<null>":this.proRated));
        sb.append(',');
        sb.append("futureIndSg");
        sb.append('=');
        sb.append(((this.futureIndSg == null)?"<null>":this.futureIndSg));
        sb.append(',');
        sb.append("taxDateSrc");
        sb.append('=');
        sb.append(((this.taxDateSrc == null)?"<null>":this.taxDateSrc));
        sb.append(',');
        sb.append("taxAmount");
        sb.append('=');
        sb.append(((this.taxAmount == null)?"<null>":this.taxAmount));
        sb.append(',');
        sb.append("detailCode");
        sb.append('=');
        sb.append(((this.detailCode == null)?"<null>":this.detailCode));
        sb.append(',');
        sb.append("futureIndPr");
        sb.append('=');
        sb.append(((this.futureIndPr == null)?"<null>":this.futureIndPr));
        sb.append(',');
        sb.append("taxDate");
        sb.append('=');
        sb.append(((this.taxDate == null)?"<null>":this.taxDate));
        sb.append(',');
        sb.append("termCode");
        sb.append('=');
        sb.append(((this.termCode == null)?"<null>":this.termCode));
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
        result = ((result* 31)+((this.detailDesc == null)? 0 :this.detailDesc.hashCode()));
        result = ((result* 31)+((this.futureInd == null)? 0 :this.futureInd.hashCode()));
        result = ((result* 31)+((this.proRated == null)? 0 :this.proRated.hashCode()));
        result = ((result* 31)+((this.futureIndSg == null)? 0 :this.futureIndSg.hashCode()));
        result = ((result* 31)+((this.taxDateSrc == null)? 0 :this.taxDateSrc.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.taxAmount == null)? 0 :this.taxAmount.hashCode()));
        result = ((result* 31)+((this.detailCode == null)? 0 :this.detailCode.hashCode()));
        result = ((result* 31)+((this.futureIndPr == null)? 0 :this.futureIndPr.hashCode()));
        result = ((result* 31)+((this.taxDate == null)? 0 :this.taxDate.hashCode()));
        result = ((result* 31)+((this.termCode == null)? 0 :this.termCode.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Ttvxrpt) == false) {
            return false;
        }
        Ttvxrpt rhs = ((Ttvxrpt) other);
        return ((((((((((((this.detailDesc == rhs.detailDesc)||((this.detailDesc!= null)&&this.detailDesc.equals(rhs.detailDesc)))&&((this.futureInd == rhs.futureInd)||((this.futureInd!= null)&&this.futureInd.equals(rhs.futureInd))))&&((this.proRated == rhs.proRated)||((this.proRated!= null)&&this.proRated.equals(rhs.proRated))))&&((this.futureIndSg == rhs.futureIndSg)||((this.futureIndSg!= null)&&this.futureIndSg.equals(rhs.futureIndSg))))&&((this.taxDateSrc == rhs.taxDateSrc)||((this.taxDateSrc!= null)&&this.taxDateSrc.equals(rhs.taxDateSrc))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.taxAmount == rhs.taxAmount)||((this.taxAmount!= null)&&this.taxAmount.equals(rhs.taxAmount))))&&((this.detailCode == rhs.detailCode)||((this.detailCode!= null)&&this.detailCode.equals(rhs.detailCode))))&&((this.futureIndPr == rhs.futureIndPr)||((this.futureIndPr!= null)&&this.futureIndPr.equals(rhs.futureIndPr))))&&((this.taxDate == rhs.taxDate)||((this.taxDate!= null)&&this.taxDate.equals(rhs.taxDate))))&&((this.termCode == rhs.termCode)||((this.termCode!= null)&&this.termCode.equals(rhs.termCode))));
    }

}
