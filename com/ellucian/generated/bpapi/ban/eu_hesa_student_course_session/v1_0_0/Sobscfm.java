
package com.ellucian.generated.bpapi.ban.eu_hesa_student_course_session.v1_0_0;

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
    "stuCourseSessionId",
    "ssdtCodeFundlengthSt",
    "userId",
    "ssdtCodeFundcomp",
    "activityDate",
    "ssdtCodeElq",
    "pidm",
    "ssdtCodeFundcompSt",
    "ssdtCodeElqSt",
    "numhus",
    "ssdtCodeNonregfeeSt",
    "ssdtCodeFundlength",
    "ssdtCodeNonregfee"
})
@Generated("jsonschema2pojo")
public class Sobscfm {

    /**
     * Lineage reference object : SOBSCFM_STU_COURSE_SESSION_ID
     * 
     */
    @JsonProperty("stuCourseSessionId")
    @JsonPropertyDescription("Lineage reference object : SOBSCFM_STU_COURSE_SESSION_ID")
    private String stuCourseSessionId;
    @JsonProperty("ssdtCodeFundlengthSt")
    private String ssdtCodeFundlengthSt;
    /**
     * Lineage reference object : SOBSCFM_USER_ID
     * 
     */
    @JsonProperty("userId")
    @JsonPropertyDescription("Lineage reference object : SOBSCFM_USER_ID")
    private String userId;
    /**
     * Funding Completion
     * <p>
     * Lineage reference object : SOBSCFM_SSDT_CODE_FUNDCOMP, Lookup lineage reference object : skvssdt,skvssdt
     * 
     */
    @JsonProperty("ssdtCodeFundcomp")
    @JsonPropertyDescription("Lineage reference object : SOBSCFM_SSDT_CODE_FUNDCOMP, Lookup lineage reference object : skvssdt,skvssdt")
    private String ssdtCodeFundcomp;
    /**
     * Lineage reference object : SOBSCFM_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    @JsonPropertyDescription("Lineage reference object : SOBSCFM_ACTIVITY_DATE")
    private Date activityDate;
    /**
     * Equivalent or Lower Qualification
     * <p>
     * Lineage reference object : SOBSCFM_SSDT_CODE_ELQ, Lookup lineage reference object : skvssdt,skvssdt
     * 
     */
    @JsonProperty("ssdtCodeElq")
    @JsonPropertyDescription("Lineage reference object : SOBSCFM_SSDT_CODE_ELQ, Lookup lineage reference object : skvssdt,skvssdt")
    private String ssdtCodeElq;
    /**
     * Lineage reference object : SOBSCFM_PIDM
     * 
     */
    @JsonProperty("pidm")
    @JsonPropertyDescription("Lineage reference object : SOBSCFM_PIDM")
    private Double pidm;
    @JsonProperty("ssdtCodeFundcompSt")
    private String ssdtCodeFundcompSt;
    @JsonProperty("ssdtCodeElqSt")
    private String ssdtCodeElqSt;
    /**
     * Lineage reference object : SOBSCFM_NUMHUS
     * 
     */
    @JsonProperty("numhus")
    @JsonPropertyDescription("Lineage reference object : SOBSCFM_NUMHUS")
    private String numhus;
    @JsonProperty("ssdtCodeNonregfeeSt")
    private String ssdtCodeNonregfeeSt;
    /**
     * Funding Length
     * <p>
     * Lineage reference object : SOBSCFM_SSDT_CODE_FUNDLENGTH, Lookup lineage reference object : skvssdt,skvssdt
     * 
     */
    @JsonProperty("ssdtCodeFundlength")
    @JsonPropertyDescription("Lineage reference object : SOBSCFM_SSDT_CODE_FUNDLENGTH, Lookup lineage reference object : skvssdt,skvssdt")
    private String ssdtCodeFundlength;
    /**
     * Non Regulated Fee Flag
     * <p>
     * Lineage reference object : SOBSCFM_SSDT_CODE_NONREGFEE, Lookup lineage reference object : skvssdt,skvssdt
     * 
     */
    @JsonProperty("ssdtCodeNonregfee")
    @JsonPropertyDescription("Lineage reference object : SOBSCFM_SSDT_CODE_NONREGFEE, Lookup lineage reference object : skvssdt,skvssdt")
    private String ssdtCodeNonregfee;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Lineage reference object : SOBSCFM_STU_COURSE_SESSION_ID
     * 
     */
    @JsonProperty("stuCourseSessionId")
    public String getStuCourseSessionId() {
        return stuCourseSessionId;
    }

