
package com.ellucian.generated.bpapi.ban.citizen_type_codes.v1_0_0;

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
    "code",
    "activityDate",
    "citizenInd",
    "ediEquiv",
    "desc"
})
@Generated("jsonschema2pojo")
public class CitizenTypeCodes100GetRequest {

    /**
     * Code
     * <p>
     * Lineage reference object : STVCITZ_CODE
     * (Required)
     * 
     */
    @JsonProperty("code")
    @JsonPropertyDescription("Lineage reference object : STVCITZ_CODE")
    private String code;
    /**
     * Activity Date
     * <p>
     * Lineage reference object : STVCITZ_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    @JsonPropertyDescription("Lineage reference object : STVCITZ_ACTIVITY_DATE")
    private Date activityDate;
    /**
     * Lineage reference object : STVCITZ_CITIZEN_IND
     * 
     */
    @JsonProperty("citizenInd")
    @JsonPropertyDescription("Lineage reference object : STVCITZ_CITIZEN_IND")
    private String citizenInd;
    /**
     * EDI Equivalent
     * <p>
     * Lineage reference object : STVCITZ_EDI_EQUIV
     * 
     */
    @JsonProperty("ediEquiv")
    @JsonPropertyDescription("Lineage reference object : STVCITZ_EDI_EQUIV")
    private String ediEquiv;
    /**
     * Description
     * <p>
     * Lineage reference object : STVCITZ_DESC
     * (Required)
     * 
     */
    @JsonProperty("desc")
    @JsonPropertyDescription("Lineage reference object : STVCITZ_DESC")
    private String desc;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Code
     * <p>
     * Lineage reference object : STVCITZ_CODE
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
     * Lineage reference object : STVCITZ_CODE
     * (Required)
     * 
     */
    @JsonProperty("code")
    public void setCode(String code) {
        this.code = code;
    }

    public CitizenTypeCodes100GetRequest withCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * Activity Date
     * <p>
     * Lineage reference object : STVCITZ_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public Date getActivityDate() {
        return activityDate;
    }

    /**
     * Activity Date
     * <p>
     * Lineage reference object : STVCITZ_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public void setActivityDate(Date activityDate) {
        this.activityDate = activityDate;
    }

    public CitizenTypeCodes100GetRequest withActivityDate(Date activityDate) {
        this.activityDate = activityDate;
        return this;
    }

    /**
     * Lineage reference object : STVCITZ_CITIZEN_IND
     * 
     */
    @JsonProperty("citizenInd")
    public String getCitizenInd() {
        return citizenInd;
    }

    /**
     * Lineage reference object : STVCITZ_CITIZEN_IND
     * 
     */
    @JsonProperty("citizenInd")
    public void setCitizenInd(String citizenInd) {
        this.citizenInd = citizenInd;
    }

    public CitizenTypeCodes100GetRequest withCitizenInd(String citizenInd) {
        this.citizenInd = citizenInd;
        return this;
    }

    /**
     * EDI Equivalent
     * <p>
     * Lineage reference object : STVCITZ_EDI_EQUIV
     * 
     */
    @JsonProperty("ediEquiv")
    public String getEdiEquiv() {
        return ediEquiv;
    }

    /**
     * EDI Equivalent
     * <p>
     * Lineage reference object : STVCITZ_EDI_EQUIV
     * 
     */
    @JsonProperty("ediEquiv")
    public void setEdiEquiv(String ediEquiv) {
        this.ediEquiv = ediEquiv;
    }

    public CitizenTypeCodes100GetRequest withEdiEquiv(String ediEquiv) {
        this.ediEquiv = ediEquiv;
        return this;
    }

    /**
     * Description
     * <p>
     * Lineage reference object : STVCITZ_DESC
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
     * Lineage reference object : STVCITZ_DESC
     * (Required)
     * 
     */
    @JsonProperty("desc")
    public void setDesc(String desc) {
        this.desc = desc;
    }

    public CitizenTypeCodes100GetRequest withDesc(String desc) {
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

    public CitizenTypeCodes100GetRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(CitizenTypeCodes100GetRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("code");
        sb.append('=');
        sb.append(((this.code == null)?"<null>":this.code));
        sb.append(',');
        sb.append("activityDate");
        sb.append('=');
        sb.append(((this.activityDate == null)?"<null>":this.activityDate));
        sb.append(',');
        sb.append("citizenInd");
        sb.append('=');
        sb.append(((this.citizenInd == null)?"<null>":this.citizenInd));
        sb.append(',');
        sb.append("ediEquiv");
        sb.append('=');
        sb.append(((this.ediEquiv == null)?"<null>":this.ediEquiv));
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
        result = ((result* 31)+((this.code == null)? 0 :this.code.hashCode()));
        result = ((result* 31)+((this.activityDate == null)? 0 :this.activityDate.hashCode()));
        result = ((result* 31)+((this.citizenInd == null)? 0 :this.citizenInd.hashCode()));
        result = ((result* 31)+((this.ediEquiv == null)? 0 :this.ediEquiv.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.desc == null)? 0 :this.desc.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof CitizenTypeCodes100GetRequest) == false) {
            return false;
        }
        CitizenTypeCodes100GetRequest rhs = ((CitizenTypeCodes100GetRequest) other);
        return (((((((this.code == rhs.code)||((this.code!= null)&&this.code.equals(rhs.code)))&&((this.activityDate == rhs.activityDate)||((this.activityDate!= null)&&this.activityDate.equals(rhs.activityDate))))&&((this.citizenInd == rhs.citizenInd)||((this.citizenInd!= null)&&this.citizenInd.equals(rhs.citizenInd))))&&((this.ediEquiv == rhs.ediEquiv)||((this.ediEquiv!= null)&&this.ediEquiv.equals(rhs.ediEquiv))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.desc == rhs.desc)||((this.desc!= null)&&this.desc.equals(rhs.desc))));
    }

}
