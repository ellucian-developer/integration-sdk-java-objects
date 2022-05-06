
package com.ellucian.generated.bpapi.ban.admissions_decision_processing.v1_0_0;

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
    "fullpartDesc",
    "reqDocInd",
    "stvadmtDesc",
    "stvresdDesc",
    "applDate",
    "stvsessDesc",
    "stvapdcDesc",
    "applNo",
    "resdCode",
    "sarappdApdcCode",
    "stvapstDesc",
    "apstCode",
    "sessCode",
    "admtCode",
    "stvstypDesc",
    "applPreference",
    "stypCode",
    "fullPartInd",
    "termCodeEntry"
})
@Generated("jsonschema2pojo")
public class Saradap {

    @JsonProperty("fullpartDesc")
    private String fullpartDesc;
    @JsonProperty("reqDocInd")
    private String reqDocInd;
    /**
     * Admission Type Description
     * <p>
     * 
     * 
     */
    @JsonProperty("stvadmtDesc")
    private String stvadmtDesc;
    @JsonProperty("stvresdDesc")
    private String stvresdDesc;
    /**
     * Application Date
     * <p>
     * Lineage reference object : SARADAP_APPL_DATE
     * (Required)
     * 
     */
    @JsonProperty("applDate")
    @JsonPropertyDescription("Lineage reference object : SARADAP_APPL_DATE")
    private Date applDate;
    @JsonProperty("stvsessDesc")
    private String stvsessDesc;
    /**
     * Decision Description
     * <p>
     * 
     * 
     */
    @JsonProperty("stvapdcDesc")
    private String stvapdcDesc;
    /**
     * Application Number
     * <p>
     * Lineage reference object : SARADAP_APPL_NO
     * (Required)
     * 
     */
    @JsonProperty("applNo")
    @JsonPropertyDescription("Lineage reference object : SARADAP_APPL_NO")
    private Double applNo;
    /**
     * Residence
     * <p>
     * Lineage reference object : SARADAP_RESD_CODE, Lookup lineage reference object : stvresd
     * (Required)
     * 
     */
    @JsonProperty("resdCode")
    @JsonPropertyDescription("Lineage reference object : SARADAP_RESD_CODE, Lookup lineage reference object : stvresd")
    private String resdCode;
    /**
     * Decision
     * <p>
     * Lookup lineage reference object : stvapdc
     * 
     */
    @JsonProperty("sarappdApdcCode")
    @JsonPropertyDescription("Lookup lineage reference object : stvapdc")
    private String sarappdApdcCode;
    /**
     * Status Description
     * <p>
     * 
     * 
     */
    @JsonProperty("stvapstDesc")
    private String stvapstDesc;
    /**
     * Status
     * <p>
     * Lineage reference object : SARADAP_APST_CODE, Lookup lineage reference object : stvapst
     * (Required)
     * 
     */
    @JsonProperty("apstCode")
    @JsonPropertyDescription("Lineage reference object : SARADAP_APST_CODE, Lookup lineage reference object : stvapst")
    private String apstCode;
    /**
     * Session
     * <p>
     * Lineage reference object : SARADAP_SESS_CODE, Lookup lineage reference object : stvsess
     * 
     */
    @JsonProperty("sessCode")
    @JsonPropertyDescription("Lineage reference object : SARADAP_SESS_CODE, Lookup lineage reference object : stvsess")
    private String sessCode;
    /**
     * Admission Type
     * <p>
     * Lineage reference object : SARADAP_ADMT_CODE, Lookup lineage reference object : stvadmt
     * 
     */
    @JsonProperty("admtCode")
    @JsonPropertyDescription("Lineage reference object : SARADAP_ADMT_CODE, Lookup lineage reference object : stvadmt")
    private String admtCode;
    @JsonProperty("stvstypDesc")
    private String stvstypDesc;
    /**
     * Application Preference
     * <p>
     * Lineage reference object : SARADAP_APPL_PREFERENCE
     * 
     */
    @JsonProperty("applPreference")
    @JsonPropertyDescription("Lineage reference object : SARADAP_APPL_PREFERENCE")
    private Double applPreference;
    /**
     * Student Type
     * <p>
     * Lineage reference object : SARADAP_STYP_CODE, Lookup lineage reference object : stvstyp
     * (Required)
     * 
     */
    @JsonProperty("stypCode")
    @JsonPropertyDescription("Lineage reference object : SARADAP_STYP_CODE, Lookup lineage reference object : stvstyp")
    private String stypCode;
    /**
     * Full or Part Time
     * <p>
     * Lineage reference object : SARADAP_FULL_PART_IND
     * 
     */
    @JsonProperty("fullPartInd")
    @JsonPropertyDescription("Lineage reference object : SARADAP_FULL_PART_IND")
    private String fullPartInd;
    /**
     * Entry Term
     * <p>
     * Lineage reference object : SARADAP_TERM_CODE_ENTRY, Lookup lineage reference object : stvterm
     * (Required)
     * 
     */
    @JsonProperty("termCodeEntry")
    @JsonPropertyDescription("Lineage reference object : SARADAP_TERM_CODE_ENTRY, Lookup lineage reference object : stvterm")
    private String termCodeEntry;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("fullpartDesc")
    public String getFullpartDesc() {
        return fullpartDesc;
    }

