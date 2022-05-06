
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
    "ssdtCodeHostId",
    "offVenuActivityId",
    "ssdtCodeActdurtyp",
    "endDate",
    "ssdtCodeCountrySt",
    "ssdtCodeActtypeId",
    "activityDuration",
    "ssdtCodeHostidtyp",
    "ssdtCodeMobschemeSt",
    "ssdtCodeActtypeIdSt",
    "ssdtCodeHostidtypSt",
    "ssdtCodeCountry",
    "userId",
    "ssdtCodeActdurtypSt",
    "ssdtCodeMobscheme",
    "activityDate",
    "pidm",
    "numhus",
    "moduleInstanceId",
    "ssdtCodeHostIdSt",
    "startDate"
})
@Generated("jsonschema2pojo")
public class Sobmova {

    /**
     * Lineage reference object : SOBMOVA_STU_COURSE_SESSION_ID
     * 
     */
    @JsonProperty("stuCourseSessionId")
    @JsonPropertyDescription("Lineage reference object : SOBMOVA_STU_COURSE_SESSION_ID")
    private String stuCourseSessionId;
    /**
     * Lineage reference object : SOBMOVA_SSDT_CODE_HOST_ID, Lookup lineage reference object : skvssdt,skvssdt
     * (Required)
     * 
     */
    @JsonProperty("ssdtCodeHostId")
    @JsonPropertyDescription("Lineage reference object : SOBMOVA_SSDT_CODE_HOST_ID, Lookup lineage reference object : skvssdt,skvssdt")
    private String ssdtCodeHostId;
    /**
     * Lineage reference object : SOBMOVA_OFF_VENU_ACTIVITY_ID
     * (Required)
     * 
     */
    @JsonProperty("offVenuActivityId")
    @JsonPropertyDescription("Lineage reference object : SOBMOVA_OFF_VENU_ACTIVITY_ID")
    private String offVenuActivityId;
    /**
     * Lineage reference object : SOBMOVA_SSDT_CODE_ACTDURTYP, Lookup lineage reference object : skvssdt,skvssdt
     * (Required)
     * 
     */
    @JsonProperty("ssdtCodeActdurtyp")
    @JsonPropertyDescription("Lineage reference object : SOBMOVA_SSDT_CODE_ACTDURTYP, Lookup lineage reference object : skvssdt,skvssdt")
    private String ssdtCodeActdurtyp;
    /**
     * Lineage reference object : SOBMOVA_END_DATE
     * 
     */
    @JsonProperty("endDate")
    @JsonPropertyDescription("Lineage reference object : SOBMOVA_END_DATE")
    private Date endDate;
    @JsonProperty("ssdtCodeCountrySt")
    private String ssdtCodeCountrySt;
    /**
     * Lineage reference object : SOBMOVA_SSDT_CODE_ACTTYPE_ID, Lookup lineage reference object : skvssdt,skvssdt
     * (Required)
     * 
     */
    @JsonProperty("ssdtCodeActtypeId")
    @JsonPropertyDescription("Lineage reference object : SOBMOVA_SSDT_CODE_ACTTYPE_ID, Lookup lineage reference object : skvssdt,skvssdt")
    private String ssdtCodeActtypeId;
    /**
     * Lineage reference object : SOBMOVA_ACTIVITY_DURATION
     * 
     */
    @JsonProperty("activityDuration")
    @JsonPropertyDescription("Lineage reference object : SOBMOVA_ACTIVITY_DURATION")
    private Double activityDuration;
    /**
     * Lineage reference object : SOBMOVA_SSDT_CODE_HOSTIDTYP, Lookup lineage reference object : skvssdt,skvssdt
     * 
     */
    @JsonProperty("ssdtCodeHostidtyp")
    @JsonPropertyDescription("Lineage reference object : SOBMOVA_SSDT_CODE_HOSTIDTYP, Lookup lineage reference object : skvssdt,skvssdt")
    private String ssdtCodeHostidtyp;
    @JsonProperty("ssdtCodeMobschemeSt")
    private String ssdtCodeMobschemeSt;
    @JsonProperty("ssdtCodeActtypeIdSt")
    private String ssdtCodeActtypeIdSt;
    @JsonProperty("ssdtCodeHostidtypSt")
    private String ssdtCodeHostidtypSt;
    /**
     * Lineage reference object : SOBMOVA_SSDT_CODE_COUNTRY, Lookup lineage reference object : skvssdt,skvssdt
     * (Required)
     * 
     */
    @JsonProperty("ssdtCodeCountry")
    @JsonPropertyDescription("Lineage reference object : SOBMOVA_SSDT_CODE_COUNTRY, Lookup lineage reference object : skvssdt,skvssdt")
    private String ssdtCodeCountry;
    /**
     * Lineage reference object : SOBMOVA_USER_ID
     * 
     */
    @JsonProperty("userId")
    @JsonPropertyDescription("Lineage reference object : SOBMOVA_USER_ID")
    private String userId;
    @JsonProperty("ssdtCodeActdurtypSt")
    private String ssdtCodeActdurtypSt;
    /**
     * Lineage reference object : SOBMOVA_SSDT_CODE_MOBSCHEME, Lookup lineage reference object : skvssdt,skvssdt
     * (Required)
     * 
     */
    @JsonProperty("ssdtCodeMobscheme")
    @JsonPropertyDescription("Lineage reference object : SOBMOVA_SSDT_CODE_MOBSCHEME, Lookup lineage reference object : skvssdt,skvssdt")
    private String ssdtCodeMobscheme;
    /**
     * Lineage reference object : SOBMOVA_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    @JsonPropertyDescription("Lineage reference object : SOBMOVA_ACTIVITY_DATE")
    private Date activityDate;
    /**
     * Lineage reference object : SOBMOVA_PIDM
     * 
     */
    @JsonProperty("pidm")
    @JsonPropertyDescription("Lineage reference object : SOBMOVA_PIDM")
    private Double pidm;
    /**
     * Lineage reference object : SOBMOVA_NUMHUS
     * 
     */
    @JsonProperty("numhus")
    @JsonPropertyDescription("Lineage reference object : SOBMOVA_NUMHUS")
    private String numhus;
    /**
     * Lineage reference object : SOBMOVA_MODULE_INSTANCE_ID
     * 
     */
    @JsonProperty("moduleInstanceId")
    @JsonPropertyDescription("Lineage reference object : SOBMOVA_MODULE_INSTANCE_ID")
    private String moduleInstanceId;
    @JsonProperty("ssdtCodeHostIdSt")
    private String ssdtCodeHostIdSt;
    /**
     * Lineage reference object : SOBMOVA_START_DATE
     * 
     */
    @JsonProperty("startDate")
    @JsonPropertyDescription("Lineage reference object : SOBMOVA_START_DATE")
    private Date startDate;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Lineage reference object : SOBMOVA_STU_COURSE_SESSION_ID
     * 
     */
    @JsonProperty("stuCourseSessionId")
    public String getStuCourseSessionId() {
        return stuCourseSessionId;
    }

