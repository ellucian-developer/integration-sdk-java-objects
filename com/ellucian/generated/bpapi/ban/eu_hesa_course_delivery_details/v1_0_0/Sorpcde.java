
package com.ellucian.generated.bpapi.ban.eu_hesa_course_delivery_details.v1_0_0;

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
    "ssdtCodeClsdcrsSt",
    "ssdtCodeFundlevelSt",
    "ssdtCodeBittm",
    "ssdtCodeSandwich",
    "ssdtCodeTtcidSt",
    "userId",
    "ssdtCodeBittmSt",
    "courseTitle",
    "ssdtCodeTtcid",
    "activityDate",
    "qualIdSt",
    "ssdtCodeSandwichSt",
    "ssdtCodeFullyflex",
    "qualId",
    "ssdtCodeClsdcrs",
    "ssdtCodeFullyflexSt",
    "ssdtCodeFundlevel",
    "courseId"
})
@Generated("jsonschema2pojo")
public class Sorpcde {

    @JsonProperty("ssdtCodeClsdcrsSt")
    private String ssdtCodeClsdcrsSt;
    @JsonProperty("ssdtCodeFundlevelSt")
    private String ssdtCodeFundlevelSt;
    /**
     * Lineage reference object : SORPCDE_SSDT_CODE_BITTM, Lookup lineage reference object : skvssdt,skvssdt
     * 
     */
    @JsonProperty("ssdtCodeBittm")
    @JsonPropertyDescription("Lineage reference object : SORPCDE_SSDT_CODE_BITTM, Lookup lineage reference object : skvssdt,skvssdt")
    private String ssdtCodeBittm;
    /**
     * Lineage reference object : SORPCDE_SSDT_CODE_SANDWICH, Lookup lineage reference object : skvssdt,skvssdt
     * 
     */
    @JsonProperty("ssdtCodeSandwich")
    @JsonPropertyDescription("Lineage reference object : SORPCDE_SSDT_CODE_SANDWICH, Lookup lineage reference object : skvssdt,skvssdt")
    private String ssdtCodeSandwich;
    @JsonProperty("ssdtCodeTtcidSt")
    private String ssdtCodeTtcidSt;
    /**
     * Lineage reference object : SORPCDE_USER_ID
     * 
     */
    @JsonProperty("userId")
    @JsonPropertyDescription("Lineage reference object : SORPCDE_USER_ID")
    private String userId;
    @JsonProperty("ssdtCodeBittmSt")
    private String ssdtCodeBittmSt;
    /**
     * Lineage reference object : SORPCDE_COURSE_TITLE
     * (Required)
     * 
     */
    @JsonProperty("courseTitle")
    @JsonPropertyDescription("Lineage reference object : SORPCDE_COURSE_TITLE")
    private String courseTitle;
    /**
     * Lineage reference object : SORPCDE_SSDT_CODE_TTCID, Lookup lineage reference object : skvssdt,skvssdt
     * (Required)
     * 
     */
    @JsonProperty("ssdtCodeTtcid")
    @JsonPropertyDescription("Lineage reference object : SORPCDE_SSDT_CODE_TTCID, Lookup lineage reference object : skvssdt,skvssdt")
    private String ssdtCodeTtcid;
    /**
     * Lineage reference object : SORPCDE_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    @JsonPropertyDescription("Lineage reference object : SORPCDE_ACTIVITY_DATE")
    private Date activityDate;
    @JsonProperty("qualIdSt")
    private String qualIdSt;
    @JsonProperty("ssdtCodeSandwichSt")
    private String ssdtCodeSandwichSt;
    /**
     * Lineage reference object : SORPCDE_SSDT_CODE_FULLYFLEX, Lookup lineage reference object : skvssdt,skvssdt
     * 
     */
    @JsonProperty("ssdtCodeFullyflex")
    @JsonPropertyDescription("Lineage reference object : SORPCDE_SSDT_CODE_FULLYFLEX, Lookup lineage reference object : skvssdt,skvssdt")
    private String ssdtCodeFullyflex;
    /**
     * Lineage reference object : SORPCDE_QUAL_ID
     * (Required)
     * 
     */
    @JsonProperty("qualId")
    @JsonPropertyDescription("Lineage reference object : SORPCDE_QUAL_ID")
    private String qualId;
    /**
     * Lineage reference object : SORPCDE_SSDT_CODE_CLSDCRS, Lookup lineage reference object : skvssdt,skvssdt
     * 
     */
    @JsonProperty("ssdtCodeClsdcrs")
    @JsonPropertyDescription("Lineage reference object : SORPCDE_SSDT_CODE_CLSDCRS, Lookup lineage reference object : skvssdt,skvssdt")
    private String ssdtCodeClsdcrs;
    @JsonProperty("ssdtCodeFullyflexSt")
    private String ssdtCodeFullyflexSt;
    /**
     * Lineage reference object : SORPCDE_SSDT_CODE_FUNDLEVEL, Lookup lineage reference object : skvssdt,skvssdt
     * (Required)
     * 
     */
    @JsonProperty("ssdtCodeFundlevel")
    @JsonPropertyDescription("Lineage reference object : SORPCDE_SSDT_CODE_FUNDLEVEL, Lookup lineage reference object : skvssdt,skvssdt")
    private String ssdtCodeFundlevel;
    /**
     * Lineage reference object : SORPCDE_COURSE_ID
     * 
     */
    @JsonProperty("courseId")
    @JsonPropertyDescription("Lineage reference object : SORPCDE_COURSE_ID")
    private String courseId;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("ssdtCodeClsdcrsSt")
    public String getSsdtCodeClsdcrsSt() {
        return ssdtCodeClsdcrsSt;
    }