    @JsonProperty("fullpartDesc")
    public void setFullpartDesc(String fullpartDesc) {
        this.fullpartDesc = fullpartDesc;
    }

    public Saradap withFullpartDesc(String fullpartDesc) {
        this.fullpartDesc = fullpartDesc;
        return this;
    }

    @JsonProperty("reqDocInd")
    public String getReqDocInd() {
        return reqDocInd;
    }

    @JsonProperty("reqDocInd")
    public void setReqDocInd(String reqDocInd) {
        this.reqDocInd = reqDocInd;
    }

    public Saradap withReqDocInd(String reqDocInd) {
        this.reqDocInd = reqDocInd;
        return this;
    }

    /**
     * Admission Type Description
     * <p>
     * 
     * 
     */
    @JsonProperty("stvadmtDesc")
    public String getStvadmtDesc() {
        return stvadmtDesc;
    }

    /**
     * Admission Type Description
     * <p>
     * 
     * 
     */
    @JsonProperty("stvadmtDesc")
    public void setStvadmtDesc(String stvadmtDesc) {
        this.stvadmtDesc = stvadmtDesc;
    }

    public Saradap withStvadmtDesc(String stvadmtDesc) {
        this.stvadmtDesc = stvadmtDesc;
        return this;
    }

    @JsonProperty("stvresdDesc")
    public String getStvresdDesc() {
        return stvresdDesc;
    }

    @JsonProperty("stvresdDesc")
    public void setStvresdDesc(String stvresdDesc) {
        this.stvresdDesc = stvresdDesc;
    }

    public Saradap withStvresdDesc(String stvresdDesc) {
        this.stvresdDesc = stvresdDesc;
        return this;
    }

    /**
     * Application Date
     * <p>
     * Lineage reference object : SARADAP_APPL_DATE
     * (Required)
     * 
     */
    @JsonProperty("applDate")
    public Date getApplDate() {
        return applDate;
    }

    /**
     * Application Date
     * <p>
     * Lineage reference object : SARADAP_APPL_DATE
     * (Required)
     * 
     */
    @JsonProperty("applDate")
    public void setApplDate(Date applDate) {
        this.applDate = applDate;
    }

    public Saradap withApplDate(Date applDate) {
        this.applDate = applDate;
        return this;
    }

    @JsonProperty("stvsessDesc")
    public String getStvsessDesc() {
        return stvsessDesc;
    }

    @JsonProperty("stvsessDesc")
    public void setStvsessDesc(String stvsessDesc) {
        this.stvsessDesc = stvsessDesc;
    }

    public Saradap withStvsessDesc(String stvsessDesc) {
        this.stvsessDesc = stvsessDesc;
        return this;
    }

    /**
     * Decision Description
     * <p>
     * 
     * 
     */
    @JsonProperty("stvapdcDesc")
    public String getStvapdcDesc() {
        return stvapdcDesc;
    }

