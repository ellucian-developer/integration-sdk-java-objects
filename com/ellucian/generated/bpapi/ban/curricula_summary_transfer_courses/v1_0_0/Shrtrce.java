
package com.ellucian.generated.bpapi.ban.curricula_summary_transfer_courses.v1_0_0;

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
    "repeatSys",
    "crseTitle",
    "gmodCode",
    "stspKeySequence",
    "termCodeEff",
    "subjCode",
    "applNo",
    "grdeCode",
    "countInGpaInd",
    "creditHours",
    "tramSeqNo",
    "crseNumb",
    "shrtrcdAppliedInd",
    "repeatCourse",
    "levlCode",
    "tritSeqNo"
})
@Generated("jsonschema2pojo")
public class Shrtrce {

    /**
     * Repeat System
     * <p>
     * Lineage reference object : SHRTRCE_REPEAT_SYS
     * 
     */
    @JsonProperty("repeatSys")
    @JsonPropertyDescription("Lineage reference object : SHRTRCE_REPEAT_SYS")
    private String repeatSys;
    /**
     * Title
     * <p>
     * Lineage reference object : SHRTRCE_CRSE_TITLE
     * 
     */
    @JsonProperty("crseTitle")
    @JsonPropertyDescription("Lineage reference object : SHRTRCE_CRSE_TITLE")
    private String crseTitle;
    /**
     * Grading Mode
     * <p>
     * Lineage reference object : SHRTRCE_GMOD_CODE, Lookup lineage reference object : stvgmod
     * 
     */
    @JsonProperty("gmodCode")
    @JsonPropertyDescription("Lineage reference object : SHRTRCE_GMOD_CODE, Lookup lineage reference object : stvgmod")
    private String gmodCode;
    /**
     * Study Path
     * <p>
     * Lineage reference object : SHRTRCE_STSP_KEY_SEQUENCE
     * 
     */
    @JsonProperty("stspKeySequence")
    @JsonPropertyDescription("Lineage reference object : SHRTRCE_STSP_KEY_SEQUENCE")
    private Double stspKeySequence;
    /**
     * Term
     * <p>
     * Lineage reference object : SHRTRCE_TERM_CODE_EFF, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("termCodeEff")
    @JsonPropertyDescription("Lineage reference object : SHRTRCE_TERM_CODE_EFF, Lookup lineage reference object : stvterm")
    private String termCodeEff;
    /**
     * Subject
     * <p>
     * Lineage reference object : SHRTRCE_SUBJ_CODE, Lookup lineage reference object : stvsubj
     * 
     */
    @JsonProperty("subjCode")
    @JsonPropertyDescription("Lineage reference object : SHRTRCE_SUBJ_CODE, Lookup lineage reference object : stvsubj")
    private String subjCode;
    /**
     * Application Number
     * <p>
     * Lineage reference object : SHRTRCE_APPL_NO
     * 
     */
    @JsonProperty("applNo")
    @JsonPropertyDescription("Lineage reference object : SHRTRCE_APPL_NO")
    private Double applNo;
    /**
     * Grade
     * <p>
     * Lineage reference object : SHRTRCE_GRDE_CODE
     * 
     */
    @JsonProperty("grdeCode")
    @JsonPropertyDescription("Lineage reference object : SHRTRCE_GRDE_CODE")
    private String grdeCode;
    /**
     * Lineage reference object : SHRTRCE_COUNT_IN_GPA_IND
     * 
     */
    @JsonProperty("countInGpaInd")
    @JsonPropertyDescription("Lineage reference object : SHRTRCE_COUNT_IN_GPA_IND")
    private String countInGpaInd;
    /**
     * Hours
     * <p>
     * Lineage reference object : SHRTRCE_CREDIT_HOURS
     * 
     */
    @JsonProperty("creditHours")
    @JsonPropertyDescription("Lineage reference object : SHRTRCE_CREDIT_HOURS")
    private Double creditHours;
    /**
     * Attendance Period
     * <p>
     * Lineage reference object : SHRTRCE_TRAM_SEQ_NO
     * 
     */
    @JsonProperty("tramSeqNo")
    @JsonPropertyDescription("Lineage reference object : SHRTRCE_TRAM_SEQ_NO")
    private Double tramSeqNo;
    /**
     * Course
     * <p>
     * Lineage reference object : SHRTRCE_CRSE_NUMB
     * 
     */
    @JsonProperty("crseNumb")
    @JsonPropertyDescription("Lineage reference object : SHRTRCE_CRSE_NUMB")
    private String crseNumb;
    @JsonProperty("shrtrcdAppliedInd")
    private String shrtrcdAppliedInd;
    /**
     * Repeat
     * <p>
     * Lineage reference object : SHRTRCE_REPEAT_COURSE
     * 
     */
    @JsonProperty("repeatCourse")
    @JsonPropertyDescription("Lineage reference object : SHRTRCE_REPEAT_COURSE")
    private String repeatCourse;
    /**
     * Level
     * <p>
     * Lineage reference object : SHRTRCE_LEVL_CODE, Lookup lineage reference object : stvlevl
     * 
     */
    @JsonProperty("levlCode")
    @JsonPropertyDescription("Lineage reference object : SHRTRCE_LEVL_CODE, Lookup lineage reference object : stvlevl")
    private String levlCode;
    /**
     * Institution
     * <p>
     * Lineage reference object : SHRTRCE_TRIT_SEQ_NO
     * 
     */
    @JsonProperty("tritSeqNo")
    @JsonPropertyDescription("Lineage reference object : SHRTRCE_TRIT_SEQ_NO")
    private Double tritSeqNo;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Repeat System
     * <p>
     * Lineage reference object : SHRTRCE_REPEAT_SYS
     * 
     */
    @JsonProperty("repeatSys")
    public String getRepeatSys() {
        return repeatSys;
    }

