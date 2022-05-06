
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
    "xxxxxxxAstdCode",
    "xxxxxxxCastCode",
    "printBill",
    "resdCode",
    "printSchedule",
    "xxxxxxxPrevCode",
    "keyStudypath",
    "viewCurrent",
    "rateCode",
    "scpcCode",
    "holdPassword",
    "ststCode",
    "blckCode",
    "term",
    "rstsEstsDate",
    "id",
    "stypCode"
})
@Generated("jsonschema2pojo")
public class StudentCourseRegistrationsStudentTerm100PutRequest {

    /**
     * Academic Standing
     * <p>
     * Lookup lineage reference object : stvastd
     * 
     */
    @JsonProperty("xxxxxxxAstdCode")
    @JsonPropertyDescription("Lookup lineage reference object : stvastd")
    private String xxxxxxxAstdCode;
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
     * Print Bill
     * <p>
     * Lineage reference object : printBill
     * 
     */
    @JsonProperty("printBill")
    @JsonPropertyDescription("Lineage reference object : printBill")
    private Object printBill;
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
    /**
     * Print Schedule
     * <p>
     * Lineage reference object : printSchedule
     * 
     */
    @JsonProperty("printSchedule")
    @JsonPropertyDescription("Lineage reference object : printSchedule")
    private Object printSchedule;
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
     * Study Path
     * <p>
     * Lineage reference object : keyStudypath, Lookup lineage reference object : sovlcur,stvastd,stvcast,sgvstsp,sgrstsp,stvastd,stvcast,sgvstsp,sgrstsp,sovlcur
     * 
     */
    @JsonProperty("keyStudypath")
    @JsonPropertyDescription("Lineage reference object : keyStudypath, Lookup lineage reference object : sovlcur,stvastd,stvcast,sgvstsp,sgrstsp,stvastd,stvcast,sgvstsp,sgrstsp,sovlcur")
    private Object keyStudypath;
    /**
     * View Current/Active Curricula
     * <p>
     * Lineage reference object : viewCurrent
     * 
     */
    @JsonProperty("viewCurrent")
    @JsonPropertyDescription("Lineage reference object : viewCurrent")
    private Object viewCurrent;
    /**
     * Fee Assessment Rate
     * <p>
     * Lineage reference object : SGBSTDN_RATE_CODE, Lookup lineage reference object : stvrate
     * 
     */
    @JsonProperty("rateCode")
    @JsonPropertyDescription("Lineage reference object : SGBSTDN_RATE_CODE, Lookup lineage reference object : stvrate")
    private String rateCode;
    /**
     * Student Centric Cycle
     * <p>
     * Lineage reference object : SGBSTDN_SCPC_CODE, Lookup lineage reference object : stvscpc,sobscps,sorscpt
     * 
     */
    @JsonProperty("scpcCode")
    @JsonPropertyDescription("Lineage reference object : SGBSTDN_SCPC_CODE, Lookup lineage reference object : stvscpc,sobscps,sorscpt")
    private String scpcCode;
    /**
     * Holds
     * <p>
     * Lineage reference object : holdPassword
     * 
     */
    @JsonProperty("holdPassword")
    @JsonPropertyDescription("Lineage reference object : holdPassword")
    private Object holdPassword;
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
     * Term
     * <p>
     * Lineage reference object : term, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("term")
    @JsonPropertyDescription("Lineage reference object : term, Lookup lineage reference object : stvterm")
    private Object term;
    /**
     * Date
     * <p>
     * Lineage reference object : rstsEstsDate
     * 
     */
    @JsonProperty("rstsEstsDate")
    @JsonPropertyDescription("Lineage reference object : rstsEstsDate")
    private Object rstsEstsDate;
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
     * Lineage reference object : SGBSTDN_STYP_CODE, Lookup lineage reference object : stvstyp
     * (Required)
     * 
     */
    @JsonProperty("stypCode")
    @JsonPropertyDescription("Lineage reference object : SGBSTDN_STYP_CODE, Lookup lineage reference object : stvstyp")
    private String stypCode;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

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

