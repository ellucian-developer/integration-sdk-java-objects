
package com.ellucian.generated.bpapi.ban.admissions_decision_high_school_review.v1_0_0;

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
    "fullPartInd",
    "sbgiCode",
    "dplmCode",
    "graduationDate",
    "percentile",
    "collPrepInd",
    "gpa",
    "sbjcCode",
    "grade",
    "subjYears",
    "subjGpa"
})
@Generated("jsonschema2pojo")
public class AdmissionsDecisionHighSchoolReview100QapiPost {

    @JsonProperty("id")
    private String id;
    @JsonProperty("keyblocTermCode")
    private String keyblocTermCode;
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
    @JsonProperty("sbgiCode")
    private String sbgiCode;
    @JsonProperty("dplmCode")
    private String dplmCode;
    @JsonProperty("graduationDate")
    private String graduationDate;
    @JsonProperty("percentile")
    private String percentile;
    @JsonProperty("collPrepInd")
    private String collPrepInd;
    @JsonProperty("gpa")
    private String gpa;
    /**
     * Subject
     * <p>
     * Lineage reference object : SORHSBJ_SBJC_CODE, Lookup lineage reference object : stvsbjc
     * 
     */
    @JsonProperty("sbjcCode")
    @JsonPropertyDescription("Lineage reference object : SORHSBJ_SBJC_CODE, Lookup lineage reference object : stvsbjc")
    private String sbjcCode;
    /**
     * Grade
     * <p>
     * Lineage reference object : SORHSBJ_GRADE
     * 
     */
    @JsonProperty("grade")
    @JsonPropertyDescription("Lineage reference object : SORHSBJ_GRADE")
    private String grade;
    /**
     * Years
     * <p>
     * Lineage reference object : SORHSBJ_SUBJ_YEARS
     * 
     */
    @JsonProperty("subjYears")
    @JsonPropertyDescription("Lineage reference object : SORHSBJ_SUBJ_YEARS")
    private Double subjYears;
    /**
     * Subject GPA
     * <p>
     * Lineage reference object : SORHSBJ_SUBJ_GPA
     * 
     */
    @JsonProperty("subjGpa")
    @JsonPropertyDescription("Lineage reference object : SORHSBJ_SUBJ_GPA")
    private String subjGpa;
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