    /**
     * Repeat System
     * <p>
     * Lineage reference object : SHRTRCE_REPEAT_SYS
     * 
     */
    @JsonProperty("repeatSys")
    public void setRepeatSys(String repeatSys) {
        this.repeatSys = repeatSys;
    }

    public Shrtrce withRepeatSys(String repeatSys) {
        this.repeatSys = repeatSys;
        return this;
    }

    /**
     * Title
     * <p>
     * Lineage reference object : SHRTRCE_CRSE_TITLE
     * 
     */
    @JsonProperty("crseTitle")
    public String getCrseTitle() {
        return crseTitle;
    }

    /**
     * Title
     * <p>
     * Lineage reference object : SHRTRCE_CRSE_TITLE
     * 
     */
    @JsonProperty("crseTitle")
    public void setCrseTitle(String crseTitle) {
        this.crseTitle = crseTitle;
    }

    public Shrtrce withCrseTitle(String crseTitle) {
        this.crseTitle = crseTitle;
        return this;
    }

    /**
     * Grading Mode
     * <p>
     * Lineage reference object : SHRTRCE_GMOD_CODE, Lookup lineage reference object : stvgmod
     * 
     */
    @JsonProperty("gmodCode")
    public String getGmodCode() {
        return gmodCode;
    }

    /**
     * Grading Mode
     * <p>
     * Lineage reference object : SHRTRCE_GMOD_CODE, Lookup lineage reference object : stvgmod
     * 
     */
    @JsonProperty("gmodCode")
    public void setGmodCode(String gmodCode) {
        this.gmodCode = gmodCode;
    }

    public Shrtrce withGmodCode(String gmodCode) {
        this.gmodCode = gmodCode;
        return this;
    }

    /**
     * Study Path
     * <p>
     * Lineage reference object : SHRTRCE_STSP_KEY_SEQUENCE
     * 
     */
    @JsonProperty("stspKeySequence")
    public Double getStspKeySequence() {
        return stspKeySequence;
    }

    /**
     * Study Path
     * <p>
     * Lineage reference object : SHRTRCE_STSP_KEY_SEQUENCE
     * 
     */
    @JsonProperty("stspKeySequence")
    public void setStspKeySequence(Double stspKeySequence) {
        this.stspKeySequence = stspKeySequence;
    }

    public Shrtrce withStspKeySequence(Double stspKeySequence) {
        this.stspKeySequence = stspKeySequence;
        return this;
    }

    /**
     * Term
     * <p>
     * Lineage reference object : SHRTRCE_TERM_CODE_EFF, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("termCodeEff")
    public String getTermCodeEff() {
        return termCodeEff;
    }

    /**
     * Term
     * <p>
     * Lineage reference object : SHRTRCE_TERM_CODE_EFF, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("termCodeEff")
    public void setTermCodeEff(String termCodeEff) {
        this.termCodeEff = termCodeEff;
    }

    public Shrtrce withTermCodeEff(String termCodeEff) {
        this.termCodeEff = termCodeEff;
        return this;
    }

    /**
     * Subject
     * <p>
     * Lineage reference object : SHRTRCE_SUBJ_CODE, Lookup lineage reference object : stvsubj
     * 
     */
    @JsonProperty("subjCode")
    public String getSubjCode() {
        return subjCode;
    }