    /**
     * Lineage reference object : SOBSCFM_STU_COURSE_SESSION_ID
     * 
     */
    @JsonProperty("stuCourseSessionId")
    public void setStuCourseSessionId(String stuCourseSessionId) {
        this.stuCourseSessionId = stuCourseSessionId;
    }

    public Sobscfm withStuCourseSessionId(String stuCourseSessionId) {
        this.stuCourseSessionId = stuCourseSessionId;
        return this;
    }

    @JsonProperty("ssdtCodeFundlengthSt")
    public String getSsdtCodeFundlengthSt() {
        return ssdtCodeFundlengthSt;
    }

    @JsonProperty("ssdtCodeFundlengthSt")
    public void setSsdtCodeFundlengthSt(String ssdtCodeFundlengthSt) {
        this.ssdtCodeFundlengthSt = ssdtCodeFundlengthSt;
    }

    public Sobscfm withSsdtCodeFundlengthSt(String ssdtCodeFundlengthSt) {
        this.ssdtCodeFundlengthSt = ssdtCodeFundlengthSt;
        return this;
    }

    /**
     * Lineage reference object : SOBSCFM_USER_ID
     * 
     */
    @JsonProperty("userId")
    public String getUserId() {
        return userId;
    }

    /**
     * Lineage reference object : SOBSCFM_USER_ID
     * 
     */
    @JsonProperty("userId")
    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Sobscfm withUserId(String userId) {
        this.userId = userId;
        return this;
    }

    /**
     * Funding Completion
     * <p>
     * Lineage reference object : SOBSCFM_SSDT_CODE_FUNDCOMP, Lookup lineage reference object : skvssdt,skvssdt
     * 
     */
    @JsonProperty("ssdtCodeFundcomp")
    public String getSsdtCodeFundcomp() {
        return ssdtCodeFundcomp;
    }

    /**
     * Funding Completion
     * <p>
     * Lineage reference object : SOBSCFM_SSDT_CODE_FUNDCOMP, Lookup lineage reference object : skvssdt,skvssdt
     * 
     */
    @JsonProperty("ssdtCodeFundcomp")
    public void setSsdtCodeFundcomp(String ssdtCodeFundcomp) {
        this.ssdtCodeFundcomp = ssdtCodeFundcomp;
    }

    public Sobscfm withSsdtCodeFundcomp(String ssdtCodeFundcomp) {
        this.ssdtCodeFundcomp = ssdtCodeFundcomp;
        return this;
    }

    /**
     * Lineage reference object : SOBSCFM_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public Date getActivityDate() {
        return activityDate;
    }

    /**
     * Lineage reference object : SOBSCFM_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public void setActivityDate(Date activityDate) {
        this.activityDate = activityDate;
    }

    public Sobscfm withActivityDate(Date activityDate) {
        this.activityDate = activityDate;
        return this;
    }

    /**
     * Equivalent or Lower Qualification
     * <p>
     * Lineage reference object : SOBSCFM_SSDT_CODE_ELQ, Lookup lineage reference object : skvssdt,skvssdt
     * 
     */
    @JsonProperty("ssdtCodeElq")
    public String getSsdtCodeElq() {
        return ssdtCodeElq;
    }

