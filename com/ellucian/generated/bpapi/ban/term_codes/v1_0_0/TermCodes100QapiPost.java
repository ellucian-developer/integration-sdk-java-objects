
package com.ellucian.generated.bpapi.ban.term_codes.v1_0_0;

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
    "acyrCode",
    "code",
    "desc",
    "endDate",
    "faEndPeriod",
    "faPeriod",
    "faProcYr",
    "faSummerInd",
    "faTerm",
    "housingEndDate",
    "housingStartDate",
    "startDate",
    "systemReqInd",
    "trmtCode"
})
@Generated("jsonschema2pojo")
public class TermCodes100QapiPost {

    /**
     * Activity Date
     * <p>
     * Lineage reference object : STVTERM_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    @JsonPropertyDescription("Lineage reference object : STVTERM_ACTIVITY_DATE")
    private Date activityDate;
    /**
     * Academic Year
     * <p>
     * Lineage reference object : STVTERM_ACYR_CODE, Lookup lineage reference object : stvacyr
     * 
     */
    @JsonProperty("acyrCode")
    @JsonPropertyDescription("Lineage reference object : STVTERM_ACYR_CODE, Lookup lineage reference object : stvacyr")
    private String acyrCode;
    /**
     * Term
     * <p>
     * Lineage reference object : STVTERM_CODE
     * 
     */
    @JsonProperty("code")
    @JsonPropertyDescription("Lineage reference object : STVTERM_CODE")
    private String code;
    /**
     * Term Description
     * <p>
     * Lineage reference object : STVTERM_DESC
     * 
     */
    @JsonProperty("desc")
    @JsonPropertyDescription("Lineage reference object : STVTERM_DESC")
    private String desc;
    /**
     * Term End Date
     * <p>
     * Lineage reference object : STVTERM_END_DATE
     * 
     */
    @JsonProperty("endDate")
    @JsonPropertyDescription("Lineage reference object : STVTERM_END_DATE")
    private Date endDate;
    /**
     * Ending Period
     * <p>
     * Lineage reference object : STVTERM_FA_END_PERIOD
     * 
     */
    @JsonProperty("faEndPeriod")
    @JsonPropertyDescription("Lineage reference object : STVTERM_FA_END_PERIOD")
    private Double faEndPeriod;
    /**
     * Beginning Period
     * <p>
     * Lineage reference object : STVTERM_FA_PERIOD
     * 
     */
    @JsonProperty("faPeriod")
    @JsonPropertyDescription("Lineage reference object : STVTERM_FA_PERIOD")
    private Double faPeriod;
    /**
     * Financial Aid Process Year
     * <p>
     * Lineage reference object : STVTERM_FA_PROC_YR
     * 
     */
    @JsonProperty("faProcYr")
    @JsonPropertyDescription("Lineage reference object : STVTERM_FA_PROC_YR")
    private String faProcYr;
    /**
     * Summer
     * <p>
     * Lineage reference object : STVTERM_FA_SUMMER_IND
     * 
     */
    @JsonProperty("faSummerInd")
    @JsonPropertyDescription("Lineage reference object : STVTERM_FA_SUMMER_IND")
    private String faSummerInd;
    /**
     * Term
     * <p>
     * Lineage reference object : STVTERM_FA_TERM
     * 
     */
    @JsonProperty("faTerm")
    @JsonPropertyDescription("Lineage reference object : STVTERM_FA_TERM")
    private String faTerm;
    /**
     * Housing End Date
     * <p>
     * Lineage reference object : STVTERM_HOUSING_END_DATE
     * 
     */
    @JsonProperty("housingEndDate")
    @JsonPropertyDescription("Lineage reference object : STVTERM_HOUSING_END_DATE")
    private Date housingEndDate;
    /**
     * Housing Start Date
     * <p>
     * Lineage reference object : STVTERM_HOUSING_START_DATE
     * 
     */
    @JsonProperty("housingStartDate")
    @JsonPropertyDescription("Lineage reference object : STVTERM_HOUSING_START_DATE")
    private Date housingStartDate;
    /**
     * Term Start Date
     * <p>
     * Lineage reference object : STVTERM_START_DATE
     * 
     */
    @JsonProperty("startDate")
    @JsonPropertyDescription("Lineage reference object : STVTERM_START_DATE")
    private Date startDate;
    /**
     * System Required
     * <p>
     * Lineage reference object : STVTERM_SYSTEM_REQ_IND
     * 
     */
    @JsonProperty("systemReqInd")
    @JsonPropertyDescription("Lineage reference object : STVTERM_SYSTEM_REQ_IND")
    private String systemReqInd;
    /**
     * Term Type
     * <p>
     * Lineage reference object : STVTERM_TRMT_CODE, Lookup lineage reference object : stvtrmt
     * 
     */
    @JsonProperty("trmtCode")
    @JsonPropertyDescription("Lineage reference object : STVTERM_TRMT_CODE, Lookup lineage reference object : stvtrmt")
    private String trmtCode;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Activity Date
     * <p>
     * Lineage reference object : STVTERM_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public Date getActivityDate() {
        return activityDate;
    }

