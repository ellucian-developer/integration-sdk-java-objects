
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
    "reqDocInd",
    "applDate",
    "keyblocTermCode",
    "applNo",
    "resdCode",
    "sarappdApdcCode",
    "apstCode",
    "sessCode",
    "admtCode",
    "apdcCode",
    "applPreference",
    "id",
    "stypCode",
    "termCodeEntry",
    "fullPartInd"
})
@Generated("jsonschema2pojo")
public class AdmissionsDecisionProcessing100GetRequest {

    @JsonProperty("reqDocInd")
    private String reqDocInd;
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
    /**
     * Term
     * <p>
     * Lineage reference object : keyblocTermCode, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("keyblocTermCode")
    @JsonPropertyDescription("Lineage reference object : keyblocTermCode, Lookup lineage reference object : stvterm")
    private Object keyblocTermCode;
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
    /**
     * Decision Code
     * <p>
     * Lineage reference object : SARAPPD_APDC_CODE, Lookup lineage reference object : stvapdc
     * (Required)
     * 
     */
    @JsonProperty("apdcCode")
    @JsonPropertyDescription("Lineage reference object : SARAPPD_APDC_CODE, Lookup lineage reference object : stvapdc")
    private String apdcCode;
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
     * ID
     * <p>
     * Lineage reference object : id
     * 
     */
    @JsonProperty("id")
    @JsonPropertyDescription("Lineage reference object : id")
    private Object id;
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
     * Entry Term
     * <p>
     * Lineage reference object : SARADAP_TERM_CODE_ENTRY, Lookup lineage reference object : stvterm
     * (Required)
     * 
     */
    @JsonProperty("termCodeEntry")
    @JsonPropertyDescription("Lineage reference object : SARADAP_TERM_CODE_ENTRY, Lookup lineage reference object : stvterm")
    private String termCodeEntry;
    /**
     * Full or Part Time
     * <p>
     * Lineage reference object : SARADAP_FULL_PART_IND
     * 
     */
    @JsonProperty("fullPartInd")
    @JsonPropertyDescription("Lineage reference object : SARADAP_FULL_PART_IND")
    private String fullPartInd;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("reqDocInd")
    public String getReqDocInd() {
        return reqDocInd;
    }

    @JsonProperty("reqDocInd")
    public void setReqDocInd(String reqDocInd) {
        this.reqDocInd = reqDocInd;
    }

