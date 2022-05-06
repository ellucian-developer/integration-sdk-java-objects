
package com.ellucian.generated.bpapi.ban.currency_codes.v1_0_0;

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
    "rateTermDate",
    "currCode",
    "scodCodeIso",
    "statusInd",
    "title",
    "rateEffDate"
})
@Generated("jsonschema2pojo")
public class CurrencyCodes100GetRequest {

    /**
     * Termination
     *  Date
     * <p>
     * Lineage reference object : GTVCURR_RATE_TERM_DATE
     * 
     */
    @JsonProperty("rateTermDate")
    @JsonPropertyDescription("Lineage reference object : GTVCURR_RATE_TERM_DATE")
    private Date rateTermDate;
    /**
     * Currency
     *  Code
     * <p>
     * Lineage reference object : GTVCURR_CURR_CODE
     * 
     */
    @JsonProperty("currCode")
    @JsonPropertyDescription("Lineage reference object : GTVCURR_CURR_CODE")
    private String currCode;
    /**
     * ISO
     * Standard
     * Code
     * <p>
     * Lineage reference object : GTVCURR_SCOD_CODE_ISO
     * 
     */
    @JsonProperty("scodCodeIso")
    @JsonPropertyDescription("Lineage reference object : GTVCURR_SCOD_CODE_ISO")
    private String scodCodeIso;
    /**
     * Status
     * <p>
     * Lineage reference object : GTVCURR_STATUS_IND
     * 
     */
    @JsonProperty("statusInd")
    @JsonPropertyDescription("Lineage reference object : GTVCURR_STATUS_IND")
    private String statusInd;
    /**
     * Title
     * <p>
     * Lineage reference object : GTVCURR_TITLE
     * 
     */
    @JsonProperty("title")
    @JsonPropertyDescription("Lineage reference object : GTVCURR_TITLE")
    private String title;
    /**
     * Effective
     * Date
     * <p>
     * Lineage reference object : GTVCURR_RATE_EFF_DATE
     * 
     */
    @JsonProperty("rateEffDate")
    @JsonPropertyDescription("Lineage reference object : GTVCURR_RATE_EFF_DATE")
    private Date rateEffDate;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Termination
     *  Date
     * <p>
     * Lineage reference object : GTVCURR_RATE_TERM_DATE
     * 
     */
    @JsonProperty("rateTermDate")
    public Date getRateTermDate() {
        return rateTermDate;
    }

    /**
     * Termination
     *  Date
     * <p>
     * Lineage reference object : GTVCURR_RATE_TERM_DATE
     * 
     */
    @JsonProperty("rateTermDate")
    public void setRateTermDate(Date rateTermDate) {
        this.rateTermDate = rateTermDate;
    }

    public CurrencyCodes100GetRequest withRateTermDate(Date rateTermDate) {
        this.rateTermDate = rateTermDate;
        return this;
    }

    /**
     * Currency
     *  Code
     * <p>
     * Lineage reference object : GTVCURR_CURR_CODE
     * 
     */
    @JsonProperty("currCode")
    public String getCurrCode() {
        return currCode;
    }

    /**
     * Currency
     *  Code
     * <p>
     * Lineage reference object : GTVCURR_CURR_CODE
     * 
     */
    @JsonProperty("currCode")
    public void setCurrCode(String currCode) {
        this.currCode = currCode;
    }

    public CurrencyCodes100GetRequest withCurrCode(String currCode) {
        this.currCode = currCode;
        return this;
    }

    /**
     * ISO
     * Standard
     * Code
     * <p>
     * Lineage reference object : GTVCURR_SCOD_CODE_ISO
     * 
     */
    @JsonProperty("scodCodeIso")
    public String getScodCodeIso() {
        return scodCodeIso;
    }

    /**
     * ISO
     * Standard
     * Code
     * <p>
     * Lineage reference object : GTVCURR_SCOD_CODE_ISO
     * 
     */
    @JsonProperty("scodCodeIso")
    public void setScodCodeIso(String scodCodeIso) {
        this.scodCodeIso = scodCodeIso;
    }

    public CurrencyCodes100GetRequest withScodCodeIso(String scodCodeIso) {
        this.scodCodeIso = scodCodeIso;
        return this;
    }

