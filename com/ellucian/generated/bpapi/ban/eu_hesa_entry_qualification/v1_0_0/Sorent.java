
package com.ellucian.generated.bpapi.ban.eu_hesa_entry_qualification.v1_0_0;

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
    "activityDate",
    "pidm",
    "numhus",
    "ssdtCodeSubjectIdSt",
    "ssdtCodeSubjectId",
    "userId"
})
@Generated("jsonschema2pojo")
public class Sorent {

    /**
     * Lineage reference object : SORENTS_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    @JsonPropertyDescription("Lineage reference object : SORENTS_ACTIVITY_DATE")
    private Date activityDate;
    /**
     * Lineage reference object : SORENTS_PIDM
     * 
     */
    @JsonProperty("pidm")
    @JsonPropertyDescription("Lineage reference object : SORENTS_PIDM")
    private Double pidm;
    /**
     * Lineage reference object : SORENTS_NUMHUS
     * 
     */
    @JsonProperty("numhus")
    @JsonPropertyDescription("Lineage reference object : SORENTS_NUMHUS")
    private String numhus;
    /**
     * Subject Identifier Description
     * <p>
     * 
     * 
     */
    @JsonProperty("ssdtCodeSubjectIdSt")
    private String ssdtCodeSubjectIdSt;
    /**
     * Subject Identifier
     * <p>
     * Lineage reference object : SORENTS_SSDT_CODE_SUBJECT_ID, Lookup lineage reference object : skvssdt,skvssdt
     * 
     */
    @JsonProperty("ssdtCodeSubjectId")
    @JsonPropertyDescription("Lineage reference object : SORENTS_SSDT_CODE_SUBJECT_ID, Lookup lineage reference object : skvssdt,skvssdt")
    private String ssdtCodeSubjectId;
    /**
     * Lineage reference object : SORENTS_USER_ID
     * 
     */
    @JsonProperty("userId")
    @JsonPropertyDescription("Lineage reference object : SORENTS_USER_ID")
    private String userId;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Lineage reference object : SORENTS_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public Date getActivityDate() {
        return activityDate;
    }

    /**
     * Lineage reference object : SORENTS_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public void setActivityDate(Date activityDate) {
        this.activityDate = activityDate;
    }

    public Sorent withActivityDate(Date activityDate) {
        this.activityDate = activityDate;
        return this;
    }

    /**
     * Lineage reference object : SORENTS_PIDM
     * 
     */
    @JsonProperty("pidm")
    public Double getPidm() {
        return pidm;
    }

    /**
     * Lineage reference object : SORENTS_PIDM
     * 
     */
    @JsonProperty("pidm")
    public void setPidm(Double pidm) {
        this.pidm = pidm;
    }

    public Sorent withPidm(Double pidm) {
        this.pidm = pidm;
        return this;
    }

    /**
     * Lineage reference object : SORENTS_NUMHUS
     * 
     */
    @JsonProperty("numhus")
    public String getNumhus() {
        return numhus;
    }

    /**
     * Lineage reference object : SORENTS_NUMHUS
     * 
     */
    @JsonProperty("numhus")
    public void setNumhus(String numhus) {
        this.numhus = numhus;
    }

    public Sorent withNumhus(String numhus) {
        this.numhus = numhus;
        return this;
    }

    /**
     * Subject Identifier Description
     * <p>
     * 
     * 
     */
    @JsonProperty("ssdtCodeSubjectIdSt")
    public String getSsdtCodeSubjectIdSt() {
        return ssdtCodeSubjectIdSt;
    }

    /**
     * Subject Identifier Description
     * <p>
     * 
     * 
     */
    @JsonProperty("ssdtCodeSubjectIdSt")
    public void setSsdtCodeSubjectIdSt(String ssdtCodeSubjectIdSt) {
        this.ssdtCodeSubjectIdSt = ssdtCodeSubjectIdSt;
    }

    public Sorent withSsdtCodeSubjectIdSt(String ssdtCodeSubjectIdSt) {
        this.ssdtCodeSubjectIdSt = ssdtCodeSubjectIdSt;
        return this;
    }

    /**
     * Subject Identifier
     * <p>
     * Lineage reference object : SORENTS_SSDT_CODE_SUBJECT_ID, Lookup lineage reference object : skvssdt,skvssdt
     * 
     */
    @JsonProperty("ssdtCodeSubjectId")
    public String getSsdtCodeSubjectId() {
        return ssdtCodeSubjectId;
    }

    /**
     * Subject Identifier
     * <p>
     * Lineage reference object : SORENTS_SSDT_CODE_SUBJECT_ID, Lookup lineage reference object : skvssdt,skvssdt
     * 
     */
    @JsonProperty("ssdtCodeSubjectId")
    public void setSsdtCodeSubjectId(String ssdtCodeSubjectId) {
        this.ssdtCodeSubjectId = ssdtCodeSubjectId;
    }

    public Sorent withSsdtCodeSubjectId(String ssdtCodeSubjectId) {
        this.ssdtCodeSubjectId = ssdtCodeSubjectId;
        return this;
    }

    /**
     * Lineage reference object : SORENTS_USER_ID
     * 
     */
    @JsonProperty("userId")
    public String getUserId() {
        return userId;
    }

    /**
     * Lineage reference object : SORENTS_USER_ID
     * 
     */
    @JsonProperty("userId")
    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Sorent withUserId(String userId) {
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

    public Sorent withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Sorent.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("ssdtCodeSubjectIdSt");
        sb.append('=');
        sb.append(((this.ssdtCodeSubjectIdSt == null)?"<null>":this.ssdtCodeSubjectIdSt));
        sb.append(',');
        sb.append("ssdtCodeSubjectId");
        sb.append('=');
        sb.append(((this.ssdtCodeSubjectId == null)?"<null>":this.ssdtCodeSubjectId));
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
        result = ((result* 31)+((this.activityDate == null)? 0 :this.activityDate.hashCode()));
        result = ((result* 31)+((this.pidm == null)? 0 :this.pidm.hashCode()));
        result = ((result* 31)+((this.numhus == null)? 0 :this.numhus.hashCode()));
        result = ((result* 31)+((this.ssdtCodeSubjectIdSt == null)? 0 :this.ssdtCodeSubjectIdSt.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.ssdtCodeSubjectId == null)? 0 :this.ssdtCodeSubjectId.hashCode()));
        result = ((result* 31)+((this.userId == null)? 0 :this.userId.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Sorent) == false) {
            return false;
        }
        Sorent rhs = ((Sorent) other);
        return ((((((((this.activityDate == rhs.activityDate)||((this.activityDate!= null)&&this.activityDate.equals(rhs.activityDate)))&&((this.pidm == rhs.pidm)||((this.pidm!= null)&&this.pidm.equals(rhs.pidm))))&&((this.numhus == rhs.numhus)||((this.numhus!= null)&&this.numhus.equals(rhs.numhus))))&&((this.ssdtCodeSubjectIdSt == rhs.ssdtCodeSubjectIdSt)||((this.ssdtCodeSubjectIdSt!= null)&&this.ssdtCodeSubjectIdSt.equals(rhs.ssdtCodeSubjectIdSt))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.ssdtCodeSubjectId == rhs.ssdtCodeSubjectId)||((this.ssdtCodeSubjectId!= null)&&this.ssdtCodeSubjectId.equals(rhs.ssdtCodeSubjectId))))&&((this.userId == rhs.userId)||((this.userId!= null)&&this.userId.equals(rhs.userId))));
    }

}