    /**
     * Activity Date
     * <p>
     * Lineage reference object : STVTERM_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public void setActivityDate(Date activityDate) {
        this.activityDate = activityDate;
    }

    public TermCodes100QapiPost withActivityDate(Date activityDate) {
        this.activityDate = activityDate;
        return this;
    }

    /**
     * Academic Year
     * <p>
     * Lineage reference object : STVTERM_ACYR_CODE, Lookup lineage reference object : stvacyr
     * 
     */
    @JsonProperty("acyrCode")
    public String getAcyrCode() {
        return acyrCode;
    }

    /**
     * Academic Year
     * <p>
     * Lineage reference object : STVTERM_ACYR_CODE, Lookup lineage reference object : stvacyr
     * 
     */
    @JsonProperty("acyrCode")
    public void setAcyrCode(String acyrCode) {
        this.acyrCode = acyrCode;
    }

    public TermCodes100QapiPost withAcyrCode(String acyrCode) {
        this.acyrCode = acyrCode;
        return this;
    }

    /**
     * Term
     * <p>
     * Lineage reference object : STVTERM_CODE
     * 
     */
    @JsonProperty("code")
    public String getCode() {
        return code;
    }

    /**
     * Term
     * <p>
     * Lineage reference object : STVTERM_CODE
     * 
     */
    @JsonProperty("code")
    public void setCode(String code) {
        this.code = code;
    }

    public TermCodes100QapiPost withCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * Term Description
     * <p>
     * Lineage reference object : STVTERM_DESC
     * 
     */
    @JsonProperty("desc")
    public String getDesc() {
        return desc;
    }

    /**
     * Term Description
     * <p>
     * Lineage reference object : STVTERM_DESC
     * 
     */
    @JsonProperty("desc")
    public void setDesc(String desc) {
        this.desc = desc;
    }

    public TermCodes100QapiPost withDesc(String desc) {
        this.desc = desc;
        return this;
    }

    /**
     * Term End Date
     * <p>
     * Lineage reference object : STVTERM_END_DATE
     * 
     */
    @JsonProperty("endDate")
    public Date getEndDate() {
        return endDate;
    }

    /**
     * Term End Date
     * <p>
     * Lineage reference object : STVTERM_END_DATE
     * 
     */
    @JsonProperty("endDate")
    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public TermCodes100QapiPost withEndDate(Date endDate) {
        this.endDate = endDate;
        return this;
    }

    /**
     * Ending Period
     * <p>
     * Lineage reference object : STVTERM_FA_END_PERIOD
     * 
     */
    @JsonProperty("faEndPeriod")
    public Double getFaEndPeriod() {
        return faEndPeriod;
    }

    /**
     * Ending Period
     * <p>
     * Lineage reference object : STVTERM_FA_END_PERIOD
     * 
     */
    @JsonProperty("faEndPeriod")
    public void setFaEndPeriod(Double faEndPeriod) {
        this.faEndPeriod = faEndPeriod;
    }