    /**
     * Subject
     * <p>
     * Lineage reference object : SHRTRCE_SUBJ_CODE, Lookup lineage reference object : stvsubj
     * 
     */
    @JsonProperty("subjCode")
    public void setSubjCode(String subjCode) {
        this.subjCode = subjCode;
    }

    public Shrtrce withSubjCode(String subjCode) {
        this.subjCode = subjCode;
        return this;
    }

    /**
     * Application Number
     * <p>
     * Lineage reference object : SHRTRCE_APPL_NO
     * 
     */
    @JsonProperty("applNo")
    public Double getApplNo() {
        return applNo;
    }

    /**
     * Application Number
     * <p>
     * Lineage reference object : SHRTRCE_APPL_NO
     * 
     */
    @JsonProperty("applNo")
    public void setApplNo(Double applNo) {
        this.applNo = applNo;
    }

    public Shrtrce withApplNo(Double applNo) {
        this.applNo = applNo;
        return this;
    }

    /**
     * Grade
     * <p>
     * Lineage reference object : SHRTRCE_GRDE_CODE
     * 
     */
    @JsonProperty("grdeCode")
    public String getGrdeCode() {
        return grdeCode;
    }

    /**
     * Grade
     * <p>
     * Lineage reference object : SHRTRCE_GRDE_CODE
     * 
     */
    @JsonProperty("grdeCode")
    public void setGrdeCode(String grdeCode) {
        this.grdeCode = grdeCode;
    }

    public Shrtrce withGrdeCode(String grdeCode) {
        this.grdeCode = grdeCode;
        return this;
    }

    /**
     * Lineage reference object : SHRTRCE_COUNT_IN_GPA_IND
     * 
     */
    @JsonProperty("countInGpaInd")
    public String getCountInGpaInd() {
        return countInGpaInd;
    }

    /**
     * Lineage reference object : SHRTRCE_COUNT_IN_GPA_IND
     * 
     */
    @JsonProperty("countInGpaInd")
    public void setCountInGpaInd(String countInGpaInd) {
        this.countInGpaInd = countInGpaInd;
    }

    public Shrtrce withCountInGpaInd(String countInGpaInd) {
        this.countInGpaInd = countInGpaInd;
        return this;
    }

    /**
     * Hours
     * <p>
     * Lineage reference object : SHRTRCE_CREDIT_HOURS
     * 
     */
    @JsonProperty("creditHours")
    public Double getCreditHours() {
        return creditHours;
    }

    /**
     * Hours
     * <p>
     * Lineage reference object : SHRTRCE_CREDIT_HOURS
     * 
     */
    @JsonProperty("creditHours")
    public void setCreditHours(Double creditHours) {
        this.creditHours = creditHours;
    }

    public Shrtrce withCreditHours(Double creditHours) {
        this.creditHours = creditHours;
        return this;
    }

    /**
     * Attendance Period
     * <p>
     * Lineage reference object : SHRTRCE_TRAM_SEQ_NO
     * 
     */
    @JsonProperty("tramSeqNo")
    public Double getTramSeqNo() {
        return tramSeqNo;
    }

    /**
     * Attendance Period
     * <p>
     * Lineage reference object : SHRTRCE_TRAM_SEQ_NO
     * 
     */
    @JsonProperty("tramSeqNo")
    public void setTramSeqNo(Double tramSeqNo) {
        this.tramSeqNo = tramSeqNo;
    }

    public Shrtrce withTramSeqNo(Double tramSeqNo) {
        this.tramSeqNo = tramSeqNo;
        return this;
    }

    /**
     * Course
     * <p>
     * Lineage reference object : SHRTRCE_CRSE_NUMB
     * 
     */
    @JsonProperty("crseNumb")
    public String getCrseNumb() {
        return crseNumb;
    }

    /**
     * Course
     * <p>
     * Lineage reference object : SHRTRCE_CRSE_NUMB
     * 
     */
    @JsonProperty("crseNumb")
    public void setCrseNumb(String crseNumb) {
        this.crseNumb = crseNumb;
    }

    public Shrtrce withCrseNumb(String crseNumb) {
        this.crseNumb = crseNumb;
        return this;
    }

    @JsonProperty("shrtrcdAppliedInd")
    public String getShrtrcdAppliedInd() {
        return shrtrcdAppliedInd;
    }

    @JsonProperty("shrtrcdAppliedInd")
    public void setShrtrcdAppliedInd(String shrtrcdAppliedInd) {
        this.shrtrcdAppliedInd = shrtrcdAppliedInd;
    }

