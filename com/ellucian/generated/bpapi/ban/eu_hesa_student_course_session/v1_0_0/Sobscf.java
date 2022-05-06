
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
    "activityDate",
    "finsupamount",
    "ssdtCodeAppspend",
    "pidm",
    "numhus",
    "ssdtCodeAppspendSt",
    "ssdtCodeFinsuptypeSt",
    "userId",
    "ssdtCodeFinsuptype"
})
@Generated("jsonschema2pojo")
public class Sobscf {

    /**
     * Lineage reference object : SOBSCFS_STU_COURSE_SESSION_ID
     * 
     */
    @JsonProperty("stuCourseSessionId")
    @JsonPropertyDescription("Lineage reference object : SOBSCFS_STU_COURSE_SESSION_ID")
    private String stuCourseSessionId;
    /**
     * Lineage reference object : SOBSCFS_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    @JsonPropertyDescription("Lineage reference object : SOBSCFS_ACTIVITY_DATE")
    private Date activityDate;
    /**
     * Financial Support Amount
     * <p>
     * Lineage reference object : SOBSCFS_FINSUPAMOUNT
     * 
     */
    @JsonProperty("finsupamount")
    @JsonPropertyDescription("Lineage reference object : SOBSCFS_FINSUPAMOUNT")
    private Double finsupamount;
    /**
     * Access and Participation Flag
     * <p>
     * Lineage reference object : SOBSCFS_SSDT_CODE_APPSPEND, Lookup lineage reference object : skvssdt,skvssdt
     * 
     */
    @JsonProperty("ssdtCodeAppspend")
    @JsonPropertyDescription("Lineage reference object : SOBSCFS_SSDT_CODE_APPSPEND, Lookup lineage reference object : skvssdt,skvssdt")
    private String ssdtCodeAppspend;
    /**
     * Lineage reference object : SOBSCFS_PIDM
     * 
     */
    @JsonProperty("pidm")
    @JsonPropertyDescription("Lineage reference object : SOBSCFS_PIDM")
    private Double pidm;
    /**
     * Lineage reference object : SOBSCFS_NUMHUS
     * 
     */
    @JsonProperty("numhus")
    @JsonPropertyDescription("Lineage reference object : SOBSCFS_NUMHUS")
    private String numhus;
    /**
     * Access and Participation Flag Description
     * <p>
     * 
     * 
     */
    @JsonProperty("ssdtCodeAppspendSt")
    private String ssdtCodeAppspendSt;
    /**
     * Financial Support Type Description
     * <p>
     * 
     * 
     */
    @JsonProperty("ssdtCodeFinsuptypeSt")
    private String ssdtCodeFinsuptypeSt;
    /**
     * Lineage reference object : SOBSCFS_USER_ID
     * 
     */
    @JsonProperty("userId")
    @JsonPropertyDescription("Lineage reference object : SOBSCFS_USER_ID")
    private String userId;
    /**
     * Financial Support Type
     * <p>
     * Lineage reference object : SOBSCFS_SSDT_CODE_FINSUPTYPE
     * (Required)
     * 
     */
    @JsonProperty("ssdtCodeFinsuptype")
    @JsonPropertyDescription("Lineage reference object : SOBSCFS_SSDT_CODE_FINSUPTYPE")
    private String ssdtCodeFinsuptype;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Lineage reference object : SOBSCFS_STU_COURSE_SESSION_ID
     * 
     */
    @JsonProperty("stuCourseSessionId")
    public String getStuCourseSessionId() {
        return stuCourseSessionId;
    }

    /**
     * Lineage reference object : SOBSCFS_STU_COURSE_SESSION_ID
     * 
     */
    @JsonProperty("stuCourseSessionId")
    public void setStuCourseSessionId(String stuCourseSessionId) {
        this.stuCourseSessionId = stuCourseSessionId;
    }

    public Sobscf withStuCourseSessionId(String stuCourseSessionId) {
        this.stuCourseSessionId = stuCourseSessionId;
        return this;
    }

    /**
     * Lineage reference object : SOBSCFS_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public Date getActivityDate() {
        return activityDate;
    }

    /**
     * Lineage reference object : SOBSCFS_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public void setActivityDate(Date activityDate) {
        this.activityDate = activityDate;
    }

    public Sobscf withActivityDate(Date activityDate) {
        this.activityDate = activityDate;
        return this;
    }

    /**
     * Financial Support Amount
     * <p>
     * Lineage reference object : SOBSCFS_FINSUPAMOUNT
     * 
     */
    @JsonProperty("finsupamount")
    public Double getFinsupamount() {
        return finsupamount;
    }

    /**
     * Financial Support Amount
     * <p>
     * Lineage reference object : SOBSCFS_FINSUPAMOUNT
     * 
     */
    @JsonProperty("finsupamount")
    public void setFinsupamount(Double finsupamount) {
        this.finsupamount = finsupamount;
    }

