
package com.ellucian.generated.bpapi.ban.us_specific_institution_financial_aid_options_institutional_defaults.v1_0_0;

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
    "cssCollCde"
})
@Generated("jsonschema2pojo")
public class Rorinid__1 {

    /**
     * College Scholarship Service ID
     * <p>
     * Lineage reference object : RORINID_CSS_COLL_CDE
     * 
     */
    @JsonProperty("cssCollCde")
    @JsonPropertyDescription("Lineage reference object : RORINID_CSS_COLL_CDE")
    private String cssCollCde;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * College Scholarship Service ID
     * <p>
     * Lineage reference object : RORINID_CSS_COLL_CDE
     * 
     */
    @JsonProperty("cssCollCde")
    public String getCssCollCde() {
        return cssCollCde;
    }

    /**
     * College Scholarship Service ID
     * <p>
     * Lineage reference object : RORINID_CSS_COLL_CDE
     * 
     */
    @JsonProperty("cssCollCde")
    public void setCssCollCde(String cssCollCde) {
        this.cssCollCde = cssCollCde;
    }

    public Rorinid__1 withCssCollCde(String cssCollCde) {
        this.cssCollCde = cssCollCde;
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

    public Rorinid__1 withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Rorinid__1 .class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("cssCollCde");
        sb.append('=');
        sb.append(((this.cssCollCde == null)?"<null>":this.cssCollCde));
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
        result = ((result* 31)+((this.cssCollCde == null)? 0 :this.cssCollCde.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Rorinid__1) == false) {
            return false;
        }
        Rorinid__1 rhs = ((Rorinid__1) other);
        return (((this.cssCollCde == rhs.cssCollCde)||((this.cssCollCde!= null)&&this.cssCollCde.equals(rhs.cssCollCde)))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
    }

}
