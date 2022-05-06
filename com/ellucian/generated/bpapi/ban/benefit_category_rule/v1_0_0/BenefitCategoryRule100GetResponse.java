
package com.ellucian.generated.bpapi.ban.benefit_category_rule.v1_0_0;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "ptrbcat",
    "ptrbcdn"
})
@Generated("jsonschema2pojo")
public class BenefitCategoryRule100GetResponse {

    @JsonProperty("ptrbcat")
    private List<Ptrbcat> ptrbcat = new ArrayList<Ptrbcat>();
    @JsonProperty("ptrbcdn")
    private List<Ptrbcdn> ptrbcdn = new ArrayList<Ptrbcdn>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("ptrbcat")
    public List<Ptrbcat> getPtrbcat() {
        return ptrbcat;
    }

    @JsonProperty("ptrbcat")
    public void setPtrbcat(List<Ptrbcat> ptrbcat) {
        this.ptrbcat = ptrbcat;
    }

    public BenefitCategoryRule100GetResponse withPtrbcat(List<Ptrbcat> ptrbcat) {
        this.ptrbcat = ptrbcat;
        return this;
    }

    @JsonProperty("ptrbcdn")
    public List<Ptrbcdn> getPtrbcdn() {
        return ptrbcdn;
    }

    @JsonProperty("ptrbcdn")
    public void setPtrbcdn(List<Ptrbcdn> ptrbcdn) {
        this.ptrbcdn = ptrbcdn;
    }

    public BenefitCategoryRule100GetResponse withPtrbcdn(List<Ptrbcdn> ptrbcdn) {
        this.ptrbcdn = ptrbcdn;
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

    public BenefitCategoryRule100GetResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(BenefitCategoryRule100GetResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("ptrbcat");
        sb.append('=');
        sb.append(((this.ptrbcat == null)?"<null>":this.ptrbcat));
        sb.append(',');
        sb.append("ptrbcdn");
        sb.append('=');
        sb.append(((this.ptrbcdn == null)?"<null>":this.ptrbcdn));
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
        result = ((result* 31)+((this.ptrbcdn == null)? 0 :this.ptrbcdn.hashCode()));
        result = ((result* 31)+((this.ptrbcat == null)? 0 :this.ptrbcat.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof BenefitCategoryRule100GetResponse) == false) {
            return false;
        }
        BenefitCategoryRule100GetResponse rhs = ((BenefitCategoryRule100GetResponse) other);
        return ((((this.ptrbcdn == rhs.ptrbcdn)||((this.ptrbcdn!= null)&&this.ptrbcdn.equals(rhs.ptrbcdn)))&&((this.ptrbcat == rhs.ptrbcat)||((this.ptrbcat!= null)&&this.ptrbcat.equals(rhs.ptrbcat))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
    }

}