    public TermCodes100QapiPost withFaEndPeriod(Double faEndPeriod) {
        this.faEndPeriod = faEndPeriod;
        return this;
    }

    /**
     * Beginning Period
     * <p>
     * Lineage reference object : STVTERM_FA_PERIOD
     * 
     */
    @JsonProperty("faPeriod")
    public Double getFaPeriod() {
        return faPeriod;
    }

    /**
     * Beginning Period
     * <p>
     * Lineage reference object : STVTERM_FA_PERIOD
     * 
     */
    @JsonProperty("faPeriod")
    public void setFaPeriod(Double faPeriod) {
        this.faPeriod = faPeriod;
    }

    public TermCodes100QapiPost withFaPeriod(Double faPeriod) {
        this.faPeriod = faPeriod;
        return this;
    }

    /**
     * Financial Aid Process Year
     * <p>
     * Lineage reference object : STVTERM_FA_PROC_YR
     * 
     */
    @JsonProperty("faProcYr")
    public String getFaProcYr() {
        return faProcYr;
    }

    /**
     * Financial Aid Process Year
     * <p>
     * Lineage reference object : STVTERM_FA_PROC_YR
     * 
     */
    @JsonProperty("faProcYr")
    public void setFaProcYr(String faProcYr) {
        this.faProcYr = faProcYr;
    }

    public TermCodes100QapiPost withFaProcYr(String faProcYr) {
        this.faProcYr = faProcYr;
        return this;
    }

    /**
     * Summer
     * <p>
     * Lineage reference object : STVTERM_FA_SUMMER_IND
     * 
     */
    @JsonProperty("faSummerInd")
    public String getFaSummerInd() {
        return faSummerInd;
    }

    /**
     * Summer
     * <p>
     * Lineage reference object : STVTERM_FA_SUMMER_IND
     * 
     */
    @JsonProperty("faSummerInd")
    public void setFaSummerInd(String faSummerInd) {
        this.faSummerInd = faSummerInd;
    }

    public TermCodes100QapiPost withFaSummerInd(String faSummerInd) {
        this.faSummerInd = faSummerInd;
        return this;
    }

    /**
     * Term
     * <p>
     * Lineage reference object : STVTERM_FA_TERM
     * 
     */
    @JsonProperty("faTerm")
    public String getFaTerm() {
        return faTerm;
    }

    /**
     * Term
     * <p>
     * Lineage reference object : STVTERM_FA_TERM
     * 
     */
    @JsonProperty("faTerm")
    public void setFaTerm(String faTerm) {
        this.faTerm = faTerm;
    }

    public TermCodes100QapiPost withFaTerm(String faTerm) {
        this.faTerm = faTerm;
        return this;
    }

    /**
     * Housing End Date
     * <p>
     * Lineage reference object : STVTERM_HOUSING_END_DATE
     * 
     */
    @JsonProperty("housingEndDate")
    public Date getHousingEndDate() {
        return housingEndDate;
    }

    /**
     * Housing End Date
     * <p>
     * Lineage reference object : STVTERM_HOUSING_END_DATE
     * 
     */
    @JsonProperty("housingEndDate")
    public void setHousingEndDate(Date housingEndDate) {
        this.housingEndDate = housingEndDate;
    }

    public TermCodes100QapiPost withHousingEndDate(Date housingEndDate) {
        this.housingEndDate = housingEndDate;
        return this;
    }

    /**
     * Housing Start Date
     * <p>
     * Lineage reference object : STVTERM_HOUSING_START_DATE
     * 
     */
    @JsonProperty("housingStartDate")
    public Date getHousingStartDate() {
        return housingStartDate;
    }

    /**
     * Housing Start Date
     * <p>
     * Lineage reference object : STVTERM_HOUSING_START_DATE
     * 
     */
    @JsonProperty("housingStartDate")
    public void setHousingStartDate(Date housingStartDate) {
        this.housingStartDate = housingStartDate;
    }

    public TermCodes100QapiPost withHousingStartDate(Date housingStartDate) {
        this.housingStartDate = housingStartDate;
        return this;
    }

