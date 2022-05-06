
package com.ellucian.generated.bpapi.ban.course_search.v1_0_0;

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
    "scacrseCrseNumb",
    "subjDescription",
    "scacrseSubjCode",
    "scacrseStartDate",
    "scacrseEndDate"
})
@Generated("jsonschema2pojo")
public class ScacrseKeyBlock {

    /**
     * Course
     * <p>
     * Lineage reference object : scacrseCrseNumb, Lookup lineage reference object : scbcrse,scbcrky
     * 
     */
    @JsonProperty("scacrseCrseNumb")
    @JsonPropertyDescription("Lineage reference object : scacrseCrseNumb, Lookup lineage reference object : scbcrse,scbcrky")
    private Object scacrseCrseNumb;
    /**
     * Subj Description
     * <p>
     * Lineage reference object : subjDescription
     * 
     */
    @JsonProperty("subjDescription")
    @JsonPropertyDescription("Lineage reference object : subjDescription")
    private Object subjDescription;
    /**
     * Subject
     * <p>
     * Lineage reference object : scacrseSubjCode, Lookup lineage reference object : stvsubj
     * 
     */
    @JsonProperty("scacrseSubjCode")
    @JsonPropertyDescription("Lineage reference object : scacrseSubjCode, Lookup lineage reference object : stvsubj")
    private Object scacrseSubjCode;
    /**
     * From  Date
     * <p>
     * Lineage reference object : scacrseStartDate
     * 
     */
    @JsonProperty("scacrseStartDate")
    @JsonPropertyDescription("Lineage reference object : scacrseStartDate")
    private Object scacrseStartDate;
    /**
     * To Date
     * <p>
     * Lineage reference object : scacrseEndDate
     * 
     */
    @JsonProperty("scacrseEndDate")
    @JsonPropertyDescription("Lineage reference object : scacrseEndDate")
    private Object scacrseEndDate;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Course
     * <p>
     * Lineage reference object : scacrseCrseNumb, Lookup lineage reference object : scbcrse,scbcrky
     * 
     */
    @JsonProperty("scacrseCrseNumb")
    public Object getScacrseCrseNumb() {
        return scacrseCrseNumb;
    }

    /**
     * Course
     * <p>
     * Lineage reference object : scacrseCrseNumb, Lookup lineage reference object : scbcrse,scbcrky
     * 
     */
    @JsonProperty("scacrseCrseNumb")
    public void setScacrseCrseNumb(Object scacrseCrseNumb) {
        this.scacrseCrseNumb = scacrseCrseNumb;
    }

    public ScacrseKeyBlock withScacrseCrseNumb(Object scacrseCrseNumb) {
        this.scacrseCrseNumb = scacrseCrseNumb;
        return this;
    }

    /**
     * Subj Description
     * <p>
     * Lineage reference object : subjDescription
     * 
     */
    @JsonProperty("subjDescription")
    public Object getSubjDescription() {
        return subjDescription;
    }

    /**
     * Subj Description
     * <p>
     * Lineage reference object : subjDescription
     * 
     */
    @JsonProperty("subjDescription")
    public void setSubjDescription(Object subjDescription) {
        this.subjDescription = subjDescription;
    }

    public ScacrseKeyBlock withSubjDescription(Object subjDescription) {
        this.subjDescription = subjDescription;
        return this;
    }

    /**
     * Subject
     * <p>
     * Lineage reference object : scacrseSubjCode, Lookup lineage reference object : stvsubj
     * 
     */
    @JsonProperty("scacrseSubjCode")
    public Object getScacrseSubjCode() {
        return scacrseSubjCode;
    }

    /**
     * Subject
     * <p>
     * Lineage reference object : scacrseSubjCode, Lookup lineage reference object : stvsubj
     * 
     */
    @JsonProperty("scacrseSubjCode")
    public void setScacrseSubjCode(Object scacrseSubjCode) {
        this.scacrseSubjCode = scacrseSubjCode;
    }