    @JsonProperty("ssdtCodeClsdcrsSt")
    public void setSsdtCodeClsdcrsSt(String ssdtCodeClsdcrsSt) {
        this.ssdtCodeClsdcrsSt = ssdtCodeClsdcrsSt;
    }

    public Sorpcde withSsdtCodeClsdcrsSt(String ssdtCodeClsdcrsSt) {
        this.ssdtCodeClsdcrsSt = ssdtCodeClsdcrsSt;
        return this;
    }

    @JsonProperty("ssdtCodeFundlevelSt")
    public String getSsdtCodeFundlevelSt() {
        return ssdtCodeFundlevelSt;
    }

    @JsonProperty("ssdtCodeFundlevelSt")
    public void setSsdtCodeFundlevelSt(String ssdtCodeFundlevelSt) {
        this.ssdtCodeFundlevelSt = ssdtCodeFundlevelSt;
    }

    public Sorpcde withSsdtCodeFundlevelSt(String ssdtCodeFundlevelSt) {
        this.ssdtCodeFundlevelSt = ssdtCodeFundlevelSt;
        return this;
    }

    /**
     * Lineage reference object : SORPCDE_SSDT_CODE_BITTM, Lookup lineage reference object : skvssdt,skvssdt
     * 
     */
    @JsonProperty("ssdtCodeBittm")
    public String getSsdtCodeBittm() {
        return ssdtCodeBittm;
    }

    /**
     * Lineage reference object : SORPCDE_SSDT_CODE_BITTM, Lookup lineage reference object : skvssdt,skvssdt
     * 
     */
    @JsonProperty("ssdtCodeBittm")
    public void setSsdtCodeBittm(String ssdtCodeBittm) {
        this.ssdtCodeBittm = ssdtCodeBittm;
    }

    public Sorpcde withSsdtCodeBittm(String ssdtCodeBittm) {
        this.ssdtCodeBittm = ssdtCodeBittm;
        return this;
    }

    /**
     * Lineage reference object : SORPCDE_SSDT_CODE_SANDWICH, Lookup lineage reference object : skvssdt,skvssdt
     * 
     */
    @JsonProperty("ssdtCodeSandwich")
    public String getSsdtCodeSandwich() {
        return ssdtCodeSandwich;
    }

    /**
     * Lineage reference object : SORPCDE_SSDT_CODE_SANDWICH, Lookup lineage reference object : skvssdt,skvssdt
     * 
     */
    @JsonProperty("ssdtCodeSandwich")
    public void setSsdtCodeSandwich(String ssdtCodeSandwich) {
        this.ssdtCodeSandwich = ssdtCodeSandwich;
    }

    public Sorpcde withSsdtCodeSandwich(String ssdtCodeSandwich) {
        this.ssdtCodeSandwich = ssdtCodeSandwich;
        return this;
    }

    @JsonProperty("ssdtCodeTtcidSt")
    public String getSsdtCodeTtcidSt() {
        return ssdtCodeTtcidSt;
    }

    @JsonProperty("ssdtCodeTtcidSt")
    public void setSsdtCodeTtcidSt(String ssdtCodeTtcidSt) {
        this.ssdtCodeTtcidSt = ssdtCodeTtcidSt;
    }

