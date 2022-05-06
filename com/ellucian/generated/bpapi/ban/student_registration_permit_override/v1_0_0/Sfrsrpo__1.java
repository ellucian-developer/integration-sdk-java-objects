
package com.ellucian.generated.bpapi.ban.student_registration_permit_override.v1_0_0;

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
    "crseNumb",
    "activityDate",
    "rovrDesc",
    "subjCode",
    "seqNumb",
    "rovrCode",
    "user",
    "crn"
})
@Generated("jsonschema2pojo")
public class Sfrsrpo__1 {

    /**
     * Course Number
     * <p>
     * Lineage reference object : SFRSRPO_CRSE_NUMB
     * 
     */
    @JsonProperty("crseNumb")
    @JsonPropertyDescription("Lineage reference object : SFRSRPO_CRSE_NUMB")
    private String crseNumb;
    /**
     * Activity Date
     * <p>
     * Lineage reference object : SFRSRPO_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    @JsonPropertyDescription("Lineage reference object : SFRSRPO_ACTIVITY_DATE")
    private Date activityDate;
    /**
     * Permit Description
     * <p>
     * 
     * 
     */
    @JsonProperty("rovrDesc")
    private String rovrDesc;
    /**
     * Subject
     * <p>
     * Lineage reference object : SFRSRPO_SUBJ_CODE, Lookup lineage reference object : stvsubj
     * 
     */
    @JsonProperty("subjCode")
    @JsonPropertyDescription("Lineage reference object : SFRSRPO_SUBJ_CODE, Lookup lineage reference object : stvsubj")
    private String subjCode;
    /**
     * Section
     * <p>
     * Lineage reference object : SFRSRPO_SEQ_NUMB
     * 
     */
    @JsonProperty("seqNumb")
    @JsonPropertyDescription("Lineage reference object : SFRSRPO_SEQ_NUMB")
    private String seqNumb;
    /**
     * Permit
     * <p>
     * Lineage reference object : SFRSRPO_ROVR_CODE, Lookup lineage reference object : stvrovr,sfrrovr
     * (Required)
     * 
     */
    @JsonProperty("rovrCode")
    @JsonPropertyDescription("Lineage reference object : SFRSRPO_ROVR_CODE, Lookup lineage reference object : stvrovr,sfrrovr")
    private String rovrCode;
    /**
     * User
     * <p>
     * Lineage reference object : SFRSRPO_USER
     * 
     */
    @JsonProperty("user")
    @JsonPropertyDescription("Lineage reference object : SFRSRPO_USER")
    private String user;
    /**
     * CRN
     * <p>
     * Lineage reference object : SFRSRPO_CRN
     * 
     */
    @JsonProperty("crn")
    @JsonPropertyDescription("Lineage reference object : SFRSRPO_CRN")
    private String crn;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Course Number
     * <p>
     * Lineage reference object : SFRSRPO_CRSE_NUMB
     * 
     */
    @JsonProperty("crseNumb")
    public String getCrseNumb() {
        return crseNumb;
    }

    /**
     * Course Number
     * <p>
     * Lineage reference object : SFRSRPO_CRSE_NUMB
     * 
     */
    @JsonProperty("crseNumb")
    public void setCrseNumb(String crseNumb) {
        this.crseNumb = crseNumb;
    }

    public Sfrsrpo__1 withCrseNumb(String crseNumb) {
        this.crseNumb = crseNumb;
        return this;
    }

    /**
     * Activity Date
     * <p>
     * Lineage reference object : SFRSRPO_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public Date getActivityDate() {
        return activityDate;
    }

    /**
     * Activity Date
     * <p>
     * Lineage reference object : SFRSRPO_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public void setActivityDate(Date activityDate) {
        this.activityDate = activityDate;
    }

    public Sfrsrpo__1 withActivityDate(Date activityDate) {
        this.activityDate = activityDate;
        return this;
    }

    /**
     * Permit Description
     * <p>
     * 
     * 
     */
    @JsonProperty("rovrDesc")
    public String getRovrDesc() {
        return rovrDesc;
    }

    /**
     * Permit Description
     * <p>
     * 
     * 
     */
    @JsonProperty("rovrDesc")
    public void setRovrDesc(String rovrDesc) {
        this.rovrDesc = rovrDesc;
    }

    public Sfrsrpo__1 withRovrDesc(String rovrDesc) {
        this.rovrDesc = rovrDesc;
        return this;
    }

    /**
     * Subject
     * <p>
     * Lineage reference object : SFRSRPO_SUBJ_CODE, Lookup lineage reference object : stvsubj
     * 
     */
    @JsonProperty("subjCode")
    public String getSubjCode() {
        return subjCode;
    }

    /**
     * Subject
     * <p>
     * Lineage reference object : SFRSRPO_SUBJ_CODE, Lookup lineage reference object : stvsubj
     * 
     */
    @JsonProperty("subjCode")
    public void setSubjCode(String subjCode) {
        this.subjCode = subjCode;
    }

    public Sfrsrpo__1 withSubjCode(String subjCode) {
        this.subjCode = subjCode;
        return this;
    }

    /**
     * Section
     * <p>
     * Lineage reference object : SFRSRPO_SEQ_NUMB
     * 
     */
    @JsonProperty("seqNumb")
    public String getSeqNumb() {
        return seqNumb;
    }

