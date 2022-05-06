
package com.ellucian.generated.bpapi.ban.student_course_registrations_student_term.v1_0_0;

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
    "termCastDesc",
    "astdDesc",
    "advrName",
    "termEffDesc",
    "xxxxxxxCastCode",
    "lastTermAttended",
    "ststDesc",
    "xxxxxxxPrevCode",
    "rateCode",
    "resdDesc",
    "xxxxxxxTermCodePrev",
    "stypDesc",
    "stvscpcDesc",
    "fullPartDesc",
    "xxxxxxxTermCodeCast",
    "termPrevDesc",
    "fullPartInd",
    "castDesc",
    "termAstdDesc",
    "termCodeEff",
    "xxxxxxxAstdCode",
    "prevDesc",
    "resdCode",
    "blckDesc",
    "termaDesc",
    "scpcCode",
    "rateDesc",
    "ststCode",
    "blckCode",
    "stypCode",
    "sgrclsrClasCode",
    "clasDesc",
    "xxxxxxxTermCodeAstd"
})
@Generated("jsonschema2pojo")
public class Sgbstdn {

    @JsonProperty("termCastDesc")
    private String termCastDesc;
    @JsonProperty("astdDesc")
    private String astdDesc;
    /**
     * Advisor
     * <p>
     * 
     * 
     */
    @JsonProperty("advrName")
    private String advrName;
    @JsonProperty("termEffDesc")
    private String termEffDesc;
    /**
     * Combined Academic Standing
     * <p>
     * Lookup lineage reference object : stvcast
     * 
     */
    @JsonProperty("xxxxxxxCastCode")
    @JsonPropertyDescription("Lookup lineage reference object : stvcast")
    private String xxxxxxxCastCode;
    /**
     * Last Term Attended
     * <p>
     * 
     * 
     */
    @JsonProperty("lastTermAttended")
    private String lastTermAttended;
    @JsonProperty("ststDesc")
    private String ststDesc;
    /**
     * Progress Evaluation
     * <p>
     * Lookup lineage reference object : stvprev
     * 
     */
    @JsonProperty("xxxxxxxPrevCode")
    @JsonPropertyDescription("Lookup lineage reference object : stvprev")
    private String xxxxxxxPrevCode;
    /**
     * Fee Assessment Rate
     * <p>
     * Lineage reference object : SGBSTDN_RATE_CODE, Lookup lineage reference object : stvrate
     * 
     */
    @JsonProperty("rateCode")
    @JsonPropertyDescription("Lineage reference object : SGBSTDN_RATE_CODE, Lookup lineage reference object : stvrate")
    private String rateCode;
    @JsonProperty("resdDesc")
    private String resdDesc;
    /**
     * Override Term
     * <p>
     * 
     * 
     */
    @JsonProperty("xxxxxxxTermCodePrev")
    private String xxxxxxxTermCodePrev;
    @JsonProperty("stypDesc")
    private String stypDesc;
    @JsonProperty("stvscpcDesc")
    private String stvscpcDesc;
    @JsonProperty("fullPartDesc")
    private String fullPartDesc;
    /**
     * Override Term
     * <p>
     * 
     * 
     */
    @JsonProperty("xxxxxxxTermCodeCast")
    private String xxxxxxxTermCodeCast;
    @JsonProperty("termPrevDesc")
    private String termPrevDesc;
    /**
     * Full or Part Time
     * <p>
     * Lineage reference object : SGBSTDN_FULL_PART_IND
     * 
     */
    @JsonProperty("fullPartInd")
    @JsonPropertyDescription("Lineage reference object : SGBSTDN_FULL_PART_IND")
    private String fullPartInd;
    @JsonProperty("castDesc")
    private String castDesc;
    @JsonProperty("termAstdDesc")
    private String termAstdDesc;
    /**
     * Effective Term
     * <p>
     * Lineage reference object : SGBSTDN_TERM_CODE_EFF
     * 
     */
    @JsonProperty("termCodeEff")
    @JsonPropertyDescription("Lineage reference object : SGBSTDN_TERM_CODE_EFF")
    private String termCodeEff;
    /**
     * Academic Standing
     * <p>
     * Lookup lineage reference object : stvastd
     * 
     */
    @JsonProperty("xxxxxxxAstdCode")
    @JsonPropertyDescription("Lookup lineage reference object : stvastd")
    private String xxxxxxxAstdCode;
    @JsonProperty("prevDesc")
    private String prevDesc;
    /**
     * Residence
     * <p>
     * Lineage reference object : SGBSTDN_RESD_CODE, Lookup lineage reference object : stvresd
     * (Required)
     * 
     */
    @JsonProperty("resdCode")
    @JsonPropertyDescription("Lineage reference object : SGBSTDN_RESD_CODE, Lookup lineage reference object : stvresd")
    private String resdCode;
    @JsonProperty("blckDesc")
    private String blckDesc;
    @JsonProperty("termaDesc")
    private String termaDesc;
    /**
     * Student Centric Cycle
     * <p>
     * Lineage reference object : SGBSTDN_SCPC_CODE, Lookup lineage reference object : stvscpc,sobscps,sorscpt
     * 
     */
    @JsonProperty("scpcCode")
    @JsonPropertyDescription("Lineage reference object : SGBSTDN_SCPC_CODE, Lookup lineage reference object : stvscpc,sobscps,sorscpt")
    private String scpcCode;
    @JsonProperty("rateDesc")
    private String rateDesc;
    /**
     * Student Status
     * <p>
     * Lineage reference object : SGBSTDN_STST_CODE, Lookup lineage reference object : stvstst
     * (Required)
     * 
     */
    @JsonProperty("ststCode")
    @JsonPropertyDescription("Lineage reference object : SGBSTDN_STST_CODE, Lookup lineage reference object : stvstst")
    private String ststCode;
    /**
     * Block Schedule
     * <p>
     * Lineage reference object : SGBSTDN_BLCK_CODE, Lookup lineage reference object : stvblck
     * 
     */
    @JsonProperty("blckCode")
    @JsonPropertyDescription("Lineage reference object : SGBSTDN_BLCK_CODE, Lookup lineage reference object : stvblck")
    private String blckCode;
    /**
     * Student Type
     * <p>
     * Lineage reference object : SGBSTDN_STYP_CODE, Lookup lineage reference object : stvstyp
     * (Required)
     * 
     */
    @JsonProperty("stypCode")
    @JsonPropertyDescription("Lineage reference object : SGBSTDN_STYP_CODE, Lookup lineage reference object : stvstyp")
    private String stypCode;
    /**
     * Class
     * <p>
     * Lookup lineage reference object : stvclas
     * 
     */
    @JsonProperty("sgrclsrClasCode")
    @JsonPropertyDescription("Lookup lineage reference object : stvclas")
    private String sgrclsrClasCode;
    @JsonProperty("clasDesc")
    private String clasDesc;
    /**
     * Override Term
     * <p>
     * 
     * 
     */
    @JsonProperty("xxxxxxxTermCodeAstd")
    private String xxxxxxxTermCodeAstd;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("termCastDesc")
    public String getTermCastDesc() {
        return termCastDesc;
    }