    /**
     * Lineage reference object : SOBMOVA_STU_COURSE_SESSION_ID
     * 
     */
    @JsonProperty("stuCourseSessionId")
    public void setStuCourseSessionId(String stuCourseSessionId) {
        this.stuCourseSessionId = stuCourseSessionId;
    }

    public Sobmova withStuCourseSessionId(String stuCourseSessionId) {
        this.stuCourseSessionId = stuCourseSessionId;
        return this;
    }

    /**
     * Lineage reference object : SOBMOVA_SSDT_CODE_HOST_ID, Lookup lineage reference object : skvssdt,skvssdt
     * (Required)
     * 
     */
    @JsonProperty("ssdtCodeHostId")
    public String getSsdtCodeHostId() {
        return ssdtCodeHostId;
    }

    /**
     * Lineage reference object : SOBMOVA_SSDT_CODE_HOST_ID, Lookup lineage reference object : skvssdt,skvssdt
     * (Required)
     * 
     */
    @JsonProperty("ssdtCodeHostId")
    public void setSsdtCodeHostId(String ssdtCodeHostId) {
        this.ssdtCodeHostId = ssdtCodeHostId;
    }

    public Sobmova withSsdtCodeHostId(String ssdtCodeHostId) {
        this.ssdtCodeHostId = ssdtCodeHostId;
        return this;
    }

