
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
    "activityDate",
    "code",
    "desc",
    "elementId",
    "standardInd"
})
@Generated("jsonschema2pojo")
public class EdiIsoStandardCodes100QapiPost {

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
     * 
     */
    @JsonProperty("code")
    @JsonPropertyDescription("Lineage reference object : GTVSCOD_CODE")
    private String code;
    /**
     * Description
     * <p>
     * Lineage reference object : GTVSCOD_DESC
     * 
     */
    @JsonProperty("desc")
    @JsonPropertyDescription("Lineage reference object : GTVSCOD_DESC")
    private String desc;
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
     * Standard
     * <p>
     * Lineage reference object : GTVSCOD_STANDARD_IND, Lookup lineage reference object : gtvsdax
     * 
     */
    @JsonProperty("standardInd")
    @JsonPropertyDescription("Lineage reference object : GTVSCOD_STANDARD_IND, Lookup lineage reference object : gtvsdax")
    private String standardInd;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

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

    public EdiIsoStandardCodes100QapiPost withActivityDate(Date activityDate) {
        this.activityDate = activityDate;
        return this;
    }

    /**
     * Code
     * <p>
     * Lineage reference object : GTVSCOD_CODE
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
     * 
     */
    @JsonProperty("code")
    public void setCode(String code) {
        this.code = code;
    }

    public EdiIsoStandardCodes100QapiPost withCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * Description
     * <p>
     * Lineage reference object : GTVSCOD_DESC
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
     * 
     */
    @JsonProperty("desc")
    public void setDesc(String desc) {
        this.desc = desc;
    }

    public EdiIsoStandardCodes100QapiPost withDesc(String desc) {
        this.desc = desc;
        return this;
    }

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

    public EdiIsoStandardCodes100QapiPost withElementId(String elementId) {
        this.elementId = elementId;
        return this;
    }

    /**
     * Standard
     * <p>
     * Lineage reference object : GTVSCOD_STANDARD_IND, Lookup lineage reference object : gtvsdax
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
     * 
     */
    @JsonProperty("standardInd")
    public void setStandardInd(String standardInd) {
        this.standardInd = standardInd;
    }

    public EdiIsoStandardCodes100QapiPost withStandardInd(String standardInd) {
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

    public EdiIsoStandardCodes100QapiPost withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(EdiIsoStandardCodes100QapiPost.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("elementId");
        sb.append('=');
        sb.append(((this.elementId == null)?"<null>":this.elementId));
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
        if ((other instanceof EdiIsoStandardCodes100QapiPost) == false) {
            return false;
        }
        EdiIsoStandardCodes100QapiPost rhs = ((EdiIsoStandardCodes100QapiPost) other);
        return (((((((this.elementId == rhs.elementId)||((this.elementId!= null)&&this.elementId.equals(rhs.elementId)))&&((this.activityDate == rhs.activityDate)||((this.activityDate!= null)&&this.activityDate.equals(rhs.activityDate))))&&((this.code == rhs.code)||((this.code!= null)&&this.code.equals(rhs.code))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.desc == rhs.desc)||((this.desc!= null)&&this.desc.equals(rhs.desc))))&&((this.standardInd == rhs.standardInd)||((this.standardInd!= null)&&this.standardInd.equals(rhs.standardInd))));
    }

}
