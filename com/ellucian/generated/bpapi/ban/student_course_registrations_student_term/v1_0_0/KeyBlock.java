
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
    "printBill",
    "printSchedule",
    "holdDesc",
    "confidInd",
    "keyStudypath",
    "dcsdInd",
    "viewCurrent",
    "holdPassword",
    "rwname",
    "rstsEstsDate",
    "term",
    "id",
    "lastAssessmentDate"
})
@Generated("jsonschema2pojo")
public class KeyBlock {

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
     * Print Schedule
     * <p>
     * Lineage reference object : printSchedule
     * 
     */
    @JsonProperty("printSchedule")
    @JsonPropertyDescription("Lineage reference object : printSchedule")
    private Object printSchedule;
    /**
     * Lineage reference object : holdDesc
     * 
     */
    @JsonProperty("holdDesc")
    @JsonPropertyDescription("Lineage reference object : holdDesc")
    private Object holdDesc;
    /**
     * Lineage reference object : confidInd
     * 
     */
    @JsonProperty("confidInd")
    @JsonPropertyDescription("Lineage reference object : confidInd")
    private Object confidInd;
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
     * Lineage reference object : dcsdInd
     * 
     */
    @JsonProperty("dcsdInd")
    @JsonPropertyDescription("Lineage reference object : dcsdInd")
    private Object dcsdInd;
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
     * Holds
     * <p>
     * Lineage reference object : holdPassword
     * 
     */
    @JsonProperty("holdPassword")
    @JsonPropertyDescription("Lineage reference object : holdPassword")
    private Object holdPassword;
    /**
     * Lineage reference object : rwname
     * 
     */
    @JsonProperty("rwname")
    @JsonPropertyDescription("Lineage reference object : rwname")
    private Object rwname;
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
     * Term
     * <p>
     * Lineage reference object : term, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("term")
    @JsonPropertyDescription("Lineage reference object : term, Lookup lineage reference object : stvterm")
    private Object term;
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
     * Date
     * <p>
     * Lineage reference object : lastAssessmentDate
     * 
     */
    @JsonProperty("lastAssessmentDate")
    @JsonPropertyDescription("Lineage reference object : lastAssessmentDate")
    private Object lastAssessmentDate;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

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