    public Shrtrce withShrtrcdAppliedInd(String shrtrcdAppliedInd) {
        this.shrtrcdAppliedInd = shrtrcdAppliedInd;
        return this;
    }

    /**
     * Repeat
     * <p>
     * Lineage reference object : SHRTRCE_REPEAT_COURSE
     * 
     */
    @JsonProperty("repeatCourse")
    public String getRepeatCourse() {
        return repeatCourse;
    }

    /**
     * Repeat
     * <p>
     * Lineage reference object : SHRTRCE_REPEAT_COURSE
     * 
     */
    @JsonProperty("repeatCourse")
    public void setRepeatCourse(String repeatCourse) {
        this.repeatCourse = repeatCourse;
    }

    public Shrtrce withRepeatCourse(String repeatCourse) {
        this.repeatCourse = repeatCourse;
        return this;
    }

    /**
     * Level
     * <p>
     * Lineage reference object : SHRTRCE_LEVL_CODE, Lookup lineage reference object : stvlevl
     * 
     */
    @JsonProperty("levlCode")
    public String getLevlCode() {
        return levlCode;
    }

    /**
     * Level
     * <p>
     * Lineage reference object : SHRTRCE_LEVL_CODE, Lookup lineage reference object : stvlevl
     * 
     */
    @JsonProperty("levlCode")
    public void setLevlCode(String levlCode) {
        this.levlCode = levlCode;
    }

    public Shrtrce withLevlCode(String levlCode) {
        this.levlCode = levlCode;
        return this;
    }

    /**
     * Institution
     * <p>
     * Lineage reference object : SHRTRCE_TRIT_SEQ_NO
     * 
     */
    @JsonProperty("tritSeqNo")
    public Double getTritSeqNo() {
        return tritSeqNo;
    }

    /**
     * Institution
     * <p>
     * Lineage reference object : SHRTRCE_TRIT_SEQ_NO
     * 
     */
    @JsonProperty("tritSeqNo")
    public void setTritSeqNo(Double tritSeqNo) {
        this.tritSeqNo = tritSeqNo;
    }