    public ScacrseKeyBlock withScacrseSubjCode(Object scacrseSubjCode) {
        this.scacrseSubjCode = scacrseSubjCode;
        return this;
    }

    /**
     * From  Date
     * <p>
     * Lineage reference object : scacrseStartDate
     * 
     */
    @JsonProperty("scacrseStartDate")
    public Object getScacrseStartDate() {
        return scacrseStartDate;
    }

    /**
     * From  Date
     * <p>
     * Lineage reference object : scacrseStartDate
     * 
     */
    @JsonProperty("scacrseStartDate")
    public void setScacrseStartDate(Object scacrseStartDate) {
        this.scacrseStartDate = scacrseStartDate;
    }

    public ScacrseKeyBlock withScacrseStartDate(Object scacrseStartDate) {
        this.scacrseStartDate = scacrseStartDate;
        return this;
    }

    /**
     * To Date
     * <p>
     * Lineage reference object : scacrseEndDate
     * 
     */
    @JsonProperty("scacrseEndDate")
    public Object getScacrseEndDate() {
        return scacrseEndDate;
    }

    /**
     * To Date
     * <p>
     * Lineage reference object : scacrseEndDate
     * 
     */
    @JsonProperty("scacrseEndDate")
    public void setScacrseEndDate(Object scacrseEndDate) {
        this.scacrseEndDate = scacrseEndDate;
    }

    public ScacrseKeyBlock withScacrseEndDate(Object scacrseEndDate) {
        this.scacrseEndDate = scacrseEndDate;
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

    public ScacrseKeyBlock withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ScacrseKeyBlock.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("scacrseCrseNumb");
        sb.append('=');
        sb.append(((this.scacrseCrseNumb == null)?"<null>":this.scacrseCrseNumb));
        sb.append(',');
        sb.append("subjDescription");
        sb.append('=');
        sb.append(((this.subjDescription == null)?"<null>":this.subjDescription));
        sb.append(',');
        sb.append("scacrseSubjCode");
        sb.append('=');
        sb.append(((this.scacrseSubjCode == null)?"<null>":this.scacrseSubjCode));
        sb.append(',');
        sb.append("scacrseStartDate");
        sb.append('=');
        sb.append(((this.scacrseStartDate == null)?"<null>":this.scacrseStartDate));
        sb.append(',');
        sb.append("scacrseEndDate");
        sb.append('=');
        sb.append(((this.scacrseEndDate == null)?"<null>":this.scacrseEndDate));
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
        result = ((result* 31)+((this.scacrseCrseNumb == null)? 0 :this.scacrseCrseNumb.hashCode()));
        result = ((result* 31)+((this.subjDescription == null)? 0 :this.subjDescription.hashCode()));
        result = ((result* 31)+((this.scacrseSubjCode == null)? 0 :this.scacrseSubjCode.hashCode()));
        result = ((result* 31)+((this.scacrseStartDate == null)? 0 :this.scacrseStartDate.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.scacrseEndDate == null)? 0 :this.scacrseEndDate.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ScacrseKeyBlock) == false) {
            return false;
        }
        ScacrseKeyBlock rhs = ((ScacrseKeyBlock) other);
        return (((((((this.scacrseCrseNumb == rhs.scacrseCrseNumb)||((this.scacrseCrseNumb!= null)&&this.scacrseCrseNumb.equals(rhs.scacrseCrseNumb)))&&((this.subjDescription == rhs.subjDescription)||((this.subjDescription!= null)&&this.subjDescription.equals(rhs.subjDescription))))&&((this.scacrseSubjCode == rhs.scacrseSubjCode)||((this.scacrseSubjCode!= null)&&this.scacrseSubjCode.equals(rhs.scacrseSubjCode))))&&((this.scacrseStartDate == rhs.scacrseStartDate)||((this.scacrseStartDate!= null)&&this.scacrseStartDate.equals(rhs.scacrseStartDate))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.scacrseEndDate == rhs.scacrseEndDate)||((this.scacrseEndDate!= null)&&this.scacrseEndDate.equals(rhs.scacrseEndDate))));
    }

}
