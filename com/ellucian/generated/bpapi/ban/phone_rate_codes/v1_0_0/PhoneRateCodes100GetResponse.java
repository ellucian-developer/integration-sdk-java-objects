
package com.ellucian.generated.bpapi.ban.phone_rate_codes.v1_0_0;

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
    "monthlyInd",
    "dailyInd",
    "desc",
    "termlyInd"
})
@Generated("jsonschema2pojo")
public class PhoneRateCodes100GetResponse {

    /**
     * Activity Date
     * <p>
     * Lineage reference object : STVPRCD_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    @JsonPropertyDescription("Lineage reference object : STVPRCD_ACTIVITY_DATE")
    private Date activityDate;
    /**
     * Code
     * <p>
     * Lineage reference object : STVPRCD_CODE
     * (Required)
     * 
     */
    @JsonProperty("code")
    @JsonPropertyDescription("Lineage reference object : STVPRCD_CODE")
    private String code;
    /**
     * Lineage reference object : STVPRCD_MONTHLY_IND
     * 
     */
    @JsonProperty("monthlyInd")
    @JsonPropertyDescription("Lineage reference object : STVPRCD_MONTHLY_IND")
    private String monthlyInd;
    /**
     * Lineage reference object : STVPRCD_DAILY_IND
     * 
     */
    @JsonProperty("dailyInd")
    @JsonPropertyDescription("Lineage reference object : STVPRCD_DAILY_IND")
    private String dailyInd;
    /**
     * Description
     * <p>
     * Lineage reference object : STVPRCD_DESC
     * (Required)
     * 
     */
    @JsonProperty("desc")
    @JsonPropertyDescription("Lineage reference object : STVPRCD_DESC")
    private String desc;
    /**
     * Lineage reference object : STVPRCD_TERMLY_IND
     * 
     */
    @JsonProperty("termlyInd")
    @JsonPropertyDescription("Lineage reference object : STVPRCD_TERMLY_IND")
    private String termlyInd;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Activity Date
     * <p>
     * Lineage reference object : STVPRCD_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public Date getActivityDate() {
        return activityDate;
    }

    /**
     * Activity Date
     * <p>
     * Lineage reference object : STVPRCD_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public void setActivityDate(Date activityDate) {
        this.activityDate = activityDate;
    }

    public PhoneRateCodes100GetResponse withActivityDate(Date activityDate) {
        this.activityDate = activityDate;
        return this;
    }

    /**
     * Code
     * <p>
     * Lineage reference object : STVPRCD_CODE
     * (Required)
     * 
     */
    @JsonProperty("code")
    public String getCode() {
        return code;
    }

    /**
     * Code
     * <p>
     * Lineage reference object : STVPRCD_CODE
     * (Required)
     * 
     */
    @JsonProperty("code")
    public void setCode(String code) {
        this.code = code;
    }

    public PhoneRateCodes100GetResponse withCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * Lineage reference object : STVPRCD_MONTHLY_IND
     * 
     */
    @JsonProperty("monthlyInd")
    public String getMonthlyInd() {
        return monthlyInd;
    }

    /**
     * Lineage reference object : STVPRCD_MONTHLY_IND
     * 
     */
    @JsonProperty("monthlyInd")
    public void setMonthlyInd(String monthlyInd) {
        this.monthlyInd = monthlyInd;
    }

    public PhoneRateCodes100GetResponse withMonthlyInd(String monthlyInd) {
        this.monthlyInd = monthlyInd;
        return this;
    }

    /**
     * Lineage reference object : STVPRCD_DAILY_IND
     * 
     */
    @JsonProperty("dailyInd")
    public String getDailyInd() {
        return dailyInd;
    }

    /**
     * Lineage reference object : STVPRCD_DAILY_IND
     * 
     */
    @JsonProperty("dailyInd")
    public void setDailyInd(String dailyInd) {
        this.dailyInd = dailyInd;
    }

    public PhoneRateCodes100GetResponse withDailyInd(String dailyInd) {
        this.dailyInd = dailyInd;
        return this;
    }

    /**
     * Description
     * <p>
     * Lineage reference object : STVPRCD_DESC
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
     * Lineage reference object : STVPRCD_DESC
     * (Required)
     * 
     */
    @JsonProperty("desc")
    public void setDesc(String desc) {
        this.desc = desc;
    }

    public PhoneRateCodes100GetResponse withDesc(String desc) {
        this.desc = desc;
        return this;
    }

    /**
     * Lineage reference object : STVPRCD_TERMLY_IND
     * 
     */
    @JsonProperty("termlyInd")
    public String getTermlyInd() {
        return termlyInd;
    }

    /**
     * Lineage reference object : STVPRCD_TERMLY_IND
     * 
     */
    @JsonProperty("termlyInd")
    public void setTermlyInd(String termlyInd) {
        this.termlyInd = termlyInd;
    }

    public PhoneRateCodes100GetResponse withTermlyInd(String termlyInd) {
        this.termlyInd = termlyInd;
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

    public PhoneRateCodes100GetResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(PhoneRateCodes100GetResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("activityDate");
        sb.append('=');
        sb.append(((this.activityDate == null)?"<null>":this.activityDate));
        sb.append(',');
        sb.append("code");
        sb.append('=');
        sb.append(((this.code == null)?"<null>":this.code));
        sb.append(',');
        sb.append("monthlyInd");
        sb.append('=');
        sb.append(((this.monthlyInd == null)?"<null>":this.monthlyInd));
        sb.append(',');
        sb.append("dailyInd");
        sb.append('=');
        sb.append(((this.dailyInd == null)?"<null>":this.dailyInd));
        sb.append(',');
        sb.append("desc");
        sb.append('=');
        sb.append(((this.desc == null)?"<null>":this.desc));
        sb.append(',');
        sb.append("termlyInd");
        sb.append('=');
        sb.append(((this.termlyInd == null)?"<null>":this.termlyInd));
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
        result = ((result* 31)+((this.monthlyInd == null)? 0 :this.monthlyInd.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.dailyInd == null)? 0 :this.dailyInd.hashCode()));
        result = ((result* 31)+((this.desc == null)? 0 :this.desc.hashCode()));
        result = ((result* 31)+((this.termlyInd == null)? 0 :this.termlyInd.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof PhoneRateCodes100GetResponse) == false) {
            return false;
        }
        PhoneRateCodes100GetResponse rhs = ((PhoneRateCodes100GetResponse) other);
        return ((((((((this.activityDate == rhs.activityDate)||((this.activityDate!= null)&&this.activityDate.equals(rhs.activityDate)))&&((this.code == rhs.code)||((this.code!= null)&&this.code.equals(rhs.code))))&&((this.monthlyInd == rhs.monthlyInd)||((this.monthlyInd!= null)&&this.monthlyInd.equals(rhs.monthlyInd))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.dailyInd == rhs.dailyInd)||((this.dailyInd!= null)&&this.dailyInd.equals(rhs.dailyInd))))&&((this.desc == rhs.desc)||((this.desc!= null)&&this.desc.equals(rhs.desc))))&&((this.termlyInd == rhs.termlyInd)||((this.termlyInd!= null)&&this.termlyInd.equals(rhs.termlyInd))));
    }

}