    /**
     * Term Start Date
     * <p>
     * Lineage reference object : STVTERM_START_DATE
     * 
     */
    @JsonProperty("startDate")
    public Date getStartDate() {
        return startDate;
    }

    /**
     * Term Start Date
     * <p>
     * Lineage reference object : STVTERM_START_DATE
     * 
     */
    @JsonProperty("startDate")
    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public TermCodes100QapiPost withStartDate(Date startDate) {
        this.startDate = startDate;
        return this;
    }

    /**
     * System Required
     * <p>
     * Lineage reference object : STVTERM_SYSTEM_REQ_IND
     * 
     */
    @JsonProperty("systemReqInd")
    public String getSystemReqInd() {
        return systemReqInd;
    }

    /**
     * System Required
     * <p>
     * Lineage reference object : STVTERM_SYSTEM_REQ_IND
     * 
     */
    @JsonProperty("systemReqInd")
    public void setSystemReqInd(String systemReqInd) {
        this.systemReqInd = systemReqInd;
    }

    public TermCodes100QapiPost withSystemReqInd(String systemReqInd) {
        this.systemReqInd = systemReqInd;
        return this;
    }

    /**
     * Term Type
     * <p>
     * Lineage reference object : STVTERM_TRMT_CODE, Lookup lineage reference object : stvtrmt
     * 
     */
    @JsonProperty("trmtCode")
    public String getTrmtCode() {
        return trmtCode;
    }

    /**
     * Term Type
     * <p>
     * Lineage reference object : STVTERM_TRMT_CODE, Lookup lineage reference object : stvtrmt
     * 
     */
    @JsonProperty("trmtCode")
    public void setTrmtCode(String trmtCode) {
        this.trmtCode = trmtCode;
    }

