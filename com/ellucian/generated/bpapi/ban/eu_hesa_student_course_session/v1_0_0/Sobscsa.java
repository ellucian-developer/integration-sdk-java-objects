
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
    "allocationProportion",
    "stuCourseSessionId",
    "activityDate",
    "ssdtCodeAssesmntunitSt",
    "ssdtCodeHesaIdSt",
    "pidm",
    "ssdtCodeHesaId",
    "numhus",
    "allocationId",
    "ssdtCodeAssesmntunit",
    "userId"
})
@Generated("jsonschema2pojo")
public class Sobscsa {

    /**
     * Supervisor Allocation Proportion
     * <p>
     * Lineage reference object : SOBSCSA_ALLOCATION_PROPORTION
     * 
     */
    @JsonProperty("allocationProportion")
    @JsonPropertyDescription("Lineage reference object : SOBSCSA_ALLOCATION_PROPORTION")
    private Double allocationProportion;
    /**
     * Lineage reference object : SOBSCSA_STU_COURSE_SESSION_ID
     * 
     */
    @JsonProperty("stuCourseSessionId")
    @JsonPropertyDescription("Lineage reference object : SOBSCSA_STU_COURSE_SESSION_ID")
    private String stuCourseSessionId;
    /**
     * Lineage reference object : SOBSCSA_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    @JsonPropertyDescription("Lineage reference object : SOBSCSA_ACTIVITY_DATE")
    private Date activityDate;
    /**
     * REF2021 Unit of Assessment Description
     * <p>
     * 
     * 
     */
    @JsonProperty("ssdtCodeAssesmntunitSt")
    private String ssdtCodeAssesmntunitSt;
    /**
     * HESA Identifier Description
     * <p>
     * 
     * 
     */
    @JsonProperty("ssdtCodeHesaIdSt")
    private String ssdtCodeHesaIdSt;
    /**
     * Lineage reference object : SOBSCSA_PIDM
     * 
     */
    @JsonProperty("pidm")
    @JsonPropertyDescription("Lineage reference object : SOBSCSA_PIDM")
    private Double pidm;
    /**
     * HESA Identifier
     * <p>
     * Lineage reference object : SOBSCSA_SSDT_CODE_HESA_ID, Lookup lineage reference object : skvssdt,skvssdt
     * 
     */
    @JsonProperty("ssdtCodeHesaId")
    @JsonPropertyDescription("Lineage reference object : SOBSCSA_SSDT_CODE_HESA_ID, Lookup lineage reference object : skvssdt,skvssdt")
    private String ssdtCodeHesaId;
    /**
     * Lineage reference object : SOBSCSA_NUMHUS
     * 
     */
    @JsonProperty("numhus")
    @JsonPropertyDescription("Lineage reference object : SOBSCSA_NUMHUS")
    private String numhus;
    /**
     * Supervisor Allocation Identifier
     * <p>
     * Lineage reference object : SOBSCSA_ALLOCATION_ID
     * (Required)
     * 
     */
    @JsonProperty("allocationId")
    @JsonPropertyDescription("Lineage reference object : SOBSCSA_ALLOCATION_ID")
    private String allocationId;
    /**
     * REF2021 Unit of Assessment
     * <p>
     * Lineage reference object : SOBSCSA_SSDT_CODE_ASSESMNTUNIT, Lookup lineage reference object : skvssdt,skvssdt
     * 
     */
    @JsonProperty("ssdtCodeAssesmntunit")
    @JsonPropertyDescription("Lineage reference object : SOBSCSA_SSDT_CODE_ASSESMNTUNIT, Lookup lineage reference object : skvssdt,skvssdt")
    private String ssdtCodeAssesmntunit;
    /**
     * Lineage reference object : SOBSCSA_USER_ID
     * 
     */
    @JsonProperty("userId")
    @JsonPropertyDescription("Lineage reference object : SOBSCSA_USER_ID")
    private String userId;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Supervisor Allocation Proportion
     * <p>
     * Lineage reference object : SOBSCSA_ALLOCATION_PROPORTION
     * 
     */
    @JsonProperty("allocationProportion")
    public Double getAllocationProportion() {
        return allocationProportion;
    }

