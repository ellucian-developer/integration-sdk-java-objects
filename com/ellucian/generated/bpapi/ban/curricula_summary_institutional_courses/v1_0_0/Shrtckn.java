
package com.ellucian.generated.bpapi.ban.curricula_summary_institutional_courses.v1_0_0;

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
    "shrtckgGrdeCodeFinal",
    "crseTitle",
    "stspKeySequence",
    "shrtckgGmodCode",
    "subjCode",
    "shrtcklLevlCode",
    "shrtckdAppliedInd",
    "crseNumb",
    "shrtckgCreditHours",
    "ptrmCode",
    "campCode",
    "repeatCourseInd",
    "seqNumb",
    "crn",
    "termCode"
})
@Generated("jsonschema2pojo")
public class Shrtckn {

    /**
     * Grade
     * <p>
     * 
     * 
     */
    @JsonProperty("shrtckgGrdeCodeFinal")
    private String shrtckgGrdeCodeFinal;
    /**
     * Title
     * <p>
     * Lineage reference object : SHRTCKN_CRSE_TITLE
     * 
     */
    @JsonProperty("crseTitle")
    @JsonPropertyDescription("Lineage reference object : SHRTCKN_CRSE_TITLE")
    private String crseTitle;
    /**
     * Study Path
     * <p>
     * Lineage reference object : SHRTCKN_STSP_KEY_SEQUENCE
     * 
     */
    @JsonProperty("stspKeySequence")
    @JsonPropertyDescription("Lineage reference object : SHRTCKN_STSP_KEY_SEQUENCE")
    private Double stspKeySequence;
    /**
     * Grading Mode
     * <p>
     * Lookup lineage reference object : stvgmod
     * 
     */
    @JsonProperty("shrtckgGmodCode")
    @JsonPropertyDescription("Lookup lineage reference object : stvgmod")
    private String shrtckgGmodCode;
    /**
     * Subject
     * <p>
     * Lineage reference object : SHRTCKN_SUBJ_CODE, Lookup lineage reference object : stvsubj
     * 
     */
    @JsonProperty("subjCode")
    @JsonPropertyDescription("Lineage reference object : SHRTCKN_SUBJ_CODE, Lookup lineage reference object : stvsubj")
    private String subjCode;
    /**
     * Level
     * <p>
     * Lookup lineage reference object : stvlevl
     * 
     */
    @JsonProperty("shrtcklLevlCode")
    @JsonPropertyDescription("Lookup lineage reference object : stvlevl")
    private String shrtcklLevlCode;
    @JsonProperty("shrtckdAppliedInd")
    private String shrtckdAppliedInd;
    /**
     * Course
     * <p>
     * Lineage reference object : SHRTCKN_CRSE_NUMB
     * 
     */
    @JsonProperty("crseNumb")
    @JsonPropertyDescription("Lineage reference object : SHRTCKN_CRSE_NUMB")
    private String crseNumb;
    /**
     * Hours
     * <p>
     * 
     * 
     */
    @JsonProperty("shrtckgCreditHours")
    private Double shrtckgCreditHours;
    /**
     * Part of Term
     * <p>
     * Lineage reference object : SHRTCKN_PTRM_CODE, Lookup lineage reference object : stvptrm
     * 
     */
    @JsonProperty("ptrmCode")
    @JsonPropertyDescription("Lineage reference object : SHRTCKN_PTRM_CODE, Lookup lineage reference object : stvptrm")
    private String ptrmCode;
    /**
     * Campus
     * <p>
     * Lineage reference object : SHRTCKN_CAMP_CODE, Lookup lineage reference object : stvcamp
     * 
     */
    @JsonProperty("campCode")
    @JsonPropertyDescription("Lineage reference object : SHRTCKN_CAMP_CODE, Lookup lineage reference object : stvcamp")
    private String campCode;
    /**
     * Repeat
     * <p>
     * Lineage reference object : SHRTCKN_REPEAT_COURSE_IND
     * 
     */
    @JsonProperty("repeatCourseInd")
    @JsonPropertyDescription("Lineage reference object : SHRTCKN_REPEAT_COURSE_IND")
    private String repeatCourseInd;
    /**
     * Section
     * <p>
     * Lineage reference object : SHRTCKN_SEQ_NUMB
     * 
     */
    @JsonProperty("seqNumb")
    @JsonPropertyDescription("Lineage reference object : SHRTCKN_SEQ_NUMB")
    private String seqNumb;
    /**
     * CRN
     * <p>
     * Lineage reference object : SHRTCKN_CRN
     * 
     */
    @JsonProperty("crn")
    @JsonPropertyDescription("Lineage reference object : SHRTCKN_CRN")
    private String crn;
    /**
     * Term
     * <p>
     * Lineage reference object : SHRTCKN_TERM_CODE, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("termCode")
    @JsonPropertyDescription("Lineage reference object : SHRTCKN_TERM_CODE, Lookup lineage reference object : stvterm")
    private String termCode;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Grade
     * <p>
     * 
     * 
     */
    @JsonProperty("shrtckgGrdeCodeFinal")
    public String getShrtckgGrdeCodeFinal() {
        return shrtckgGrdeCodeFinal;
    }