    /**
     * Lineage reference object : SOBMOVA_OFF_VENU_ACTIVITY_ID
     * (Required)
     * 
     */
    @JsonProperty("offVenuActivityId")
    public String getOffVenuActivityId() {
        return offVenuActivityId;
    }

    /**
     * Lineage reference object : SOBMOVA_OFF_VENU_ACTIVITY_ID
     * (Required)
     * 
     */
    @JsonProperty("offVenuActivityId")
    public void setOffVenuActivityId(String offVenuActivityId) {
        this.offVenuActivityId = offVenuActivityId;
    }

    public Sobmova withOffVenuActivityId(String offVenuActivityId) {
        this.offVenuActivityId = offVenuActivityId;
        return this;
    }

    /**
     * Lineage reference object : SOBMOVA_SSDT_CODE_ACTDURTYP, Lookup lineage reference object : skvssdt,skvssdt
     * (Required)
     * 
     */
    @JsonProperty("ssdtCodeActdurtyp")
    public String getSsdtCodeActdurtyp() {
        return ssdtCodeActdurtyp;
    }

    /**
     * Lineage reference object : SOBMOVA_SSDT_CODE_ACTDURTYP, Lookup lineage reference object : skvssdt,skvssdt
     * (Required)
     * 
     */
    @JsonProperty("ssdtCodeActdurtyp")
    public void setSsdtCodeActdurtyp(String ssdtCodeActdurtyp) {
        this.ssdtCodeActdurtyp = ssdtCodeActdurtyp;
    }

    public Sobmova withSsdtCodeActdurtyp(String ssdtCodeActdurtyp) {
        this.ssdtCodeActdurtyp = ssdtCodeActdurtyp;
        return this;
    }

    /**
     * Lineage reference object : SOBMOVA_END_DATE
     * 
     */
    @JsonProperty("endDate")
    public Date getEndDate() {
        return endDate;
    }

    /**
     * Lineage reference object : SOBMOVA_END_DATE
     * 
     */
    @JsonProperty("endDate")
    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public Sobmova withEndDate(Date endDate) {
        this.endDate = endDate;
        return this;
    }

    @JsonProperty("ssdtCodeCountrySt")
    public String getSsdtCodeCountrySt() {
        return ssdtCodeCountrySt;
    }

    @JsonProperty("ssdtCodeCountrySt")
    public void setSsdtCodeCountrySt(String ssdtCodeCountrySt) {
        this.ssdtCodeCountrySt = ssdtCodeCountrySt;
    }

    public Sobmova withSsdtCodeCountrySt(String ssdtCodeCountrySt) {
        this.ssdtCodeCountrySt = ssdtCodeCountrySt;
        return this;
    }

    /**
     * Lineage reference object : SOBMOVA_SSDT_CODE_ACTTYPE_ID, Lookup lineage reference object : skvssdt,skvssdt
     * (Required)
     * 
     */
    @JsonProperty("ssdtCodeActtypeId")
    public String getSsdtCodeActtypeId() {
        return ssdtCodeActtypeId;
    }

    /**
     * Lineage reference object : SOBMOVA_SSDT_CODE_ACTTYPE_ID, Lookup lineage reference object : skvssdt,skvssdt
     * (Required)
     * 
     */
    @JsonProperty("ssdtCodeActtypeId")
    public void setSsdtCodeActtypeId(String ssdtCodeActtypeId) {
        this.ssdtCodeActtypeId = ssdtCodeActtypeId;
    }

    public Sobmova withSsdtCodeActtypeId(String ssdtCodeActtypeId) {
        this.ssdtCodeActtypeId = ssdtCodeActtypeId;
        return this;
    }

    /**
     * Lineage reference object : SOBMOVA_ACTIVITY_DURATION
     * 
     */
    @JsonProperty("activityDuration")
    public Double getActivityDuration() {
        return activityDuration;
    }

