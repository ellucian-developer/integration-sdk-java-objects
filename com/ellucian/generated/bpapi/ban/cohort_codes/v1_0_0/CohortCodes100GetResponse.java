
package com.ellucian.generated.bpapi.ban.cohort_codes.v1_0_0;

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
    "code",
    "termCodeStart",
    "rightInd",
    "termCode100Prcnt",
    "dlevCode",
    "termCodeEnd",
    "desc"
})
@Generated("jsonschema2pojo")
public class CohortCodes100GetResponse {

    /**
     * Activity Date
     * <p>
     * Lineage reference object : STVCHRT_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    @JsonPropertyDescription("Lineage reference object : STVCHRT_ACTIVITY_DATE")
    private Date activityDate;
    /**
     * Cohort Code
     * <p>
     * Lineage reference object : STVCHRT_CODE
     * (Required)
     * 
     */
    @JsonProperty("code")
    @JsonPropertyDescription("Lineage reference object : STVCHRT_CODE")
    private String code;
    /**
     * Start Term
     * <p>
     * Lineage reference object : STVCHRT_TERM_CODE_START, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("termCodeStart")
    @JsonPropertyDescription("Lineage reference object : STVCHRT_TERM_CODE_START, Lookup lineage reference object : stvterm")
    private String termCodeStart;
    /**
     * Lineage reference object : STVCHRT_RIGHT_IND
     * 
     */
    @JsonProperty("rightInd")
    @JsonPropertyDescription("Lineage reference object : STVCHRT_RIGHT_IND")
    private String rightInd;
    /**
     * Lineage reference object : STVCHRT_TERM_CODE_100PRCNT, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("termCode100Prcnt")
    @JsonPropertyDescription("Lineage reference object : STVCHRT_TERM_CODE_100PRCNT, Lookup lineage reference object : stvterm")
    private String termCode100Prcnt;
    /**
     * Degree Level
     * <p>
     * Lineage reference object : STVCHRT_DLEV_CODE, Lookup lineage reference object : stvdlev
     * 
     */
    @JsonProperty("dlevCode")
    @JsonPropertyDescription("Lineage reference object : STVCHRT_DLEV_CODE, Lookup lineage reference object : stvdlev")
    private String dlevCode;
    /**
     * End Term
     * <p>
     * Lineage reference object : STVCHRT_TERM_CODE_END, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("termCodeEnd")
    @JsonPropertyDescription("Lineage reference object : STVCHRT_TERM_CODE_END, Lookup lineage reference object : stvterm")
    private String termCodeEnd;
    /**
     * Description
     * <p>
     * Lineage reference object : STVCHRT_DESC
     * (Required)
     * 
     */
    @JsonProperty("desc")
    @JsonPropertyDescription("Lineage reference object : STVCHRT_DESC")
    private String desc;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Activity Date
     * <p>
     * Lineage reference object : STVCHRT_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public Date getActivityDate() {
        return activityDate;
    }

    /**
     * Activity Date
     * <p>
     * Lineage reference object : STVCHRT_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public void setActivityDate(Date activityDate) {
        this.activityDate = activityDate;
    }

    public CohortCodes100GetResponse withActivityDate(Date activityDate) {
        this.activityDate = activityDate;
        return this;
    }

    /**
     * Cohort Code
     * <p>
     * Lineage reference object : STVCHRT_CODE
     * (Required)
     * 
     */
    @JsonProperty("code")
    public String getCode() {
        return code;
    }

    /**
     * Cohort Code
     * <p>
     * Lineage reference object : STVCHRT_CODE
     * (Required)
     * 
     */
    @JsonProperty("code")
    public void setCode(String code) {
        this.code = code;
    }

    public CohortCodes100GetResponse withCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * Start Term
     * <p>
     * Lineage reference object : STVCHRT_TERM_CODE_START, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("termCodeStart")
    public String getTermCodeStart() {
        return termCodeStart;
    }

    /**
     * Start Term
     * <p>
     * Lineage reference object : STVCHRT_TERM_CODE_START, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("termCodeStart")
    public void setTermCodeStart(String termCodeStart) {
        this.termCodeStart = termCodeStart;
    }

    public CohortCodes100GetResponse withTermCodeStart(String termCodeStart) {
        this.termCodeStart = termCodeStart;
        return this;
    }

    /**
     * Lineage reference object : STVCHRT_RIGHT_IND
     * 
     */
    @JsonProperty("rightInd")
    public String getRightInd() {
        return rightInd;
    }

    /**
     * Lineage reference object : STVCHRT_RIGHT_IND
     * 
     */
    @JsonProperty("rightInd")
    public void setRightInd(String rightInd) {
        this.rightInd = rightInd;
    }

    public CohortCodes100GetResponse withRightInd(String rightInd) {
        this.rightInd = rightInd;
        return this;
    }

    /**
     * Lineage reference object : STVCHRT_TERM_CODE_100PRCNT, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("termCode100Prcnt")
    public String getTermCode100Prcnt() {
        return termCode100Prcnt;
    }

    /**
     * Lineage reference object : STVCHRT_TERM_CODE_100PRCNT, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("termCode100Prcnt")
    public void setTermCode100Prcnt(String termCode100Prcnt) {
        this.termCode100Prcnt = termCode100Prcnt;
    }

    public CohortCodes100GetResponse withTermCode100Prcnt(String termCode100Prcnt) {
        this.termCode100Prcnt = termCode100Prcnt;
        return this;
    }

    /**
     * Degree Level
     * <p>
     * Lineage reference object : STVCHRT_DLEV_CODE, Lookup lineage reference object : stvdlev
     * 
     */
    @JsonProperty("dlevCode")
    public String getDlevCode() {
        return dlevCode;
    }