    public Sorpcde withSsdtCodeTtcidSt(String ssdtCodeTtcidSt) {
        this.ssdtCodeTtcidSt = ssdtCodeTtcidSt;
        return this;
    }

    /**
     * Lineage reference object : SORPCDE_USER_ID
     * 
     */
    @JsonProperty("userId")
    public String getUserId() {
        return userId;
    }

    /**
     * Lineage reference object : SORPCDE_USER_ID
     * 
     */
    @JsonProperty("userId")
    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Sorpcde withUserId(String userId) {
        this.userId = userId;
        return this;
    }

    @JsonProperty("ssdtCodeBittmSt")
    public String getSsdtCodeBittmSt() {
        return ssdtCodeBittmSt;
    }

    @JsonProperty("ssdtCodeBittmSt")
    public void setSsdtCodeBittmSt(String ssdtCodeBittmSt) {
        this.ssdtCodeBittmSt = ssdtCodeBittmSt;
    }

    public Sorpcde withSsdtCodeBittmSt(String ssdtCodeBittmSt) {
        this.ssdtCodeBittmSt = ssdtCodeBittmSt;
        return this;
    }

    /**
     * Lineage reference object : SORPCDE_COURSE_TITLE
     * (Required)
     * 
     */
    @JsonProperty("courseTitle")
    public String getCourseTitle() {
        return courseTitle;
    }

    /**
     * Lineage reference object : SORPCDE_COURSE_TITLE
     * (Required)
     * 
     */
    @JsonProperty("courseTitle")
    public void setCourseTitle(String courseTitle) {
        this.courseTitle = courseTitle;
    }

    public Sorpcde withCourseTitle(String courseTitle) {
        this.courseTitle = courseTitle;
        return this;
    }

    /**
     * Lineage reference object : SORPCDE_SSDT_CODE_TTCID, Lookup lineage reference object : skvssdt,skvssdt
     * (Required)
     * 
     */
    @JsonProperty("ssdtCodeTtcid")
    public String getSsdtCodeTtcid() {
        return ssdtCodeTtcid;
    }

    /**
     * Lineage reference object : SORPCDE_SSDT_CODE_TTCID, Lookup lineage reference object : skvssdt,skvssdt
     * (Required)
     * 
     */
    @JsonProperty("ssdtCodeTtcid")
    public void setSsdtCodeTtcid(String ssdtCodeTtcid) {
        this.ssdtCodeTtcid = ssdtCodeTtcid;
    }

    public Sorpcde withSsdtCodeTtcid(String ssdtCodeTtcid) {
        this.ssdtCodeTtcid = ssdtCodeTtcid;
        return this;
    }

    /**
     * Lineage reference object : SORPCDE_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public Date getActivityDate() {
        return activityDate;
    }

    /**
     * Lineage reference object : SORPCDE_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public void setActivityDate(Date activityDate) {
        this.activityDate = activityDate;
    }

    public Sorpcde withActivityDate(Date activityDate) {
        this.activityDate = activityDate;
        return this;
    }

    @JsonProperty("qualIdSt")
    public String getQualIdSt() {
        return qualIdSt;
    }

    @JsonProperty("qualIdSt")
    public void setQualIdSt(String qualIdSt) {
        this.qualIdSt = qualIdSt;
    }

    public Sorpcde withQualIdSt(String qualIdSt) {
        this.qualIdSt = qualIdSt;
        return this;
    }

    @JsonProperty("ssdtCodeSandwichSt")
    public String getSsdtCodeSandwichSt() {
        return ssdtCodeSandwichSt;
    }

    @JsonProperty("ssdtCodeSandwichSt")
    public void setSsdtCodeSandwichSt(String ssdtCodeSandwichSt) {
        this.ssdtCodeSandwichSt = ssdtCodeSandwichSt;
    }

    public Sorpcde withSsdtCodeSandwichSt(String ssdtCodeSandwichSt) {
        this.ssdtCodeSandwichSt = ssdtCodeSandwichSt;
        return this;
    }

    /**
     * Lineage reference object : SORPCDE_SSDT_CODE_FULLYFLEX, Lookup lineage reference object : skvssdt,skvssdt
     * 
     */
    @JsonProperty("ssdtCodeFullyflex")
    public String getSsdtCodeFullyflex() {
        return ssdtCodeFullyflex;
    }

