
package com.ellucian.generated.bpapi.ban.student_course_maintenance_components.v0_1_0;

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
    "summary",
    "gcmtCodeDesc",
    "grdeCode",
    "gchgCode",
    "userId",
    "activityDate",
    "gcmtCode",
    "pidm",
    "percentage",
    "gchgCodeDesc",
    "rectypeInd",
    "crn",
    "termCode"
})
@Generated("jsonschema2pojo")
public class Shrcmrk {

    /**
     * Calculated Summary
     * <p>
     * Lineage reference object : SHRCMRK_SUMMARY
     * 
     */
    @JsonProperty("summary")
    @JsonPropertyDescription("Lineage reference object : SHRCMRK_SUMMARY")
    private String summary;
    /**
     * Comment Description
     * <p>
     * 
     * 
     */
    @JsonProperty("gcmtCodeDesc")
    private String gcmtCodeDesc;
    /**
     * Grade
     * <p>
     * Lineage reference object : SHRCMRK_GRDE_CODE, Lookup lineage reference object : shrgrde
     * 
     */
    @JsonProperty("grdeCode")
    @JsonPropertyDescription("Lineage reference object : SHRCMRK_GRDE_CODE, Lookup lineage reference object : shrgrde")
    private String grdeCode;
    /**
     * Change Reason
     * <p>
     * Lineage reference object : SHRCMRK_GCHG_CODE, Lookup lineage reference object : stvgchg
     * 
     */
    @JsonProperty("gchgCode")
    @JsonPropertyDescription("Lineage reference object : SHRCMRK_GCHG_CODE, Lookup lineage reference object : stvgchg")
    private String gchgCode;
    /**
     * Lineage reference object : SHRCMRK_USER_ID
     * 
     */
    @JsonProperty("userId")
    @JsonPropertyDescription("Lineage reference object : SHRCMRK_USER_ID")
    private String userId;
    /**
     * Lineage reference object : SHRCMRK_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    @JsonPropertyDescription("Lineage reference object : SHRCMRK_ACTIVITY_DATE")
    private Date activityDate;
    /**
     * Comment
     * <p>
     * Lineage reference object : SHRCMRK_GCMT_CODE, Lookup lineage reference object : stvgcmt
     * 
     */
    @JsonProperty("gcmtCode")
    @JsonPropertyDescription("Lineage reference object : SHRCMRK_GCMT_CODE, Lookup lineage reference object : stvgcmt")
    private String gcmtCode;
    /**
     * Lineage reference object : SHRCMRK_PIDM
     * 
     */
    @JsonProperty("pidm")
    @JsonPropertyDescription("Lineage reference object : SHRCMRK_PIDM")
    private Double pidm;
    /**
     * Percent
     * <p>
     * Lineage reference object : SHRCMRK_PERCENTAGE
     * 
     */
    @JsonProperty("percentage")
    @JsonPropertyDescription("Lineage reference object : SHRCMRK_PERCENTAGE")
    private Double percentage;
    /**
     * Change Reason Description
     * <p>
     * 
     * 
     */
    @JsonProperty("gchgCodeDesc")
    private String gchgCodeDesc;
    /**
     * Midterm/Final
     * <p>
     * Lineage reference object : SHRCMRK_RECTYPE_IND
     * 
     */
    @JsonProperty("rectypeInd")
    @JsonPropertyDescription("Lineage reference object : SHRCMRK_RECTYPE_IND")
    private String rectypeInd;
    /**
     * Lineage reference object : SHRCMRK_CRN
     * 
     */
    @JsonProperty("crn")
    @JsonPropertyDescription("Lineage reference object : SHRCMRK_CRN")
    private String crn;
    /**
     * Lineage reference object : SHRCMRK_TERM_CODE
     * 
     */
    @JsonProperty("termCode")
    @JsonPropertyDescription("Lineage reference object : SHRCMRK_TERM_CODE")
    private String termCode;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Calculated Summary
     * <p>
     * Lineage reference object : SHRCMRK_SUMMARY
     * 
     */
    @JsonProperty("summary")
    public String getSummary() {
        return summary;
    }