    /**
     * Degree Level
     * <p>
     * Lineage reference object : STVCHRT_DLEV_CODE, Lookup lineage reference object : stvdlev
     * 
     */
    @JsonProperty("dlevCode")
    public void setDlevCode(String dlevCode) {
        this.dlevCode = dlevCode;
    }

    public CohortCodes100GetResponse withDlevCode(String dlevCode) {
        this.dlevCode = dlevCode;
        return this;
    }

    /**
     * End Term
     * <p>
     * Lineage reference object : STVCHRT_TERM_CODE_END, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("termCodeEnd")
    public String getTermCodeEnd() {
        return termCodeEnd;
    }

    /**
     * End Term
     * <p>
     * Lineage reference object : STVCHRT_TERM_CODE_END, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("termCodeEnd")
    public void setTermCodeEnd(String termCodeEnd) {
        this.termCodeEnd = termCodeEnd;
    }

    public CohortCodes100GetResponse withTermCodeEnd(String termCodeEnd) {
        this.termCodeEnd = termCodeEnd;
        return this;
    }

    /**
     * Description
     * <p>
     * Lineage reference object : STVCHRT_DESC
     * (Required)
     * 
     */
    @JsonProperty("desc")
    public String getDesc() {
        return desc;
    }

    /**
     * Description
     * <p>
     * Lineage reference object : STVCHRT_DESC
     * (Required)
     * 
     */
    @JsonProperty("desc")
    public void setDesc(String desc) {
        this.desc = desc;
    }

    public CohortCodes100GetResponse withDesc(String desc) {
        this.desc = desc;
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

    public CohortCodes100GetResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(CohortCodes100GetResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("activityDate");
        sb.append('=');
        sb.append(((this.activityDate == null)?"<null>":this.activityDate));
        sb.append(',');
        sb.append("code");
        sb.append('=');
        sb.append(((this.code == null)?"<null>":this.code));
        sb.append(',');
        sb.append("termCodeStart");
        sb.append('=');
        sb.append(((this.termCodeStart == null)?"<null>":this.termCodeStart));
        sb.append(',');
        sb.append("rightInd");
        sb.append('=');
        sb.append(((this.rightInd == null)?"<null>":this.rightInd));
        sb.append(',');
        sb.append("termCode100Prcnt");
        sb.append('=');
        sb.append(((this.termCode100Prcnt == null)?"<null>":this.termCode100Prcnt));
        sb.append(',');
        sb.append("dlevCode");
        sb.append('=');
        sb.append(((this.dlevCode == null)?"<null>":this.dlevCode));
        sb.append(',');
        sb.append("termCodeEnd");
        sb.append('=');
        sb.append(((this.termCodeEnd == null)?"<null>":this.termCodeEnd));
        sb.append(',');
        sb.append("desc");
        sb.append('=');
        sb.append(((this.desc == null)?"<null>":this.desc));
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
        result = ((result* 31)+((this.code == null)? 0 :this.code.hashCode()));
        result = ((result* 31)+((this.termCodeStart == null)? 0 :this.termCodeStart.hashCode()));
        result = ((result* 31)+((this.rightInd == null)? 0 :this.rightInd.hashCode()));
        result = ((result* 31)+((this.termCode100Prcnt == null)? 0 :this.termCode100Prcnt.hashCode()));
        result = ((result* 31)+((this.dlevCode == null)? 0 :this.dlevCode.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.termCodeEnd == null)? 0 :this.termCodeEnd.hashCode()));
        result = ((result* 31)+((this.desc == null)? 0 :this.desc.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof CohortCodes100GetResponse) == false) {
            return false;
        }
        CohortCodes100GetResponse rhs = ((CohortCodes100GetResponse) other);
        return ((((((((((this.activityDate == rhs.activityDate)||((this.activityDate!= null)&&this.activityDate.equals(rhs.activityDate)))&&((this.code == rhs.code)||((this.code!= null)&&this.code.equals(rhs.code))))&&((this.termCodeStart == rhs.termCodeStart)||((this.termCodeStart!= null)&&this.termCodeStart.equals(rhs.termCodeStart))))&&((this.rightInd == rhs.rightInd)||((this.rightInd!= null)&&this.rightInd.equals(rhs.rightInd))))&&((this.termCode100Prcnt == rhs.termCode100Prcnt)||((this.termCode100Prcnt!= null)&&this.termCode100Prcnt.equals(rhs.termCode100Prcnt))))&&((this.dlevCode == rhs.dlevCode)||((this.dlevCode!= null)&&this.dlevCode.equals(rhs.dlevCode))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.termCodeEnd == rhs.termCodeEnd)||((this.termCodeEnd!= null)&&this.termCodeEnd.equals(rhs.termCodeEnd))))&&((this.desc == rhs.desc)||((this.desc!= null)&&this.desc.equals(rhs.desc))));
    }

}
