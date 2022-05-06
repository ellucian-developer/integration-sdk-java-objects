
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
    "ssdtCodeRefperiodSt",
    "year",
    "pidm",
    "numhus",
    "rpStuload",
    "ssdtCodeRefperiod",
    "userId"
})
@Generated("jsonschema2pojo")
public class Sobscft {

    /**
     * Lineage reference object : SOBSCFT_STU_COURSE_SESSION_ID
     * 
     */
    @JsonProperty("stuCourseSessionId")
    @JsonPropertyDescription("Lineage reference object : SOBSCFT_STU_COURSE_SESSION_ID")
    private String stuCourseSessionId;
    /**
     * Lineage reference object : SOBSCFT_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    @JsonPropertyDescription("Lineage reference object : SOBSCFT_ACTIVITY_DATE")
    private Date activityDate;
    /**
     * Reference Period Description
     * <p>
     * 
     * 
     */
    @JsonProperty("ssdtCodeRefperiodSt")
    private String ssdtCodeRefperiodSt;
    /**
     * Year
     * <p>
     * Lineage reference object : SOBSCFT_YEAR
     * (Required)
     * 
     */
    @JsonProperty("year")
    @JsonPropertyDescription("Lineage reference object : SOBSCFT_YEAR")
    private String year;
    /**
     * Lineage reference object : SOBSCFT_PIDM
     * 
     */
    @JsonProperty("pidm")
    @JsonPropertyDescription("Lineage reference object : SOBSCFT_PIDM")
    private Double pidm;
    /**
     * Lineage reference object : SOBSCFT_NUMHUS
     * 
     */
    @JsonProperty("numhus")
    @JsonPropertyDescription("Lineage reference object : SOBSCFT_NUMHUS")
    private String numhus;
    /**
     * RP Student Load
     * <p>
     * Lineage reference object : SOBSCFT_RP_STULOAD
     * (Required)
     * 
     */
    @JsonProperty("rpStuload")
    @JsonPropertyDescription("Lineage reference object : SOBSCFT_RP_STULOAD")
    private Double rpStuload;
    /**
     * Reference Period
     * <p>
     * Lineage reference object : SOBSCFT_SSDT_CODE_REFPERIOD, Lookup lineage reference object : skvssdt,skvssdt
     * (Required)
     * 
     */
    @JsonProperty("ssdtCodeRefperiod")
    @JsonPropertyDescription("Lineage reference object : SOBSCFT_SSDT_CODE_REFPERIOD, Lookup lineage reference object : skvssdt,skvssdt")
    private String ssdtCodeRefperiod;
    /**
     * Lineage reference object : SOBSCFT_USER_ID
     * 
     */
    @JsonProperty("userId")
    @JsonPropertyDescription("Lineage reference object : SOBSCFT_USER_ID")
    private String userId;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Lineage reference object : SOBSCFT_STU_COURSE_SESSION_ID
     * 
     */
    @JsonProperty("stuCourseSessionId")
    public String getStuCourseSessionId() {
        return stuCourseSessionId;
    }

    /**
     * Lineage reference object : SOBSCFT_STU_COURSE_SESSION_ID
     * 
     */
    @JsonProperty("stuCourseSessionId")
    public void setStuCourseSessionId(String stuCourseSessionId) {
        this.stuCourseSessionId = stuCourseSessionId;
    }

    public Sobscft withStuCourseSessionId(String stuCourseSessionId) {
        this.stuCourseSessionId = stuCourseSessionId;
        return this;
    }

    /**
     * Lineage reference object : SOBSCFT_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public Date getActivityDate() {
        return activityDate;
    }

    /**
     * Lineage reference object : SOBSCFT_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public void setActivityDate(Date activityDate) {
        this.activityDate = activityDate;
    }

    public Sobscft withActivityDate(Date activityDate) {
        this.activityDate = activityDate;
        return this;
    }

    /**
     * Reference Period Description
     * <p>
     * 
     * 
     */
    @JsonProperty("ssdtCodeRefperiodSt")
    public String getSsdtCodeRefperiodSt() {
        return ssdtCodeRefperiodSt;
    }

