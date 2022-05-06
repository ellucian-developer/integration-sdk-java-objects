
package com.ellucian.generated.bpapi.ban.race_rules.v1_0_0;

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
    "lmsEquiv",
    "activityDate",
    "rracDesc",
    "ediEquiv",
    "rracCode",
    "raceCde",
    "userId",
    "desc"
})
@Generated("jsonschema2pojo")
public class RaceRules100GetResponse {

    /**
     * LMS
     * <p>
     * Lineage reference object : GORRACE_LMS_EQUIV
     * 
     */
    @JsonProperty("lmsEquiv")
    @JsonPropertyDescription("Lineage reference object : GORRACE_LMS_EQUIV")
    private String lmsEquiv;
    /**
     * Activity Date
     * <p>
     * Lineage reference object : GORRACE_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    @JsonPropertyDescription("Lineage reference object : GORRACE_ACTIVITY_DATE")
    private Date activityDate;
    /**
     * Description
     * <p>
     * 
     * 
     */
    @JsonProperty("rracDesc")
    private String rracDesc;
    /**
     * EDI
     * Equivalent
     * <p>
     * Lineage reference object : GORRACE_EDI_EQUIV
     * 
     */
    @JsonProperty("ediEquiv")
    @JsonPropertyDescription("Lineage reference object : GORRACE_EDI_EQUIV")
    private String ediEquiv;
    /**
     * Regulatory
     * Race
     * <p>
     * Lineage reference object : GORRACE_RRAC_CODE, Lookup lineage reference object : gtvrrac
     * (Required)
     * 
     */
    @JsonProperty("rracCode")
    @JsonPropertyDescription("Lineage reference object : GORRACE_RRAC_CODE, Lookup lineage reference object : gtvrrac")
    private String rracCode;
    /**
     * Institution
     * Race
     * <p>
     * Lineage reference object : GORRACE_RACE_CDE
     * (Required)
     * 
     */
    @JsonProperty("raceCde")
    @JsonPropertyDescription("Lineage reference object : GORRACE_RACE_CDE")
    private String raceCde;
    /**
     * User ID
     * <p>
     * Lineage reference object : GORRACE_USER_ID
     * 
     */
    @JsonProperty("userId")
    @JsonPropertyDescription("Lineage reference object : GORRACE_USER_ID")
    private String userId;
    /**
     * Description
     * <p>
     * Lineage reference object : GORRACE_DESC
     * (Required)
     * 
     */
    @JsonProperty("desc")
    @JsonPropertyDescription("Lineage reference object : GORRACE_DESC")
    private String desc;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * LMS
     * <p>
     * Lineage reference object : GORRACE_LMS_EQUIV
     * 
     */
    @JsonProperty("lmsEquiv")
    public String getLmsEquiv() {
        return lmsEquiv;
    }

    /**
     * LMS
     * <p>
     * Lineage reference object : GORRACE_LMS_EQUIV
     * 
     */
    @JsonProperty("lmsEquiv")
    public void setLmsEquiv(String lmsEquiv) {
        this.lmsEquiv = lmsEquiv;
    }

    public RaceRules100GetResponse withLmsEquiv(String lmsEquiv) {
        this.lmsEquiv = lmsEquiv;
        return this;
    }

    /**
     * Activity Date
     * <p>
     * Lineage reference object : GORRACE_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public Date getActivityDate() {
        return activityDate;
    }

    /**
     * Activity Date
     * <p>
     * Lineage reference object : GORRACE_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public void setActivityDate(Date activityDate) {
        this.activityDate = activityDate;
    }

    public RaceRules100GetResponse withActivityDate(Date activityDate) {
        this.activityDate = activityDate;
        return this;
    }

    /**
     * Description
     * <p>
     * 
     * 
     */
    @JsonProperty("rracDesc")
    public String getRracDesc() {
        return rracDesc;
    }

    /**
     * Description
     * <p>
     * 
     * 
     */
    @JsonProperty("rracDesc")
    public void setRracDesc(String rracDesc) {
        this.rracDesc = rracDesc;
    }

    public RaceRules100GetResponse withRracDesc(String rracDesc) {
        this.rracDesc = rracDesc;
        return this;
    }

    /**
     * EDI
     * Equivalent
     * <p>
     * Lineage reference object : GORRACE_EDI_EQUIV
     * 
     */
    @JsonProperty("ediEquiv")
    public String getEdiEquiv() {
        return ediEquiv;
    }

    /**
     * EDI
     * Equivalent
     * <p>
     * Lineage reference object : GORRACE_EDI_EQUIV
     * 
     */
    @JsonProperty("ediEquiv")
    public void setEdiEquiv(String ediEquiv) {
        this.ediEquiv = ediEquiv;
    }

    public RaceRules100GetResponse withEdiEquiv(String ediEquiv) {
        this.ediEquiv = ediEquiv;
        return this;
    }

    /**
     * Regulatory
     * Race
     * <p>
     * Lineage reference object : GORRACE_RRAC_CODE, Lookup lineage reference object : gtvrrac
     * (Required)
     * 
     */
    @JsonProperty("rracCode")
    public String getRracCode() {
        return rracCode;
    }

