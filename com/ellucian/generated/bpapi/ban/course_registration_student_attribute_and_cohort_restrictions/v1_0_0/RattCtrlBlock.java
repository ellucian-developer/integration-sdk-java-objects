
package com.ellucian.generated.bpapi.ban.course_registration_student_attribute_and_cohort_restrictions.v1_0_0;

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
    "scrrattAttsIeCde",
    "scrrattTermCodeFrom",
    "scrrattTermCodeTo"
})
@Generated("jsonschema2pojo")
public class RattCtrlBlock {

    /**
     * Include/Exclude (I/E)
     * <p>
     * Lineage reference object : scrrattAttsIeCde
     * 
     */
    @JsonProperty("scrrattAttsIeCde")
    @JsonPropertyDescription("Lineage reference object : scrrattAttsIeCde")
    private String scrrattAttsIeCde;
    /**
     * From Term
     * <p>
     * Lineage reference object : scrrattTermCodeFrom, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("scrrattTermCodeFrom")
    @JsonPropertyDescription("Lineage reference object : scrrattTermCodeFrom, Lookup lineage reference object : stvterm")
    private String scrrattTermCodeFrom;
    /**
     * To Term
     * <p>
     * Lineage reference object : scrrattTermCodeTo, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("scrrattTermCodeTo")
    @JsonPropertyDescription("Lineage reference object : scrrattTermCodeTo, Lookup lineage reference object : stvterm")
    private String scrrattTermCodeTo;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Include/Exclude (I/E)
     * <p>
     * Lineage reference object : scrrattAttsIeCde
     * 
     */
    @JsonProperty("scrrattAttsIeCde")
    public String getScrrattAttsIeCde() {
        return scrrattAttsIeCde;
    }

    /**
     * Include/Exclude (I/E)
     * <p>
     * Lineage reference object : scrrattAttsIeCde
     * 
     */
    @JsonProperty("scrrattAttsIeCde")
    public void setScrrattAttsIeCde(String scrrattAttsIeCde) {
        this.scrrattAttsIeCde = scrrattAttsIeCde;
    }

    public RattCtrlBlock withScrrattAttsIeCde(String scrrattAttsIeCde) {
        this.scrrattAttsIeCde = scrrattAttsIeCde;
        return this;
    }

    /**
     * From Term
     * <p>
     * Lineage reference object : scrrattTermCodeFrom, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("scrrattTermCodeFrom")
    public String getScrrattTermCodeFrom() {
        return scrrattTermCodeFrom;
    }

    /**
     * From Term
     * <p>
     * Lineage reference object : scrrattTermCodeFrom, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("scrrattTermCodeFrom")
    public void setScrrattTermCodeFrom(String scrrattTermCodeFrom) {
        this.scrrattTermCodeFrom = scrrattTermCodeFrom;
    }

    public RattCtrlBlock withScrrattTermCodeFrom(String scrrattTermCodeFrom) {
        this.scrrattTermCodeFrom = scrrattTermCodeFrom;
        return this;
    }

    /**
     * To Term
     * <p>
     * Lineage reference object : scrrattTermCodeTo, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("scrrattTermCodeTo")
    public String getScrrattTermCodeTo() {
        return scrrattTermCodeTo;
    }

    /**
     * To Term
     * <p>
     * Lineage reference object : scrrattTermCodeTo, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("scrrattTermCodeTo")
    public void setScrrattTermCodeTo(String scrrattTermCodeTo) {
        this.scrrattTermCodeTo = scrrattTermCodeTo;
    }

    public RattCtrlBlock withScrrattTermCodeTo(String scrrattTermCodeTo) {
        this.scrrattTermCodeTo = scrrattTermCodeTo;
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

    public RattCtrlBlock withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(RattCtrlBlock.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("scrrattAttsIeCde");
        sb.append('=');
        sb.append(((this.scrrattAttsIeCde == null)?"<null>":this.scrrattAttsIeCde));
        sb.append(',');
        sb.append("scrrattTermCodeFrom");
        sb.append('=');
        sb.append(((this.scrrattTermCodeFrom == null)?"<null>":this.scrrattTermCodeFrom));
        sb.append(',');
        sb.append("scrrattTermCodeTo");
        sb.append('=');
        sb.append(((this.scrrattTermCodeTo == null)?"<null>":this.scrrattTermCodeTo));
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
        result = ((result* 31)+((this.scrrattTermCodeTo == null)? 0 :this.scrrattTermCodeTo.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.scrrattAttsIeCde == null)? 0 :this.scrrattAttsIeCde.hashCode()));
        result = ((result* 31)+((this.scrrattTermCodeFrom == null)? 0 :this.scrrattTermCodeFrom.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof RattCtrlBlock) == false) {
            return false;
        }
        RattCtrlBlock rhs = ((RattCtrlBlock) other);
        return (((((this.scrrattTermCodeTo == rhs.scrrattTermCodeTo)||((this.scrrattTermCodeTo!= null)&&this.scrrattTermCodeTo.equals(rhs.scrrattTermCodeTo)))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.scrrattAttsIeCde == rhs.scrrattAttsIeCde)||((this.scrrattAttsIeCde!= null)&&this.scrrattAttsIeCde.equals(rhs.scrrattAttsIeCde))))&&((this.scrrattTermCodeFrom == rhs.scrrattTermCodeFrom)||((this.scrrattTermCodeFrom!= null)&&this.scrrattTermCodeFrom.equals(rhs.scrrattTermCodeFrom))));
    }

}
