
package com.ellucian.generated.bpapi.ban.room_assignment_status.v1_0_0;

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
    "endDate",
    "stvascdDesc",
    "usageInd",
    "startDate",
    "ascdCode"
})
@Generated("jsonschema2pojo")
public class Slrascd__1 {

    /**
     * End
     * <p>
     * Lineage reference object : SLRASCD_END_DATE
     * (Required)
     * 
     */
    @JsonProperty("endDate")
    @JsonPropertyDescription("Lineage reference object : SLRASCD_END_DATE")
    private Date endDate;
    /**
     * Description
     * <p>
     * 
     * 
     */
    @JsonProperty("stvascdDesc")
    private String stvascdDesc;
    @JsonProperty("usageInd")
    private String usageInd;
    /**
     * Start
     * <p>
     * Lineage reference object : SLRASCD_START_DATE
     * (Required)
     * 
     */
    @JsonProperty("startDate")
    @JsonPropertyDescription("Lineage reference object : SLRASCD_START_DATE")
    private Date startDate;
    /**
     * Assignment Status
     * <p>
     * Lineage reference object : SLRASCD_ASCD_CODE, Lookup lineage reference object : stvascd
     * (Required)
     * 
     */
    @JsonProperty("ascdCode")
    @JsonPropertyDescription("Lineage reference object : SLRASCD_ASCD_CODE, Lookup lineage reference object : stvascd")
    private String ascdCode;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * End
     * <p>
     * Lineage reference object : SLRASCD_END_DATE
     * (Required)
     * 
     */
    @JsonProperty("endDate")
    public Date getEndDate() {
        return endDate;
    }

    /**
     * End
     * <p>
     * Lineage reference object : SLRASCD_END_DATE
     * (Required)
     * 
     */
    @JsonProperty("endDate")
    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public Slrascd__1 withEndDate(Date endDate) {
        this.endDate = endDate;
        return this;
    }

    /**
     * Description
     * <p>
     * 
     * 
     */
    @JsonProperty("stvascdDesc")
    public String getStvascdDesc() {
        return stvascdDesc;
    }

    /**
     * Description
     * <p>
     * 
     * 
     */
    @JsonProperty("stvascdDesc")
    public void setStvascdDesc(String stvascdDesc) {
        this.stvascdDesc = stvascdDesc;
    }

    public Slrascd__1 withStvascdDesc(String stvascdDesc) {
        this.stvascdDesc = stvascdDesc;
        return this;
    }

    @JsonProperty("usageInd")
    public String getUsageInd() {
        return usageInd;
    }

    @JsonProperty("usageInd")
    public void setUsageInd(String usageInd) {
        this.usageInd = usageInd;
    }

    public Slrascd__1 withUsageInd(String usageInd) {
        this.usageInd = usageInd;
        return this;
    }

    /**
     * Start
     * <p>
     * Lineage reference object : SLRASCD_START_DATE
     * (Required)
     * 
     */
    @JsonProperty("startDate")
    public Date getStartDate() {
        return startDate;
    }

    /**
     * Start
     * <p>
     * Lineage reference object : SLRASCD_START_DATE
     * (Required)
     * 
     */
    @JsonProperty("startDate")
    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Slrascd__1 withStartDate(Date startDate) {
        this.startDate = startDate;
        return this;
    }

    /**
     * Assignment Status
     * <p>
     * Lineage reference object : SLRASCD_ASCD_CODE, Lookup lineage reference object : stvascd
     * (Required)
     * 
     */
    @JsonProperty("ascdCode")
    public String getAscdCode() {
        return ascdCode;
    }

    /**
     * Assignment Status
     * <p>
     * Lineage reference object : SLRASCD_ASCD_CODE, Lookup lineage reference object : stvascd
     * (Required)
     * 
     */
    @JsonProperty("ascdCode")
    public void setAscdCode(String ascdCode) {
        this.ascdCode = ascdCode;
    }

    public Slrascd__1 withAscdCode(String ascdCode) {
        this.ascdCode = ascdCode;
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

    public Slrascd__1 withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Slrascd__1 .class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("endDate");
        sb.append('=');
        sb.append(((this.endDate == null)?"<null>":this.endDate));
        sb.append(',');
        sb.append("stvascdDesc");
        sb.append('=');
        sb.append(((this.stvascdDesc == null)?"<null>":this.stvascdDesc));
        sb.append(',');
        sb.append("usageInd");
        sb.append('=');
        sb.append(((this.usageInd == null)?"<null>":this.usageInd));
        sb.append(',');
        sb.append("startDate");
        sb.append('=');
        sb.append(((this.startDate == null)?"<null>":this.startDate));
        sb.append(',');
        sb.append("ascdCode");
        sb.append('=');
        sb.append(((this.ascdCode == null)?"<null>":this.ascdCode));
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
        result = ((result* 31)+((this.endDate == null)? 0 :this.endDate.hashCode()));
        result = ((result* 31)+((this.stvascdDesc == null)? 0 :this.stvascdDesc.hashCode()));
        result = ((result* 31)+((this.usageInd == null)? 0 :this.usageInd.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.startDate == null)? 0 :this.startDate.hashCode()));
        result = ((result* 31)+((this.ascdCode == null)? 0 :this.ascdCode.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Slrascd__1) == false) {
            return false;
        }
        Slrascd__1 rhs = ((Slrascd__1) other);
        return (((((((this.endDate == rhs.endDate)||((this.endDate!= null)&&this.endDate.equals(rhs.endDate)))&&((this.stvascdDesc == rhs.stvascdDesc)||((this.stvascdDesc!= null)&&this.stvascdDesc.equals(rhs.stvascdDesc))))&&((this.usageInd == rhs.usageInd)||((this.usageInd!= null)&&this.usageInd.equals(rhs.usageInd))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.startDate == rhs.startDate)||((this.startDate!= null)&&this.startDate.equals(rhs.startDate))))&&((this.ascdCode == rhs.ascdCode)||((this.ascdCode!= null)&&this.ascdCode.equals(rhs.ascdCode))));
    }

}