    /**
     * Lineage reference object : SOBMOVA_ACTIVITY_DURATION
     * 
     */
    @JsonProperty("activityDuration")
    public void setActivityDuration(Double activityDuration) {
        this.activityDuration = activityDuration;
    }

    public Sobmova withActivityDuration(Double activityDuration) {
        this.activityDuration = activityDuration;
        return this;
    }

    /**
     * Lineage reference object : SOBMOVA_SSDT_CODE_HOSTIDTYP, Lookup lineage reference object : skvssdt,skvssdt
     * 
     */
    @JsonProperty("ssdtCodeHostidtyp")
    public String getSsdtCodeHostidtyp() {
        return ssdtCodeHostidtyp;
    }

    /**
     * Lineage reference object : SOBMOVA_SSDT_CODE_HOSTIDTYP, Lookup lineage reference object : skvssdt,skvssdt
     * 
     */
    @JsonProperty("ssdtCodeHostidtyp")
    public void setSsdtCodeHostidtyp(String ssdtCodeHostidtyp) {
        this.ssdtCodeHostidtyp = ssdtCodeHostidtyp;
    }

    public Sobmova withSsdtCodeHostidtyp(String ssdtCodeHostidtyp) {
        this.ssdtCodeHostidtyp = ssdtCodeHostidtyp;
        return this;
    }

    @JsonProperty("ssdtCodeMobschemeSt")
    public String getSsdtCodeMobschemeSt() {
        return ssdtCodeMobschemeSt;
    }

    @JsonProperty("ssdtCodeMobschemeSt")
    public void setSsdtCodeMobschemeSt(String ssdtCodeMobschemeSt) {
        this.ssdtCodeMobschemeSt = ssdtCodeMobschemeSt;
    }

    public Sobmova withSsdtCodeMobschemeSt(String ssdtCodeMobschemeSt) {
        this.ssdtCodeMobschemeSt = ssdtCodeMobschemeSt;
        return this;
    }

    @JsonProperty("ssdtCodeActtypeIdSt")
    public String getSsdtCodeActtypeIdSt() {
        return ssdtCodeActtypeIdSt;
    }

    @JsonProperty("ssdtCodeActtypeIdSt")
    public void setSsdtCodeActtypeIdSt(String ssdtCodeActtypeIdSt) {
        this.ssdtCodeActtypeIdSt = ssdtCodeActtypeIdSt;
    }

    public Sobmova withSsdtCodeActtypeIdSt(String ssdtCodeActtypeIdSt) {
        this.ssdtCodeActtypeIdSt = ssdtCodeActtypeIdSt;
        return this;
    }

    @JsonProperty("ssdtCodeHostidtypSt")
    public String getSsdtCodeHostidtypSt() {
        return ssdtCodeHostidtypSt;
    }

    @JsonProperty("ssdtCodeHostidtypSt")
    public void setSsdtCodeHostidtypSt(String ssdtCodeHostidtypSt) {
        this.ssdtCodeHostidtypSt = ssdtCodeHostidtypSt;
    }

    public Sobmova withSsdtCodeHostidtypSt(String ssdtCodeHostidtypSt) {
        this.ssdtCodeHostidtypSt = ssdtCodeHostidtypSt;
        return this;
    }

    /**
     * Lineage reference object : SOBMOVA_SSDT_CODE_COUNTRY, Lookup lineage reference object : skvssdt,skvssdt
     * (Required)
     * 
     */
    @JsonProperty("ssdtCodeCountry")
    public String getSsdtCodeCountry() {
        return ssdtCodeCountry;
    }

    /**
     * Lineage reference object : SOBMOVA_SSDT_CODE_COUNTRY, Lookup lineage reference object : skvssdt,skvssdt
     * (Required)
     * 
     */
    @JsonProperty("ssdtCodeCountry")
    public void setSsdtCodeCountry(String ssdtCodeCountry) {
        this.ssdtCodeCountry = ssdtCodeCountry;
    }

