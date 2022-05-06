
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
    "ssdtCodeFundingbodySt",
    "pidm",
    "ssdtCodeFundingbody",
    "numhus",
    "userId"
})
@Generated("jsonschema2pojo")
public class Sobscfb {

    /**
     * Lineage reference object : SOBSCFB_STU_COURSE_SESSION_ID
     * 
     */
    @JsonProperty("stuCourseSessionId")
    @JsonPropertyDescription("Lineage reference object : SOBSCFB_STU_COURSE_SESSION_ID")
    private String stuCourseSessionId;
    /**
     * Lineage reference object : SOBSCFB_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    @JsonPropertyDescription("Lineage reference object : SOBSCFB_ACTIVITY_DATE")
    private Date activityDate;
    /**
     * Funding Body Description
     * <p>
     * 
     * 
     */
    @JsonProperty("ssdtCodeFundingbodySt")
    private String ssdtCodeFundingbodySt;
    /**
     * Lineage reference object : SOBSCFB_PIDM
     * 
     */
    @JsonProperty("pidm")
    @JsonPropertyDescription("Lineage reference object : SOBSCFB_PIDM")
    private Double pidm;
    /**
     * Funding Body
     * <p>
     * Lineage reference object : SOBSCFB_SSDT_CODE_FUNDINGBODY
     * (Required)
     * 
     */
    @JsonProperty("ssdtCodeFundingbody")
    @JsonPropertyDescription("Lineage reference object : SOBSCFB_SSDT_CODE_FUNDINGBODY")
    private String ssdtCodeFundingbody;
    /**
     * Lineage reference object : SOBSCFB_NUMHUS
     * 
     */
    @JsonProperty("numhus")
    @JsonPropertyDescription("Lineage reference object : SOBSCFB_NUMHUS")
    private String numhus;
    /**
     * Lineage reference object : SOBSCFB_USER_ID
     * 
     */
    @JsonProperty("userId")
    @JsonPropertyDescription("Lineage reference object : SOBSCFB_USER_ID")
    private String userId;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Lineage reference object : SOBSCFB_STU_COURSE_SESSION_ID
     * 
     */
    @JsonProperty("stuCourseSessionId")
    public String getStuCourseSessionId() {
        return stuCourseSessionId;
    }

    /**
     * Lineage reference object : SOBSCFB_STU_COURSE_SESSION_ID
     * 
     */
    @JsonProperty("stuCourseSessionId")
    public void setStuCourseSessionId(String stuCourseSessionId) {
        this.stuCourseSessionId = stuCourseSessionId;
    }

    public Sobscfb withStuCourseSessionId(String stuCourseSessionId) {
        this.stuCourseSessionId = stuCourseSessionId;
        return this;
    }

    /**
     * Lineage reference object : SOBSCFB_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public Date getActivityDate() {
        return activityDate;
    }

    /**
     * Lineage reference object : SOBSCFB_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public void setActivityDate(Date activityDate) {
        this.activityDate = activityDate;
    }

    public Sobscfb withActivityDate(Date activityDate) {
        this.activityDate = activityDate;
        return this;
    }

    /**
     * Funding Body Description
     * <p>
     * 
     * 
     */
    @JsonProperty("ssdtCodeFundingbodySt")
    public String getSsdtCodeFundingbodySt() {
        return ssdtCodeFundingbodySt;
    }

    /**
     * Funding Body Description
     * <p>
     * 
     * 
     */
    @JsonProperty("ssdtCodeFundingbodySt")
    public void setSsdtCodeFundingbodySt(String ssdtCodeFundingbodySt) {
        this.ssdtCodeFundingbodySt = ssdtCodeFundingbodySt;
    }

    public Sobscfb withSsdtCodeFundingbodySt(String ssdtCodeFundingbodySt) {
        this.ssdtCodeFundingbodySt = ssdtCodeFundingbodySt;
        return this;
    }

    /**
     * Lineage reference object : SOBSCFB_PIDM
     * 
     */
    @JsonProperty("pidm")
    public Double getPidm() {
        return pidm;
    }

    /**
     * Lineage reference object : SOBSCFB_PIDM
     * 
     */
    @JsonProperty("pidm")
    public void setPidm(Double pidm) {
        this.pidm = pidm;
    }

    public Sobscfb withPidm(Double pidm) {
        this.pidm = pidm;
        return this;
    }