    /**
     * Calculated Summary
     * <p>
     * Lineage reference object : SHRCMRK_SUMMARY
     * 
     */
    @JsonProperty("summary")
    public void setSummary(String summary) {
        this.summary = summary;
    }

    public Shrcmrk withSummary(String summary) {
        this.summary = summary;
        return this;
    }

    /**
     * Comment Description
     * <p>
     * 
     * 
     */
    @JsonProperty("gcmtCodeDesc")
    public String getGcmtCodeDesc() {
        return gcmtCodeDesc;
    }

    /**
     * Comment Description
     * <p>
     * 
     * 
     */
    @JsonProperty("gcmtCodeDesc")
    public void setGcmtCodeDesc(String gcmtCodeDesc) {
        this.gcmtCodeDesc = gcmtCodeDesc;
    }

    public Shrcmrk withGcmtCodeDesc(String gcmtCodeDesc) {
        this.gcmtCodeDesc = gcmtCodeDesc;
        return this;
    }

    /**
     * Grade
     * <p>
     * Lineage reference object : SHRCMRK_GRDE_CODE, Lookup lineage reference object : shrgrde
     * 
     */
    @JsonProperty("grdeCode")
    public String getGrdeCode() {
        return grdeCode;
    }

    /**
     * Grade
     * <p>
     * Lineage reference object : SHRCMRK_GRDE_CODE, Lookup lineage reference object : shrgrde
     * 
     */
    @JsonProperty("grdeCode")
    public void setGrdeCode(String grdeCode) {
        this.grdeCode = grdeCode;
    }

    public Shrcmrk withGrdeCode(String grdeCode) {
        this.grdeCode = grdeCode;
        return this;
    }

    /**
     * Change Reason
     * <p>
     * Lineage reference object : SHRCMRK_GCHG_CODE, Lookup lineage reference object : stvgchg
     * 
     */
    @JsonProperty("gchgCode")
    public String getGchgCode() {
        return gchgCode;
    }

    /**
     * Change Reason
     * <p>
     * Lineage reference object : SHRCMRK_GCHG_CODE, Lookup lineage reference object : stvgchg
     * 
     */
    @JsonProperty("gchgCode")
    public void setGchgCode(String gchgCode) {
        this.gchgCode = gchgCode;
    }

    public Shrcmrk withGchgCode(String gchgCode) {
        this.gchgCode = gchgCode;
        return this;
    }

    /**
     * Lineage reference object : SHRCMRK_USER_ID
     * 
     */
    @JsonProperty("userId")
    public String getUserId() {
        return userId;
    }

    /**
     * Lineage reference object : SHRCMRK_USER_ID
     * 
     */
    @JsonProperty("userId")
    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Shrcmrk withUserId(String userId) {
        this.userId = userId;
        return this;
    }

    /**
     * Lineage reference object : SHRCMRK_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public Date getActivityDate() {
        return activityDate;
    }

    /**
     * Lineage reference object : SHRCMRK_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public void setActivityDate(Date activityDate) {
        this.activityDate = activityDate;
    }

    public Shrcmrk withActivityDate(Date activityDate) {
        this.activityDate = activityDate;
        return this;
    }

    /**
     * Comment
     * <p>
     * Lineage reference object : SHRCMRK_GCMT_CODE, Lookup lineage reference object : stvgcmt
     * 
     */
    @JsonProperty("gcmtCode")
    public String getGcmtCode() {
        return gcmtCode;
    }

    /**
     * Comment
     * <p>
     * Lineage reference object : SHRCMRK_GCMT_CODE, Lookup lineage reference object : stvgcmt
     * 
     */
    @JsonProperty("gcmtCode")
    public void setGcmtCode(String gcmtCode) {
        this.gcmtCode = gcmtCode;
    }

    public Shrcmrk withGcmtCode(String gcmtCode) {
        this.gcmtCode = gcmtCode;
        return this;
    }

    /**
     * Lineage reference object : SHRCMRK_PIDM
     * 
     */
    @JsonProperty("pidm")
    public Double getPidm() {
        return pidm;
    }

    /**
     * Lineage reference object : SHRCMRK_PIDM
     * 
     */
    @JsonProperty("pidm")
    public void setPidm(Double pidm) {
        this.pidm = pidm;
    }

