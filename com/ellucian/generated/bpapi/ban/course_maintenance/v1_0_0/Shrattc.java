
package com.ellucian.generated.bpapi.ban.course_maintenance.v1_0_0;

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
    "attrCode",
    "attrDesc"
})
@Generated("jsonschema2pojo")
public class Shrattc {

    /**
     * Shrattc Activity Date
     * <p>
     * Lineage reference object : SHRATTC_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    @JsonPropertyDescription("Lineage reference object : SHRATTC_ACTIVITY_DATE")
    private Date activityDate;
    /**
     * Shrattc Attr Code
     * <p>
     * Lineage reference object : SHRATTC_ATTR_CODE
     * (Required)
     * 
     */
    @JsonProperty("attrCode")
    @JsonPropertyDescription("Lineage reference object : SHRATTC_ATTR_CODE")
    private String attrCode;
    /**
     * Code Description
     * <p>
     * 
     * 
     */
    @JsonProperty("attrDesc")
    private String attrDesc;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Shrattc Activity Date
     * <p>
     * Lineage reference object : SHRATTC_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public Date getActivityDate() {
        return activityDate;
    }

    /**
     * Shrattc Activity Date
     * <p>
     * Lineage reference object : SHRATTC_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public void setActivityDate(Date activityDate) {
        this.activityDate = activityDate;
    }

    public Shrattc withActivityDate(Date activityDate) {
        this.activityDate = activityDate;
        return this;
    }

    /**
     * Shrattc Attr Code
     * <p>
     * Lineage reference object : SHRATTC_ATTR_CODE
     * (Required)
     * 
     */
    @JsonProperty("attrCode")
    public String getAttrCode() {
        return attrCode;
    }

    /**
     * Shrattc Attr Code
     * <p>
     * Lineage reference object : SHRATTC_ATTR_CODE
     * (Required)
     * 
     */
    @JsonProperty("attrCode")
    public void setAttrCode(String attrCode) {
        this.attrCode = attrCode;
    }

    public Shrattc withAttrCode(String attrCode) {
        this.attrCode = attrCode;
        return this;
    }

    /**
     * Code Description
     * <p>
     * 
     * 
     */
    @JsonProperty("attrDesc")
    public String getAttrDesc() {
        return attrDesc;
    }

    /**
     * Code Description
     * <p>
     * 
     * 
     */
    @JsonProperty("attrDesc")
    public void setAttrDesc(String attrDesc) {
        this.attrDesc = attrDesc;
    }

    public Shrattc withAttrDesc(String attrDesc) {
        this.attrDesc = attrDesc;
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

    public Shrattc withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Shrattc.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("activityDate");
        sb.append('=');
        sb.append(((this.activityDate == null)?"<null>":this.activityDate));
        sb.append(',');
        sb.append("attrCode");
        sb.append('=');
        sb.append(((this.attrCode == null)?"<null>":this.attrCode));
        sb.append(',');
        sb.append("attrDesc");
        sb.append('=');
        sb.append(((this.attrDesc == null)?"<null>":this.attrDesc));
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
        result = ((result* 31)+((this.attrCode == null)? 0 :this.attrCode.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.attrDesc == null)? 0 :this.attrDesc.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Shrattc) == false) {
            return false;
        }
        Shrattc rhs = ((Shrattc) other);
        return (((((this.activityDate == rhs.activityDate)||((this.activityDate!= null)&&this.activityDate.equals(rhs.activityDate)))&&((this.attrCode == rhs.attrCode)||((this.attrCode!= null)&&this.attrCode.equals(rhs.attrCode))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.attrDesc == rhs.attrDesc)||((this.attrDesc!= null)&&this.attrDesc.equals(rhs.attrDesc))));
    }

}
