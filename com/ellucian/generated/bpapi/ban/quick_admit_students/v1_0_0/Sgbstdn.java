
package com.ellucian.generated.bpapi.ban.quick_admit_students.v1_0_0;

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
    "stvststDesc",
    "stvadmtDesc",
    "stvresdDesc",
    "egolDesc",
    "edlvCode",
    "stvapdcDesc",
    "addAdmInd",
    "stdrecrSbgiCode",
    "resdCode",
    "edlvDesc",
    "stdadapAdmtCode",
    "stvapstDesc",
    "rateCode",
    "stvstypDesc",
    "stvsbgiDesc",
    "ststCode",
    "stvrateDesc",
    "stdappdApdcCode",
    "egolCode",
    "addRecrInd",
    "adapApplNo",
    "stypCode",
    "stdadapApstCode",
    "fullPartInd"
})
@Generated("jsonschema2pojo")
public class Sgbstdn {

    @JsonProperty("stvststDesc")
    private String stvststDesc;
    @JsonProperty("stvadmtDesc")
    private String stvadmtDesc;
    @JsonProperty("stvresdDesc")
    private String stvresdDesc;
    @JsonProperty("egolDesc")
    private String egolDesc;
    /**
     * Education Level
     * <p>
     * Lineage reference object : SGBSTDN_EDLV_CODE, Lookup lineage reference object : stvedlv
     * 
     */
    @JsonProperty("edlvCode")
    @JsonPropertyDescription("Lineage reference object : SGBSTDN_EDLV_CODE, Lookup lineage reference object : stvedlv")
    private String edlvCode;
    @JsonProperty("stvapdcDesc")
    private String stvapdcDesc;
    /**
     * Create Application Record
     * <p>
     * 
     * 
     */
    @JsonProperty("addAdmInd")
    private String addAdmInd;
    /**
     * Primary Source
     * <p>
     * Lookup lineage reference object : stvsbgi
     * 
     */
    @JsonProperty("stdrecrSbgiCode")
    @JsonPropertyDescription("Lookup lineage reference object : stvsbgi")
    private String stdrecrSbgiCode;
    /**
     * Residence
     * <p>
     * Lineage reference object : SGBSTDN_RESD_CODE, Lookup lineage reference object : stvresd
     * 
     */
    @JsonProperty("resdCode")
    @JsonPropertyDescription("Lineage reference object : SGBSTDN_RESD_CODE, Lookup lineage reference object : stvresd")
    private String resdCode;
    @JsonProperty("edlvDesc")
    private String edlvDesc;
    /**
     * Admission Type
     * <p>
     * Lookup lineage reference object : stvadmt
     * 
     */
    @JsonProperty("stdadapAdmtCode")
    @JsonPropertyDescription("Lookup lineage reference object : stvadmt")
    private String stdadapAdmtCode;
    @JsonProperty("stvapstDesc")
    private String stvapstDesc;
    /**
     * Rate
     * <p>
     * Lineage reference object : SGBSTDN_RATE_CODE, Lookup lineage reference object : stvrate
     * 
     */
    @JsonProperty("rateCode")
    @JsonPropertyDescription("Lineage reference object : SGBSTDN_RATE_CODE, Lookup lineage reference object : stvrate")
    private String rateCode;
    @JsonProperty("stvstypDesc")
    private String stvstypDesc;
    @JsonProperty("stvsbgiDesc")
    private String stvsbgiDesc;
    /**
     * Student Status
     * <p>
     * Lineage reference object : SGBSTDN_STST_CODE, Lookup lineage reference object : stvstst
     * 
     */
    @JsonProperty("ststCode")
    @JsonPropertyDescription("Lineage reference object : SGBSTDN_STST_CODE, Lookup lineage reference object : stvstst")
    private String ststCode;
    @JsonProperty("stvrateDesc")
    private String stvrateDesc;
    /**
     * Admission Decision
     * <p>
     * Lookup lineage reference object : stvapdc
     * 
     */
    @JsonProperty("stdappdApdcCode")
    @JsonPropertyDescription("Lookup lineage reference object : stvapdc")
    private String stdappdApdcCode;
    /**
     * Education Goal
     * <p>
     * Lineage reference object : SGBSTDN_EGOL_CODE, Lookup lineage reference object : stvegol
     * 
     */
    @JsonProperty("egolCode")
    @JsonPropertyDescription("Lineage reference object : SGBSTDN_EGOL_CODE, Lookup lineage reference object : stvegol")
    private String egolCode;
    /**
     * Create Recruit Record
     * <p>
     * 
     * 
     */
    @JsonProperty("addRecrInd")
    private String addRecrInd;
    /**
     * Application Number
     * <p>
     * 
     * 
     */
    @JsonProperty("adapApplNo")
    private Double adapApplNo;
    /**
     * Student Type
     * <p>
     * Lineage reference object : SGBSTDN_STYP_CODE, Lookup lineage reference object : stvstyp
     * 
     */
    @JsonProperty("stypCode")
    @JsonPropertyDescription("Lineage reference object : SGBSTDN_STYP_CODE, Lookup lineage reference object : stvstyp")
    private String stypCode;
    /**
     * Application Status
     * <p>
     * Lookup lineage reference object : stvapst
     * 
     */
    @JsonProperty("stdadapApstCode")
    @JsonPropertyDescription("Lookup lineage reference object : stvapst")
    private String stdadapApstCode;
    /**
     * Full or Part Time
     * <p>
     * Lineage reference object : SGBSTDN_FULL_PART_IND
     * 
     */
    @JsonProperty("fullPartInd")
    @JsonPropertyDescription("Lineage reference object : SGBSTDN_FULL_PART_IND")
    private String fullPartInd;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("stvststDesc")
    public String getStvststDesc() {
        return stvststDesc;
    }