    public Sobscf withFinsupamount(Double finsupamount) {
        this.finsupamount = finsupamount;
        return this;
    }

    /**
     * Access and Participation Flag
     * <p>
     * Lineage reference object : SOBSCFS_SSDT_CODE_APPSPEND, Lookup lineage reference object : skvssdt,skvssdt
     * 
     */
    @JsonProperty("ssdtCodeAppspend")
    public String getSsdtCodeAppspend() {
        return ssdtCodeAppspend;
    }

    /**
     * Access and Participation Flag
     * <p>
     * Lineage reference object : SOBSCFS_SSDT_CODE_APPSPEND, Lookup lineage reference object : skvssdt,skvssdt
     * 
     */
    @JsonProperty("ssdtCodeAppspend")
    public void setSsdtCodeAppspend(String ssdtCodeAppspend) {
        this.ssdtCodeAppspend = ssdtCodeAppspend;
    }

    public Sobscf withSsdtCodeAppspend(String ssdtCodeAppspend) {
        this.ssdtCodeAppspend = ssdtCodeAppspend;
        return this;
    }

    /**
     * Lineage reference object : SOBSCFS_PIDM
     * 
     */
    @JsonProperty("pidm")
    public Double getPidm() {
        return pidm;
    }

    /**
     * Lineage reference object : SOBSCFS_PIDM
     * 
     */
    @JsonProperty("pidm")
    public void setPidm(Double pidm) {
        this.pidm = pidm;
    }

    public Sobscf withPidm(Double pidm) {
        this.pidm = pidm;
        return this;
    }

    /**
     * Lineage reference object : SOBSCFS_NUMHUS
     * 
     */
    @JsonProperty("numhus")
    public String getNumhus() {
        return numhus;
    }

    /**
     * Lineage reference object : SOBSCFS_NUMHUS
     * 
     */
    @JsonProperty("numhus")
    public void setNumhus(String numhus) {
        this.numhus = numhus;
    }

    public Sobscf withNumhus(String numhus) {
        this.numhus = numhus;
        return this;
    }

    /**
     * Access and Participation Flag Description
     * <p>
     * 
     * 
     */
    @JsonProperty("ssdtCodeAppspendSt")
    public String getSsdtCodeAppspendSt() {
        return ssdtCodeAppspendSt;
    }

    /**
     * Access and Participation Flag Description
     * <p>
     * 
     * 
     */
    @JsonProperty("ssdtCodeAppspendSt")
    public void setSsdtCodeAppspendSt(String ssdtCodeAppspendSt) {
        this.ssdtCodeAppspendSt = ssdtCodeAppspendSt;
    }

    public Sobscf withSsdtCodeAppspendSt(String ssdtCodeAppspendSt) {
        this.ssdtCodeAppspendSt = ssdtCodeAppspendSt;
        return this;
    }

    /**
     * Financial Support Type Description
     * <p>
     * 
     * 
     */
    @JsonProperty("ssdtCodeFinsuptypeSt")
    public String getSsdtCodeFinsuptypeSt() {
        return ssdtCodeFinsuptypeSt;
    }

    /**
     * Financial Support Type Description
     * <p>
     * 
     * 
     */
    @JsonProperty("ssdtCodeFinsuptypeSt")
    public void setSsdtCodeFinsuptypeSt(String ssdtCodeFinsuptypeSt) {
        this.ssdtCodeFinsuptypeSt = ssdtCodeFinsuptypeSt;
    }

    public Sobscf withSsdtCodeFinsuptypeSt(String ssdtCodeFinsuptypeSt) {
        this.ssdtCodeFinsuptypeSt = ssdtCodeFinsuptypeSt;
        return this;
    }

    /**
     * Lineage reference object : SOBSCFS_USER_ID
     * 
     */
    @JsonProperty("userId")
    public String getUserId() {
        return userId;
    }

    /**
     * Lineage reference object : SOBSCFS_USER_ID
     * 
     */
    @JsonProperty("userId")
    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Sobscf withUserId(String userId) {
        this.userId = userId;
        return this;
    }

    /**
     * Financial Support Type
     * <p>
     * Lineage reference object : SOBSCFS_SSDT_CODE_FINSUPTYPE
     * (Required)
     * 
     */
    @JsonProperty("ssdtCodeFinsuptype")
    public String getSsdtCodeFinsuptype() {
        return ssdtCodeFinsuptype;
    }

    /**
     * Financial Support Type
     * <p>
     * Lineage reference object : SOBSCFS_SSDT_CODE_FINSUPTYPE
     * (Required)
     * 
     */
    @JsonProperty("ssdtCodeFinsuptype")
    public void setSsdtCodeFinsuptype(String ssdtCodeFinsuptype) {
        this.ssdtCodeFinsuptype = ssdtCodeFinsuptype;
    }