    /**
     * Funding Body
     * <p>
     * Lineage reference object : SOBSCFB_SSDT_CODE_FUNDINGBODY
     * (Required)
     * 
     */
    @JsonProperty("ssdtCodeFundingbody")
    public String getSsdtCodeFundingbody() {
        return ssdtCodeFundingbody;
    }

    /**
     * Funding Body
     * <p>
     * Lineage reference object : SOBSCFB_SSDT_CODE_FUNDINGBODY
     * (Required)
     * 
     */
    @JsonProperty("ssdtCodeFundingbody")
    public void setSsdtCodeFundingbody(String ssdtCodeFundingbody) {
        this.ssdtCodeFundingbody = ssdtCodeFundingbody;
    }

    public Sobscfb withSsdtCodeFundingbody(String ssdtCodeFundingbody) {
        this.ssdtCodeFundingbody = ssdtCodeFundingbody;
        return this;
    }

    /**
     * Lineage reference object : SOBSCFB_NUMHUS
     * 
     */
    @JsonProperty("numhus")
    public String getNumhus() {
        return numhus;
    }

    /**
     * Lineage reference object : SOBSCFB_NUMHUS
     * 
     */
    @JsonProperty("numhus")
    public void setNumhus(String numhus) {
        this.numhus = numhus;
    }

    public Sobscfb withNumhus(String numhus) {
        this.numhus = numhus;
        return this;
    }

    /**
     * Lineage reference object : SOBSCFB_USER_ID
     * 
     */
    @JsonProperty("userId")
    public String getUserId() {
        return userId;
    }

    /**
     * Lineage reference object : SOBSCFB_USER_ID
     * 
     */
    @JsonProperty("userId")
    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Sobscfb withUserId(String userId) {
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

    public Sobscfb withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Sobscfb.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("stuCourseSessionId");
        sb.append('=');
        sb.append(((this.stuCourseSessionId == null)?"<null>":this.stuCourseSessionId));
        sb.append(',');
        sb.append("activityDate");
        sb.append('=');
        sb.append(((this.activityDate == null)?"<null>":this.activityDate));
        sb.append(',');
        sb.append("ssdtCodeFundingbodySt");
        sb.append('=');
        sb.append(((this.ssdtCodeFundingbodySt == null)?"<null>":this.ssdtCodeFundingbodySt));
        sb.append(',');
        sb.append("pidm");
        sb.append('=');
        sb.append(((this.pidm == null)?"<null>":this.pidm));
        sb.append(',');
        sb.append("ssdtCodeFundingbody");
        sb.append('=');
        sb.append(((this.ssdtCodeFundingbody == null)?"<null>":this.ssdtCodeFundingbody));
        sb.append(',');
        sb.append("numhus");
        sb.append('=');
        sb.append(((this.numhus == null)?"<null>":this.numhus));
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
        result = ((result* 31)+((this.ssdtCodeFundingbodySt == null)? 0 :this.ssdtCodeFundingbodySt.hashCode()));
        result = ((result* 31)+((this.pidm == null)? 0 :this.pidm.hashCode()));
        result = ((result* 31)+((this.ssdtCodeFundingbody == null)? 0 :this.ssdtCodeFundingbody.hashCode()));
        result = ((result* 31)+((this.numhus == null)? 0 :this.numhus.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.userId == null)? 0 :this.userId.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Sobscfb) == false) {
            return false;
        }
        Sobscfb rhs = ((Sobscfb) other);
        return (((((((((this.stuCourseSessionId == rhs.stuCourseSessionId)||((this.stuCourseSessionId!= null)&&this.stuCourseSessionId.equals(rhs.stuCourseSessionId)))&&((this.activityDate == rhs.activityDate)||((this.activityDate!= null)&&this.activityDate.equals(rhs.activityDate))))&&((this.ssdtCodeFundingbodySt == rhs.ssdtCodeFundingbodySt)||((this.ssdtCodeFundingbodySt!= null)&&this.ssdtCodeFundingbodySt.equals(rhs.ssdtCodeFundingbodySt))))&&((this.pidm == rhs.pidm)||((this.pidm!= null)&&this.pidm.equals(rhs.pidm))))&&((this.ssdtCodeFundingbody == rhs.ssdtCodeFundingbody)||((this.ssdtCodeFundingbody!= null)&&this.ssdtCodeFundingbody.equals(rhs.ssdtCodeFundingbody))))&&((this.numhus == rhs.numhus)||((this.numhus!= null)&&this.numhus.equals(rhs.numhus))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.userId == rhs.userId)||((this.userId!= null)&&this.userId.equals(rhs.userId))));
    }

}