    public Shrtrce withTritSeqNo(Double tritSeqNo) {
        this.tritSeqNo = tritSeqNo;
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

    public Shrtrce withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Shrtrce.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("repeatSys");
        sb.append('=');
        sb.append(((this.repeatSys == null)?"<null>":this.repeatSys));
        sb.append(',');
        sb.append("crseTitle");
        sb.append('=');
        sb.append(((this.crseTitle == null)?"<null>":this.crseTitle));
        sb.append(',');
        sb.append("gmodCode");
        sb.append('=');
        sb.append(((this.gmodCode == null)?"<null>":this.gmodCode));
        sb.append(',');
        sb.append("stspKeySequence");
        sb.append('=');
        sb.append(((this.stspKeySequence == null)?"<null>":this.stspKeySequence));
        sb.append(',');
        sb.append("termCodeEff");
        sb.append('=');
        sb.append(((this.termCodeEff == null)?"<null>":this.termCodeEff));
        sb.append(',');
        sb.append("subjCode");
        sb.append('=');
        sb.append(((this.subjCode == null)?"<null>":this.subjCode));
        sb.append(',');
        sb.append("applNo");
        sb.append('=');
        sb.append(((this.applNo == null)?"<null>":this.applNo));
        sb.append(',');
        sb.append("grdeCode");
        sb.append('=');
        sb.append(((this.grdeCode == null)?"<null>":this.grdeCode));
        sb.append(',');
        sb.append("countInGpaInd");
        sb.append('=');
        sb.append(((this.countInGpaInd == null)?"<null>":this.countInGpaInd));
        sb.append(',');
        sb.append("creditHours");
        sb.append('=');
        sb.append(((this.creditHours == null)?"<null>":this.creditHours));
        sb.append(',');
        sb.append("tramSeqNo");
        sb.append('=');
        sb.append(((this.tramSeqNo == null)?"<null>":this.tramSeqNo));
        sb.append(',');
        sb.append("crseNumb");
        sb.append('=');
        sb.append(((this.crseNumb == null)?"<null>":this.crseNumb));
        sb.append(',');
        sb.append("shrtrcdAppliedInd");
        sb.append('=');
        sb.append(((this.shrtrcdAppliedInd == null)?"<null>":this.shrtrcdAppliedInd));
        sb.append(',');
        sb.append("repeatCourse");
        sb.append('=');
        sb.append(((this.repeatCourse == null)?"<null>":this.repeatCourse));
        sb.append(',');
        sb.append("levlCode");
        sb.append('=');
        sb.append(((this.levlCode == null)?"<null>":this.levlCode));
        sb.append(',');
        sb.append("tritSeqNo");
        sb.append('=');
        sb.append(((this.tritSeqNo == null)?"<null>":this.tritSeqNo));
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
        result = ((result* 31)+((this.repeatSys == null)? 0 :this.repeatSys.hashCode()));
        result = ((result* 31)+((this.crseTitle == null)? 0 :this.crseTitle.hashCode()));
        result = ((result* 31)+((this.gmodCode == null)? 0 :this.gmodCode.hashCode()));
        result = ((result* 31)+((this.stspKeySequence == null)? 0 :this.stspKeySequence.hashCode()));
        result = ((result* 31)+((this.termCodeEff == null)? 0 :this.termCodeEff.hashCode()));
        result = ((result* 31)+((this.subjCode == null)? 0 :this.subjCode.hashCode()));
        result = ((result* 31)+((this.applNo == null)? 0 :this.applNo.hashCode()));
        result = ((result* 31)+((this.grdeCode == null)? 0 :this.grdeCode.hashCode()));
        result = ((result* 31)+((this.countInGpaInd == null)? 0 :this.countInGpaInd.hashCode()));
        result = ((result* 31)+((this.creditHours == null)? 0 :this.creditHours.hashCode()));
        result = ((result* 31)+((this.tramSeqNo == null)? 0 :this.tramSeqNo.hashCode()));
        result = ((result* 31)+((this.crseNumb == null)? 0 :this.crseNumb.hashCode()));
        result = ((result* 31)+((this.shrtrcdAppliedInd == null)? 0 :this.shrtrcdAppliedInd.hashCode()));
        result = ((result* 31)+((this.repeatCourse == null)? 0 :this.repeatCourse.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.levlCode == null)? 0 :this.levlCode.hashCode()));
        result = ((result* 31)+((this.tritSeqNo == null)? 0 :this.tritSeqNo.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Shrtrce) == false) {
            return false;
        }
        Shrtrce rhs = ((Shrtrce) other);
        return ((((((((((((((((((this.repeatSys == rhs.repeatSys)||((this.repeatSys!= null)&&this.repeatSys.equals(rhs.repeatSys)))&&((this.crseTitle == rhs.crseTitle)||((this.crseTitle!= null)&&this.crseTitle.equals(rhs.crseTitle))))&&((this.gmodCode == rhs.gmodCode)||((this.gmodCode!= null)&&this.gmodCode.equals(rhs.gmodCode))))&&((this.stspKeySequence == rhs.stspKeySequence)||((this.stspKeySequence!= null)&&this.stspKeySequence.equals(rhs.stspKeySequence))))&&((this.termCodeEff == rhs.termCodeEff)||((this.termCodeEff!= null)&&this.termCodeEff.equals(rhs.termCodeEff))))&&((this.subjCode == rhs.subjCode)||((this.subjCode!= null)&&this.subjCode.equals(rhs.subjCode))))&&((this.applNo == rhs.applNo)||((this.applNo!= null)&&this.applNo.equals(rhs.applNo))))&&((this.grdeCode == rhs.grdeCode)||((this.grdeCode!= null)&&this.grdeCode.equals(rhs.grdeCode))))&&((this.countInGpaInd == rhs.countInGpaInd)||((this.countInGpaInd!= null)&&this.countInGpaInd.equals(rhs.countInGpaInd))))&&((this.creditHours == rhs.creditHours)||((this.creditHours!= null)&&this.creditHours.equals(rhs.creditHours))))&&((this.tramSeqNo == rhs.tramSeqNo)||((this.tramSeqNo!= null)&&this.tramSeqNo.equals(rhs.tramSeqNo))))&&((this.crseNumb == rhs.crseNumb)||((this.crseNumb!= null)&&this.crseNumb.equals(rhs.crseNumb))))&&((this.shrtrcdAppliedInd == rhs.shrtrcdAppliedInd)||((this.shrtrcdAppliedInd!= null)&&this.shrtrcdAppliedInd.equals(rhs.shrtrcdAppliedInd))))&&((this.repeatCourse == rhs.repeatCourse)||((this.repeatCourse!= null)&&this.repeatCourse.equals(rhs.repeatCourse))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.levlCode == rhs.levlCode)||((this.levlCode!= null)&&this.levlCode.equals(rhs.levlCode))))&&((this.tritSeqNo == rhs.tritSeqNo)||((this.tritSeqNo!= null)&&this.tritSeqNo.equals(rhs.tritSeqNo))));
    }

}