    /**
     * Lineage reference object : SORPCDE_SSDT_CODE_FULLYFLEX, Lookup lineage reference object : skvssdt,skvssdt
     * 
     */
    @JsonProperty("ssdtCodeFullyflex")
    public void setSsdtCodeFullyflex(String ssdtCodeFullyflex) {
        this.ssdtCodeFullyflex = ssdtCodeFullyflex;
    }

    public Sorpcde withSsdtCodeFullyflex(String ssdtCodeFullyflex) {
        this.ssdtCodeFullyflex = ssdtCodeFullyflex;
        return this;
    }

    /**
     * Lineage reference object : SORPCDE_QUAL_ID
     * (Required)
     * 
     */
    @JsonProperty("qualId")
    public String getQualId() {
        return qualId;
    }

    /**
     * Lineage reference object : SORPCDE_QUAL_ID
     * (Required)
     * 
     */
    @JsonProperty("qualId")
    public void setQualId(String qualId) {
        this.qualId = qualId;
    }

    public Sorpcde withQualId(String qualId) {
        this.qualId = qualId;
        return this;
    }

    /**
     * Lineage reference object : SORPCDE_SSDT_CODE_CLSDCRS, Lookup lineage reference object : skvssdt,skvssdt
     * 
     */
    @JsonProperty("ssdtCodeClsdcrs")
    public String getSsdtCodeClsdcrs() {
        return ssdtCodeClsdcrs;
    }

    /**
     * Lineage reference object : SORPCDE_SSDT_CODE_CLSDCRS, Lookup lineage reference object : skvssdt,skvssdt
     * 
     */
    @JsonProperty("ssdtCodeClsdcrs")
    public void setSsdtCodeClsdcrs(String ssdtCodeClsdcrs) {
        this.ssdtCodeClsdcrs = ssdtCodeClsdcrs;
    }

    public Sorpcde withSsdtCodeClsdcrs(String ssdtCodeClsdcrs) {
        this.ssdtCodeClsdcrs = ssdtCodeClsdcrs;
        return this;
    }

    @JsonProperty("ssdtCodeFullyflexSt")
    public String getSsdtCodeFullyflexSt() {
        return ssdtCodeFullyflexSt;
    }

    @JsonProperty("ssdtCodeFullyflexSt")
    public void setSsdtCodeFullyflexSt(String ssdtCodeFullyflexSt) {
        this.ssdtCodeFullyflexSt = ssdtCodeFullyflexSt;
    }

    public Sorpcde withSsdtCodeFullyflexSt(String ssdtCodeFullyflexSt) {
        this.ssdtCodeFullyflexSt = ssdtCodeFullyflexSt;
        return this;
    }

    /**
     * Lineage reference object : SORPCDE_SSDT_CODE_FUNDLEVEL, Lookup lineage reference object : skvssdt,skvssdt
     * (Required)
     * 
     */
    @JsonProperty("ssdtCodeFundlevel")
    public String getSsdtCodeFundlevel() {
        return ssdtCodeFundlevel;
    }

    /**
     * Lineage reference object : SORPCDE_SSDT_CODE_FUNDLEVEL, Lookup lineage reference object : skvssdt,skvssdt
     * (Required)
     * 
     */
    @JsonProperty("ssdtCodeFundlevel")
    public void setSsdtCodeFundlevel(String ssdtCodeFundlevel) {
        this.ssdtCodeFundlevel = ssdtCodeFundlevel;
    }

    public Sorpcde withSsdtCodeFundlevel(String ssdtCodeFundlevel) {
        this.ssdtCodeFundlevel = ssdtCodeFundlevel;
        return this;
    }

    /**
     * Lineage reference object : SORPCDE_COURSE_ID
     * 
     */
    @JsonProperty("courseId")
    public String getCourseId() {
        return courseId;
    }

    /**
     * Lineage reference object : SORPCDE_COURSE_ID
     * 
     */
    @JsonProperty("courseId")
    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

