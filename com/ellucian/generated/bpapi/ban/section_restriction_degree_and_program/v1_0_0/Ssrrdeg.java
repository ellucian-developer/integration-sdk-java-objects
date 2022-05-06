
package com.ellucian.generated.bpapi.ban.section_restriction_degree_and_program.v1_0_0;

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
    "degreeDescription",
    "degcCode"
})
@Generated("jsonschema2pojo")
public class Ssrrdeg {

    /**
     * Description
     * <p>
     * 
     * 
     */
    @JsonProperty("degreeDescription")
    private String degreeDescription;
    /**
     * Ssrrdeg Degc Code
     * <p>
     * Lineage reference object : SSRRDEG_DEGC_CODE, Lookup lineage reference object : stvdegc
     * 
     */
    @JsonProperty("degcCode")
    @JsonPropertyDescription("Lineage reference object : SSRRDEG_DEGC_CODE, Lookup lineage reference object : stvdegc")
    private String degcCode;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Description
     * <p>
     * 
     * 
     */
    @JsonProperty("degreeDescription")
    public String getDegreeDescription() {
        return degreeDescription;
    }

    /**
     * Description
     * <p>
     * 
     * 
     */
    @JsonProperty("degreeDescription")
    public void setDegreeDescription(String degreeDescription) {
        this.degreeDescription = degreeDescription;
    }

    public Ssrrdeg withDegreeDescription(String degreeDescription) {
        this.degreeDescription = degreeDescription;
        return this;
    }

    /**
     * Ssrrdeg Degc Code
     * <p>
     * Lineage reference object : SSRRDEG_DEGC_CODE, Lookup lineage reference object : stvdegc
     * 
     */
    @JsonProperty("degcCode")
    public String getDegcCode() {
        return degcCode;
    }

    /**
     * Ssrrdeg Degc Code
     * <p>
     * Lineage reference object : SSRRDEG_DEGC_CODE, Lookup lineage reference object : stvdegc
     * 
     */
    @JsonProperty("degcCode")
    public void setDegcCode(String degcCode) {
        this.degcCode = degcCode;
    }

    public Ssrrdeg withDegcCode(String degcCode) {
        this.degcCode = degcCode;
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

    public Ssrrdeg withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Ssrrdeg.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("degreeDescription");
        sb.append('=');
        sb.append(((this.degreeDescription == null)?"<null>":this.degreeDescription));
        sb.append(',');
        sb.append("degcCode");
        sb.append('=');
        sb.append(((this.degcCode == null)?"<null>":this.degcCode));
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
        result = ((result* 31)+((this.degreeDescription == null)? 0 :this.degreeDescription.hashCode()));
        result = ((result* 31)+((this.degcCode == null)? 0 :this.degcCode.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Ssrrdeg) == false) {
            return false;
        }
        Ssrrdeg rhs = ((Ssrrdeg) other);
        return ((((this.degreeDescription == rhs.degreeDescription)||((this.degreeDescription!= null)&&this.degreeDescription.equals(rhs.degreeDescription)))&&((this.degcCode == rhs.degcCode)||((this.degcCode!= null)&&this.degcCode.equals(rhs.degcCode))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
    }

}
