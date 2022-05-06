
package com.ellucian.generated.bpapi.ban.eu_hesa_qualification_details.v1_0_0;

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
    "ssdtCodeQualItt",
    "ssdtCodeQualIttSt",
    "activityDate",
    "ssdtCodeQualSubjSt",
    "qualProportion",
    "userId",
    "ssdtCodeQualSubj"
})
@Generated("jsonschema2pojo")
public class Sorqusb {

    /**
     * Qualification ITT Specialism
     * <p>
     * Lineage reference object : SORQUSB_SSDT_CODE_QUAL_ITT
     * 
     */
    @JsonProperty("ssdtCodeQualItt")
    @JsonPropertyDescription("Lineage reference object : SORQUSB_SSDT_CODE_QUAL_ITT")
    private String ssdtCodeQualItt;
    /**
     * Qualification ITT Specialism Description
     * <p>
     * 
     * 
     */
    @JsonProperty("ssdtCodeQualIttSt")
    private String ssdtCodeQualIttSt;
    /**
     * Lineage reference object : SORQUSB_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    @JsonPropertyDescription("Lineage reference object : SORQUSB_ACTIVITY_DATE")
    private Date activityDate;
    /**
     * Qualification Subject Description
     * <p>
     * 
     * 
     */
    @JsonProperty("ssdtCodeQualSubjSt")
    private String ssdtCodeQualSubjSt;
    /**
     * Qualification Proportion
     * <p>
     * Lineage reference object : SORQUSB_QUAL_PROPORTION
     * 
     */
    @JsonProperty("qualProportion")
    @JsonPropertyDescription("Lineage reference object : SORQUSB_QUAL_PROPORTION")
    private Double qualProportion;
    /**
     * Lineage reference object : SORQUSB_USER_ID
     * 
     */
    @JsonProperty("userId")
    @JsonPropertyDescription("Lineage reference object : SORQUSB_USER_ID")
    private String userId;
    /**
     * Qualification Subject
     * <p>
     * Lineage reference object : SORQUSB_SSDT_CODE_QUAL_SUBJ
     * (Required)
     * 
     */
    @JsonProperty("ssdtCodeQualSubj")
    @JsonPropertyDescription("Lineage reference object : SORQUSB_SSDT_CODE_QUAL_SUBJ")
    private String ssdtCodeQualSubj;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Qualification ITT Specialism
     * <p>
     * Lineage reference object : SORQUSB_SSDT_CODE_QUAL_ITT
     * 
     */
    @JsonProperty("ssdtCodeQualItt")
    public String getSsdtCodeQualItt() {
        return ssdtCodeQualItt;
    }

    /**
     * Qualification ITT Specialism
     * <p>
     * Lineage reference object : SORQUSB_SSDT_CODE_QUAL_ITT
     * 
     */
    @JsonProperty("ssdtCodeQualItt")
    public void setSsdtCodeQualItt(String ssdtCodeQualItt) {
        this.ssdtCodeQualItt = ssdtCodeQualItt;
    }

    public Sorqusb withSsdtCodeQualItt(String ssdtCodeQualItt) {
        this.ssdtCodeQualItt = ssdtCodeQualItt;
        return this;
    }

    /**
     * Qualification ITT Specialism Description
     * <p>
     * 
     * 
     */
    @JsonProperty("ssdtCodeQualIttSt")
    public String getSsdtCodeQualIttSt() {
        return ssdtCodeQualIttSt;
    }

    /**
     * Qualification ITT Specialism Description
     * <p>
     * 
     * 
     */
    @JsonProperty("ssdtCodeQualIttSt")
    public void setSsdtCodeQualIttSt(String ssdtCodeQualIttSt) {
        this.ssdtCodeQualIttSt = ssdtCodeQualIttSt;
    }

    public Sorqusb withSsdtCodeQualIttSt(String ssdtCodeQualIttSt) {
        this.ssdtCodeQualIttSt = ssdtCodeQualIttSt;
        return this;
    }

    /**
     * Lineage reference object : SORQUSB_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public Date getActivityDate() {
        return activityDate;
    }

    /**
     * Lineage reference object : SORQUSB_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public void setActivityDate(Date activityDate) {
        this.activityDate = activityDate;
    }

    public Sorqusb withActivityDate(Date activityDate) {
        this.activityDate = activityDate;
        return this;
    }

    /**
     * Qualification Subject Description
     * <p>
     * 
     * 
     */
    @JsonProperty("ssdtCodeQualSubjSt")
    public String getSsdtCodeQualSubjSt() {
        return ssdtCodeQualSubjSt;
    }

    /**
     * Qualification Subject Description
     * <p>
     * 
     * 
     */
    @JsonProperty("ssdtCodeQualSubjSt")
    public void setSsdtCodeQualSubjSt(String ssdtCodeQualSubjSt) {
        this.ssdtCodeQualSubjSt = ssdtCodeQualSubjSt;
    }

    public Sorqusb withSsdtCodeQualSubjSt(String ssdtCodeQualSubjSt) {
        this.ssdtCodeQualSubjSt = ssdtCodeQualSubjSt;
        return this;
    }

    /**
     * Qualification Proportion
     * <p>
     * Lineage reference object : SORQUSB_QUAL_PROPORTION
     * 
     */
    @JsonProperty("qualProportion")
    public Double getQualProportion() {
        return qualProportion;
    }

