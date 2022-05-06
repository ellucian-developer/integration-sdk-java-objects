
package com.ellucian.generated.bpapi.ban.college_and_department_text.v1_0_0;

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
    "textNarrative"
})
@Generated("jsonschema2pojo")
public class Scbcdtl {

    /**
     * Lineage reference object : SCBCDTL_TEXT_NARRATIVE
     * 
     */
    @JsonProperty("textNarrative")
    @JsonPropertyDescription("Lineage reference object : SCBCDTL_TEXT_NARRATIVE")
    private Object textNarrative;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Lineage reference object : SCBCDTL_TEXT_NARRATIVE
     * 
     */
    @JsonProperty("textNarrative")
    public Object getTextNarrative() {
        return textNarrative;
    }

    /**
     * Lineage reference object : SCBCDTL_TEXT_NARRATIVE
     * 
     */
    @JsonProperty("textNarrative")
    public void setTextNarrative(Object textNarrative) {
        this.textNarrative = textNarrative;
    }

    public Scbcdtl withTextNarrative(Object textNarrative) {
        this.textNarrative = textNarrative;
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

    public Scbcdtl withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Scbcdtl.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("textNarrative");
        sb.append('=');
        sb.append(((this.textNarrative == null)?"<null>":this.textNarrative));
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
        result = ((result* 31)+((this.textNarrative == null)? 0 :this.textNarrative.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Scbcdtl) == false) {
            return false;
        }
        Scbcdtl rhs = ((Scbcdtl) other);
        return (((this.textNarrative == rhs.textNarrative)||((this.textNarrative!= null)&&this.textNarrative.equals(rhs.textNarrative)))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
    }

}