    public Shrcmrk withPidm(Double pidm) {
        this.pidm = pidm;
        return this;
    }

    /**
     * Percent
     * <p>
     * Lineage reference object : SHRCMRK_PERCENTAGE
     * 
     */
    @JsonProperty("percentage")
    public Double getPercentage() {
        return percentage;
    }

    /**
     * Percent
     * <p>
     * Lineage reference object : SHRCMRK_PERCENTAGE
     * 
     */
    @JsonProperty("percentage")
    public void setPercentage(Double percentage) {
        this.percentage = percentage;
    }

    public Shrcmrk withPercentage(Double percentage) {
        this.percentage = percentage;
        return this;
    }

    /**
     * Change Reason Description
     * <p>
     * 
     * 
     */
    @JsonProperty("gchgCodeDesc")
    public String getGchgCodeDesc() {
        return gchgCodeDesc;
    }

    /**
     * Change Reason Description
     * <p>
     * 
     * 
     */
    @JsonProperty("gchgCodeDesc")
    public void setGchgCodeDesc(String gchgCodeDesc) {
        this.gchgCodeDesc = gchgCodeDesc;
    }

    public Shrcmrk withGchgCodeDesc(String gchgCodeDesc) {
        this.gchgCodeDesc = gchgCodeDesc;
        return this;
    }

    /**
     * Midterm/Final
     * <p>
     * Lineage reference object : SHRCMRK_RECTYPE_IND
     * 
     */
    @JsonProperty("rectypeInd")
    public String getRectypeInd() {
        return rectypeInd;
    }

    /**
     * Midterm/Final
     * <p>
     * Lineage reference object : SHRCMRK_RECTYPE_IND
     * 
     */
    @JsonProperty("rectypeInd")
    public void setRectypeInd(String rectypeInd) {
        this.rectypeInd = rectypeInd;
    }

    public Shrcmrk withRectypeInd(String rectypeInd) {
        this.rectypeInd = rectypeInd;
        return this;
    }

    /**
     * Lineage reference object : SHRCMRK_CRN
     * 
     */
    @JsonProperty("crn")
    public String getCrn() {
        return crn;
    }

    /**
     * Lineage reference object : SHRCMRK_CRN
     * 
     */
    @JsonProperty("crn")
    public void setCrn(String crn) {
        this.crn = crn;
    }

    public Shrcmrk withCrn(String crn) {
        this.crn = crn;
        return this;
    }

    /**
     * Lineage reference object : SHRCMRK_TERM_CODE
     * 
     */
    @JsonProperty("termCode")
    public String getTermCode() {
        return termCode;
    }

    /**
     * Lineage reference object : SHRCMRK_TERM_CODE
     * 
     */
    @JsonProperty("termCode")
    public void setTermCode(String termCode) {
        this.termCode = termCode;
    }