    /**
     * Section
     * <p>
     * Lineage reference object : SFRSRPO_SEQ_NUMB
     * 
     */
    @JsonProperty("seqNumb")
    public void setSeqNumb(String seqNumb) {
        this.seqNumb = seqNumb;
    }

    public Sfrsrpo__1 withSeqNumb(String seqNumb) {
        this.seqNumb = seqNumb;
        return this;
    }

    /**
     * Permit
     * <p>
     * Lineage reference object : SFRSRPO_ROVR_CODE, Lookup lineage reference object : stvrovr,sfrrovr
     * (Required)
     * 
     */
    @JsonProperty("rovrCode")
    public String getRovrCode() {
        return rovrCode;
    }

    /**
     * Permit
     * <p>
     * Lineage reference object : SFRSRPO_ROVR_CODE, Lookup lineage reference object : stvrovr,sfrrovr
     * (Required)
     * 
     */
    @JsonProperty("rovrCode")
    public void setRovrCode(String rovrCode) {
        this.rovrCode = rovrCode;
    }

    public Sfrsrpo__1 withRovrCode(String rovrCode) {
        this.rovrCode = rovrCode;
        return this;
    }

    /**
     * User
     * <p>
     * Lineage reference object : SFRSRPO_USER
     * 
     */
    @JsonProperty("user")
    public String getUser() {
        return user;
    }

    /**
     * User
     * <p>
     * Lineage reference object : SFRSRPO_USER
     * 
     */
    @JsonProperty("user")
    public void setUser(String user) {
        this.user = user;
    }

    public Sfrsrpo__1 withUser(String user) {
        this.user = user;
        return this;
    }

    /**
     * CRN
     * <p>
     * Lineage reference object : SFRSRPO_CRN
     * 
     */
    @JsonProperty("crn")
    public String getCrn() {
        return crn;
    }

    /**
     * CRN
     * <p>
     * Lineage reference object : SFRSRPO_CRN
     * 
     */
    @JsonProperty("crn")
    public void setCrn(String crn) {
        this.crn = crn;
    }

    public Sfrsrpo__1 withCrn(String crn) {
        this.crn = crn;
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

    public Sfrsrpo__1 withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Sfrsrpo__1 .class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("crseNumb");
        sb.append('=');
        sb.append(((this.crseNumb == null)?"<null>":this.crseNumb));
        sb.append(',');
        sb.append("activityDate");
        sb.append('=');
        sb.append(((this.activityDate == null)?"<null>":this.activityDate));
        sb.append(',');
        sb.append("rovrDesc");
        sb.append('=');
        sb.append(((this.rovrDesc == null)?"<null>":this.rovrDesc));
        sb.append(',');
        sb.append("subjCode");
        sb.append('=');
        sb.append(((this.subjCode == null)?"<null>":this.subjCode));
        sb.append(',');
        sb.append("seqNumb");
        sb.append('=');
        sb.append(((this.seqNumb == null)?"<null>":this.seqNumb));
        sb.append(',');
        sb.append("rovrCode");
        sb.append('=');
        sb.append(((this.rovrCode == null)?"<null>":this.rovrCode));
        sb.append(',');
        sb.append("user");
        sb.append('=');
        sb.append(((this.user == null)?"<null>":this.user));
        sb.append(',');
        sb.append("crn");
        sb.append('=');
        sb.append(((this.crn == null)?"<null>":this.crn));
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
        result = ((result* 31)+((this.crseNumb == null)? 0 :this.crseNumb.hashCode()));
        result = ((result* 31)+((this.activityDate == null)? 0 :this.activityDate.hashCode()));
        result = ((result* 31)+((this.rovrDesc == null)? 0 :this.rovrDesc.hashCode()));
        result = ((result* 31)+((this.subjCode == null)? 0 :this.subjCode.hashCode()));
        result = ((result* 31)+((this.seqNumb == null)? 0 :this.seqNumb.hashCode()));
        result = ((result* 31)+((this.rovrCode == null)? 0 :this.rovrCode.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.user == null)? 0 :this.user.hashCode()));
        result = ((result* 31)+((this.crn == null)? 0 :this.crn.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Sfrsrpo__1) == false) {
            return false;
        }
        Sfrsrpo__1 rhs = ((Sfrsrpo__1) other);
        return ((((((((((this.crseNumb == rhs.crseNumb)||((this.crseNumb!= null)&&this.crseNumb.equals(rhs.crseNumb)))&&((this.activityDate == rhs.activityDate)||((this.activityDate!= null)&&this.activityDate.equals(rhs.activityDate))))&&((this.rovrDesc == rhs.rovrDesc)||((this.rovrDesc!= null)&&this.rovrDesc.equals(rhs.rovrDesc))))&&((this.subjCode == rhs.subjCode)||((this.subjCode!= null)&&this.subjCode.equals(rhs.subjCode))))&&((this.seqNumb == rhs.seqNumb)||((this.seqNumb!= null)&&this.seqNumb.equals(rhs.seqNumb))))&&((this.rovrCode == rhs.rovrCode)||((this.rovrCode!= null)&&this.rovrCode.equals(rhs.rovrCode))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.user == rhs.user)||((this.user!= null)&&this.user.equals(rhs.user))))&&((this.crn == rhs.crn)||((this.crn!= null)&&this.crn.equals(rhs.crn))));
    }

}