    /**
     * Equivalent or Lower Qualification
     * <p>
     * Lineage reference object : SOBSCFM_SSDT_CODE_ELQ, Lookup lineage reference object : skvssdt,skvssdt
     * 
     */
    @JsonProperty("ssdtCodeElq")
    public void setSsdtCodeElq(String ssdtCodeElq) {
        this.ssdtCodeElq = ssdtCodeElq;
    }

    public Sobscfm withSsdtCodeElq(String ssdtCodeElq) {
        this.ssdtCodeElq = ssdtCodeElq;
        return this;
    }

    /**
     * Lineage reference object : SOBSCFM_PIDM
     * 
     */
    @JsonProperty("pidm")
    public Double getPidm() {
        return pidm;
    }

    /**
     * Lineage reference object : SOBSCFM_PIDM
     * 
     */
    @JsonProperty("pidm")
    public void setPidm(Double pidm) {
        this.pidm = pidm;
    }

    public Sobscfm withPidm(Double pidm) {
        this.pidm = pidm;
        return this;
    }

    @JsonProperty("ssdtCodeFundcompSt")
    public String getSsdtCodeFundcompSt() {
        return ssdtCodeFundcompSt;
    }

    @JsonProperty("ssdtCodeFundcompSt")
    public void setSsdtCodeFundcompSt(String ssdtCodeFundcompSt) {
        this.ssdtCodeFundcompSt = ssdtCodeFundcompSt;
    }

    public Sobscfm withSsdtCodeFundcompSt(String ssdtCodeFundcompSt) {
        this.ssdtCodeFundcompSt = ssdtCodeFundcompSt;
        return this;
    }

    @JsonProperty("ssdtCodeElqSt")
    public String getSsdtCodeElqSt() {
        return ssdtCodeElqSt;
    }

    @JsonProperty("ssdtCodeElqSt")
    public void setSsdtCodeElqSt(String ssdtCodeElqSt) {
        this.ssdtCodeElqSt = ssdtCodeElqSt;
    }

    public Sobscfm withSsdtCodeElqSt(String ssdtCodeElqSt) {
        this.ssdtCodeElqSt = ssdtCodeElqSt;
        return this;
    }

    /**
     * Lineage reference object : SOBSCFM_NUMHUS
     * 
     */
    @JsonProperty("numhus")
    public String getNumhus() {
        return numhus;
    }

    /**
     * Lineage reference object : SOBSCFM_NUMHUS
     * 
     */
    @JsonProperty("numhus")
    public void setNumhus(String numhus) {
        this.numhus = numhus;
    }

    public Sobscfm withNumhus(String numhus) {
        this.numhus = numhus;
        return this;
    }

    @JsonProperty("ssdtCodeNonregfeeSt")
    public String getSsdtCodeNonregfeeSt() {
        return ssdtCodeNonregfeeSt;
    }

    @JsonProperty("ssdtCodeNonregfeeSt")
    public void setSsdtCodeNonregfeeSt(String ssdtCodeNonregfeeSt) {
        this.ssdtCodeNonregfeeSt = ssdtCodeNonregfeeSt;
    }

    public Sobscfm withSsdtCodeNonregfeeSt(String ssdtCodeNonregfeeSt) {
        this.ssdtCodeNonregfeeSt = ssdtCodeNonregfeeSt;
        return this;
    }

    /**
     * Funding Length
     * <p>
     * Lineage reference object : SOBSCFM_SSDT_CODE_FUNDLENGTH, Lookup lineage reference object : skvssdt,skvssdt
     * 
     */
    @JsonProperty("ssdtCodeFundlength")
    public String getSsdtCodeFundlength() {
        return ssdtCodeFundlength;
    }

    /**
     * Funding Length
     * <p>
     * Lineage reference object : SOBSCFM_SSDT_CODE_FUNDLENGTH, Lookup lineage reference object : skvssdt,skvssdt
     * 
     */
    @JsonProperty("ssdtCodeFundlength")
    public void setSsdtCodeFundlength(String ssdtCodeFundlength) {
        this.ssdtCodeFundlength = ssdtCodeFundlength;
    }