    /**
     * Supervisor Allocation Proportion
     * <p>
     * Lineage reference object : SOBSCSA_ALLOCATION_PROPORTION
     * 
     */
    @JsonProperty("allocationProportion")
    public void setAllocationProportion(Double allocationProportion) {
        this.allocationProportion = allocationProportion;
    }

    public Sobscsa withAllocationProportion(Double allocationProportion) {
        this.allocationProportion = allocationProportion;
        return this;
    }

    /**
     * Lineage reference object : SOBSCSA_STU_COURSE_SESSION_ID
     * 
     */
    @JsonProperty("stuCourseSessionId")
    public String getStuCourseSessionId() {
        return stuCourseSessionId;
    }

    /**
     * Lineage reference object : SOBSCSA_STU_COURSE_SESSION_ID
     * 
     */
    @JsonProperty("stuCourseSessionId")
    public void setStuCourseSessionId(String stuCourseSessionId) {
        this.stuCourseSessionId = stuCourseSessionId;
    }

    public Sobscsa withStuCourseSessionId(String stuCourseSessionId) {
        this.stuCourseSessionId = stuCourseSessionId;
        return this;
    }

    /**
     * Lineage reference object : SOBSCSA_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public Date getActivityDate() {
        return activityDate;
    }

    /**
     * Lineage reference object : SOBSCSA_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public void setActivityDate(Date activityDate) {
        this.activityDate = activityDate;
    }

    public Sobscsa withActivityDate(Date activityDate) {
        this.activityDate = activityDate;
        return this;
    }

    /**
     * REF2021 Unit of Assessment Description
     * <p>
     * 
     * 
     */
    @JsonProperty("ssdtCodeAssesmntunitSt")
    public String getSsdtCodeAssesmntunitSt() {
        return ssdtCodeAssesmntunitSt;
    }

    /**
     * REF2021 Unit of Assessment Description
     * <p>
     * 
     * 
     */
    @JsonProperty("ssdtCodeAssesmntunitSt")
    public void setSsdtCodeAssesmntunitSt(String ssdtCodeAssesmntunitSt) {
        this.ssdtCodeAssesmntunitSt = ssdtCodeAssesmntunitSt;
    }

    public Sobscsa withSsdtCodeAssesmntunitSt(String ssdtCodeAssesmntunitSt) {
        this.ssdtCodeAssesmntunitSt = ssdtCodeAssesmntunitSt;
        return this;
    }

    /**
     * HESA Identifier Description
     * <p>
     * 
     * 
     */
    @JsonProperty("ssdtCodeHesaIdSt")
    public String getSsdtCodeHesaIdSt() {
        return ssdtCodeHesaIdSt;
    }

    /**
     * HESA Identifier Description
     * <p>
     * 
     * 
     */
    @JsonProperty("ssdtCodeHesaIdSt")
    public void setSsdtCodeHesaIdSt(String ssdtCodeHesaIdSt) {
        this.ssdtCodeHesaIdSt = ssdtCodeHesaIdSt;
    }

    public Sobscsa withSsdtCodeHesaIdSt(String ssdtCodeHesaIdSt) {
        this.ssdtCodeHesaIdSt = ssdtCodeHesaIdSt;
        return this;
    }

    /**
     * Lineage reference object : SOBSCSA_PIDM
     * 
     */
    @JsonProperty("pidm")
    public Double getPidm() {
        return pidm;
    }

    /**
     * Lineage reference object : SOBSCSA_PIDM
     * 
     */
    @JsonProperty("pidm")
    public void setPidm(Double pidm) {
        this.pidm = pidm;
    }

    public Sobscsa withPidm(Double pidm) {
        this.pidm = pidm;
        return this;
    }

    /**
     * HESA Identifier
     * <p>
     * Lineage reference object : SOBSCSA_SSDT_CODE_HESA_ID, Lookup lineage reference object : skvssdt,skvssdt
     * 
     */
    @JsonProperty("ssdtCodeHesaId")
    public String getSsdtCodeHesaId() {
        return ssdtCodeHesaId;
    }