    public Sobscf withSsdtCodeFinsuptype(String ssdtCodeFinsuptype) {
        this.ssdtCodeFinsuptype = ssdtCodeFinsuptype;
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

    public Sobscf withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Sobscf.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("stuCourseSessionId");
        sb.append('=');
        sb.append(((this.stuCourseSessionId == null)?"<null>":this.stuCourseSessionId));
        sb.append(',');
        sb.append("activityDate");
        sb.append('=');
        sb.append(((this.activityDate == null)?"<null>":this.activityDate));
        sb.append(',');
        sb.append("finsupamount");
        sb.append('=');
        sb.append(((this.finsupamount == null)?"<null>":this.finsupamount));
        sb.append(',');
        sb.append("ssdtCodeAppspend");
        sb.append('=');
        sb.append(((this.ssdtCodeAppspend == null)?"<null>":this.ssdtCodeAppspend));
        sb.append(',');
        sb.append("pidm");
        sb.append('=');
        sb.append(((this.pidm == null)?"<null>":this.pidm));
        sb.append(',');
        sb.append("numhus");
        sb.append('=');
        sb.append(((this.numhus == null)?"<null>":this.numhus));
        sb.append(',');
        sb.append("ssdtCodeAppspendSt");
        sb.append('=');
        sb.append(((this.ssdtCodeAppspendSt == null)?"<null>":this.ssdtCodeAppspendSt));
        sb.append(',');
        sb.append("ssdtCodeFinsuptypeSt");
        sb.append('=');
        sb.append(((this.ssdtCodeFinsuptypeSt == null)?"<null>":this.ssdtCodeFinsuptypeSt));
        sb.append(',');
        sb.append("userId");
        sb.append('=');
        sb.append(((this.userId == null)?"<null>":this.userId));
        sb.append(',');
        sb.append("ssdtCodeFinsuptype");
        sb.append('=');
        sb.append(((this.ssdtCodeFinsuptype == null)?"<null>":this.ssdtCodeFinsuptype));
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
        result = ((result* 31)+((this.activityDate == null)? 0 :this.activityDate.hashCode()));
        result = ((result* 31)+((this.finsupamount == null)? 0 :this.finsupamount.hashCode()));
        result = ((result* 31)+((this.ssdtCodeAppspend == null)? 0 :this.ssdtCodeAppspend.hashCode()));
        result = ((result* 31)+((this.pidm == null)? 0 :this.pidm.hashCode()));
        result = ((result* 31)+((this.numhus == null)? 0 :this.numhus.hashCode()));
        result = ((result* 31)+((this.ssdtCodeAppspendSt == null)? 0 :this.ssdtCodeAppspendSt.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.ssdtCodeFinsuptypeSt == null)? 0 :this.ssdtCodeFinsuptypeSt.hashCode()));
        result = ((result* 31)+((this.userId == null)? 0 :this.userId.hashCode()));
        result = ((result* 31)+((this.ssdtCodeFinsuptype == null)? 0 :this.ssdtCodeFinsuptype.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Sobscf) == false) {
            return false;
        }
        Sobscf rhs = ((Sobscf) other);
        return ((((((((((((this.stuCourseSessionId == rhs.stuCourseSessionId)||((this.stuCourseSessionId!= null)&&this.stuCourseSessionId.equals(rhs.stuCourseSessionId)))&&((this.activityDate == rhs.activityDate)||((this.activityDate!= null)&&this.activityDate.equals(rhs.activityDate))))&&((this.finsupamount == rhs.finsupamount)||((this.finsupamount!= null)&&this.finsupamount.equals(rhs.finsupamount))))&&((this.ssdtCodeAppspend == rhs.ssdtCodeAppspend)||((this.ssdtCodeAppspend!= null)&&this.ssdtCodeAppspend.equals(rhs.ssdtCodeAppspend))))&&((this.pidm == rhs.pidm)||((this.pidm!= null)&&this.pidm.equals(rhs.pidm))))&&((this.numhus == rhs.numhus)||((this.numhus!= null)&&this.numhus.equals(rhs.numhus))))&&((this.ssdtCodeAppspendSt == rhs.ssdtCodeAppspendSt)||((this.ssdtCodeAppspendSt!= null)&&this.ssdtCodeAppspendSt.equals(rhs.ssdtCodeAppspendSt))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.ssdtCodeFinsuptypeSt == rhs.ssdtCodeFinsuptypeSt)||((this.ssdtCodeFinsuptypeSt!= null)&&this.ssdtCodeFinsuptypeSt.equals(rhs.ssdtCodeFinsuptypeSt))))&&((this.userId == rhs.userId)||((this.userId!= null)&&this.userId.equals(rhs.userId))))&&((this.ssdtCodeFinsuptype == rhs.ssdtCodeFinsuptype)||((this.ssdtCodeFinsuptype!= null)&&this.ssdtCodeFinsuptype.equals(rhs.ssdtCodeFinsuptype))));
    }

}
