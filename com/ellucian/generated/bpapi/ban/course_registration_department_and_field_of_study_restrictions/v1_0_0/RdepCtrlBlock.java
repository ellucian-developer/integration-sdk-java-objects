
package com.ellucian.generated.bpapi.ban.course_registration_department_and_field_of_study_restrictions.v1_0_0;

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
    "scrrdepDeptIeCde",
    "rdepCtrlEndcopy",
    "scrrdepTermCodeFrom",
    "scrrdepTermCodeTo"
})
@Generated("jsonschema2pojo")
public class RdepCtrlBlock {

    /**
     * Include/Exclude (I/E)
     * <p>
     * Lineage reference object : scrrdepDeptIeCde
     * (Required)
     * 
     */
    @JsonProperty("scrrdepDeptIeCde")
    @JsonPropertyDescription("Lineage reference object : scrrdepDeptIeCde")
    private String scrrdepDeptIeCde;
    /**
     * Lineage reference object : rdepCtrlEndcopy
     * 
     */
    @JsonProperty("rdepCtrlEndcopy")
    @JsonPropertyDescription("Lineage reference object : rdepCtrlEndcopy")
    private String rdepCtrlEndcopy;
    /**
     * From Term
     * <p>
     * Lineage reference object : scrrdepTermCodeFrom, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("scrrdepTermCodeFrom")
    @JsonPropertyDescription("Lineage reference object : scrrdepTermCodeFrom, Lookup lineage reference object : stvterm")
    private String scrrdepTermCodeFrom;
    /**
     * To Term
     * <p>
     * Lineage reference object : scrrdepTermCodeTo, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("scrrdepTermCodeTo")
    @JsonPropertyDescription("Lineage reference object : scrrdepTermCodeTo, Lookup lineage reference object : stvterm")
    private String scrrdepTermCodeTo;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Include/Exclude (I/E)
     * <p>
     * Lineage reference object : scrrdepDeptIeCde
     * (Required)
     * 
     */
    @JsonProperty("scrrdepDeptIeCde")
    public String getScrrdepDeptIeCde() {
        return scrrdepDeptIeCde;
    }

    /**
     * Include/Exclude (I/E)
     * <p>
     * Lineage reference object : scrrdepDeptIeCde
     * (Required)
     * 
     */
    @JsonProperty("scrrdepDeptIeCde")
    public void setScrrdepDeptIeCde(String scrrdepDeptIeCde) {
        this.scrrdepDeptIeCde = scrrdepDeptIeCde;
    }

    public RdepCtrlBlock withScrrdepDeptIeCde(String scrrdepDeptIeCde) {
        this.scrrdepDeptIeCde = scrrdepDeptIeCde;
        return this;
    }

    /**
     * Lineage reference object : rdepCtrlEndcopy
     * 
     */
    @JsonProperty("rdepCtrlEndcopy")
    public String getRdepCtrlEndcopy() {
        return rdepCtrlEndcopy;
    }

    /**
     * Lineage reference object : rdepCtrlEndcopy
     * 
     */
    @JsonProperty("rdepCtrlEndcopy")
    public void setRdepCtrlEndcopy(String rdepCtrlEndcopy) {
        this.rdepCtrlEndcopy = rdepCtrlEndcopy;
    }

    public RdepCtrlBlock withRdepCtrlEndcopy(String rdepCtrlEndcopy) {
        this.rdepCtrlEndcopy = rdepCtrlEndcopy;
        return this;
    }

    /**
     * From Term
     * <p>
     * Lineage reference object : scrrdepTermCodeFrom, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("scrrdepTermCodeFrom")
    public String getScrrdepTermCodeFrom() {
        return scrrdepTermCodeFrom;
    }

    /**
     * From Term
     * <p>
     * Lineage reference object : scrrdepTermCodeFrom, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("scrrdepTermCodeFrom")
    public void setScrrdepTermCodeFrom(String scrrdepTermCodeFrom) {
        this.scrrdepTermCodeFrom = scrrdepTermCodeFrom;
    }

    public RdepCtrlBlock withScrrdepTermCodeFrom(String scrrdepTermCodeFrom) {
        this.scrrdepTermCodeFrom = scrrdepTermCodeFrom;
        return this;
    }

    /**
     * To Term
     * <p>
     * Lineage reference object : scrrdepTermCodeTo, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("scrrdepTermCodeTo")
    public String getScrrdepTermCodeTo() {
        return scrrdepTermCodeTo;
    }

    /**
     * To Term
     * <p>
     * Lineage reference object : scrrdepTermCodeTo, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("scrrdepTermCodeTo")
    public void setScrrdepTermCodeTo(String scrrdepTermCodeTo) {
        this.scrrdepTermCodeTo = scrrdepTermCodeTo;
    }

    public RdepCtrlBlock withScrrdepTermCodeTo(String scrrdepTermCodeTo) {
        this.scrrdepTermCodeTo = scrrdepTermCodeTo;
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

    public RdepCtrlBlock withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(RdepCtrlBlock.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("scrrdepDeptIeCde");
        sb.append('=');
        sb.append(((this.scrrdepDeptIeCde == null)?"<null>":this.scrrdepDeptIeCde));
        sb.append(',');
        sb.append("rdepCtrlEndcopy");
        sb.append('=');
        sb.append(((this.rdepCtrlEndcopy == null)?"<null>":this.rdepCtrlEndcopy));
        sb.append(',');
        sb.append("scrrdepTermCodeFrom");
        sb.append('=');
        sb.append(((this.scrrdepTermCodeFrom == null)?"<null>":this.scrrdepTermCodeFrom));
        sb.append(',');
        sb.append("scrrdepTermCodeTo");
        sb.append('=');
        sb.append(((this.scrrdepTermCodeTo == null)?"<null>":this.scrrdepTermCodeTo));
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
        result = ((result* 31)+((this.scrrdepTermCodeFrom == null)? 0 :this.scrrdepTermCodeFrom.hashCode()));
        result = ((result* 31)+((this.scrrdepTermCodeTo == null)? 0 :this.scrrdepTermCodeTo.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.scrrdepDeptIeCde == null)? 0 :this.scrrdepDeptIeCde.hashCode()));
        result = ((result* 31)+((this.rdepCtrlEndcopy == null)? 0 :this.rdepCtrlEndcopy.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof RdepCtrlBlock) == false) {
            return false;
        }
        RdepCtrlBlock rhs = ((RdepCtrlBlock) other);
        return ((((((this.scrrdepTermCodeFrom == rhs.scrrdepTermCodeFrom)||((this.scrrdepTermCodeFrom!= null)&&this.scrrdepTermCodeFrom.equals(rhs.scrrdepTermCodeFrom)))&&((this.scrrdepTermCodeTo == rhs.scrrdepTermCodeTo)||((this.scrrdepTermCodeTo!= null)&&this.scrrdepTermCodeTo.equals(rhs.scrrdepTermCodeTo))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.scrrdepDeptIeCde == rhs.scrrdepDeptIeCde)||((this.scrrdepDeptIeCde!= null)&&this.scrrdepDeptIeCde.equals(rhs.scrrdepDeptIeCde))))&&((this.rdepCtrlEndcopy == rhs.rdepCtrlEndcopy)||((this.rdepCtrlEndcopy!= null)&&this.rdepCtrlEndcopy.equals(rhs.rdepCtrlEndcopy))));
    }

}
