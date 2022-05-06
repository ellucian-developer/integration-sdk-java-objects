
package com.ellucian.generated.bpapi.ban.course_registration_restrictions.v1_0_0;

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
    "degcDescription",
    "degcCode"
})
@Generated("jsonschema2pojo")
public class Scrrdeg {

    /**
     * Description
     * <p>
     * 
     * 
     */
    @JsonProperty("degcDescription")
    private String degcDescription;
    /**
     * Degree
     * <p>
     * Lineage reference object : SCRRDEG_DEGC_CODE, Lookup lineage reference object : stvdegc
     * 
     */
    @JsonProperty("degcCode")
    @JsonPropertyDescription("Lineage reference object : SCRRDEG_DEGC_CODE, Lookup lineage reference object : stvdegc")
    private String degcCode;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Description
     * <p>
     * 
     * 
     */
    @JsonProperty("degcDescription")
    public String getDegcDescription() {
        return degcDescription;
    }

    /**
     * Description
     * <p>
     * 
     * 
     */
    @JsonProperty("degcDescription")
    public void setDegcDescription(String degcDescription) {
        this.degcDescription = degcDescription;
    }

    public Scrrdeg withDegcDescription(String degcDescription) {
        this.degcDescription = degcDescription;
        return this;
    }

    /**
     * Degree
     * <p>
     * Lineage reference object : SCRRDEG_DEGC_CODE, Lookup lineage reference object : stvdegc
     * 
     */
    @JsonProperty("degcCode")
    public String getDegcCode() {
        return degcCode;
    }

    /**
     * Degree
     * <p>
     * Lineage reference object : SCRRDEG_DEGC_CODE, Lookup lineage reference object : stvdegc
     * 
     */
    @JsonProperty("degcCode")
    public void setDegcCode(String degcCode) {
        this.degcCode = degcCode;
    }

    public Scrrdeg withDegcCode(String degcCode) {
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

    public Scrrdeg withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Scrrdeg.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("degcDescription");
        sb.append('=');
        sb.append(((this.degcDescription == null)?"<null>":this.degcDescription));
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
        result = ((result* 31)+((this.degcDescription == null)? 0 :this.degcDescription.hashCode()));
        result = ((result* 31)+((this.degcCode == null)? 0 :this.degcCode.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Scrrdeg) == false) {
            return false;
        }
        Scrrdeg rhs = ((Scrrdeg) other);
        return ((((this.degcDescription == rhs.degcDescription)||((this.degcDescription!= null)&&this.degcDescription.equals(rhs.degcDescription)))&&((this.degcCode == rhs.degcCode)||((this.degcCode!= null)&&this.degcCode.equals(rhs.degcCode))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
    }

}
