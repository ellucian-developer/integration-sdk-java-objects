
package com.ellucian.generated.bpapi.ban.detail_encumbrance_activity.v1_0_0;

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
    "encdActionInd",
    "documentBalance",
    "transAmt",
    "transDate",
    "docCode",
    "ruclCode"
})
@Generated("jsonschema2pojo")
public class Fgbtrnd {

    /**
     * Action
     * <p>
     * 
     * 
     */
    @JsonProperty("encdActionInd")
    private String encdActionInd;
    /**
     * Remaining Balance
     * <p>
     * 
     * 
     */
    @JsonProperty("documentBalance")
    private Double documentBalance;
    /**
     * Transaction Amount
     * <p>
     * Lineage reference object : FGBTRND_TRANS_AMT
     * 
     */
    @JsonProperty("transAmt")
    @JsonPropertyDescription("Lineage reference object : FGBTRND_TRANS_AMT")
    private Double transAmt;
    /**
     * Transaction Date
     * <p>
     * 
     * 
     */
    @JsonProperty("transDate")
    private Date transDate;
    /**
     * Document Code
     * <p>
     * Lineage reference object : FGBTRND_DOC_CODE
     * 
     */
    @JsonProperty("docCode")
    @JsonPropertyDescription("Lineage reference object : FGBTRND_DOC_CODE")
    private String docCode;
    /**
     * Type
     * <p>
     * Lineage reference object : FGBTRND_RUCL_CODE, Lookup lineage reference object : ftvrucl
     * 
     */
    @JsonProperty("ruclCode")
    @JsonPropertyDescription("Lineage reference object : FGBTRND_RUCL_CODE, Lookup lineage reference object : ftvrucl")
    private String ruclCode;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Action
     * <p>
     * 
     * 
     */
    @JsonProperty("encdActionInd")
    public String getEncdActionInd() {
        return encdActionInd;
    }

    /**
     * Action
     * <p>
     * 
     * 
     */
    @JsonProperty("encdActionInd")
    public void setEncdActionInd(String encdActionInd) {
        this.encdActionInd = encdActionInd;
    }

    public Fgbtrnd withEncdActionInd(String encdActionInd) {
        this.encdActionInd = encdActionInd;
        return this;
    }

    /**
     * Remaining Balance
     * <p>
     * 
     * 
     */
    @JsonProperty("documentBalance")
    public Double getDocumentBalance() {
        return documentBalance;
    }

    /**
     * Remaining Balance
     * <p>
     * 
     * 
     */
    @JsonProperty("documentBalance")
    public void setDocumentBalance(Double documentBalance) {
        this.documentBalance = documentBalance;
    }

    public Fgbtrnd withDocumentBalance(Double documentBalance) {
        this.documentBalance = documentBalance;
        return this;
    }

    /**
     * Transaction Amount
     * <p>
     * Lineage reference object : FGBTRND_TRANS_AMT
     * 
     */
    @JsonProperty("transAmt")
    public Double getTransAmt() {
        return transAmt;
    }

    /**
     * Transaction Amount
     * <p>
     * Lineage reference object : FGBTRND_TRANS_AMT
     * 
     */
    @JsonProperty("transAmt")
    public void setTransAmt(Double transAmt) {
        this.transAmt = transAmt;
    }

    public Fgbtrnd withTransAmt(Double transAmt) {
        this.transAmt = transAmt;
        return this;
    }

    /**
     * Transaction Date
     * <p>
     * 
     * 
     */
    @JsonProperty("transDate")
    public Date getTransDate() {
        return transDate;
    }

    /**
     * Transaction Date
     * <p>
     * 
     * 
     */
    @JsonProperty("transDate")
    public void setTransDate(Date transDate) {
        this.transDate = transDate;
    }

    public Fgbtrnd withTransDate(Date transDate) {
        this.transDate = transDate;
        return this;
    }

    /**
     * Document Code
     * <p>
     * Lineage reference object : FGBTRND_DOC_CODE
     * 
     */
    @JsonProperty("docCode")
    public String getDocCode() {
        return docCode;
    }

    /**
     * Document Code
     * <p>
     * Lineage reference object : FGBTRND_DOC_CODE
     * 
     */
    @JsonProperty("docCode")
    public void setDocCode(String docCode) {
        this.docCode = docCode;
    }

    public Fgbtrnd withDocCode(String docCode) {
        this.docCode = docCode;
        return this;
    }

    /**
     * Type
     * <p>
     * Lineage reference object : FGBTRND_RUCL_CODE, Lookup lineage reference object : ftvrucl
     * 
     */
    @JsonProperty("ruclCode")
    public String getRuclCode() {
        return ruclCode;
    }

    /**
     * Type
     * <p>
     * Lineage reference object : FGBTRND_RUCL_CODE, Lookup lineage reference object : ftvrucl
     * 
     */
    @JsonProperty("ruclCode")
    public void setRuclCode(String ruclCode) {
        this.ruclCode = ruclCode;
    }

    public Fgbtrnd withRuclCode(String ruclCode) {
        this.ruclCode = ruclCode;
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

    public Fgbtrnd withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Fgbtrnd.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("encdActionInd");
        sb.append('=');
        sb.append(((this.encdActionInd == null)?"<null>":this.encdActionInd));
        sb.append(',');
        sb.append("documentBalance");
        sb.append('=');
        sb.append(((this.documentBalance == null)?"<null>":this.documentBalance));
        sb.append(',');
        sb.append("transAmt");
        sb.append('=');
        sb.append(((this.transAmt == null)?"<null>":this.transAmt));
        sb.append(',');
        sb.append("transDate");
        sb.append('=');
        sb.append(((this.transDate == null)?"<null>":this.transDate));
        sb.append(',');
        sb.append("docCode");
        sb.append('=');
        sb.append(((this.docCode == null)?"<null>":this.docCode));
        sb.append(',');
        sb.append("ruclCode");
        sb.append('=');
        sb.append(((this.ruclCode == null)?"<null>":this.ruclCode));
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
        result = ((result* 31)+((this.encdActionInd == null)? 0 :this.encdActionInd.hashCode()));
        result = ((result* 31)+((this.documentBalance == null)? 0 :this.documentBalance.hashCode()));
        result = ((result* 31)+((this.transAmt == null)? 0 :this.transAmt.hashCode()));
        result = ((result* 31)+((this.transDate == null)? 0 :this.transDate.hashCode()));
        result = ((result* 31)+((this.docCode == null)? 0 :this.docCode.hashCode()));
        result = ((result* 31)+((this.ruclCode == null)? 0 :this.ruclCode.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Fgbtrnd) == false) {
            return false;
        }
        Fgbtrnd rhs = ((Fgbtrnd) other);
        return ((((((((this.encdActionInd == rhs.encdActionInd)||((this.encdActionInd!= null)&&this.encdActionInd.equals(rhs.encdActionInd)))&&((this.documentBalance == rhs.documentBalance)||((this.documentBalance!= null)&&this.documentBalance.equals(rhs.documentBalance))))&&((this.transAmt == rhs.transAmt)||((this.transAmt!= null)&&this.transAmt.equals(rhs.transAmt))))&&((this.transDate == rhs.transDate)||((this.transDate!= null)&&this.transDate.equals(rhs.transDate))))&&((this.docCode == rhs.docCode)||((this.docCode!= null)&&this.docCode.equals(rhs.docCode))))&&((this.ruclCode == rhs.ruclCode)||((this.ruclCode!= null)&&this.ruclCode.equals(rhs.ruclCode))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
    }

}