    @JsonProperty("termCastDesc")
    public void setTermCastDesc(String termCastDesc) {
        this.termCastDesc = termCastDesc;
    }

    public Sgbstdn withTermCastDesc(String termCastDesc) {
        this.termCastDesc = termCastDesc;
        return this;
    }

    @JsonProperty("astdDesc")
    public String getAstdDesc() {
        return astdDesc;
    }

    @JsonProperty("astdDesc")
    public void setAstdDesc(String astdDesc) {
        this.astdDesc = astdDesc;
    }

    public Sgbstdn withAstdDesc(String astdDesc) {
        this.astdDesc = astdDesc;
        return this;
    }

    /**
     * Advisor
     * <p>
     * 
     * 
     */
    @JsonProperty("advrName")
    public String getAdvrName() {
        return advrName;
    }

    /**
     * Advisor
     * <p>
     * 
     * 
     */
    @JsonProperty("advrName")
    public void setAdvrName(String advrName) {
        this.advrName = advrName;
    }

    public Sgbstdn withAdvrName(String advrName) {
        this.advrName = advrName;
        return this;
    }

    @JsonProperty("termEffDesc")
    public String getTermEffDesc() {
        return termEffDesc;
    }

    @JsonProperty("termEffDesc")
    public void setTermEffDesc(String termEffDesc) {
        this.termEffDesc = termEffDesc;
    }

    public Sgbstdn withTermEffDesc(String termEffDesc) {
        this.termEffDesc = termEffDesc;
        return this;
    }

    /**
     * Combined Academic Standing
     * <p>
     * Lookup lineage reference object : stvcast
     * 
     */
    @JsonProperty("xxxxxxxCastCode")
    public String getXxxxxxxCastCode() {
        return xxxxxxxCastCode;
    }

    /**
     * Combined Academic Standing
     * <p>
     * Lookup lineage reference object : stvcast
     * 
     */
    @JsonProperty("xxxxxxxCastCode")
    public void setXxxxxxxCastCode(String xxxxxxxCastCode) {
        this.xxxxxxxCastCode = xxxxxxxCastCode;
    }

    public Sgbstdn withXxxxxxxCastCode(String xxxxxxxCastCode) {
        this.xxxxxxxCastCode = xxxxxxxCastCode;
        return this;
    }