    /**
     * Decision Description
     * <p>
     * 
     * 
     */
    @JsonProperty("stvapdcDesc")
    public void setStvapdcDesc(String stvapdcDesc) {
        this.stvapdcDesc = stvapdcDesc;
    }

    public Saradap withStvapdcDesc(String stvapdcDesc) {
        this.stvapdcDesc = stvapdcDesc;
        return this;
    }

    /**
     * Application Number
     * <p>
     * Lineage reference object : SARADAP_APPL_NO
     * (Required)
     * 
     */
    @JsonProperty("applNo")
    public Double getApplNo() {
        return applNo;
    }

    /**
     * Application Number
     * <p>
     * Lineage reference object : SARADAP_APPL_NO
     * (Required)
     * 
     */
    @JsonProperty("applNo")
    public void setApplNo(Double applNo) {
        this.applNo = applNo;
    }

    public Saradap withApplNo(Double applNo) {
        this.applNo = applNo;
        return this;
    }

    /**
     * Residence
     * <p>
     * Lineage reference object : SARADAP_RESD_CODE, Lookup lineage reference object : stvresd
     * (Required)
     * 
     */
    @JsonProperty("resdCode")
    public String getResdCode() {
        return resdCode;
    }

    /**
     * Residence
     * <p>
     * Lineage reference object : SARADAP_RESD_CODE, Lookup lineage reference object : stvresd
     * (Required)
     * 
     */
    @JsonProperty("resdCode")
    public void setResdCode(String resdCode) {
        this.resdCode = resdCode;
    }

    public Saradap withResdCode(String resdCode) {
        this.resdCode = resdCode;
        return this;
    }

    /**
     * Decision
     * <p>
     * Lookup lineage reference object : stvapdc
     * 
     */
    @JsonProperty("sarappdApdcCode")
    public String getSarappdApdcCode() {
        return sarappdApdcCode;
    }

    /**
     * Decision
     * <p>
     * Lookup lineage reference object : stvapdc
     * 
     */
    @JsonProperty("sarappdApdcCode")
    public void setSarappdApdcCode(String sarappdApdcCode) {
        this.sarappdApdcCode = sarappdApdcCode;
    }

    public Saradap withSarappdApdcCode(String sarappdApdcCode) {
        this.sarappdApdcCode = sarappdApdcCode;
        return this;
    }

    /**
     * Status Description
     * <p>
     * 
     * 
     */
    @JsonProperty("stvapstDesc")
    public String getStvapstDesc() {
        return stvapstDesc;
    }

    /**
     * Status Description
     * <p>
     * 
     * 
     */
    @JsonProperty("stvapstDesc")
    public void setStvapstDesc(String stvapstDesc) {
        this.stvapstDesc = stvapstDesc;
    }

    public Saradap withStvapstDesc(String stvapstDesc) {
        this.stvapstDesc = stvapstDesc;
        return this;
    }

    /**
     * Status
     * <p>
     * Lineage reference object : SARADAP_APST_CODE, Lookup lineage reference object : stvapst
     * (Required)
     * 
     */
    @JsonProperty("apstCode")
    public String getApstCode() {
        return apstCode;
    }

    /**
     * Status
     * <p>
     * Lineage reference object : SARADAP_APST_CODE, Lookup lineage reference object : stvapst
     * (Required)
     * 
     */
    @JsonProperty("apstCode")
    public void setApstCode(String apstCode) {
        this.apstCode = apstCode;
    }

    public Saradap withApstCode(String apstCode) {
        this.apstCode = apstCode;
        return this;
    }

    /**
     * Session
     * <p>
     * Lineage reference object : SARADAP_SESS_CODE, Lookup lineage reference object : stvsess
     * 
     */
    @JsonProperty("sessCode")
    public String getSessCode() {
        return sessCode;
    }

    /**
     * Session
     * <p>
     * Lineage reference object : SARADAP_SESS_CODE, Lookup lineage reference object : stvsess
     * 
     */
    @JsonProperty("sessCode")
    public void setSessCode(String sessCode) {
        this.sessCode = sessCode;
    }

