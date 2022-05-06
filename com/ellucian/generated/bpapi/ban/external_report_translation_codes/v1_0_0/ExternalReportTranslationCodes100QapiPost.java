
package com.ellucian.generated.bpapi.ban.external_report_translation_codes.v1_0_0;

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
    "coasCode",
    "eelcCode",
    "eeliCode",
    "eeltCode",
    "eentCode",
    "effDate",
    "statusInd",
    "termDate",
    "internalCodeTitle"
})
@Generated("jsonschema2pojo")
public class ExternalReportTranslationCodes100QapiPost {

    /**
     * COA
     * <p>
     * Lineage reference object : FTVEELT_COAS_CODE
     * 
     */
    @JsonProperty("coasCode")
    @JsonPropertyDescription("Lineage reference object : FTVEELT_COAS_CODE")
    private String coasCode;
    /**
     * Internal Element
     * <p>
     * Lineage reference object : FTVEELT_EELC_CODE
     * 
     */
    @JsonProperty("eelcCode")
    @JsonPropertyDescription("Lineage reference object : FTVEELT_EELC_CODE")
    private String eelcCode;
    /**
     * External	Code
     * <p>
     * Lineage reference object : FTVEELT_EELI_CODE, Lookup lineage reference object : ftveeli
     * 
     */
    @JsonProperty("eeliCode")
    @JsonPropertyDescription("Lineage reference object : FTVEELT_EELI_CODE, Lookup lineage reference object : ftveeli")
    private String eeliCode;
    /**
     * Internal Code
     * <p>
     * Lineage reference object : FTVEELT_EELT_CODE
     * 
     */
    @JsonProperty("eeltCode")
    @JsonPropertyDescription("Lineage reference object : FTVEELT_EELT_CODE")
    private String eeltCode;
    /**
     * External Entity
     * <p>
     * Lineage reference object : FTVEELT_EENT_CODE
     * 
     */
    @JsonProperty("eentCode")
    @JsonPropertyDescription("Lineage reference object : FTVEELT_EENT_CODE")
    private String eentCode;
    /**
     * Effective Date
     * <p>
     * Lineage reference object : FTVEELT_EFF_DATE
     * 
     */
    @JsonProperty("effDate")
    @JsonPropertyDescription("Lineage reference object : FTVEELT_EFF_DATE")
    private Date effDate;
    /**
     * Status
     * <p>
     * Lineage reference object : FTVEELT_STATUS_IND
     * 
     */
    @JsonProperty("statusInd")
    @JsonPropertyDescription("Lineage reference object : FTVEELT_STATUS_IND")
    private String statusInd;
    /**
     * Termination Date
     * <p>
     * Lineage reference object : FTVEELT_TERM_DATE
     * 
     */
    @JsonProperty("termDate")
    @JsonPropertyDescription("Lineage reference object : FTVEELT_TERM_DATE")
    private Date termDate;
    /**
     * Translation Title
     * <p>
     * 
     * 
     */
    @JsonProperty("internalCodeTitle")
    private String internalCodeTitle;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * COA
     * <p>
     * Lineage reference object : FTVEELT_COAS_CODE
     * 
     */
    @JsonProperty("coasCode")
    public String getCoasCode() {
        return coasCode;
    }

    /**
     * COA
     * <p>
     * Lineage reference object : FTVEELT_COAS_CODE
     * 
     */
    @JsonProperty("coasCode")
    public void setCoasCode(String coasCode) {
        this.coasCode = coasCode;
    }

    public ExternalReportTranslationCodes100QapiPost withCoasCode(String coasCode) {
        this.coasCode = coasCode;
        return this;
    }

    /**
     * Internal Element
     * <p>
     * Lineage reference object : FTVEELT_EELC_CODE
     * 
     */
    @JsonProperty("eelcCode")
    public String getEelcCode() {
        return eelcCode;
    }

    /**
     * Internal Element
     * <p>
     * Lineage reference object : FTVEELT_EELC_CODE
     * 
     */
    @JsonProperty("eelcCode")
    public void setEelcCode(String eelcCode) {
        this.eelcCode = eelcCode;
    }

