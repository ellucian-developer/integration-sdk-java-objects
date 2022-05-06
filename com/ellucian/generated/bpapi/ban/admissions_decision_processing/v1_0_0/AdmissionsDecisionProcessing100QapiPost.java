
package com.ellucian.generated.bpapi.ban.admissions_decision_processing.v1_0_0;

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
    "id",
    "keyblocTermCode",
    "apdcCode",
    "termCodeEntry",
    "sarappdApdcCode",
    "apstCode",
    "applDate",
    "applNo",
    "admtCode",
    "sessCode",
    "reqDocInd",
    "applPreference",
    "stypCode",
    "resdCode",
    "fullPartInd"
})
@Generated("jsonschema2pojo")
public class AdmissionsDecisionProcessing100QapiPost {

    @JsonProperty("id")
    private String id;
    @JsonProperty("keyblocTermCode")
    private String keyblocTermCode;
    /**
     * Decision Code
     * <p>
     * Lineage reference object : SARAPPD_APDC_CODE, Lookup lineage reference object : stvapdc
     * 
     */
    @JsonProperty("apdcCode")
    @JsonPropertyDescription("Lineage reference object : SARAPPD_APDC_CODE, Lookup lineage reference object : stvapdc")
    private String apdcCode;
    @JsonProperty("termCodeEntry")
    private String termCodeEntry;
    @JsonProperty("sarappdApdcCode")
    private String sarappdApdcCode;
    @JsonProperty("apstCode")
    private String apstCode;
    @JsonProperty("applDate")
    private String applDate;
    @JsonProperty("applNo")
    private String applNo;
    @JsonProperty("admtCode")
    private String admtCode;
    @JsonProperty("sessCode")
    private String sessCode;
    @JsonProperty("reqDocInd")
    private String reqDocInd;
    @JsonProperty("applPreference")
    private String applPreference;
    @JsonProperty("stypCode")
    private String stypCode;
    @JsonProperty("resdCode")
    private String resdCode;
    @JsonProperty("fullPartInd")
    private String fullPartInd;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    public AdmissionsDecisionProcessing100QapiPost withId(String id) {
        this.id = id;
        return this;
    }

    @JsonProperty("keyblocTermCode")
    public String getKeyblocTermCode() {
        return keyblocTermCode;
    }

    @JsonProperty("keyblocTermCode")
    public void setKeyblocTermCode(String keyblocTermCode) {
        this.keyblocTermCode = keyblocTermCode;
    }

    public AdmissionsDecisionProcessing100QapiPost withKeyblocTermCode(String keyblocTermCode) {
        this.keyblocTermCode = keyblocTermCode;
        return this;
    }

    /**
     * Decision Code
     * <p>
     * Lineage reference object : SARAPPD_APDC_CODE, Lookup lineage reference object : stvapdc
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
     * 
     */
    @JsonProperty("apdcCode")
    public void setApdcCode(String apdcCode) {
        this.apdcCode = apdcCode;
    }

    public AdmissionsDecisionProcessing100QapiPost withApdcCode(String apdcCode) {
        this.apdcCode = apdcCode;
        return this;
    }

    @JsonProperty("termCodeEntry")
    public String getTermCodeEntry() {
        return termCodeEntry;
    }

    @JsonProperty("termCodeEntry")
    public void setTermCodeEntry(String termCodeEntry) {
        this.termCodeEntry = termCodeEntry;
    }

    public AdmissionsDecisionProcessing100QapiPost withTermCodeEntry(String termCodeEntry) {
        this.termCodeEntry = termCodeEntry;
        return this;
    }

    @JsonProperty("sarappdApdcCode")
    public String getSarappdApdcCode() {
        return sarappdApdcCode;
    }

    @JsonProperty("sarappdApdcCode")
    public void setSarappdApdcCode(String sarappdApdcCode) {
        this.sarappdApdcCode = sarappdApdcCode;
    }