    /**
     * Last Term Attended
     * <p>
     * 
     * 
     */
    @JsonProperty("lastTermAttended")
    public String getLastTermAttended() {
        return lastTermAttended;
    }

    /**
     * Last Term Attended
     * <p>
     * 
     * 
     */
    @JsonProperty("lastTermAttended")
    public void setLastTermAttended(String lastTermAttended) {
        this.lastTermAttended = lastTermAttended;
    }

    public Sgbstdn withLastTermAttended(String lastTermAttended) {
        this.lastTermAttended = lastTermAttended;
        return this;
    }

    @JsonProperty("ststDesc")
    public String getStstDesc() {
        return ststDesc;
    }

    @JsonProperty("ststDesc")
    public void setStstDesc(String ststDesc) {
        this.ststDesc = ststDesc;
    }

    public Sgbstdn withStstDesc(String ststDesc) {
        this.ststDesc = ststDesc;
        return this;
    }

    /**
     * Progress Evaluation
     * <p>
     * Lookup lineage reference object : stvprev
     * 
     */
    @JsonProperty("xxxxxxxPrevCode")
    public String getXxxxxxxPrevCode() {
        return xxxxxxxPrevCode;
    }

    /**
     * Progress Evaluation
     * <p>
     * Lookup lineage reference object : stvprev
     * 
     */
    @JsonProperty("xxxxxxxPrevCode")
    public void setXxxxxxxPrevCode(String xxxxxxxPrevCode) {
        this.xxxxxxxPrevCode = xxxxxxxPrevCode;
    }

    public Sgbstdn withXxxxxxxPrevCode(String xxxxxxxPrevCode) {
        this.xxxxxxxPrevCode = xxxxxxxPrevCode;
        return this;
    }

    /**
     * Fee Assessment Rate
     * <p>
     * Lineage reference object : SGBSTDN_RATE_CODE, Lookup lineage reference object : stvrate
     * 
     */
    @JsonProperty("rateCode")
    public String getRateCode() {
        return rateCode;
    }

    /**
     * Fee Assessment Rate
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

    @JsonProperty("resdDesc")
    public String getResdDesc() {
        return resdDesc;
    }

    @JsonProperty("resdDesc")
    public void setResdDesc(String resdDesc) {
        this.resdDesc = resdDesc;
    }

    public Sgbstdn withResdDesc(String resdDesc) {
        this.resdDesc = resdDesc;
        return this;
    }

    /**
     * Override Term
     * <p>
     * 
     * 
     */
    @JsonProperty("xxxxxxxTermCodePrev")
    public String getXxxxxxxTermCodePrev() {
        return xxxxxxxTermCodePrev;
    }

    /**
     * Override Term
     * <p>
     * 
     * 
     */
    @JsonProperty("xxxxxxxTermCodePrev")
    public void setXxxxxxxTermCodePrev(String xxxxxxxTermCodePrev) {
        this.xxxxxxxTermCodePrev = xxxxxxxTermCodePrev;
    }

    public Sgbstdn withXxxxxxxTermCodePrev(String xxxxxxxTermCodePrev) {
        this.xxxxxxxTermCodePrev = xxxxxxxTermCodePrev;
        return this;
    }

    @JsonProperty("stypDesc")
    public String getStypDesc() {
        return stypDesc;
    }

    @JsonProperty("stypDesc")
    public void setStypDesc(String stypDesc) {
        this.stypDesc = stypDesc;
    }

    public Sgbstdn withStypDesc(String stypDesc) {
        this.stypDesc = stypDesc;
        return this;
    }

    @JsonProperty("stvscpcDesc")
    public String getStvscpcDesc() {
        return stvscpcDesc;
    }

    @JsonProperty("stvscpcDesc")
    public void setStvscpcDesc(String stvscpcDesc) {
        this.stvscpcDesc = stvscpcDesc;
    }

    public Sgbstdn withStvscpcDesc(String stvscpcDesc) {
        this.stvscpcDesc = stvscpcDesc;
        return this;
    }

    @JsonProperty("fullPartDesc")
    public String getFullPartDesc() {
        return fullPartDesc;
    }

    @JsonProperty("fullPartDesc")
    public void setFullPartDesc(String fullPartDesc) {
        this.fullPartDesc = fullPartDesc;
    }

    public Sgbstdn withFullPartDesc(String fullPartDesc) {
        this.fullPartDesc = fullPartDesc;
        return this;
    }

    /**
     * Override Term
     * <p>
     * 
     * 
     */
    @JsonProperty("xxxxxxxTermCodeCast")
    public String getXxxxxxxTermCodeCast() {
        return xxxxxxxTermCodeCast;
    }