    /**
     * Qualification Proportion
     * <p>
     * Lineage reference object : SORQUSB_QUAL_PROPORTION
     * 
     */
    @JsonProperty("qualProportion")
    public void setQualProportion(Double qualProportion) {
        this.qualProportion = qualProportion;
    }

    public Sorqusb withQualProportion(Double qualProportion) {
        this.qualProportion = qualProportion;
        return this;
    }

    /**
     * Lineage reference object : SORQUSB_USER_ID
     * 
     */
    @JsonProperty("userId")
    public String getUserId() {
        return userId;
    }

    /**
     * Lineage reference object : SORQUSB_USER_ID
     * 
     */
    @JsonProperty("userId")
    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Sorqusb withUserId(String userId) {
        this.userId = userId;
        return this;
    }

    /**
     * Qualification Subject
     * <p>
     * Lineage reference object : SORQUSB_SSDT_CODE_QUAL_SUBJ
     * (Required)
     * 
     */
    @JsonProperty("ssdtCodeQualSubj")
    public String getSsdtCodeQualSubj() {
        return ssdtCodeQualSubj;
    }

    /**
     * Qualification Subject
     * <p>
     * Lineage reference object : SORQUSB_SSDT_CODE_QUAL_SUBJ
     * (Required)
     * 
     */
    @JsonProperty("ssdtCodeQualSubj")
    public void setSsdtCodeQualSubj(String ssdtCodeQualSubj) {
        this.ssdtCodeQualSubj = ssdtCodeQualSubj;
    }

    public Sorqusb withSsdtCodeQualSubj(String ssdtCodeQualSubj) {
        this.ssdtCodeQualSubj = ssdtCodeQualSubj;
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

    public Sorqusb withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Sorqusb.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("ssdtCodeQualItt");
        sb.append('=');
        sb.append(((this.ssdtCodeQualItt == null)?"<null>":this.ssdtCodeQualItt));
        sb.append(',');
        sb.append("ssdtCodeQualIttSt");
        sb.append('=');
        sb.append(((this.ssdtCodeQualIttSt == null)?"<null>":this.ssdtCodeQualIttSt));
        sb.append(',');
        sb.append("activityDate");
        sb.append('=');
        sb.append(((this.activityDate == null)?"<null>":this.activityDate));
        sb.append(',');
        sb.append("ssdtCodeQualSubjSt");
        sb.append('=');
        sb.append(((this.ssdtCodeQualSubjSt == null)?"<null>":this.ssdtCodeQualSubjSt));
        sb.append(',');
        sb.append("qualProportion");
        sb.append('=');
        sb.append(((this.qualProportion == null)?"<null>":this.qualProportion));
        sb.append(',');
        sb.append("userId");
        sb.append('=');
        sb.append(((this.userId == null)?"<null>":this.userId));
        sb.append(',');
        sb.append("ssdtCodeQualSubj");
        sb.append('=');
        sb.append(((this.ssdtCodeQualSubj == null)?"<null>":this.ssdtCodeQualSubj));
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
        result = ((result* 31)+((this.ssdtCodeQualItt == null)? 0 :this.ssdtCodeQualItt.hashCode()));
        result = ((result* 31)+((this.ssdtCodeQualIttSt == null)? 0 :this.ssdtCodeQualIttSt.hashCode()));
        result = ((result* 31)+((this.activityDate == null)? 0 :this.activityDate.hashCode()));
        result = ((result* 31)+((this.ssdtCodeQualSubjSt == null)? 0 :this.ssdtCodeQualSubjSt.hashCode()));
        result = ((result* 31)+((this.qualProportion == null)? 0 :this.qualProportion.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.userId == null)? 0 :this.userId.hashCode()));
        result = ((result* 31)+((this.ssdtCodeQualSubj == null)? 0 :this.ssdtCodeQualSubj.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Sorqusb) == false) {
            return false;
        }
        Sorqusb rhs = ((Sorqusb) other);
        return (((((((((this.ssdtCodeQualItt == rhs.ssdtCodeQualItt)||((this.ssdtCodeQualItt!= null)&&this.ssdtCodeQualItt.equals(rhs.ssdtCodeQualItt)))&&((this.ssdtCodeQualIttSt == rhs.ssdtCodeQualIttSt)||((this.ssdtCodeQualIttSt!= null)&&this.ssdtCodeQualIttSt.equals(rhs.ssdtCodeQualIttSt))))&&((this.activityDate == rhs.activityDate)||((this.activityDate!= null)&&this.activityDate.equals(rhs.activityDate))))&&((this.ssdtCodeQualSubjSt == rhs.ssdtCodeQualSubjSt)||((this.ssdtCodeQualSubjSt!= null)&&this.ssdtCodeQualSubjSt.equals(rhs.ssdtCodeQualSubjSt))))&&((this.qualProportion == rhs.qualProportion)||((this.qualProportion!= null)&&this.qualProportion.equals(rhs.qualProportion))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.userId == rhs.userId)||((this.userId!= null)&&this.userId.equals(rhs.userId))))&&((this.ssdtCodeQualSubj == rhs.ssdtCodeQualSubj)||((this.ssdtCodeQualSubj!= null)&&this.ssdtCodeQualSubj.equals(rhs.ssdtCodeQualSubj))));
    }

}