    /**
     * Grade
     * <p>
     * 
     * 
     */
    @JsonProperty("shrtckgGrdeCodeFinal")
    public void setShrtckgGrdeCodeFinal(String shrtckgGrdeCodeFinal) {
        this.shrtckgGrdeCodeFinal = shrtckgGrdeCodeFinal;
    }

    public Shrtckn withShrtckgGrdeCodeFinal(String shrtckgGrdeCodeFinal) {
        this.shrtckgGrdeCodeFinal = shrtckgGrdeCodeFinal;
        return this;
    }

    /**
     * Title
     * <p>
     * Lineage reference object : SHRTCKN_CRSE_TITLE
     * 
     */
    @JsonProperty("crseTitle")
    public String getCrseTitle() {
        return crseTitle;
    }

    /**
     * Title
     * <p>
     * Lineage reference object : SHRTCKN_CRSE_TITLE
     * 
     */
    @JsonProperty("crseTitle")
    public void setCrseTitle(String crseTitle) {
        this.crseTitle = crseTitle;
    }

    public Shrtckn withCrseTitle(String crseTitle) {
        this.crseTitle = crseTitle;
        return this;
    }

    /**
     * Study Path
     * <p>
     * Lineage reference object : SHRTCKN_STSP_KEY_SEQUENCE
     * 
     */
    @JsonProperty("stspKeySequence")
    public Double getStspKeySequence() {
        return stspKeySequence;
    }

    /**
     * Study Path
     * <p>
     * Lineage reference object : SHRTCKN_STSP_KEY_SEQUENCE
     * 
     */
    @JsonProperty("stspKeySequence")
    public void setStspKeySequence(Double stspKeySequence) {
        this.stspKeySequence = stspKeySequence;
    }

    public Shrtckn withStspKeySequence(Double stspKeySequence) {
        this.stspKeySequence = stspKeySequence;
        return this;
    }

    /**
     * Grading Mode
     * <p>
     * Lookup lineage reference object : stvgmod
     * 
     */
    @JsonProperty("shrtckgGmodCode")
    public String getShrtckgGmodCode() {
        return shrtckgGmodCode;
    }

    /**
     * Grading Mode
     * <p>
     * Lookup lineage reference object : stvgmod
     * 
     */
    @JsonProperty("shrtckgGmodCode")
    public void setShrtckgGmodCode(String shrtckgGmodCode) {
        this.shrtckgGmodCode = shrtckgGmodCode;
    }

    public Shrtckn withShrtckgGmodCode(String shrtckgGmodCode) {
        this.shrtckgGmodCode = shrtckgGmodCode;
        return this;
    }

    /**
     * Subject
     * <p>
     * Lineage reference object : SHRTCKN_SUBJ_CODE, Lookup lineage reference object : stvsubj
     * 
     */
    @JsonProperty("subjCode")
    public String getSubjCode() {
        return subjCode;
    }

    /**
     * Subject
     * <p>
     * Lineage reference object : SHRTCKN_SUBJ_CODE, Lookup lineage reference object : stvsubj
     * 
     */
    @JsonProperty("subjCode")
    public void setSubjCode(String subjCode) {
        this.subjCode = subjCode;
    }

    public Shrtckn withSubjCode(String subjCode) {
        this.subjCode = subjCode;
        return this;
    }