    /**
     * Regulatory
     * Race
     * <p>
     * Lineage reference object : GORRACE_RRAC_CODE, Lookup lineage reference object : gtvrrac
     * (Required)
     * 
     */
    @JsonProperty("rracCode")
    public void setRracCode(String rracCode) {
        this.rracCode = rracCode;
    }

    public RaceRules100GetResponse withRracCode(String rracCode) {
        this.rracCode = rracCode;
        return this;
    }

    /**
     * Institution
     * Race
     * <p>
     * Lineage reference object : GORRACE_RACE_CDE
     * (Required)
     * 
     */
    @JsonProperty("raceCde")
    public String getRaceCde() {
        return raceCde;
    }

    /**
     * Institution
     * Race
     * <p>
     * Lineage reference object : GORRACE_RACE_CDE
     * (Required)
     * 
     */
    @JsonProperty("raceCde")
    public void setRaceCde(String raceCde) {
        this.raceCde = raceCde;
    }

    public RaceRules100GetResponse withRaceCde(String raceCde) {
        this.raceCde = raceCde;
        return this;
    }

    /**
     * User ID
     * <p>
     * Lineage reference object : GORRACE_USER_ID
     * 
     */
    @JsonProperty("userId")
    public String getUserId() {
        return userId;
    }

    /**
     * User ID
     * <p>
     * Lineage reference object : GORRACE_USER_ID
     * 
     */
    @JsonProperty("userId")
    public void setUserId(String userId) {
        this.userId = userId;
    }

    public RaceRules100GetResponse withUserId(String userId) {
        this.userId = userId;
        return this;
    }

    /**
     * Description
     * <p>
     * Lineage reference object : GORRACE_DESC
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
     * Lineage reference object : GORRACE_DESC
     * (Required)
     * 
     */
    @JsonProperty("desc")
    public void setDesc(String desc) {
        this.desc = desc;
    }

    public RaceRules100GetResponse withDesc(String desc) {
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

    public RaceRules100GetResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(RaceRules100GetResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("lmsEquiv");
        sb.append('=');
        sb.append(((this.lmsEquiv == null)?"<null>":this.lmsEquiv));
        sb.append(',');
        sb.append("activityDate");
        sb.append('=');
        sb.append(((this.activityDate == null)?"<null>":this.activityDate));
        sb.append(',');
        sb.append("rracDesc");
        sb.append('=');
        sb.append(((this.rracDesc == null)?"<null>":this.rracDesc));
        sb.append(',');
        sb.append("ediEquiv");
        sb.append('=');
        sb.append(((this.ediEquiv == null)?"<null>":this.ediEquiv));
        sb.append(',');
        sb.append("rracCode");
        sb.append('=');
        sb.append(((this.rracCode == null)?"<null>":this.rracCode));
        sb.append(',');
        sb.append("raceCde");
        sb.append('=');
        sb.append(((this.raceCde == null)?"<null>":this.raceCde));
        sb.append(',');
        sb.append("userId");
        sb.append('=');
        sb.append(((this.userId == null)?"<null>":this.userId));
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
        result = ((result* 31)+((this.lmsEquiv == null)? 0 :this.lmsEquiv.hashCode()));
        result = ((result* 31)+((this.activityDate == null)? 0 :this.activityDate.hashCode()));
        result = ((result* 31)+((this.rracDesc == null)? 0 :this.rracDesc.hashCode()));
        result = ((result* 31)+((this.ediEquiv == null)? 0 :this.ediEquiv.hashCode()));
        result = ((result* 31)+((this.rracCode == null)? 0 :this.rracCode.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.raceCde == null)? 0 :this.raceCde.hashCode()));
        result = ((result* 31)+((this.userId == null)? 0 :this.userId.hashCode()));
        result = ((result* 31)+((this.desc == null)? 0 :this.desc.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof RaceRules100GetResponse) == false) {
            return false;
        }
        RaceRules100GetResponse rhs = ((RaceRules100GetResponse) other);
        return ((((((((((this.lmsEquiv == rhs.lmsEquiv)||((this.lmsEquiv!= null)&&this.lmsEquiv.equals(rhs.lmsEquiv)))&&((this.activityDate == rhs.activityDate)||((this.activityDate!= null)&&this.activityDate.equals(rhs.activityDate))))&&((this.rracDesc == rhs.rracDesc)||((this.rracDesc!= null)&&this.rracDesc.equals(rhs.rracDesc))))&&((this.ediEquiv == rhs.ediEquiv)||((this.ediEquiv!= null)&&this.ediEquiv.equals(rhs.ediEquiv))))&&((this.rracCode == rhs.rracCode)||((this.rracCode!= null)&&this.rracCode.equals(rhs.rracCode))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.raceCde == rhs.raceCde)||((this.raceCde!= null)&&this.raceCde.equals(rhs.raceCde))))&&((this.userId == rhs.userId)||((this.userId!= null)&&this.userId.equals(rhs.userId))))&&((this.desc == rhs.desc)||((this.desc!= null)&&this.desc.equals(rhs.desc))));
    }

}