    public AdmissionsDecisionProcessing100QapiPost withSarappdApdcCode(String sarappdApdcCode) {
        this.sarappdApdcCode = sarappdApdcCode;
        return this;
    }

    @JsonProperty("apstCode")
    public String getApstCode() {
        return apstCode;
    }

    @JsonProperty("apstCode")
    public void setApstCode(String apstCode) {
        this.apstCode = apstCode;
    }

    public AdmissionsDecisionProcessing100QapiPost withApstCode(String apstCode) {
        this.apstCode = apstCode;
        return this;
    }

    @JsonProperty("applDate")
    public String getApplDate() {
        return applDate;
    }

    @JsonProperty("applDate")
    public void setApplDate(String applDate) {
        this.applDate = applDate;
    }

    public AdmissionsDecisionProcessing100QapiPost withApplDate(String applDate) {
        this.applDate = applDate;
        return this;
    }

    @JsonProperty("applNo")
    public String getApplNo() {
        return applNo;
    }

    @JsonProperty("applNo")
    public void setApplNo(String applNo) {
        this.applNo = applNo;
    }

    public AdmissionsDecisionProcessing100QapiPost withApplNo(String applNo) {
        this.applNo = applNo;
        return this;
    }

    @JsonProperty("admtCode")
    public String getAdmtCode() {
        return admtCode;
    }

    @JsonProperty("admtCode")
    public void setAdmtCode(String admtCode) {
        this.admtCode = admtCode;
    }

    public AdmissionsDecisionProcessing100QapiPost withAdmtCode(String admtCode) {
        this.admtCode = admtCode;
        return this;
    }

    @JsonProperty("sessCode")
    public String getSessCode() {
        return sessCode;
    }

    @JsonProperty("sessCode")
    public void setSessCode(String sessCode) {
        this.sessCode = sessCode;
    }

