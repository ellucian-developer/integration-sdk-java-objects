
package com.ellucian.generated.bpapi.ban.student_course_registrations.v1_0_0;

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
    "holdTmstDate",
    "activityDate",
    "tmstMaintIndDesc",
    "tmstCode",
    "term",
    "holdTmstTime",
    "stvtmstDesc"
})
@Generated("jsonschema2pojo")
public class Sfrthst {

    /**
     * Date
     * <p>
     * 
     * 
     */
    @JsonProperty("holdTmstDate")
    private Date holdTmstDate;
    /**
     * Activity Date
     * <p>
     * Lineage reference object : SFRTHST_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    @JsonPropertyDescription("Lineage reference object : SFRTHST_ACTIVITY_DATE")
    private Date activityDate;
    /**
     * Source
     * <p>
     * 
     * 
     */
    @JsonProperty("tmstMaintIndDesc")
    private String tmstMaintIndDesc;
    /**
     * Time Status
     * <p>
     * Lineage reference object : SFRTHST_TMST_CODE, Lookup lineage reference object : stvtmst
     * (Required)
     * 
     */
    @JsonProperty("tmstCode")
    @JsonPropertyDescription("Lineage reference object : SFRTHST_TMST_CODE, Lookup lineage reference object : stvtmst")
    private String tmstCode;
    /**
     * Term
     * <p>
     * 
     * 
     */
    @JsonProperty("term")
    private String term;
    /**
     * Time
     * <p>
     * 
     * 
     */
    @JsonProperty("holdTmstTime")
    private String holdTmstTime;
    /**
     * Description
     * <p>
     * 
     * 
     */
    @JsonProperty("stvtmstDesc")
    private String stvtmstDesc;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Date
     * <p>
     * 
     * 
     */
    @JsonProperty("holdTmstDate")
    public Date getHoldTmstDate() {
        return holdTmstDate;
    }

    /**
     * Date
     * <p>
     * 
     * 
     */
    @JsonProperty("holdTmstDate")
    public void setHoldTmstDate(Date holdTmstDate) {
        this.holdTmstDate = holdTmstDate;
    }

    public Sfrthst withHoldTmstDate(Date holdTmstDate) {
        this.holdTmstDate = holdTmstDate;
        return this;
    }

    /**
     * Activity Date
     * <p>
     * Lineage reference object : SFRTHST_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public Date getActivityDate() {
        return activityDate;
    }

    /**
     * Activity Date
     * <p>
     * Lineage reference object : SFRTHST_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public void setActivityDate(Date activityDate) {
        this.activityDate = activityDate;
    }

    public Sfrthst withActivityDate(Date activityDate) {
        this.activityDate = activityDate;
        return this;
    }

    /**
     * Source
     * <p>
     * 
     * 
     */
    @JsonProperty("tmstMaintIndDesc")
    public String getTmstMaintIndDesc() {
        return tmstMaintIndDesc;
    }

    /**
     * Source
     * <p>
     * 
     * 
     */
    @JsonProperty("tmstMaintIndDesc")
    public void setTmstMaintIndDesc(String tmstMaintIndDesc) {
        this.tmstMaintIndDesc = tmstMaintIndDesc;
    }

    public Sfrthst withTmstMaintIndDesc(String tmstMaintIndDesc) {
        this.tmstMaintIndDesc = tmstMaintIndDesc;
        return this;
    }

    /**
     * Time Status
     * <p>
     * Lineage reference object : SFRTHST_TMST_CODE, Lookup lineage reference object : stvtmst
     * (Required)
     * 
     */
    @JsonProperty("tmstCode")
    public String getTmstCode() {
        return tmstCode;
    }

    /**
     * Time Status
     * <p>
     * Lineage reference object : SFRTHST_TMST_CODE, Lookup lineage reference object : stvtmst
     * (Required)
     * 
     */
    @JsonProperty("tmstCode")
    public void setTmstCode(String tmstCode) {
        this.tmstCode = tmstCode;
    }

    public Sfrthst withTmstCode(String tmstCode) {
        this.tmstCode = tmstCode;
        return this;
    }

    /**
     * Term
     * <p>
     * 
     * 
     */
    @JsonProperty("term")
    public String getTerm() {
        return term;
    }

    /**
     * Term
     * <p>
     * 
     * 
     */
    @JsonProperty("term")
    public void setTerm(String term) {
        this.term = term;
    }