    /**
     * HESA Identifier
     * <p>
     * Lineage reference object : SOBSCSA_SSDT_CODE_HESA_ID, Lookup lineage reference object : skvssdt,skvssdt
     * 
     */
    @JsonProperty("ssdtCodeHesaId")
    public void setSsdtCodeHesaId(String ssdtCodeHesaId) {
        this.ssdtCodeHesaId = ssdtCodeHesaId;
    }

    public Sobscsa withSsdtCodeHesaId(String ssdtCodeHesaId) {
        this.ssdtCodeHesaId = ssdtCodeHesaId;
        return this;
    }

    /**
     * Lineage reference object : SOBSCSA_NUMHUS
     * 
     */
    @JsonProperty("numhus")
    public String getNumhus() {
        return numhus;
    }

    /**
     * Lineage reference object : SOBSCSA_NUMHUS
     * 
     */
    @JsonProperty("numhus")
    public void setNumhus(String numhus) {
        this.numhus = numhus;
    }

    public Sobscsa withNumhus(String numhus) {
        this.numhus = numhus;
        return this;
    }

    /**
     * Supervisor Allocation Identifier
     * <p>
     * Lineage reference object : SOBSCSA_ALLOCATION_ID
     * (Required)
     * 
     */
    @JsonProperty("allocationId")
    public String getAllocationId() {
        return allocationId;
    }

    /**
     * Supervisor Allocation Identifier
     * <p>
     * Lineage reference object : SOBSCSA_ALLOCATION_ID
     * (Required)
     * 
     */
    @JsonProperty("allocationId")
    public void setAllocationId(String allocationId) {
        this.allocationId = allocationId;
    }

    public Sobscsa withAllocationId(String allocationId) {
        this.allocationId = allocationId;
        return this;
    }

    /**
     * REF2021 Unit of Assessment
     * <p>
     * Lineage reference object : SOBSCSA_SSDT_CODE_ASSESMNTUNIT, Lookup lineage reference object : skvssdt,skvssdt
     * 
     */
    @JsonProperty("ssdtCodeAssesmntunit")
    public String getSsdtCodeAssesmntunit() {
        return ssdtCodeAssesmntunit;
    }

    /**
     * REF2021 Unit of Assessment
     * <p>
     * Lineage reference object : SOBSCSA_SSDT_CODE_ASSESMNTUNIT, Lookup lineage reference object : skvssdt,skvssdt
     * 
     */
    @JsonProperty("ssdtCodeAssesmntunit")
    public void setSsdtCodeAssesmntunit(String ssdtCodeAssesmntunit) {
        this.ssdtCodeAssesmntunit = ssdtCodeAssesmntunit;
    }

    public Sobscsa withSsdtCodeAssesmntunit(String ssdtCodeAssesmntunit) {
        this.ssdtCodeAssesmntunit = ssdtCodeAssesmntunit;
        return this;
    }

    /**
     * Lineage reference object : SOBSCSA_USER_ID
     * 
     */
    @JsonProperty("userId")
    public String getUserId() {
        return userId;
    }