    /**
     * Status
     * <p>
     * Lineage reference object : GTVCURR_STATUS_IND
     * 
     */
    @JsonProperty("statusInd")
    public String getStatusInd() {
        return statusInd;
    }

    /**
     * Status
     * <p>
     * Lineage reference object : GTVCURR_STATUS_IND
     * 
     */
    @JsonProperty("statusInd")
    public void setStatusInd(String statusInd) {
        this.statusInd = statusInd;
    }

    public CurrencyCodes100GetRequest withStatusInd(String statusInd) {
        this.statusInd = statusInd;
        return this;
    }

    /**
     * Title
     * <p>
     * Lineage reference object : GTVCURR_TITLE
     * 
     */
    @JsonProperty("title")
    public String getTitle() {
        return title;
    }

    /**
     * Title
     * <p>
     * Lineage reference object : GTVCURR_TITLE
     * 
     */
    @JsonProperty("title")
    public void setTitle(String title) {
        this.title = title;
    }

    public CurrencyCodes100GetRequest withTitle(String title) {
        this.title = title;
        return this;
    }

    /**
     * Effective
     * Date
     * <p>
     * Lineage reference object : GTVCURR_RATE_EFF_DATE
     * 
     */
    @JsonProperty("rateEffDate")
    public Date getRateEffDate() {
        return rateEffDate;
    }

    /**
     * Effective
     * Date
     * <p>
     * Lineage reference object : GTVCURR_RATE_EFF_DATE
     * 
     */
    @JsonProperty("rateEffDate")
    public void setRateEffDate(Date rateEffDate) {
        this.rateEffDate = rateEffDate;
    }

    public CurrencyCodes100GetRequest withRateEffDate(Date rateEffDate) {
        this.rateEffDate = rateEffDate;
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

    public CurrencyCodes100GetRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(CurrencyCodes100GetRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("rateTermDate");
        sb.append('=');
        sb.append(((this.rateTermDate == null)?"<null>":this.rateTermDate));
        sb.append(',');
        sb.append("currCode");
        sb.append('=');
        sb.append(((this.currCode == null)?"<null>":this.currCode));
        sb.append(',');
        sb.append("scodCodeIso");
        sb.append('=');
        sb.append(((this.scodCodeIso == null)?"<null>":this.scodCodeIso));
        sb.append(',');
        sb.append("statusInd");
        sb.append('=');
        sb.append(((this.statusInd == null)?"<null>":this.statusInd));
        sb.append(',');
        sb.append("title");
        sb.append('=');
        sb.append(((this.title == null)?"<null>":this.title));
        sb.append(',');
        sb.append("rateEffDate");
        sb.append('=');
        sb.append(((this.rateEffDate == null)?"<null>":this.rateEffDate));
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
        result = ((result* 31)+((this.rateTermDate == null)? 0 :this.rateTermDate.hashCode()));
        result = ((result* 31)+((this.currCode == null)? 0 :this.currCode.hashCode()));
        result = ((result* 31)+((this.scodCodeIso == null)? 0 :this.scodCodeIso.hashCode()));
        result = ((result* 31)+((this.statusInd == null)? 0 :this.statusInd.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.title == null)? 0 :this.title.hashCode()));
        result = ((result* 31)+((this.rateEffDate == null)? 0 :this.rateEffDate.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof CurrencyCodes100GetRequest) == false) {
            return false;
        }
        CurrencyCodes100GetRequest rhs = ((CurrencyCodes100GetRequest) other);
        return ((((((((this.rateTermDate == rhs.rateTermDate)||((this.rateTermDate!= null)&&this.rateTermDate.equals(rhs.rateTermDate)))&&((this.currCode == rhs.currCode)||((this.currCode!= null)&&this.currCode.equals(rhs.currCode))))&&((this.scodCodeIso == rhs.scodCodeIso)||((this.scodCodeIso!= null)&&this.scodCodeIso.equals(rhs.scodCodeIso))))&&((this.statusInd == rhs.statusInd)||((this.statusInd!= null)&&this.statusInd.equals(rhs.statusInd))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.title == rhs.title)||((this.title!= null)&&this.title.equals(rhs.title))))&&((this.rateEffDate == rhs.rateEffDate)||((this.rateEffDate!= null)&&this.rateEffDate.equals(rhs.rateEffDate))));
    }

}
