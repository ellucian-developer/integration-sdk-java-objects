
package com.ellucian.generated.bpapi.ban.student_course_registrations.v1_0_0;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "term",
    "id",
    "rstsEstsDate",
    "viewCurrent",
    "holdPassword",
    "printBill",
    "printSchedule",
    "keyStudyPath"
})
@Generated("jsonschema2pojo")
public class StudentCourseRegistrations100QapiPost {

    /**
     * Term
     * <p>
     * 
     * 
     */
    @JsonProperty("term")
    private String term;
    @JsonProperty("id")
    private String id;
    @JsonProperty("rstsEstsDate")
    private String rstsEstsDate;
    @JsonProperty("viewCurrent")
    private String viewCurrent;
    @JsonProperty("holdPassword")
    private String holdPassword;
    @JsonProperty("printBill")
    private String printBill;
    @JsonProperty("printSchedule")
    private String printSchedule;
    @JsonProperty("keyStudyPath")
    private String keyStudyPath;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Term
     * <p>
     * 
     * 
     */
    @JsonProperty("term")
    public String getTerm() {
        return term;
    }

    /**
     * Term
     * <p>
     * 
     * 
     */
    @JsonProperty("term")
    public void setTerm(String term) {
        this.term = term;
    }

    public StudentCourseRegistrations100QapiPost withTerm(String term) {
        this.term = term;
        return this;
    }

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    public StudentCourseRegistrations100QapiPost withId(String id) {
        this.id = id;
        return this;
    }

    @JsonProperty("rstsEstsDate")
    public String getRstsEstsDate() {
        return rstsEstsDate;
    }

    @JsonProperty("rstsEstsDate")
    public void setRstsEstsDate(String rstsEstsDate) {
        this.rstsEstsDate = rstsEstsDate;
    }

    public StudentCourseRegistrations100QapiPost withRstsEstsDate(String rstsEstsDate) {
        this.rstsEstsDate = rstsEstsDate;
        return this;
    }

    @JsonProperty("viewCurrent")
    public String getViewCurrent() {
        return viewCurrent;
    }

    @JsonProperty("viewCurrent")
    public void setViewCurrent(String viewCurrent) {
        this.viewCurrent = viewCurrent;
    }

    public StudentCourseRegistrations100QapiPost withViewCurrent(String viewCurrent) {
        this.viewCurrent = viewCurrent;
        return this;
    }

    @JsonProperty("holdPassword")
    public String getHoldPassword() {
        return holdPassword;
    }

    @JsonProperty("holdPassword")
    public void setHoldPassword(String holdPassword) {
        this.holdPassword = holdPassword;
    }

    public StudentCourseRegistrations100QapiPost withHoldPassword(String holdPassword) {
        this.holdPassword = holdPassword;
        return this;
    }

    @JsonProperty("printBill")
    public String getPrintBill() {
        return printBill;
    }

    @JsonProperty("printBill")
    public void setPrintBill(String printBill) {
        this.printBill = printBill;
    }

    public StudentCourseRegistrations100QapiPost withPrintBill(String printBill) {
        this.printBill = printBill;
        return this;
    }

    @JsonProperty("printSchedule")
    public String getPrintSchedule() {
        return printSchedule;
    }

    @JsonProperty("printSchedule")
    public void setPrintSchedule(String printSchedule) {
        this.printSchedule = printSchedule;
    }

    public StudentCourseRegistrations100QapiPost withPrintSchedule(String printSchedule) {
        this.printSchedule = printSchedule;
        return this;
    }

    @JsonProperty("keyStudyPath")
    public String getKeyStudyPath() {
        return keyStudyPath;
    }

    @JsonProperty("keyStudyPath")
    public void setKeyStudyPath(String keyStudyPath) {
        this.keyStudyPath = keyStudyPath;
    }

    public StudentCourseRegistrations100QapiPost withKeyStudyPath(String keyStudyPath) {
        this.keyStudyPath = keyStudyPath;
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

    public StudentCourseRegistrations100QapiPost withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(StudentCourseRegistrations100QapiPost.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("term");
        sb.append('=');
        sb.append(((this.term == null)?"<null>":this.term));
        sb.append(',');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("rstsEstsDate");
        sb.append('=');
        sb.append(((this.rstsEstsDate == null)?"<null>":this.rstsEstsDate));
        sb.append(',');
        sb.append("viewCurrent");
        sb.append('=');
        sb.append(((this.viewCurrent == null)?"<null>":this.viewCurrent));
        sb.append(',');
        sb.append("holdPassword");
        sb.append('=');
        sb.append(((this.holdPassword == null)?"<null>":this.holdPassword));
        sb.append(',');
        sb.append("printBill");
        sb.append('=');
        sb.append(((this.printBill == null)?"<null>":this.printBill));
        sb.append(',');
        sb.append("printSchedule");
        sb.append('=');
        sb.append(((this.printSchedule == null)?"<null>":this.printSchedule));
        sb.append(',');
        sb.append("keyStudyPath");
        sb.append('=');
        sb.append(((this.keyStudyPath == null)?"<null>":this.keyStudyPath));
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
        result = ((result* 31)+((this.holdPassword == null)? 0 :this.holdPassword.hashCode()));
        result = ((result* 31)+((this.printBill == null)? 0 :this.printBill.hashCode()));
        result = ((result* 31)+((this.printSchedule == null)? 0 :this.printSchedule.hashCode()));
        result = ((result* 31)+((this.keyStudyPath == null)? 0 :this.keyStudyPath.hashCode()));
        result = ((result* 31)+((this.term == null)? 0 :this.term.hashCode()));
        result = ((result* 31)+((this.rstsEstsDate == null)? 0 :this.rstsEstsDate.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.viewCurrent == null)? 0 :this.viewCurrent.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof StudentCourseRegistrations100QapiPost) == false) {
            return false;
        }
        StudentCourseRegistrations100QapiPost rhs = ((StudentCourseRegistrations100QapiPost) other);
        return ((((((((((this.holdPassword == rhs.holdPassword)||((this.holdPassword!= null)&&this.holdPassword.equals(rhs.holdPassword)))&&((this.printBill == rhs.printBill)||((this.printBill!= null)&&this.printBill.equals(rhs.printBill))))&&((this.printSchedule == rhs.printSchedule)||((this.printSchedule!= null)&&this.printSchedule.equals(rhs.printSchedule))))&&((this.keyStudyPath == rhs.keyStudyPath)||((this.keyStudyPath!= null)&&this.keyStudyPath.equals(rhs.keyStudyPath))))&&((this.term == rhs.term)||((this.term!= null)&&this.term.equals(rhs.term))))&&((this.rstsEstsDate == rhs.rstsEstsDate)||((this.rstsEstsDate!= null)&&this.rstsEstsDate.equals(rhs.rstsEstsDate))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.viewCurrent == rhs.viewCurrent)||((this.viewCurrent!= null)&&this.viewCurrent.equals(rhs.viewCurrent))));
    }

}