    @JsonProperty("stvststDesc")
    public void setStvststDesc(String stvststDesc) {
        this.stvststDesc = stvststDesc;
    }

    public Sgbstdn withStvststDesc(String stvststDesc) {
        this.stvststDesc = stvststDesc;
        return this;
    }

    @JsonProperty("stvadmtDesc")
    public String getStvadmtDesc() {
        return stvadmtDesc;
    }

    @JsonProperty("stvadmtDesc")
    public void setStvadmtDesc(String stvadmtDesc) {
        this.stvadmtDesc = stvadmtDesc;
    }

    public Sgbstdn withStvadmtDesc(String stvadmtDesc) {
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

    public Sgbstdn withStvresdDesc(String stvresdDesc) {
        this.stvresdDesc = stvresdDesc;
        return this;
    }

    @JsonProperty("egolDesc")
    public String getEgolDesc() {
        return egolDesc;
    }

    @JsonProperty("egolDesc")
    public void setEgolDesc(String egolDesc) {
        this.egolDesc = egolDesc;
    }

    public Sgbstdn withEgolDesc(String egolDesc) {
        this.egolDesc = egolDesc;
        return this;
    }

    /**
     * Education Level
     * <p>
     * Lineage reference object : SGBSTDN_EDLV_CODE, Lookup lineage reference object : stvedlv
     * 
     */
    @JsonProperty("edlvCode")
    public String getEdlvCode() {
        return edlvCode;
    }

    /**
     * Education Level
     * <p>
     * Lineage reference object : SGBSTDN_EDLV_CODE, Lookup lineage reference object : stvedlv
     * 
     */
    @JsonProperty("edlvCode")
    public void setEdlvCode(String edlvCode) {
        this.edlvCode = edlvCode;
    }

    public Sgbstdn withEdlvCode(String edlvCode) {
        this.edlvCode = edlvCode;
        return this;
    }

    @JsonProperty("stvapdcDesc")
    public String getStvapdcDesc() {
        return stvapdcDesc;
    }

    @JsonProperty("stvapdcDesc")
    public void setStvapdcDesc(String stvapdcDesc) {
        this.stvapdcDesc = stvapdcDesc;
    }

    public Sgbstdn withStvapdcDesc(String stvapdcDesc) {
        this.stvapdcDesc = stvapdcDesc;
        return this;
    }

    /**
     * Create Application Record
     * <p>
     * 
     * 
     */
    @JsonProperty("addAdmInd")
    public String getAddAdmInd() {
        return addAdmInd;
    }

    /**
     * Create Application Record
     * <p>
     * 
     * 
     */
    @JsonProperty("addAdmInd")
    public void setAddAdmInd(String addAdmInd) {
        this.addAdmInd = addAdmInd;
    }

    public Sgbstdn withAddAdmInd(String addAdmInd) {
        this.addAdmInd = addAdmInd;
        return this;
    }

    /**
     * Primary Source
     * <p>
     * Lookup lineage reference object : stvsbgi
     * 
     */
    @JsonProperty("stdrecrSbgiCode")
    public String getStdrecrSbgiCode() {
        return stdrecrSbgiCode;
    }

    /**
     * Primary Source
     * <p>
     * Lookup lineage reference object : stvsbgi
     * 
     */
    @JsonProperty("stdrecrSbgiCode")
    public void setStdrecrSbgiCode(String stdrecrSbgiCode) {
        this.stdrecrSbgiCode = stdrecrSbgiCode;
    }

    public Sgbstdn withStdrecrSbgiCode(String stdrecrSbgiCode) {
        this.stdrecrSbgiCode = stdrecrSbgiCode;
        return this;
    }

    /**
     * Residence
     * <p>
     * Lineage reference object : SGBSTDN_RESD_CODE, Lookup lineage reference object : stvresd
     * 
     */
    @JsonProperty("resdCode")
    public String getResdCode() {
        return resdCode;
    }

    /**
     * Residence
     * <p>
     * Lineage reference object : SGBSTDN_RESD_CODE, Lookup lineage reference object : stvresd
     * 
     */
    @JsonProperty("resdCode")
    public void setResdCode(String resdCode) {
        this.resdCode = resdCode;
    }

    public Sgbstdn withResdCode(String resdCode) {
        this.resdCode = resdCode;
        return this;
    }

    @JsonProperty("edlvDesc")
    public String getEdlvDesc() {
        return edlvDesc;
    }

    @JsonProperty("edlvDesc")
    public void setEdlvDesc(String edlvDesc) {
        this.edlvDesc = edlvDesc;
    }

    public Sgbstdn withEdlvDesc(String edlvDesc) {
        this.edlvDesc = edlvDesc;
        return this;
    }

    /**
     * Admission Type
     * <p>
     * Lookup lineage reference object : stvadmt
     * 
     */
    @JsonProperty("stdadapAdmtCode")
    public String getStdadapAdmtCode() {
        return stdadapAdmtCode;
    }

    /**
     * Admission Type
     * <p>
     * Lookup lineage reference object : stvadmt
     * 
     */
    @JsonProperty("stdadapAdmtCode")
    public void setStdadapAdmtCode(String stdadapAdmtCode) {
        this.stdadapAdmtCode = stdadapAdmtCode;
    }

    public Sgbstdn withStdadapAdmtCode(String stdadapAdmtCode) {
        this.stdadapAdmtCode = stdadapAdmtCode;
        return this;
    }

    @JsonProperty("stvapstDesc")
    public String getStvapstDesc() {
        return stvapstDesc;
    }

    @JsonProperty("stvapstDesc")
    public void setStvapstDesc(String stvapstDesc) {
        this.stvapstDesc = stvapstDesc;
    }

    public Sgbstdn withStvapstDesc(String stvapstDesc) {
        this.stvapstDesc = stvapstDesc;
        return this;
    }

    /**
     * Rate
     * <p>
     * Lineage reference object : SGBSTDN_RATE_CODE, Lookup lineage reference object : stvrate
     * 
     */
    @JsonProperty("rateCode")
    public String getRateCode() {
        return rateCode;
    }

    /**
     * Rate
     * <p>
     * Lineage reference object : SGBSTDN_RATE_CODE, Lookup lineage reference object : stvrate
     * 
     */
    @JsonProperty("rateCode")
    public void setRateCode(String rateCode) {
        this.rateCode = rateCode;
    }

    public Sgbstdn withRateCode(String rateCode) {
        this.rateCode = rateCode;
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

    public Sgbstdn withStvstypDesc(String stvstypDesc) {
        this.stvstypDesc = stvstypDesc;
        return this;
    }

    @JsonProperty("stvsbgiDesc")
    public String getStvsbgiDesc() {
        return stvsbgiDesc;
    }

    @JsonProperty("stvsbgiDesc")
    public void setStvsbgiDesc(String stvsbgiDesc) {
        this.stvsbgiDesc = stvsbgiDesc;
    }

    public Sgbstdn withStvsbgiDesc(String stvsbgiDesc) {
        this.stvsbgiDesc = stvsbgiDesc;
        return this;
    }

    /**
     * Student Status
     * <p>
     * Lineage reference object : SGBSTDN_STST_CODE, Lookup lineage reference object : stvstst
     * 
     */
    @JsonProperty("ststCode")
    public String getStstCode() {
        return ststCode;
    }

    /**
     * Student Status
     * <p>
     * Lineage reference object : SGBSTDN_STST_CODE, Lookup lineage reference object : stvstst
     * 
     */
    @JsonProperty("ststCode")
    public void setStstCode(String ststCode) {
        this.ststCode = ststCode;
    }

    public Sgbstdn withStstCode(String ststCode) {
        this.ststCode = ststCode;
        return this;
    }

    @JsonProperty("stvrateDesc")
    public String getStvrateDesc() {
        return stvrateDesc;
    }

    @JsonProperty("stvrateDesc")
    public void setStvrateDesc(String stvrateDesc) {
        this.stvrateDesc = stvrateDesc;
    }

    public Sgbstdn withStvrateDesc(String stvrateDesc) {
        this.stvrateDesc = stvrateDesc;
        return this;
    }

    /**
     * Admission Decision
     * <p>
     * Lookup lineage reference object : stvapdc
     * 
     */
    @JsonProperty("stdappdApdcCode")
    public String getStdappdApdcCode() {
        return stdappdApdcCode;
    }

    /**
     * Admission Decision
     * <p>
     * Lookup lineage reference object : stvapdc
     * 
     */
    @JsonProperty("stdappdApdcCode")
    public void setStdappdApdcCode(String stdappdApdcCode) {
        this.stdappdApdcCode = stdappdApdcCode;
    }

    public Sgbstdn withStdappdApdcCode(String stdappdApdcCode) {
        this.stdappdApdcCode = stdappdApdcCode;
        return this;
    }

    /**
     * Education Goal
     * <p>
     * Lineage reference object : SGBSTDN_EGOL_CODE, Lookup lineage reference object : stvegol
     * 
     */
    @JsonProperty("egolCode")
    public String getEgolCode() {
        return egolCode;
    }

    /**
     * Education Goal
     * <p>
     * Lineage reference object : SGBSTDN_EGOL_CODE, Lookup lineage reference object : stvegol
     * 
     */
    @JsonProperty("egolCode")
    public void setEgolCode(String egolCode) {
        this.egolCode = egolCode;
    }

    public Sgbstdn withEgolCode(String egolCode) {
        this.egolCode = egolCode;
        return this;
    }

    /**
     * Create Recruit Record
     * <p>
     * 
     * 
     */
    @JsonProperty("addRecrInd")
    public String getAddRecrInd() {
        return addRecrInd;
    }

    /**
     * Create Recruit Record
     * <p>
     * 
     * 
     */
    @JsonProperty("addRecrInd")
    public void setAddRecrInd(String addRecrInd) {
        this.addRecrInd = addRecrInd;
    }

    public Sgbstdn withAddRecrInd(String addRecrInd) {
        this.addRecrInd = addRecrInd;
        return this;
    }

    /**
     * Application Number
     * <p>
     * 
     * 
     */
    @JsonProperty("adapApplNo")
    public Double getAdapApplNo() {
        return adapApplNo;
    }

    /**
     * Application Number
     * <p>
     * 
     * 
     */
    @JsonProperty("adapApplNo")
    public void setAdapApplNo(Double adapApplNo) {
        this.adapApplNo = adapApplNo;
    }

    public Sgbstdn withAdapApplNo(Double adapApplNo) {
        this.adapApplNo = adapApplNo;
        return this;
    }

    /**
     * Student Type
     * <p>
     * Lineage reference object : SGBSTDN_STYP_CODE, Lookup lineage reference object : stvstyp
     * 
     */
    @JsonProperty("stypCode")
    public String getStypCode() {
        return stypCode;
    }

    /**
     * Student Type
     * <p>
     * Lineage reference object : SGBSTDN_STYP_CODE, Lookup lineage reference object : stvstyp
     * 
     */
    @JsonProperty("stypCode")
    public void setStypCode(String stypCode) {
        this.stypCode = stypCode;
    }

    public Sgbstdn withStypCode(String stypCode) {
        this.stypCode = stypCode;
        return this;
    }

    /**
     * Application Status
     * <p>
     * Lookup lineage reference object : stvapst
     * 
     */
    @JsonProperty("stdadapApstCode")
    public String getStdadapApstCode() {
        return stdadapApstCode;
    }

    /**
     * Application Status
     * <p>
     * Lookup lineage reference object : stvapst
     * 
     */
    @JsonProperty("stdadapApstCode")
    public void setStdadapApstCode(String stdadapApstCode) {
        this.stdadapApstCode = stdadapApstCode;
    }

    public Sgbstdn withStdadapApstCode(String stdadapApstCode) {
        this.stdadapApstCode = stdadapApstCode;
        return this;
    }

    /**
     * Full or Part Time
     * <p>
     * Lineage reference object : SGBSTDN_FULL_PART_IND
     * 
     */
    @JsonProperty("fullPartInd")
    public String getFullPartInd() {
        return fullPartInd;
    }

    /**
     * Full or Part Time
     * <p>
     * Lineage reference object : SGBSTDN_FULL_PART_IND
     * 
     */
    @JsonProperty("fullPartInd")
    public void setFullPartInd(String fullPartInd) {
        this.fullPartInd = fullPartInd;
    }

    public Sgbstdn withFullPartInd(String fullPartInd) {
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

    public Sgbstdn withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Sgbstdn.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("stvststDesc");
        sb.append('=');
        sb.append(((this.stvststDesc == null)?"<null>":this.stvststDesc));
        sb.append(',');
        sb.append("stvadmtDesc");
        sb.append('=');
        sb.append(((this.stvadmtDesc == null)?"<null>":this.stvadmtDesc));
        sb.append(',');
        sb.append("stvresdDesc");
        sb.append('=');
        sb.append(((this.stvresdDesc == null)?"<null>":this.stvresdDesc));
        sb.append(',');
        sb.append("egolDesc");
        sb.append('=');
        sb.append(((this.egolDesc == null)?"<null>":this.egolDesc));
        sb.append(',');
        sb.append("edlvCode");
        sb.append('=');
        sb.append(((this.edlvCode == null)?"<null>":this.edlvCode));
        sb.append(',');
        sb.append("stvapdcDesc");
        sb.append('=');
        sb.append(((this.stvapdcDesc == null)?"<null>":this.stvapdcDesc));
        sb.append(',');
        sb.append("addAdmInd");
        sb.append('=');
        sb.append(((this.addAdmInd == null)?"<null>":this.addAdmInd));
        sb.append(',');
        sb.append("stdrecrSbgiCode");
        sb.append('=');
        sb.append(((this.stdrecrSbgiCode == null)?"<null>":this.stdrecrSbgiCode));
        sb.append(',');
        sb.append("resdCode");
        sb.append('=');
        sb.append(((this.resdCode == null)?"<null>":this.resdCode));
        sb.append(',');
        sb.append("edlvDesc");
        sb.append('=');
        sb.append(((this.edlvDesc == null)?"<null>":this.edlvDesc));
        sb.append(',');
        sb.append("stdadapAdmtCode");
        sb.append('=');
        sb.append(((this.stdadapAdmtCode == null)?"<null>":this.stdadapAdmtCode));
        sb.append(',');
        sb.append("stvapstDesc");
        sb.append('=');
        sb.append(((this.stvapstDesc == null)?"<null>":this.stvapstDesc));
        sb.append(',');
        sb.append("rateCode");
        sb.append('=');
        sb.append(((this.rateCode == null)?"<null>":this.rateCode));
        sb.append(',');
        sb.append("stvstypDesc");
        sb.append('=');
        sb.append(((this.stvstypDesc == null)?"<null>":this.stvstypDesc));
        sb.append(',');
        sb.append("stvsbgiDesc");
        sb.append('=');
        sb.append(((this.stvsbgiDesc == null)?"<null>":this.stvsbgiDesc));
        sb.append(',');
        sb.append("ststCode");
        sb.append('=');
        sb.append(((this.ststCode == null)?"<null>":this.ststCode));
        sb.append(',');
        sb.append("stvrateDesc");
        sb.append('=');
        sb.append(((this.stvrateDesc == null)?"<null>":this.stvrateDesc));
        sb.append(',');
        sb.append("stdappdApdcCode");
        sb.append('=');
        sb.append(((this.stdappdApdcCode == null)?"<null>":this.stdappdApdcCode));
        sb.append(',');
        sb.append("egolCode");
        sb.append('=');
        sb.append(((this.egolCode == null)?"<null>":this.egolCode));
        sb.append(',');
        sb.append("addRecrInd");
        sb.append('=');
        sb.append(((this.addRecrInd == null)?"<null>":this.addRecrInd));
        sb.append(',');
        sb.append("adapApplNo");
        sb.append('=');
        sb.append(((this.adapApplNo == null)?"<null>":this.adapApplNo));
        sb.append(',');
        sb.append("stypCode");
        sb.append('=');
        sb.append(((this.stypCode == null)?"<null>":this.stypCode));
        sb.append(',');
        sb.append("stdadapApstCode");
        sb.append('=');
        sb.append(((this.stdadapApstCode == null)?"<null>":this.stdadapApstCode));
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
        result = ((result* 31)+((this.egolDesc == null)? 0 :this.egolDesc.hashCode()));
        result = ((result* 31)+((this.edlvCode == null)? 0 :this.edlvCode.hashCode()));
        result = ((result* 31)+((this.stvapdcDesc == null)? 0 :this.stvapdcDesc.hashCode()));
        result = ((result* 31)+((this.rateCode == null)? 0 :this.rateCode.hashCode()));
        result = ((result* 31)+((this.stvstypDesc == null)? 0 :this.stvstypDesc.hashCode()));
        result = ((result* 31)+((this.stvsbgiDesc == null)? 0 :this.stvsbgiDesc.hashCode()));
        result = ((result* 31)+((this.adapApplNo == null)? 0 :this.adapApplNo.hashCode()));
        result = ((result* 31)+((this.fullPartInd == null)? 0 :this.fullPartInd.hashCode()));
        result = ((result* 31)+((this.stvststDesc == null)? 0 :this.stvststDesc.hashCode()));
        result = ((result* 31)+((this.stvadmtDesc == null)? 0 :this.stvadmtDesc.hashCode()));
        result = ((result* 31)+((this.stvresdDesc == null)? 0 :this.stvresdDesc.hashCode()));
        result = ((result* 31)+((this.addAdmInd == null)? 0 :this.addAdmInd.hashCode()));
        result = ((result* 31)+((this.stdrecrSbgiCode == null)? 0 :this.stdrecrSbgiCode.hashCode()));
        result = ((result* 31)+((this.resdCode == null)? 0 :this.resdCode.hashCode()));
        result = ((result* 31)+((this.edlvDesc == null)? 0 :this.edlvDesc.hashCode()));
        result = ((result* 31)+((this.stdadapAdmtCode == null)? 0 :this.stdadapAdmtCode.hashCode()));
        result = ((result* 31)+((this.stvapstDesc == null)? 0 :this.stvapstDesc.hashCode()));
        result = ((result* 31)+((this.ststCode == null)? 0 :this.ststCode.hashCode()));
        result = ((result* 31)+((this.stvrateDesc == null)? 0 :this.stvrateDesc.hashCode()));
        result = ((result* 31)+((this.stdappdApdcCode == null)? 0 :this.stdappdApdcCode.hashCode()));
        result = ((result* 31)+((this.egolCode == null)? 0 :this.egolCode.hashCode()));
        result = ((result* 31)+((this.addRecrInd == null)? 0 :this.addRecrInd.hashCode()));
        result = ((result* 31)+((this.stypCode == null)? 0 :this.stypCode.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.stdadapApstCode == null)? 0 :this.stdadapApstCode.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Sgbstdn) == false) {
            return false;
        }
        Sgbstdn rhs = ((Sgbstdn) other);
        return ((((((((((((((((((((((((((this.egolDesc == rhs.egolDesc)||((this.egolDesc!= null)&&this.egolDesc.equals(rhs.egolDesc)))&&((this.edlvCode == rhs.edlvCode)||((this.edlvCode!= null)&&this.edlvCode.equals(rhs.edlvCode))))&&((this.stvapdcDesc == rhs.stvapdcDesc)||((this.stvapdcDesc!= null)&&this.stvapdcDesc.equals(rhs.stvapdcDesc))))&&((this.rateCode == rhs.rateCode)||((this.rateCode!= null)&&this.rateCode.equals(rhs.rateCode))))&&((this.stvstypDesc == rhs.stvstypDesc)||((this.stvstypDesc!= null)&&this.stvstypDesc.equals(rhs.stvstypDesc))))&&((this.stvsbgiDesc == rhs.stvsbgiDesc)||((this.stvsbgiDesc!= null)&&this.stvsbgiDesc.equals(rhs.stvsbgiDesc))))&&((this.adapApplNo == rhs.adapApplNo)||((this.adapApplNo!= null)&&this.adapApplNo.equals(rhs.adapApplNo))))&&((this.fullPartInd == rhs.fullPartInd)||((this.fullPartInd!= null)&&this.fullPartInd.equals(rhs.fullPartInd))))&&((this.stvststDesc == rhs.stvststDesc)||((this.stvststDesc!= null)&&this.stvststDesc.equals(rhs.stvststDesc))))&&((this.stvadmtDesc == rhs.stvadmtDesc)||((this.stvadmtDesc!= null)&&this.stvadmtDesc.equals(rhs.stvadmtDesc))))&&((this.stvresdDesc == rhs.stvresdDesc)||((this.stvresdDesc!= null)&&this.stvresdDesc.equals(rhs.stvresdDesc))))&&((this.addAdmInd == rhs.addAdmInd)||((this.addAdmInd!= null)&&this.addAdmInd.equals(rhs.addAdmInd))))&&((this.stdrecrSbgiCode == rhs.stdrecrSbgiCode)||((this.stdrecrSbgiCode!= null)&&this.stdrecrSbgiCode.equals(rhs.stdrecrSbgiCode))))&&((this.resdCode == rhs.resdCode)||((this.resdCode!= null)&&this.resdCode.equals(rhs.resdCode))))&&((this.edlvDesc == rhs.edlvDesc)||((this.edlvDesc!= null)&&this.edlvDesc.equals(rhs.edlvDesc))))&&((this.stdadapAdmtCode == rhs.stdadapAdmtCode)||((this.stdadapAdmtCode!= null)&&this.stdadapAdmtCode.equals(rhs.stdadapAdmtCode))))&&((this.stvapstDesc == rhs.stvapstDesc)||((this.stvapstDesc!= null)&&this.stvapstDesc.equals(rhs.stvapstDesc))))&&((this.ststCode == rhs.ststCode)||((this.ststCode!= null)&&this.ststCode.equals(rhs.ststCode))))&&((this.stvrateDesc == rhs.stvrateDesc)||((this.stvrateDesc!= null)&&this.stvrateDesc.equals(rhs.stvrateDesc))))&&((this.stdappdApdcCode == rhs.stdappdApdcCode)||((this.stdappdApdcCode!= null)&&this.stdappdApdcCode.equals(rhs.stdappdApdcCode))))&&((this.egolCode == rhs.egolCode)||((this.egolCode!= null)&&this.egolCode.equals(rhs.egolCode))))&&((this.addRecrInd == rhs.addRecrInd)||((this.addRecrInd!= null)&&this.addRecrInd.equals(rhs.addRecrInd))))&&((this.stypCode == rhs.stypCode)||((this.stypCode!= null)&&this.stypCode.equals(rhs.stypCode))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.stdadapApstCode == rhs.stdadapApstCode)||((this.stdadapApstCode!= null)&&this.stdadapApstCode.equals(rhs.stdadapApstCode))));
    }

}