    public Saradap withSessCode(String sessCode) {
        this.sessCode = sessCode;
        return this;
    }

    /**
     * Admission Type
     * <p>
     * Lineage reference object : SARADAP_ADMT_CODE, Lookup lineage reference object : stvadmt
     * 
     */
    @JsonProperty("admtCode")
    public String getAdmtCode() {
        return admtCode;
    }

    /**
     * Admission Type
     * <p>
     * Lineage reference object : SARADAP_ADMT_CODE, Lookup lineage reference object : stvadmt
     * 
     */
    @JsonProperty("admtCode")
    public void setAdmtCode(String admtCode) {
        this.admtCode = admtCode;
    }

    public Saradap withAdmtCode(String admtCode) {
        this.admtCode = admtCode;
        return this;
    }

    @JsonProperty("stvstypDesc")
    public String getStvstypDesc() {
        return stvstypDesc;
    }

    @JsonProperty("stvstypDesc")
    public void setStvstypDesc(String stvstypDesc) {
        this.stvstypDesc = stvstypDesc;
    }

    public Saradap withStvstypDesc(String stvstypDesc) {
        this.stvstypDesc = stvstypDesc;
        return this;
    }

    /**
     * Application Preference
     * <p>
     * Lineage reference object : SARADAP_APPL_PREFERENCE
     * 
     */
    @JsonProperty("applPreference")
    public Double getApplPreference() {
        return applPreference;
    }

    /**
     * Application Preference
     * <p>
     * Lineage reference object : SARADAP_APPL_PREFERENCE
     * 
     */
    @JsonProperty("applPreference")
    public void setApplPreference(Double applPreference) {
        this.applPreference = applPreference;
    }

    public Saradap withApplPreference(Double applPreference) {
        this.applPreference = applPreference;
        return this;
    }

    /**
     * Student Type
     * <p>
     * Lineage reference object : SARADAP_STYP_CODE, Lookup lineage reference object : stvstyp
     * (Required)
     * 
     */
    @JsonProperty("stypCode")
    public String getStypCode() {
        return stypCode;
    }

    /**
     * Student Type
     * <p>
     * Lineage reference object : SARADAP_STYP_CODE, Lookup lineage reference object : stvstyp
     * (Required)
     * 
     */
    @JsonProperty("stypCode")
    public void setStypCode(String stypCode) {
        this.stypCode = stypCode;
    }

    public Saradap withStypCode(String stypCode) {
        this.stypCode = stypCode;
        return this;
    }

    /**
     * Full or Part Time
     * <p>
     * Lineage reference object : SARADAP_FULL_PART_IND
     * 
     */
    @JsonProperty("fullPartInd")
    public String getFullPartInd() {
        return fullPartInd;
    }

    /**
     * Full or Part Time
     * <p>
     * Lineage reference object : SARADAP_FULL_PART_IND
     * 
     */
    @JsonProperty("fullPartInd")
    public void setFullPartInd(String fullPartInd) {
        this.fullPartInd = fullPartInd;
    }

    public Saradap withFullPartInd(String fullPartInd) {
        this.fullPartInd = fullPartInd;
        return this;
    }

    /**
     * Entry Term
     * <p>
     * Lineage reference object : SARADAP_TERM_CODE_ENTRY, Lookup lineage reference object : stvterm
     * (Required)
     * 
     */
    @JsonProperty("termCodeEntry")
    public String getTermCodeEntry() {
        return termCodeEntry;
    }

    /**
     * Entry Term
     * <p>
     * Lineage reference object : SARADAP_TERM_CODE_ENTRY, Lookup lineage reference object : stvterm
     * (Required)
     * 
     */
    @JsonProperty("termCodeEntry")
    public void setTermCodeEntry(String termCodeEntry) {
        this.termCodeEntry = termCodeEntry;
    }