    /**
     * Reference Period Description
     * <p>
     * 
     * 
     */
    @JsonProperty("ssdtCodeRefperiodSt")
    public void setSsdtCodeRefperiodSt(String ssdtCodeRefperiodSt) {
        this.ssdtCodeRefperiodSt = ssdtCodeRefperiodSt;
    }

    public Sobscft withSsdtCodeRefperiodSt(String ssdtCodeRefperiodSt) {
        this.ssdtCodeRefperiodSt = ssdtCodeRefperiodSt;
        return this;
    }

    /**
     * Year
     * <p>
     * Lineage reference object : SOBSCFT_YEAR
     * (Required)
     * 
     */
    @JsonProperty("year")
    public String getYear() {
        return year;
    }

    /**
     * Year
     * <p>
     * Lineage reference object : SOBSCFT_YEAR
     * (Required)
     * 
     */
    @JsonProperty("year")
    public void setYear(String year) {
        this.year = year;
    }

    public Sobscft withYear(String year) {
        this.year = year;
        return this;
    }

    /**
     * Lineage reference object : SOBSCFT_PIDM
     * 
     */
    @JsonProperty("pidm")
    public Double getPidm() {
        return pidm;
    }

    /**
     * Lineage reference object : SOBSCFT_PIDM
     * 
     */
    @JsonProperty("pidm")
    public void setPidm(Double pidm) {
        this.pidm = pidm;
    }

    public Sobscft withPidm(Double pidm) {
        this.pidm = pidm;
        return this;
    }

    /**
     * Lineage reference object : SOBSCFT_NUMHUS
     * 
     */
    @JsonProperty("numhus")
    public String getNumhus() {
        return numhus;
    }

    /**
     * Lineage reference object : SOBSCFT_NUMHUS
     * 
     */
    @JsonProperty("numhus")
    public void setNumhus(String numhus) {
        this.numhus = numhus;
    }

    public Sobscft withNumhus(String numhus) {
        this.numhus = numhus;
        return this;
    }

    /**
     * RP Student Load
     * <p>
     * Lineage reference object : SOBSCFT_RP_STULOAD
     * (Required)
     * 
     */
    @JsonProperty("rpStuload")
    public Double getRpStuload() {
        return rpStuload;
    }

    /**
     * RP Student Load
     * <p>
     * Lineage reference object : SOBSCFT_RP_STULOAD
     * (Required)
     * 
     */
    @JsonProperty("rpStuload")
    public void setRpStuload(Double rpStuload) {
        this.rpStuload = rpStuload;
    }

    public Sobscft withRpStuload(Double rpStuload) {
        this.rpStuload = rpStuload;
        return this;
    }

    /**
     * Reference Period
     * <p>
     * Lineage reference object : SOBSCFT_SSDT_CODE_REFPERIOD, Lookup lineage reference object : skvssdt,skvssdt
     * (Required)
     * 
     */
    @JsonProperty("ssdtCodeRefperiod")
    public String getSsdtCodeRefperiod() {
        return ssdtCodeRefperiod;
    }

    /**
     * Reference Period
     * <p>
     * Lineage reference object : SOBSCFT_SSDT_CODE_REFPERIOD, Lookup lineage reference object : skvssdt,skvssdt
     * (Required)
     * 
     */
    @JsonProperty("ssdtCodeRefperiod")
    public void setSsdtCodeRefperiod(String ssdtCodeRefperiod) {
        this.ssdtCodeRefperiod = ssdtCodeRefperiod;
    }

    public Sobscft withSsdtCodeRefperiod(String ssdtCodeRefperiod) {
        this.ssdtCodeRefperiod = ssdtCodeRefperiod;
        return this;
    }

    /**
     * Lineage reference object : SOBSCFT_USER_ID
     * 
     */
    @JsonProperty("userId")
    public String getUserId() {
        return userId;
    }