    /**
     * Override Term
     * <p>
     * 
     * 
     */
    @JsonProperty("xxxxxxxTermCodeCast")
    public void setXxxxxxxTermCodeCast(String xxxxxxxTermCodeCast) {
        this.xxxxxxxTermCodeCast = xxxxxxxTermCodeCast;
    }

    public Sgbstdn withXxxxxxxTermCodeCast(String xxxxxxxTermCodeCast) {
        this.xxxxxxxTermCodeCast = xxxxxxxTermCodeCast;
        return this;
    }

    @JsonProperty("termPrevDesc")
    public String getTermPrevDesc() {
        return termPrevDesc;
    }

    @JsonProperty("termPrevDesc")
    public void setTermPrevDesc(String termPrevDesc) {
        this.termPrevDesc = termPrevDesc;
    }

    public Sgbstdn withTermPrevDesc(String termPrevDesc) {
        this.termPrevDesc = termPrevDesc;
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

    @JsonProperty("castDesc")
    public String getCastDesc() {
        return castDesc;
    }

    @JsonProperty("castDesc")
    public void setCastDesc(String castDesc) {
        this.castDesc = castDesc;
    }

    public Sgbstdn withCastDesc(String castDesc) {
        this.castDesc = castDesc;
        return this;
    }

    @JsonProperty("termAstdDesc")
    public String getTermAstdDesc() {
        return termAstdDesc;
    }

    @JsonProperty("termAstdDesc")
    public void setTermAstdDesc(String termAstdDesc) {
        this.termAstdDesc = termAstdDesc;
    }

    public Sgbstdn withTermAstdDesc(String termAstdDesc) {
        this.termAstdDesc = termAstdDesc;
        return this;
    }

    /**
     * Effective Term
     * <p>
     * Lineage reference object : SGBSTDN_TERM_CODE_EFF
     * 
     */
    @JsonProperty("termCodeEff")
    public String getTermCodeEff() {
        return termCodeEff;
    }

    /**
     * Effective Term
     * <p>
     * Lineage reference object : SGBSTDN_TERM_CODE_EFF
     * 
     */
    @JsonProperty("termCodeEff")
    public void setTermCodeEff(String termCodeEff) {
        this.termCodeEff = termCodeEff;
    }

    public Sgbstdn withTermCodeEff(String termCodeEff) {
        this.termCodeEff = termCodeEff;
        return this;
    }

    /**
     * Academic Standing
     * <p>
     * Lookup lineage reference object : stvastd
     * 
     */
    @JsonProperty("xxxxxxxAstdCode")
    public String getXxxxxxxAstdCode() {
        return xxxxxxxAstdCode;
    }

    /**
     * Academic Standing
     * <p>
     * Lookup lineage reference object : stvastd
     * 
     */
    @JsonProperty("xxxxxxxAstdCode")
    public void setXxxxxxxAstdCode(String xxxxxxxAstdCode) {
        this.xxxxxxxAstdCode = xxxxxxxAstdCode;
    }

    public Sgbstdn withXxxxxxxAstdCode(String xxxxxxxAstdCode) {
        this.xxxxxxxAstdCode = xxxxxxxAstdCode;
        return this;
    }

    @JsonProperty("prevDesc")
    public String getPrevDesc() {
        return prevDesc;
    }

    @JsonProperty("prevDesc")
    public void setPrevDesc(String prevDesc) {
        this.prevDesc = prevDesc;
    }

    public Sgbstdn withPrevDesc(String prevDesc) {
        this.prevDesc = prevDesc;
        return this;
    }

    /**
     * Residence
     * <p>
     * Lineage reference object : SGBSTDN_RESD_CODE, Lookup lineage reference object : stvresd
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
     * Lineage reference object : SGBSTDN_RESD_CODE, Lookup lineage reference object : stvresd
     * (Required)
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

    @JsonProperty("blckDesc")
    public String getBlckDesc() {
        return blckDesc;
    }

    @JsonProperty("blckDesc")
    public void setBlckDesc(String blckDesc) {
        this.blckDesc = blckDesc;
    }

    public Sgbstdn withBlckDesc(String blckDesc) {
        this.blckDesc = blckDesc;
        return this;
    }

    @JsonProperty("termaDesc")
    public String getTermaDesc() {
        return termaDesc;
    }

    @JsonProperty("termaDesc")
    public void setTermaDesc(String termaDesc) {
        this.termaDesc = termaDesc;
    }

    public Sgbstdn withTermaDesc(String termaDesc) {
        this.termaDesc = termaDesc;
        return this;
    }

    /**
     * Student Centric Cycle
     * <p>
     * Lineage reference object : SGBSTDN_SCPC_CODE, Lookup lineage reference object : stvscpc,sobscps,sorscpt
     * 
     */
    @JsonProperty("scpcCode")
    public String getScpcCode() {
        return scpcCode;
    }

    /**
     * Student Centric Cycle
     * <p>
     * Lineage reference object : SGBSTDN_SCPC_CODE, Lookup lineage reference object : stvscpc,sobscps,sorscpt
     * 
     */
    @JsonProperty("scpcCode")
    public void setScpcCode(String scpcCode) {
        this.scpcCode = scpcCode;
    }

    public Sgbstdn withScpcCode(String scpcCode) {
        this.scpcCode = scpcCode;
        return this;
    }

    @JsonProperty("rateDesc")
    public String getRateDesc() {
        return rateDesc;
    }

    @JsonProperty("rateDesc")
    public void setRateDesc(String rateDesc) {
        this.rateDesc = rateDesc;
    }

    public Sgbstdn withRateDesc(String rateDesc) {
        this.rateDesc = rateDesc;
        return this;
    }

    /**
     * Student Status
     * <p>
     * Lineage reference object : SGBSTDN_STST_CODE, Lookup lineage reference object : stvstst
     * (Required)
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
     * (Required)
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

    /**
     * Block Schedule
     * <p>
     * Lineage reference object : SGBSTDN_BLCK_CODE, Lookup lineage reference object : stvblck
     * 
     */
    @JsonProperty("blckCode")
    public String getBlckCode() {
        return blckCode;
    }

    /**
     * Block Schedule
     * <p>
     * Lineage reference object : SGBSTDN_BLCK_CODE, Lookup lineage reference object : stvblck
     * 
     */
    @JsonProperty("blckCode")
    public void setBlckCode(String blckCode) {
        this.blckCode = blckCode;
    }

    public Sgbstdn withBlckCode(String blckCode) {
        this.blckCode = blckCode;
        return this;
    }

    /**
     * Student Type
     * <p>
     * Lineage reference object : SGBSTDN_STYP_CODE, Lookup lineage reference object : stvstyp
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
     * Lineage reference object : SGBSTDN_STYP_CODE, Lookup lineage reference object : stvstyp
     * (Required)
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
     * Class
     * <p>
     * Lookup lineage reference object : stvclas
     * 
     */
    @JsonProperty("sgrclsrClasCode")
    public String getSgrclsrClasCode() {
        return sgrclsrClasCode;
    }

    /**
     * Class
     * <p>
     * Lookup lineage reference object : stvclas
     * 
     */
    @JsonProperty("sgrclsrClasCode")
    public void setSgrclsrClasCode(String sgrclsrClasCode) {
        this.sgrclsrClasCode = sgrclsrClasCode;
    }

    public Sgbstdn withSgrclsrClasCode(String sgrclsrClasCode) {
        this.sgrclsrClasCode = sgrclsrClasCode;
        return this;
    }

    @JsonProperty("clasDesc")
    public String getClasDesc() {
        return clasDesc;
    }

    @JsonProperty("clasDesc")
    public void setClasDesc(String clasDesc) {
        this.clasDesc = clasDesc;
    }

    public Sgbstdn withClasDesc(String clasDesc) {
        this.clasDesc = clasDesc;
        return this;
    }

    /**
     * Override Term
     * <p>
     * 
     * 
     */
    @JsonProperty("xxxxxxxTermCodeAstd")
    public String getXxxxxxxTermCodeAstd() {
        return xxxxxxxTermCodeAstd;
    }

    /**
     * Override Term
     * <p>
     * 
     * 
     */
    @JsonProperty("xxxxxxxTermCodeAstd")
    public void setXxxxxxxTermCodeAstd(String xxxxxxxTermCodeAstd) {
        this.xxxxxxxTermCodeAstd = xxxxxxxTermCodeAstd;
    }

    public Sgbstdn withXxxxxxxTermCodeAstd(String xxxxxxxTermCodeAstd) {
        this.xxxxxxxTermCodeAstd = xxxxxxxTermCodeAstd;
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
        sb.append("termCastDesc");
        sb.append('=');
        sb.append(((this.termCastDesc == null)?"<null>":this.termCastDesc));
        sb.append(',');
        sb.append("astdDesc");
        sb.append('=');
        sb.append(((this.astdDesc == null)?"<null>":this.astdDesc));
        sb.append(',');
        sb.append("advrName");
        sb.append('=');
        sb.append(((this.advrName == null)?"<null>":this.advrName));
        sb.append(',');
        sb.append("termEffDesc");
        sb.append('=');
        sb.append(((this.termEffDesc == null)?"<null>":this.termEffDesc));
        sb.append(',');
        sb.append("xxxxxxxCastCode");
        sb.append('=');
        sb.append(((this.xxxxxxxCastCode == null)?"<null>":this.xxxxxxxCastCode));
        sb.append(',');
        sb.append("lastTermAttended");
        sb.append('=');
        sb.append(((this.lastTermAttended == null)?"<null>":this.lastTermAttended));
        sb.append(',');
        sb.append("ststDesc");
        sb.append('=');
        sb.append(((this.ststDesc == null)?"<null>":this.ststDesc));
        sb.append(',');
        sb.append("xxxxxxxPrevCode");
        sb.append('=');
        sb.append(((this.xxxxxxxPrevCode == null)?"<null>":this.xxxxxxxPrevCode));
        sb.append(',');
        sb.append("rateCode");
        sb.append('=');
        sb.append(((this.rateCode == null)?"<null>":this.rateCode));
        sb.append(',');
        sb.append("resdDesc");
        sb.append('=');
        sb.append(((this.resdDesc == null)?"<null>":this.resdDesc));
        sb.append(',');
        sb.append("xxxxxxxTermCodePrev");
        sb.append('=');
        sb.append(((this.xxxxxxxTermCodePrev == null)?"<null>":this.xxxxxxxTermCodePrev));
        sb.append(',');
        sb.append("stypDesc");
        sb.append('=');
        sb.append(((this.stypDesc == null)?"<null>":this.stypDesc));
        sb.append(',');
        sb.append("stvscpcDesc");
        sb.append('=');
        sb.append(((this.stvscpcDesc == null)?"<null>":this.stvscpcDesc));
        sb.append(',');
        sb.append("fullPartDesc");
        sb.append('=');
        sb.append(((this.fullPartDesc == null)?"<null>":this.fullPartDesc));
        sb.append(',');
        sb.append("xxxxxxxTermCodeCast");
        sb.append('=');
        sb.append(((this.xxxxxxxTermCodeCast == null)?"<null>":this.xxxxxxxTermCodeCast));
        sb.append(',');
        sb.append("termPrevDesc");
        sb.append('=');
        sb.append(((this.termPrevDesc == null)?"<null>":this.termPrevDesc));
        sb.append(',');
        sb.append("fullPartInd");
        sb.append('=');
        sb.append(((this.fullPartInd == null)?"<null>":this.fullPartInd));
        sb.append(',');
        sb.append("castDesc");
        sb.append('=');
        sb.append(((this.castDesc == null)?"<null>":this.castDesc));
        sb.append(',');
        sb.append("termAstdDesc");
        sb.append('=');
        sb.append(((this.termAstdDesc == null)?"<null>":this.termAstdDesc));
        sb.append(',');
        sb.append("termCodeEff");
        sb.append('=');
        sb.append(((this.termCodeEff == null)?"<null>":this.termCodeEff));
        sb.append(',');
        sb.append("xxxxxxxAstdCode");
        sb.append('=');
        sb.append(((this.xxxxxxxAstdCode == null)?"<null>":this.xxxxxxxAstdCode));
        sb.append(',');
        sb.append("prevDesc");
        sb.append('=');
        sb.append(((this.prevDesc == null)?"<null>":this.prevDesc));
        sb.append(',');
        sb.append("resdCode");
        sb.append('=');
        sb.append(((this.resdCode == null)?"<null>":this.resdCode));
        sb.append(',');
        sb.append("blckDesc");
        sb.append('=');
        sb.append(((this.blckDesc == null)?"<null>":this.blckDesc));
        sb.append(',');
        sb.append("termaDesc");
        sb.append('=');
        sb.append(((this.termaDesc == null)?"<null>":this.termaDesc));
        sb.append(',');
        sb.append("scpcCode");
        sb.append('=');
        sb.append(((this.scpcCode == null)?"<null>":this.scpcCode));
        sb.append(',');
        sb.append("rateDesc");
        sb.append('=');
        sb.append(((this.rateDesc == null)?"<null>":this.rateDesc));
        sb.append(',');
        sb.append("ststCode");
        sb.append('=');
        sb.append(((this.ststCode == null)?"<null>":this.ststCode));
        sb.append(',');
        sb.append("blckCode");
        sb.append('=');
        sb.append(((this.blckCode == null)?"<null>":this.blckCode));
        sb.append(',');
        sb.append("stypCode");
        sb.append('=');
        sb.append(((this.stypCode == null)?"<null>":this.stypCode));
        sb.append(',');
        sb.append("sgrclsrClasCode");
        sb.append('=');
        sb.append(((this.sgrclsrClasCode == null)?"<null>":this.sgrclsrClasCode));
        sb.append(',');
        sb.append("clasDesc");
        sb.append('=');
        sb.append(((this.clasDesc == null)?"<null>":this.clasDesc));
        sb.append(',');
        sb.append("xxxxxxxTermCodeAstd");
        sb.append('=');
        sb.append(((this.xxxxxxxTermCodeAstd == null)?"<null>":this.xxxxxxxTermCodeAstd));
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
        result = ((result* 31)+((this.termCastDesc == null)? 0 :this.termCastDesc.hashCode()));
        result = ((result* 31)+((this.astdDesc == null)? 0 :this.astdDesc.hashCode()));
        result = ((result* 31)+((this.advrName == null)? 0 :this.advrName.hashCode()));
        result = ((result* 31)+((this.termEffDesc == null)? 0 :this.termEffDesc.hashCode()));
        result = ((result* 31)+((this.xxxxxxxCastCode == null)? 0 :this.xxxxxxxCastCode.hashCode()));
        result = ((result* 31)+((this.lastTermAttended == null)? 0 :this.lastTermAttended.hashCode()));
        result = ((result* 31)+((this.ststDesc == null)? 0 :this.ststDesc.hashCode()));
        result = ((result* 31)+((this.xxxxxxxPrevCode == null)? 0 :this.xxxxxxxPrevCode.hashCode()));
        result = ((result* 31)+((this.rateCode == null)? 0 :this.rateCode.hashCode()));
        result = ((result* 31)+((this.resdDesc == null)? 0 :this.resdDesc.hashCode()));
        result = ((result* 31)+((this.xxxxxxxTermCodePrev == null)? 0 :this.xxxxxxxTermCodePrev.hashCode()));
        result = ((result* 31)+((this.stypDesc == null)? 0 :this.stypDesc.hashCode()));
        result = ((result* 31)+((this.stvscpcDesc == null)? 0 :this.stvscpcDesc.hashCode()));
        result = ((result* 31)+((this.fullPartDesc == null)? 0 :this.fullPartDesc.hashCode()));
        result = ((result* 31)+((this.xxxxxxxTermCodeCast == null)? 0 :this.xxxxxxxTermCodeCast.hashCode()));
        result = ((result* 31)+((this.termPrevDesc == null)? 0 :this.termPrevDesc.hashCode()));
        result = ((result* 31)+((this.fullPartInd == null)? 0 :this.fullPartInd.hashCode()));
        result = ((result* 31)+((this.castDesc == null)? 0 :this.castDesc.hashCode()));
        result = ((result* 31)+((this.termAstdDesc == null)? 0 :this.termAstdDesc.hashCode()));
        result = ((result* 31)+((this.termCodeEff == null)? 0 :this.termCodeEff.hashCode()));
        result = ((result* 31)+((this.xxxxxxxAstdCode == null)? 0 :this.xxxxxxxAstdCode.hashCode()));
        result = ((result* 31)+((this.prevDesc == null)? 0 :this.prevDesc.hashCode()));
        result = ((result* 31)+((this.resdCode == null)? 0 :this.resdCode.hashCode()));
        result = ((result* 31)+((this.blckDesc == null)? 0 :this.blckDesc.hashCode()));
        result = ((result* 31)+((this.termaDesc == null)? 0 :this.termaDesc.hashCode()));
        result = ((result* 31)+((this.scpcCode == null)? 0 :this.scpcCode.hashCode()));
        result = ((result* 31)+((this.rateDesc == null)? 0 :this.rateDesc.hashCode()));
        result = ((result* 31)+((this.ststCode == null)? 0 :this.ststCode.hashCode()));
        result = ((result* 31)+((this.blckCode == null)? 0 :this.blckCode.hashCode()));
        result = ((result* 31)+((this.stypCode == null)? 0 :this.stypCode.hashCode()));
        result = ((result* 31)+((this.sgrclsrClasCode == null)? 0 :this.sgrclsrClasCode.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.clasDesc == null)? 0 :this.clasDesc.hashCode()));
        result = ((result* 31)+((this.xxxxxxxTermCodeAstd == null)? 0 :this.xxxxxxxTermCodeAstd.hashCode()));
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
        return (((((((((((((((((((((((((((((((((((this.termCastDesc == rhs.termCastDesc)||((this.termCastDesc!= null)&&this.termCastDesc.equals(rhs.termCastDesc)))&&((this.astdDesc == rhs.astdDesc)||((this.astdDesc!= null)&&this.astdDesc.equals(rhs.astdDesc))))&&((this.advrName == rhs.advrName)||((this.advrName!= null)&&this.advrName.equals(rhs.advrName))))&&((this.termEffDesc == rhs.termEffDesc)||((this.termEffDesc!= null)&&this.termEffDesc.equals(rhs.termEffDesc))))&&((this.xxxxxxxCastCode == rhs.xxxxxxxCastCode)||((this.xxxxxxxCastCode!= null)&&this.xxxxxxxCastCode.equals(rhs.xxxxxxxCastCode))))&&((this.lastTermAttended == rhs.lastTermAttended)||((this.lastTermAttended!= null)&&this.lastTermAttended.equals(rhs.lastTermAttended))))&&((this.ststDesc == rhs.ststDesc)||((this.ststDesc!= null)&&this.ststDesc.equals(rhs.ststDesc))))&&((this.xxxxxxxPrevCode == rhs.xxxxxxxPrevCode)||((this.xxxxxxxPrevCode!= null)&&this.xxxxxxxPrevCode.equals(rhs.xxxxxxxPrevCode))))&&((this.rateCode == rhs.rateCode)||((this.rateCode!= null)&&this.rateCode.equals(rhs.rateCode))))&&((this.resdDesc == rhs.resdDesc)||((this.resdDesc!= null)&&this.resdDesc.equals(rhs.resdDesc))))&&((this.xxxxxxxTermCodePrev == rhs.xxxxxxxTermCodePrev)||((this.xxxxxxxTermCodePrev!= null)&&this.xxxxxxxTermCodePrev.equals(rhs.xxxxxxxTermCodePrev))))&&((this.stypDesc == rhs.stypDesc)||((this.stypDesc!= null)&&this.stypDesc.equals(rhs.stypDesc))))&&((this.stvscpcDesc == rhs.stvscpcDesc)||((this.stvscpcDesc!= null)&&this.stvscpcDesc.equals(rhs.stvscpcDesc))))&&((this.fullPartDesc == rhs.fullPartDesc)||((this.fullPartDesc!= null)&&this.fullPartDesc.equals(rhs.fullPartDesc))))&&((this.xxxxxxxTermCodeCast == rhs.xxxxxxxTermCodeCast)||((this.xxxxxxxTermCodeCast!= null)&&this.xxxxxxxTermCodeCast.equals(rhs.xxxxxxxTermCodeCast))))&&((this.termPrevDesc == rhs.termPrevDesc)||((this.termPrevDesc!= null)&&this.termPrevDesc.equals(rhs.termPrevDesc))))&&((this.fullPartInd == rhs.fullPartInd)||((this.fullPartInd!= null)&&this.fullPartInd.equals(rhs.fullPartInd))))&&((this.castDesc == rhs.castDesc)||((this.castDesc!= null)&&this.castDesc.equals(rhs.castDesc))))&&((this.termAstdDesc == rhs.termAstdDesc)||((this.termAstdDesc!= null)&&this.termAstdDesc.equals(rhs.termAstdDesc))))&&((this.termCodeEff == rhs.termCodeEff)||((this.termCodeEff!= null)&&this.termCodeEff.equals(rhs.termCodeEff))))&&((this.xxxxxxxAstdCode == rhs.xxxxxxxAstdCode)||((this.xxxxxxxAstdCode!= null)&&this.xxxxxxxAstdCode.equals(rhs.xxxxxxxAstdCode))))&&((this.prevDesc == rhs.prevDesc)||((this.prevDesc!= null)&&this.prevDesc.equals(rhs.prevDesc))))&&((this.resdCode == rhs.resdCode)||((this.resdCode!= null)&&this.resdCode.equals(rhs.resdCode))))&&((this.blckDesc == rhs.blckDesc)||((this.blckDesc!= null)&&this.blckDesc.equals(rhs.blckDesc))))&&((this.termaDesc == rhs.termaDesc)||((this.termaDesc!= null)&&this.termaDesc.equals(rhs.termaDesc))))&&((this.scpcCode == rhs.scpcCode)||((this.scpcCode!= null)&&this.scpcCode.equals(rhs.scpcCode))))&&((this.rateDesc == rhs.rateDesc)||((this.rateDesc!= null)&&this.rateDesc.equals(rhs.rateDesc))))&&((this.ststCode == rhs.ststCode)||((this.ststCode!= null)&&this.ststCode.equals(rhs.ststCode))))&&((this.blckCode == rhs.blckCode)||((this.blckCode!= null)&&this.blckCode.equals(rhs.blckCode))))&&((this.stypCode == rhs.stypCode)||((this.stypCode!= null)&&this.stypCode.equals(rhs.stypCode))))&&((this.sgrclsrClasCode == rhs.sgrclsrClasCode)||((this.sgrclsrClasCode!= null)&&this.sgrclsrClasCode.equals(rhs.sgrclsrClasCode))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.clasDesc == rhs.clasDesc)||((this.clasDesc!= null)&&this.clasDesc.equals(rhs.clasDesc))))&&((this.xxxxxxxTermCodeAstd == rhs.xxxxxxxTermCodeAstd)||((this.xxxxxxxTermCodeAstd!= null)&&this.xxxxxxxTermCodeAstd.equals(rhs.xxxxxxxTermCodeAstd))));
    }

}
