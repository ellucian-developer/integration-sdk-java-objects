
package com.ellucian.generated.bpapi.ban.administrative_role_codes.v1_0_0;

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
    "raterInd",
    "desc"
})
@Generated("jsonschema2pojo")
public class AdministrativeRoleCodes100GetResponse {

    /**
     * Activity Date
     * <p>
     * Lineage reference object : STVRADM_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    @JsonPropertyDescription("Lineage reference object : STVRADM_ACTIVITY_DATE")
    private Date activityDate;
    /**
     * Code
     * <p>
     * Lineage reference object : STVRADM_CODE
     * (Required)
     * 
     */
    @JsonProperty("code")
    @JsonPropertyDescription("Lineage reference object : STVRADM_CODE")
    private String code;
    /**
     * Lineage reference object : STVRADM_RATER_IND
     * 
     */
    @JsonProperty("raterInd")
    @JsonPropertyDescription("Lineage reference object : STVRADM_RATER_IND")
    private String raterInd;
    /**
     * Description
     * <p>
     * Lineage reference object : STVRADM_DESC
     * (Required)
     * 
     */
    @JsonProperty("desc")
    @JsonPropertyDescription("Lineage reference object : STVRADM_DESC")
    private String desc;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Activity Date
     * <p>
     * Lineage reference object : STVRADM_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public Date getActivityDate() {
        return activityDate;
    }

    /**
     * Activity Date
     * <p>
     * Lineage reference object : STVRADM_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public void setActivityDate(Date activityDate) {
        this.activityDate = activityDate;
    }

    public AdministrativeRoleCodes100GetResponse withActivityDate(Date activityDate) {
        this.activityDate = activityDate;
        return this;
    }

    /**
     * Code
     * <p>
     * Lineage reference object : STVRADM_CODE
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
     * Lineage reference object : STVRADM_CODE
     * (Required)
     * 
     */
    @JsonProperty("code")
    public void setCode(String code) {
        this.code = code;
    }

    public AdministrativeRoleCodes100GetResponse withCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * Lineage reference object : STVRADM_RATER_IND
     * 
     */
    @JsonProperty("raterInd")
    public String getRaterInd() {
        return raterInd;
    }

    /**
     * Lineage reference object : STVRADM_RATER_IND
     * 
     */
    @JsonProperty("raterInd")
    public void setRaterInd(String raterInd) {
        this.raterInd = raterInd;
    }

    public AdministrativeRoleCodes100GetResponse withRaterInd(String raterInd) {
        this.raterInd = raterInd;
        return this;
    }

    /**
     * Description
     * <p>
     * Lineage reference object : STVRADM_DESC
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
     * Lineage reference object : STVRADM_DESC
     * (Required)
     * 
     */
    @JsonProperty("desc")
    public void setDesc(String desc) {
        this.desc = desc;
    }

    public AdministrativeRoleCodes100GetResponse withDesc(String desc) {
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

    public AdministrativeRoleCodes100GetResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(AdministrativeRoleCodes100GetResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("activityDate");
        sb.append('=');
        sb.append(((this.activityDate == null)?"<null>":this.activityDate));
        sb.append(',');
        sb.append("code");
        sb.append('=');
        sb.append(((this.code == null)?"<null>":this.code));
        sb.append(',');
        sb.append("raterInd");
        sb.append('=');
        sb.append(((this.raterInd == null)?"<null>":this.raterInd));
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
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.raterInd == null)? 0 :this.raterInd.hashCode()));
        result = ((result* 31)+((this.desc == null)? 0 :this.desc.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof AdministrativeRoleCodes100GetResponse) == false) {
            return false;
        }
        AdministrativeRoleCodes100GetResponse rhs = ((AdministrativeRoleCodes100GetResponse) other);
        return ((((((this.activityDate == rhs.activityDate)||((this.activityDate!= null)&&this.activityDate.equals(rhs.activityDate)))&&((this.code == rhs.code)||((this.code!= null)&&this.code.equals(rhs.code))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.raterInd == rhs.raterInd)||((this.raterInd!= null)&&this.raterInd.equals(rhs.raterInd))))&&((this.desc == rhs.desc)||((this.desc!= null)&&this.desc.equals(rhs.desc))));
    }

}