    public ExternalReportTranslationCodes100QapiPost withEelcCode(String eelcCode) {
        this.eelcCode = eelcCode;
        return this;
    }

    /**
     * External	Code
     * <p>
     * Lineage reference object : FTVEELT_EELI_CODE, Lookup lineage reference object : ftveeli
     * 
     */
    @JsonProperty("eeliCode")
    public String getEeliCode() {
        return eeliCode;
    }

    /**
     * External	Code
     * <p>
     * Lineage reference object : FTVEELT_EELI_CODE, Lookup lineage reference object : ftveeli
     * 
     */
    @JsonProperty("eeliCode")
    public void setEeliCode(String eeliCode) {
        this.eeliCode = eeliCode;
    }

    public ExternalReportTranslationCodes100QapiPost withEeliCode(String eeliCode) {
        this.eeliCode = eeliCode;
        return this;
    }

    /**
     * Internal Code
     * <p>
     * Lineage reference object : FTVEELT_EELT_CODE
     * 
     */
    @JsonProperty("eeltCode")
    public String getEeltCode() {
        return eeltCode;
    }

    /**
     * Internal Code
     * <p>
     * Lineage reference object : FTVEELT_EELT_CODE
     * 
     */
    @JsonProperty("eeltCode")
    public void setEeltCode(String eeltCode) {
        this.eeltCode = eeltCode;
    }

    public ExternalReportTranslationCodes100QapiPost withEeltCode(String eeltCode) {
        this.eeltCode = eeltCode;
        return this;
    }

    /**
     * External Entity
     * <p>
     * Lineage reference object : FTVEELT_EENT_CODE
     * 
     */
    @JsonProperty("eentCode")
    public String getEentCode() {
        return eentCode;
    }

    /**
     * External Entity
     * <p>
     * Lineage reference object : FTVEELT_EENT_CODE
     * 
     */
    @JsonProperty("eentCode")
    public void setEentCode(String eentCode) {
        this.eentCode = eentCode;
    }

    public ExternalReportTranslationCodes100QapiPost withEentCode(String eentCode) {
        this.eentCode = eentCode;
        return this;
    }

    /**
     * Effective Date
     * <p>
     * Lineage reference object : FTVEELT_EFF_DATE
     * 
     */
    @JsonProperty("effDate")
    public Date getEffDate() {
        return effDate;
    }

    /**
     * Effective Date
     * <p>
     * Lineage reference object : FTVEELT_EFF_DATE
     * 
     */
    @JsonProperty("effDate")
    public void setEffDate(Date effDate) {
        this.effDate = effDate;
    }

    public ExternalReportTranslationCodes100QapiPost withEffDate(Date effDate) {
        this.effDate = effDate;
        return this;
    }

    /**
     * Status
     * <p>
     * Lineage reference object : FTVEELT_STATUS_IND
     * 
     */
    @JsonProperty("statusInd")
    public String getStatusInd() {
        return statusInd;
    }

    /**
     * Status
     * <p>
     * Lineage reference object : FTVEELT_STATUS_IND
     * 
     */
    @JsonProperty("statusInd")
    public void setStatusInd(String statusInd) {
        this.statusInd = statusInd;
    }

    public ExternalReportTranslationCodes100QapiPost withStatusInd(String statusInd) {
        this.statusInd = statusInd;
        return this;
    }

    /**
     * Termination Date
     * <p>
     * Lineage reference object : FTVEELT_TERM_DATE
     * 
     */
    @JsonProperty("termDate")
    public Date getTermDate() {
        return termDate;
    }

    /**
     * Termination Date
     * <p>
     * Lineage reference object : FTVEELT_TERM_DATE
     * 
     */
    @JsonProperty("termDate")
    public void setTermDate(Date termDate) {
        this.termDate = termDate;
    }

    public ExternalReportTranslationCodes100QapiPost withTermDate(Date termDate) {
        this.termDate = termDate;
        return this;
    }

    /**
     * Translation Title
     * <p>
     * 
     * 
     */
    @JsonProperty("internalCodeTitle")
    public String getInternalCodeTitle() {
        return internalCodeTitle;
    }

