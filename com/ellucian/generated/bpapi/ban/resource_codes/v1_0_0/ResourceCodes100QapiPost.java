
package com.ellucian.generated.bpapi.ban.resource_codes.v1_0_0;

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
    "arscDesc",
    "athleticsInd",
    "code",
    "infoAccessInd"
})
@Generated("jsonschema2pojo")
public class ResourceCodes100QapiPost {

    /**
     * Activity Date
     * <p>
     * Lineage reference object : RTVARSC_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    @JsonPropertyDescription("Lineage reference object : RTVARSC_ACTIVITY_DATE")
    private Date activityDate;
    /**
     * Description
     * <p>
     * Lineage reference object : RTVARSC_ARSC_DESC
     * 
     */
    @JsonProperty("arscDesc")
    @JsonPropertyDescription("Lineage reference object : RTVARSC_ARSC_DESC")
    private String arscDesc;
    /**
     * Lineage reference object : RTVARSC_ATHLETICS_IND
     * 
     */
    @JsonProperty("athleticsInd")
    @JsonPropertyDescription("Lineage reference object : RTVARSC_ATHLETICS_IND")
    private String athleticsInd;
    /**
     * Resource Code
     * <p>
     * Lineage reference object : RTVARSC_CODE
     * 
     */
    @JsonProperty("code")
    @JsonPropertyDescription("Lineage reference object : RTVARSC_CODE")
    private String code;
    /**
     * Lineage reference object : RTVARSC_INFO_ACCESS_IND
     * 
     */
    @JsonProperty("infoAccessInd")
    @JsonPropertyDescription("Lineage reference object : RTVARSC_INFO_ACCESS_IND")
    private String infoAccessInd;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Activity Date
     * <p>
     * Lineage reference object : RTVARSC_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public Date getActivityDate() {
        return activityDate;
    }

    /**
     * Activity Date
     * <p>
     * Lineage reference object : RTVARSC_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public void setActivityDate(Date activityDate) {
        this.activityDate = activityDate;
    }

    public ResourceCodes100QapiPost withActivityDate(Date activityDate) {
        this.activityDate = activityDate;
        return this;
    }

    /**
     * Description
     * <p>
     * Lineage reference object : RTVARSC_ARSC_DESC
     * 
     */
    @JsonProperty("arscDesc")
    public String getArscDesc() {
        return arscDesc;
    }

    /**
     * Description
     * <p>
     * Lineage reference object : RTVARSC_ARSC_DESC
     * 
     */
    @JsonProperty("arscDesc")
    public void setArscDesc(String arscDesc) {
        this.arscDesc = arscDesc;
    }

    public ResourceCodes100QapiPost withArscDesc(String arscDesc) {
        this.arscDesc = arscDesc;
        return this;
    }

    /**
     * Lineage reference object : RTVARSC_ATHLETICS_IND
     * 
     */
    @JsonProperty("athleticsInd")
    public String getAthleticsInd() {
        return athleticsInd;
    }

    /**
     * Lineage reference object : RTVARSC_ATHLETICS_IND
     * 
     */
    @JsonProperty("athleticsInd")
    public void setAthleticsInd(String athleticsInd) {
        this.athleticsInd = athleticsInd;
    }

    public ResourceCodes100QapiPost withAthleticsInd(String athleticsInd) {
        this.athleticsInd = athleticsInd;
        return this;
    }

    /**
     * Resource Code
     * <p>
     * Lineage reference object : RTVARSC_CODE
     * 
     */
    @JsonProperty("code")
    public String getCode() {
        return code;
    }

    /**
     * Resource Code
     * <p>
     * Lineage reference object : RTVARSC_CODE
     * 
     */
    @JsonProperty("code")
    public void setCode(String code) {
        this.code = code;
    }

    public ResourceCodes100QapiPost withCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * Lineage reference object : RTVARSC_INFO_ACCESS_IND
     * 
     */
    @JsonProperty("infoAccessInd")
    public String getInfoAccessInd() {
        return infoAccessInd;
    }

    /**
     * Lineage reference object : RTVARSC_INFO_ACCESS_IND
     * 
     */
    @JsonProperty("infoAccessInd")
    public void setInfoAccessInd(String infoAccessInd) {
        this.infoAccessInd = infoAccessInd;
    }

    public ResourceCodes100QapiPost withInfoAccessInd(String infoAccessInd) {
        this.infoAccessInd = infoAccessInd;
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

    public ResourceCodes100QapiPost withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ResourceCodes100QapiPost.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("activityDate");
        sb.append('=');
        sb.append(((this.activityDate == null)?"<null>":this.activityDate));
        sb.append(',');
        sb.append("arscDesc");
        sb.append('=');
        sb.append(((this.arscDesc == null)?"<null>":this.arscDesc));
        sb.append(',');
        sb.append("athleticsInd");
        sb.append('=');
        sb.append(((this.athleticsInd == null)?"<null>":this.athleticsInd));
        sb.append(',');
        sb.append("code");
        sb.append('=');
        sb.append(((this.code == null)?"<null>":this.code));
        sb.append(',');
        sb.append("infoAccessInd");
        sb.append('=');
        sb.append(((this.infoAccessInd == null)?"<null>":this.infoAccessInd));
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
        result = ((result* 31)+((this.infoAccessInd == null)? 0 :this.infoAccessInd.hashCode()));
        result = ((result* 31)+((this.athleticsInd == null)? 0 :this.athleticsInd.hashCode()));
        result = ((result* 31)+((this.arscDesc == null)? 0 :this.arscDesc.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ResourceCodes100QapiPost) == false) {
            return false;
        }
        ResourceCodes100QapiPost rhs = ((ResourceCodes100QapiPost) other);
        return (((((((this.activityDate == rhs.activityDate)||((this.activityDate!= null)&&this.activityDate.equals(rhs.activityDate)))&&((this.code == rhs.code)||((this.code!= null)&&this.code.equals(rhs.code))))&&((this.infoAccessInd == rhs.infoAccessInd)||((this.infoAccessInd!= null)&&this.infoAccessInd.equals(rhs.infoAccessInd))))&&((this.athleticsInd == rhs.athleticsInd)||((this.athleticsInd!= null)&&this.athleticsInd.equals(rhs.athleticsInd))))&&((this.arscDesc == rhs.arscDesc)||((this.arscDesc!= null)&&this.arscDesc.equals(rhs.arscDesc))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
    }

}