    public Sobscfm withSsdtCodeFundlength(String ssdtCodeFundlength) {
        this.ssdtCodeFundlength = ssdtCodeFundlength;
        return this;
    }

    /**
     * Non Regulated Fee Flag
     * <p>
     * Lineage reference object : SOBSCFM_SSDT_CODE_NONREGFEE, Lookup lineage reference object : skvssdt,skvssdt
     * 
     */
    @JsonProperty("ssdtCodeNonregfee")
    public String getSsdtCodeNonregfee() {
        return ssdtCodeNonregfee;
    }

    /**
     * Non Regulated Fee Flag
     * <p>
     * Lineage reference object : SOBSCFM_SSDT_CODE_NONREGFEE, Lookup lineage reference object : skvssdt,skvssdt
     * 
     */
    @JsonProperty("ssdtCodeNonregfee")
    public void setSsdtCodeNonregfee(String ssdtCodeNonregfee) {
        this.ssdtCodeNonregfee = ssdtCodeNonregfee;
    }

    public Sobscfm withSsdtCodeNonregfee(String ssdtCodeNonregfee) {
        this.ssdtCodeNonregfee = ssdtCodeNonregfee;
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

    public Sobscfm withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Sobscfm.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("stuCourseSessionId");
        sb.append('=');
        sb.append(((this.stuCourseSessionId == null)?"<null>":this.stuCourseSessionId));
        sb.append(',');
        sb.append("ssdtCodeFundlengthSt");
        sb.append('=');
        sb.append(((this.ssdtCodeFundlengthSt == null)?"<null>":this.ssdtCodeFundlengthSt));
        sb.append(',');
        sb.append("userId");
        sb.append('=');
        sb.append(((this.userId == null)?"<null>":this.userId));
        sb.append(',');
        sb.append("ssdtCodeFundcomp");
        sb.append('=');
        sb.append(((this.ssdtCodeFundcomp == null)?"<null>":this.ssdtCodeFundcomp));
        sb.append(',');
        sb.append("activityDate");
        sb.append('=');
        sb.append(((this.activityDate == null)?"<null>":this.activityDate));
        sb.append(',');
        sb.append("ssdtCodeElq");
        sb.append('=');
        sb.append(((this.ssdtCodeElq == null)?"<null>":this.ssdtCodeElq));
        sb.append(',');
        sb.append("pidm");
        sb.append('=');
        sb.append(((this.pidm == null)?"<null>":this.pidm));
        sb.append(',');
        sb.append("ssdtCodeFundcompSt");
        sb.append('=');
        sb.append(((this.ssdtCodeFundcompSt == null)?"<null>":this.ssdtCodeFundcompSt));
        sb.append(',');
        sb.append("ssdtCodeElqSt");
        sb.append('=');
        sb.append(((this.ssdtCodeElqSt == null)?"<null>":this.ssdtCodeElqSt));
        sb.append(',');
        sb.append("numhus");
        sb.append('=');
        sb.append(((this.numhus == null)?"<null>":this.numhus));
        sb.append(',');
        sb.append("ssdtCodeNonregfeeSt");
        sb.append('=');
        sb.append(((this.ssdtCodeNonregfeeSt == null)?"<null>":this.ssdtCodeNonregfeeSt));
        sb.append(',');
        sb.append("ssdtCodeFundlength");
        sb.append('=');
        sb.append(((this.ssdtCodeFundlength == null)?"<null>":this.ssdtCodeFundlength));
        sb.append(',');
        sb.append("ssdtCodeNonregfee");
        sb.append('=');
        sb.append(((this.ssdtCodeNonregfee == null)?"<null>":this.ssdtCodeNonregfee));
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
        result = ((result* 31)+((this.stuCourseSessionId == null)? 0 :this.stuCourseSessionId.hashCode()));
        result = ((result* 31)+((this.ssdtCodeFundlengthSt == null)? 0 :this.ssdtCodeFundlengthSt.hashCode()));
        result = ((result* 31)+((this.userId == null)? 0 :this.userId.hashCode()));
        result = ((result* 31)+((this.ssdtCodeFundcomp == null)? 0 :this.ssdtCodeFundcomp.hashCode()));
        result = ((result* 31)+((this.activityDate == null)? 0 :this.activityDate.hashCode()));
        result = ((result* 31)+((this.ssdtCodeElq == null)? 0 :this.ssdtCodeElq.hashCode()));
        result = ((result* 31)+((this.pidm == null)? 0 :this.pidm.hashCode()));
        result = ((result* 31)+((this.ssdtCodeFundcompSt == null)? 0 :this.ssdtCodeFundcompSt.hashCode()));
        result = ((result* 31)+((this.ssdtCodeElqSt == null)? 0 :this.ssdtCodeElqSt.hashCode()));
        result = ((result* 31)+((this.numhus == null)? 0 :this.numhus.hashCode()));
        result = ((result* 31)+((this.ssdtCodeNonregfeeSt == null)? 0 :this.ssdtCodeNonregfeeSt.hashCode()));
        result = ((result* 31)+((this.ssdtCodeFundlength == null)? 0 :this.ssdtCodeFundlength.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.ssdtCodeNonregfee == null)? 0 :this.ssdtCodeNonregfee.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Sobscfm) == false) {
            return false;
        }
        Sobscfm rhs = ((Sobscfm) other);
        return (((((((((((((((this.stuCourseSessionId == rhs.stuCourseSessionId)||((this.stuCourseSessionId!= null)&&this.stuCourseSessionId.equals(rhs.stuCourseSessionId)))&&((this.ssdtCodeFundlengthSt == rhs.ssdtCodeFundlengthSt)||((this.ssdtCodeFundlengthSt!= null)&&this.ssdtCodeFundlengthSt.equals(rhs.ssdtCodeFundlengthSt))))&&((this.userId == rhs.userId)||((this.userId!= null)&&this.userId.equals(rhs.userId))))&&((this.ssdtCodeFundcomp == rhs.ssdtCodeFundcomp)||((this.ssdtCodeFundcomp!= null)&&this.ssdtCodeFundcomp.equals(rhs.ssdtCodeFundcomp))))&&((this.activityDate == rhs.activityDate)||((this.activityDate!= null)&&this.activityDate.equals(rhs.activityDate))))&&((this.ssdtCodeElq == rhs.ssdtCodeElq)||((this.ssdtCodeElq!= null)&&this.ssdtCodeElq.equals(rhs.ssdtCodeElq))))&&((this.pidm == rhs.pidm)||((this.pidm!= null)&&this.pidm.equals(rhs.pidm))))&&((this.ssdtCodeFundcompSt == rhs.ssdtCodeFundcompSt)||((this.ssdtCodeFundcompSt!= null)&&this.ssdtCodeFundcompSt.equals(rhs.ssdtCodeFundcompSt))))&&((this.ssdtCodeElqSt == rhs.ssdtCodeElqSt)||((this.ssdtCodeElqSt!= null)&&this.ssdtCodeElqSt.equals(rhs.ssdtCodeElqSt))))&&((this.numhus == rhs.numhus)||((this.numhus!= null)&&this.numhus.equals(rhs.numhus))))&&((this.ssdtCodeNonregfeeSt == rhs.ssdtCodeNonregfeeSt)||((this.ssdtCodeNonregfeeSt!= null)&&this.ssdtCodeNonregfeeSt.equals(rhs.ssdtCodeNonregfeeSt))))&&((this.ssdtCodeFundlength == rhs.ssdtCodeFundlength)||((this.ssdtCodeFundlength!= null)&&this.ssdtCodeFundlength.equals(rhs.ssdtCodeFundlength))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.ssdtCodeNonregfee == rhs.ssdtCodeNonregfee)||((this.ssdtCodeNonregfee!= null)&&this.ssdtCodeNonregfee.equals(rhs.ssdtCodeNonregfee))));
    }

}