    /**
     * Lineage reference object : SOBSCSA_USER_ID
     * 
     */
    @JsonProperty("userId")
    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Sobscsa withUserId(String userId) {
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

    public Sobscsa withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Sobscsa.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("allocationProportion");
        sb.append('=');
        sb.append(((this.allocationProportion == null)?"<null>":this.allocationProportion));
        sb.append(',');
        sb.append("stuCourseSessionId");
        sb.append('=');
        sb.append(((this.stuCourseSessionId == null)?"<null>":this.stuCourseSessionId));
        sb.append(',');
        sb.append("activityDate");
        sb.append('=');
        sb.append(((this.activityDate == null)?"<null>":this.activityDate));
        sb.append(',');
        sb.append("ssdtCodeAssesmntunitSt");
        sb.append('=');
        sb.append(((this.ssdtCodeAssesmntunitSt == null)?"<null>":this.ssdtCodeAssesmntunitSt));
        sb.append(',');
        sb.append("ssdtCodeHesaIdSt");
        sb.append('=');
        sb.append(((this.ssdtCodeHesaIdSt == null)?"<null>":this.ssdtCodeHesaIdSt));
        sb.append(',');
        sb.append("pidm");
        sb.append('=');
        sb.append(((this.pidm == null)?"<null>":this.pidm));
        sb.append(',');
        sb.append("ssdtCodeHesaId");
        sb.append('=');
        sb.append(((this.ssdtCodeHesaId == null)?"<null>":this.ssdtCodeHesaId));
        sb.append(',');
        sb.append("numhus");
        sb.append('=');
        sb.append(((this.numhus == null)?"<null>":this.numhus));
        sb.append(',');
        sb.append("allocationId");
        sb.append('=');
        sb.append(((this.allocationId == null)?"<null>":this.allocationId));
        sb.append(',');
        sb.append("ssdtCodeAssesmntunit");
        sb.append('=');
        sb.append(((this.ssdtCodeAssesmntunit == null)?"<null>":this.ssdtCodeAssesmntunit));
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
        result = ((result* 31)+((this.ssdtCodeAssesmntunitSt == null)? 0 :this.ssdtCodeAssesmntunitSt.hashCode()));
        result = ((result* 31)+((this.allocationId == null)? 0 :this.allocationId.hashCode()));
        result = ((result* 31)+((this.ssdtCodeAssesmntunit == null)? 0 :this.ssdtCodeAssesmntunit.hashCode()));
        result = ((result* 31)+((this.userId == null)? 0 :this.userId.hashCode()));
        result = ((result* 31)+((this.allocationProportion == null)? 0 :this.allocationProportion.hashCode()));
        result = ((result* 31)+((this.activityDate == null)? 0 :this.activityDate.hashCode()));
        result = ((result* 31)+((this.ssdtCodeHesaIdSt == null)? 0 :this.ssdtCodeHesaIdSt.hashCode()));
        result = ((result* 31)+((this.pidm == null)? 0 :this.pidm.hashCode()));
        result = ((result* 31)+((this.ssdtCodeHesaId == null)? 0 :this.ssdtCodeHesaId.hashCode()));
        result = ((result* 31)+((this.numhus == null)? 0 :this.numhus.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Sobscsa) == false) {
            return false;
        }
        Sobscsa rhs = ((Sobscsa) other);
        return (((((((((((((this.stuCourseSessionId == rhs.stuCourseSessionId)||((this.stuCourseSessionId!= null)&&this.stuCourseSessionId.equals(rhs.stuCourseSessionId)))&&((this.ssdtCodeAssesmntunitSt == rhs.ssdtCodeAssesmntunitSt)||((this.ssdtCodeAssesmntunitSt!= null)&&this.ssdtCodeAssesmntunitSt.equals(rhs.ssdtCodeAssesmntunitSt))))&&((this.allocationId == rhs.allocationId)||((this.allocationId!= null)&&this.allocationId.equals(rhs.allocationId))))&&((this.ssdtCodeAssesmntunit == rhs.ssdtCodeAssesmntunit)||((this.ssdtCodeAssesmntunit!= null)&&this.ssdtCodeAssesmntunit.equals(rhs.ssdtCodeAssesmntunit))))&&((this.userId == rhs.userId)||((this.userId!= null)&&this.userId.equals(rhs.userId))))&&((this.allocationProportion == rhs.allocationProportion)||((this.allocationProportion!= null)&&this.allocationProportion.equals(rhs.allocationProportion))))&&((this.activityDate == rhs.activityDate)||((this.activityDate!= null)&&this.activityDate.equals(rhs.activityDate))))&&((this.ssdtCodeHesaIdSt == rhs.ssdtCodeHesaIdSt)||((this.ssdtCodeHesaIdSt!= null)&&this.ssdtCodeHesaIdSt.equals(rhs.ssdtCodeHesaIdSt))))&&((this.pidm == rhs.pidm)||((this.pidm!= null)&&this.pidm.equals(rhs.pidm))))&&((this.ssdtCodeHesaId == rhs.ssdtCodeHesaId)||((this.ssdtCodeHesaId!= null)&&this.ssdtCodeHesaId.equals(rhs.ssdtCodeHesaId))))&&((this.numhus == rhs.numhus)||((this.numhus!= null)&&this.numhus.equals(rhs.numhus))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
    }

}