    public StudentCourseRegistrationsStudentTerm100PutRequest withXxxxxxxAstdCode(String xxxxxxxAstdCode) {
        this.xxxxxxxAstdCode = xxxxxxxAstdCode;
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

    public StudentCourseRegistrationsStudentTerm100PutRequest withXxxxxxxCastCode(String xxxxxxxCastCode) {
        this.xxxxxxxCastCode = xxxxxxxCastCode;
        return this;
    }

    /**
     * Print Bill
     * <p>
     * Lineage reference object : printBill
     * 
     */
    @JsonProperty("printBill")
    public Object getPrintBill() {
        return printBill;
    }

    /**
     * Print Bill
     * <p>
     * Lineage reference object : printBill
     * 
     */
    @JsonProperty("printBill")
    public void setPrintBill(Object printBill) {
        this.printBill = printBill;
    }

    public StudentCourseRegistrationsStudentTerm100PutRequest withPrintBill(Object printBill) {
        this.printBill = printBill;
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

    public StudentCourseRegistrationsStudentTerm100PutRequest withResdCode(String resdCode) {
        this.resdCode = resdCode;
        return this;
    }

    /**
     * Print Schedule
     * <p>
     * Lineage reference object : printSchedule
     * 
     */
    @JsonProperty("printSchedule")
    public Object getPrintSchedule() {
        return printSchedule;
    }

    /**
     * Print Schedule
     * <p>
     * Lineage reference object : printSchedule
     * 
     */
    @JsonProperty("printSchedule")
    public void setPrintSchedule(Object printSchedule) {
        this.printSchedule = printSchedule;
    }

    public StudentCourseRegistrationsStudentTerm100PutRequest withPrintSchedule(Object printSchedule) {
        this.printSchedule = printSchedule;
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

    public StudentCourseRegistrationsStudentTerm100PutRequest withXxxxxxxPrevCode(String xxxxxxxPrevCode) {
        this.xxxxxxxPrevCode = xxxxxxxPrevCode;
        return this;
    }

    /**
     * Study Path
     * <p>
     * Lineage reference object : keyStudypath, Lookup lineage reference object : sovlcur,stvastd,stvcast,sgvstsp,sgrstsp,stvastd,stvcast,sgvstsp,sgrstsp,sovlcur
     * 
     */
    @JsonProperty("keyStudypath")
    public Object getKeyStudypath() {
        return keyStudypath;
    }

    /**
     * Study Path
     * <p>
     * Lineage reference object : keyStudypath, Lookup lineage reference object : sovlcur,stvastd,stvcast,sgvstsp,sgrstsp,stvastd,stvcast,sgvstsp,sgrstsp,sovlcur
     * 
     */
    @JsonProperty("keyStudypath")
    public void setKeyStudypath(Object keyStudypath) {
        this.keyStudypath = keyStudypath;
    }

    public StudentCourseRegistrationsStudentTerm100PutRequest withKeyStudypath(Object keyStudypath) {
        this.keyStudypath = keyStudypath;
        return this;
    }

    /**
     * View Current/Active Curricula
     * <p>
     * Lineage reference object : viewCurrent
     * 
     */
    @JsonProperty("viewCurrent")
    public Object getViewCurrent() {
        return viewCurrent;
    }

    /**
     * View Current/Active Curricula
     * <p>
     * Lineage reference object : viewCurrent
     * 
     */
    @JsonProperty("viewCurrent")
    public void setViewCurrent(Object viewCurrent) {
        this.viewCurrent = viewCurrent;
    }

    public StudentCourseRegistrationsStudentTerm100PutRequest withViewCurrent(Object viewCurrent) {
        this.viewCurrent = viewCurrent;
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

    public StudentCourseRegistrationsStudentTerm100PutRequest withRateCode(String rateCode) {
        this.rateCode = rateCode;
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

    public StudentCourseRegistrationsStudentTerm100PutRequest withScpcCode(String scpcCode) {
        this.scpcCode = scpcCode;
        return this;
    }

    /**
     * Holds
     * <p>
     * Lineage reference object : holdPassword
     * 
     */
    @JsonProperty("holdPassword")
    public Object getHoldPassword() {
        return holdPassword;
    }

    /**
     * Holds
     * <p>
     * Lineage reference object : holdPassword
     * 
     */
    @JsonProperty("holdPassword")
    public void setHoldPassword(Object holdPassword) {
        this.holdPassword = holdPassword;
    }

    public StudentCourseRegistrationsStudentTerm100PutRequest withHoldPassword(Object holdPassword) {
        this.holdPassword = holdPassword;
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

    public StudentCourseRegistrationsStudentTerm100PutRequest withStstCode(String ststCode) {
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

    public StudentCourseRegistrationsStudentTerm100PutRequest withBlckCode(String blckCode) {
        this.blckCode = blckCode;
        return this;
    }

    /**
     * Term
     * <p>
     * Lineage reference object : term, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("term")
    public Object getTerm() {
        return term;
    }

    /**
     * Term
     * <p>
     * Lineage reference object : term, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("term")
    public void setTerm(Object term) {
        this.term = term;
    }

    public StudentCourseRegistrationsStudentTerm100PutRequest withTerm(Object term) {
        this.term = term;
        return this;
    }

    /**
     * Date
     * <p>
     * Lineage reference object : rstsEstsDate
     * 
     */
    @JsonProperty("rstsEstsDate")
    public Object getRstsEstsDate() {
        return rstsEstsDate;
    }

    /**
     * Date
     * <p>
     * Lineage reference object : rstsEstsDate
     * 
     */
    @JsonProperty("rstsEstsDate")
    public void setRstsEstsDate(Object rstsEstsDate) {
        this.rstsEstsDate = rstsEstsDate;
    }

    public StudentCourseRegistrationsStudentTerm100PutRequest withRstsEstsDate(Object rstsEstsDate) {
        this.rstsEstsDate = rstsEstsDate;
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

    public StudentCourseRegistrationsStudentTerm100PutRequest withId(Object id) {
        this.id = id;
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

    public StudentCourseRegistrationsStudentTerm100PutRequest withStypCode(String stypCode) {
        this.stypCode = stypCode;
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

    public StudentCourseRegistrationsStudentTerm100PutRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(StudentCourseRegistrationsStudentTerm100PutRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("xxxxxxxAstdCode");
        sb.append('=');
        sb.append(((this.xxxxxxxAstdCode == null)?"<null>":this.xxxxxxxAstdCode));
        sb.append(',');
        sb.append("xxxxxxxCastCode");
        sb.append('=');
        sb.append(((this.xxxxxxxCastCode == null)?"<null>":this.xxxxxxxCastCode));
        sb.append(',');
        sb.append("printBill");
        sb.append('=');
        sb.append(((this.printBill == null)?"<null>":this.printBill));
        sb.append(',');
        sb.append("resdCode");
        sb.append('=');
        sb.append(((this.resdCode == null)?"<null>":this.resdCode));
        sb.append(',');
        sb.append("printSchedule");
        sb.append('=');
        sb.append(((this.printSchedule == null)?"<null>":this.printSchedule));
        sb.append(',');
        sb.append("xxxxxxxPrevCode");
        sb.append('=');
        sb.append(((this.xxxxxxxPrevCode == null)?"<null>":this.xxxxxxxPrevCode));
        sb.append(',');
        sb.append("keyStudypath");
        sb.append('=');
        sb.append(((this.keyStudypath == null)?"<null>":this.keyStudypath));
        sb.append(',');
        sb.append("viewCurrent");
        sb.append('=');
        sb.append(((this.viewCurrent == null)?"<null>":this.viewCurrent));
        sb.append(',');
        sb.append("rateCode");
        sb.append('=');
        sb.append(((this.rateCode == null)?"<null>":this.rateCode));
        sb.append(',');
        sb.append("scpcCode");
        sb.append('=');
        sb.append(((this.scpcCode == null)?"<null>":this.scpcCode));
        sb.append(',');
        sb.append("holdPassword");
        sb.append('=');
        sb.append(((this.holdPassword == null)?"<null>":this.holdPassword));
        sb.append(',');
        sb.append("ststCode");
        sb.append('=');
        sb.append(((this.ststCode == null)?"<null>":this.ststCode));
        sb.append(',');
        sb.append("blckCode");
        sb.append('=');
        sb.append(((this.blckCode == null)?"<null>":this.blckCode));
        sb.append(',');
        sb.append("term");
        sb.append('=');
        sb.append(((this.term == null)?"<null>":this.term));
        sb.append(',');
        sb.append("rstsEstsDate");
        sb.append('=');
        sb.append(((this.rstsEstsDate == null)?"<null>":this.rstsEstsDate));
        sb.append(',');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("stypCode");
        sb.append('=');
        sb.append(((this.stypCode == null)?"<null>":this.stypCode));
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
        result = ((result* 31)+((this.xxxxxxxAstdCode == null)? 0 :this.xxxxxxxAstdCode.hashCode()));
        result = ((result* 31)+((this.xxxxxxxCastCode == null)? 0 :this.xxxxxxxCastCode.hashCode()));
        result = ((result* 31)+((this.printBill == null)? 0 :this.printBill.hashCode()));
        result = ((result* 31)+((this.resdCode == null)? 0 :this.resdCode.hashCode()));
        result = ((result* 31)+((this.printSchedule == null)? 0 :this.printSchedule.hashCode()));
        result = ((result* 31)+((this.xxxxxxxPrevCode == null)? 0 :this.xxxxxxxPrevCode.hashCode()));
        result = ((result* 31)+((this.keyStudypath == null)? 0 :this.keyStudypath.hashCode()));
        result = ((result* 31)+((this.viewCurrent == null)? 0 :this.viewCurrent.hashCode()));
        result = ((result* 31)+((this.rateCode == null)? 0 :this.rateCode.hashCode()));
        result = ((result* 31)+((this.scpcCode == null)? 0 :this.scpcCode.hashCode()));
        result = ((result* 31)+((this.holdPassword == null)? 0 :this.holdPassword.hashCode()));
        result = ((result* 31)+((this.ststCode == null)? 0 :this.ststCode.hashCode()));
        result = ((result* 31)+((this.blckCode == null)? 0 :this.blckCode.hashCode()));
        result = ((result* 31)+((this.term == null)? 0 :this.term.hashCode()));
        result = ((result* 31)+((this.rstsEstsDate == null)? 0 :this.rstsEstsDate.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.stypCode == null)? 0 :this.stypCode.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof StudentCourseRegistrationsStudentTerm100PutRequest) == false) {
            return false;
        }
        StudentCourseRegistrationsStudentTerm100PutRequest rhs = ((StudentCourseRegistrationsStudentTerm100PutRequest) other);
        return (((((((((((((((((((this.xxxxxxxAstdCode == rhs.xxxxxxxAstdCode)||((this.xxxxxxxAstdCode!= null)&&this.xxxxxxxAstdCode.equals(rhs.xxxxxxxAstdCode)))&&((this.xxxxxxxCastCode == rhs.xxxxxxxCastCode)||((this.xxxxxxxCastCode!= null)&&this.xxxxxxxCastCode.equals(rhs.xxxxxxxCastCode))))&&((this.printBill == rhs.printBill)||((this.printBill!= null)&&this.printBill.equals(rhs.printBill))))&&((this.resdCode == rhs.resdCode)||((this.resdCode!= null)&&this.resdCode.equals(rhs.resdCode))))&&((this.printSchedule == rhs.printSchedule)||((this.printSchedule!= null)&&this.printSchedule.equals(rhs.printSchedule))))&&((this.xxxxxxxPrevCode == rhs.xxxxxxxPrevCode)||((this.xxxxxxxPrevCode!= null)&&this.xxxxxxxPrevCode.equals(rhs.xxxxxxxPrevCode))))&&((this.keyStudypath == rhs.keyStudypath)||((this.keyStudypath!= null)&&this.keyStudypath.equals(rhs.keyStudypath))))&&((this.viewCurrent == rhs.viewCurrent)||((this.viewCurrent!= null)&&this.viewCurrent.equals(rhs.viewCurrent))))&&((this.rateCode == rhs.rateCode)||((this.rateCode!= null)&&this.rateCode.equals(rhs.rateCode))))&&((this.scpcCode == rhs.scpcCode)||((this.scpcCode!= null)&&this.scpcCode.equals(rhs.scpcCode))))&&((this.holdPassword == rhs.holdPassword)||((this.holdPassword!= null)&&this.holdPassword.equals(rhs.holdPassword))))&&((this.ststCode == rhs.ststCode)||((this.ststCode!= null)&&this.ststCode.equals(rhs.ststCode))))&&((this.blckCode == rhs.blckCode)||((this.blckCode!= null)&&this.blckCode.equals(rhs.blckCode))))&&((this.term == rhs.term)||((this.term!= null)&&this.term.equals(rhs.term))))&&((this.rstsEstsDate == rhs.rstsEstsDate)||((this.rstsEstsDate!= null)&&this.rstsEstsDate.equals(rhs.rstsEstsDate))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.stypCode == rhs.stypCode)||((this.stypCode!= null)&&this.stypCode.equals(rhs.stypCode))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
    }

}
