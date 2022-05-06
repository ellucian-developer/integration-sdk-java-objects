
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
    "futureInd",
    "taxReptBoxSg",
    "proratedInd",
    "taxDateSrc",
    "detailCode",
    "taxDate",
    "taxReptBox",
    "taxReptYear",
    "dcatCode",
    "reptCode",
    "taxAmount",
    "desc",
    "termCode"
})
@Generated("jsonschema2pojo")
public class Ttvxsum {

    /**
     * Lineage reference object : TTVXSUM_FUTURE_IND
     * 
     */
    @JsonProperty("futureInd")
    @JsonPropertyDescription("Lineage reference object : TTVXSUM_FUTURE_IND")
    private String futureInd;
    /**
     * Lineage reference object : TTVXSUM_TAX_REPT_BOX_SG
     * 
     */
    @JsonProperty("taxReptBoxSg")
    @JsonPropertyDescription("Lineage reference object : TTVXSUM_TAX_REPT_BOX_SG")
    private String taxReptBoxSg;
    @JsonProperty("proratedInd")
    private String proratedInd;
    /**
     * Date Source
     * <p>
     * 
     * 
     */
    @JsonProperty("taxDateSrc")
    private String taxDateSrc;
    /**
     * Detail Code
     * <p>
     * Lineage reference object : TTVXSUM_DETAIL_CODE
     * 
     */
    @JsonProperty("detailCode")
    @JsonPropertyDescription("Lineage reference object : TTVXSUM_DETAIL_CODE")
    private String detailCode;
    /**
     * Effective Tax Date
     * <p>
     * Lineage reference object : TTVXSUM_TAX_DATE
     * 
     */
    @JsonProperty("taxDate")
    @JsonPropertyDescription("Lineage reference object : TTVXSUM_TAX_DATE")
    private Date taxDate;
    /**
     * Lineage reference object : TTVXSUM_TAX_REPT_BOX
     * 
     */
    @JsonProperty("taxReptBox")
    @JsonPropertyDescription("Lineage reference object : TTVXSUM_TAX_REPT_BOX")
    private String taxReptBox;
    /**
     * Year
     * <p>
     * Lineage reference object : TTVXSUM_TAX_REPT_YEAR
     * 
     */
    @JsonProperty("taxReptYear")
    @JsonPropertyDescription("Lineage reference object : TTVXSUM_TAX_REPT_YEAR")
    private Double taxReptYear;
    /**
     * Category Code
     * <p>
     * Lineage reference object : TTVXSUM_DCAT_CODE
     * 
     */
    @JsonProperty("dcatCode")
    @JsonPropertyDescription("Lineage reference object : TTVXSUM_DCAT_CODE")
    private String dcatCode;
    /**
     * Tax Report Code
     * <p>
     * Lineage reference object : TTVXSUM_REPT_CODE
     * 
     */
    @JsonProperty("reptCode")
    @JsonPropertyDescription("Lineage reference object : TTVXSUM_REPT_CODE")
    private String reptCode;
    /**
     * Amount
     * <p>
     * Lineage reference object : TTVXSUM_TAX_AMOUNT
     * 
     */
    @JsonProperty("taxAmount")
    @JsonPropertyDescription("Lineage reference object : TTVXSUM_TAX_AMOUNT")
    private Double taxAmount;
    /**
     * Description
     * <p>
     * Lineage reference object : TTVXSUM_DESC
     * 
     */
    @JsonProperty("desc")
    @JsonPropertyDescription("Lineage reference object : TTVXSUM_DESC")
    private String desc;
    /**
     * Term
     * <p>
     * Lineage reference object : TTVXSUM_TERM_CODE
     * 
     */
    @JsonProperty("termCode")
    @JsonPropertyDescription("Lineage reference object : TTVXSUM_TERM_CODE")
    private String termCode;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Lineage reference object : TTVXSUM_FUTURE_IND
     * 
     */
    @JsonProperty("futureInd")
    public String getFutureInd() {
        return futureInd;
    }

