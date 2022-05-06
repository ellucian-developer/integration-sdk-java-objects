
package com.ellucian.generated.bpapi.ban.term_control_part_of_term_and_web_registration_controls.v1_0_0;

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
    "xxxxxxxTermCode",
    "crnOneup"
})
@Generated("jsonschema2pojo")
public class TermControlPartOfTermAndWebRegistrationControls100GetRequest {

    /**
     * Term
     * <p>
     * Lineage reference object : xxxxxxxTermCode, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("xxxxxxxTermCode")
    @JsonPropertyDescription("Lineage reference object : xxxxxxxTermCode, Lookup lineage reference object : stvterm")
    private Object xxxxxxxTermCode;
    /**
     * CRN Starting Sequence Number
     * <p>
     * Lineage reference object : SOBTERM_CRN_ONEUP
     * (Required)
     * 
     */
    @JsonProperty("crnOneup")
    @JsonPropertyDescription("Lineage reference object : SOBTERM_CRN_ONEUP")
    private Double crnOneup;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Term
     * <p>
     * Lineage reference object : xxxxxxxTermCode, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("xxxxxxxTermCode")
    public Object getXxxxxxxTermCode() {
        return xxxxxxxTermCode;
    }

    /**
     * Term
     * <p>
     * Lineage reference object : xxxxxxxTermCode, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("xxxxxxxTermCode")
    public void setXxxxxxxTermCode(Object xxxxxxxTermCode) {
        this.xxxxxxxTermCode = xxxxxxxTermCode;
    }

    public TermControlPartOfTermAndWebRegistrationControls100GetRequest withXxxxxxxTermCode(Object xxxxxxxTermCode) {
        this.xxxxxxxTermCode = xxxxxxxTermCode;
        return this;
    }

    /**
     * CRN Starting Sequence Number
     * <p>
     * Lineage reference object : SOBTERM_CRN_ONEUP
     * (Required)
     * 
     */
    @JsonProperty("crnOneup")
    public Double getCrnOneup() {
        return crnOneup;
    }

    /**
     * CRN Starting Sequence Number
     * <p>
     * Lineage reference object : SOBTERM_CRN_ONEUP
     * (Required)
     * 
     */
    @JsonProperty("crnOneup")
    public void setCrnOneup(Double crnOneup) {
        this.crnOneup = crnOneup;
    }

    public TermControlPartOfTermAndWebRegistrationControls100GetRequest withCrnOneup(Double crnOneup) {
        this.crnOneup = crnOneup;
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

    public TermControlPartOfTermAndWebRegistrationControls100GetRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(TermControlPartOfTermAndWebRegistrationControls100GetRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("xxxxxxxTermCode");
        sb.append('=');
        sb.append(((this.xxxxxxxTermCode == null)?"<null>":this.xxxxxxxTermCode));
        sb.append(',');
        sb.append("crnOneup");
        sb.append('=');
        sb.append(((this.crnOneup == null)?"<null>":this.crnOneup));
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
        result = ((result* 31)+((this.crnOneup == null)? 0 :this.crnOneup.hashCode()));
        result = ((result* 31)+((this.xxxxxxxTermCode == null)? 0 :this.xxxxxxxTermCode.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof TermControlPartOfTermAndWebRegistrationControls100GetRequest) == false) {
            return false;
        }
        TermControlPartOfTermAndWebRegistrationControls100GetRequest rhs = ((TermControlPartOfTermAndWebRegistrationControls100GetRequest) other);
        return ((((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties)))&&((this.crnOneup == rhs.crnOneup)||((this.crnOneup!= null)&&this.crnOneup.equals(rhs.crnOneup))))&&((this.xxxxxxxTermCode == rhs.xxxxxxxTermCode)||((this.xxxxxxxTermCode!= null)&&this.xxxxxxxTermCode.equals(rhs.xxxxxxxTermCode))));
    }

}