    public Sorpcde withCourseId(String courseId) {
        this.courseId = courseId;
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

    public Sorpcde withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Sorpcde.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("ssdtCodeClsdcrsSt");
        sb.append('=');
        sb.append(((this.ssdtCodeClsdcrsSt == null)?"<null>":this.ssdtCodeClsdcrsSt));
        sb.append(',');
        sb.append("ssdtCodeFundlevelSt");
        sb.append('=');
        sb.append(((this.ssdtCodeFundlevelSt == null)?"<null>":this.ssdtCodeFundlevelSt));
        sb.append(',');
        sb.append("ssdtCodeBittm");
        sb.append('=');
        sb.append(((this.ssdtCodeBittm == null)?"<null>":this.ssdtCodeBittm));
        sb.append(',');
        sb.append("ssdtCodeSandwich");
        sb.append('=');
        sb.append(((this.ssdtCodeSandwich == null)?"<null>":this.ssdtCodeSandwich));
        sb.append(',');
        sb.append("ssdtCodeTtcidSt");
        sb.append('=');
        sb.append(((this.ssdtCodeTtcidSt == null)?"<null>":this.ssdtCodeTtcidSt));
        sb.append(',');
        sb.append("userId");
        sb.append('=');
        sb.append(((this.userId == null)?"<null>":this.userId));
        sb.append(',');
        sb.append("ssdtCodeBittmSt");
        sb.append('=');
        sb.append(((this.ssdtCodeBittmSt == null)?"<null>":this.ssdtCodeBittmSt));
        sb.append(',');
        sb.append("courseTitle");
        sb.append('=');
        sb.append(((this.courseTitle == null)?"<null>":this.courseTitle));
        sb.append(',');
        sb.append("ssdtCodeTtcid");
        sb.append('=');
        sb.append(((this.ssdtCodeTtcid == null)?"<null>":this.ssdtCodeTtcid));
        sb.append(',');
        sb.append("activityDate");
        sb.append('=');
        sb.append(((this.activityDate == null)?"<null>":this.activityDate));
        sb.append(',');
        sb.append("qualIdSt");
        sb.append('=');
        sb.append(((this.qualIdSt == null)?"<null>":this.qualIdSt));
        sb.append(',');
        sb.append("ssdtCodeSandwichSt");
        sb.append('=');
        sb.append(((this.ssdtCodeSandwichSt == null)?"<null>":this.ssdtCodeSandwichSt));
        sb.append(',');
        sb.append("ssdtCodeFullyflex");
        sb.append('=');
        sb.append(((this.ssdtCodeFullyflex == null)?"<null>":this.ssdtCodeFullyflex));
        sb.append(',');
        sb.append("qualId");
        sb.append('=');
        sb.append(((this.qualId == null)?"<null>":this.qualId));
        sb.append(',');
        sb.append("ssdtCodeClsdcrs");
        sb.append('=');
        sb.append(((this.ssdtCodeClsdcrs == null)?"<null>":this.ssdtCodeClsdcrs));
        sb.append(',');
        sb.append("ssdtCodeFullyflexSt");
        sb.append('=');
        sb.append(((this.ssdtCodeFullyflexSt == null)?"<null>":this.ssdtCodeFullyflexSt));
        sb.append(',');
        sb.append("ssdtCodeFundlevel");
        sb.append('=');
        sb.append(((this.ssdtCodeFundlevel == null)?"<null>":this.ssdtCodeFundlevel));
        sb.append(',');
        sb.append("courseId");
        sb.append('=');
        sb.append(((this.courseId == null)?"<null>":this.courseId));
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
        result = ((result* 31)+((this.ssdtCodeClsdcrsSt == null)? 0 :this.ssdtCodeClsdcrsSt.hashCode()));
        result = ((result* 31)+((this.ssdtCodeFundlevelSt == null)? 0 :this.ssdtCodeFundlevelSt.hashCode()));
        result = ((result* 31)+((this.ssdtCodeBittm == null)? 0 :this.ssdtCodeBittm.hashCode()));
        result = ((result* 31)+((this.ssdtCodeSandwich == null)? 0 :this.ssdtCodeSandwich.hashCode()));
        result = ((result* 31)+((this.ssdtCodeTtcidSt == null)? 0 :this.ssdtCodeTtcidSt.hashCode()));
        result = ((result* 31)+((this.userId == null)? 0 :this.userId.hashCode()));
        result = ((result* 31)+((this.ssdtCodeBittmSt == null)? 0 :this.ssdtCodeBittmSt.hashCode()));
        result = ((result* 31)+((this.courseTitle == null)? 0 :this.courseTitle.hashCode()));
        result = ((result* 31)+((this.ssdtCodeTtcid == null)? 0 :this.ssdtCodeTtcid.hashCode()));
        result = ((result* 31)+((this.activityDate == null)? 0 :this.activityDate.hashCode()));
        result = ((result* 31)+((this.qualIdSt == null)? 0 :this.qualIdSt.hashCode()));
        result = ((result* 31)+((this.ssdtCodeSandwichSt == null)? 0 :this.ssdtCodeSandwichSt.hashCode()));
        result = ((result* 31)+((this.ssdtCodeFullyflex == null)? 0 :this.ssdtCodeFullyflex.hashCode()));
        result = ((result* 31)+((this.qualId == null)? 0 :this.qualId.hashCode()));
        result = ((result* 31)+((this.ssdtCodeClsdcrs == null)? 0 :this.ssdtCodeClsdcrs.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.ssdtCodeFullyflexSt == null)? 0 :this.ssdtCodeFullyflexSt.hashCode()));
        result = ((result* 31)+((this.ssdtCodeFundlevel == null)? 0 :this.ssdtCodeFundlevel.hashCode()));
        result = ((result* 31)+((this.courseId == null)? 0 :this.courseId.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Sorpcde) == false) {
            return false;
        }
        Sorpcde rhs = ((Sorpcde) other);
        return ((((((((((((((((((((this.ssdtCodeClsdcrsSt == rhs.ssdtCodeClsdcrsSt)||((this.ssdtCodeClsdcrsSt!= null)&&this.ssdtCodeClsdcrsSt.equals(rhs.ssdtCodeClsdcrsSt)))&&((this.ssdtCodeFundlevelSt == rhs.ssdtCodeFundlevelSt)||((this.ssdtCodeFundlevelSt!= null)&&this.ssdtCodeFundlevelSt.equals(rhs.ssdtCodeFundlevelSt))))&&((this.ssdtCodeBittm == rhs.ssdtCodeBittm)||((this.ssdtCodeBittm!= null)&&this.ssdtCodeBittm.equals(rhs.ssdtCodeBittm))))&&((this.ssdtCodeSandwich == rhs.ssdtCodeSandwich)||((this.ssdtCodeSandwich!= null)&&this.ssdtCodeSandwich.equals(rhs.ssdtCodeSandwich))))&&((this.ssdtCodeTtcidSt == rhs.ssdtCodeTtcidSt)||((this.ssdtCodeTtcidSt!= null)&&this.ssdtCodeTtcidSt.equals(rhs.ssdtCodeTtcidSt))))&&((this.userId == rhs.userId)||((this.userId!= null)&&this.userId.equals(rhs.userId))))&&((this.ssdtCodeBittmSt == rhs.ssdtCodeBittmSt)||((this.ssdtCodeBittmSt!= null)&&this.ssdtCodeBittmSt.equals(rhs.ssdtCodeBittmSt))))&&((this.courseTitle == rhs.courseTitle)||((this.courseTitle!= null)&&this.courseTitle.equals(rhs.courseTitle))))&&((this.ssdtCodeTtcid == rhs.ssdtCodeTtcid)||((this.ssdtCodeTtcid!= null)&&this.ssdtCodeTtcid.equals(rhs.ssdtCodeTtcid))))&&((this.activityDate == rhs.activityDate)||((this.activityDate!= null)&&this.activityDate.equals(rhs.activityDate))))&&((this.qualIdSt == rhs.qualIdSt)||((this.qualIdSt!= null)&&this.qualIdSt.equals(rhs.qualIdSt))))&&((this.ssdtCodeSandwichSt == rhs.ssdtCodeSandwichSt)||((this.ssdtCodeSandwichSt!= null)&&this.ssdtCodeSandwichSt.equals(rhs.ssdtCodeSandwichSt))))&&((this.ssdtCodeFullyflex == rhs.ssdtCodeFullyflex)||((this.ssdtCodeFullyflex!= null)&&this.ssdtCodeFullyflex.equals(rhs.ssdtCodeFullyflex))))&&((this.qualId == rhs.qualId)||((this.qualId!= null)&&this.qualId.equals(rhs.qualId))))&&((this.ssdtCodeClsdcrs == rhs.ssdtCodeClsdcrs)||((this.ssdtCodeClsdcrs!= null)&&this.ssdtCodeClsdcrs.equals(rhs.ssdtCodeClsdcrs))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.ssdtCodeFullyflexSt == rhs.ssdtCodeFullyflexSt)||((this.ssdtCodeFullyflexSt!= null)&&this.ssdtCodeFullyflexSt.equals(rhs.ssdtCodeFullyflexSt))))&&((this.ssdtCodeFundlevel == rhs.ssdtCodeFundlevel)||((this.ssdtCodeFundlevel!= null)&&this.ssdtCodeFundlevel.equals(rhs.ssdtCodeFundlevel))))&&((this.courseId == rhs.courseId)||((this.courseId!= null)&&this.courseId.equals(rhs.courseId))));
    }

}