    public Sfrthst withTerm(String term) {
        this.term = term;
        return this;
    }

    /**
     * Time
     * <p>
     * 
     * 
     */
    @JsonProperty("holdTmstTime")
    public String getHoldTmstTime() {
        return holdTmstTime;
    }

    /**
     * Time
     * <p>
     * 
     * 
     */
    @JsonProperty("holdTmstTime")
    public void setHoldTmstTime(String holdTmstTime) {
        this.holdTmstTime = holdTmstTime;
    }

    public Sfrthst withHoldTmstTime(String holdTmstTime) {
        this.holdTmstTime = holdTmstTime;
        return this;
    }

    /**
     * Description
     * <p>
     * 
     * 
     */
    @JsonProperty("stvtmstDesc")
    public String getStvtmstDesc() {
        return stvtmstDesc;
    }

    /**
     * Description
     * <p>
     * 
     * 
     */
    @JsonProperty("stvtmstDesc")
    public void setStvtmstDesc(String stvtmstDesc) {
        this.stvtmstDesc = stvtmstDesc;
    }

    public Sfrthst withStvtmstDesc(String stvtmstDesc) {
        this.stvtmstDesc = stvtmstDesc;
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

    public Sfrthst withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Sfrthst.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("holdTmstDate");
        sb.append('=');
        sb.append(((this.holdTmstDate == null)?"<null>":this.holdTmstDate));
        sb.append(',');
        sb.append("activityDate");
        sb.append('=');
        sb.append(((this.activityDate == null)?"<null>":this.activityDate));
        sb.append(',');
        sb.append("tmstMaintIndDesc");
        sb.append('=');
        sb.append(((this.tmstMaintIndDesc == null)?"<null>":this.tmstMaintIndDesc));
        sb.append(',');
        sb.append("tmstCode");
        sb.append('=');
        sb.append(((this.tmstCode == null)?"<null>":this.tmstCode));
        sb.append(',');
        sb.append("term");
        sb.append('=');
        sb.append(((this.term == null)?"<null>":this.term));
        sb.append(',');
        sb.append("holdTmstTime");
        sb.append('=');
        sb.append(((this.holdTmstTime == null)?"<null>":this.holdTmstTime));
        sb.append(',');
        sb.append("stvtmstDesc");
        sb.append('=');
        sb.append(((this.stvtmstDesc == null)?"<null>":this.stvtmstDesc));
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
        result = ((result* 31)+((this.holdTmstDate == null)? 0 :this.holdTmstDate.hashCode()));
        result = ((result* 31)+((this.activityDate == null)? 0 :this.activityDate.hashCode()));
        result = ((result* 31)+((this.tmstMaintIndDesc == null)? 0 :this.tmstMaintIndDesc.hashCode()));
        result = ((result* 31)+((this.tmstCode == null)? 0 :this.tmstCode.hashCode()));
        result = ((result* 31)+((this.term == null)? 0 :this.term.hashCode()));
        result = ((result* 31)+((this.holdTmstTime == null)? 0 :this.holdTmstTime.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.stvtmstDesc == null)? 0 :this.stvtmstDesc.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Sfrthst) == false) {
            return false;
        }
        Sfrthst rhs = ((Sfrthst) other);
        return (((((((((this.holdTmstDate == rhs.holdTmstDate)||((this.holdTmstDate!= null)&&this.holdTmstDate.equals(rhs.holdTmstDate)))&&((this.activityDate == rhs.activityDate)||((this.activityDate!= null)&&this.activityDate.equals(rhs.activityDate))))&&((this.tmstMaintIndDesc == rhs.tmstMaintIndDesc)||((this.tmstMaintIndDesc!= null)&&this.tmstMaintIndDesc.equals(rhs.tmstMaintIndDesc))))&&((this.tmstCode == rhs.tmstCode)||((this.tmstCode!= null)&&this.tmstCode.equals(rhs.tmstCode))))&&((this.term == rhs.term)||((this.term!= null)&&this.term.equals(rhs.term))))&&((this.holdTmstTime == rhs.holdTmstTime)||((this.holdTmstTime!= null)&&this.holdTmstTime.equals(rhs.holdTmstTime))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.stvtmstDesc == rhs.stvtmstDesc)||((this.stvtmstDesc!= null)&&this.stvtmstDesc.equals(rhs.stvtmstDesc))));
    }

}