    /**
     * Lineage reference object : SOBSCFT_USER_ID
     * 
     */
    @JsonProperty("userId")
    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Sobscft withUserId(String userId) {
        this.userId = userId;
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

    public Sobscft withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Sobscft.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("stuCourseSessionId");
        sb.append('=');
        sb.append(((this.stuCourseSessionId == null)?"<null>":this.stuCourseSessionId));
        sb.append(',');
        sb.append("activityDate");
        sb.append('=');
        sb.append(((this.activityDate == null)?"<null>":this.activityDate));
        sb.append(',');
        sb.append("ssdtCodeRefperiodSt");
        sb.append('=');
        sb.append(((this.ssdtCodeRefperiodSt == null)?"<null>":this.ssdtCodeRefperiodSt));
        sb.append(',');
        sb.append("year");
        sb.append('=');
        sb.append(((this.year == null)?"<null>":this.year));
        sb.append(',');
        sb.append("pidm");
        sb.append('=');
        sb.append(((this.pidm == null)?"<null>":this.pidm));
        sb.append(',');
        sb.append("numhus");
        sb.append('=');
        sb.append(((this.numhus == null)?"<null>":this.numhus));
        sb.append(',');
        sb.append("rpStuload");
        sb.append('=');
        sb.append(((this.rpStuload == null)?"<null>":this.rpStuload));
        sb.append(',');
        sb.append("ssdtCodeRefperiod");
        sb.append('=');
        sb.append(((this.ssdtCodeRefperiod == null)?"<null>":this.ssdtCodeRefperiod));
        sb.append(',');
        sb.append("userId");
        sb.append('=');
        sb.append(((this.userId == null)?"<null>":this.userId));
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
        result = ((result* 31)+((this.ssdtCodeRefperiodSt == null)? 0 :this.ssdtCodeRefperiodSt.hashCode()));
        result = ((result* 31)+((this.year == null)? 0 :this.year.hashCode()));
        result = ((result* 31)+((this.pidm == null)? 0 :this.pidm.hashCode()));
        result = ((result* 31)+((this.numhus == null)? 0 :this.numhus.hashCode()));
        result = ((result* 31)+((this.rpStuload == null)? 0 :this.rpStuload.hashCode()));
        result = ((result* 31)+((this.ssdtCodeRefperiod == null)? 0 :this.ssdtCodeRefperiod.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.userId == null)? 0 :this.userId.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Sobscft) == false) {
            return false;
        }
        Sobscft rhs = ((Sobscft) other);
        return (((((((((((this.stuCourseSessionId == rhs.stuCourseSessionId)||((this.stuCourseSessionId!= null)&&this.stuCourseSessionId.equals(rhs.stuCourseSessionId)))&&((this.activityDate == rhs.activityDate)||((this.activityDate!= null)&&this.activityDate.equals(rhs.activityDate))))&&((this.ssdtCodeRefperiodSt == rhs.ssdtCodeRefperiodSt)||((this.ssdtCodeRefperiodSt!= null)&&this.ssdtCodeRefperiodSt.equals(rhs.ssdtCodeRefperiodSt))))&&((this.year == rhs.year)||((this.year!= null)&&this.year.equals(rhs.year))))&&((this.pidm == rhs.pidm)||((this.pidm!= null)&&this.pidm.equals(rhs.pidm))))&&((this.numhus == rhs.numhus)||((this.numhus!= null)&&this.numhus.equals(rhs.numhus))))&&((this.rpStuload == rhs.rpStuload)||((this.rpStuload!= null)&&this.rpStuload.equals(rhs.rpStuload))))&&((this.ssdtCodeRefperiod == rhs.ssdtCodeRefperiod)||((this.ssdtCodeRefperiod!= null)&&this.ssdtCodeRefperiod.equals(rhs.ssdtCodeRefperiod))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.userId == rhs.userId)||((this.userId!= null)&&this.userId.equals(rhs.userId))));
    }

}