    public TermCodes100QapiPost withTrmtCode(String trmtCode) {
        this.trmtCode = trmtCode;
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

    public TermCodes100QapiPost withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(TermCodes100QapiPost.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("activityDate");
        sb.append('=');
        sb.append(((this.activityDate == null)?"<null>":this.activityDate));
        sb.append(',');
        sb.append("acyrCode");
        sb.append('=');
        sb.append(((this.acyrCode == null)?"<null>":this.acyrCode));
        sb.append(',');
        sb.append("code");
        sb.append('=');
        sb.append(((this.code == null)?"<null>":this.code));
        sb.append(',');
        sb.append("desc");
        sb.append('=');
        sb.append(((this.desc == null)?"<null>":this.desc));
        sb.append(',');
        sb.append("endDate");
        sb.append('=');
        sb.append(((this.endDate == null)?"<null>":this.endDate));
        sb.append(',');
        sb.append("faEndPeriod");
        sb.append('=');
        sb.append(((this.faEndPeriod == null)?"<null>":this.faEndPeriod));
        sb.append(',');
        sb.append("faPeriod");
        sb.append('=');
        sb.append(((this.faPeriod == null)?"<null>":this.faPeriod));
        sb.append(',');
        sb.append("faProcYr");
        sb.append('=');
        sb.append(((this.faProcYr == null)?"<null>":this.faProcYr));
        sb.append(',');
        sb.append("faSummerInd");
        sb.append('=');
        sb.append(((this.faSummerInd == null)?"<null>":this.faSummerInd));
        sb.append(',');
        sb.append("faTerm");
        sb.append('=');
        sb.append(((this.faTerm == null)?"<null>":this.faTerm));
        sb.append(',');
        sb.append("housingEndDate");
        sb.append('=');
        sb.append(((this.housingEndDate == null)?"<null>":this.housingEndDate));
        sb.append(',');
        sb.append("housingStartDate");
        sb.append('=');
        sb.append(((this.housingStartDate == null)?"<null>":this.housingStartDate));
        sb.append(',');
        sb.append("startDate");
        sb.append('=');
        sb.append(((this.startDate == null)?"<null>":this.startDate));
        sb.append(',');
        sb.append("systemReqInd");
        sb.append('=');
        sb.append(((this.systemReqInd == null)?"<null>":this.systemReqInd));
        sb.append(',');
        sb.append("trmtCode");
        sb.append('=');
        sb.append(((this.trmtCode == null)?"<null>":this.trmtCode));
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
        result = ((result* 31)+((this.faPeriod == null)? 0 :this.faPeriod.hashCode()));
        result = ((result* 31)+((this.code == null)? 0 :this.code.hashCode()));
        result = ((result* 31)+((this.trmtCode == null)? 0 :this.trmtCode.hashCode()));
        result = ((result* 31)+((this.systemReqInd == null)? 0 :this.systemReqInd.hashCode()));
        result = ((result* 31)+((this.endDate == null)? 0 :this.endDate.hashCode()));
        result = ((result* 31)+((this.faTerm == null)? 0 :this.faTerm.hashCode()));
        result = ((result* 31)+((this.faSummerInd == null)? 0 :this.faSummerInd.hashCode()));
        result = ((result* 31)+((this.activityDate == null)? 0 :this.activityDate.hashCode()));
        result = ((result* 31)+((this.acyrCode == null)? 0 :this.acyrCode.hashCode()));
        result = ((result* 31)+((this.housingEndDate == null)? 0 :this.housingEndDate.hashCode()));
        result = ((result* 31)+((this.faProcYr == null)? 0 :this.faProcYr.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.faEndPeriod == null)? 0 :this.faEndPeriod.hashCode()));
        result = ((result* 31)+((this.startDate == null)? 0 :this.startDate.hashCode()));
        result = ((result* 31)+((this.desc == null)? 0 :this.desc.hashCode()));
        result = ((result* 31)+((this.housingStartDate == null)? 0 :this.housingStartDate.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof TermCodes100QapiPost) == false) {
            return false;
        }
        TermCodes100QapiPost rhs = ((TermCodes100QapiPost) other);
        return (((((((((((((((((this.faPeriod == rhs.faPeriod)||((this.faPeriod!= null)&&this.faPeriod.equals(rhs.faPeriod)))&&((this.code == rhs.code)||((this.code!= null)&&this.code.equals(rhs.code))))&&((this.trmtCode == rhs.trmtCode)||((this.trmtCode!= null)&&this.trmtCode.equals(rhs.trmtCode))))&&((this.systemReqInd == rhs.systemReqInd)||((this.systemReqInd!= null)&&this.systemReqInd.equals(rhs.systemReqInd))))&&((this.endDate == rhs.endDate)||((this.endDate!= null)&&this.endDate.equals(rhs.endDate))))&&((this.faTerm == rhs.faTerm)||((this.faTerm!= null)&&this.faTerm.equals(rhs.faTerm))))&&((this.faSummerInd == rhs.faSummerInd)||((this.faSummerInd!= null)&&this.faSummerInd.equals(rhs.faSummerInd))))&&((this.activityDate == rhs.activityDate)||((this.activityDate!= null)&&this.activityDate.equals(rhs.activityDate))))&&((this.acyrCode == rhs.acyrCode)||((this.acyrCode!= null)&&this.acyrCode.equals(rhs.acyrCode))))&&((this.housingEndDate == rhs.housingEndDate)||((this.housingEndDate!= null)&&this.housingEndDate.equals(rhs.housingEndDate))))&&((this.faProcYr == rhs.faProcYr)||((this.faProcYr!= null)&&this.faProcYr.equals(rhs.faProcYr))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.faEndPeriod == rhs.faEndPeriod)||((this.faEndPeriod!= null)&&this.faEndPeriod.equals(rhs.faEndPeriod))))&&((this.startDate == rhs.startDate)||((this.startDate!= null)&&this.startDate.equals(rhs.startDate))))&&((this.desc == rhs.desc)||((this.desc!= null)&&this.desc.equals(rhs.desc))))&&((this.housingStartDate == rhs.housingStartDate)||((this.housingStartDate!= null)&&this.housingStartDate.equals(rhs.housingStartDate))));
    }

}