    public AdmissionsDecisionProcessing100GetRequest withReqDocInd(String reqDocInd) {
        this.reqDocInd = reqDocInd;
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

    public AdmissionsDecisionProcessing100GetRequest withApplDate(Date applDate) {
        this.applDate = applDate;
        return this;
    }

    /**
     * Term
     * <p>
     * Lineage reference object : keyblocTermCode, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("keyblocTermCode")
    public Object getKeyblocTermCode() {
        return keyblocTermCode;
    }

    /**
     * Term
     * <p>
     * Lineage reference object : keyblocTermCode, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("keyblocTermCode")
    public void setKeyblocTermCode(Object keyblocTermCode) {
        this.keyblocTermCode = keyblocTermCode;
    }

    public AdmissionsDecisionProcessing100GetRequest withKeyblocTermCode(Object keyblocTermCode) {
        this.keyblocTermCode = keyblocTermCode;
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

    public AdmissionsDecisionProcessing100GetRequest withApplNo(Double applNo) {
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

    public AdmissionsDecisionProcessing100GetRequest withResdCode(String resdCode) {
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

    public AdmissionsDecisionProcessing100GetRequest withSarappdApdcCode(String sarappdApdcCode) {
        this.sarappdApdcCode = sarappdApdcCode;
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

    public AdmissionsDecisionProcessing100GetRequest withApstCode(String apstCode) {
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

    public AdmissionsDecisionProcessing100GetRequest withSessCode(String sessCode) {
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

    public AdmissionsDecisionProcessing100GetRequest withAdmtCode(String admtCode) {
        this.admtCode = admtCode;
        return this;
    }

    /**
     * Decision Code
     * <p>
     * Lineage reference object : SARAPPD_APDC_CODE, Lookup lineage reference object : stvapdc
     * (Required)
     * 
     */
    @JsonProperty("apdcCode")
    public String getApdcCode() {
        return apdcCode;
    }

    /**
     * Decision Code
     * <p>
     * Lineage reference object : SARAPPD_APDC_CODE, Lookup lineage reference object : stvapdc
     * (Required)
     * 
     */
    @JsonProperty("apdcCode")
    public void setApdcCode(String apdcCode) {
        this.apdcCode = apdcCode;
    }

    public AdmissionsDecisionProcessing100GetRequest withApdcCode(String apdcCode) {
        this.apdcCode = apdcCode;
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

    public AdmissionsDecisionProcessing100GetRequest withApplPreference(Double applPreference) {
        this.applPreference = applPreference;
        return this;
    }

    /**
     * ID
     * <p>
     * Lineage reference object : id
     * 
     */
    @JsonProperty("id")
    public Object getId() {
        return id;
    }

    /**
     * ID
     * <p>
     * Lineage reference object : id
     * 
     */
    @JsonProperty("id")
    public void setId(Object id) {
        this.id = id;
    }

    public AdmissionsDecisionProcessing100GetRequest withId(Object id) {
        this.id = id;
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

    public AdmissionsDecisionProcessing100GetRequest withStypCode(String stypCode) {
        this.stypCode = stypCode;
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

    public AdmissionsDecisionProcessing100GetRequest withTermCodeEntry(String termCodeEntry) {
        this.termCodeEntry = termCodeEntry;
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

    public AdmissionsDecisionProcessing100GetRequest withFullPartInd(String fullPartInd) {
        this.fullPartInd = fullPartInd;
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

    public AdmissionsDecisionProcessing100GetRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(AdmissionsDecisionProcessing100GetRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("reqDocInd");
        sb.append('=');
        sb.append(((this.reqDocInd == null)?"<null>":this.reqDocInd));
        sb.append(',');
        sb.append("applDate");
        sb.append('=');
        sb.append(((this.applDate == null)?"<null>":this.applDate));
        sb.append(',');
        sb.append("keyblocTermCode");
        sb.append('=');
        sb.append(((this.keyblocTermCode == null)?"<null>":this.keyblocTermCode));
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
        sb.append("apdcCode");
        sb.append('=');
        sb.append(((this.apdcCode == null)?"<null>":this.apdcCode));
        sb.append(',');
        sb.append("applPreference");
        sb.append('=');
        sb.append(((this.applPreference == null)?"<null>":this.applPreference));
        sb.append(',');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("stypCode");
        sb.append('=');
        sb.append(((this.stypCode == null)?"<null>":this.stypCode));
        sb.append(',');
        sb.append("termCodeEntry");
        sb.append('=');
        sb.append(((this.termCodeEntry == null)?"<null>":this.termCodeEntry));
        sb.append(',');
        sb.append("fullPartInd");
        sb.append('=');
        sb.append(((this.fullPartInd == null)?"<null>":this.fullPartInd));
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
        result = ((result* 31)+((this.reqDocInd == null)? 0 :this.reqDocInd.hashCode()));
        result = ((result* 31)+((this.applDate == null)? 0 :this.applDate.hashCode()));
        result = ((result* 31)+((this.keyblocTermCode == null)? 0 :this.keyblocTermCode.hashCode()));
        result = ((result* 31)+((this.applNo == null)? 0 :this.applNo.hashCode()));
        result = ((result* 31)+((this.resdCode == null)? 0 :this.resdCode.hashCode()));
        result = ((result* 31)+((this.sarappdApdcCode == null)? 0 :this.sarappdApdcCode.hashCode()));
        result = ((result* 31)+((this.apstCode == null)? 0 :this.apstCode.hashCode()));
        result = ((result* 31)+((this.sessCode == null)? 0 :this.sessCode.hashCode()));
        result = ((result* 31)+((this.admtCode == null)? 0 :this.admtCode.hashCode()));
        result = ((result* 31)+((this.apdcCode == null)? 0 :this.apdcCode.hashCode()));
        result = ((result* 31)+((this.applPreference == null)? 0 :this.applPreference.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.stypCode == null)? 0 :this.stypCode.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.termCodeEntry == null)? 0 :this.termCodeEntry.hashCode()));
        result = ((result* 31)+((this.fullPartInd == null)? 0 :this.fullPartInd.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof AdmissionsDecisionProcessing100GetRequest) == false) {
            return false;
        }
        AdmissionsDecisionProcessing100GetRequest rhs = ((AdmissionsDecisionProcessing100GetRequest) other);
        return (((((((((((((((((this.reqDocInd == rhs.reqDocInd)||((this.reqDocInd!= null)&&this.reqDocInd.equals(rhs.reqDocInd)))&&((this.applDate == rhs.applDate)||((this.applDate!= null)&&this.applDate.equals(rhs.applDate))))&&((this.keyblocTermCode == rhs.keyblocTermCode)||((this.keyblocTermCode!= null)&&this.keyblocTermCode.equals(rhs.keyblocTermCode))))&&((this.applNo == rhs.applNo)||((this.applNo!= null)&&this.applNo.equals(rhs.applNo))))&&((this.resdCode == rhs.resdCode)||((this.resdCode!= null)&&this.resdCode.equals(rhs.resdCode))))&&((this.sarappdApdcCode == rhs.sarappdApdcCode)||((this.sarappdApdcCode!= null)&&this.sarappdApdcCode.equals(rhs.sarappdApdcCode))))&&((this.apstCode == rhs.apstCode)||((this.apstCode!= null)&&this.apstCode.equals(rhs.apstCode))))&&((this.sessCode == rhs.sessCode)||((this.sessCode!= null)&&this.sessCode.equals(rhs.sessCode))))&&((this.admtCode == rhs.admtCode)||((this.admtCode!= null)&&this.admtCode.equals(rhs.admtCode))))&&((this.apdcCode == rhs.apdcCode)||((this.apdcCode!= null)&&this.apdcCode.equals(rhs.apdcCode))))&&((this.applPreference == rhs.applPreference)||((this.applPreference!= null)&&this.applPreference.equals(rhs.applPreference))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.stypCode == rhs.stypCode)||((this.stypCode!= null)&&this.stypCode.equals(rhs.stypCode))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.termCodeEntry == rhs.termCodeEntry)||((this.termCodeEntry!= null)&&this.termCodeEntry.equals(rhs.termCodeEntry))))&&((this.fullPartInd == rhs.fullPartInd)||((this.fullPartInd!= null)&&this.fullPartInd.equals(rhs.fullPartInd))));
    }

}
