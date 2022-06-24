
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
    "scrrchrTermCodeTo",
    "scrrchrChrtIeCde",
    "scrrchrTermCodeFrom"
})
@Generated("jsonschema2pojo")
public class RchrCtrlBlock {

    /**
     * To Term
     * <p>
     * Lineage reference object : scrrchrTermCodeTo, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("scrrchrTermCodeTo")
    @JsonPropertyDescription("Lineage reference object : scrrchrTermCodeTo, Lookup lineage reference object : stvterm")
    private String scrrchrTermCodeTo;
    /**
     * Include/Exclude (I/E)
     * <p>
     * Lineage reference object : scrrchrChrtIeCde
     * 
     */
    @JsonProperty("scrrchrChrtIeCde")
    @JsonPropertyDescription("Lineage reference object : scrrchrChrtIeCde")
    private String scrrchrChrtIeCde;
    /**
     * From Term
     * <p>
     * Lineage reference object : scrrchrTermCodeFrom, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("scrrchrTermCodeFrom")
    @JsonPropertyDescription("Lineage reference object : scrrchrTermCodeFrom, Lookup lineage reference object : stvterm")
    private String scrrchrTermCodeFrom;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * To Term
     * <p>
     * Lineage reference object : scrrchrTermCodeTo, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("scrrchrTermCodeTo")
    public String getScrrchrTermCodeTo() {
        return scrrchrTermCodeTo;
    }

    /**
     * To Term
     * <p>
     * Lineage reference object : scrrchrTermCodeTo, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("scrrchrTermCodeTo")
    public void setScrrchrTermCodeTo(String scrrchrTermCodeTo) {
        this.scrrchrTermCodeTo = scrrchrTermCodeTo;
    }

    public RchrCtrlBlock withScrrchrTermCodeTo(String scrrchrTermCodeTo) {
        this.scrrchrTermCodeTo = scrrchrTermCodeTo;
        return this;
    }

    /**
     * Include/Exclude (I/E)
     * <p>
     * Lineage reference object : scrrchrChrtIeCde
     * 
     */
    @JsonProperty("scrrchrChrtIeCde")
    public String getScrrchrChrtIeCde() {
        return scrrchrChrtIeCde;
    }

    /**
     * Include/Exclude (I/E)
     * <p>
     * Lineage reference object : scrrchrChrtIeCde
     * 
     */
    @JsonProperty("scrrchrChrtIeCde")
    public void setScrrchrChrtIeCde(String scrrchrChrtIeCde) {
        this.scrrchrChrtIeCde = scrrchrChrtIeCde;
    }

    public RchrCtrlBlock withScrrchrChrtIeCde(String scrrchrChrtIeCde) {
        this.scrrchrChrtIeCde = scrrchrChrtIeCde;
        return this;
    }

    /**
     * From Term
     * <p>
     * Lineage reference object : scrrchrTermCodeFrom, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("scrrchrTermCodeFrom")
    public String getScrrchrTermCodeFrom() {
        return scrrchrTermCodeFrom;
    }

    /**
     * From Term
     * <p>
     * Lineage reference object : scrrchrTermCodeFrom, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("scrrchrTermCodeFrom")
    public void setScrrchrTermCodeFrom(String scrrchrTermCodeFrom) {
        this.scrrchrTermCodeFrom = scrrchrTermCodeFrom;
    }

    public RchrCtrlBlock withScrrchrTermCodeFrom(String scrrchrTermCodeFrom) {
        this.scrrchrTermCodeFrom = scrrchrTermCodeFrom;
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

    public RchrCtrlBlock withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(RchrCtrlBlock.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("scrrchrTermCodeTo");
        sb.append('=');
        sb.append(((this.scrrchrTermCodeTo == null)?"<null>":this.scrrchrTermCodeTo));
        sb.append(',');
        sb.append("scrrchrChrtIeCde");
        sb.append('=');
        sb.append(((this.scrrchrChrtIeCde == null)?"<null>":this.scrrchrChrtIeCde));
        sb.append(',');
        sb.append("scrrchrTermCodeFrom");
        sb.append('=');
        sb.append(((this.scrrchrTermCodeFrom == null)?"<null>":this.scrrchrTermCodeFrom));
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
        result = ((result* 31)+((this.scrrchrChrtIeCde == null)? 0 :this.scrrchrChrtIeCde.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.scrrchrTermCodeTo == null)? 0 :this.scrrchrTermCodeTo.hashCode()));
        result = ((result* 31)+((this.scrrchrTermCodeFrom == null)? 0 :this.scrrchrTermCodeFrom.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof RchrCtrlBlock) == false) {
            return false;
        }
        RchrCtrlBlock rhs = ((RchrCtrlBlock) other);
        return (((((this.scrrchrChrtIeCde == rhs.scrrchrChrtIeCde)||((this.scrrchrChrtIeCde!= null)&&this.scrrchrChrtIeCde.equals(rhs.scrrchrChrtIeCde)))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.scrrchrTermCodeTo == rhs.scrrchrTermCodeTo)||((this.scrrchrTermCodeTo!= null)&&this.scrrchrTermCodeTo.equals(rhs.scrrchrTermCodeTo))))&&((this.scrrchrTermCodeFrom == rhs.scrrchrTermCodeFrom)||((this.scrrchrTermCodeFrom!= null)&&this.scrrchrTermCodeFrom.equals(rhs.scrrchrTermCodeFrom))));
    }

}