    /**
     * Translation Title
     * <p>
     * 
     * 
     */
    @JsonProperty("internalCodeTitle")
    public void setInternalCodeTitle(String internalCodeTitle) {
        this.internalCodeTitle = internalCodeTitle;
    }

    public ExternalReportTranslationCodes100QapiPost withInternalCodeTitle(String internalCodeTitle) {
        this.internalCodeTitle = internalCodeTitle;
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

    public ExternalReportTranslationCodes100QapiPost withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ExternalReportTranslationCodes100QapiPost.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("coasCode");
        sb.append('=');
        sb.append(((this.coasCode == null)?"<null>":this.coasCode));
        sb.append(',');
        sb.append("eelcCode");
        sb.append('=');
        sb.append(((this.eelcCode == null)?"<null>":this.eelcCode));
        sb.append(',');
        sb.append("eeliCode");
        sb.append('=');
        sb.append(((this.eeliCode == null)?"<null>":this.eeliCode));
        sb.append(',');
        sb.append("eeltCode");
        sb.append('=');
        sb.append(((this.eeltCode == null)?"<null>":this.eeltCode));
        sb.append(',');
        sb.append("eentCode");
        sb.append('=');
        sb.append(((this.eentCode == null)?"<null>":this.eentCode));
        sb.append(',');
        sb.append("effDate");
        sb.append('=');
        sb.append(((this.effDate == null)?"<null>":this.effDate));
        sb.append(',');
        sb.append("statusInd");
        sb.append('=');
        sb.append(((this.statusInd == null)?"<null>":this.statusInd));
        sb.append(',');
        sb.append("termDate");
        sb.append('=');
        sb.append(((this.termDate == null)?"<null>":this.termDate));
        sb.append(',');
        sb.append("internalCodeTitle");
        sb.append('=');
        sb.append(((this.internalCodeTitle == null)?"<null>":this.internalCodeTitle));
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
        result = ((result* 31)+((this.eentCode == null)? 0 :this.eentCode.hashCode()));
        result = ((result* 31)+((this.effDate == null)? 0 :this.effDate.hashCode()));
        result = ((result* 31)+((this.internalCodeTitle == null)? 0 :this.internalCodeTitle.hashCode()));
        result = ((result* 31)+((this.eeliCode == null)? 0 :this.eeliCode.hashCode()));
        result = ((result* 31)+((this.statusInd == null)? 0 :this.statusInd.hashCode()));
        result = ((result* 31)+((this.coasCode == null)? 0 :this.coasCode.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.termDate == null)? 0 :this.termDate.hashCode()));
        result = ((result* 31)+((this.eelcCode == null)? 0 :this.eelcCode.hashCode()));
        result = ((result* 31)+((this.eeltCode == null)? 0 :this.eeltCode.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ExternalReportTranslationCodes100QapiPost) == false) {
            return false;
        }
        ExternalReportTranslationCodes100QapiPost rhs = ((ExternalReportTranslationCodes100QapiPost) other);
        return (((((((((((this.eentCode == rhs.eentCode)||((this.eentCode!= null)&&this.eentCode.equals(rhs.eentCode)))&&((this.effDate == rhs.effDate)||((this.effDate!= null)&&this.effDate.equals(rhs.effDate))))&&((this.internalCodeTitle == rhs.internalCodeTitle)||((this.internalCodeTitle!= null)&&this.internalCodeTitle.equals(rhs.internalCodeTitle))))&&((this.eeliCode == rhs.eeliCode)||((this.eeliCode!= null)&&this.eeliCode.equals(rhs.eeliCode))))&&((this.statusInd == rhs.statusInd)||((this.statusInd!= null)&&this.statusInd.equals(rhs.statusInd))))&&((this.coasCode == rhs.coasCode)||((this.coasCode!= null)&&this.coasCode.equals(rhs.coasCode))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.termDate == rhs.termDate)||((this.termDate!= null)&&this.termDate.equals(rhs.termDate))))&&((this.eelcCode == rhs.eelcCode)||((this.eelcCode!= null)&&this.eelcCode.equals(rhs.eelcCode))))&&((this.eeltCode == rhs.eeltCode)||((this.eeltCode!= null)&&this.eeltCode.equals(rhs.eeltCode))));
    }

}