    public KeyBlock withPrintBill(Object printBill) {
        this.printBill = printBill;
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

    public KeyBlock withPrintSchedule(Object printSchedule) {
        this.printSchedule = printSchedule;
        return this;
    }

    /**
     * Lineage reference object : holdDesc
     * 
     */
    @JsonProperty("holdDesc")
    public Object getHoldDesc() {
        return holdDesc;
    }

    /**
     * Lineage reference object : holdDesc
     * 
     */
    @JsonProperty("holdDesc")
    public void setHoldDesc(Object holdDesc) {
        this.holdDesc = holdDesc;
    }

    public KeyBlock withHoldDesc(Object holdDesc) {
        this.holdDesc = holdDesc;
        return this;
    }

    /**
     * Lineage reference object : confidInd
     * 
     */
    @JsonProperty("confidInd")
    public Object getConfidInd() {
        return confidInd;
    }

    /**
     * Lineage reference object : confidInd
     * 
     */
    @JsonProperty("confidInd")
    public void setConfidInd(Object confidInd) {
        this.confidInd = confidInd;
    }

    public KeyBlock withConfidInd(Object confidInd) {
        this.confidInd = confidInd;
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

    public KeyBlock withKeyStudypath(Object keyStudypath) {
        this.keyStudypath = keyStudypath;
        return this;
    }

    /**
     * Lineage reference object : dcsdInd
     * 
     */
    @JsonProperty("dcsdInd")
    public Object getDcsdInd() {
        return dcsdInd;
    }

    /**
     * Lineage reference object : dcsdInd
     * 
     */
    @JsonProperty("dcsdInd")
    public void setDcsdInd(Object dcsdInd) {
        this.dcsdInd = dcsdInd;
    }

    public KeyBlock withDcsdInd(Object dcsdInd) {
        this.dcsdInd = dcsdInd;
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

    public KeyBlock withViewCurrent(Object viewCurrent) {
        this.viewCurrent = viewCurrent;
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

    public KeyBlock withHoldPassword(Object holdPassword) {
        this.holdPassword = holdPassword;
        return this;
    }

    /**
     * Lineage reference object : rwname
     * 
     */
    @JsonProperty("rwname")
    public Object getRwname() {
        return rwname;
    }

    /**
     * Lineage reference object : rwname
     * 
     */
    @JsonProperty("rwname")
    public void setRwname(Object rwname) {
        this.rwname = rwname;
    }

    public KeyBlock withRwname(Object rwname) {
        this.rwname = rwname;
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

    public KeyBlock withRstsEstsDate(Object rstsEstsDate) {
        this.rstsEstsDate = rstsEstsDate;
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

    public KeyBlock withTerm(Object term) {
        this.term = term;
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

    public KeyBlock withId(Object id) {
        this.id = id;
        return this;
    }

    /**
     * Date
     * <p>
     * Lineage reference object : lastAssessmentDate
     * 
     */
    @JsonProperty("lastAssessmentDate")
    public Object getLastAssessmentDate() {
        return lastAssessmentDate;
    }

    /**
     * Date
     * <p>
     * Lineage reference object : lastAssessmentDate
     * 
     */
    @JsonProperty("lastAssessmentDate")
    public void setLastAssessmentDate(Object lastAssessmentDate) {
        this.lastAssessmentDate = lastAssessmentDate;
    }

    public KeyBlock withLastAssessmentDate(Object lastAssessmentDate) {
        this.lastAssessmentDate = lastAssessmentDate;
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

    public KeyBlock withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(KeyBlock.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("printBill");
        sb.append('=');
        sb.append(((this.printBill == null)?"<null>":this.printBill));
        sb.append(',');
        sb.append("printSchedule");
        sb.append('=');
        sb.append(((this.printSchedule == null)?"<null>":this.printSchedule));
        sb.append(',');
        sb.append("holdDesc");
        sb.append('=');
        sb.append(((this.holdDesc == null)?"<null>":this.holdDesc));
        sb.append(',');
        sb.append("confidInd");
        sb.append('=');
        sb.append(((this.confidInd == null)?"<null>":this.confidInd));
        sb.append(',');
        sb.append("keyStudypath");
        sb.append('=');
        sb.append(((this.keyStudypath == null)?"<null>":this.keyStudypath));
        sb.append(',');
        sb.append("dcsdInd");
        sb.append('=');
        sb.append(((this.dcsdInd == null)?"<null>":this.dcsdInd));
        sb.append(',');
        sb.append("viewCurrent");
        sb.append('=');
        sb.append(((this.viewCurrent == null)?"<null>":this.viewCurrent));
        sb.append(',');
        sb.append("holdPassword");
        sb.append('=');
        sb.append(((this.holdPassword == null)?"<null>":this.holdPassword));
        sb.append(',');
        sb.append("rwname");
        sb.append('=');
        sb.append(((this.rwname == null)?"<null>":this.rwname));
        sb.append(',');
        sb.append("rstsEstsDate");
        sb.append('=');
        sb.append(((this.rstsEstsDate == null)?"<null>":this.rstsEstsDate));
        sb.append(',');
        sb.append("term");
        sb.append('=');
        sb.append(((this.term == null)?"<null>":this.term));
        sb.append(',');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("lastAssessmentDate");
        sb.append('=');
        sb.append(((this.lastAssessmentDate == null)?"<null>":this.lastAssessmentDate));
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
        result = ((result* 31)+((this.printBill == null)? 0 :this.printBill.hashCode()));
        result = ((result* 31)+((this.printSchedule == null)? 0 :this.printSchedule.hashCode()));
        result = ((result* 31)+((this.holdDesc == null)? 0 :this.holdDesc.hashCode()));
        result = ((result* 31)+((this.confidInd == null)? 0 :this.confidInd.hashCode()));
        result = ((result* 31)+((this.keyStudypath == null)? 0 :this.keyStudypath.hashCode()));
        result = ((result* 31)+((this.dcsdInd == null)? 0 :this.dcsdInd.hashCode()));
        result = ((result* 31)+((this.viewCurrent == null)? 0 :this.viewCurrent.hashCode()));
        result = ((result* 31)+((this.holdPassword == null)? 0 :this.holdPassword.hashCode()));
        result = ((result* 31)+((this.rwname == null)? 0 :this.rwname.hashCode()));
        result = ((result* 31)+((this.rstsEstsDate == null)? 0 :this.rstsEstsDate.hashCode()));
        result = ((result* 31)+((this.term == null)? 0 :this.term.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.lastAssessmentDate == null)? 0 :this.lastAssessmentDate.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof KeyBlock) == false) {
            return false;
        }
        KeyBlock rhs = ((KeyBlock) other);
        return (((((((((((((((this.printBill == rhs.printBill)||((this.printBill!= null)&&this.printBill.equals(rhs.printBill)))&&((this.printSchedule == rhs.printSchedule)||((this.printSchedule!= null)&&this.printSchedule.equals(rhs.printSchedule))))&&((this.holdDesc == rhs.holdDesc)||((this.holdDesc!= null)&&this.holdDesc.equals(rhs.holdDesc))))&&((this.confidInd == rhs.confidInd)||((this.confidInd!= null)&&this.confidInd.equals(rhs.confidInd))))&&((this.keyStudypath == rhs.keyStudypath)||((this.keyStudypath!= null)&&this.keyStudypath.equals(rhs.keyStudypath))))&&((this.dcsdInd == rhs.dcsdInd)||((this.dcsdInd!= null)&&this.dcsdInd.equals(rhs.dcsdInd))))&&((this.viewCurrent == rhs.viewCurrent)||((this.viewCurrent!= null)&&this.viewCurrent.equals(rhs.viewCurrent))))&&((this.holdPassword == rhs.holdPassword)||((this.holdPassword!= null)&&this.holdPassword.equals(rhs.holdPassword))))&&((this.rwname == rhs.rwname)||((this.rwname!= null)&&this.rwname.equals(rhs.rwname))))&&((this.rstsEstsDate == rhs.rstsEstsDate)||((this.rstsEstsDate!= null)&&this.rstsEstsDate.equals(rhs.rstsEstsDate))))&&((this.term == rhs.term)||((this.term!= null)&&this.term.equals(rhs.term))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.lastAssessmentDate == rhs.lastAssessmentDate)||((this.lastAssessmentDate!= null)&&this.lastAssessmentDate.equals(rhs.lastAssessmentDate))));
    }

}