    public AdmissionsDecisionHighSchoolReview100QapiPost withId(String id) {
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

    public AdmissionsDecisionHighSchoolReview100QapiPost withKeyblocTermCode(String keyblocTermCode) {
        this.keyblocTermCode = keyblocTermCode;
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

    public AdmissionsDecisionHighSchoolReview100QapiPost withTermCodeEntry(String termCodeEntry) {
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

    public AdmissionsDecisionHighSchoolReview100QapiPost withSarappdApdcCode(String sarappdApdcCode) {
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

    public AdmissionsDecisionHighSchoolReview100QapiPost withApstCode(String apstCode) {
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

    public AdmissionsDecisionHighSchoolReview100QapiPost withApplDate(String applDate) {
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

    public AdmissionsDecisionHighSchoolReview100QapiPost withApplNo(String applNo) {
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

    public AdmissionsDecisionHighSchoolReview100QapiPost withAdmtCode(String admtCode) {
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

    public AdmissionsDecisionHighSchoolReview100QapiPost withSessCode(String sessCode) {
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

    public AdmissionsDecisionHighSchoolReview100QapiPost withReqDocInd(String reqDocInd) {
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

    public AdmissionsDecisionHighSchoolReview100QapiPost withApplPreference(String applPreference) {
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

    public AdmissionsDecisionHighSchoolReview100QapiPost withStypCode(String stypCode) {
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

    public AdmissionsDecisionHighSchoolReview100QapiPost withResdCode(String resdCode) {
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

    public AdmissionsDecisionHighSchoolReview100QapiPost withFullPartInd(String fullPartInd) {
        this.fullPartInd = fullPartInd;
        return this;
    }

    @JsonProperty("sbgiCode")
    public String getSbgiCode() {
        return sbgiCode;
    }

    @JsonProperty("sbgiCode")
    public void setSbgiCode(String sbgiCode) {
        this.sbgiCode = sbgiCode;
    }

    public AdmissionsDecisionHighSchoolReview100QapiPost withSbgiCode(String sbgiCode) {
        this.sbgiCode = sbgiCode;
        return this;
    }

    @JsonProperty("dplmCode")
    public String getDplmCode() {
        return dplmCode;
    }

    @JsonProperty("dplmCode")
    public void setDplmCode(String dplmCode) {
        this.dplmCode = dplmCode;
    }

    public AdmissionsDecisionHighSchoolReview100QapiPost withDplmCode(String dplmCode) {
        this.dplmCode = dplmCode;
        return this;
    }

    @JsonProperty("graduationDate")
    public String getGraduationDate() {
        return graduationDate;
    }

    @JsonProperty("graduationDate")
    public void setGraduationDate(String graduationDate) {
        this.graduationDate = graduationDate;
    }

    public AdmissionsDecisionHighSchoolReview100QapiPost withGraduationDate(String graduationDate) {
        this.graduationDate = graduationDate;
        return this;
    }

    @JsonProperty("percentile")
    public String getPercentile() {
        return percentile;
    }

    @JsonProperty("percentile")
    public void setPercentile(String percentile) {
        this.percentile = percentile;
    }

    public AdmissionsDecisionHighSchoolReview100QapiPost withPercentile(String percentile) {
        this.percentile = percentile;
        return this;
    }

    @JsonProperty("collPrepInd")
    public String getCollPrepInd() {
        return collPrepInd;
    }

    @JsonProperty("collPrepInd")
    public void setCollPrepInd(String collPrepInd) {
        this.collPrepInd = collPrepInd;
    }

    public AdmissionsDecisionHighSchoolReview100QapiPost withCollPrepInd(String collPrepInd) {
        this.collPrepInd = collPrepInd;
        return this;
    }

    @JsonProperty("gpa")
    public String getGpa() {
        return gpa;
    }

    @JsonProperty("gpa")
    public void setGpa(String gpa) {
        this.gpa = gpa;
    }

    public AdmissionsDecisionHighSchoolReview100QapiPost withGpa(String gpa) {
        this.gpa = gpa;
        return this;
    }

    /**
     * Subject
     * <p>
     * Lineage reference object : SORHSBJ_SBJC_CODE, Lookup lineage reference object : stvsbjc
     * 
     */
    @JsonProperty("sbjcCode")
    public String getSbjcCode() {
        return sbjcCode;
    }

    /**
     * Subject
     * <p>
     * Lineage reference object : SORHSBJ_SBJC_CODE, Lookup lineage reference object : stvsbjc
     * 
     */
    @JsonProperty("sbjcCode")
    public void setSbjcCode(String sbjcCode) {
        this.sbjcCode = sbjcCode;
    }

    public AdmissionsDecisionHighSchoolReview100QapiPost withSbjcCode(String sbjcCode) {
        this.sbjcCode = sbjcCode;
        return this;
    }

    /**
     * Grade
     * <p>
     * Lineage reference object : SORHSBJ_GRADE
     * 
     */
    @JsonProperty("grade")
    public String getGrade() {
        return grade;
    }

    /**
     * Grade
     * <p>
     * Lineage reference object : SORHSBJ_GRADE
     * 
     */
    @JsonProperty("grade")
    public void setGrade(String grade) {
        this.grade = grade;
    }

    public AdmissionsDecisionHighSchoolReview100QapiPost withGrade(String grade) {
        this.grade = grade;
        return this;
    }

    /**
     * Years
     * <p>
     * Lineage reference object : SORHSBJ_SUBJ_YEARS
     * 
     */
    @JsonProperty("subjYears")
    public Double getSubjYears() {
        return subjYears;
    }

    /**
     * Years
     * <p>
     * Lineage reference object : SORHSBJ_SUBJ_YEARS
     * 
     */
    @JsonProperty("subjYears")
    public void setSubjYears(Double subjYears) {
        this.subjYears = subjYears;
    }

    public AdmissionsDecisionHighSchoolReview100QapiPost withSubjYears(Double subjYears) {
        this.subjYears = subjYears;
        return this;
    }

    /**
     * Subject GPA
     * <p>
     * Lineage reference object : SORHSBJ_SUBJ_GPA
     * 
     */
    @JsonProperty("subjGpa")
    public String getSubjGpa() {
        return subjGpa;
    }

    /**
     * Subject GPA
     * <p>
     * Lineage reference object : SORHSBJ_SUBJ_GPA
     * 
     */
    @JsonProperty("subjGpa")
    public void setSubjGpa(String subjGpa) {
        this.subjGpa = subjGpa;
    }

    public AdmissionsDecisionHighSchoolReview100QapiPost withSubjGpa(String subjGpa) {
        this.subjGpa = subjGpa;
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

    public AdmissionsDecisionHighSchoolReview100QapiPost withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(AdmissionsDecisionHighSchoolReview100QapiPost.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("keyblocTermCode");
        sb.append('=');
        sb.append(((this.keyblocTermCode == null)?"<null>":this.keyblocTermCode));
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
        sb.append("sbgiCode");
        sb.append('=');
        sb.append(((this.sbgiCode == null)?"<null>":this.sbgiCode));
        sb.append(',');
        sb.append("dplmCode");
        sb.append('=');
        sb.append(((this.dplmCode == null)?"<null>":this.dplmCode));
        sb.append(',');
        sb.append("graduationDate");
        sb.append('=');
        sb.append(((this.graduationDate == null)?"<null>":this.graduationDate));
        sb.append(',');
        sb.append("percentile");
        sb.append('=');
        sb.append(((this.percentile == null)?"<null>":this.percentile));
        sb.append(',');
        sb.append("collPrepInd");
        sb.append('=');
        sb.append(((this.collPrepInd == null)?"<null>":this.collPrepInd));
        sb.append(',');
        sb.append("gpa");
        sb.append('=');
        sb.append(((this.gpa == null)?"<null>":this.gpa));
        sb.append(',');
        sb.append("sbjcCode");
        sb.append('=');
        sb.append(((this.sbjcCode == null)?"<null>":this.sbjcCode));
        sb.append(',');
        sb.append("grade");
        sb.append('=');
        sb.append(((this.grade == null)?"<null>":this.grade));
        sb.append(',');
        sb.append("subjYears");
        sb.append('=');
        sb.append(((this.subjYears == null)?"<null>":this.subjYears));
        sb.append(',');
        sb.append("subjGpa");
        sb.append('=');
        sb.append(((this.subjGpa == null)?"<null>":this.subjGpa));
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
        result = ((result* 31)+((this.dplmCode == null)? 0 :this.dplmCode.hashCode()));
        result = ((result* 31)+((this.reqDocInd == null)? 0 :this.reqDocInd.hashCode()));
        result = ((result* 31)+((this.collPrepInd == null)? 0 :this.collPrepInd.hashCode()));
        result = ((result* 31)+((this.applDate == null)? 0 :this.applDate.hashCode()));
        result = ((result* 31)+((this.keyblocTermCode == null)? 0 :this.keyblocTermCode.hashCode()));
        result = ((result* 31)+((this.sbgiCode == null)? 0 :this.sbgiCode.hashCode()));
        result = ((result* 31)+((this.subjYears == null)? 0 :this.subjYears.hashCode()));
        result = ((result* 31)+((this.apstCode == null)? 0 :this.apstCode.hashCode()));
        result = ((result* 31)+((this.sessCode == null)? 0 :this.sessCode.hashCode()));
        result = ((result* 31)+((this.admtCode == null)? 0 :this.admtCode.hashCode()));
        result = ((result* 31)+((this.gpa == null)? 0 :this.gpa.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.termCodeEntry == null)? 0 :this.termCodeEntry.hashCode()));
        result = ((result* 31)+((this.fullPartInd == null)? 0 :this.fullPartInd.hashCode()));
        result = ((result* 31)+((this.subjGpa == null)? 0 :this.subjGpa.hashCode()));
        result = ((result* 31)+((this.applNo == null)? 0 :this.applNo.hashCode()));
        result = ((result* 31)+((this.resdCode == null)? 0 :this.resdCode.hashCode()));
        result = ((result* 31)+((this.sarappdApdcCode == null)? 0 :this.sarappdApdcCode.hashCode()));
        result = ((result* 31)+((this.sbjcCode == null)? 0 :this.sbjcCode.hashCode()));
        result = ((result* 31)+((this.percentile == null)? 0 :this.percentile.hashCode()));
        result = ((result* 31)+((this.graduationDate == null)? 0 :this.graduationDate.hashCode()));
        result = ((result* 31)+((this.grade == null)? 0 :this.grade.hashCode()));
        result = ((result* 31)+((this.applPreference == null)? 0 :this.applPreference.hashCode()));
        result = ((result* 31)+((this.stypCode == null)? 0 :this.stypCode.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof AdmissionsDecisionHighSchoolReview100QapiPost) == false) {
            return false;
        }
        AdmissionsDecisionHighSchoolReview100QapiPost rhs = ((AdmissionsDecisionHighSchoolReview100QapiPost) other);
        return ((((((((((((((((((((((((((this.dplmCode == rhs.dplmCode)||((this.dplmCode!= null)&&this.dplmCode.equals(rhs.dplmCode)))&&((this.reqDocInd == rhs.reqDocInd)||((this.reqDocInd!= null)&&this.reqDocInd.equals(rhs.reqDocInd))))&&((this.collPrepInd == rhs.collPrepInd)||((this.collPrepInd!= null)&&this.collPrepInd.equals(rhs.collPrepInd))))&&((this.applDate == rhs.applDate)||((this.applDate!= null)&&this.applDate.equals(rhs.applDate))))&&((this.keyblocTermCode == rhs.keyblocTermCode)||((this.keyblocTermCode!= null)&&this.keyblocTermCode.equals(rhs.keyblocTermCode))))&&((this.sbgiCode == rhs.sbgiCode)||((this.sbgiCode!= null)&&this.sbgiCode.equals(rhs.sbgiCode))))&&((this.subjYears == rhs.subjYears)||((this.subjYears!= null)&&this.subjYears.equals(rhs.subjYears))))&&((this.apstCode == rhs.apstCode)||((this.apstCode!= null)&&this.apstCode.equals(rhs.apstCode))))&&((this.sessCode == rhs.sessCode)||((this.sessCode!= null)&&this.sessCode.equals(rhs.sessCode))))&&((this.admtCode == rhs.admtCode)||((this.admtCode!= null)&&this.admtCode.equals(rhs.admtCode))))&&((this.gpa == rhs.gpa)||((this.gpa!= null)&&this.gpa.equals(rhs.gpa))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.termCodeEntry == rhs.termCodeEntry)||((this.termCodeEntry!= null)&&this.termCodeEntry.equals(rhs.termCodeEntry))))&&((this.fullPartInd == rhs.fullPartInd)||((this.fullPartInd!= null)&&this.fullPartInd.equals(rhs.fullPartInd))))&&((this.subjGpa == rhs.subjGpa)||((this.subjGpa!= null)&&this.subjGpa.equals(rhs.subjGpa))))&&((this.applNo == rhs.applNo)||((this.applNo!= null)&&this.applNo.equals(rhs.applNo))))&&((this.resdCode == rhs.resdCode)||((this.resdCode!= null)&&this.resdCode.equals(rhs.resdCode))))&&((this.sarappdApdcCode == rhs.sarappdApdcCode)||((this.sarappdApdcCode!= null)&&this.sarappdApdcCode.equals(rhs.sarappdApdcCode))))&&((this.sbjcCode == rhs.sbjcCode)||((this.sbjcCode!= null)&&this.sbjcCode.equals(rhs.sbjcCode))))&&((this.percentile == rhs.percentile)||((this.percentile!= null)&&this.percentile.equals(rhs.percentile))))&&((this.graduationDate == rhs.graduationDate)||((this.graduationDate!= null)&&this.graduationDate.equals(rhs.graduationDate))))&&((this.grade == rhs.grade)||((this.grade!= null)&&this.grade.equals(rhs.grade))))&&((this.applPreference == rhs.applPreference)||((this.applPreference!= null)&&this.applPreference.equals(rhs.applPreference))))&&((this.stypCode == rhs.stypCode)||((this.stypCode!= null)&&this.stypCode.equals(rhs.stypCode))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
    }

}