    /**
     * Lineage reference object : TTVXSUM_FUTURE_IND
     * 
     */
    @JsonProperty("futureInd")
    public void setFutureInd(String futureInd) {
        this.futureInd = futureInd;
    }

    public Ttvxsum withFutureInd(String futureInd) {
        this.futureInd = futureInd;
        return this;
    }

    /**
     * Lineage reference object : TTVXSUM_TAX_REPT_BOX_SG
     * 
     */
    @JsonProperty("taxReptBoxSg")
    public String getTaxReptBoxSg() {
        return taxReptBoxSg;
    }

    /**
     * Lineage reference object : TTVXSUM_TAX_REPT_BOX_SG
     * 
     */
    @JsonProperty("taxReptBoxSg")
    public void setTaxReptBoxSg(String taxReptBoxSg) {
        this.taxReptBoxSg = taxReptBoxSg;
    }

    public Ttvxsum withTaxReptBoxSg(String taxReptBoxSg) {
        this.taxReptBoxSg = taxReptBoxSg;
        return this;
    }

    @JsonProperty("proratedInd")
    public String getProratedInd() {
        return proratedInd;
    }

    @JsonProperty("proratedInd")
    public void setProratedInd(String proratedInd) {
        this.proratedInd = proratedInd;
    }

    public Ttvxsum withProratedInd(String proratedInd) {
        this.proratedInd = proratedInd;
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

    public Ttvxsum withTaxDateSrc(String taxDateSrc) {
        this.taxDateSrc = taxDateSrc;
        return this;
    }

    /**
     * Detail Code
     * <p>
     * Lineage reference object : TTVXSUM_DETAIL_CODE
     * 
     */
    @JsonProperty("detailCode")
    public String getDetailCode() {
        return detailCode;
    }

    /**
     * Detail Code
     * <p>
     * Lineage reference object : TTVXSUM_DETAIL_CODE
     * 
     */
    @JsonProperty("detailCode")
    public void setDetailCode(String detailCode) {
        this.detailCode = detailCode;
    }

    public Ttvxsum withDetailCode(String detailCode) {
        this.detailCode = detailCode;
        return this;
    }

    /**
     * Effective Tax Date
     * <p>
     * Lineage reference object : TTVXSUM_TAX_DATE
     * 
     */
    @JsonProperty("taxDate")
    public Date getTaxDate() {
        return taxDate;
    }

    /**
     * Effective Tax Date
     * <p>
     * Lineage reference object : TTVXSUM_TAX_DATE
     * 
     */
    @JsonProperty("taxDate")
    public void setTaxDate(Date taxDate) {
        this.taxDate = taxDate;
    }

    public Ttvxsum withTaxDate(Date taxDate) {
        this.taxDate = taxDate;
        return this;
    }

    /**
     * Lineage reference object : TTVXSUM_TAX_REPT_BOX
     * 
     */
    @JsonProperty("taxReptBox")
    public String getTaxReptBox() {
        return taxReptBox;
    }

    /**
     * Lineage reference object : TTVXSUM_TAX_REPT_BOX
     * 
     */
    @JsonProperty("taxReptBox")
    public void setTaxReptBox(String taxReptBox) {
        this.taxReptBox = taxReptBox;
    }

    public Ttvxsum withTaxReptBox(String taxReptBox) {
        this.taxReptBox = taxReptBox;
        return this;
    }

    /**
     * Year
     * <p>
     * Lineage reference object : TTVXSUM_TAX_REPT_YEAR
     * 
     */
    @JsonProperty("taxReptYear")
    public Double getTaxReptYear() {
        return taxReptYear;
    }

    /**
     * Year
     * <p>
     * Lineage reference object : TTVXSUM_TAX_REPT_YEAR
     * 
     */
    @JsonProperty("taxReptYear")
    public void setTaxReptYear(Double taxReptYear) {
        this.taxReptYear = taxReptYear;
    }

    public Ttvxsum withTaxReptYear(Double taxReptYear) {
        this.taxReptYear = taxReptYear;
        return this;
    }

    /**
     * Category Code
     * <p>
     * Lineage reference object : TTVXSUM_DCAT_CODE
     * 
     */
    @JsonProperty("dcatCode")
    public String getDcatCode() {
        return dcatCode;
    }

    /**
     * Category Code
     * <p>
     * Lineage reference object : TTVXSUM_DCAT_CODE
     * 
     */
    @JsonProperty("dcatCode")
    public void setDcatCode(String dcatCode) {
        this.dcatCode = dcatCode;
    }

    public Ttvxsum withDcatCode(String dcatCode) {
        this.dcatCode = dcatCode;
        return this;
    }

    /**
     * Tax Report Code
     * <p>
     * Lineage reference object : TTVXSUM_REPT_CODE
     * 
     */
    @JsonProperty("reptCode")
    public String getReptCode() {
        return reptCode;
    }

    /**
     * Tax Report Code
     * <p>
     * Lineage reference object : TTVXSUM_REPT_CODE
     * 
     */
    @JsonProperty("reptCode")
    public void setReptCode(String reptCode) {
        this.reptCode = reptCode;
    }

    public Ttvxsum withReptCode(String reptCode) {
        this.reptCode = reptCode;
        return this;
    }

    /**
     * Amount
     * <p>
     * Lineage reference object : TTVXSUM_TAX_AMOUNT
     * 
     */
    @JsonProperty("taxAmount")
    public Double getTaxAmount() {
        return taxAmount;
    }

    /**
     * Amount
     * <p>
     * Lineage reference object : TTVXSUM_TAX_AMOUNT
     * 
     */
    @JsonProperty("taxAmount")
    public void setTaxAmount(Double taxAmount) {
        this.taxAmount = taxAmount;
    }

    public Ttvxsum withTaxAmount(Double taxAmount) {
        this.taxAmount = taxAmount;
        return this;
    }

    /**
     * Description
     * <p>
     * Lineage reference object : TTVXSUM_DESC
     * 
     */
    @JsonProperty("desc")
    public String getDesc() {
        return desc;
    }

    /**
     * Description
     * <p>
     * Lineage reference object : TTVXSUM_DESC
     * 
     */
    @JsonProperty("desc")
    public void setDesc(String desc) {
        this.desc = desc;
    }

    public Ttvxsum withDesc(String desc) {
        this.desc = desc;
        return this;
    }

    /**
     * Term
     * <p>
     * Lineage reference object : TTVXSUM_TERM_CODE
     * 
     */
    @JsonProperty("termCode")
    public String getTermCode() {
        return termCode;
    }

    /**
     * Term
     * <p>
     * Lineage reference object : TTVXSUM_TERM_CODE
     * 
     */
    @JsonProperty("termCode")
    public void setTermCode(String termCode) {
        this.termCode = termCode;
    }

    public Ttvxsum withTermCode(String termCode) {
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

    public Ttvxsum withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Ttvxsum.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("futureInd");
        sb.append('=');
        sb.append(((this.futureInd == null)?"<null>":this.futureInd));
        sb.append(',');
        sb.append("taxReptBoxSg");
        sb.append('=');
        sb.append(((this.taxReptBoxSg == null)?"<null>":this.taxReptBoxSg));
        sb.append(',');
        sb.append("proratedInd");
        sb.append('=');
        sb.append(((this.proratedInd == null)?"<null>":this.proratedInd));
        sb.append(',');
        sb.append("taxDateSrc");
        sb.append('=');
        sb.append(((this.taxDateSrc == null)?"<null>":this.taxDateSrc));
        sb.append(',');
        sb.append("detailCode");
        sb.append('=');
        sb.append(((this.detailCode == null)?"<null>":this.detailCode));
        sb.append(',');
        sb.append("taxDate");
        sb.append('=');
        sb.append(((this.taxDate == null)?"<null>":this.taxDate));
        sb.append(',');
        sb.append("taxReptBox");
        sb.append('=');
        sb.append(((this.taxReptBox == null)?"<null>":this.taxReptBox));
        sb.append(',');
        sb.append("taxReptYear");
        sb.append('=');
        sb.append(((this.taxReptYear == null)?"<null>":this.taxReptYear));
        sb.append(',');
        sb.append("dcatCode");
        sb.append('=');
        sb.append(((this.dcatCode == null)?"<null>":this.dcatCode));
        sb.append(',');
        sb.append("reptCode");
        sb.append('=');
        sb.append(((this.reptCode == null)?"<null>":this.reptCode));
        sb.append(',');
        sb.append("taxAmount");
        sb.append('=');
        sb.append(((this.taxAmount == null)?"<null>":this.taxAmount));
        sb.append(',');
        sb.append("desc");
        sb.append('=');
        sb.append(((this.desc == null)?"<null>":this.desc));
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
        result = ((result* 31)+((this.futureInd == null)? 0 :this.futureInd.hashCode()));
        result = ((result* 31)+((this.taxReptBoxSg == null)? 0 :this.taxReptBoxSg.hashCode()));
        result = ((result* 31)+((this.proratedInd == null)? 0 :this.proratedInd.hashCode()));
        result = ((result* 31)+((this.taxDateSrc == null)? 0 :this.taxDateSrc.hashCode()));
        result = ((result* 31)+((this.detailCode == null)? 0 :this.detailCode.hashCode()));
        result = ((result* 31)+((this.taxDate == null)? 0 :this.taxDate.hashCode()));
        result = ((result* 31)+((this.taxReptBox == null)? 0 :this.taxReptBox.hashCode()));
        result = ((result* 31)+((this.taxReptYear == null)? 0 :this.taxReptYear.hashCode()));
        result = ((result* 31)+((this.dcatCode == null)? 0 :this.dcatCode.hashCode()));
        result = ((result* 31)+((this.reptCode == null)? 0 :this.reptCode.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.taxAmount == null)? 0 :this.taxAmount.hashCode()));
        result = ((result* 31)+((this.desc == null)? 0 :this.desc.hashCode()));
        result = ((result* 31)+((this.termCode == null)? 0 :this.termCode.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Ttvxsum) == false) {
            return false;
        }
        Ttvxsum rhs = ((Ttvxsum) other);
        return (((((((((((((((this.futureInd == rhs.futureInd)||((this.futureInd!= null)&&this.futureInd.equals(rhs.futureInd)))&&((this.taxReptBoxSg == rhs.taxReptBoxSg)||((this.taxReptBoxSg!= null)&&this.taxReptBoxSg.equals(rhs.taxReptBoxSg))))&&((this.proratedInd == rhs.proratedInd)||((this.proratedInd!= null)&&this.proratedInd.equals(rhs.proratedInd))))&&((this.taxDateSrc == rhs.taxDateSrc)||((this.taxDateSrc!= null)&&this.taxDateSrc.equals(rhs.taxDateSrc))))&&((this.detailCode == rhs.detailCode)||((this.detailCode!= null)&&this.detailCode.equals(rhs.detailCode))))&&((this.taxDate == rhs.taxDate)||((this.taxDate!= null)&&this.taxDate.equals(rhs.taxDate))))&&((this.taxReptBox == rhs.taxReptBox)||((this.taxReptBox!= null)&&this.taxReptBox.equals(rhs.taxReptBox))))&&((this.taxReptYear == rhs.taxReptYear)||((this.taxReptYear!= null)&&this.taxReptYear.equals(rhs.taxReptYear))))&&((this.dcatCode == rhs.dcatCode)||((this.dcatCode!= null)&&this.dcatCode.equals(rhs.dcatCode))))&&((this.reptCode == rhs.reptCode)||((this.reptCode!= null)&&this.reptCode.equals(rhs.reptCode))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.taxAmount == rhs.taxAmount)||((this.taxAmount!= null)&&this.taxAmount.equals(rhs.taxAmount))))&&((this.desc == rhs.desc)||((this.desc!= null)&&this.desc.equals(rhs.desc))))&&((this.termCode == rhs.termCode)||((this.termCode!= null)&&this.termCode.equals(rhs.termCode))));
    }

}