    /**
     * Level
     * <p>
     * Lookup lineage reference object : stvlevl
     * 
     */
    @JsonProperty("shrtcklLevlCode")
    public String getShrtcklLevlCode() {
        return shrtcklLevlCode;
    }

    /**
     * Level
     * <p>
     * Lookup lineage reference object : stvlevl
     * 
     */
    @JsonProperty("shrtcklLevlCode")
    public void setShrtcklLevlCode(String shrtcklLevlCode) {
        this.shrtcklLevlCode = shrtcklLevlCode;
    }

    public Shrtckn withShrtcklLevlCode(String shrtcklLevlCode) {
        this.shrtcklLevlCode = shrtcklLevlCode;
        return this;
    }

    @JsonProperty("shrtckdAppliedInd")
    public String getShrtckdAppliedInd() {
        return shrtckdAppliedInd;
    }

    @JsonProperty("shrtckdAppliedInd")
    public void setShrtckdAppliedInd(String shrtckdAppliedInd) {
        this.shrtckdAppliedInd = shrtckdAppliedInd;
    }

    public Shrtckn withShrtckdAppliedInd(String shrtckdAppliedInd) {
        this.shrtckdAppliedInd = shrtckdAppliedInd;
        return this;
    }

    /**
     * Course
     * <p>
     * Lineage reference object : SHRTCKN_CRSE_NUMB
     * 
     */
    @JsonProperty("crseNumb")
    public String getCrseNumb() {
        return crseNumb;
    }

    /**
     * Course
     * <p>
     * Lineage reference object : SHRTCKN_CRSE_NUMB
     * 
     */
    @JsonProperty("crseNumb")
    public void setCrseNumb(String crseNumb) {
        this.crseNumb = crseNumb;
    }

    public Shrtckn withCrseNumb(String crseNumb) {
        this.crseNumb = crseNumb;
        return this;
    }

    /**
     * Hours
     * <p>
     * 
     * 
     */
    @JsonProperty("shrtckgCreditHours")
    public Double getShrtckgCreditHours() {
        return shrtckgCreditHours;
    }

    /**
     * Hours
     * <p>
     * 
     * 
     */
    @JsonProperty("shrtckgCreditHours")
    public void setShrtckgCreditHours(Double shrtckgCreditHours) {
        this.shrtckgCreditHours = shrtckgCreditHours;
    }

    public Shrtckn withShrtckgCreditHours(Double shrtckgCreditHours) {
        this.shrtckgCreditHours = shrtckgCreditHours;
        return this;
    }

    /**
     * Part of Term
     * <p>
     * Lineage reference object : SHRTCKN_PTRM_CODE, Lookup lineage reference object : stvptrm
     * 
     */
    @JsonProperty("ptrmCode")
    public String getPtrmCode() {
        return ptrmCode;
    }

    /**
     * Part of Term
     * <p>
     * Lineage reference object : SHRTCKN_PTRM_CODE, Lookup lineage reference object : stvptrm
     * 
     */
    @JsonProperty("ptrmCode")
    public void setPtrmCode(String ptrmCode) {
        this.ptrmCode = ptrmCode;
    }

    public Shrtckn withPtrmCode(String ptrmCode) {
        this.ptrmCode = ptrmCode;
        return this;
    }

    /**
     * Campus
     * <p>
     * Lineage reference object : SHRTCKN_CAMP_CODE, Lookup lineage reference object : stvcamp
     * 
     */
    @JsonProperty("campCode")
    public String getCampCode() {
        return campCode;
    }

    /**
     * Campus
     * <p>
     * Lineage reference object : SHRTCKN_CAMP_CODE, Lookup lineage reference object : stvcamp
     * 
     */
    @JsonProperty("campCode")
    public void setCampCode(String campCode) {
        this.campCode = campCode;
    }

    public Shrtckn withCampCode(String campCode) {
        this.campCode = campCode;
        return this;
    }

    /**
     * Repeat
     * <p>
     * Lineage reference object : SHRTCKN_REPEAT_COURSE_IND
     * 
     */
    @JsonProperty("repeatCourseInd")
    public String getRepeatCourseInd() {
        return repeatCourseInd;
    }

    /**
     * Repeat
     * <p>
     * Lineage reference object : SHRTCKN_REPEAT_COURSE_IND
     * 
     */
    @JsonProperty("repeatCourseInd")
    public void setRepeatCourseInd(String repeatCourseInd) {
        this.repeatCourseInd = repeatCourseInd;
    }