    public Saradap withTermCodeEntry(String termCodeEntry) {
        this.termCodeEntry = termCodeEntry;
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

    public Saradap withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Saradap.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("fullpartDesc");
        sb.append('=');
        sb.append(((this.fullpartDesc == null)?"<null>":this.fullpartDesc));
        sb.append(',');
        sb.append("reqDocInd");
        sb.append('=');
        sb.append(((this.reqDocInd == null)?"<null>":this.reqDocInd));
        sb.append(',');
        sb.append("stvadmtDesc");
        sb.append('=');
        sb.append(((this.stvadmtDesc == null)?"<null>":this.stvadmtDesc));
        sb.append(',');
        sb.append("stvresdDesc");
        sb.append('=');
        sb.append(((this.stvresdDesc == null)?"<null>":this.stvresdDesc));
        sb.append(',');
        sb.append("applDate");
        sb.append('=');
        sb.append(((this.applDate == null)?"<null>":this.applDate));
        sb.append(',');
        sb.append("stvsessDesc");
        sb.append('=');
        sb.append(((this.stvsessDesc == null)?"<null>":this.stvsessDesc));
        sb.append(',');
        sb.append("stvapdcDesc");
        sb.append('=');
        sb.append(((this.stvapdcDesc == null)?"<null>":this.stvapdcDesc));
        sb.append(',');
        sb.append("applNo");
        sb.append('=');
        sb.append(((this.applNo == null)?"<null>":this.applNo));
        sb.append(',');
        sb.append("resdCode");
        sb.append('=');
        sb.append(((this.resdCode == null)?"<null>":this.resdCode));
        sb.append(',');
        sb.append("sarappdApdcCode");
        sb.append('=');
        sb.append(((this.sarappdApdcCode == null)?"<null>":this.sarappdApdcCode));
        sb.append(',');
        sb.append("stvapstDesc");
        sb.append('=');
        sb.append(((this.stvapstDesc == null)?"<null>":this.stvapstDesc));
        sb.append(',');
        sb.append("apstCode");
        sb.append('=');
        sb.append(((this.apstCode == null)?"<null>":this.apstCode));
        sb.append(',');
        sb.append("sessCode");
        sb.append('=');
        sb.append(((this.sessCode == null)?"<null>":this.sessCode));
        sb.append(',');
        sb.append("admtCode");
        sb.append('=');
        sb.append(((this.admtCode == null)?"<null>":this.admtCode));
        sb.append(',');
        sb.append("stvstypDesc");
        sb.append('=');
        sb.append(((this.stvstypDesc == null)?"<null>":this.stvstypDesc));
        sb.append(',');
        sb.append("applPreference");
        sb.append('=');
        sb.append(((this.applPreference == null)?"<null>":this.applPreference));
        sb.append(',');
        sb.append("stypCode");
        sb.append('=');
        sb.append(((this.stypCode == null)?"<null>":this.stypCode));
        sb.append(',');
        sb.append("fullPartInd");
        sb.append('=');
        sb.append(((this.fullPartInd == null)?"<null>":this.fullPartInd));
        sb.append(',');
        sb.append("termCodeEntry");
        sb.append('=');
        sb.append(((this.termCodeEntry == null)?"<null>":this.termCodeEntry));
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
        result = ((result* 31)+((this.fullpartDesc == null)? 0 :this.fullpartDesc.hashCode()));
        result = ((result* 31)+((this.reqDocInd == null)? 0 :this.reqDocInd.hashCode()));
        result = ((result* 31)+((this.stvadmtDesc == null)? 0 :this.stvadmtDesc.hashCode()));
        result = ((result* 31)+((this.stvresdDesc == null)? 0 :this.stvresdDesc.hashCode()));
        result = ((result* 31)+((this.applDate == null)? 0 :this.applDate.hashCode()));
        result = ((result* 31)+((this.stvsessDesc == null)? 0 :this.stvsessDesc.hashCode()));
        result = ((result* 31)+((this.stvapdcDesc == null)? 0 :this.stvapdcDesc.hashCode()));
        result = ((result* 31)+((this.applNo == null)? 0 :this.applNo.hashCode()));
        result = ((result* 31)+((this.resdCode == null)? 0 :this.resdCode.hashCode()));
        result = ((result* 31)+((this.sarappdApdcCode == null)? 0 :this.sarappdApdcCode.hashCode()));
        result = ((result* 31)+((this.stvapstDesc == null)? 0 :this.stvapstDesc.hashCode()));
        result = ((result* 31)+((this.apstCode == null)? 0 :this.apstCode.hashCode()));
        result = ((result* 31)+((this.sessCode == null)? 0 :this.sessCode.hashCode()));
        result = ((result* 31)+((this.admtCode == null)? 0 :this.admtCode.hashCode()));
        result = ((result* 31)+((this.stvstypDesc == null)? 0 :this.stvstypDesc.hashCode()));
        result = ((result* 31)+((this.applPreference == null)? 0 :this.applPreference.hashCode()));
        result = ((result* 31)+((this.stypCode == null)? 0 :this.stypCode.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.fullPartInd == null)? 0 :this.fullPartInd.hashCode()));
        result = ((result* 31)+((this.termCodeEntry == null)? 0 :this.termCodeEntry.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Saradap) == false) {
            return false;
        }
        Saradap rhs = ((Saradap) other);
        return (((((((((((((((((((((this.fullpartDesc == rhs.fullpartDesc)||((this.fullpartDesc!= null)&&this.fullpartDesc.equals(rhs.fullpartDesc)))&&((this.reqDocInd == rhs.reqDocInd)||((this.reqDocInd!= null)&&this.reqDocInd.equals(rhs.reqDocInd))))&&((this.stvadmtDesc == rhs.stvadmtDesc)||((this.stvadmtDesc!= null)&&this.stvadmtDesc.equals(rhs.stvadmtDesc))))&&((this.stvresdDesc == rhs.stvresdDesc)||((this.stvresdDesc!= null)&&this.stvresdDesc.equals(rhs.stvresdDesc))))&&((this.applDate == rhs.applDate)||((this.applDate!= null)&&this.applDate.equals(rhs.applDate))))&&((this.stvsessDesc == rhs.stvsessDesc)||((this.stvsessDesc!= null)&&this.stvsessDesc.equals(rhs.stvsessDesc))))&&((this.stvapdcDesc == rhs.stvapdcDesc)||((this.stvapdcDesc!= null)&&this.stvapdcDesc.equals(rhs.stvapdcDesc))))&&((this.applNo == rhs.applNo)||((this.applNo!= null)&&this.applNo.equals(rhs.applNo))))&&((this.resdCode == rhs.resdCode)||((this.resdCode!= null)&&this.resdCode.equals(rhs.resdCode))))&&((this.sarappdApdcCode == rhs.sarappdApdcCode)||((this.sarappdApdcCode!= null)&&this.sarappdApdcCode.equals(rhs.sarappdApdcCode))))&&((this.stvapstDesc == rhs.stvapstDesc)||((this.stvapstDesc!= null)&&this.stvapstDesc.equals(rhs.stvapstDesc))))&&((this.apstCode == rhs.apstCode)||((this.apstCode!= null)&&this.apstCode.equals(rhs.apstCode))))&&((this.sessCode == rhs.sessCode)||((this.sessCode!= null)&&this.sessCode.equals(rhs.sessCode))))&&((this.admtCode == rhs.admtCode)||((this.admtCode!= null)&&this.admtCode.equals(rhs.admtCode))))&&((this.stvstypDesc == rhs.stvstypDesc)||((this.stvstypDesc!= null)&&this.stvstypDesc.equals(rhs.stvstypDesc))))&&((this.applPreference == rhs.applPreference)||((this.applPreference!= null)&&this.applPreference.equals(rhs.applPreference))))&&((this.stypCode == rhs.stypCode)||((this.stypCode!= null)&&this.stypCode.equals(rhs.stypCode))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.fullPartInd == rhs.fullPartInd)||((this.fullPartInd!= null)&&this.fullPartInd.equals(rhs.fullPartInd))))&&((this.termCodeEntry == rhs.termCodeEntry)||((this.termCodeEntry!= null)&&this.termCodeEntry.equals(rhs.termCodeEntry))));
    }

}