    public Sobmova withSsdtCodeCountry(String ssdtCodeCountry) {
        this.ssdtCodeCountry = ssdtCodeCountry;
        return this;
    }

    /**
     * Lineage reference object : SOBMOVA_USER_ID
     * 
     */
    @JsonProperty("userId")
    public String getUserId() {
        return userId;
    }

    /**
     * Lineage reference object : SOBMOVA_USER_ID
     * 
     */
    @JsonProperty("userId")
    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Sobmova withUserId(String userId) {
        this.userId = userId;
        return this;
    }

    @JsonProperty("ssdtCodeActdurtypSt")
    public String getSsdtCodeActdurtypSt() {
        return ssdtCodeActdurtypSt;
    }

    @JsonProperty("ssdtCodeActdurtypSt")
    public void setSsdtCodeActdurtypSt(String ssdtCodeActdurtypSt) {
        this.ssdtCodeActdurtypSt = ssdtCodeActdurtypSt;
    }

    public Sobmova withSsdtCodeActdurtypSt(String ssdtCodeActdurtypSt) {
        this.ssdtCodeActdurtypSt = ssdtCodeActdurtypSt;
        return this;
    }

    /**
     * Lineage reference object : SOBMOVA_SSDT_CODE_MOBSCHEME, Lookup lineage reference object : skvssdt,skvssdt
     * (Required)
     * 
     */
    @JsonProperty("ssdtCodeMobscheme")
    public String getSsdtCodeMobscheme() {
        return ssdtCodeMobscheme;
    }

    /**
     * Lineage reference object : SOBMOVA_SSDT_CODE_MOBSCHEME, Lookup lineage reference object : skvssdt,skvssdt
     * (Required)
     * 
     */
    @JsonProperty("ssdtCodeMobscheme")
    public void setSsdtCodeMobscheme(String ssdtCodeMobscheme) {
        this.ssdtCodeMobscheme = ssdtCodeMobscheme;
    }

    public Sobmova withSsdtCodeMobscheme(String ssdtCodeMobscheme) {
        this.ssdtCodeMobscheme = ssdtCodeMobscheme;
        return this;
    }

    /**
     * Lineage reference object : SOBMOVA_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public Date getActivityDate() {
        return activityDate;
    }

    /**
     * Lineage reference object : SOBMOVA_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public void setActivityDate(Date activityDate) {
        this.activityDate = activityDate;
    }

    public Sobmova withActivityDate(Date activityDate) {
        this.activityDate = activityDate;
        return this;
    }

    /**
     * Lineage reference object : SOBMOVA_PIDM
     * 
     */
    @JsonProperty("pidm")
    public Double getPidm() {
        return pidm;
    }

    /**
     * Lineage reference object : SOBMOVA_PIDM
     * 
     */
    @JsonProperty("pidm")
    public void setPidm(Double pidm) {
        this.pidm = pidm;
    }

    public Sobmova withPidm(Double pidm) {
        this.pidm = pidm;
        return this;
    }

    /**
     * Lineage reference object : SOBMOVA_NUMHUS
     * 
     */
    @JsonProperty("numhus")
    public String getNumhus() {
        return numhus;
    }

    /**
     * Lineage reference object : SOBMOVA_NUMHUS
     * 
     */
    @JsonProperty("numhus")
    public void setNumhus(String numhus) {
        this.numhus = numhus;
    }

    public Sobmova withNumhus(String numhus) {
        this.numhus = numhus;
        return this;
    }

    /**
     * Lineage reference object : SOBMOVA_MODULE_INSTANCE_ID
     * 
     */
    @JsonProperty("moduleInstanceId")
    public String getModuleInstanceId() {
        return moduleInstanceId;
    }

    /**
     * Lineage reference object : SOBMOVA_MODULE_INSTANCE_ID
     * 
     */
    @JsonProperty("moduleInstanceId")
    public void setModuleInstanceId(String moduleInstanceId) {
        this.moduleInstanceId = moduleInstanceId;
    }

    public Sobmova withModuleInstanceId(String moduleInstanceId) {
        this.moduleInstanceId = moduleInstanceId;
        return this;
    }