    public AdmissionsDecisionProcessing100QapiPost withSessCode(String sessCode) {
        this.sessCode = sessCode;
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

    public AdmissionsDecisionProcessing100QapiPost withReqDocInd(String reqDocInd) {
        this.reqDocInd = reqDocInd;
        return this;
    }

    @JsonProperty("applPreference")
    public String getApplPreference() {
        return applPreference;
    }

    @JsonProperty("applPreference")
    public void setApplPreference(String applPreference) {
        this.applPreference = applPreference;
    }

    public AdmissionsDecisionProcessing100QapiPost withApplPreference(String applPreference) {
        this.applPreference = applPreference;
        return this;
    }

    @JsonProperty("stypCode")
    public String getStypCode() {
        return stypCode;
    }

    @JsonProperty("stypCode")
    public void setStypCode(String stypCode) {
        this.stypCode = stypCode;
    }

    public AdmissionsDecisionProcessing100QapiPost withStypCode(String stypCode) {
        this.stypCode = stypCode;
        return this;
    }

    @JsonProperty("resdCode")
    public String getResdCode() {
        return resdCode;
    }

    @JsonProperty("resdCode")
    public void setResdCode(String resdCode) {
        this.resdCode = resdCode;
    }

    public AdmissionsDecisionProcessing100QapiPost withResdCode(String resdCode) {
        this.resdCode = resdCode;
        return this;
    }

    @JsonProperty("fullPartInd")
    public String getFullPartInd() {
        return fullPartInd;
    }

    @JsonProperty("fullPartInd")
    public void setFullPartInd(String fullPartInd) {
        this.fullPartInd = fullPartInd;
    }

    public AdmissionsDecisionProcessing100QapiPost withFullPartInd(String fullPartInd) {
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

    public AdmissionsDecisionProcessing100QapiPost withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(AdmissionsDecisionProcessing100QapiPost.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("keyblocTermCode");
        sb.append('=');
        sb.append(((this.keyblocTermCode == null)?"<null>":this.keyblocTermCode));
        sb.append(',');
        sb.append("apdcCode");
        sb.append('=');
        sb.append(((this.apdcCode == null)?"<null>":this.apdcCode));
        sb.append(',');
        sb.append("termCodeEntry");
        sb.append('=');
        sb.append(((this.termCodeEntry == null)?"<null>":this.termCodeEntry));
        sb.append(',');
        sb.append("sarappdApdcCode");
        sb.append('=');
        sb.append(((this.sarappdApdcCode == null)?"<null>":this.sarappdApdcCode));
        sb.append(',');
        sb.append("apstCode");
        sb.append('=');
        sb.append(((this.apstCode == null)?"<null>":this.apstCode));
        sb.append(',');
        sb.append("applDate");
        sb.append('=');
        sb.append(((this.applDate == null)?"<null>":this.applDate));
        sb.append(',');
        sb.append("applNo");
        sb.append('=');
        sb.append(((this.applNo == null)?"<null>":this.applNo));
        sb.append(',');
        sb.append("admtCode");
        sb.append('=');
        sb.append(((this.admtCode == null)?"<null>":this.admtCode));
        sb.append(',');
        sb.append("sessCode");
        sb.append('=');
        sb.append(((this.sessCode == null)?"<null>":this.sessCode));
        sb.append(',');
        sb.append("reqDocInd");
        sb.append('=');
        sb.append(((this.reqDocInd == null)?"<null>":this.reqDocInd));
        sb.append(',');
        sb.append("applPreference");
        sb.append('=');
        sb.append(((this.applPreference == null)?"<null>":this.applPreference));
        sb.append(',');
        sb.append("stypCode");
        sb.append('=');
        sb.append(((this.stypCode == null)?"<null>":this.stypCode));
        sb.append(',');
        sb.append("resdCode");
        sb.append('=');
        sb.append(((this.resdCode == null)?"<null>":this.resdCode));
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
        if ((other instanceof AdmissionsDecisionProcessing100QapiPost) == false) {
            return false;
        }
        AdmissionsDecisionProcessing100QapiPost rhs = ((AdmissionsDecisionProcessing100QapiPost) other);
        return (((((((((((((((((this.reqDocInd == rhs.reqDocInd)||((this.reqDocInd!= null)&&this.reqDocInd.equals(rhs.reqDocInd)))&&((this.applDate == rhs.applDate)||((this.applDate!= null)&&this.applDate.equals(rhs.applDate))))&&((this.keyblocTermCode == rhs.keyblocTermCode)||((this.keyblocTermCode!= null)&&this.keyblocTermCode.equals(rhs.keyblocTermCode))))&&((this.applNo == rhs.applNo)||((this.applNo!= null)&&this.applNo.equals(rhs.applNo))))&&((this.resdCode == rhs.resdCode)||((this.resdCode!= null)&&this.resdCode.equals(rhs.resdCode))))&&((this.sarappdApdcCode == rhs.sarappdApdcCode)||((this.sarappdApdcCode!= null)&&this.sarappdApdcCode.equals(rhs.sarappdApdcCode))))&&((this.apstCode == rhs.apstCode)||((this.apstCode!= null)&&this.apstCode.equals(rhs.apstCode))))&&((this.sessCode == rhs.sessCode)||((this.sessCode!= null)&&this.sessCode.equals(rhs.sessCode))))&&((this.admtCode == rhs.admtCode)||((this.admtCode!= null)&&this.admtCode.equals(rhs.admtCode))))&&((this.apdcCode == rhs.apdcCode)||((this.apdcCode!= null)&&this.apdcCode.equals(rhs.apdcCode))))&&((this.applPreference == rhs.applPreference)||((this.applPreference!= null)&&this.applPreference.equals(rhs.applPreference))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.stypCode == rhs.stypCode)||((this.stypCode!= null)&&this.stypCode.equals(rhs.stypCode))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.termCodeEntry == rhs.termCodeEntry)||((this.termCodeEntry!= null)&&this.termCodeEntry.equals(rhs.termCodeEntry))))&&((this.fullPartInd == rhs.fullPartInd)||((this.fullPartInd!= null)&&this.fullPartInd.equals(rhs.fullPartInd))));
    }

}
