
package com.ellucian.generated.bpapi.ban.edi_iso_standard_codes.v1_0_0;

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
    "elementId",
    "activityDate",
    "code",
    "desc",
    "standardInd"
})
@Generated("jsonschema2pojo")
public class EdiIsoStandardCodes100GetResponse {

    /**
     * Element
     * <p>
     * Lineage reference object : GTVSCOD_ELEMENT_ID
     * 
     */
    @JsonProperty("elementId")
    @JsonPropertyDescription("Lineage reference object : GTVSCOD_ELEMENT_ID")
    private String elementId;
    /**
     * Activity Date
     * <p>
     * Lineage reference object : GTVSCOD_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    @JsonPropertyDescription("Lineage reference object : GTVSCOD_ACTIVITY_DATE")
    private Date activityDate;
    /**
     * Code
     * <p>
     * Lineage reference object : GTVSCOD_CODE
     * (Required)
     * 
     */
    @JsonProperty("code")
    @JsonPropertyDescription("Lineage reference object : GTVSCOD_CODE")
    private String code;
    /**
     * Description
     * <p>
     * Lineage reference object : GTVSCOD_DESC
     * (Required)
     * 
     */
    @JsonProperty("desc")
    @JsonPropertyDescription("Lineage reference object : GTVSCOD_DESC")
    private String desc;
    /**
     * Standard
     * <p>
     * Lineage reference object : GTVSCOD_STANDARD_IND, Lookup lineage reference object : gtvsdax
     * (Required)
     * 
     */
    @JsonProperty("standardInd")
    @JsonPropertyDescription("Lineage reference object : GTVSCOD_STANDARD_IND, Lookup lineage reference object : gtvsdax")
    private String standardInd;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Element
     * <p>
     * Lineage reference object : GTVSCOD_ELEMENT_ID
     * 
     */
    @JsonProperty("elementId")
    public String getElementId() {
        return elementId;
    }

    /**
     * Element
     * <p>
     * Lineage reference object : GTVSCOD_ELEMENT_ID
     * 
     */
    @JsonProperty("elementId")
    public void setElementId(String elementId) {
        this.elementId = elementId;
    }

    public EdiIsoStandardCodes100GetResponse withElementId(String elementId) {
        this.elementId = elementId;
        return this;
    }

    /**
     * Activity Date
     * <p>
     * Lineage reference object : GTVSCOD_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public Date getActivityDate() {
        return activityDate;
    }

    /**
     * Activity Date
     * <p>
     * Lineage reference object : GTVSCOD_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public void setActivityDate(Date activityDate) {
        this.activityDate = activityDate;
    }

    public EdiIsoStandardCodes100GetResponse withActivityDate(Date activityDate) {
        this.activityDate = activityDate;
        return this;
    }

    /**
     * Code
     * <p>
     * Lineage reference object : GTVSCOD_CODE
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
     * Lineage reference object : GTVSCOD_CODE
     * (Required)
     * 
     */
    @JsonProperty("code")
    public void setCode(String code) {
        this.code = code;
    }

    public EdiIsoStandardCodes100GetResponse withCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * Description
     * <p>
     * Lineage reference object : GTVSCOD_DESC
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
     * Lineage reference object : GTVSCOD_DESC
     * (Required)
     * 
     */
    @JsonProperty("desc")
    public void setDesc(String desc) {
        this.desc = desc;
    }

    public EdiIsoStandardCodes100GetResponse withDesc(String desc) {
        this.desc = desc;
        return this;
    }

    /**
     * Standard
     * <p>
     * Lineage reference object : GTVSCOD_STANDARD_IND, Lookup lineage reference object : gtvsdax
     * (Required)
     * 
     */
    @JsonProperty("standardInd")
    public String getStandardInd() {
        return standardInd;
    }

    /**
     * Standard
     * <p>
     * Lineage reference object : GTVSCOD_STANDARD_IND, Lookup lineage reference object : gtvsdax
     * (Required)
     * 
     */
    @JsonProperty("standardInd")
    public void setStandardInd(String standardInd) {
        this.standardInd = standardInd;
    }

    public EdiIsoStandardCodes100GetResponse withStandardInd(String standardInd) {
        this.standardInd = standardInd;
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

    public EdiIsoStandardCodes100GetResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(EdiIsoStandardCodes100GetResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("elementId");
        sb.append('=');
        sb.append(((this.elementId == null)?"<null>":this.elementId));
        sb.append(',');
        sb.append("activityDate");
        sb.append('=');
        sb.append(((this.activityDate == null)?"<null>":this.activityDate));
        sb.append(',');
        sb.append("code");
        sb.append('=');
        sb.append(((this.code == null)?"<null>":this.code));
        sb.append(',');
        sb.append("desc");
        sb.append('=');
        sb.append(((this.desc == null)?"<null>":this.desc));
        sb.append(',');
        sb.append("standardInd");
        sb.append('=');
        sb.append(((this.standardInd == null)?"<null>":this.standardInd));
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
        result = ((result* 31)+((this.elementId == null)? 0 :this.elementId.hashCode()));
        result = ((result* 31)+((this.activityDate == null)? 0 :this.activityDate.hashCode()));
        result = ((result* 31)+((this.code == null)? 0 :this.code.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.desc == null)? 0 :this.desc.hashCode()));
        result = ((result* 31)+((this.standardInd == null)? 0 :this.standardInd.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof EdiIsoStandardCodes100GetResponse) == false) {
            return false;
        }
        EdiIsoStandardCodes100GetResponse rhs = ((EdiIsoStandardCodes100GetResponse) other);
        return (((((((this.elementId == rhs.elementId)||((this.elementId!= null)&&this.elementId.equals(rhs.elementId)))&&((this.activityDate == rhs.activityDate)||((this.activityDate!= null)&&this.activityDate.equals(rhs.activityDate))))&&((this.code == rhs.code)||((this.code!= null)&&this.code.equals(rhs.code))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.desc == rhs.desc)||((this.desc!= null)&&this.desc.equals(rhs.desc))))&&((this.standardInd == rhs.standardInd)||((this.standardInd!= null)&&this.standardInd.equals(rhs.standardInd))));
    }

}