    @JsonProperty("ssdtCodeHostIdSt")
    public String getSsdtCodeHostIdSt() {
        return ssdtCodeHostIdSt;
    }

    @JsonProperty("ssdtCodeHostIdSt")
    public void setSsdtCodeHostIdSt(String ssdtCodeHostIdSt) {
        this.ssdtCodeHostIdSt = ssdtCodeHostIdSt;
    }

    public Sobmova withSsdtCodeHostIdSt(String ssdtCodeHostIdSt) {
        this.ssdtCodeHostIdSt = ssdtCodeHostIdSt;
        return this;
    }

    /**
     * Lineage reference object : SOBMOVA_START_DATE
     * 
     */
    @JsonProperty("startDate")
    public Date getStartDate() {
        return startDate;
    }

    /**
     * Lineage reference object : SOBMOVA_START_DATE
     * 
     */
    @JsonProperty("startDate")
    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Sobmova withStartDate(Date startDate) {
        this.startDate = startDate;
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

    public Sobmova withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Sobmova.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("stuCourseSessionId");
        sb.append('=');
        sb.append(((this.stuCourseSessionId == null)?"<null>":this.stuCourseSessionId));
        sb.append(',');
        sb.append("ssdtCodeHostId");
        sb.append('=');
        sb.append(((this.ssdtCodeHostId == null)?"<null>":this.ssdtCodeHostId));
        sb.append(',');
        sb.append("offVenuActivityId");
        sb.append('=');
        sb.append(((this.offVenuActivityId == null)?"<null>":this.offVenuActivityId));
        sb.append(',');
        sb.append("ssdtCodeActdurtyp");
        sb.append('=');
        sb.append(((this.ssdtCodeActdurtyp == null)?"<null>":this.ssdtCodeActdurtyp));
        sb.append(',');
        sb.append("endDate");
        sb.append('=');
        sb.append(((this.endDate == null)?"<null>":this.endDate));
        sb.append(',');
        sb.append("ssdtCodeCountrySt");
        sb.append('=');
        sb.append(((this.ssdtCodeCountrySt == null)?"<null>":this.ssdtCodeCountrySt));
        sb.append(',');
        sb.append("ssdtCodeActtypeId");
        sb.append('=');
        sb.append(((this.ssdtCodeActtypeId == null)?"<null>":this.ssdtCodeActtypeId));
        sb.append(',');
        sb.append("activityDuration");
        sb.append('=');
        sb.append(((this.activityDuration == null)?"<null>":this.activityDuration));
        sb.append(',');
        sb.append("ssdtCodeHostidtyp");
        sb.append('=');
        sb.append(((this.ssdtCodeHostidtyp == null)?"<null>":this.ssdtCodeHostidtyp));
        sb.append(',');
        sb.append("ssdtCodeMobschemeSt");
        sb.append('=');
        sb.append(((this.ssdtCodeMobschemeSt == null)?"<null>":this.ssdtCodeMobschemeSt));
        sb.append(',');
        sb.append("ssdtCodeActtypeIdSt");
        sb.append('=');
        sb.append(((this.ssdtCodeActtypeIdSt == null)?"<null>":this.ssdtCodeActtypeIdSt));
        sb.append(',');
        sb.append("ssdtCodeHostidtypSt");
        sb.append('=');
        sb.append(((this.ssdtCodeHostidtypSt == null)?"<null>":this.ssdtCodeHostidtypSt));
        sb.append(',');
        sb.append("ssdtCodeCountry");
        sb.append('=');
        sb.append(((this.ssdtCodeCountry == null)?"<null>":this.ssdtCodeCountry));
        sb.append(',');
        sb.append("userId");
        sb.append('=');
        sb.append(((this.userId == null)?"<null>":this.userId));
        sb.append(',');
        sb.append("ssdtCodeActdurtypSt");
        sb.append('=');
        sb.append(((this.ssdtCodeActdurtypSt == null)?"<null>":this.ssdtCodeActdurtypSt));
        sb.append(',');
        sb.append("ssdtCodeMobscheme");
        sb.append('=');
        sb.append(((this.ssdtCodeMobscheme == null)?"<null>":this.ssdtCodeMobscheme));
        sb.append(',');
        sb.append("activityDate");
        sb.append('=');
        sb.append(((this.activityDate == null)?"<null>":this.activityDate));
        sb.append(',');
        sb.append("pidm");
        sb.append('=');
        sb.append(((this.pidm == null)?"<null>":this.pidm));
        sb.append(',');
        sb.append("numhus");
        sb.append('=');
        sb.append(((this.numhus == null)?"<null>":this.numhus));
        sb.append(',');
        sb.append("moduleInstanceId");
        sb.append('=');
        sb.append(((this.moduleInstanceId == null)?"<null>":this.moduleInstanceId));
        sb.append(',');
        sb.append("ssdtCodeHostIdSt");
        sb.append('=');
        sb.append(((this.ssdtCodeHostIdSt == null)?"<null>":this.ssdtCodeHostIdSt));
        sb.append(',');
        sb.append("startDate");
        sb.append('=');
        sb.append(((this.startDate == null)?"<null>":this.startDate));
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
        result = ((result* 31)+((this.ssdtCodeHostId == null)? 0 :this.ssdtCodeHostId.hashCode()));
        result = ((result* 31)+((this.offVenuActivityId == null)? 0 :this.offVenuActivityId.hashCode()));
        result = ((result* 31)+((this.ssdtCodeActdurtyp == null)? 0 :this.ssdtCodeActdurtyp.hashCode()));
        result = ((result* 31)+((this.endDate == null)? 0 :this.endDate.hashCode()));
        result = ((result* 31)+((this.ssdtCodeCountrySt == null)? 0 :this.ssdtCodeCountrySt.hashCode()));
        result = ((result* 31)+((this.ssdtCodeActtypeId == null)? 0 :this.ssdtCodeActtypeId.hashCode()));
        result = ((result* 31)+((this.activityDuration == null)? 0 :this.activityDuration.hashCode()));
        result = ((result* 31)+((this.ssdtCodeHostidtyp == null)? 0 :this.ssdtCodeHostidtyp.hashCode()));
        result = ((result* 31)+((this.ssdtCodeMobschemeSt == null)? 0 :this.ssdtCodeMobschemeSt.hashCode()));
        result = ((result* 31)+((this.ssdtCodeActtypeIdSt == null)? 0 :this.ssdtCodeActtypeIdSt.hashCode()));
        result = ((result* 31)+((this.ssdtCodeHostidtypSt == null)? 0 :this.ssdtCodeHostidtypSt.hashCode()));
        result = ((result* 31)+((this.ssdtCodeCountry == null)? 0 :this.ssdtCodeCountry.hashCode()));
        result = ((result* 31)+((this.userId == null)? 0 :this.userId.hashCode()));
        result = ((result* 31)+((this.ssdtCodeActdurtypSt == null)? 0 :this.ssdtCodeActdurtypSt.hashCode()));
        result = ((result* 31)+((this.ssdtCodeMobscheme == null)? 0 :this.ssdtCodeMobscheme.hashCode()));
        result = ((result* 31)+((this.activityDate == null)? 0 :this.activityDate.hashCode()));
        result = ((result* 31)+((this.pidm == null)? 0 :this.pidm.hashCode()));
        result = ((result* 31)+((this.numhus == null)? 0 :this.numhus.hashCode()));
        result = ((result* 31)+((this.moduleInstanceId == null)? 0 :this.moduleInstanceId.hashCode()));
        result = ((result* 31)+((this.ssdtCodeHostIdSt == null)? 0 :this.ssdtCodeHostIdSt.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.startDate == null)? 0 :this.startDate.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Sobmova) == false) {
            return false;
        }
        Sobmova rhs = ((Sobmova) other);
        return ((((((((((((((((((((((((this.stuCourseSessionId == rhs.stuCourseSessionId)||((this.stuCourseSessionId!= null)&&this.stuCourseSessionId.equals(rhs.stuCourseSessionId)))&&((this.ssdtCodeHostId == rhs.ssdtCodeHostId)||((this.ssdtCodeHostId!= null)&&this.ssdtCodeHostId.equals(rhs.ssdtCodeHostId))))&&((this.offVenuActivityId == rhs.offVenuActivityId)||((this.offVenuActivityId!= null)&&this.offVenuActivityId.equals(rhs.offVenuActivityId))))&&((this.ssdtCodeActdurtyp == rhs.ssdtCodeActdurtyp)||((this.ssdtCodeActdurtyp!= null)&&this.ssdtCodeActdurtyp.equals(rhs.ssdtCodeActdurtyp))))&&((this.endDate == rhs.endDate)||((this.endDate!= null)&&this.endDate.equals(rhs.endDate))))&&((this.ssdtCodeCountrySt == rhs.ssdtCodeCountrySt)||((this.ssdtCodeCountrySt!= null)&&this.ssdtCodeCountrySt.equals(rhs.ssdtCodeCountrySt))))&&((this.ssdtCodeActtypeId == rhs.ssdtCodeActtypeId)||((this.ssdtCodeActtypeId!= null)&&this.ssdtCodeActtypeId.equals(rhs.ssdtCodeActtypeId))))&&((this.activityDuration == rhs.activityDuration)||((this.activityDuration!= null)&&this.activityDuration.equals(rhs.activityDuration))))&&((this.ssdtCodeHostidtyp == rhs.ssdtCodeHostidtyp)||((this.ssdtCodeHostidtyp!= null)&&this.ssdtCodeHostidtyp.equals(rhs.ssdtCodeHostidtyp))))&&((this.ssdtCodeMobschemeSt == rhs.ssdtCodeMobschemeSt)||((this.ssdtCodeMobschemeSt!= null)&&this.ssdtCodeMobschemeSt.equals(rhs.ssdtCodeMobschemeSt))))&&((this.ssdtCodeActtypeIdSt == rhs.ssdtCodeActtypeIdSt)||((this.ssdtCodeActtypeIdSt!= null)&&this.ssdtCodeActtypeIdSt.equals(rhs.ssdtCodeActtypeIdSt))))&&((this.ssdtCodeHostidtypSt == rhs.ssdtCodeHostidtypSt)||((this.ssdtCodeHostidtypSt!= null)&&this.ssdtCodeHostidtypSt.equals(rhs.ssdtCodeHostidtypSt))))&&((this.ssdtCodeCountry == rhs.ssdtCodeCountry)||((this.ssdtCodeCountry!= null)&&this.ssdtCodeCountry.equals(rhs.ssdtCodeCountry))))&&((this.userId == rhs.userId)||((this.userId!= null)&&this.userId.equals(rhs.userId))))&&((this.ssdtCodeActdurtypSt == rhs.ssdtCodeActdurtypSt)||((this.ssdtCodeActdurtypSt!= null)&&this.ssdtCodeActdurtypSt.equals(rhs.ssdtCodeActdurtypSt))))&&((this.ssdtCodeMobscheme == rhs.ssdtCodeMobscheme)||((this.ssdtCodeMobscheme!= null)&&this.ssdtCodeMobscheme.equals(rhs.ssdtCodeMobscheme))))&&((this.activityDate == rhs.activityDate)||((this.activityDate!= null)&&this.activityDate.equals(rhs.activityDate))))&&((this.pidm == rhs.pidm)||((this.pidm!= null)&&this.pidm.equals(rhs.pidm))))&&((this.numhus == rhs.numhus)||((this.numhus!= null)&&this.numhus.equals(rhs.numhus))))&&((this.moduleInstanceId == rhs.moduleInstanceId)||((this.moduleInstanceId!= null)&&this.moduleInstanceId.equals(rhs.moduleInstanceId))))&&((this.ssdtCodeHostIdSt == rhs.ssdtCodeHostIdSt)||((this.ssdtCodeHostIdSt!= null)&&this.ssdtCodeHostIdSt.equals(rhs.ssdtCodeHostIdSt))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.startDate == rhs.startDate)||((this.startDate!= null)&&this.startDate.equals(rhs.startDate))));
    }

}
