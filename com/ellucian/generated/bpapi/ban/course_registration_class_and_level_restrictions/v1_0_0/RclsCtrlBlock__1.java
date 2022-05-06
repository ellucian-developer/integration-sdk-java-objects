
package com.ellucian.generated.bpapi.ban.course_registration_class_and_level_restrictions.v1_0_0;

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
    "scrrclsTermCodeFrom",
    "scrrclsClassInd",
    "scrrclsTermCodeTo"
})
@Generated("jsonschema2pojo")
public class RclsCtrlBlock__1 {

    /**
     * From Term
     * <p>
     * Lineage reference object : scrrclsTermCodeFrom, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("scrrclsTermCodeFrom")
    @JsonPropertyDescription("Lineage reference object : scrrclsTermCodeFrom, Lookup lineage reference object : stvterm")
    private Object scrrclsTermCodeFrom;
    /**
     * Include/Exclude (I/E)
     * <p>
     * Lineage reference object : scrrclsClassInd
     * (Required)
     * 
     */
    @JsonProperty("scrrclsClassInd")
    @JsonPropertyDescription("Lineage reference object : scrrclsClassInd")
    private Object scrrclsClassInd;
    /**
     * To Term
     * <p>
     * Lineage reference object : scrrclsTermCodeTo, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("scrrclsTermCodeTo")
    @JsonPropertyDescription("Lineage reference object : scrrclsTermCodeTo, Lookup lineage reference object : stvterm")
    private Object scrrclsTermCodeTo;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * From Term
     * <p>
     * Lineage reference object : scrrclsTermCodeFrom, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("scrrclsTermCodeFrom")
    public Object getScrrclsTermCodeFrom() {
        return scrrclsTermCodeFrom;
    }

    /**
     * From Term
     * <p>
     * Lineage reference object : scrrclsTermCodeFrom, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("scrrclsTermCodeFrom")
    public void setScrrclsTermCodeFrom(Object scrrclsTermCodeFrom) {
        this.scrrclsTermCodeFrom = scrrclsTermCodeFrom;
    }

    public RclsCtrlBlock__1 withScrrclsTermCodeFrom(Object scrrclsTermCodeFrom) {
        this.scrrclsTermCodeFrom = scrrclsTermCodeFrom;
        return this;
    }

    /**
     * Include/Exclude (I/E)
     * <p>
     * Lineage reference object : scrrclsClassInd
     * (Required)
     * 
     */
    @JsonProperty("scrrclsClassInd")
    public Object getScrrclsClassInd() {
        return scrrclsClassInd;
    }

    /**
     * Include/Exclude (I/E)
     * <p>
     * Lineage reference object : scrrclsClassInd
     * (Required)
     * 
     */
    @JsonProperty("scrrclsClassInd")
    public void setScrrclsClassInd(Object scrrclsClassInd) {
        this.scrrclsClassInd = scrrclsClassInd;
    }

    public RclsCtrlBlock__1 withScrrclsClassInd(Object scrrclsClassInd) {
        this.scrrclsClassInd = scrrclsClassInd;
        return this;
    }

    /**
     * To Term
     * <p>
     * Lineage reference object : scrrclsTermCodeTo, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("scrrclsTermCodeTo")
    public Object getScrrclsTermCodeTo() {
        return scrrclsTermCodeTo;
    }

    /**
     * To Term
     * <p>
     * Lineage reference object : scrrclsTermCodeTo, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("scrrclsTermCodeTo")
    public void setScrrclsTermCodeTo(Object scrrclsTermCodeTo) {
        this.scrrclsTermCodeTo = scrrclsTermCodeTo;
    }

    public RclsCtrlBlock__1 withScrrclsTermCodeTo(Object scrrclsTermCodeTo) {
        this.scrrclsTermCodeTo = scrrclsTermCodeTo;
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

    public RclsCtrlBlock__1 withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(RclsCtrlBlock__1 .class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("scrrclsTermCodeFrom");
        sb.append('=');
        sb.append(((this.scrrclsTermCodeFrom == null)?"<null>":this.scrrclsTermCodeFrom));
        sb.append(',');
        sb.append("scrrclsClassInd");
        sb.append('=');
        sb.append(((this.scrrclsClassInd == null)?"<null>":this.scrrclsClassInd));
        sb.append(',');
        sb.append("scrrclsTermCodeTo");
        sb.append('=');
        sb.append(((this.scrrclsTermCodeTo == null)?"<null>":this.scrrclsTermCodeTo));
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
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.scrrclsTermCodeFrom == null)? 0 :this.scrrclsTermCodeFrom.hashCode()));
        result = ((result* 31)+((this.scrrclsClassInd == null)? 0 :this.scrrclsClassInd.hashCode()));
        result = ((result* 31)+((this.scrrclsTermCodeTo == null)? 0 :this.scrrclsTermCodeTo.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof RclsCtrlBlock__1) == false) {
            return false;
        }
        RclsCtrlBlock__1 rhs = ((RclsCtrlBlock__1) other);
        return (((((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties)))&&((this.scrrclsTermCodeFrom == rhs.scrrclsTermCodeFrom)||((this.scrrclsTermCodeFrom!= null)&&this.scrrclsTermCodeFrom.equals(rhs.scrrclsTermCodeFrom))))&&((this.scrrclsClassInd == rhs.scrrclsClassInd)||((this.scrrclsClassInd!= null)&&this.scrrclsClassInd.equals(rhs.scrrclsClassInd))))&&((this.scrrclsTermCodeTo == rhs.scrrclsTermCodeTo)||((this.scrrclsTermCodeTo!= null)&&this.scrrclsTermCodeTo.equals(rhs.scrrclsTermCodeTo))));
    }

}