    public Shrcmrk withTermCode(String termCode) {
        this.termCode = termCode;
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

    public Shrcmrk withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Shrcmrk.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("summary");
        sb.append('=');
        sb.append(((this.summary == null)?"<null>":this.summary));
        sb.append(',');
        sb.append("gcmtCodeDesc");
        sb.append('=');
        sb.append(((this.gcmtCodeDesc == null)?"<null>":this.gcmtCodeDesc));
        sb.append(',');
        sb.append("grdeCode");
        sb.append('=');
        sb.append(((this.grdeCode == null)?"<null>":this.grdeCode));
        sb.append(',');
        sb.append("gchgCode");
        sb.append('=');
        sb.append(((this.gchgCode == null)?"<null>":this.gchgCode));
        sb.append(',');
        sb.append("userId");
        sb.append('=');
        sb.append(((this.userId == null)?"<null>":this.userId));
        sb.append(',');
        sb.append("activityDate");
        sb.append('=');
        sb.append(((this.activityDate == null)?"<null>":this.activityDate));
        sb.append(',');
        sb.append("gcmtCode");
        sb.append('=');
        sb.append(((this.gcmtCode == null)?"<null>":this.gcmtCode));
        sb.append(',');
        sb.append("pidm");
        sb.append('=');
        sb.append(((this.pidm == null)?"<null>":this.pidm));
        sb.append(',');
        sb.append("percentage");
        sb.append('=');
        sb.append(((this.percentage == null)?"<null>":this.percentage));
        sb.append(',');
        sb.append("gchgCodeDesc");
        sb.append('=');
        sb.append(((this.gchgCodeDesc == null)?"<null>":this.gchgCodeDesc));
        sb.append(',');
        sb.append("rectypeInd");
        sb.append('=');
        sb.append(((this.rectypeInd == null)?"<null>":this.rectypeInd));
        sb.append(',');
        sb.append("crn");
        sb.append('=');
        sb.append(((this.crn == null)?"<null>":this.crn));
        sb.append(',');
        sb.append("termCode");
        sb.append('=');
        sb.append(((this.termCode == null)?"<null>":this.termCode));
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
        result = ((result* 31)+((this.summary == null)? 0 :this.summary.hashCode()));
        result = ((result* 31)+((this.gcmtCodeDesc == null)? 0 :this.gcmtCodeDesc.hashCode()));
        result = ((result* 31)+((this.grdeCode == null)? 0 :this.grdeCode.hashCode()));
        result = ((result* 31)+((this.gchgCode == null)? 0 :this.gchgCode.hashCode()));
        result = ((result* 31)+((this.userId == null)? 0 :this.userId.hashCode()));
        result = ((result* 31)+((this.activityDate == null)? 0 :this.activityDate.hashCode()));
        result = ((result* 31)+((this.gcmtCode == null)? 0 :this.gcmtCode.hashCode()));
        result = ((result* 31)+((this.pidm == null)? 0 :this.pidm.hashCode()));
        result = ((result* 31)+((this.percentage == null)? 0 :this.percentage.hashCode()));
        result = ((result* 31)+((this.gchgCodeDesc == null)? 0 :this.gchgCodeDesc.hashCode()));
        result = ((result* 31)+((this.rectypeInd == null)? 0 :this.rectypeInd.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.crn == null)? 0 :this.crn.hashCode()));
        result = ((result* 31)+((this.termCode == null)? 0 :this.termCode.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Shrcmrk) == false) {
            return false;
        }
        Shrcmrk rhs = ((Shrcmrk) other);
        return (((((((((((((((this.summary == rhs.summary)||((this.summary!= null)&&this.summary.equals(rhs.summary)))&&((this.gcmtCodeDesc == rhs.gcmtCodeDesc)||((this.gcmtCodeDesc!= null)&&this.gcmtCodeDesc.equals(rhs.gcmtCodeDesc))))&&((this.grdeCode == rhs.grdeCode)||((this.grdeCode!= null)&&this.grdeCode.equals(rhs.grdeCode))))&&((this.gchgCode == rhs.gchgCode)||((this.gchgCode!= null)&&this.gchgCode.equals(rhs.gchgCode))))&&((this.userId == rhs.userId)||((this.userId!= null)&&this.userId.equals(rhs.userId))))&&((this.activityDate == rhs.activityDate)||((this.activityDate!= null)&&this.activityDate.equals(rhs.activityDate))))&&((this.gcmtCode == rhs.gcmtCode)||((this.gcmtCode!= null)&&this.gcmtCode.equals(rhs.gcmtCode))))&&((this.pidm == rhs.pidm)||((this.pidm!= null)&&this.pidm.equals(rhs.pidm))))&&((this.percentage == rhs.percentage)||((this.percentage!= null)&&this.percentage.equals(rhs.percentage))))&&((this.gchgCodeDesc == rhs.gchgCodeDesc)||((this.gchgCodeDesc!= null)&&this.gchgCodeDesc.equals(rhs.gchgCodeDesc))))&&((this.rectypeInd == rhs.rectypeInd)||((this.rectypeInd!= null)&&this.rectypeInd.equals(rhs.rectypeInd))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.crn == rhs.crn)||((this.crn!= null)&&this.crn.equals(rhs.crn))))&&((this.termCode == rhs.termCode)||((this.termCode!= null)&&this.termCode.equals(rhs.termCode))));
    }

}
