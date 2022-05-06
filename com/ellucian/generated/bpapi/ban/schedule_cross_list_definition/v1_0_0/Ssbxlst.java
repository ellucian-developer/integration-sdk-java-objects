
package com.ellucian.generated.bpapi.ban.schedule_cross_list_definition.v1_0_0;

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
    "seatsAvail",
    "enrl",
    "maxEnrl"
})
@Generated("jsonschema2pojo")
public class Ssbxlst {

    /**
     * Seats Available:
     * <p>
     * Lineage reference object : SSBXLST_SEATS_AVAIL
     * 
     */
    @JsonProperty("seatsAvail")
    @JsonPropertyDescription("Lineage reference object : SSBXLST_SEATS_AVAIL")
    private Double seatsAvail;
    /**
     * Actual Enrollment:
     * <p>
     * Lineage reference object : SSBXLST_ENRL
     * 
     */
    @JsonProperty("enrl")
    @JsonPropertyDescription("Lineage reference object : SSBXLST_ENRL")
    private Double enrl;
    /**
     * Maximum Enrollment:
     * <p>
     * Lineage reference object : SSBXLST_MAX_ENRL
     * 
     */
    @JsonProperty("maxEnrl")
    @JsonPropertyDescription("Lineage reference object : SSBXLST_MAX_ENRL")
    private Double maxEnrl;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Seats Available:
     * <p>
     * Lineage reference object : SSBXLST_SEATS_AVAIL
     * 
     */
    @JsonProperty("seatsAvail")
    public Double getSeatsAvail() {
        return seatsAvail;
    }

    /**
     * Seats Available:
     * <p>
     * Lineage reference object : SSBXLST_SEATS_AVAIL
     * 
     */
    @JsonProperty("seatsAvail")
    public void setSeatsAvail(Double seatsAvail) {
        this.seatsAvail = seatsAvail;
    }

    public Ssbxlst withSeatsAvail(Double seatsAvail) {
        this.seatsAvail = seatsAvail;
        return this;
    }

    /**
     * Actual Enrollment:
     * <p>
     * Lineage reference object : SSBXLST_ENRL
     * 
     */
    @JsonProperty("enrl")
    public Double getEnrl() {
        return enrl;
    }

    /**
     * Actual Enrollment:
     * <p>
     * Lineage reference object : SSBXLST_ENRL
     * 
     */
    @JsonProperty("enrl")
    public void setEnrl(Double enrl) {
        this.enrl = enrl;
    }

    public Ssbxlst withEnrl(Double enrl) {
        this.enrl = enrl;
        return this;
    }

    /**
     * Maximum Enrollment:
     * <p>
     * Lineage reference object : SSBXLST_MAX_ENRL
     * 
     */
    @JsonProperty("maxEnrl")
    public Double getMaxEnrl() {
        return maxEnrl;
    }

    /**
     * Maximum Enrollment:
     * <p>
     * Lineage reference object : SSBXLST_MAX_ENRL
     * 
     */
    @JsonProperty("maxEnrl")
    public void setMaxEnrl(Double maxEnrl) {
        this.maxEnrl = maxEnrl;
    }

    public Ssbxlst withMaxEnrl(Double maxEnrl) {
        this.maxEnrl = maxEnrl;
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

    public Ssbxlst withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Ssbxlst.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("seatsAvail");
        sb.append('=');
        sb.append(((this.seatsAvail == null)?"<null>":this.seatsAvail));
        sb.append(',');
        sb.append("enrl");
        sb.append('=');
        sb.append(((this.enrl == null)?"<null>":this.enrl));
        sb.append(',');
        sb.append("maxEnrl");
        sb.append('=');
        sb.append(((this.maxEnrl == null)?"<null>":this.maxEnrl));
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
        result = ((result* 31)+((this.seatsAvail == null)? 0 :this.seatsAvail.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.enrl == null)? 0 :this.enrl.hashCode()));
        result = ((result* 31)+((this.maxEnrl == null)? 0 :this.maxEnrl.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Ssbxlst) == false) {
            return false;
        }
        Ssbxlst rhs = ((Ssbxlst) other);
        return (((((this.seatsAvail == rhs.seatsAvail)||((this.seatsAvail!= null)&&this.seatsAvail.equals(rhs.seatsAvail)))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.enrl == rhs.enrl)||((this.enrl!= null)&&this.enrl.equals(rhs.enrl))))&&((this.maxEnrl == rhs.maxEnrl)||((this.maxEnrl!= null)&&this.maxEnrl.equals(rhs.maxEnrl))));
    }

}