    public Shrtckn withRepeatCourseInd(String repeatCourseInd) {
        this.repeatCourseInd = repeatCourseInd;
        return this;
    }

    /**
     * Section
     * <p>
     * Lineage reference object : SHRTCKN_SEQ_NUMB
     * 
     */
    @JsonProperty("seqNumb")
    public String getSeqNumb() {
        return seqNumb;
    }

    /**
     * Section
     * <p>
     * Lineage reference object : SHRTCKN_SEQ_NUMB
     * 
     */
    @JsonProperty("seqNumb")
    public void setSeqNumb(String seqNumb) {
        this.seqNumb = seqNumb;
    }

    public Shrtckn withSeqNumb(String seqNumb) {
        this.seqNumb = seqNumb;
        return this;
    }

    /**
     * CRN
     * <p>
     * Lineage reference object : SHRTCKN_CRN
     * 
     */
    @JsonProperty("crn")
    public String getCrn() {
        return crn;
    }

    /**
     * CRN
     * <p>
     * Lineage reference object : SHRTCKN_CRN
     * 
     */
    @JsonProperty("crn")
    public void setCrn(String crn) {
        this.crn = crn;
    }

    public Shrtckn withCrn(String crn) {
        this.crn = crn;
        return this;
    }

    /**
     * Term
     * <p>
     * Lineage reference object : SHRTCKN_TERM_CODE, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("termCode")
    public String getTermCode() {
        return termCode;
    }

    /**
     * Term
     * <p>
     * Lineage reference object : SHRTCKN_TERM_CODE, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("termCode")
    public void setTermCode(String termCode) {
        this.termCode = termCode;
    }

    public Shrtckn withTermCode(String termCode) {
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

    public Shrtckn withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Shrtckn.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("shrtckgGrdeCodeFinal");
        sb.append('=');
        sb.append(((this.shrtckgGrdeCodeFinal == null)?"<null>":this.shrtckgGrdeCodeFinal));
        sb.append(',');
        sb.append("crseTitle");
        sb.append('=');
        sb.append(((this.crseTitle == null)?"<null>":this.crseTitle));
        sb.append(',');
        sb.append("stspKeySequence");
        sb.append('=');
        sb.append(((this.stspKeySequence == null)?"<null>":this.stspKeySequence));
        sb.append(',');
        sb.append("shrtckgGmodCode");
        sb.append('=');
        sb.append(((this.shrtckgGmodCode == null)?"<null>":this.shrtckgGmodCode));
        sb.append(',');
        sb.append("subjCode");
        sb.append('=');
        sb.append(((this.subjCode == null)?"<null>":this.subjCode));
        sb.append(',');
        sb.append("shrtcklLevlCode");
        sb.append('=');
        sb.append(((this.shrtcklLevlCode == null)?"<null>":this.shrtcklLevlCode));
        sb.append(',');
        sb.append("shrtckdAppliedInd");
        sb.append('=');
        sb.append(((this.shrtckdAppliedInd == null)?"<null>":this.shrtckdAppliedInd));
        sb.append(',');
        sb.append("crseNumb");
        sb.append('=');
        sb.append(((this.crseNumb == null)?"<null>":this.crseNumb));
        sb.append(',');
        sb.append("shrtckgCreditHours");
        sb.append('=');
        sb.append(((this.shrtckgCreditHours == null)?"<null>":this.shrtckgCreditHours));
        sb.append(',');
        sb.append("ptrmCode");
        sb.append('=');
        sb.append(((this.ptrmCode == null)?"<null>":this.ptrmCode));
        sb.append(',');
        sb.append("campCode");
        sb.append('=');
        sb.append(((this.campCode == null)?"<null>":this.campCode));
        sb.append(',');
        sb.append("repeatCourseInd");
        sb.append('=');
        sb.append(((this.repeatCourseInd == null)?"<null>":this.repeatCourseInd));
        sb.append(',');
        sb.append("seqNumb");
        sb.append('=');
        sb.append(((this.seqNumb == null)?"<null>":this.seqNumb));
        sb.append(',');
        sb.append("crn");
        sb.append('=');
        sb.append(((this.crn == null)?"<null>":this.crn));
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
        result = ((result* 31)+((this.shrtckgGrdeCodeFinal == null)? 0 :this.shrtckgGrdeCodeFinal.hashCode()));
        result = ((result* 31)+((this.crseTitle == null)? 0 :this.crseTitle.hashCode()));
        result = ((result* 31)+((this.stspKeySequence == null)? 0 :this.stspKeySequence.hashCode()));
        result = ((result* 31)+((this.shrtckgGmodCode == null)? 0 :this.shrtckgGmodCode.hashCode()));
        result = ((result* 31)+((this.subjCode == null)? 0 :this.subjCode.hashCode()));
        result = ((result* 31)+((this.shrtcklLevlCode == null)? 0 :this.shrtcklLevlCode.hashCode()));
        result = ((result* 31)+((this.shrtckdAppliedInd == null)? 0 :this.shrtckdAppliedInd.hashCode()));
        result = ((result* 31)+((this.crseNumb == null)? 0 :this.crseNumb.hashCode()));
        result = ((result* 31)+((this.shrtckgCreditHours == null)? 0 :this.shrtckgCreditHours.hashCode()));
        result = ((result* 31)+((this.ptrmCode == null)? 0 :this.ptrmCode.hashCode()));
        result = ((result* 31)+((this.campCode == null)? 0 :this.campCode.hashCode()));
        result = ((result* 31)+((this.repeatCourseInd == null)? 0 :this.repeatCourseInd.hashCode()));
        result = ((result* 31)+((this.seqNumb == null)? 0 :this.seqNumb.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.crn == null)? 0 :this.crn.hashCode()));
        result = ((result* 31)+((this.termCode == null)? 0 :this.termCode.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Shrtckn) == false) {
            return false;
        }
        Shrtckn rhs = ((Shrtckn) other);
        return (((((((((((((((((this.shrtckgGrdeCodeFinal == rhs.shrtckgGrdeCodeFinal)||((this.shrtckgGrdeCodeFinal!= null)&&this.shrtckgGrdeCodeFinal.equals(rhs.shrtckgGrdeCodeFinal)))&&((this.crseTitle == rhs.crseTitle)||((this.crseTitle!= null)&&this.crseTitle.equals(rhs.crseTitle))))&&((this.stspKeySequence == rhs.stspKeySequence)||((this.stspKeySequence!= null)&&this.stspKeySequence.equals(rhs.stspKeySequence))))&&((this.shrtckgGmodCode == rhs.shrtckgGmodCode)||((this.shrtckgGmodCode!= null)&&this.shrtckgGmodCode.equals(rhs.shrtckgGmodCode))))&&((this.subjCode == rhs.subjCode)||((this.subjCode!= null)&&this.subjCode.equals(rhs.subjCode))))&&((this.shrtcklLevlCode == rhs.shrtcklLevlCode)||((this.shrtcklLevlCode!= null)&&this.shrtcklLevlCode.equals(rhs.shrtcklLevlCode))))&&((this.shrtckdAppliedInd == rhs.shrtckdAppliedInd)||((this.shrtckdAppliedInd!= null)&&this.shrtckdAppliedInd.equals(rhs.shrtckdAppliedInd))))&&((this.crseNumb == rhs.crseNumb)||((this.crseNumb!= null)&&this.crseNumb.equals(rhs.crseNumb))))&&((this.shrtckgCreditHours == rhs.shrtckgCreditHours)||((this.shrtckgCreditHours!= null)&&this.shrtckgCreditHours.equals(rhs.shrtckgCreditHours))))&&((this.ptrmCode == rhs.ptrmCode)||((this.ptrmCode!= null)&&this.ptrmCode.equals(rhs.ptrmCode))))&&((this.campCode == rhs.campCode)||((this.campCode!= null)&&this.campCode.equals(rhs.campCode))))&&((this.repeatCourseInd == rhs.repeatCourseInd)||((this.repeatCourseInd!= null)&&this.repeatCourseInd.equals(rhs.repeatCourseInd))))&&((this.seqNumb == rhs.seqNumb)||((this.seqNumb!= null)&&this.seqNumb.equals(rhs.seqNumb))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.crn == rhs.crn)||((this.crn!= null)&&this.crn.equals(rhs.crn))))&&((this.termCode == rhs.termCode)||((this.termCode!= null)&&this.termCode.equals(rhs.termCode))));
    }

}
