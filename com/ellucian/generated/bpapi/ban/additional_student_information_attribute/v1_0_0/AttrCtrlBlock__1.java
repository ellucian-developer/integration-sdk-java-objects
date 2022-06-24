
package com.ellucian.generated.bpapi.ban.additional_student_information_attribute.v1_0_0;

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
    "sgrsattTermCodeTo",
    "sgrsattTermCodeFrom"
})
@Generated("jsonschema2pojo")
public class AttrCtrlBlock__1 {

    /**
     * To Term
     * <p>
     * Lineage reference object : sgrsattTermCodeTo, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("sgrsattTermCodeTo")
    @JsonPropertyDescription("Lineage reference object : sgrsattTermCodeTo, Lookup lineage reference object : stvterm")
    private String sgrsattTermCodeTo;
    /**
     * From Term
     * <p>
     * Lineage reference object : sgrsattTermCodeFrom, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("sgrsattTermCodeFrom")
    @JsonPropertyDescription("Lineage reference object : sgrsattTermCodeFrom, Lookup lineage reference object : stvterm")
    private String sgrsattTermCodeFrom;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * To Term
     * <p>
     * Lineage reference object : sgrsattTermCodeTo, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("sgrsattTermCodeTo")
    public String getSgrsattTermCodeTo() {
        return sgrsattTermCodeTo;
    }

    /**
     * To Term
     * <p>
     * Lineage reference object : sgrsattTermCodeTo, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("sgrsattTermCodeTo")
    public void setSgrsattTermCodeTo(String sgrsattTermCodeTo) {
        this.sgrsattTermCodeTo = sgrsattTermCodeTo;
    }

    public AttrCtrlBlock__1 withSgrsattTermCodeTo(String sgrsattTermCodeTo) {
        this.sgrsattTermCodeTo = sgrsattTermCodeTo;
        return this;
    }

    /**
     * From Term
     * <p>
     * Lineage reference object : sgrsattTermCodeFrom, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("sgrsattTermCodeFrom")
    public String getSgrsattTermCodeFrom() {
        return sgrsattTermCodeFrom;
    }

    /**
     * From Term
     * <p>
     * Lineage reference object : sgrsattTermCodeFrom, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("sgrsattTermCodeFrom")
    public void setSgrsattTermCodeFrom(String sgrsattTermCodeFrom) {
        this.sgrsattTermCodeFrom = sgrsattTermCodeFrom;
    }

    public AttrCtrlBlock__1 withSgrsattTermCodeFrom(String sgrsattTermCodeFrom) {
        this.sgrsattTermCodeFrom = sgrsattTermCodeFrom;
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

    public AttrCtrlBlock__1 withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(AttrCtrlBlock__1 .class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("sgrsattTermCodeTo");
        sb.append('=');
        sb.append(((this.sgrsattTermCodeTo == null)?"<null>":this.sgrsattTermCodeTo));
        sb.append(',');
        sb.append("sgrsattTermCodeFrom");
        sb.append('=');
        sb.append(((this.sgrsattTermCodeFrom == null)?"<null>":this.sgrsattTermCodeFrom));
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
        result = ((result* 31)+((this.sgrsattTermCodeTo == null)? 0 :this.sgrsattTermCodeTo.hashCode()));
        result = ((result* 31)+((this.sgrsattTermCodeFrom == null)? 0 :this.sgrsattTermCodeFrom.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof AttrCtrlBlock__1) == false) {
            return false;
        }
        AttrCtrlBlock__1 rhs = ((AttrCtrlBlock__1) other);
        return ((((this.sgrsattTermCodeTo == rhs.sgrsattTermCodeTo)||((this.sgrsattTermCodeTo!= null)&&this.sgrsattTermCodeTo.equals(rhs.sgrsattTermCodeTo)))&&((this.sgrsattTermCodeFrom == rhs.sgrsattTermCodeFrom)||((this.sgrsattTermCodeFrom!= null)&&this.sgrsattTermCodeFrom.equals(rhs.sgrsattTermCodeFrom))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
    }

}
